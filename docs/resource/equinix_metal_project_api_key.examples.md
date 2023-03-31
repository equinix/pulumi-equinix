## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const readOnly = config.getBoolean("readOnly") || false;
const apiKey = new equinix.metal.ProjectApiKey("apiKey", {
    projectId: projectId,
    description: "A project level API Key",
    readOnly: readOnly,
});
export const apiKeyToken = apiKey.token;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
read_only = config.get_bool("readOnly")
if read_only is None:
    read_only = False
api_key = equinix.metal.ProjectApiKey("apiKey",
    project_id=project_id,
    description="A project level API Key",
    read_only=read_only)
pulumi.export("apiKeyToken", api_key.token)
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
		projectId := cfg.Require("projectId")
		readOnly := false
		if param := cfg.GetBool("readOnly"); param {
			readOnly = param
		}
		apiKey, err := metal.NewProjectApiKey(ctx, "apiKey", &metal.ProjectApiKeyArgs{
			ProjectId:   pulumi.String(projectId),
			Description: pulumi.String("A project level API Key"),
			ReadOnly:    pulumi.Bool(readOnly),
		})
		if err != nil {
			return err
		}
		ctx.Export("apiKeyToken", apiKey.Token)
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
    var projectId = config.Require("projectId");
    var readOnly = config.GetBoolean("readOnly") ?? false;
    var apiKey = new Equinix.Metal.ProjectApiKey("apiKey", new()
    {
        ProjectId = projectId,
        Description = "A project level API Key",
        ReadOnly = readOnly,
    });

    return new Dictionary<string, object?>
    {
        ["apiKeyToken"] = apiKey.Token,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.ProjectApiKey;
import com.equinix.pulumi.metal.ProjectApiKeyArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var readOnly = config.getBoolean("readOnly").orElse(false);
        var apiKey = new ProjectApiKey("apiKey", ProjectApiKeyArgs.builder()        
            .projectId(projectId)
            .description("A project level API Key")
            .readOnly(readOnly)
            .build());

        ctx.export("apiKeyToken", apiKey.token());
    }
}
```
```yaml
config:
  projectId:
    type: string
  readOnly:
    type: boolean
    default: false
resources:
  apiKey:
    type: equinix:metal:ProjectApiKey
    properties:
      projectId: ${projectId}
      description: A project level API Key
      readOnly: ${readOnly}
outputs:
  apiKeyToken: ${apiKey.token}
```
{{% /example %}}
