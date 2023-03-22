{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const speedInMbps = config.getNumber("speedInMbps") || 50;
const linkProtocolType = config.get("linkProtocolType") || "QINQ";
const linkProtocolStag = config.getNumber("linkProtocolStag") || 2019;
const linkProtocolCtag = config.getNumber("linkProtocolCtag") || 2112;
const portName = config.require("portName");
const serviceProfileName = config.get("serviceProfileName") || "AWS Direct Connect";
const serviceProfileRegion = config.get("serviceProfileRegion") || "us-west-1";
const serviceProfileMetro = config.get("serviceProfileMetro") || "SV";
const serviceProfileAuthKey = config.require("serviceProfileAuthKey");
const serviceProfileId = equinix.fabric.getServiceProfiles({
    filter: {
        property: "/name",
        operator: "=",
        values: [serviceProfileName],
    },
}).then(invoke => invoke.data?.uuid);
const portId = equinix.fabric.getPorts({
    filters: [{
        name: portName,
    }],
}).then(invoke => invoke.data?.uuid);
const colo2Aws = new equinix.fabric.Connection("colo2Aws", {
    name: "colo2Aws",
    type: "EVPL_VC",
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
    bandwidth: speedInMbps,
    redundancy: {
        priority: "PRIMARY",
    },
    aSide: {
        accessPoint: {
            type: "COLO",
            port: {
                uuid: portId,
            },
            linkProtocol: {
                type: linkProtocolType,
                vlanSTag: linkProtocolStag,
                vlanTag: linkProtocolCtag,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: "SP",
            authenticationKey: serviceProfileAuthKey,
            sellerRegion: serviceProfileRegion,
            profile: {
                type: "L2_PROFILE",
                uuid: serviceProfileId,
            },
            location: {
                metroCode: serviceProfileMetro,
            },
        },
    },
});
export const connectionId = pulumi.interpolate`http://${colo2Aws.id}`;
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
link_protocol_type = config.get("linkProtocolType")
if link_protocol_type is None:
    link_protocol_type = "QINQ"
link_protocol_stag = config.get_int("linkProtocolStag")
if link_protocol_stag is None:
    link_protocol_stag = 2019
link_protocol_ctag = config.get_int("linkProtocolCtag")
if link_protocol_ctag is None:
    link_protocol_ctag = 2112
port_name = config.require("portName")
service_profile_name = config.get("serviceProfileName")
if service_profile_name is None:
    service_profile_name = "AWS Direct Connect"
service_profile_region = config.get("serviceProfileRegion")
if service_profile_region is None:
    service_profile_region = "us-west-1"
service_profile_metro = config.get("serviceProfileMetro")
if service_profile_metro is None:
    service_profile_metro = "SV"
service_profile_auth_key = config.require("serviceProfileAuthKey")
service_profile_id = equinix.fabric.get_service_profiles(filter=equinix.fabric.GetServiceProfilesFilterArgs(
    property="/name",
    operator="=",
    values=[service_profile_name],
)).data.uuid
port_id = equinix.fabric.get_ports(filters=[equinix.fabric.GetPortsFilterArgs(
    name=port_name,
)]).data.uuid
colo2_aws = equinix.fabric.Connection("colo2Aws",
    name="colo2Aws",
    type="EVPL_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type="ALL",
        emails=["example@equinix.com"],
    )],
    bandwidth=speed_in_mbps,
    redundancy=equinix.fabric.ConnectionRedundancyArgs(
        priority="PRIMARY",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="COLO",
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid=port_id,
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type=link_protocol_type,
                vlan_s_tag=link_protocol_stag,
                vlan_tag=link_protocol_ctag,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type="SP",
            authentication_key=service_profile_auth_key,
            seller_region=service_profile_region,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type="L2_PROFILE",
                uuid=service_profile_id,
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=service_profile_metro,
            ),
        ),
    ))
pulumi.export("connectionId", colo2_aws.id.apply(lambda id: f"http://{id}"))
```

{{% /choosable %}}

{{% choosable language go %}}

```go
package main

