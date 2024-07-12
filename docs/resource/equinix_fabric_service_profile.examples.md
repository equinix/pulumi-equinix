## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newServiceProfile = new equinix.fabric.ServiceProfile("newServiceProfile", {
    description: "Service Profile for Receiving Connections",
    name: "Name Of Business + Use Case Tag",
    type: equinix.fabric.ProfileType.L2Profile,
    visibility: equinix.fabric.ProfileVisibility.Public,
    notifications: [{
        emails: ["someone@sample.com"],
        type: "BANDWIDTH_ALERT",
    }],
    allowedEmails: [
        "test@equinix.com",
        "testagain@equinix.com",
    ],
    ports: [{
        uuid: "c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee",
        type: "XF_PORT",
    }],
    accessPointTypeConfigs: [{
        type: equinix.fabric.ProfileAccessPointType.Colo,
        allowRemoteConnections: true,
        allowCustomBandwidth: true,
        allowBandwidthAutoApproval: false,
        connectionRedundancyRequired: false,
        connectionLabel: "Service Profile Tag1",
        bandwidthAlertThreshold: 10,
        supportedBandwidths: [
            100,
            500,
        ],
    }],
});
```
```python
import pulumi
import pulumi_equinix as equinix

new_service_profile = equinix.fabric.ServiceProfile("newServiceProfile",
    description="Service Profile for Receiving Connections",
    name="Name Of Business + Use Case Tag",
    type=equinix.fabric.ProfileType.L2_PROFILE,
    visibility=equinix.fabric.ProfileVisibility.PUBLIC,
    notifications=[equinix.fabric.ServiceProfileNotificationArgs(
        emails=["someone@sample.com"],
        type="BANDWIDTH_ALERT",
    )],
    allowed_emails=[
        "test@equinix.com",
        "testagain@equinix.com",
    ],
    ports=[equinix.fabric.ServiceProfilePortArgs(
        uuid="c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee",
        type="XF_PORT",
    )],
    access_point_type_configs=[equinix.fabric.ServiceProfileAccessPointTypeConfigArgs(
        type=equinix.fabric.ProfileAccessPointType.COLO,
        allow_remote_connections=True,
        allow_custom_bandwidth=True,
        allow_bandwidth_auto_approval=False,
        connection_redundancy_required=False,
        connection_label="Service Profile Tag1",
        bandwidth_alert_threshold=10,
        supported_bandwidths=[
            100,
            500,
        ],
    )])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewServiceProfile(ctx, "newServiceProfile", &fabric.ServiceProfileArgs{
			Description: pulumi.String("Service Profile for Receiving Connections"),
			Name:        pulumi.String("Name Of Business + Use Case Tag"),
			Type:        pulumi.String(fabric.ProfileTypeL2Profile),
			Visibility:  pulumi.String(fabric.ProfileVisibilityPublic),
			Notifications: fabric.ServiceProfileNotificationArray{
				&fabric.ServiceProfileNotificationArgs{
					Emails: pulumi.StringArray{
						pulumi.String("someone@sample.com"),
					},
					Type: pulumi.String("BANDWIDTH_ALERT"),
				},
			},
			AllowedEmails: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
				pulumi.String("testagain@equinix.com"),
			},
			Ports: fabric.ServiceProfilePortArray{
				&fabric.ServiceProfilePortArgs{
					Uuid: pulumi.String("c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee"),
					Type: pulumi.String("XF_PORT"),
				},
			},
			AccessPointTypeConfigs: fabric.ServiceProfileAccessPointTypeConfigArray{
				&fabric.ServiceProfileAccessPointTypeConfigArgs{
					Type:                         pulumi.String(fabric.ProfileAccessPointTypeColo),
					AllowRemoteConnections:       pulumi.Bool(true),
					AllowCustomBandwidth:         pulumi.Bool(true),
					AllowBandwidthAutoApproval:   pulumi.Bool(false),
					ConnectionRedundancyRequired: pulumi.Bool(false),
					ConnectionLabel:              pulumi.String("Service Profile Tag1"),
					BandwidthAlertThreshold:      pulumi.Float64(10),
					SupportedBandwidths: pulumi.IntArray{
						pulumi.Int(100),
						pulumi.Int(500),
					},
				},
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
    var newServiceProfile = new Equinix.Fabric.ServiceProfile("newServiceProfile", new()
    {
        Description = "Service Profile for Receiving Connections",
        Name = "Name Of Business + Use Case Tag",
        Type = Equinix.Fabric.ProfileType.L2Profile,
        Visibility = Equinix.Fabric.ProfileVisibility.Public,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileNotificationArgs
            {
                Emails = new[]
                {
                    "someone@sample.com",
                },
                Type = "BANDWIDTH_ALERT",
            },
        },
        AllowedEmails = new[]
        {
            "test@equinix.com",
            "testagain@equinix.com",
        },
        Ports = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfilePortArgs
            {
                Uuid = "c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee",
                Type = "XF_PORT",
            },
        },
        AccessPointTypeConfigs = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigArgs
            {
                Type = Equinix.Fabric.ProfileAccessPointType.Colo,
                AllowRemoteConnections = true,
                AllowCustomBandwidth = true,
                AllowBandwidthAutoApproval = false,
                ConnectionRedundancyRequired = false,
                ConnectionLabel = "Service Profile Tag1",
                BandwidthAlertThreshold = 10,
                SupportedBandwidths = new[]
                {
                    100,
                    500,
                },
            },
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.ServiceProfile;
import com.pulumi.equinix.fabric.ServiceProfileArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfilePortArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
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
        var newServiceProfile = new ServiceProfile("newServiceProfile", ServiceProfileArgs.builder()
            .description("Service Profile for Receiving Connections")
            .name("Name Of Business + Use Case Tag")
            .type("L2_PROFILE")
            .visibility("PUBLIC")
            .notifications(ServiceProfileNotificationArgs.builder()
                .emails("someone@sample.com")
                .type("BANDWIDTH_ALERT")
                .build())
            .allowedEmails(            
                "test@equinix.com",
                "testagain@equinix.com")
            .ports(ServiceProfilePortArgs.builder()
                .uuid("c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee")
                .type("XF_PORT")
                .build())
            .accessPointTypeConfigs(ServiceProfileAccessPointTypeConfigArgs.builder()
                .type("COLO")
                .allowRemoteConnections(true)
                .allowCustomBandwidth(true)
                .allowBandwidthAutoApproval(false)
                .connectionRedundancyRequired(false)
                .connectionLabel("Service Profile Tag1")
                .bandwidthAlertThreshold(10)
                .supportedBandwidths(                
                    100,
                    500)
                .build())
            .build());

    }
}
```
```yaml
  newServiceProfile:
    type: equinix:fabric:ServiceProfile
    name: new_service_profile
    properties:
      description: Service Profile for Receiving Connections
      name: Name Of Business + Use Case Tag
      type: L2_PROFILE
      visibility: PUBLIC
      notifications:
        - emails:
            - someone@sample.com
          type: BANDWIDTH_ALERT
      allowedEmails:
        - test@equinix.com
        - testagain@equinix.com
      ports:
        - uuid: c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee
          type: XF_PORT
      accessPointTypeConfigs:
        - type: COLO
          allowRemoteConnections: true
          allowCustomBandwidth: true
          allowBandwidthAutoApproval: false
          connectionRedundancyRequired: false
          connectionLabel: Service Profile Tag1
          bandwidthAlertThreshold: 10
          supportedBandwidths:
            - 100
            - 500
```
{{% /example %}}
