#!/bin/bash
set -e

# List of terraform examples to exclude
EXCLUDE_TF_EXAMPLES=(
    "metal_connection/shared_nimf_from_fcr.tf" \
    "metal_connection/shared_nimf_to_csp.tf" \
    "metal_connection/shared_no_token_metal_to_fabric.tf" \
    "metal_connection/shared_token_fabric_port_to_metal.tf" \
    "metal_connection/shared_token_metal_to_csp.tf" \
    "metal_bgp_session/example_1.tf"
)
EXCLUDED_TF_EXAMPLES=()
ALL_TF_EXAMPLES=()

# this script current directory
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
# Examples directory
EXAMPLES_DIR="${SCRIPT_DIR}/../examples/"
# Docs directory
OUTPUT_DIR="${SCRIPT_DIR}/../docs/resource"
# Pulumi Equinix plugin version installed
VERSION=$(pulumictl get version --language generic)

get_patch() {
    local version="$1"
    local new_version=$(echo "$version" | awk -F'[.-]' '{print $1"."$2"."$3}')
    echo "$new_version"
}

GOLANG_MIN_NEXT_VERSION=$(get_patch "$VERSION")

# Find all Pulumi.yaml files within the examples directory structure
EXISTING_PULUMI_EXAMPLES=()
while IFS= read -r -d '' yaml_file; do
    EXISTING_PULUMI_EXAMPLES+=("$yaml_file")
done < <(find "$EXAMPLES_DIR" \( -name "go" -o -name "java" -o -name "python" -o -name "typescript" -o -name "csharp" \) -prune -o -name "Pulumi.yaml" -print0)

mappings() {
    local tf_file=$1
    # Remove occurrences of ${path.module}/
    sed -i.bak 's/\${path\.module}\///g' "$tf_file"
    # Replace one function with index 0
    sed -i.bak 's/one(equinix_fabric_connection.vd2azure_primary.redundancy).group/equinix_fabric_connection.vd2azure_primary.redundancy.0.group/g' "$tf_file"
    # Fix invalid strings
    sed -i.bak 's/<some_id>/"<some_id>"/g' "$tf_file"
    sed -i.bak 's/<same_connection_id_as_first_equinix_fabric_routing_protocol>/"<same_connection_id_as_first_equinix_fabric_routing_protocol>"/g' "$tf_file"
    # Replace public_key with EOF format
    sed -i.bak '/public_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX/,/John.Kent@company.com"/ {
        s/public_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX/public_key = <<EOF\n  ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX/
        s/John.Kent@company.com"/John.Kent@company.com\n  EOF/
    }' "$tf_file"
    # Replace unimplemented conditional expression
    sed -i.bak 's/equinix_network_device\.test\.asn > 0 ? equinix_network_device\.test\.asn : 22111/22111/g' "$tf_file"
    sed -i.bak 's/equinix_network_device\.test\.secondary_device\[0\]\.asn > 0 ? equinix_network_device\.test\.secondary_device\[0\]\.asn : 22333/22333/g' "$tf_file"
    # Replace references to not declared resources or variables
    sed -i.bak 's/equinix_network_device\.csr1000v-ha\.uuid,/"csr1000v-ha-uuid",/g' "$tf_file"
    sed -i.bak 's/equinix_network_device\.csr1000v-ha\.redundant_uuid/"csr1000v-ha-redundant-uuid"/g' "$tf_file"
    sed -i.bak 's/equinix_metal_connection\.metal-connection/equinix_metal_connection\.example/g' "$tf_file"
    # Replace duplicate resource name
    sed -i.bak '1,/resource "equinix_metal_reserved_ip_block" "test"/ s/resource "equinix_metal_reserved_ip_block" "test"/resource "equinix_metal_reserved_ip_block" "test1"/g' "$tf_file"
    # Replace - with _ in resource names
    sed -i.bak 's/test-public-key/test_public_key/g' "$tf_file"
    sed -i.bak 's/"csr1000v-ha"/"csr1000v_ha"/g' "$tf_file"
    sed -i.bak 's/"panw-cluster"/"panw_cluster"/g' "$tf_file"
    sed -i.bak 's/"aviatrix-single"/"aviatrix_single"/g' "$tf_file"
    sed -i.bak 's/aviatrix-cloudinit-file/aviatrix_cloudinit_file/g' "$tf_file"
    sed -i.bak 's/bluecat-edge-service-point-cloudinit-primary-file/bluecat_edge_service_point_cloudinit_primary_file/g' "$tf_file"
    sed -i.bak 's/bluecat-edge-service-point-cloudinit-secondary-file/bluecat_edge_service_point_cloudinit_secondary_file/g' "$tf_file"
    sed -i.bak 's/"bluecat-edge-service-point-ha"/"bluecat_edge_service_point_ha"/g' "$tf_file"
    sed -i.bak 's/"bluecat-bdds-ha"/"bluecat_bdds_ha"/g' "$tf_file"
    sed -i.bak 's/"arista-ha"/"arista_ha"/g' "$tf_file"
    sed -i.bak 's/"vsrx-single"/"vsrx_single"/g' "$tf_file"
    sed -i.bak 's/"c8kv-single"/"c8kv_single"/g' "$tf_file"

    rm ${tf_file}.bak
}