import (
	"fmt"

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
		linkProtocolType := "QINQ"
		if param := cfg.Get("linkProtocolType"); param != "" {
			linkProtocolType = param
		}
		linkProtocolStag := 2019
		if param := cfg.GetInt("linkProtocolStag"); param != 0 {
			linkProtocolStag = param
		}
		linkProtocolCtag := 2112
		if param := cfg.GetInt("linkProtocolCtag"); param != 0 {
			linkProtocolCtag = param
		}
		portName := cfg.Require("portName")
		serviceProfileName := "AWS Direct Connect"
		if param := cfg.Get("serviceProfileName"); param != "" {
			serviceProfileName = param
		}
		serviceProfileRegion := "us-west-1"
		if param := cfg.Get("serviceProfileRegion"); param != "" {
			serviceProfileRegion = param
		}
		serviceProfileMetro := "SV"
		if param := cfg.Get("serviceProfileMetro"); param != "" {
			serviceProfileMetro = param
		}
		serviceProfileAuthKey := cfg.Require("serviceProfileAuthKey")
		serviceProfileId := fabric.GetServiceProfiles(ctx, &fabric.GetServiceProfilesArgs{
			Filter: fabric.GetServiceProfilesFilter{
				Property: pulumi.StringRef("/name"),
				Operator: pulumi.StringRef("="),
				Values: []string{
					serviceProfileName,
				},
			},
		}, nil).Data.Uuid
		portId := fabric.GetPorts(ctx, &fabric.GetPortsArgs{
			Filters: []fabric.GetPortsFilter{
				{
					Name: pulumi.StringRef(portName),
				},
			},
		}, nil).Data.Uuid
		colo2Aws, err := fabric.NewConnection(ctx, "colo2Aws", &fabric.ConnectionArgs{
			Name: pulumi.String("colo2Aws"),
			Type: pulumi.String("EVPL_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(speedInMbps),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("COLO"),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: fabric.GetPortsDatum(portId),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(linkProtocolType),
						VlanSTag: pulumi.Int(linkProtocolStag),
						VlanTag:  pulumi.Int(linkProtocolCtag),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String("SP"),
					AuthenticationKey: pulumi.String(serviceProfileAuthKey),
					SellerRegion:      pulumi.String(serviceProfileRegion),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String("L2_PROFILE"),
						Uuid: fabric.GetServiceProfilesDatum(serviceProfileId),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(serviceProfileMetro),
					},
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionId", colo2Aws.ID().ApplyT(func(id string) (string, error) {
			return fmt.Sprintf("http://%v", id), nil
		}).(pulumi.StringOutput))
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
    var linkProtocolType = config.Get("linkProtocolType") ?? "QINQ";
    var linkProtocolStag = config.GetNumber("linkProtocolStag") ?? 2019;
    var linkProtocolCtag = config.GetNumber("linkProtocolCtag") ?? 2112;
    var portName = config.Require("portName");
    var serviceProfileName = config.Get("serviceProfileName") ?? "AWS Direct Connect";
    var serviceProfileRegion = config.Get("serviceProfileRegion") ?? "us-west-1";
    var serviceProfileMetro = config.Get("serviceProfileMetro") ?? "SV";
    var serviceProfileAuthKey = config.Require("serviceProfileAuthKey");
    var serviceProfileId = Equinix.Fabric.GetServiceProfiles.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetServiceProfilesFilterInputArgs
        {
            Property = "/name",
            Operator = "=",
            Values = new[]
            {
                serviceProfileName,
            },
        },
    }).Apply(invoke => invoke.Data?.Uuid);

    var portId = Equinix.Fabric.GetPorts.Invoke(new()
    {
        Filters = new[]
        {
            new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
            {
                Name = portName,
            },
        },
    }).Apply(invoke => invoke.Data?.Uuid);

    var colo2Aws = new Equinix.Fabric.Connection("colo2Aws", new()
    {
        Name = "colo2Aws",
        Type = "EVPL_VC",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                },
            },
        },
        Bandwidth = speedInMbps,
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "COLO",
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = portId,
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = linkProtocolType,
                    VlanSTag = linkProtocolStag,
                    VlanTag = linkProtocolCtag,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = "SP",
                AuthenticationKey = serviceProfileAuthKey,
                SellerRegion = serviceProfileRegion,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = "L2_PROFILE",
                    Uuid = serviceProfileId,
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = serviceProfileMetro,
                },
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["connectionId"] = colo2Aws.Id.Apply(id => $"http://{id}"),
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
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
        final var linkProtocolType = config.get("linkProtocolType").orElse("QINQ");
        final var linkProtocolStag = config.get("linkProtocolStag").orElse(2019);
        final var linkProtocolCtag = config.get("linkProtocolCtag").orElse(2112);
        final var portName = config.get("portName");
        final var serviceProfileName = config.get("serviceProfileName").orElse("AWS Direct Connect");
        final var serviceProfileRegion = config.get("serviceProfileRegion").orElse("us-west-1");
        final var serviceProfileMetro = config.get("serviceProfileMetro").orElse("SV");
        final var serviceProfileAuthKey = config.get("serviceProfileAuthKey");
        final var serviceProfileId = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
            .filter(GetServiceProfilesFilterArgs.builder()
                .property("/name")
                .operator("=")
                .values(serviceProfileName)
                .build())
            .build()).data().uuid();

        final var portId = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filters(GetPortsFilterArgs.builder()
                .name(portName)
                .build())
            .build()).data().uuid();

        var colo2Aws = new Connection("colo2Aws", ConnectionArgs.builder()        
            .name("colo2Aws")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("example@equinix.com")
                .build())
            .bandwidth(speedInMbps)
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid(portId)
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type(linkProtocolType)
                        .vlanSTag(linkProtocolStag)
                        .vlanTag(linkProtocolCtag)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey(serviceProfileAuthKey)
                    .sellerRegion(serviceProfileRegion)
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid(serviceProfileId)
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode(serviceProfileMetro)
                        .build())
                    .build())
                .build())
            .build());

        ctx.export("connectionId", colo2Aws.id().applyValue(id -> String.format("http://%s", id)));
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
  # notificationEmails:
  #   type: array
    # items:
    #   type: string
    # default:
    #   - "example@equinix.com"
  linkProtocolType:
    type: string
    default: QINQ
  linkProtocolStag:
    type: integer
    default: 2019
  linkProtocolCtag:
    type: integer
    default: 2112
  portName:
    type: string
  serviceProfileName:
    type: string
    default: AWS Direct Connect
  serviceProfileRegion:
    type: string
    default: us-west-1
  serviceProfileMetro:
    type: string
    default: SV
  serviceProfileAuthKey:
    type: string
