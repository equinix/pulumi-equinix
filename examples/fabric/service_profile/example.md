{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const speedInMbps = config.getNumber("speedInMbps") || 50;
const profile = new equinix.fabric.ServiceProfile("profile", {
    name: "FOO Cloud",
    description: "50 to 500 Mbps Hosted Connection to Foo Cloud",
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
            integrationId: "Foo-Connect-01",
            bandwidthFromApi: false,
        },
        connectionLabel: "Virtual Circuit Name",
        authenticationKey: {
            required: true,
            label: "FOO ACCOUNT ID",
        },
    }],
    account: {
        organizationName: "Foo",
        globalOrganizationName: "Foo Global",
    },
    metros: undefined,
    visibility: "PUBLIC",
    marketingInfo: {
        promotion: true,
    },
});
export const profileId = profile.id;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 50
profile = equinix.fabric.ServiceProfile("profile",
    name="FOO Cloud",
    description="50 to 500 Mbps Hosted Connection to Foo Cloud",
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
            integration_id="Foo-Connect-01",
            bandwidth_from_api=False,
        ),
        connection_label="Virtual Circuit Name",
        authentication_key=equinix.fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs(
            required=True,
            label="FOO ACCOUNT ID",
        ),
    )],
    account=equinix.fabric.ServiceProfileAccountArgs(
        organization_name="Foo",
        global_organization_name="Foo Global",
    ),
    metros=None,
    visibility="PUBLIC",
    marketing_info=equinix.fabric.ServiceProfileMarketingInfoArgs(
        promotion=True,
    ))
pulumi.export("profileId", profile.id)
```

{{% /choosable %}}

{{% choosable language go %}}

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
		speedInMbps := 50
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		profile, err := fabric.NewServiceProfile(ctx, "profile", &fabric.ServiceProfileArgs{
			Name:        pulumi.String("FOO Cloud"),
			Description: pulumi.String("50 to 500 Mbps Hosted Connection to Foo Cloud"),
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
						IntegrationId:    pulumi.String("Foo-Connect-01"),
						BandwidthFromApi: pulumi.Bool(false),
					},
					ConnectionLabel: pulumi.String("Virtual Circuit Name"),
					AuthenticationKey: &fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs{
						Required: pulumi.Bool(true),
						Label:    pulumi.String("FOO ACCOUNT ID"),
					},
				},
			},
			Account: &fabric.ServiceProfileAccountArgs{
				OrganizationName:       pulumi.String("Foo"),
				GlobalOrganizationName: pulumi.String("Foo Global"),
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

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var speedInMbps = config.GetNumber("speedInMbps") ?? 50;
    var profile = new Equinix.Fabric.ServiceProfile("profile", new()
    {
        Name = "FOO Cloud",
        Description = "50 to 500 Mbps Hosted Connection to Foo Cloud",
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
                    IntegrationId = "Foo-Connect-01",
                    BandwidthFromApi = false,
                },
                ConnectionLabel = "Virtual Circuit Name",
                AuthenticationKey = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs
                {
                    Required = true,
                    Label = "FOO ACCOUNT ID",
                },
            },
        },
        Account = new Equinix.Fabric.Inputs.ServiceProfileAccountArgs
        {
            OrganizationName = "Foo",
            GlobalOrganizationName = "Foo Global",
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

{{% /choosable %}}

{{% choosable language java %}}

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
        final var config = ctx.config();
        final var speedInMbps = config.get("speedInMbps").orElse(50);
        var profile = new ServiceProfile("profile", ServiceProfileArgs.builder()        
            .name("FOO Cloud")
            .description("50 to 500 Mbps Hosted Connection to Foo Cloud")
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
                    .integrationId("Foo-Connect-01")
                    .bandwidthFromApi(false)
                    .build())
                .connectionLabel("Virtual Circuit Name")
                .authenticationKey(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs.builder()
                    .required(true)
                    .label("FOO ACCOUNT ID")
                    .build())
                .build())
            .account(ServiceProfileAccountArgs.builder()
                .organizationName("Foo")
                .globalOrganizationName("Foo Global")
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

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  speedInMbps:
    type: integer
    default: 50
resources:
  profile:
    type: equinix:fabric:ServiceProfile
    properties:
      name: FOO Cloud
      description: 50 to 500 Mbps Hosted Connection to Foo Cloud
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
          integrationId: Foo-Connect-01
          bandwidthFromApi: false
        connectionLabel: Virtual Circuit Name
        authenticationKey:
          required: true
          label: FOO ACCOUNT ID
      account:
        organizationName: Foo
        globalOrganizationName: Foo Global
      metros:
      visibility: PUBLIC
      marketingInfo:
        promotion: true
outputs:
  profileId: ${profile.id}
```

{{% /choosable %}}
