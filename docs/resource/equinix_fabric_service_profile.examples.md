## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const profile = new equinix.fabric.ServiceProfile("profile", {
    name: "Example Cloud Provider",
    description: "50 to 500 Mbps Hosted Connection to Example Cloud",
    type: "L2_PROFILE",
    accessPointTypeConfigs: [{
        type: "COLO",
        supportedBandwidths: [
            50,
            100,
            200,
            500,
        ],
        allowRemoteConnections: true,
        allowCustomBandwidth: false,
        allowBandwidthAutoApproval: false,
        linkProtocolConfig: {
            encapsulationStrategy: "CTAGED",
            reuseVlanSTag: false,
            encapsulation: "DOT1Q",
        },
        enableAutoGenerateServiceKey: "false,",
        connectionRedundancyRequired: "false,",
        apiConfig: {
            apiAvailable: true,
            integrationId: "Example-Connect-01",
            bandwidthFromApi: false,
        },
        connectionLabel: "Virtual Circuit Name",
        authenticationKey: {
            required: true,
            label: "Example ACCOUNT ID",
        },
    }],
    account: {
        organizationName: "Example Cloud",
        globalOrganizationName: "Example Global",
    },
    metros: undefined,
    visibility: "PUBLIC",
    marketingInfo: {
        promotion: true,
    },
});
export const profileId = profile.id;
```
```python
import pulumi
import pulumi_equinix as equinix

profile = equinix.fabric.ServiceProfile("profile",
    name="Example Cloud Provider",
    description="50 to 500 Mbps Hosted Connection to Example Cloud",
    type="L2_PROFILE",
    access_point_type_configs=[equinix.fabric.ServiceProfileAccessPointTypeConfigArgs(
        type="COLO",
        supported_bandwidths=[
            50,
            100,
            200,
            500,
        ],
        allow_remote_connections=True,
        allow_custom_bandwidth=False,
        allow_bandwidth_auto_approval=False,
        link_protocol_config=equinix.fabric.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs(
            encapsulation_strategy="CTAGED",
            reuse_vlan_s_tag=False,
            encapsulation="DOT1Q",
        ),
        enable_auto_generate_service_key="false,",
        connection_redundancy_required="false,",
        api_config=equinix.fabric.ServiceProfileAccessPointTypeConfigApiConfigArgs(
            api_available=True,
            integration_id="Example-Connect-01",
            bandwidth_from_api=False,
        ),
        connection_label="Virtual Circuit Name",
        authentication_key=equinix.fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs(
            required=True,
            label="Example ACCOUNT ID",
        ),
    )],
    account=equinix.fabric.ServiceProfileAccountArgs(
        organization_name="Example Cloud",
        global_organization_name="Example Global",
    ),
    metros=None,
    visibility="PUBLIC",
    marketing_info=equinix.fabric.ServiceProfileMarketingInfoArgs(
        promotion=True,
    ))
