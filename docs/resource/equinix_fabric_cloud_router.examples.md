## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const metro = config.get("metro") || "FR";
const accountNum = config.requireNumber("accountNum");
const router = new equinix.fabric.CloudRouter("router", {
    name: "My-Fabric-Cloud-Router",
    type: "XF_ROUTER",
    location: {
        metroCode: metro,
    },
    "package": {
        code: "BASIC",
    },
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
    account: {
        accountNumber: 272010,
    },
    "project": {
        "projectId": "995072000433550"
    }
});
export const routerId = router.id;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
metro = config.get("metro")
if metro is None:
    metro = "FR"
account_num = config.require_int("accountNum")
router = equinix.fabric.CloudRouter("router",
    name="My-Fabric-Cloud-Router",
    type="XF_ROUTER",
    location=equinix.fabric.CloudRouterLocationArgs(
        metro_code=metro,
    ),
    package=equinix.fabric.CloudRouterPackageArgs(
        code="BASIC",
    ),
    notifications=[equinix.fabric.CloudRouterNotificationArgs(
        type="ALL",
        emails=["example@equinix.com"],
    )],
    account=equinix.fabric.CloudRouterAccountArgs(
        account_number=272010,
    ))
    project=equinix.fabric.CloudRouterProjectArgs(
        project_id=995072000433550,
    ))
pulumi.export("routerId", router.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		metro := "FR"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		accountNum := cfg.RequireInt("accountNum")
		router, err := fabric.NewCloudRouter(ctx, "router", &fabric.CloudRouterArgs{
			Name: pulumi.String("My-Fabric-Cloud-Router"),
			Type: pulumi.String("XF_ROUTER"),
			Location: &fabric.CloudRouterLocationArgs{
				MetroCode: pulumi.String(metro),
			},
			Package: &fabric.CloudRouterPackageArgs{
				Code: pulumi.String("BASIC"),
			},
			Notifications: fabric.CloudRouterNotificationArray{
				&fabric.CloudRouterNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
					},
				},
			},
			Account: &fabric.CloudRouterAccountArgs{
				AccountNumber: pulumi.Int(272010),
			},
			Project: &fabric.CloudRouterProjectArgs{
				ProjectId: pulumi.String("995072000433550"),
            },
		})
		if err != nil {
			return err
		}
		ctx.Export("routerId", router.ID())
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
    var config = new Config();
    var metro = config.Get("metro") ?? "FR";
    var accountNum = config.RequireInt32("accountNum");
    var router = new Equinix.Fabric.CloudRouter("router", new()
    {
        Name = "My-Fabric-Cloud-Router",
        Type = "XF_ROUTER",
        Location = new Equinix.Fabric.Inputs.CloudRouterLocationArgs
        {
            MetroCode = metro,
        },
        Package = new Equinix.Fabric.Inputs.CloudRouterPackageArgs
        {
            Code = "BASIC",
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.CloudRouterNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                },
            },
        },
        Account = new Equinix.Fabric.Inputs.CloudRouterAccountArgs
        {
            AccountNumber = 272010,
        },
        Project = new Equinix.Fabric.Inputs.CloudRouterProjectArgs
        {
            ProjectId = "995072000433550",
        },
    });

    return new Dictionary<string, object?>
    {
        ["routerId"] = router.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.CloudRouter;
import com.pulumi.equinix.fabric.CloudRouterArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterLocationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterPackageArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterNotificationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterAccountArgs;
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
        final var metro = config.get("metro").orElse("FR");
        final var accountNum = config.get("accountNum");
        var router = new CloudRouter("router", CloudRouterArgs.builder()        
            .name("My-Fabric-Cloud-Router")
            .type("XF_ROUTER")
            .location(CloudRouterLocationArgs.builder()
                .metroCode(metro)
                .build())
            .package_(CloudRouterPackageArgs.builder()
                .code("BASIC")
                .build())
            .notifications(CloudRouterNotificationArgs.builder()
                .type("ALL")
                .emails("example@equinix.com")
                .build())
            .account(CloudRouterAccountArgs.builder()
                .accountNumber(272010)
                .build())
            .project(CloudRouterProjectArgs.builder()
                .projectId("995072000433550")
                .build())
            .build());

        ctx.export("routerId", router.id());
    }
}
```
```yaml
config:
  metro:
    type: string
    default: FR
  accountNum:
    type: integer
resources:
  router:
    type: equinix:fabric:CloudRouter
    properties:
      name: My-Fabric-Cloud-Router
      type: XF_ROUTER
      location:
        metroCode: ${metro}
      package:
        code: BASIC
      notifications:
      - type: ALL
        emails:
        - example@equinix.com
      account:
        accountNumber: 272010
      project:
        projectId: 995072000433550
outputs:
  routerId: ${router.id}
```
{{% /example %}}
