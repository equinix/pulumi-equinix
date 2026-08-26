## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newNetwork = new equinix.fabric.Network("new_network", {
    project: {
        projectId: "776847000642406",
    },
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "Network-SV",
    type: "EVPLAN",
    scope: "GLOBAL",
});
```
```python
import pulumi
import pulumi_equinix as equinix

new_network = equinix.fabric.Network("new_network",
    project={
        "project_id": "776847000642406",
    },
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="Network-SV",
    type="EVPLAN",
    scope="GLOBAL")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewNetwork(ctx, "new_network", &fabric.NetworkArgs{
			Project: &fabric.NetworkProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
			},
			Notifications: fabric.NetworkNotificationArray{
				&fabric.NetworkNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:  pulumi.String("Network-SV"),
			Type:  pulumi.String("EVPLAN"),
			Scope: pulumi.String("GLOBAL"),
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
    var newNetwork = new Equinix.Fabric.Network("new_network", new()
    {
        Project = new Equinix.Fabric.Inputs.NetworkProjectArgs
        {
            ProjectId = "776847000642406",
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.NetworkNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "Network-SV",
        Type = "EVPLAN",
        Scope = "GLOBAL",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Network;
import com.pulumi.equinix.fabric.NetworkArgs;
import com.pulumi.equinix.fabric.inputs.NetworkProjectArgs;
import com.pulumi.equinix.fabric.inputs.NetworkNotificationArgs;
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
        var newNetwork = new Network("newNetwork", NetworkArgs.builder()
            .project(NetworkProjectArgs.builder()
                .projectId("776847000642406")
                .build())
            .notifications(NetworkNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("Network-SV")
            .type("EVPLAN")
            .scope("GLOBAL")
            .build());

    }
}
```
```yaml
resources:
  newNetwork:
    type: equinix:fabric:Network
    name: new_network
    properties:
      project:
        projectId: '776847000642406'
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: Network-SV
      type: EVPLAN
      scope: GLOBAL
```
{{% /example %}}
