## Example Usage

{{% example %}}
### example fcr to azure
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Azure = new equinix.fabric.Connection("fcr2azure", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            router: {
                uuid: "<cloud_router_uuid>",
            },
            type: "CLOUD_ROUTER",
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "IP_VC",
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

fcr2_azure = equinix.fabric.Connection("fcr2azure",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "router": {
                "uuid": "<cloud_router_uuid>",
            },
            "type": "CLOUD_ROUTER",
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<Azure_Service_Profile_UUID>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<Azure_ExpressRouter_Auth_Key>",
            "peering_type": equinix.fabric.AccessPointPeeringType.PRIVATE,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="IP_VC",
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "fcr2azure", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.String("<cloud_router_uuid>"),
					},
					Type: pulumi.String("CLOUD_ROUTER"),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String("IP_VC"),
			Bandwidth: pulumi.Int(50),
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
    var fcr2Azure = new Equinix.Fabric.Connection("fcr2azure", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = "<cloud_router_uuid>",
                },
                Type = "CLOUD_ROUTER",
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = "IP_VC",
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var fcr2Azure = new Connection("fcr2Azure", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid("<cloud_router_uuid>")
                        .build())
                    .type("CLOUD_ROUTER")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("IP_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  fcr2azure:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          router:
            uuid: <cloud_router_uuid>
          type: CLOUD_ROUTER
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: IP_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example fcr to network
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Network = new equinix.fabric.Connection("fcr2network", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            router: {
                uuid: "<cloud_router_uuid>",
            },
            type: "CLOUD_ROUTER",
        },
    },
    zSide: {
        accessPoint: {
            network: {
                uuid: "<network_uuid>",
            },
            type: equinix.fabric.AccessPointType.Network,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "IPWAN_VC",
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

fcr2_network = equinix.fabric.Connection("fcr2network",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "router": {
                "uuid": "<cloud_router_uuid>",
            },
            "type": "CLOUD_ROUTER",
        },
    },
    z_side={
        "access_point": {
            "network": {
                "uuid": "<network_uuid>",
            },
            "type": equinix.fabric.AccessPointType.NETWORK,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="IPWAN_VC",
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "fcr2network", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.String("<cloud_router_uuid>"),
					},
					Type: pulumi.String("CLOUD_ROUTER"),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String("IPWAN_VC"),
			Bandwidth: pulumi.Int(50),
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
    var fcr2Network = new Equinix.Fabric.Connection("fcr2network", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = "<cloud_router_uuid>",
                },
                Type = "CLOUD_ROUTER",
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
                },
                Type = Equinix.Fabric.AccessPointType.Network,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = "IPWAN_VC",
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var fcr2Network = new Connection("fcr2Network", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid("<cloud_router_uuid>")
                        .build())
                    .type("CLOUD_ROUTER")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .type("NETWORK")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("IPWAN_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  fcr2network:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          router:
            uuid: <cloud_router_uuid>
          type: CLOUD_ROUTER
      zSide:
        accessPoint:
          network:
            uuid: <network_uuid>
          type: NETWORK
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: IPWAN_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example fcr to port
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Port = new equinix.fabric.Connection("fcr2port", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            router: {
                uuid: "<cloud_router_uuid>",
            },
            type: "CLOUD_ROUTER",
        },
    },
    zSide: {
        accessPoint: {
            port: {
                uuid: "<port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 2711,
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "IP_VC",
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

fcr2_port = equinix.fabric.Connection("fcr2port",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "router": {
                "uuid": "<cloud_router_uuid>",
            },
            "type": "CLOUD_ROUTER",
        },
    },
    z_side={
        "access_point": {
            "port": {
                "uuid": "<port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 2711,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="IP_VC",
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "fcr2port", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.String("<cloud_router_uuid>"),
					},
					Type: pulumi.String("CLOUD_ROUTER"),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionZSideAccessPointLinkProtocolArgs{
						Type:    pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanTag: pulumi.Int(2711),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String("IP_VC"),
			Bandwidth: pulumi.Int(50),
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
    var fcr2Port = new Equinix.Fabric.Connection("fcr2port", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = "<cloud_router_uuid>",
                },
                Type = "CLOUD_ROUTER",
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanTag = 2711,
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = "IP_VC",
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var fcr2Port = new Connection("fcr2Port", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid("<cloud_router_uuid>")
                        .build())
                    .type("CLOUD_ROUTER")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<port_uuid>")
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(2711)
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("IP_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  fcr2port:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          router:
            uuid: <cloud_router_uuid>
          type: CLOUD_ROUTER
      zSide:
        accessPoint:
          port:
            uuid: <port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanTag: '2711'
          location:
            metroCode: SV
          type: COLO
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: IP_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to alibaba
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Alibaba = new equinix.fabric.Connection("port2alibaba", {
    redundancy: {
        priority: "PRIMARY",
    },
    order: {
        purchaseOrderNumber: "1-323929",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 2019,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<alibaba_account_id>",
            sellerRegion: "us-west-1",
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

port2_alibaba = equinix.fabric.Connection("port2alibaba",
    redundancy={
        "priority": "PRIMARY",
    },
    order={
        "purchase_order_number": "1-323929",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_tag": 2019,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<service_profile_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<alibaba_account_id>",
            "seller_region": "us-west-1",
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "port2alibaba", &fabric.ConnectionArgs{
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323929"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:    pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanTag: pulumi.Int(2019),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<service_profile_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<alibaba_account_id>"),
					SellerRegion:      pulumi.String("us-west-1"),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var port2Alibaba = new Equinix.Fabric.Connection("port2alibaba", new()
    {
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323929",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanTag = 2019,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<service_profile_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<alibaba_account_id>",
                SellerRegion = "us-west-1",
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var port2Alibaba = new Connection("port2Alibaba", ConnectionArgs.builder()
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323929")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(2019)
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<service_profile_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<alibaba_account_id>")
                    .sellerRegion("us-west-1")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  port2alibaba:
    type: equinix:fabric:Connection
    properties:
      redundancy:
        priority: PRIMARY
      order:
        purchaseOrderNumber: 1-323929
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanTag: '2019'
          type: COLO
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <service_profile_uuid>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <alibaba_account_id>
          sellerRegion: us-west-1
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to aws
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Aws = new equinix.fabric.Connection("port2aws", {
    redundancy: {
        priority: "PRIMARY",
    },
    order: {
        purchaseOrderNumber: "1-323929",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 2019,
                vlanCTag: 2112,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<aws_account_id>",
            sellerRegion: "us-west-1",
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
    additionalInfo: [
        {
            key: "accessKey",
            value: "<aws_access_key>",
        },
        {
            key: "secretKey",
            value: "<aws_secret_key>",
        },
    ],
});
```
```python
import pulumi
import pulumi_equinix as equinix

port2_aws = equinix.fabric.Connection("port2aws",
    redundancy={
        "priority": "PRIMARY",
    },
    order={
        "purchase_order_number": "1-323929",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 2019,
                "vlan_c_tag": 2112,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<service_profile_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<aws_account_id>",
            "seller_region": "us-west-1",
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50,
    additional_info=[
        {
            "key": "accessKey",
            "value": "<aws_access_key>",
        },
        {
            "key": "secretKey",
            "value": "<aws_secret_key>",
        },
    ])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "port2aws", &fabric.ConnectionArgs{
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323929"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(2019),
						VlanCTag: pulumi.Int(2112),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<service_profile_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<aws_account_id>"),
					SellerRegion:      pulumi.String("us-west-1"),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
			AdditionalInfo: pulumi.StringMapArray{
				pulumi.StringMap{
					"key":   pulumi.String("accessKey"),
					"value": pulumi.String("<aws_access_key>"),
				},
				pulumi.StringMap{
					"key":   pulumi.String("secretKey"),
					"value": pulumi.String("<aws_secret_key>"),
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
    var port2Aws = new Equinix.Fabric.Connection("port2aws", new()
    {
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323929",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 2019,
                    VlanCTag = 2112,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<service_profile_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<aws_account_id>",
                SellerRegion = "us-west-1",
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
        AdditionalInfo = new[]
        {
            
            {
                { "key", "accessKey" },
                { "value", "<aws_access_key>" },
            },
            
            {
                { "key", "secretKey" },
                { "value", "<aws_secret_key>" },
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var port2Aws = new Connection("port2Aws", ConnectionArgs.builder()
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323929")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag(2019)
                        .vlanCTag(2112)
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<service_profile_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<aws_account_id>")
                    .sellerRegion("us-west-1")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .additionalInfo(            
                Map.ofEntries(
                    Map.entry("key", "accessKey"),
                    Map.entry("value", "<aws_access_key>")
                ),
                Map.ofEntries(
                    Map.entry("key", "secretKey"),
                    Map.entry("value", "<aws_secret_key>")
                ))
            .build());

    }
}
```
```yaml
resources:
  port2aws:
    type: equinix:fabric:Connection
    properties:
      redundancy:
        priority: PRIMARY
      order:
        purchaseOrderNumber: 1-323929
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '2019'
            vlanCTag: '2112'
          type: COLO
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <service_profile_uuid>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <aws_account_id>
          sellerRegion: us-west-1
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
      additionalInfo:
        - key: accessKey
          value: <aws_access_key>
        - key: secretKey
          value: <aws_secret_key>
```
{{% /example %}}

{{% example %}}
### example port to network eplan
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const eplan = new equinix.fabric.Connection("eplan", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            network: {
                uuid: "<network_uuid>",
            },
            type: equinix.fabric.AccessPointType.Network,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "EPLAN_VC",
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

eplan = equinix.fabric.Connection("eplan",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "network": {
                "uuid": "<network_uuid>",
            },
            "type": equinix.fabric.AccessPointType.NETWORK,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="EPLAN_VC",
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "eplan", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String("EPLAN_VC"),
			Bandwidth: pulumi.Int(50),
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
    var eplan = new Equinix.Fabric.Connection("eplan", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
                },
                Type = Equinix.Fabric.AccessPointType.Network,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = "EPLAN_VC",
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var eplan = new Connection("eplan", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .type("NETWORK")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EPLAN_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  eplan:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          type: COLO
      zSide:
        accessPoint:
          network:
            uuid: <network_uuid>
          type: NETWORK
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EPLAN_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to network evplan
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const evplan = new equinix.fabric.Connection("evplan", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanSTag: 1976,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            network: {
                uuid: "<network_uuid>",
            },
            type: equinix.fabric.AccessPointType.Network,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "EVPLAN_VC",
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

evplan = equinix.fabric.Connection("evplan",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_s_tag": 1976,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "network": {
                "uuid": "<network_uuid>",
            },
            "type": equinix.fabric.AccessPointType.NETWORK,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="EVPLAN_VC",
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "evplan", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanSTag: pulumi.Int(1976),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String("EVPLAN_VC"),
			Bandwidth: pulumi.Int(50),
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
    var evplan = new Equinix.Fabric.Connection("evplan", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanSTag = 1976,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
                },
                Type = Equinix.Fabric.AccessPointType.Network,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = "EVPLAN_VC",
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var evplan = new Connection("evplan", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanSTag(1976)
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .type("NETWORK")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPLAN_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  evplan:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanSTag: '1976'
          type: COLO
      zSide:
        accessPoint:
          network:
            uuid: <network_uuid>
          type: NETWORK
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPLAN_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to port
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Port = new equinix.fabric.Connection("port2port", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 1976,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            port: {
                uuid: "<zside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 3711,
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

port2_port = equinix.fabric.Connection("port2port",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 1976,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "port": {
                "uuid": "<zside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 3711,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "port2port", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(1976),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionZSideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(3711),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var port2Port = new Equinix.Fabric.Connection("port2port", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 1976,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<zside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 3711,
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var port2Port = new Connection("port2Port", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag(1976)
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag(3711)
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  port2port:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '1976'
          type: COLO
      zSide:
        accessPoint:
          port:
            uuid: <zside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '3711'
          location:
            metroCode: SV
          type: COLO
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to port access epl
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const accessEplVc = new equinix.fabric.Connection("access_epl_vc", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 1976,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            port: {
                uuid: "<zside_port_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.AccessEPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

access_epl_vc = equinix.fabric.Connection("access_epl_vc",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                "vlan_s_tag": 1976,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "port": {
                "uuid": "<zside_port_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.ACCESS_EPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "access_epl_vc", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(1976),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeAccessEPL),
			Bandwidth: pulumi.Int(50),
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
    var accessEplVc = new Equinix.Fabric.Connection("access_epl_vc", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 1976,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<zside_port_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.AccessEPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var accessEplVc = new Connection("accessEplVc", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag(1976)
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("ACCESS_EPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  accessEplVc:
    type: equinix:fabric:Connection
    name: access_epl_vc
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '1976'
          type: COLO
      zSide:
        accessPoint:
          port:
            uuid: <zside_port_uuid>
          location:
            metroCode: SV
          type: COLO
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: ACCESS_EPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to port epl
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const epl = new equinix.fabric.Connection("epl", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            port: {
                uuid: "<zside_port_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

epl = equinix.fabric.Connection("epl",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "port": {
                "uuid": "<aside_port_uuid>",
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    z_side={
        "access_point": {
            "port": {
                "uuid": "<zside_port_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "epl", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEPL),
			Bandwidth: pulumi.Int(50),
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
    var epl = new Equinix.Fabric.Connection("epl", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<zside_port_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var epl = new Connection("epl", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  epl:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          port:
            uuid: <aside_port_uuid>
          type: COLO
      zSide:
        accessPoint:
          port:
            uuid: <zside_port_uuid>
          location:
            metroCode: SV
          type: COLO
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example port to vd
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Port = new equinix.fabric.Connection("vd2port", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "NETWORK",
                id: 7,
            },
            type: equinix.fabric.AccessPointType.VD,
        },
    },
    zSide: {
        accessPoint: {
            port: {
                uuid: "<zside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanSTag: 3711,
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_port = equinix.fabric.Connection("vd2port",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "NETWORK",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "access_point": {
            "port": {
                "uuid": "<zside_port_uuid>",
            },
            "link_protocol": {
                "type": equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                "vlan_s_tag": 3711,
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.COLO,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2port", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("NETWORK"),
						Id:   pulumi.Int(7),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionZSideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanSTag: pulumi.Int(3711),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var vd2Port = new Equinix.Fabric.Connection("vd2port", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "NETWORK",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<zside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanSTag = 3711,
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.Colo,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var vd2Port = new Connection("vd2Port", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("NETWORK")
                        .id(7)
                        .build())
                    .type("VD")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanSTag(3711)
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("COLO")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  vd2port:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: NETWORK
            id: 7
          type: VD
      zSide:
        accessPoint:
          port:
            uuid: <zside_port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanSTag: '3711'
          location:
            metroCode: SV
          type: COLO
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example token to aws
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const token2Aws = new equinix.fabric.Connection("token2aws", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        serviceToken: {
            uuid: "<service_token_uuid>",
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<aws_account_id>",
            sellerRegion: "us-west-1",
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

token2_aws = equinix.fabric.Connection("token2aws",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "service_token": {
            "uuid": "<service_token_uuid>",
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<service_profile_uuid>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<aws_account_id>",
            "seller_region": "us-west-1",
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "token2aws", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				ServiceToken: &fabric.ConnectionASideServiceTokenArgs{
					Uuid: pulumi.String("<service_token_uuid>"),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<service_profile_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<aws_account_id>"),
					SellerRegion:      pulumi.String("us-west-1"),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var token2Aws = new Equinix.Fabric.Connection("token2aws", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionASideServiceTokenArgs
            {
                Uuid = "<service_token_uuid>",
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<service_profile_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<aws_account_id>",
                SellerRegion = "us-west-1",
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var token2Aws = new Connection("token2Aws", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .serviceToken(ConnectionASideServiceTokenArgs.builder()
                    .uuid("<service_token_uuid>")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<service_profile_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<aws_account_id>")
                    .sellerRegion("us-west-1")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  token2aws:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        serviceToken:
          uuid: <service_token_uuid>
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <service_profile_uuid>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <aws_account_id>
          sellerRegion: us-west-1
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example vd to azure
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Azure = new equinix.fabric.Connection("vd2azure", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
            type: equinix.fabric.AccessPointType.VD,
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_azure = equinix.fabric.Connection("vd2azure",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "CLOUD",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<Azure_Service_Profile_UUID>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<Azure_ExpressRouter_Auth_Key>",
            "peering_type": equinix.fabric.AccessPointPeeringType.PRIVATE,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2azure", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var vd2Azure = new Equinix.Fabric.Connection("vd2azure", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "CLOUD",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var vd2Azure = new Connection("vd2Azure", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .type("VD")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  vd2azure:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 7
          type: VD
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example vd to azure redundant
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2AzurePrimary = new equinix.fabric.Connection("vd2azure_primary", {
    redundancy: {
        priority: "PRIMARY",
    },
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
            type: equinix.fabric.AccessPointType.VD,
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
const vd2AzureSecondary = new equinix.fabric.Connection("vd2azure_secondary", {
    redundancy: {
        priority: "SECONDARY",
        group: vd2AzurePrimary.redundancy.apply(redundancy => redundancy?.group),
    },
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 5,
            },
            type: equinix.fabric.AccessPointType.VD,
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_azure_primary = equinix.fabric.Connection("vd2azure_primary",
    redundancy={
        "priority": "PRIMARY",
    },
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "CLOUD",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<Azure_Service_Profile_UUID>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<Azure_ExpressRouter_Auth_Key>",
            "peering_type": equinix.fabric.AccessPointPeeringType.PRIVATE,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
vd2_azure_secondary = equinix.fabric.Connection("vd2azure_secondary",
    redundancy={
        "priority": "SECONDARY",
        "group": vd2_azure_primary.redundancy.group,
    },
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "CLOUD",
                "id": 5,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "access_point": {
            "profile": {
                "type": equinix.fabric.ProfileType.L2_PROFILE,
                "uuid": "<Azure_Service_Profile_UUID>",
            },
            "location": {
                "metro_code": equinix.Metro.SILICON_VALLEY,
            },
            "type": equinix.fabric.AccessPointType.SP,
            "authentication_key": "<Azure_ExpressRouter_Auth_Key>",
            "peering_type": equinix.fabric.AccessPointPeeringType.PRIVATE,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		vd2AzurePrimary, err := fabric.NewConnection(ctx, "vd2azure_primary", &fabric.ConnectionArgs{
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "vd2azure_secondary", &fabric.ConnectionArgs{
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("SECONDARY"),
				Group: vd2AzurePrimary.Redundancy.ApplyT(func(redundancy fabric.ConnectionRedundancy) (*string, error) {
					return &redundancy.Group, nil
				}).(pulumi.StringPtrOutput),
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(5),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var vd2AzurePrimary = new Equinix.Fabric.Connection("vd2azure_primary", new()
    {
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "CLOUD",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

    var vd2AzureSecondary = new Equinix.Fabric.Connection("vd2azure_secondary", new()
    {
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "SECONDARY",
            Group = vd2AzurePrimary.Redundancy.Apply(redundancy => redundancy?.Group),
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "CLOUD",
                    Id = 5,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var vd2AzurePrimary = new Connection("vd2AzurePrimary", ConnectionArgs.builder()
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .type("VD")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

        var vd2AzureSecondary = new Connection("vd2AzureSecondary", ConnectionArgs.builder()
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("SECONDARY")
                .group(vd2AzurePrimary.redundancy().applyValue(_redundancy -> _redundancy.group()))
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(5)
                        .build())
                    .type("VD")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  vd2azurePrimary:
    type: equinix:fabric:Connection
    name: vd2azure_primary
    properties:
      redundancy:
        priority: PRIMARY
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 7
          type: VD
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
  vd2azureSecondary:
    type: equinix:fabric:Connection
    name: vd2azure_secondary
    properties:
      redundancy:
        priority: SECONDARY
        group: ${vd2azurePrimary.redundancy.group}
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 5
          type: VD
      zSide:
        accessPoint:
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example vd to network
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Network = new equinix.fabric.Connection("vd2network", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
            type: equinix.fabric.AccessPointType.VD,
        },
    },
    zSide: {
        accessPoint: {
            network: {
                uuid: "<network_uuid>",
            },
            type: equinix.fabric.AccessPointType.Network,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "EVPLAN_VC",
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_network = equinix.fabric.Connection("vd2network",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "CLOUD",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "access_point": {
            "network": {
                "uuid": "<network_uuid>",
            },
            "type": equinix.fabric.AccessPointType.NETWORK,
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type="EVPLAN_VC",
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2network", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String("EVPLAN_VC"),
			Bandwidth: pulumi.Int(50),
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
    var vd2Network = new Equinix.Fabric.Connection("vd2network", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "CLOUD",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
                },
                Type = Equinix.Fabric.AccessPointType.Network,
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = "EVPLAN_VC",
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var vd2Network = new Connection("vd2Network", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .type("VD")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .type("NETWORK")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPLAN_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  vd2network:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 7
          type: VD
      zSide:
        accessPoint:
          network:
            uuid: <network_uuid>
          type: NETWORK
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPLAN_VC
      bandwidth: 50
```
{{% /example %}}

{{% example %}}
### example vd to token
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Token = new equinix.fabric.Connection("vd2token", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "NETWORK",
                id: 7,
            },
            type: equinix.fabric.AccessPointType.VD,
        },
    },
    zSide: {
        serviceToken: {
            uuid: "<service_token_uuid>",
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_token = equinix.fabric.Connection("vd2token",
    order={
        "purchase_order_number": "1-323292",
    },
    a_side={
        "access_point": {
            "virtual_device": {
                "type": "EDGE",
                "uuid": "<device_uuid>",
            },
            "interface": {
                "type": "NETWORK",
                "id": 7,
            },
            "type": equinix.fabric.AccessPointType.VD,
        },
    },
    z_side={
        "service_token": {
            "uuid": "<service_token_uuid>",
        },
    },
    notifications=[{
        "type": equinix.fabric.NotificationsType.ALL,
        "emails": [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    bandwidth=50)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2token", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("NETWORK"),
						Id:   pulumi.Int(7),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				ServiceToken: &fabric.ConnectionZSideServiceTokenArgs{
					Uuid: pulumi.String("<service_token_uuid>"),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
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
    var vd2Token = new Equinix.Fabric.Connection("vd2token", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "NETWORK",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionZSideServiceTokenArgs
            {
                Uuid = "<service_token_uuid>",
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
        var vd2Token = new Connection("vd2Token", ConnectionArgs.builder()
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("NETWORK")
                        .id(7)
                        .build())
                    .type("VD")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .serviceToken(ConnectionZSideServiceTokenArgs.builder()
                    .uuid("<service_token_uuid>")
                    .build())
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .name("ConnectionName")
            .type("EVPL_VC")
            .bandwidth(50)
            .build());

    }
}
```
```yaml
resources:
  vd2token:
    type: equinix:fabric:Connection
    properties:
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: NETWORK
            id: 7
          type: VD
      zSide:
        serviceToken:
          uuid: <service_token_uuid>
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      name: ConnectionName
      type: EVPL_VC
      bandwidth: 50
```
{{% /example %}}


