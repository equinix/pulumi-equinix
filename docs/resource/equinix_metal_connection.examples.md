## Example Usage

{{% example %}}
### example fabric billed token
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "SV";
const speedInMbps = config.getNumber("speedInMbps") || 200;
const connection = new equinix.metal.Interconnection("connection", {
    name: "fabric-port-to-metal",
    projectId: projectId,
    type: "shared",
    redundancy: "primary",
    metro: metro,
    speed: `${speedInMbps}Mbps`,
    serviceTokenType: "z_side",
});
export const connectionStatus = connection.status;
export const connectionTokens = connection.serviceTokens;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 200
connection = equinix.metal.Interconnection("connection",
    name="fabric-port-to-metal",
    project_id=project_id,
    type="shared",
    redundancy="primary",
    metro=metro,
    speed=f"{speed_in_mbps}Mbps",
    service_token_type="z_side")
pulumi.export("connectionStatus", connection.status)
pulumi.export("connectionTokens", connection.service_tokens)
```
```go
package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		speedInMbps := 200
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
			Name:             pulumi.String("fabric-port-to-metal"),
			ProjectId:        pulumi.String(projectId),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String(metro),
			Speed:            pulumi.String(fmt.Sprintf("%vMbps", speedInMbps)),
			ServiceTokenType: pulumi.String("z_side"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionStatus", connection.Status)
		ctx.Export("connectionTokens", connection.ServiceTokens)
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
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "SV";
    var speedInMbps = config.GetInt32("speedInMbps") ?? 200;
    var connection = new Equinix.Metal.Interconnection("connection", new()
    {
        Name = "fabric-port-to-metal",
        ProjectId = projectId,
        Type = "shared",
        Redundancy = "primary",
        Metro = metro,
        Speed = $"{speedInMbps}Mbps",
        ServiceTokenType = "z_side",
    });

    return new Dictionary<string, object?>
    {
        ["connectionStatus"] = connection.Status,
        ["connectionTokens"] = connection.ServiceTokens,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
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
        final var projectId = config.get("projectId");
        final var metro = config.get("metro").orElse("SV");
        final var speedInMbps = config.get("speedInMbps").orElse(200);
        var connection = new Interconnection("connection", InterconnectionArgs.builder()
            .name("fabric-port-to-metal")
            .projectId(projectId)
            .type("shared")
            .redundancy("primary")
            .metro(metro)
            .speed(String.format("%sMbps", speedInMbps))
            .serviceTokenType("z_side")
            .build());

        ctx.export("connectionStatus", connection.status());
        ctx.export("connectionTokens", connection.serviceTokens());
    }
}
```
```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: SV
  speedInMbps:
    type: integer
    default: 200
resources:
  connection:
    type: equinix:metal:Interconnection
    properties:
      name: fabric-port-to-metal
      projectId: ${projectId}
      type: shared
      redundancy: primary
      metro: ${metro}
      speed: ${speedInMbps}Mbps
      serviceTokenType: z_side
outputs:
  connectionStatus: ${connection.status}
  connectionTokens: ${connection.serviceTokens}
