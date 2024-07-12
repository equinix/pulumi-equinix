#!/bin/bash
set -e

# List of files to exclude
EXCLUDE_FILES=("/metal_connection/example_1.tf /metal_connection/example_2.tf /metal_connection/example_3.tf /metal_bgp_session/example_1.tf")
EXCLUDED_FILES=()
# this script current directory
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
# Examples directory
EXAMPLES_DIR="${SCRIPT_DIR}/../examples/"
# Docs directory
OUTPUT_DIR="${SCRIPT_DIR}/../docs/resource"
# Pulumi Equinix plugin version installed
VERSION=$(pulumictl get version --language generic)

increment_patch() {
    local version="$1"
    local major_minor=$(echo "$version" | sed -E 's/^([0-9]+\.[0-9]+)\.[0-9]+.*$/\1/')
    local patch=$(echo "$version" | sed -E 's/^[0-9]+\.[0-9]+\.([0-9]+).*$/\1/')
    local new_patch=$((patch + 1))
    local new_version="$major_minor.$new_patch"
    echo "$new_version"
}

GOLANG_MIN_NEXT_VERSION=$(increment_patch "$VERSION")

mappings() {
    local tf_file=$1
    # Remove occurrences of ${path.module}/
    sed -i '' 's/\${path\.module}\///g' "$tf_file"
    # Replace one function with index 0
    sed -i '' 's/one(equinix_fabric_connection.vd2azure_primary.redundancy).group/equinix_fabric_connection.vd2azure_primary.redundancy.0.group/g' "$tf_file"
    # Fix invalid strings
    sed -i '' 's/<some_id>/"<some_id>"/g' "$tf_file"
    sed -i '' 's/<same_connection_id_as_first_equinix_fabric_routing_protocol>/"<same_connection_id_as_first_equinix_fabric_routing_protocol>"/g' "$tf_file"
    # Replace public_key with EOF format
    sed -i '' '/public_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX/,/John.Kent@company.com"/ {
        s/public_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX/public_key = <<EOF\n  ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX/
        s/John.Kent@company.com"/John.Kent@company.com\n  EOF/
    }' "$tf_file"
    # Replace unimplemented conditional expression
    sed -i '' 's/equinix_network_device\.test\.asn > 0 ? equinix_network_device\.test\.asn : 22111/22111/g' "$tf_file"
    sed -i '' 's/equinix_network_device\.test\.secondary_device\[0\]\.asn > 0 ? equinix_network_device\.test\.secondary_device\[0\]\.asn : 22333/22333/g' "$tf_file"
    # Replace references to not declared resources or variables
    sed -i '' 's/equinix_network_device\.csr1000v-ha\.uuid,/"csr1000v-ha-uuid",/g' "$tf_file"
    sed -i '' 's/equinix_network_device\.csr1000v-ha\.redundant_uuid/"csr1000v-ha-redundant-uuid"/g' "$tf_file"
    # Replace duplicate resource name
    sed -i '' '1,/resource "equinix_metal_reserved_ip_block" "test"/ s/resource "equinix_metal_reserved_ip_block" "test"/resource "equinix_metal_reserved_ip_block" "test1"/g' "$tf_file"
    # Replace - with _ in resource names
    sed -i '' 's/test-public-key/test_public_key/g' "$tf_file"
    sed -i '' 's/"csr1000v-ha"/"csr1000v_ha"/g' "$tf_file"
    sed -i '' 's/"panw-cluster"/"panw_cluster"/g' "$tf_file"
    sed -i '' 's/"aviatrix-single"/"aviatrix_single"/g' "$tf_file"
    sed -i '' 's/aviatrix-cloudinit-file/aviatrix_cloudinit_file/g' "$tf_file"
    sed -i '' 's/bluecat-edge-service-point-cloudinit-primary-file/bluecat_edge_service_point_cloudinit_primary_file/g' "$tf_file"
    sed -i '' 's/bluecat-edge-service-point-cloudinit-secondary-file/bluecat_edge_service_point_cloudinit_secondary_file/g' "$tf_file"
    sed -i '' 's/"bluecat-edge-service-point-ha"/"bluecat_edge_service_point_ha"/g' "$tf_file"
    sed -i '' 's/"bluecat-bdds-ha"/"bluecat_bdds_ha"/g' "$tf_file"
    sed -i '' 's/"arista-ha"/"arista_ha"/g' "$tf_file"
    sed -i '' 's/"vsrx-single"/"vsrx_single"/g' "$tf_file"
    sed -i '' 's/"c8kv-single"/"c8kv_single"/g' "$tf_file"

    rm ${tf_file}.bak
}