pulumi.export("profileId", profile.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		profile, err := fabric.NewServiceProfile(ctx, "profile", &fabric.ServiceProfileArgs{
			Name:        pulumi.String("Example Cloud Provider"),
			Description: pulumi.String("50 to 500 Mbps Hosted Connection to Example Cloud"),
			Type:        pulumi.String("L2_PROFILE"),
			AccessPointTypeConfigs: fabric.ServiceProfileAccessPointTypeConfigArray{
				&fabric.ServiceProfileAccessPointTypeConfigArgs{
					Type: pulumi.String("COLO"),
					SupportedBandwidths: pulumi.IntArray{
						pulumi.Int(50),
						pulumi.Int(100),
						pulumi.Int(200),
						pulumi.Int(500),
					},
					AllowRemoteConnections:     pulumi.Bool(true),
					AllowCustomBandwidth:       pulumi.Bool(false),
					AllowBandwidthAutoApproval: pulumi.Bool(false),
					LinkProtocolConfig: &fabric.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs{
						EncapsulationStrategy: pulumi.String("CTAGED"),
						ReuseVlanSTag:         pulumi.Bool(false),
						Encapsulation:         pulumi.String("DOT1Q"),
					},
					EnableAutoGenerateServiceKey: pulumi.Bool("false,"),
					ConnectionRedundancyRequired: pulumi.Bool("false,"),
					ApiConfig: &fabric.ServiceProfileAccessPointTypeConfigApiConfigArgs{
						ApiAvailable:     pulumi.Bool(true),
						IntegrationId:    pulumi.String("Example-Connect-01"),
						BandwidthFromApi: pulumi.Bool(false),
					},
					ConnectionLabel: pulumi.String("Virtual Circuit Name"),
					AuthenticationKey: &fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs{
						Required: pulumi.Bool(true),
						Label:    pulumi.String("Example ACCOUNT ID"),
					},
				},
			},
			Account: &fabric.ServiceProfileAccountArgs{
				OrganizationName:       pulumi.String("Example Cloud"),
				GlobalOrganizationName: pulumi.String("Example Global"),
			},
			Metros:     nil,
			Visibility: pulumi.String("PUBLIC"),
			MarketingInfo: &fabric.ServiceProfileMarketingInfoArgs{
				Promotion: pulumi.Bool(true),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("profileId", profile.ID())
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
    var profile = new Equinix.Fabric.ServiceProfile("profile", new()
    {
        Name = "Example Cloud Provider",
        Description = "50 to 500 Mbps Hosted Connection to Example Cloud",
        Type = "L2_PROFILE",
        AccessPointTypeConfigs = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigArgs
            {
                Type = "COLO",
                SupportedBandwidths = new[]
                {
                    50,
                    100,
                    200,
                    500,
                },
                AllowRemoteConnections = true,
                AllowCustomBandwidth = false,
                AllowBandwidthAutoApproval = false,
                LinkProtocolConfig = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs
                {
                    EncapsulationStrategy = "CTAGED",
                    ReuseVlanSTag = false,
                    Encapsulation = "DOT1Q",
                },
                EnableAutoGenerateServiceKey = "false,",
                ConnectionRedundancyRequired = "false,",
                ApiConfig = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigApiConfigArgs
                {
                    ApiAvailable = true,
                    IntegrationId = "Example-Connect-01",
                    BandwidthFromApi = false,
                },
                ConnectionLabel = "Virtual Circuit Name",
                AuthenticationKey = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs
                {
                    Required = true,
                    Label = "Example ACCOUNT ID",
                },
            },
        },
        Account = new Equinix.Fabric.Inputs.ServiceProfileAccountArgs
        {
            OrganizationName = "Example Cloud",
            GlobalOrganizationName = "Example Global",
        },
        Metros = null,
        Visibility = "PUBLIC",
        MarketingInfo = new Equinix.Fabric.Inputs.ServiceProfileMarketingInfoArgs
        {
            Promotion = true,
        },
    });

    return new Dictionary<string, object?>
    {
        ["profileId"] = profile.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.ServiceProfile;
import com.pulumi.equinix.fabric.ServiceProfileArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigApiConfigArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccountArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileMarketingInfoArgs;
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
        var profile = new ServiceProfile("profile", ServiceProfileArgs.builder()        
            .name("Example Cloud Provider")
            .description("50 to 500 Mbps Hosted Connection to Example Cloud")
            .type("L2_PROFILE")
            .accessPointTypeConfigs(ServiceProfileAccessPointTypeConfigArgs.builder()
                .type("COLO")
                .supportedBandwidths(                
                    50,
                    100,
                    200,
                    500)
                .allowRemoteConnections(true)
                .allowCustomBandwidth(false)
                .allowBandwidthAutoApproval(false)
                .linkProtocolConfig(ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs.builder()
                    .encapsulationStrategy("CTAGED")
                    .reuseVlanSTag(false)
                    .encapsulation("DOT1Q")
                    .build())
                .enableAutoGenerateServiceKey("false,")
                .connectionRedundancyRequired("false,")
                .apiConfig(ServiceProfileAccessPointTypeConfigApiConfigArgs.builder()
                    .apiAvailable(true)
                    .integrationId("Example-Connect-01")
                    .bandwidthFromApi(false)
                    .build())
                .connectionLabel("Virtual Circuit Name")
                .authenticationKey(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs.builder()
                    .required(true)
                    .label("Example ACCOUNT ID")
                    .build())
                .build())
            .account(ServiceProfileAccountArgs.builder()
                .organizationName("Example Cloud")
                .globalOrganizationName("Example Global")
                .build())
            .metros(null)
            .visibility("PUBLIC")
            .marketingInfo(ServiceProfileMarketingInfoArgs.builder()
                .promotion(true)
                .build())
            .build());

        ctx.export("profileId", profile.id());
    }
}
```
```yaml
resources:
  profile:
    type: equinix:fabric:ServiceProfile
    properties:
      name: Example Cloud Provider
      description: 50 to 500 Mbps Hosted Connection to Example Cloud
      type: L2_PROFILE
      accessPointTypeConfigs:
      - type: COLO
        supportedBandwidths: [ 50, 100, 200, 500]
        allowRemoteConnections: true
        allowCustomBandwidth: false
        allowBandwidthAutoApproval: false
        linkProtocolConfig:
          encapsulationStrategy: CTAGED
          reuseVlanSTag: false
          encapsulation: DOT1Q
        enableAutoGenerateServiceKey: false,
        connectionRedundancyRequired: false,
        apiConfig:
          apiAvailable: true
          integrationId: Example-Connect-01
          bandwidthFromApi: false
        connectionLabel: Virtual Circuit Name
        authenticationKey:
          required: true
          label: Example ACCOUNT ID
      account:
        organizationName: Example Cloud
        globalOrganizationName: Example Global
      metros:
      visibility: PUBLIC
      marketingInfo:
        promotion: true
outputs:
  profileId: ${profile.id}
```
{{% /example %}}