```
{{% /example %}}

{{% example %}}
### example metal billed token
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "SV";
const speedInMbps = config.getNumber("speedInMbps") || 1000;
const connection = new equinix.metal.Interconnection("connection", {
    name: "metal-to-cloudprovider",
    projectId: projectId,
    type: "shared",
    redundancy: "primary",
    metro: metro,
    speed: `${speedInMbps}Mbps`,
    serviceTokenType: "a_side",
});
export const connectionStatus = connection.status;
export const connectionTokens = connection.serviceTokens;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 1000
connection = equinix.metal.Interconnection("connection",
    name="metal-to-cloudprovider",
    project_id=project_id,
    type="shared",
    redundancy="primary",
    metro=metro,
    speed=f"{speed_in_mbps}Mbps",
    service_token_type="a_side")
pulumi.export("connectionStatus", connection.status)
pulumi.export("connectionTokens", connection.service_tokens)
```
```go
package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		speedInMbps := 1000
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
			Name:             pulumi.String("metal-to-cloudprovider"),
			ProjectId:        pulumi.String(projectId),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String(metro),
			Speed:            pulumi.String(fmt.Sprintf("%vMbps", speedInMbps)),
			ServiceTokenType: pulumi.String("a_side"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionStatus", connection.Status)
		ctx.Export("connectionTokens", connection.ServiceTokens)
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
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "SV";
    var speedInMbps = config.GetInt32("speedInMbps") ?? 1000;
    var connection = new Equinix.Metal.Interconnection("connection", new()
    {
        Name = "metal-to-cloudprovider",
        ProjectId = projectId,
        Type = "shared",
        Redundancy = "primary",
        Metro = metro,
        Speed = $"{speedInMbps}Mbps",
        ServiceTokenType = "a_side",
    });

    return new Dictionary<string, object?>
    {
        ["connectionStatus"] = connection.Status,
        ["connectionTokens"] = connection.ServiceTokens,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
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
        final var projectId = config.get("projectId");
        final var metro = config.get("metro").orElse("SV");
        final var speedInMbps = config.get("speedInMbps").orElse(1000);
        var connection = new Interconnection("connection", InterconnectionArgs.builder()
            .name("metal-to-cloudprovider")
            .projectId(projectId)
            .type("shared")
            .redundancy("primary")
            .metro(metro)
            .speed(String.format("%sMbps", speedInMbps))
            .serviceTokenType("a_side")
            .build());

        ctx.export("connectionStatus", connection.status());
        ctx.export("connectionTokens", connection.serviceTokens());
    }
}
```
```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: SV
  speedInMbps:
    type: integer
    default: 1000
resources:
  connection:
    type: equinix:metal:Interconnection
    properties:
      name: metal-to-cloudprovider
      projectId: ${projectId}
      type: shared
      redundancy: primary
      metro: ${metro}
      speed: ${speedInMbps}Mbps
      serviceTokenType: a_side
outputs:
  connectionStatus: ${connection.status}
  connectionTokens: ${connection.serviceTokens}
```
{{% /example %}}