# generate pululmi yaml from terraform examples
generate_pulumi_yaml() {
    local SOURCE_DIR="${SCRIPT_DIR}/../upstream/examples/resources/"
    local DEST_DIR="${SCRIPT_DIR}/../examples/"

    # Loop through subdirectories in the source directory
    for example in $(find $SOURCE_DIR -mindepth 1 -maxdepth 1 -type d); do
        local example_name=$(basename $example)
        IFS='_' read -r -a parts <<< "$example_name"

        # Create the destination directory structure
        local service_part=${parts[0]}
        local resource_part=$(IFS='_'; echo "${parts[*]:1}")
        local target_dir="$DEST_DIR$service_part/$resource_part"
        mkdir -p $target_dir

        # Find .tf files and convert them
        local tf_files=($example/*.tf)
        local tf_count=${#tf_files[@]}
        if [ $tf_count -eq 1 ]; then
            local tf_file="${tf_files[0]}"
            # If there's only one .tf file, the resource_dir is the target_dir
            local resource_dir="$target_dir"
            local tf_destination_file="$resource_dir/main.tf"
            local example_relative_path="${tf_file#$SOURCE_DIR}"

            # Check if the file is in the exclude list
            if [[ " ${EXCLUDE_FILES[@]} " =~ " ${example_relative_path} " ]]; then
                EXCLUDED_FILES+=("$example_relative_path")
                continue
            fi

            # Patch terraform template
            cp $tf_file $tf_destination_file
            mappings $tf_destination_file

            # Generate Pulumi template
            echo -e "\033[0;34m CONVERTING $example_relative_path"
            pulumi convert --cwd "$resource_dir" --from terraform --language yaml --out $resource_dir --generate-only "${tf_files[0]}"
            rm $tf_destination_file
        
            # Combine Main.yaml and Pulumi.yaml into a single file
            if [ -f "$resource_dir/Main.yaml" ] && [ -f "$resource_dir/Pulumi.yaml" ]; then
                cat "$resource_dir/Main.yaml" >> "$resource_dir/Pulumi.yaml"
                rm "$resource_dir/Main.yaml"
            fi

             # Update the name field in Pulumi.yaml
            sed -i '' "s/^name: \(.*\)/name: equinix-${service_part}-\1/" "$resource_dir/Pulumi.yaml"
        else
            # If there are multiple .tf files, process them individually
            for tf_file in "${tf_files[@]}"; do
                local example_relative_path="${tf_file#$SOURCE_DIR}"
                local example_name=$(basename -s .tf $example_relative_path)
                echo $example_name

                # Check if the file is in the exclude list
                if [[ " ${EXCLUDE_FILES[@]} " =~ " ${example_relative_path} " ]]; then
                    EXCLUDED_FILES+=("$example_relative_path")
                    continue
                fi

                if [ -n "$example_name" ]; then
                    local resource_dir="$target_dir/$example_name"
                    local tf_destination_file="$resource_dir/main.tf"

                    # Patch terraform template
                    mkdir -p $resource_dir
                    cp $tf_file $tf_destination_file
                    mappings $tf_destination_file

                    # Execute the Terraform to YAML conversion
                    echo -e "\033[0;34m CONVERTING $example_relative_path"
                    pulumi convert --cwd "$resource_dir" --from terraform --language yaml --out $resource_dir --generate-only $tf_file
                    rm $tf_destination_file

                    # Combine Main.yaml and Pulumi.yaml into a single file
                    if [ -f "$resource_dir/Main.yaml" ] && [ -f "$resource_dir/Pulumi.yaml" ]; then
                        cat "$resource_dir/Main.yaml" >> "$resource_dir/Pulumi.yaml"
                        rm "$resource_dir/Main.yaml"
                    fi

                     # Update the name field in Pulumi.yaml
                    sed -i '' "s/^name: \(.*\)/name: equinix-${service_part}-${resource_part}-\1/" "$resource_dir/Pulumi.yaml"
                fi
            done
        fi
    done
}

generate_examples_and_docs() {
    # Find all Pulumi.yaml files within the examples directory structure
    find "$EXAMPLES_DIR" \( -name "go" -o -name "java" -o -name "python" -o -name "typescript" -o -name "csharp" \) -prune -o -name "Pulumi.yaml" -print0 | while IFS= read -r -d '' yaml_file; do
        NAME="$(head -n 1 "$yaml_file" | cut -d ' ' -f 2)"
        echo "Generating examples and docs for: $NAME"

        # Normalize the NAME by replacing spaces and hyphens with underscores
        NORMALIZED_NAME="${NAME// /_}"
        NORMALIZED_NAME="${NORMALIZED_NAME//-/_}"

        # Set the directory containing the Pulumi.yaml file
        PULUMI_DIR=$(dirname "$yaml_file")

        # Generate the output file name
        OUTPUT_FILE="${OUTPUT_DIR}/${NORMALIZED_NAME}.examples.md"

        # Convert Pulumi configurations to all languages
        pulumi convert --cwd "$PULUMI_DIR" --language python --out python --generate-only || true
        pulumi convert --cwd "$PULUMI_DIR" --language typescript --out typescript --generate-only || true
        pulumi convert --cwd "$PULUMI_DIR" --language java --out java --generate-only || true
        pulumi convert --cwd "$PULUMI_DIR" --language go --out go || true
        pulumi convert --cwd "$PULUMI_DIR" --language csharp --out csharp --generate-only || true

        # Fix version constraints
        ## csharp
        for file in "$PULUMI_DIR/csharp"/*.csproj; do
            echo $file
            sed -i.bak "s|$VERSION|(, 1.0.0)|g" "$file"
        done
        rm $PULUMI_DIR/csharp/*.csproj.bak

        ## java
        sed -i.bak "s|$VERSION|(,1.0)|g" $PULUMI_DIR/java/pom.xml
        rm $PULUMI_DIR/java/pom.xml.bak
        ## python
        sed -i.bak "s|$VERSION|<1.0.0|g" $PULUMI_DIR/python/requirements.txt
        rm $PULUMI_DIR/python/requirements.txt.bak
        ## typescript
        sed -i.bak "s|$VERSION|<1.0.0|g" $PULUMI_DIR/typescript/package.json
        rm $PULUMI_DIR/typescript/package.json.bak
        ## go
        sed -i.bak "s|github.com/equinix/pulumi-equinix/sdk [^ ]*|github.com/equinix/pulumi-equinix/sdk $GOLANG_MIN_NEXT_VERSION|g" "$PULUMI_DIR/go/go.mod"
        rm $PULUMI_DIR/go/go.sum $PULUMI_DIR/go/go.mod.bak

        # Read each source file
        TS_SRC=$(cat "$PULUMI_DIR/typescript/index.ts")
        PY_SRC=$(cat "$PULUMI_DIR/python/__main__.py")
        GO_SRC=$(cat "$PULUMI_DIR/go/main.go")
        CS_SRC=$(cat "$PULUMI_DIR/csharp/Program.cs")
        JAVA_SRC=$(cat "$PULUMI_DIR/java/src/main/java/generated_program/App.java")
        # Skip first 3 lines of Pulumi.yaml from the specified directory
        YAML_SRC=$(tail -n +4 "$PULUMI_DIR/Pulumi.yaml")

        # Generate the markdown in the desired format
        OUTPUT=$(cat <<EOF
## Example Usage
{{% example %}}
\`\`\`typescript
$TS_SRC
\`\`\`
\`\`\`python
$PY_SRC
\`\`\`
\`\`\`go
$GO_SRC
\`\`\`
\`\`\`csharp
$CS_SRC
\`\`\`
\`\`\`java
$JAVA_SRC
\`\`\`
\`\`\`yaml
$YAML_SRC
\`\`\`
{{% /example %}}
EOF
  )

        # Write out to the generated output file in docs directory
        echo "$OUTPUT" > "$OUTPUT_FILE"

        echo "Output file generated: $OUTPUT_FILE"
    done
}

# Merge specific example files
merge_example_files() {
    local RESULT_FILE_NAME="${1}.examples.md"
    local MERGED_FILE="${OUTPUT_DIR}/${RESULT_FILE_NAME}"

    echo "Generating merged example: $RESULT_FILE_NAME"
    echo "${1}_example_*.examples.md"
    # Find all example files with the specified prefix in OUTPUT_DIR
    local EXAMPLES_TO_MERGE=($(find "$OUTPUT_DIR" -maxdepth 1 -name "${1}_example*.examples.md"))
    echo "${EXAMPLES_TO_MERGE[@]}"

    local CONTENTS=""
    for FILE in "${EXAMPLES_TO_MERGE[@]}"; do
        if [[ -f "$FILE" ]]; then
            # Read the content of the individual files
            local NAME=$(basename "$FILE" .examples.md)
            local SHORT_NAME="${NAME##${1}_}"
            local FILE_CONTENT=$(sed '1,2d;$d' "$FILE")  # Remove header and footer lines
            CONTENTS+="{{% example %}}\n### ${SHORT_NAME//_/ }\n$FILE_CONTENT\n{{% /example %}}\n\n"
            rm "$FILE"  # Remove the individual example file after merging its content
        fi
    done

    # Write the merged content to the output file
    echo -e "## Example Usage\n\n$CONTENTS" > "$MERGED_FILE"
    echo "Merged file generated: $MERGED_FILE"
}

### main
# generate_pulumi_yaml
generate_examples_and_docs

merge_example_files "equinix_network_device"
merge_example_files "equinix_fabric_connection" 
merge_example_files "equinix_fabric_routing_protocol"
merge_example_files "equinix_metal_device"
merge_example_files "equinix_metal_project"
merge_example_files "equinix_metal_organization_member"
merge_example_files "equinix_metal_connection"
merge_example_files "equinix_metal_gateway"
merge_example_files "equinix_metal_port_vlan_attachment"
merge_example_files "equinix_metal_port"
merge_example_files "equinix_metal_reserved_ip_block"
merge_example_files "equinix_metal_vrf"

# warning message for excluded files
if [ ${#EXCLUDED_FILES[@]} -gt 0 ]; then
    echo -e "\n\033[0;33m Warning:\033[0m The following examples were not converted due to their complexity:"
    for excluded_file in "${EXCLUDED_FILES[@]}"; do
        echo "  - $excluded_file"
    done
    echo "Please manually update the Pulumi.yaml file for these resources in their respective directories in the examples section if any updates are expected."
fi