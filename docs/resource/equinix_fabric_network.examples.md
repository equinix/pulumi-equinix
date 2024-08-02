## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newNetwork = new equinix.fabric.Network("newNetwork", {
    name: "Network-SV",
    type: "EVPLAN",
    scope: "GLOBAL",
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    project: {
        projectId: "776847000642406",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

new_network = equinix.fabric.Network("newNetwork",
    name="Network-SV",
    type="EVPLAN",
    scope="GLOBAL",
    notifications=[equinix.fabric.NetworkNotificationArgs(
        type="ALL",
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    project=equinix.fabric.NetworkProjectArgs(
        project_id="776847000642406",
    ))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewNetwork(ctx, "newNetwork", &fabric.NetworkArgs{
			Name:  pulumi.String("Network-SV"),
			Type:  pulumi.String("EVPLAN"),
			Scope: pulumi.String("GLOBAL"),
			Notifications: fabric.NetworkNotificationArray{
				&fabric.NetworkNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Project: &fabric.NetworkProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
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
    var newNetwork = new Equinix.Fabric.Network("newNetwork", new()
    {
        Name = "Network-SV",
        Type = "EVPLAN",
        Scope = "GLOBAL",
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
        Project = new Equinix.Fabric.Inputs.NetworkProjectArgs
        {
            ProjectId = "776847000642406",
        },
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
import com.pulumi.equinix.fabric.inputs.NetworkNotificationArgs;
import com.pulumi.equinix.fabric.inputs.NetworkProjectArgs;
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
            .name("Network-SV")
            .type("EVPLAN")
            .scope("GLOBAL")
            .notifications(NetworkNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .project(NetworkProjectArgs.builder()
                .projectId("776847000642406")
                .build())
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
      name: Network-SV
      type: EVPLAN
      scope: GLOBAL
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      project:
        projectId: '776847000642406'
```
{{% /example %}}