{{% example %}}
### example shared metal fabric connection from fcr
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example1 = new equinix.metal.Vlan("example1", {
    projectId: myProjectId,
    metro: "SV",
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-port-to-metal-legacy",
    projectId: myProjectId,
    metro: "SV",
    redundancy: "primary",
    type: "shared_port_vlan",
    contactEmail: "username@example.com",
    vlans: [example1.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-NIMF-metal-2-aws-legacy",
    type: "IP_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: "sername@example.com",
    }],
    project: {
        projectId: fabricProjectId,
    },
    bandwidth: 200,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: "CLOUD_ROUTER",
            router: {
                uuid: cloudRouterUuid,
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
    project_id=my_project_id,
    metro="SV")
example = equinix.metal.Interconnection("example",
    name="tf-port-to-metal-legacy",
    project_id=my_project_id,
    metro="SV",
    redundancy="primary",
    type="shared_port_vlan",
    contact_email="username@example.com",
    vlans=[example1.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-NIMF-metal-2-aws-legacy",
    type="IP_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails="sername@example.com",
    )],
    project=equinix.fabric.ConnectionProjectArgs(
        project_id=fabric_project_id,
    ),
    bandwidth=200,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="CLOUD_ROUTER",
            router=equinix.fabric.ConnectionASideAccessPointRouterArgs(
                uuid=cloud_router_uuid,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type="METAL_NETWORK",
            authentication_key=example.authorization_code,
        ),
    ))
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
			ProjectId: pulumi.Any(myProjectId),
			Metro:     pulumi.String("SV"),
		})
		if err != nil {
			return err
		}
		example, err := metal.NewInterconnection(ctx, "example", &metal.InterconnectionArgs{
			Name:         pulumi.String("tf-port-to-metal-legacy"),
			ProjectId:    pulumi.Any(myProjectId),
			Metro:        pulumi.String("SV"),
			Redundancy:   pulumi.String("primary"),
			Type:         pulumi.String("shared_port_vlan"),
			ContactEmail: pulumi.String("username@example.com"),
			Vlans: pulumi.IntArray{
				example1.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name: pulumi.String("tf-NIMF-metal-2-aws-legacy"),
			Type: pulumi.String("IP_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type:   pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray("sername@example.com"),
				},
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.Any(fabricProjectId),
			},
			Bandwidth: pulumi.Int(200),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("CLOUD_ROUTER"),
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.Any(cloudRouterUuid),
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
        ProjectId = myProjectId,
        Metro = "SV",
    });

    var example = new Equinix.Metal.Interconnection("example", new()
    {
        Name = "tf-port-to-metal-legacy",
        ProjectId = myProjectId,
        Metro = "SV",
        Redundancy = "primary",
        Type = "shared_port_vlan",
        ContactEmail = "username@example.com",
        Vlans = new[]
        {
            example1.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-NIMF-metal-2-aws-legacy",
        Type = "IP_VC",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = "sername@example.com",
            },
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = fabricProjectId,
        },
        Bandwidth = 200,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "CLOUD_ROUTER",
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = cloudRouterUuid,
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
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
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
            .projectId(myProjectId)
            .metro("SV")
            .build());

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-port-to-metal-legacy")
            .projectId(myProjectId)
            .metro("SV")
            .redundancy("primary")
            .type("shared_port_vlan")
            .contactEmail("username@example.com")
            .vlans(example1.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-NIMF-metal-2-aws-legacy")
            .type("IP_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("sername@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId(fabricProjectId)
                .build())
            .bandwidth("200")
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid(cloudRouterUuid)
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
      projectId: ${myProjectId}
      metro: SV
  example:
    type: equinix:metal:Interconnection
    properties:
      name: tf-port-to-metal-legacy
      projectId: ${myProjectId}
      metro: SV
      redundancy: primary
      type: shared_port_vlan
      contactEmail: username@example.com
      vlans:
        - ${example1.vxlan}
  exampleConnection:
    type: equinix:fabric:Connection
    name: example
    properties:
      name: tf-NIMF-metal-2-aws-legacy
      type: IP_VC
      notifications:
        - type: ALL
          emails: sername@example.com
      project:
        projectId: ${fabricProjectId}
      bandwidth: '200'
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: CLOUD_ROUTER
          router:
            uuid: ${cloudRouterUuid}
      zSide:
        accessPoint:
          type: METAL_NETWORK
          authenticationKey: ${example.authorizationCode}
```
{{% /example %}}

{{% example %}}
### example shared metal fabric connection to csp
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const zside = equinix.fabric.getServiceProfilesOutput({
    filter: {
        property: "/name",
        operator: "=",
        values: ["AWS Direct Connect"],
    },
});
const example1 = new equinix.metal.Vlan("example1", {
    projectId: myProjectId,
    metro: "SV",
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-port-to-metal-legacy",
    projectId: myProjectId,
    metro: "SV",
    redundancy: "primary",
    type: "shared_port_vlan",
    contactEmail: "username@example.com",
    vlans: [example1.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-NIMF-metal-2-aws-legacy",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: "sername@example.com",
    }],
    project: {
        projectId: fabricProjectId,
    },
    bandwidth: 200,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: "METAL_NETWORK",
            authenticationKey: example.authorizationCode,
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: awsAccountId,
            sellerRegion: "us-west-1",
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: zside.apply(zside => zside.id),
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

zside = equinix.fabric.get_service_profiles_output(filter=equinix.fabric.GetServiceProfilesFilterArgs(
    property="/name",
    operator="=",
    values=["AWS Direct Connect"],
))
example1 = equinix.metal.Vlan("example1",
    project_id=my_project_id,
    metro="SV")
example = equinix.metal.Interconnection("example",
    name="tf-port-to-metal-legacy",
    project_id=my_project_id,
    metro="SV",
    redundancy="primary",
    type="shared_port_vlan",
    contact_email="username@example.com",
    vlans=[example1.vxlan])
example_connection = equinix.fabric.Connection("exampleConnection",
    name="tf-NIMF-metal-2-aws-legacy",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails="sername@example.com",
    )],
    project=equinix.fabric.ConnectionProjectArgs(
        project_id=fabric_project_id,
    ),
    bandwidth=200,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="METAL_NETWORK",
            authentication_key=example.authorization_code,
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key=aws_account_id,
            seller_region="us-west-1",
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid=zside.id,
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		zside, err := fabric.GetServiceProfiles(ctx, &fabric.GetServiceProfilesArgs{
			Filter: fabric.GetServiceProfilesFilter{
				Property: "/name",
				Operator: "=",
				Values: []string{
					"AWS Direct Connect",
				},
			},
		}, nil)
		if err != nil {
			return err
		}
		example1, err := metal.NewVlan(ctx, "example1", &metal.VlanArgs{
			ProjectId: pulumi.Any(myProjectId),
			Metro:     pulumi.String("SV"),
		})
		if err != nil {
			return err
		}
		example, err := metal.NewInterconnection(ctx, "example", &metal.InterconnectionArgs{
			Name:         pulumi.String("tf-port-to-metal-legacy"),
			ProjectId:    pulumi.Any(myProjectId),
			Metro:        pulumi.String("SV"),
			Redundancy:   pulumi.String("primary"),
			Type:         pulumi.String("shared_port_vlan"),
			ContactEmail: pulumi.String("username@example.com"),
			Vlans: pulumi.IntArray{
				example1.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name: pulumi.String("tf-NIMF-metal-2-aws-legacy"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type:   pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray("sername@example.com"),
				},
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.Any(fabricProjectId),
			},
			Bandwidth: pulumi.Int(200),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type:              pulumi.String("METAL_NETWORK"),
					AuthenticationKey: example.AuthorizationCode,
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.Any(awsAccountId),
					SellerRegion:      pulumi.String("us-west-1"),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String(zside.Id),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
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
    var zside = Equinix.Fabric.GetServiceProfiles.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetServiceProfilesFilterInputArgs
        {
            Property = "/name",
            Operator = "=",
            Values = new[]
            {
                "AWS Direct Connect",
            },
        },
    });

    var example1 = new Equinix.Metal.Vlan("example1", new()
    {
        ProjectId = myProjectId,
        Metro = "SV",
    });

    var example = new Equinix.Metal.Interconnection("example", new()
    {
        Name = "tf-port-to-metal-legacy",
        ProjectId = myProjectId,
        Metro = "SV",
        Redundancy = "primary",
        Type = "shared_port_vlan",
        ContactEmail = "username@example.com",
        Vlans = new[]
        {
            example1.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-NIMF-metal-2-aws-legacy",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = "sername@example.com",
            },
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = fabricProjectId,
        },
        Bandwidth = 200,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "METAL_NETWORK",
                AuthenticationKey = example.AuthorizationCode,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = awsAccountId,
                SellerRegion = "us-west-1",
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = zside.Apply(getServiceProfilesResult => getServiceProfilesResult.Id),
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
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
import com.pulumi.equinix.fabric.inputs.GetServiceProfilesArgs;
import com.pulumi.equinix.fabric.inputs.GetServiceProfilesFilterArgs;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
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
        final var zside = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
            .filter(GetServiceProfilesFilterArgs.builder()
                .property("/name")
                .operator("=")
                .values("AWS Direct Connect")
                .build())
            .build());

        var example1 = new Vlan("example1", VlanArgs.builder()
            .projectId(myProjectId)
            .metro("SV")
            .build());

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-port-to-metal-legacy")
            .projectId(myProjectId)
            .metro("SV")
            .redundancy("primary")
            .type("shared_port_vlan")
            .contactEmail("username@example.com")
            .vlans(example1.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-NIMF-metal-2-aws-legacy")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("sername@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId(fabricProjectId)
                .build())
            .bandwidth("200")
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("METAL_NETWORK")
                    .authenticationKey(example.authorizationCode())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey(awsAccountId)
                    .sellerRegion("us-west-1")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid(zside.applyValue(getServiceProfilesResult -> getServiceProfilesResult.id()))
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
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
      projectId: ${myProjectId}
      metro: SV
  example:
    type: equinix:metal:Interconnection
    properties:
      name: tf-port-to-metal-legacy
      projectId: ${myProjectId}
      metro: SV
      redundancy: primary
      type: shared_port_vlan
      contactEmail: username@example.com
      vlans:
        - ${example1.vxlan}
  exampleConnection:
    type: equinix:fabric:Connection
    name: example
    properties:
      name: tf-NIMF-metal-2-aws-legacy
      type: EVPL_VC
      notifications:
        - type: ALL
          emails: sername@example.com
      project:
        projectId: ${fabricProjectId}
      bandwidth: '200'
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: METAL_NETWORK
          authenticationKey: ${example.authorizationCode}
      zSide:
        accessPoint:
          type: SP
          authenticationKey: ${awsAccountId}
          sellerRegion: us-west-1
          profile:
            type: L2_PROFILE
            uuid: ${zside.id}
          location:
            metroCode: SV
variables:
  zside:
    fn::invoke:
      Function: equinix:fabric:getServiceProfiles
      Arguments:
        filter:
          property: /name
          operator: =
          values:
            - AWS Direct Connect
```
{{% /example %}}


