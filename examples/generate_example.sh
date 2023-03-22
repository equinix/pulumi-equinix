#!/bin/bash

cd $1

pulumi convert --language python --out python --generate-only || true
pulumi convert --language typescript --out typescript --generate-only || true
pulumi convert --language java --out java --generate-only || true
pulumi convert --language go --out go || true
pulumi convert --language csharp --out csharp || true

# Read each source file
TS_SRC=$(cat typescript/index.ts)
PY_SRC=$(cat python/__main__.py)
GO_SRC=$(cat go/main.go)
CS_SRC=$(cat csharp/Program.cs)
JAVA_SRC=$(cat java/src/main/java/generated_program/App.java)
## Skip first 3 lines
YAML_SRC=$(cat Pulumi.yaml | tail -n +4)

CHOOSER='{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}'
TS_BLOCK=$(printf "%s\n" '{{% choosable language "javascript,typescript" %}}' '' '```typescript' "$TS_SRC" '```' '' '{{% /choosable %}}')
PY_BLOCK=$(printf "%s\n" '{{% choosable language python %}}' '' '```python' "$PY_SRC" '```' '' '{{% /choosable %}}')
GO_BLOCK=$(printf "%s\n" '{{% choosable language go %}}' '' '```go' "$GO_SRC" '```' '' '{{% /choosable %}}')
CS_BLOCK=$(printf "%s\n" '{{% choosable language csharp %}}' '' '```csharp' "$CS_SRC" '```' '' '{{% /choosable %}}')
JAVA_BLOCK=$(printf "%s\n" '{{% choosable language java %}}' '' '```java' "$JAVA_SRC" '```' '' '{{% /choosable %}}')
YAML_BLOCK=$(printf "%s\n" '{{% choosable language yaml %}}' '' '```yaml' "$YAML_SRC" '```' '' '{{% /choosable %}}')

# Write out to a file
printf "%s\n" "$CHOOSER" "" "$TS_BLOCK" "" "$PY_BLOCK" "" "$GO_BLOCK" "" "$CS_BLOCK" "" "$JAVA_BLOCK" "" "$YAML_BLOCK" > example.md