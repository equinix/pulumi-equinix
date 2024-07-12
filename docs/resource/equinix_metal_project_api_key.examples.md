## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.ProjectApiKey("test", {
    projectId: existingProjectId,
    description: "Read-only key scoped to a projct",
    readOnly: true,
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.ProjectApiKey("test",
    project_id=existing_project_id,
    description="Read-only key scoped to a projct",
    read_only=True)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProjectApiKey(ctx, "test", &metal.ProjectApiKeyArgs{
			ProjectId:   pulumi.Any(existingProjectId),
			Description: pulumi.String("Read-only key scoped to a projct"),
			ReadOnly:    pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.ProjectApiKey("test", new()
    {
        ProjectId = existingProjectId,
        Description = "Read-only key scoped to a projct",
        ReadOnly = true,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ProjectApiKey;
import com.pulumi.equinix.metal.ProjectApiKeyArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var test = new ProjectApiKey("test", ProjectApiKeyArgs.builder()
            .projectId(existingProjectId)
            .description("Read-only key scoped to a projct")
            .readOnly(true)
            .build());

    }
}
```
```yaml
  # Create a new read-only API key in existing project
  test:
    type: equinix:metal:ProjectApiKey
    properties:
      projectId: ${existingProjectId}
      description: Read-only key scoped to a projct
      readOnly: true
```
{{% /example %}}
