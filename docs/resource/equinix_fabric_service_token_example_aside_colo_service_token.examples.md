## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    type: "VC_TOKEN",
    description: "Aside COLO Service Token",
    expirationDateTime: "2025-01-18T06:43:49.981Z",
    serviceTokenConnections: [{
        type: "EVPL_VC",
        bandwidthLimit: 1000,
        aSides: [{
            accessPointSelectors: [{
                type: "COLO",
                port: {
                    uuid: "<port_uuid>",
                },
                linkProtocol: {
                    type: "DOT1Q",
                    vlanTag: 2987,
                },
            }],
        }],
    }],
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.fabric.ServiceToken("test",
    type="VC_TOKEN",
    description="Aside COLO Service Token",
    expiration_date_time="2025-01-18T06:43:49.981Z",
    service_token_connections=[{
        "type": "EVPL_VC",
        "bandwidth_limit": 1000,
        "a_sides": [{
            "access_point_selectors": [{
                "type": "COLO",
                "port": {
                    "uuid": "<port_uuid>",
                },
                "link_protocol": {
                    "type": "DOT1Q",
                    "vlan_tag": 2987,
                },
            }],
        }],
    }],
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
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
			Description:        pulumi.String("Aside COLO Service Token"),
			ExpirationDateTime: pulumi.String("2025-01-18T06:43:49.981Z"),
			ServiceTokenConnections: fabric.ServiceTokenServiceTokenConnectionArray{
				&fabric.ServiceTokenServiceTokenConnectionArgs{
					Type:           pulumi.String("EVPL_VC"),
					BandwidthLimit: pulumi.Int(1000),
					ASides: fabric.ServiceTokenServiceTokenConnectionASideArray{
						&fabric.ServiceTokenServiceTokenConnectionASideArgs{
							AccessPointSelectors: fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArray{
								&fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs{
									Type: pulumi.String("COLO"),
									Port: &fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs{
										Uuid: pulumi.String("<port_uuid>"),
									},
									LinkProtocol: &fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs{
										Type:    pulumi.String("DOT1Q"),
										VlanTag: pulumi.Int(2987),
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
						pulumi.String("test1@equinix.com"),
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
        Description = "Aside COLO Service Token",
        ExpirationDateTime = "2025-01-18T06:43:49.981Z",
        ServiceTokenConnections = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionArgs
            {
                Type = "EVPL_VC",
                BandwidthLimit = 1000,
                ASides = new[]
                {
                    new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideArgs
                    {
                        AccessPointSelectors = new[]
                        {
                            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs
                            {
                                Type = "COLO",
                                Port = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs
                                {
                                    Uuid = "<port_uuid>",
                                },
                                LinkProtocol = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs
                                {
                                    Type = "DOT1Q",
                                    VlanTag = 2987,
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
                    "test1@equinix.com",
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
            .description("Aside COLO Service Token")
            .expirationDateTime("2025-01-18T06:43:49.981Z")
            .serviceTokenConnections(ServiceTokenServiceTokenConnectionArgs.builder()
                .type("EVPL_VC")
                .bandwidthLimit(1000)
                .aSides(ServiceTokenServiceTokenConnectionASideArgs.builder()
                    .accessPointSelectors(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs.builder()
                        .type("COLO")
                        .port(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs.builder()
                            .uuid("<port_uuid>")
                            .build())
                        .linkProtocol(ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs.builder()
                            .type("DOT1Q")
                            .vlanTag("2987")
                            .build())
                        .build())
                    .build())
                .build())
            .notifications(ServiceTokenNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
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
      description: Aside COLO Service Token
      expirationDateTime: 2025-01-18T06:43:49.981Z
      serviceTokenConnections:
        - type: EVPL_VC
          bandwidthLimit: 1000
          aSides:
            - accessPointSelectors:
                - type: COLO
                  port:
                    uuid: <port_uuid>
                  linkProtocol:
                    type: DOT1Q
                    vlanTag: '2987'
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
```
{{% /example %}}