variables:
  serviceProfileId:
    fn::invoke:
      function: equinix:fabric:getServiceProfiles
      arguments:
        filter:
          property: "/name"
          operator: "="
          values:
          - ${serviceProfileName}
      return: data.uuid
  portId:
    fn::invoke:
      function: equinix:fabric:getPorts
      arguments:
        filters:
        - name: ${portName}
      return: data.uuid
resources:
  colo2Aws:
    type: equinix:fabric:Connection
    properties:
      name: colo2Aws
      type: EVPL_VC
      notifications:
      - type: ALL
        # emails: ${notificationEmails}
        emails:
        - example@equinix.com
      bandwidth: ${speedInMbps}
      redundancy:
        priority: PRIMARY
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: ${portId}
          linkProtocol:
            type: ${linkProtocolType}
            vlanSTag: ${linkProtocolStag}
            vlanTag: ${linkProtocolCtag}
      zSide:
        accessPoint:
          type: SP
          authenticationKey: ${serviceProfileAuthKey}
          sellerRegion: ${serviceProfileRegion}
          profile:
            type: L2_PROFILE
            uuid: ${serviceProfileId}
          location:
            metroCode: ${serviceProfileMetro}
outputs:
  connectionId: http://${colo2Aws.id}
```

{{% /choosable %}}
