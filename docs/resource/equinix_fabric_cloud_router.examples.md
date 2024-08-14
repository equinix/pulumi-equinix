## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newCloudRouter = new equinix.fabric.CloudRouter("newCloudRouter", {
    name: "Router-SV",
    type: "XF_ROUTER",
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    order: {
        purchaseOrderNumber: "1-323292",
    },
    location: {
        metroCode: "SV",
    },
    "package": {
        code: "STANDARD",
    },
    project: {
        projectId: "776847000642406",
    },
    account: {
        accountNumber: 203612,
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

new_cloud_router = equinix.fabric.CloudRouter("newCloudRouter",
    name="Router-SV",
    type="XF_ROUTER",
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    order={
        "purchase_order_number": "1-323292",
    },
    location={
        "metro_code": "SV",
    },
    package={
        "code": "STANDARD",
    },
    project={
        "project_id": "776847000642406",
    },
    account={
        "account_number": 203612,
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewCloudRouter(ctx, "newCloudRouter", &fabric.CloudRouterArgs{
			Name: pulumi.String("Router-SV"),
			Type: pulumi.String("XF_ROUTER"),
			Notifications: fabric.CloudRouterNotificationArray{
				&fabric.CloudRouterNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Order: &fabric.CloudRouterOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			Location: &fabric.CloudRouterLocationArgs{
				MetroCode: pulumi.String("SV"),
			},
			Package: &fabric.CloudRouterPackageArgs{
				Code: pulumi.String("STANDARD"),
			},
			Project: &fabric.CloudRouterProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
			},
			Account: &fabric.CloudRouterAccountArgs{
				AccountNumber: pulumi.Int(203612),
			},
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
    var newCloudRouter = new Equinix.Fabric.CloudRouter("newCloudRouter", new()
    {
        Name = "Router-SV",
        Type = "XF_ROUTER",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.CloudRouterNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Order = new Equinix.Fabric.Inputs.CloudRouterOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        Location = new Equinix.Fabric.Inputs.CloudRouterLocationArgs
        {
            MetroCode = "SV",
        },
        Package = new Equinix.Fabric.Inputs.CloudRouterPackageArgs
        {
            Code = "STANDARD",
        },
        Project = new Equinix.Fabric.Inputs.CloudRouterProjectArgs
        {
            ProjectId = "776847000642406",
        },
        Account = new Equinix.Fabric.Inputs.CloudRouterAccountArgs
        {
            AccountNumber = 203612,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.CloudRouter;
import com.pulumi.equinix.fabric.CloudRouterArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterNotificationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterOrderArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterLocationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterPackageArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterProjectArgs;
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
        var newCloudRouter = new CloudRouter("newCloudRouter", CloudRouterArgs.builder()
            .name("Router-SV")
            .type("XF_ROUTER")
            .notifications(CloudRouterNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .order(CloudRouterOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .location(CloudRouterLocationArgs.builder()
                .metroCode("SV")
                .build())
            .package_(CloudRouterPackageArgs.builder()
                .code("STANDARD")
                .build())
            .project(CloudRouterProjectArgs.builder()
                .projectId("776847000642406")
                .build())
            .account(CloudRouterAccountArgs.builder()
                .accountNumber("203612")
                .build())
            .build());

    }
}
```
```yaml
resources:
  newCloudRouter:
    type: equinix:fabric:CloudRouter
    name: new_cloud_router
    properties:
      name: Router-SV
      type: XF_ROUTER
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      order:
        purchaseOrderNumber: 1-323292
      location:
        metroCode: SV
      package:
        code: STANDARD
      project:
        projectId: '776847000642406'
      account:
        accountNumber: '203612'
```
{{% /example %}}
