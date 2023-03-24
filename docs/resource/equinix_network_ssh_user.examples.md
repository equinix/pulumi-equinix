## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const device1Id = config.require("device1Id");
const device2Id = config.require("device2Id");
const sshUser = new equinix.networkedge.SshUser("sshUser", {
    username: "johnKent",
    deviceIds: [
        device1Id,
        device2Id,
    ],
});
export const sshUserId = sshUser.id;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device1_id = config.require("device1Id")
device2_id = config.require("device2Id")
ssh_user = equinix.networkedge.SshUser("sshUser",
    username="johnKent",
    device_ids=[
        device1_id,
        device2_id,
    ])
pulumi.export("sshUserId", ssh_user.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		device1Id := cfg.Require("device1Id")
		device2Id := cfg.Require("device2Id")
		sshUser, err := networkedge.NewSshUser(ctx, "sshUser", &networkedge.SshUserArgs{
			Username: pulumi.String("johnKent"),
			DeviceIds: pulumi.StringArray{
				pulumi.String(device1Id),
				pulumi.String(device2Id),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("sshUserId", sshUser.ID())
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
    var device1Id = config.Require("device1Id");
    var device2Id = config.Require("device2Id");
    var sshUser = new Equinix.NetworkEdge.SshUser("sshUser", new()
    {
        Username = "johnKent",
        DeviceIds = new[]
        {
            device1Id,
            device2Id,
        },
    });

    return new Dictionary<string, object?>
    {
        ["sshUserId"] = sshUser.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.SshUser;
import com.pulumi.equinix.networkedge.SshUserArgs;
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
        final var config = ctx.config();
        final var device1Id = config.get("device1Id");
        final var device2Id = config.get("device2Id");
        var sshUser = new SshUser("sshUser", SshUserArgs.builder()        
            .username("johnKent")
            .deviceIds(            
                device1Id,
                device2Id)
            .build());

        ctx.export("sshUserId", sshUser.id());
    }
}
```
```yaml
config:
  device1Id:
    type: string
  device2Id:
    type: string
resources:
  sshUser:
    type: equinix:networkedge:SshUser
    properties:
      username: johnKent
      deviceIds:
      - ${device1Id}
      - ${device2Id}
outputs:
  sshUserId: ${sshUser.id}
```
{{% /example %}}
