#!/bin/bash

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Examples directory
EXAMPLES_DIR="${SCRIPT_DIR}/../examples/"

# Docs directory
OUTPUT_DIR="${SCRIPT_DIR}/../docs/resource"

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

# Merge specific example files
merge_example_files() {
    local RESULT_FILE_NAME="${1}.examples.md"
    local MERGED_FILE="${OUTPUT_DIR}/${RESULT_FILE_NAME}"

    shift 1
    local EXAMPLES_TO_MERGE=("$@")

    local CONTENTS=""
    for EXAMPLE in "${EXAMPLES_TO_MERGE[@]}"; do
        echo "generating example: $EXAMPLE"
        local FILE="${OUTPUT_DIR}/${EXAMPLE}.examples.md"
        if [[ -f "$FILE" ]]; then
            # Read the content of the individual files
            local NAME=$(basename "$FILE" .examples.md)
            local SHORT_NAME="${NAME##${EXAMPLE}_}"
            local FILE_CONTENT=$(sed '1,2d;$d' "$FILE")
            CONTENTS+="{{% example %}}\n### ${SHORT_NAME//_/ }\n$FILE_CONTENT\n{{% /example %}}\n\n"
            rm "$FILE"
        fi
    done

    # Write the merged content
    echo -e "## Example Usage\n\n$CONTENTS" > "$MERGED_FILE"
    echo "Merged file generated: $MERGED_FILE"
}

merge_example_files "equinix_metal_connection" "equinix_metal_connection_fabric_billed_token" "equinix_metal_connection_metal_billed_token"
merge_example_files "equinix_metal_port" "equinix_metal_port_hybrid_bonded" "equinix_metal_port_hybrid_unbonded" "equinix_metal_port_layer2_bonded"