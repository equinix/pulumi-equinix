## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as fs from "fs";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const sshKey = new equinix.metal.ProjectSshKey("sshKey", {
    projectId: projectId,
    name: "johnKent",
    publicKey: fs.readFileSync("/Users/John/.ssh/metal_rsa.pub"),
});
export const sshKeyId = sshKey.id;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
ssh_key = equinix.metal.ProjectSshKey("sshKey",
    project_id=project_id,
    name="johnKent",
    public_key=(lambda path: open(path).read())("/Users/John/.ssh/metal_rsa.pub"))
pulumi.export("sshKeyId", ssh_key.id)
```
```go
package main

import (
	"os"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func readFileOrPanic(path string) pulumi.StringPtrInput {
	data, err := os.ReadFile(path)
	if err != nil {
		panic(err.Error())
	}
	return pulumi.String(string(data))
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		sshKey, err := metal.NewProjectSshKey(ctx, "sshKey", &metal.ProjectSshKeyArgs{
			ProjectId: pulumi.String(projectId),
			Name:      pulumi.String("johnKent"),
			PublicKey: readFileOrPanic("/Users/John/.ssh/metal_rsa.pub"),
		})
		if err != nil {
			return err
		}
		ctx.Export("sshKeyId", sshKey.ID())
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.IO;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var sshKey = new Equinix.Metal.ProjectSshKey("sshKey", new()
    {
        ProjectId = projectId,
        Name = "johnKent",
        PublicKey = File.ReadAllText("/Users/John/.ssh/metal_rsa.pub"),
    });

    return new Dictionary<string, object?>
    {
        ["sshKeyId"] = sshKey.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.ProjectSshKey;
import com.equinix.pulumi.metal.ProjectSshKeyArgs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();

        String content = null;
        try {
            content = Files.readString(Paths.get("/Users/John/.ssh/metal_rsa.pub"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        var sshKey = new ProjectSshKey("sshKey", ProjectSshKeyArgs.builder()        
            .projectId(projectId)
            .name("johnKent")
            .publicKey(content)
            .build());

        ctx.export("sshKeyId", sshKey.id());
    }
}
```
```yaml
config:
  projectId:
    type: string
resources:
  sshKey:
    type: equinix:metal:ProjectSshKey
    properties:
      projectId: ${projectId}
      name: johnKent
      publicKey:
        fn::readFile: /Users/John/.ssh/metal_rsa.pub
outputs:
  sshKeyId: ${sshKey.id}
```
{{% /example %}}
