## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    type: "VC_TOKEN",
    description: "Zside VD Service Token",
    expirationDateTime: "2025-01-18T06:43:49.986Z",
    serviceTokenConnections: [{
        type: "EVPL_VC",
        supportedBandwidths: [
            50,
            200,
            10000,
        ],
        zSides: [{
            accessPointSelectors: [{
                type: "VD",
                virtualDevice: {
                    type: "EDGE",
                    uuid: "<device_uuid>",
                },
                "interface": {
                    type: "NETWORK",
                },
            }],
        }],
    }],
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.fabric.ServiceToken("test",
    type="VC_TOKEN",
    description="Zside VD Service Token",
    expiration_date_time="2025-01-18T06:43:49.986Z",
    service_token_connections=[{
        "type": "EVPL_VC",
        "supported_bandwidths": [
            50,
            200,
            10000,
        ],
        "z_sides": [{
            "access_point_selectors": [{
                "type": "VD",
                "virtual_device": {
                    "type": "EDGE",
                    "uuid": "<device_uuid>",
                },
                "interface": {
                    "type": "NETWORK",
                },
            }],
        }],
    }],
    notifications=[{
        "type": "ALL",
        "emails": ["example@equinix.com"],
    }])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewServiceToken(ctx, "test", &fabric.ServiceTokenArgs{
			Type:               pulumi.String("VC_TOKEN"),
			Description:        pulumi.String("Zside VD Service Token"),
			ExpirationDateTime: pulumi.String("2025-01-18T06:43:49.986Z"),
			ServiceTokenConnections: fabric.ServiceTokenServiceTokenConnectionArray{
				&fabric.ServiceTokenServiceTokenConnectionArgs{
					Type: pulumi.String("EVPL_VC"),
					SupportedBandwidths: pulumi.IntArray{
						pulumi.Int(50),
						pulumi.Int(200),
						pulumi.Int(10000),
					},
					ZSides: fabric.ServiceTokenServiceTokenConnectionZSideArray{
						&fabric.ServiceTokenServiceTokenConnectionZSideArgs{
							AccessPointSelectors: fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArray{
								&fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArgs{
									Type: pulumi.String("VD"),
									VirtualDevice: &fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDeviceArgs{
										Type: pulumi.String("EDGE"),
										Uuid: pulumi.String("<device_uuid>"),
									},
									Interface: &fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterfaceArgs{
										Type: pulumi.String("NETWORK"),
									},
								},
							},
						},
					},
				},
			},
			Notifications: fabric.ServiceTokenNotificationArray{
				&fabric.ServiceTokenNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
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
    var test = new Equinix.Fabric.ServiceToken("test", new()
    {
        Type = "VC_TOKEN",
        Description = "Zside VD Service Token",
        ExpirationDateTime = "2025-01-18T06:43:49.986Z",
        ServiceTokenConnections = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionArgs
            {
                Type = "EVPL_VC",
                SupportedBandwidths = new[]
                {
                    50,
                    200,
                    10000,
                },
                ZSides = new[]
                {
                    new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideArgs
                    {
                        AccessPointSelectors = new[]
                        {
                            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArgs
                            {
                                Type = "VD",
                                VirtualDevice = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDeviceArgs
                                {
                                    Type = "EDGE",
                                    Uuid = "<device_uuid>",
                                },
                                Interface = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterfaceArgs
                                {
                                    Type = "NETWORK",
                                },
                            },
                        },
                    },
                },
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
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
import com.pulumi.equinix.fabric.ServiceToken;
import com.pulumi.equinix.fabric.ServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenServiceTokenConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenNotificationArgs;
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
        var test = new ServiceToken("test", ServiceTokenArgs.builder()
            .type("VC_TOKEN")
            .description("Zside VD Service Token")
            .expirationDateTime("2025-01-18T06:43:49.986Z")
            .serviceTokenConnections(ServiceTokenServiceTokenConnectionArgs.builder()
                .type("EVPL_VC")
                .supportedBandwidths(                
                    50,
                    200,
                    10000)
                .zSides(ServiceTokenServiceTokenConnectionZSideArgs.builder()
                    .accessPointSelectors(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArgs.builder()
                        .type("VD")
                        .virtualDevice(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDeviceArgs.builder()
                            .type("EDGE")
                            .uuid("<device_uuid>")
                            .build())
                        .interface_(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterfaceArgs.builder()
                            .type("NETWORK")
                            .build())
                        .build())
                    .build())
                .build())
            .notifications(ServiceTokenNotificationArgs.builder()
                .type("ALL")
                .emails("example@equinix.com")
                .build())
            .build());

    }
}
```
```yaml
resources:
  test:
    type: equinix:fabric:ServiceToken
    properties:
      type: VC_TOKEN
      description: Zside VD Service Token
      expirationDateTime: 2025-01-18T06:43:49.986Z
      serviceTokenConnections:
        - type: EVPL_VC
          supportedBandwidths:
            - 50
            - 200
            - 10000
          zSides:
            - accessPointSelectors:
                - type: VD
                  virtualDevice:
                    type: EDGE
                    uuid: <device_uuid>
                  interface:
                    type: NETWORK
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
```
{{% /example %}}
