## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const organizationId = config.require("organizationId");
const name = config.get("name") || "Default Project";
const projectResource = new equinix.metal.Project("project", {
    name: name,
    organizationId: organizationId,
});
export const projectId = projectResource.id;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
organization_id = config.require("organizationId")
name = config.get("name")
if name is None:
    name = "Default Project"
project_resource = equinix.metal.Project("project",
    name=name,
    organization_id=organization_id)
pulumi.export("projectId", project_resource.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		organizationId := cfg.Require("organizationId")
		name := "Default Project"
		if param := cfg.Get("name"); param != "" {
			name = param
		}
		projectResource, err := metal.NewProject(ctx, "project", &metal.ProjectArgs{
			Name:           pulumi.String(name),
			OrganizationId: pulumi.String(organizationId),
		})
		if err != nil {
			return err
		}
		ctx.Export("projectId", projectResource.ID())
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var organizationId = config.Require("organizationId");
    var name = config.Get("name") ?? "Default Project";
    var projectResource = new Equinix.Metal.Project("project", new()
    {
        Name = name,
        OrganizationId = organizationId,
    });

    return new Dictionary<string, object?>
    {
        ["projectId"] = projectResource.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Project;
import com.equinix.pulumi.metal.ProjectArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var organizationId = config.get("organizationId").get();
        final var name = config.get("name").orElse("Default Project");
        var projectResource = new Project("projectResource", ProjectArgs.builder()        
            .name(name)
            .organizationId(organizationId)
            .build());

        ctx.export("projectId", projectResource.id());
    }
}
```
```yaml
config:
  organizationId:
    type: string
  name:
    type: string
    default: Default Project
resources:
  project:
    type: equinix:metal:Project
    properties:
      name: ${name}
      organizationId: ${organizationId}
outputs:
  projectId: ${project.id}
```
{{% /example %}}