# generate Pulumi yaml from terraform examples
generate_pulumi_yaml() {
    local SOURCE_DIR="${SCRIPT_DIR}/../upstream/examples/resources/"
    local DEST_DIR="${SCRIPT_DIR}/../examples/"

    # Loop through subdirectories in the source directory
    for example in $(find $SOURCE_DIR -mindepth 1 -maxdepth 1 -type d); do
        local example_name=$(basename $example)
        IFS='_' read -r -a parts <<< "$example_name"

        # Check if the first part is "equinix_"
        if [ "${parts[0]}" == "equinix" ]; then
            local service_part=${parts[1]}
            local resource_part=$(IFS='_'; echo "${parts[*]:2}")
        else
            local service_part=${parts[0]}
            local resource_part=$(IFS='_'; echo "${parts[*]:1}")
        fi

        # Create the destination directory structure
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
            ALL_TF_EXAMPLES+=("$tf_destination_file")

            # Check if the file is in the exclude list
            normalized_path="${example_relative_path#/}"
            if [[ " ${EXCLUDE_TF_EXAMPLES[@]} " =~ " ${normalized_path} " ]]; then
                EXCLUDED_TF_EXAMPLES+=("$normalized_path")
                continue
            fi

            # Clean previous version
            rm -rf "$resource_dir"
            mkdir -p "$resource_dir"
            touch "$resource_dir/.autogenerated"

            # Patch terraform template
            cp "$tf_file" "$tf_destination_file"
            mappings "$tf_destination_file"

            # Generate Pulumi template
            echo -e "\033[0;34m CONVERTING $normalized_path"
            pulumi convert --cwd "$resource_dir" --from terraform --language yaml --out $resource_dir --generate-only "${tf_files[0]}"
            sed -i.bak $'1i\\\n# WARNING: This is an autogenerated file - manual changes will be overwritten if not made via ./scripts/generate_examples.sh\n' "$resource_dir/Pulumi.yaml"
            rm "$tf_destination_file" "$resource_dir"/*.bak
        
            # Combine Main.yaml and Pulumi.yaml into a single file
            if [ -f "$resource_dir/Main.yaml" ] && [ -f "$resource_dir/Pulumi.yaml" ]; then
                cat "$resource_dir/Main.yaml" >> "$resource_dir/Pulumi.yaml"
                rm "$resource_dir/Main.yaml"
            fi

             # Update the name field in Pulumi.yaml
            sed -i.bak "s/^name: \(.*\)/name: equinix-${service_part}-\1/" "$resource_dir/Pulumi.yaml"
            rm "$resource_dir/Pulumi.yaml.bak"
        else
            # If there are multiple .tf files, process them individually
            for tf_file in "${tf_files[@]}"; do
                local example_relative_path="${tf_file#$SOURCE_DIR}"

                # Make sure examples start always with "example_" prefix to be able to distinguish
                # later between resources that start the same and their examples, for example
                # resources "equinix_metal_project" and "equinix_metal_project_api_key" have same
                # "equinix_metal_project" prefix
                local basename_example=$(basename -s .tf $example_relative_path)
                if [[ $basename_example == example_* ]]; then
                    local example_name="$basename_example"
                else
                    local example_name="example_$basename_example"
                fi

                if [ -n "$example_name" ]; then
                    local resource_dir="$target_dir/$example_name"
                    local tf_destination_file="$resource_dir/main.tf"
                    ALL_TF_EXAMPLES+=("$tf_destination_file")

                    # Check if the file is in the exclude list
                    normalized_path="${example_relative_path#/}"
                    if [[ " ${EXCLUDE_TF_EXAMPLES[@]} " =~ " ${normalized_path} " ]]; then
                        EXCLUDED_TF_EXAMPLES+=("$normalized_path")
                        continue
                    fi

                    # Clean previous version
                    rm -rf "$resource_dir"
                    mkdir -p "$resource_dir"
                    touch "$resource_dir/.autogenerated"

                    # Patch terraform template
                    cp "$tf_file" "$tf_destination_file"
                    mappings "$tf_destination_file"

                    # Execute the Terraform to YAML conversion
                    echo -e "\033[0;34m CONVERTING $normalized_path"
                    pulumi convert --cwd "$resource_dir" --from terraform --language yaml --out $resource_dir --generate-only $tf_file
                    sed -i.bak $'1i\\\n# WARNING: This is an autogenerated file - manual changes will be overwritten if not made via ./scripts/generate_examples.sh\n' "$resource_dir/Pulumi.yaml"
                    rm "$tf_destination_file" "$resource_dir"/*.bak

                    # Combine Main.yaml and Pulumi.yaml into a single file
                    if [ -f "$resource_dir/Main.yaml" ] && [ -f "$resource_dir/Pulumi.yaml" ]; then
                        cat "$resource_dir/Main.yaml" >> "$resource_dir/Pulumi.yaml"
                        rm "$resource_dir/Main.yaml"
                    fi

                     # Update the name field in Pulumi.yaml
                    sed -i.bak "s/^name: \(.*\)/name: equinix-${service_part}-${resource_part}-\1/" "$resource_dir/Pulumi.yaml"
                    rm "$resource_dir/Pulumi.yaml.bak"
                fi
            done
        fi
    done
}

# Convert the Pulumi yaml generated with generate_pulumi_yaml function into all supported languages
generate_examples_and_docs() {
    # Clean previous docs
    rm -rf "$OUTPUT_DIR"
    mkdir -p "$OUTPUT_DIR"

    for yaml_file in "${EXISTING_PULUMI_EXAMPLES[@]}"; do
        NAME=$(awk '/^name:/ { print $2; exit }' "$yaml_file")
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
        rm "$PULUMI_DIR"/csharp/*.csproj.bak

        ## java
        sed -i.bak "s|$VERSION|(,1.0)|g" $PULUMI_DIR/java/pom.xml
        rm "$PULUMI_DIR"/java/pom.xml.bak
        ## python
        sed -i.bak "s|$VERSION|<1.0.0|g" $PULUMI_DIR/python/requirements.txt
        rm "$PULUMI_DIR"/python/requirements.txt.bak
        ## typescript
        sed -i.bak "s|$VERSION|<1.0.0|g" $PULUMI_DIR/typescript/package.json
        rm "$PULUMI_DIR"/typescript/package.json.bak
        ## go
        sed -i.bak "s|github.com/equinix/pulumi-equinix/sdk [^ ]*|github.com/equinix/pulumi-equinix/sdk $GOLANG_MIN_NEXT_VERSION|g" "$PULUMI_DIR/go/go.mod"
        rm "$PULUMI_DIR"/go/go.sum "$PULUMI_DIR"/go/go.mod.bak

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
    # Find all example files with the specified prefix in OUTPUT_DIR
    local EXAMPLES_TO_MERGE=($(find "$OUTPUT_DIR" -maxdepth 1 -name "${1}_example*.examples.md" | sort -V))

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

# Delete pulumi examples that no longer exist in Terraform
delete_nonexistent_pulumi_examples() {
    # Normalize paths of the Terraform examples
    for i in "${!ALL_TF_EXAMPLES[@]}"; do
        tf_dir=$(dirname "${ALL_TF_EXAMPLES[$i]}")
        if [ -d "$tf_dir" ]; then
            ALL_TF_EXAMPLES[$i]=$(realpath "$tf_dir")
        else
            ALL_TF_EXAMPLES[$i]="$tf_dir"  # Keep the original path if it doesn't exist
        fi
    done

    new_pulumi_examples=()
    # Delete Pulumi examples that no longer exist in Terraform
    for pulumi_example in "${EXISTING_PULUMI_EXAMPLES[@]}"; do
        found=false
        pulumi_example_dir=$(dirname "$pulumi_example")
        if [ -d "$pulumi_example_dir" ]; then
            pulumi_example_dir=$(realpath "$pulumi_example_dir")
        fi

        for tf_example_dir in "${ALL_TF_EXAMPLES[@]}"; do
            if [[ "$pulumi_example_dir" == "$tf_example_dir" ]]; then
                found=true
                break
            fi
        done
        if [[ "$found" == false ]]; then
            echo "NOT FOUND $pulumi_example_dir"
        fi
        if [[ "$found" == false && -f "$pulumi_example_dir/.autogenerated" ]]; then
            echo -e "\n\033[0;33m Warning:\033[0m deleting autogenerated example that no longer exist in Terraform: $pulumi_example_dir"
            rm -rf "$pulumi_example_dir"
        else
            new_pulumi_examples+=("$pulumi_example")
        fi
    done
    EXISTING_PULUMI_EXAMPLES=("${new_pulumi_examples[@]}")
}

## main
generate_pulumi_yaml
delete_nonexistent_pulumi_examples
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
if [ ${#EXCLUDED_TF_EXAMPLES[@]} -gt 0 ]; then
    echo -e "\n\033[0;33m Warning:\033[0m The following examples were not converted due to their complexity:"
    for excluded_file in "${EXCLUDED_TF_EXAMPLES[@]}"; do
        echo "  - $excluded_file"
    done
    echo "Please manually update the Pulumi.yaml file for these resources in their respective directories in the examples section if any updates are expected."
fi
