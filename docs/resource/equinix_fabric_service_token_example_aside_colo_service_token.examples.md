## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    serviceTokenConnections: [{
        aSides: [{
            accessPointSelectors: [{
                port: {
                    uuid: "<port_uuid>",
                },
                linkProtocol: {
                    type: "DOT1Q",
                    vlanTag: 2987,
                },
                type: "COLO",
            }],
        }],
        type: "EVPL_VC",
        bandwidthLimit: 1000,
    }],
    type: "VC_TOKEN",
    description: "Aside COLO Service Token",
    expirationDateTime: "2025-01-18T06:43:49.981Z",
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.fabric.ServiceToken("test",
    notifications=[{
        "type": "ALL",
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    service_token_connections=[{
        "a_sides": [{
            "access_point_selectors": [{
                "port": {
                    "uuid": "<port_uuid>",
                },
                "link_protocol": {
                    "type": "DOT1Q",
                    "vlan_tag": 2987,
                },
                "type": "COLO",
            }],
        }],
        "type": "EVPL_VC",
        "bandwidth_limit": 1000,
    }],
    type="VC_TOKEN",
    description="Aside COLO Service Token",
    expiration_date_time="2025-01-18T06:43:49.981Z")
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
			Notifications: fabric.ServiceTokenNotificationArray{
				&fabric.ServiceTokenNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			ServiceTokenConnections: fabric.ServiceTokenServiceTokenConnectionArray{
				&fabric.ServiceTokenServiceTokenConnectionArgs{
					ASides: fabric.ServiceTokenServiceTokenConnectionASideArray{
						&fabric.ServiceTokenServiceTokenConnectionASideArgs{
							AccessPointSelectors: fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArray{
								&fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs{
									Port: &fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs{
										Uuid: pulumi.String("<port_uuid>"),
									},
									LinkProtocol: &fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs{
										Type:    pulumi.String("DOT1Q"),
										VlanTag: pulumi.Int(2987),
									},
									Type: pulumi.String("COLO"),
								},
							},
						},
					},
					Type:           pulumi.String("EVPL_VC"),
					BandwidthLimit: pulumi.Int(1000),
				},
			},
			Type:               pulumi.String("VC_TOKEN"),
			Description:        pulumi.String("Aside COLO Service Token"),
			ExpirationDateTime: pulumi.String("2025-01-18T06:43:49.981Z"),
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
        ServiceTokenConnections = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionArgs
            {
                ASides = new[]
                {
                    new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideArgs
                    {
                        AccessPointSelectors = new[]
                        {
                            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs
                            {
                                Port = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs
                                {
                                    Uuid = "<port_uuid>",
                                },
                                LinkProtocol = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs
                                {
                                    Type = "DOT1Q",
                                    VlanTag = 2987,
                                },
                                Type = "COLO",
                            },
                        },
                    },
                },
                Type = "EVPL_VC",
                BandwidthLimit = 1000,
            },
        },
        Type = "VC_TOKEN",
        Description = "Aside COLO Service Token",
        ExpirationDateTime = "2025-01-18T06:43:49.981Z",
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
import com.pulumi.equinix.fabric.inputs.ServiceTokenNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenServiceTokenConnectionArgs;
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
            .notifications(ServiceTokenNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .serviceTokenConnections(ServiceTokenServiceTokenConnectionArgs.builder()
                .aSides(ServiceTokenServiceTokenConnectionASideArgs.builder()
                    .accessPointSelectors(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs.builder()
                        .port(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs.builder()
                            .uuid("<port_uuid>")
                            .build())
                        .linkProtocol(ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs.builder()
                            .type("DOT1Q")
                            .vlanTag(2987)
                            .build())
                        .type("COLO")
                        .build())
                    .build())
                .type("EVPL_VC")
                .bandwidthLimit(1000)
                .build())
            .type("VC_TOKEN")
            .description("Aside COLO Service Token")
            .expirationDateTime("2025-01-18T06:43:49.981Z")
            .build());

    }
}
```
```yaml
resources:
  test:
    type: equinix:fabric:ServiceToken
    properties:
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      serviceTokenConnections:
        - aSides:
            - accessPointSelectors:
                - port:
                    uuid: <port_uuid>
                  linkProtocol:
                    type: DOT1Q
                    vlanTag: '2987'
                  type: COLO
          type: EVPL_VC
          bandwidthLimit: 1000
      type: VC_TOKEN
      description: Aside COLO Service Token
      expirationDateTime: 2025-01-18T06:43:49.981Z
```
{{% /example %}}
