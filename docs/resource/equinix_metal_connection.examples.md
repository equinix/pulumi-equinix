## Example Usage

{{% example %}}
### example fabric billed metal from fabric port
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const aSide = equinix.fabric.getPortsOutput({
    filter: {
        name: "<name_of_port||port_prefix>",
    },
});
const example = new equinix.metal.Vlan("example", {
    projectId: "<metal_project_id>",
    metro: "FR",
});
const exampleInterconnection = new equinix.metal.Interconnection("exampleInterconnection", {
    name: "tf-metal-from-port",
    projectId: "<metal_project_id>",
    type: "shared",
    redundancy: "primary",
    metro: "FR",
    speed: "200Mbps",
    serviceTokenType: "z_side",
    contactEmail: "username@example.com",
    vlans: [example.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-from-port",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 200,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    order: {
        purchaseOrderNumber: "1-323292",
    },
    project: {
        projectId: "<fabric_project_id>",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: aSide.apply(aSide => aSide.data?.[0]?.uuid),
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 1234,
            },
        },
    },
    zSide: {
        serviceToken: {
            uuid: exampleInterconnection.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

a_side = equinix.fabric.get_ports_output(filter={
    "name": "<name_of_port||port_prefix>",
})
example = equinix.metal.Vlan("example",
    project_id="<metal_project_id>",
    metro="FR")
example_interconnection = equinix.metal.Interconnection("exampleInterconnection",
    name="tf-metal-from-port",
    project_id="<metal_project_id>",
    type="shared",
    redundancy="primary",
    metro="FR",
    speed="200Mbps",
    service_token_type="z_side",
    contact_email="username@example.com",
    vlans=[example.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-from-port",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=200,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    order={
        "purchase_order_number": "1-323292",
    },
    project={
        "project_id": "<fabric_project_id>",
    },
    a_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": a_side.data[0].uuid,
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 1234,
            },
        },
    },
    z_side={
        "service_token": {
            "uuid": example_interconnection.service_tokens[0].id,
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		aSide := fabric.GetPortsOutput(ctx, fabric.GetPortsOutputArgs{
			Filter: &fabric.GetPortsFilterArgs{
				Name: pulumi.String("<name_of_port||port_prefix>"),
			},
		}, nil)
		example, err := metal.NewVlan(ctx, "example", &metal.VlanArgs{
			ProjectId: pulumi.String("<metal_project_id>"),
			Metro:     pulumi.String("FR"),
		})
		if err != nil {
			return err
		}
		exampleInterconnection, err := metal.NewInterconnection(ctx, "exampleInterconnection", &metal.InterconnectionArgs{
			Name:             pulumi.String("tf-metal-from-port"),
			ProjectId:        pulumi.String("<metal_project_id>"),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String("FR"),
			Speed:            pulumi.String("200Mbps"),
			ServiceTokenType: pulumi.String("z_side"),
			ContactEmail:     pulumi.String("username@example.com"),
			Vlans: pulumi.IntArray{
				example.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name:      pulumi.String("tf-metal-from-port"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(200),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("username@example.com"),
					},
				},
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.String("<fabric_project_id>"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: aSide.ApplyT(func(aSide fabric.GetPortsResult) (*string, error) {
							return &aSide.Data[0].Uuid, nil
						}).(pulumi.StringPtrOutput),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:    pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanTag: pulumi.Int(1234),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				ServiceToken: &fabric.ConnectionZSideServiceTokenArgs{
					Uuid: exampleInterconnection.ServiceTokens.ApplyT(func(serviceTokens []metal.InterconnectionServiceToken) (*string, error) {
						return &serviceTokens[0].Id, nil
					}).(pulumi.StringPtrOutput),
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
    var aSide = Equinix.Fabric.GetPorts.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
        {
            Name = "<name_of_port||port_prefix>",
        },
    });

    var example = new Equinix.Metal.Vlan("example", new()
    {
        ProjectId = "<metal_project_id>",
        Metro = "FR",
    });

    var exampleInterconnection = new Equinix.Metal.Interconnection("exampleInterconnection", new()
    {
        Name = "tf-metal-from-port",
        ProjectId = "<metal_project_id>",
        Type = "shared",
        Redundancy = "primary",
        Metro = "FR",
        Speed = "200Mbps",
        ServiceTokenType = "z_side",
        ContactEmail = "username@example.com",
        Vlans = new[]
        {
            example.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-from-port",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 200,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "username@example.com",
                },
            },
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = "<fabric_project_id>",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = aSide.Apply(getPortsResult => getPortsResult.Data[0]?.Uuid),
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanTag = 1234,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionZSideServiceTokenArgs
            {
                Uuid = exampleInterconnection.ServiceTokens.Apply(serviceTokens => serviceTokens[0].Id),
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
import com.pulumi.equinix.fabric.FabricFunctions;
import com.pulumi.equinix.fabric.inputs.GetPortsArgs;
import com.pulumi.equinix.fabric.inputs.GetPortsFilterArgs;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideServiceTokenArgs;
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
        final var aSide = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filter(GetPortsFilterArgs.builder()
                .name("<name_of_port||port_prefix>")
                .build())
            .build());

        var example = new Vlan("example", VlanArgs.builder()
            .projectId("<metal_project_id>")
            .metro("FR")
            .build());

        var exampleInterconnection = new Interconnection("exampleInterconnection", InterconnectionArgs.builder()
            .name("tf-metal-from-port")
            .projectId("<metal_project_id>")
            .type("shared")
            .redundancy("primary")
            .metro("FR")
            .speed("200Mbps")
            .serviceTokenType("z_side")
            .contactEmail("username@example.com")
            .vlans(example.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-from-port")
            .type("EVPL_VC")
            .bandwidth(200)
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid(aSide.applyValue(_aSide -> _aSide.data()[0].uuid()))
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(1234)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .serviceToken(ConnectionZSideServiceTokenArgs.builder()
                    .uuid(exampleInterconnection.serviceTokens().applyValue(_serviceTokens -> _serviceTokens[0].id()))
                    .build())
                .build())
            .build());

    }
}
```
```yaml
resources:
  example:
    type: equinix:metal:Vlan
    properties:
      projectId: <metal_project_id>
      metro: FR
  exampleInterconnection:
    type: equinix:metal:Interconnection
    name: example
    properties:
      name: tf-metal-from-port
      projectId: <metal_project_id>
      type: shared
      redundancy: primary
      metro: FR
      speed: 200Mbps
      serviceTokenType: z_side
      contactEmail: username@example.com
      vlans:
        - ${example.vxlan}
  exampleConnection:
    type: equinix:fabric:Connection
    name: example
    properties:
      name: tf-metal-from-port
      type: EVPL_VC
      bandwidth: '200'
      notifications:
        - type: ALL
          emails:
            - username@example.com
      order:
        purchaseOrderNumber: 1-323292
      project:
        projectId: <fabric_project_id>
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: ${aSide.data[0].uuid}
          linkProtocol:
            type: DOT1Q
            vlanTag: 1234
      zSide:
        serviceToken:
          uuid: ${exampleInterconnection.serviceTokens[0].id}
variables:
  aSide:
    fn::invoke:
      function: equinix:fabric:getPorts
      arguments:
        filter:
          name: <name_of_port||port_prefix>
```
{{% /example %}}

{{% example %}}
### example fabric billed metal from fcr
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example1 = new equinix.metal.Vlan("example1", {
    projectId: "<metal_project_id>",
    metro: "SV",
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-metal-from-fcr",
    projectId: "<metal_project_id>",
    metro: "SV",
    redundancy: "primary",
    type: "shared_port_vlan",
    contactEmail: "username@example.com",
    speed: "200Mbps",
    vlans: [example1.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-from-fcr",
    type: "IP_VC",
    bandwidth: 200,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    project: {
        projectId: "<fabric_project_id>",
    },
    aSide: {
        accessPoint: {
            type: "CLOUD_ROUTER",
            router: {
                uuid: exampleEquinixFabricCloudRouter.id,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: "METAL_NETWORK",
            authenticationKey: example.authorizationCode,
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

example1 = equinix.metal.Vlan("example1",
    project_id="<metal_project_id>",
    metro="SV")
example = equinix.metal.Interconnection("example",
    name="tf-metal-from-fcr",
    project_id="<metal_project_id>",
    metro="SV",
    redundancy="primary",
    type="shared_port_vlan",
    contact_email="username@example.com",
    speed="200Mbps",
    vlans=[example1.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-from-fcr",
    type="IP_VC",
    bandwidth=200,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    project={
        "project_id": "<fabric_project_id>",
    },
    a_side={
        "access_point": {
            "type": "CLOUD_ROUTER",
            "router": {
                "uuid": example_equinix_fabric_cloud_router["id"],
            },
        },
    },
    z_side={
        "access_point": {
            "type": "METAL_NETWORK",
            "authentication_key": example.authorization_code,
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example1, err := metal.NewVlan(ctx, "example1", &metal.VlanArgs{
			ProjectId: pulumi.String("<metal_project_id>"),
			Metro:     pulumi.String("SV"),
		})
		if err != nil {
			return err
		}
		example, err := metal.NewInterconnection(ctx, "example", &metal.InterconnectionArgs{
			Name:         pulumi.String("tf-metal-from-fcr"),
			ProjectId:    pulumi.String("<metal_project_id>"),
			Metro:        pulumi.String("SV"),
			Redundancy:   pulumi.String("primary"),
			Type:         pulumi.String("shared_port_vlan"),
			ContactEmail: pulumi.String("username@example.com"),
			Speed:        pulumi.String("200Mbps"),
			Vlans: pulumi.IntArray{
				example1.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name:      pulumi.String("tf-metal-from-fcr"),
			Type:      pulumi.String("IP_VC"),
			Bandwidth: pulumi.Int(200),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("username@example.com"),
					},
				},
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.String("<fabric_project_id>"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("CLOUD_ROUTER"),
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.Any(exampleEquinixFabricCloudRouter.Id),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String("METAL_NETWORK"),
					AuthenticationKey: example.AuthorizationCode,
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
    var example1 = new Equinix.Metal.Vlan("example1", new()
    {
        ProjectId = "<metal_project_id>",
        Metro = "SV",
    });

    var example = new Equinix.Metal.Interconnection("example", new()
    {
        Name = "tf-metal-from-fcr",
        ProjectId = "<metal_project_id>",
        Metro = "SV",
        Redundancy = "primary",
        Type = "shared_port_vlan",
        ContactEmail = "username@example.com",
        Speed = "200Mbps",
        Vlans = new[]
        {
            example1.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-from-fcr",
        Type = "IP_VC",
        Bandwidth = 200,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "username@example.com",
                },
            },
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = "<fabric_project_id>",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "CLOUD_ROUTER",
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = exampleEquinixFabricCloudRouter.Id,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = "METAL_NETWORK",
                AuthenticationKey = example.AuthorizationCode,
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
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
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
        var example1 = new Vlan("example1", VlanArgs.builder()
            .projectId("<metal_project_id>")
            .metro("SV")
            .build());

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-metal-from-fcr")
            .projectId("<metal_project_id>")
            .metro("SV")
            .redundancy("primary")
            .type("shared_port_vlan")
            .contactEmail("username@example.com")
            .speed("200Mbps")
            .vlans(example1.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-from-fcr")
            .type("IP_VC")
            .bandwidth(200)
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid(exampleEquinixFabricCloudRouter.id())
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("METAL_NETWORK")
                    .authenticationKey(example.authorizationCode())
                    .build())
                .build())
            .build());

    }
}
```
```yaml
resources:
  example1:
    type: equinix:metal:Vlan
    properties:
      projectId: <metal_project_id>
      metro: SV
  example:
    type: equinix:metal:Interconnection
    properties:
      name: tf-metal-from-fcr
      projectId: <metal_project_id>
      metro: SV
      redundancy: primary
      type: shared_port_vlan
      contactEmail: username@example.com
      speed: 200Mbps
      vlans:
        - ${example1.vxlan}
  exampleConnection:
    type: equinix:fabric:Connection
    name: example
    properties:
      name: tf-metal-from-fcr
      type: IP_VC
      bandwidth: '200'
      notifications:
        - type: ALL
          emails:
            - username@example.com
      project:
        projectId: <fabric_project_id>
      aSide:
        accessPoint:
          type: CLOUD_ROUTER
          router:
            uuid: ${exampleEquinixFabricCloudRouter.id}
      zSide:
        accessPoint:
          type: METAL_NETWORK
          authenticationKey: ${example.authorizationCode}
```
{{% /example %}}

{{% example %}}
### example fabric billed metal from network edge
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.Vrf("example", {
    name: "tf-metal-from-ne",
    metro: "FR",
    localAsn: 65001,
    ipRanges: ["10.99.1.0/24"],
    projectId: test.id,
});
const exampleInterconnection = new equinix.metal.Interconnection("exampleInterconnection", {
    name: "tf-metal-from-ne",
    projectId: "<metal_project_id>",
    type: "shared",
    redundancy: "primary",
    metro: "FR",
    speed: "200Mbps",
    serviceTokenType: "z_side",
    contactEmail: "username@example.com",
    vrfs: [example.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-from-ne",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 200,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    order: {
        purchaseOrderNumber: "1-323292",
    },
    project: {
        projectId: "<fabric_project_id>",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: exampleEquinixNetworkDevice.id,
            },
        },
    },
    zSide: {
        serviceToken: {
            uuid: exampleInterconnection.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

example = equinix.metal.Vrf("example",
    name="tf-metal-from-ne",
    metro="FR",
    local_asn=65001,
    ip_ranges=["10.99.1.0/24"],
    project_id=test["id"])
example_interconnection = equinix.metal.Interconnection("exampleInterconnection",
    name="tf-metal-from-ne",
    project_id="<metal_project_id>",
    type="shared",
    redundancy="primary",
    metro="FR",
    speed="200Mbps",
    service_token_type="z_side",
    contact_email="username@example.com",
    vrfs=[example.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-from-ne",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=200,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    order={
        "purchase_order_number": "1-323292",
    },
    project={
        "project_id": "<fabric_project_id>",
    },
    a_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.VD,
            "virtual_device": {
                "type": "EDGE",
                "uuid": example_equinix_network_device["id"],
            },
        },
    },
    z_side={
        "service_token": {
            "uuid": example_interconnection.service_tokens[0].id,
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewVrf(ctx, "example", &metal.VrfArgs{
			Name:     pulumi.String("tf-metal-from-ne"),
			Metro:    pulumi.String("FR"),
			LocalAsn: pulumi.Int(65001),
			IpRanges: pulumi.StringArray{
				pulumi.String("10.99.1.0/24"),
			},
			ProjectId: pulumi.Any(test.Id),
		})
		if err != nil {
			return err
		}
		exampleInterconnection, err := metal.NewInterconnection(ctx, "exampleInterconnection", &metal.InterconnectionArgs{
			Name:             pulumi.String("tf-metal-from-ne"),
			ProjectId:        pulumi.String("<metal_project_id>"),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String("FR"),
			Speed:            pulumi.String("200Mbps"),
			ServiceTokenType: pulumi.String("z_side"),
			ContactEmail:     pulumi.String("username@example.com"),
			Vrfs: pulumi.StringArray{
				example.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name:      pulumi.String("tf-metal-from-ne"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(200),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("username@example.com"),
					},
				},
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.String("<fabric_project_id>"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.Any(exampleEquinixNetworkDevice.Id),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				ServiceToken: &fabric.ConnectionZSideServiceTokenArgs{
					Uuid: exampleInterconnection.ServiceTokens.ApplyT(func(serviceTokens []metal.InterconnectionServiceToken) (*string, error) {
						return &serviceTokens[0].Id, nil
					}).(pulumi.StringPtrOutput),
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
    var example = new Equinix.Metal.Vrf("example", new()
    {
        Name = "tf-metal-from-ne",
        Metro = "FR",
        LocalAsn = 65001,
        IpRanges = new[]
        {
            "10.99.1.0/24",
        },
        ProjectId = test.Id,
    });

    var exampleInterconnection = new Equinix.Metal.Interconnection("exampleInterconnection", new()
    {
        Name = "tf-metal-from-ne",
        ProjectId = "<metal_project_id>",
        Type = "shared",
        Redundancy = "primary",
        Metro = "FR",
        Speed = "200Mbps",
        ServiceTokenType = "z_side",
        ContactEmail = "username@example.com",
        Vrfs = new[]
        {
            example.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-from-ne",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 200,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "username@example.com",
                },
            },
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = "<fabric_project_id>",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = exampleEquinixNetworkDevice.Id,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionZSideServiceTokenArgs
            {
                Uuid = exampleInterconnection.ServiceTokens.Apply(serviceTokens => serviceTokens[0].Id),
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
import com.pulumi.equinix.metal.Vrf;
import com.pulumi.equinix.metal.VrfArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideServiceTokenArgs;
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
        var example = new Vrf("example", VrfArgs.builder()
            .name("tf-metal-from-ne")
            .metro("FR")
            .localAsn(65001)
            .ipRanges("10.99.1.0/24")
            .projectId(test.id())
            .build());

        var exampleInterconnection = new Interconnection("exampleInterconnection", InterconnectionArgs.builder()
            .name("tf-metal-from-ne")
            .projectId("<metal_project_id>")
            .type("shared")
            .redundancy("primary")
            .metro("FR")
            .speed("200Mbps")
            .serviceTokenType("z_side")
            .contactEmail("username@example.com")
            .vrfs(example.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-from-ne")
            .type("EVPL_VC")
            .bandwidth(200)
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid(exampleEquinixNetworkDevice.id())
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .serviceToken(ConnectionZSideServiceTokenArgs.builder()
                    .uuid(exampleInterconnection.serviceTokens().applyValue(_serviceTokens -> _serviceTokens[0].id()))
                    .build())
                .build())
            .build());

    }
}
```
```yaml
resources:
  example:
    type: equinix:metal:Vrf
    properties:
      name: tf-metal-from-ne
      metro: FR
      localAsn: '65001'
      ipRanges:
        - 10.99.1.0/24
      projectId: ${test.id}
  exampleInterconnection:
    type: equinix:metal:Interconnection
    name: example
    properties:
      name: tf-metal-from-ne
      projectId: <metal_project_id>
      type: shared
      redundancy: primary
      metro: FR
      speed: 200Mbps
      serviceTokenType: z_side
      contactEmail: username@example.com
      vrfs:
        - ${example.vxlan}
  exampleConnection:
    type: equinix:fabric:Connection
    name: example
    properties:
      name: tf-metal-from-ne
      type: EVPL_VC
      bandwidth: '200'
      notifications:
        - type: ALL
          emails:
            - username@example.com
      order:
        purchaseOrderNumber: 1-323292
      project:
        projectId: <fabric_project_id>
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: ${exampleEquinixNetworkDevice.id}
      zSide:
        serviceToken:
          uuid: ${exampleInterconnection.serviceTokens[0].id}
```
{{% /example %}}

{{% example %}}
### example metal billed metal to fabric port
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const aSide = equinix.fabric.getPortsOutput({
    filter: {
        name: "<name_of_port||port_prefix>",
    },
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-metal-2-port",
    projectId: "<metal_project_id>",
    type: "shared",
    redundancy: "redundant",
    metro: "FR",
    speed: "1Gbps",
    serviceTokenType: "a_side",
    contactEmail: "username@example.com",
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-2-port",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    project: {
        projectId: "<fabric_project_id>",
    },
    bandwidth: 100,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        serviceToken: {
            uuid: example.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: aSide.apply(aSide => aSide.data?.[0]?.uuid),
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 1234,
            },
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

a_side = equinix.fabric.get_ports_output(filter={
    "name": "<name_of_port||port_prefix>",
})
example = equinix.metal.Interconnection("example",
    name="tf-metal-2-port",
    project_id="<metal_project_id>",
    type="shared",
    redundancy="redundant",
    metro="FR",
    speed="1Gbps",
    service_token_type="a_side",
    contact_email="username@example.com")
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-metal-2-port",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": ["username@example.com"],
    }],
    project={
        "project_id": "<fabric_project_id>",
    },
    bandwidth=100,
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "service_token": {
            "uuid": example.service_tokens[0].id,
        },
    },
    z_side={
        "access_point": {
            "type": equinix.fabric.AccessPointType.COLO,
            "port": {
                "uuid": a_side.data[0].uuid,
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 1234,
            },
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		aSide := fabric.GetPortsOutput(ctx, fabric.GetPortsOutputArgs{
			Filter: &fabric.GetPortsFilterArgs{
				Name: pulumi.String("<name_of_port||port_prefix>"),
			},
		}, nil)
		example, err := metal.NewInterconnection(ctx, "example", &metal.InterconnectionArgs{
			Name:             pulumi.String("tf-metal-2-port"),
			ProjectId:        pulumi.String("<metal_project_id>"),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("redundant"),
			Metro:            pulumi.String("FR"),
			Speed:            pulumi.String("1Gbps"),
			ServiceTokenType: pulumi.String("a_side"),
			ContactEmail:     pulumi.String("username@example.com"),
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name: pulumi.String("tf-metal-2-port"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("username@example.com"),
					},
				},
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.String("<fabric_project_id>"),
			},
			Bandwidth: pulumi.Int(100),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				ServiceToken: &fabric.ConnectionASideServiceTokenArgs{
					Uuid: example.ServiceTokens.ApplyT(func(serviceTokens []metal.InterconnectionServiceToken) (*string, error) {
						return &serviceTokens[0].Id, nil
					}).(pulumi.StringPtrOutput),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: aSide.ApplyT(func(aSide fabric.GetPortsResult) (*string, error) {
							return &aSide.Data[0].Uuid, nil
						}).(pulumi.StringPtrOutput),
					},
					LinkProtocol: &fabric.ConnectionZSideAccessPointLinkProtocolArgs{
						Type:    pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanTag: pulumi.Int(1234),
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
    var aSide = Equinix.Fabric.GetPorts.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
        {
            Name = "<name_of_port||port_prefix>",
        },
    });

    var example = new Equinix.Metal.Interconnection("example", new()
    {
        Name = "tf-metal-2-port",
        ProjectId = "<metal_project_id>",
        Type = "shared",
        Redundancy = "redundant",
        Metro = "FR",
        Speed = "1Gbps",
        ServiceTokenType = "a_side",
        ContactEmail = "username@example.com",
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-2-port",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "username@example.com",
                },
            },
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = "<fabric_project_id>",
        },
        Bandwidth = 100,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionASideServiceTokenArgs
            {
                Uuid = example.ServiceTokens.Apply(serviceTokens => serviceTokens[0].Id),
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = aSide.Apply(getPortsResult => getPortsResult.Data[0]?.Uuid),
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanTag = 1234,
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
import com.pulumi.equinix.fabric.FabricFunctions;
import com.pulumi.equinix.fabric.inputs.GetPortsArgs;
import com.pulumi.equinix.fabric.inputs.GetPortsFilterArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLinkProtocolArgs;
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
        final var aSide = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filter(GetPortsFilterArgs.builder()
                .name("<name_of_port||port_prefix>")
                .build())
            .build());

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-metal-2-port")
            .projectId("<metal_project_id>")
            .type("shared")
            .redundancy("redundant")
            .metro("FR")
            .speed("1Gbps")
            .serviceTokenType("a_side")
            .contactEmail("username@example.com")
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-2-port")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .bandwidth(100)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .serviceToken(ConnectionASideServiceTokenArgs.builder()
                    .uuid(example.serviceTokens().applyValue(_serviceTokens -> _serviceTokens[0].id()))
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid(aSide.applyValue(_aSide -> _aSide.data()[0].uuid()))
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(1234)
                        .build())
                    .build())
                .build())
            .build());

    }
}
```
```yaml
resources:
  example:
    type: equinix:metal:Interconnection
    properties:
      name: tf-metal-2-port
      projectId: <metal_project_id>
      type: shared
      redundancy: redundant
      metro: FR
      speed: 1Gbps
      serviceTokenType: a_side
      contactEmail: username@example.com
  exampleConnection:
    type: equinix:fabric:Connection
    name: example
    properties:
      name: tf-metal-2-port
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - username@example.com
      project:
        projectId: <fabric_project_id>
      bandwidth: '100'
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        serviceToken:
          uuid: ${example.serviceTokens[0].id}
      zSide:
        accessPoint:
          type: COLO
          port:
            uuid: ${aSide.data[0].uuid}
          linkProtocol:
            type: DOT1Q
            vlanTag: 1234
variables:
  aSide:
    fn::invoke:
      function: equinix:fabric:getPorts
      arguments:
        filter:
          name: <name_of_port||port_prefix>
```
{{% /example %}}


