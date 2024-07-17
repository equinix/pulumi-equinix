## Example Usage

{{% example %}}
### example 11
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2AzurePrimary = new equinix.fabric.Connection("vd2azurePrimary", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    redundancy: {
        priority: "PRIMARY",
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
});
const vd2AzureSecondary = new equinix.fabric.Connection("vd2azureSecondary", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    redundancy: {
        priority: "SECONDARY",
        group: vd2AzurePrimary.redundancy.apply(redundancy => redundancy?.group),
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 5,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
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

vd2_azure_primary = equinix.fabric.Connection("vd2azurePrimary",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    redundancy=equinix.fabric.ConnectionRedundancyArgs(
        priority="PRIMARY",
    ),
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="CLOUD",
                id=7,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<Azure_ExpressRouter_Auth_Key>",
            peering_type=equinix.fabric.AccessPointPeeringType.PRIVATE,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<Azure_Service_Profile_UUID>",
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ))
vd2_azure_secondary = equinix.fabric.Connection("vd2azureSecondary",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    redundancy=equinix.fabric.ConnectionRedundancyArgs(
        priority="SECONDARY",
        group=vd2_azure_primary.redundancy.group,
    ),
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="CLOUD",
                id=5,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<Azure_ExpressRouter_Auth_Key>",
            peering_type=equinix.fabric.AccessPointPeeringType.PRIVATE,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<Azure_Service_Profile_UUID>",
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		vd2AzurePrimary, err := fabric.NewConnection(ctx, "vd2azurePrimary", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
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
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
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
		_, err = fabric.NewConnection(ctx, "vd2azureSecondary", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("SECONDARY"),
				Group: vd2AzurePrimary.Redundancy.ApplyT(func(redundancy fabric.ConnectionRedundancy) (*string, error) {
					return &redundancy.Group, nil
				}).(pulumi.StringPtrOutput),
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
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(5),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
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
    var vd2AzurePrimary = new Equinix.Fabric.Connection("vd2azurePrimary", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
            },
        },
    });

    var vd2AzureSecondary = new Equinix.Fabric.Connection("vd2azureSecondary", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "SECONDARY",
            Group = vd2AzurePrimary.Redundancy.Apply(redundancy => redundancy?.Group),
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
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
        var vd2AzurePrimary = new Connection("vd2AzurePrimary", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .build())
                .build())
            .build());

        var vd2AzureSecondary = new Connection("vd2AzureSecondary", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("SECONDARY")
                .group(vd2AzurePrimary.redundancy().applyValue(redundancy -> redundancy.group()))
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(5)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
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
  vd2azurePrimary:
    type: equinix:fabric:Connection
    name: vd2azure_primary
    properties:
      name: ConnectionName
      type: EVPL_VC
      redundancy:
        priority: PRIMARY
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 7
      zSide:
        accessPoint:
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
  vd2azureSecondary:
    type: equinix:fabric:Connection
    name: vd2azure_secondary
    properties:
      name: ConnectionName
      type: EVPL_VC
      redundancy:
        priority: SECONDARY
        group: ${vd2azurePrimary.redundancy.group}
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 5
      zSide:
        accessPoint:
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 7
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const token2Aws = new equinix.fabric.Connection("token2aws", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
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
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<aws_account_id>",
            sellerRegion: "us-west-1",
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
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

token2_aws = equinix.fabric.Connection("token2aws",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        service_token=equinix.fabric.ConnectionASideServiceTokenArgs(
            uuid="<service_token_uuid>",
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<aws_account_id>",
            seller_region="us-west-1",
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<service_profile_uuid>",
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "token2aws", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
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
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<aws_account_id>"),
					SellerRegion:      pulumi.String("us-west-1"),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<service_profile_uuid>"),
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
    var token2Aws = new Equinix.Fabric.Connection("token2aws", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Bandwidth = 50,
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
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<aws_account_id>",
                SellerRegion = "us-west-1",
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<service_profile_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideServiceTokenArgs;
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
        var token2Aws = new Connection("token2Aws", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
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
                    .type("SP")
                    .authenticationKey("<aws_account_id>")
                    .sellerRegion("us-west-1")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<service_profile_uuid>")
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
  token2aws:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        serviceToken:
          uuid: <service_token_uuid>
      zSide:
        accessPoint:
          type: SP
          authenticationKey: <aws_account_id>
          sellerRegion: us-west-1
          profile:
            type: L2_PROFILE
            uuid: <service_profile_uuid>
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 12
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Network = new equinix.fabric.Connection("fcr2network", {
    name: "ConnectionName",
    type: "IPWAN_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: "CLOUD_ROUTER",
            router: {
                uuid: "<cloud_router_uuid>",
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Network,
            network: {
                uuid: "<network_uuid>",
            },
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

fcr2_network = equinix.fabric.Connection("fcr2network",
    name="ConnectionName",
    type="IPWAN_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="CLOUD_ROUTER",
            router=equinix.fabric.ConnectionASideAccessPointRouterArgs(
                uuid="<cloud_router_uuid>",
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.NETWORK,
            network=equinix.fabric.ConnectionZSideAccessPointNetworkArgs(
                uuid="<network_uuid>",
            ),
        ),
    ))
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
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("IPWAN_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("CLOUD_ROUTER"),
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.String("<cloud_router_uuid>"),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
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
    var fcr2Network = new Equinix.Fabric.Connection("fcr2network", new()
    {
        Name = "ConnectionName",
        Type = "IPWAN_VC",
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
        Bandwidth = 50,
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
                    Uuid = "<cloud_router_uuid>",
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Network,
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
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
            .name("ConnectionName")
            .type("IPWAN_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid("<cloud_router_uuid>")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("NETWORK")
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .build())
                .build())
            .build());

    }
}
```
```yaml
  fcr2network:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: IPWAN_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: CLOUD_ROUTER
          router:
            uuid: <cloud_router_uuid>
      zSide:
        accessPoint:
          type: NETWORK
          network:
            uuid: <network_uuid>
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Aws = new equinix.fabric.Connection("port2aws", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    redundancy: {
        priority: "PRIMARY",
    },
    order: {
        purchaseOrderNumber: "1-323929",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 2019,
                vlanCTag: 2112,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<aws_account_id>",
            sellerRegion: "us-west-1",
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
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
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    redundancy=equinix.fabric.ConnectionRedundancyArgs(
        priority="PRIMARY",
    ),
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323929",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                vlan_s_tag=2019,
                vlan_c_tag=2112,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<aws_account_id>",
            seller_region="us-west-1",
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<service_profile_uuid>",
            ),
            location=equinix.fabric.ConnectionZSideAccessPointLocationArgs(
                metro_code=equinix.Metro.SILICON_VALLEY,
            ),
        ),
    ),
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
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323929"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(2019),
						VlanCTag: pulumi.Int(2112),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<aws_account_id>"),
					SellerRegion:      pulumi.String("us-west-1"),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<service_profile_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
				},
			},
			AdditionalInfo: pulumi.MapArray{
				pulumi.Map{
					"key":   pulumi.Any("accessKey"),
					"value": pulumi.Any("<aws_access_key>"),
				},
				pulumi.Map{
					"key":   pulumi.Any("secretKey"),
					"value": pulumi.Any("<aws_secret_key>"),
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
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Bandwidth = 50,
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
                Type = Equinix.Fabric.AccessPointType.Colo,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<aws_account_id>",
                SellerRegion = "us-west-1",
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<service_profile_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
            },
        },
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
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
            .name("ConnectionName")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323929")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag("2019")
                        .vlanCTag("2112")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<aws_account_id>")
                    .sellerRegion("us-west-1")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<service_profile_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .build())
                .build())
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
  port2aws:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      redundancy:
        priority: PRIMARY
      order:
        purchaseOrderNumber: 1-323929
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '2019'
            vlanCTag: '2112'
      zSide:
        accessPoint:
          type: SP
          authenticationKey: <aws_account_id>
          sellerRegion: us-west-1
          profile:
            type: L2_PROFILE
            uuid: <service_profile_uuid>
          location:
            metroCode: SV
      additionalInfo:
        - key: accessKey
          value: <aws_access_key>
        - key: secretKey
          value: <aws_secret_key>
```
{{% /example %}}

{{% example %}}
### example 6
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Token = new equinix.fabric.Connection("vd2token", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "NETWORK",
                id: 7,
            },
        },
    },
    zSide: {
        serviceToken: {
            uuid: "<service_token_uuid>",
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_token = equinix.fabric.Connection("vd2token",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="NETWORK",
                id=7,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        service_token=equinix.fabric.ConnectionZSideServiceTokenArgs(
            uuid="<service_token_uuid>",
        ),
    ))
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
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("NETWORK"),
						Id:   pulumi.Int(7),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				ServiceToken: &fabric.ConnectionZSideServiceTokenArgs{
					Uuid: pulumi.String("<service_token_uuid>"),
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
    var vd2Token = new Equinix.Fabric.Connection("vd2token", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionZSideServiceTokenArgs
            {
                Uuid = "<service_token_uuid>",
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
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
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
        var vd2Token = new Connection("vd2Token", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("NETWORK")
                        .id(7)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .serviceToken(ConnectionZSideServiceTokenArgs.builder()
                    .uuid("<service_token_uuid>")
                    .build())
                .build())
            .build());

    }
}
```
```yaml
  vd2token:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: NETWORK
            id: 7
      zSide:
        serviceToken:
          uuid: <service_token_uuid>
```
{{% /example %}}

{{% example %}}
### example 4
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const accessEplVc = new equinix.fabric.Connection("accessEplVc", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.AccessEPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 1976,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<zside_port_uuid>",
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

access_epl_vc = equinix.fabric.Connection("accessEplVc",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.ACCESS_EPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                vlan_s_tag=1976,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<zside_port_uuid>",
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "accessEplVc", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeAccessEPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(1976),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
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
    var accessEplVc = new Equinix.Fabric.Connection("accessEplVc", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.AccessEPL,
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 1976,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<zside_port_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
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
        var accessEplVc = new Connection("accessEplVc", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("ACCESS_EPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag("1976")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
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
  accessEplVc:
    type: equinix:fabric:Connection
    name: access_epl_vc
    properties:
      name: ConnectionName
      type: ACCESS_EPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '1976'
      zSide:
        accessPoint:
          type: COLO
          port:
            uuid: <zside_port_uuid>
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 5
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Port = new equinix.fabric.Connection("vd2port", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "NETWORK",
                id: 7,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
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
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_port = equinix.fabric.Connection("vd2port",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="NETWORK",
                id=7,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<zside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionZSideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                vlan_s_tag=3711,
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2port", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("NETWORK"),
						Id:   pulumi.Int(7),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
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
    var vd2Port = new Equinix.Fabric.Connection("vd2port", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
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
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
            .name("ConnectionName")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("NETWORK")
                        .id(7)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanSTag("3711")
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
  vd2port:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: NETWORK
            id: 7
      zSide:
        accessPoint:
          type: COLO
          port:
            uuid: <zside_port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanSTag: '3711'
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 10
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Azure = new equinix.fabric.Connection("vd2azure", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
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

vd2_azure = equinix.fabric.Connection("vd2azure",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="CLOUD",
                id=7,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<Azure_ExpressRouter_Auth_Key>",
            peering_type=equinix.fabric.AccessPointPeeringType.PRIVATE,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<Azure_Service_Profile_UUID>",
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2azure", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
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
    var vd2Azure = new Equinix.Fabric.Connection("vd2azure", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
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
        var vd2Azure = new Connection("vd2Azure", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
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
  vd2azure:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 7
      zSide:
        accessPoint:
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Port = new equinix.fabric.Connection("port2port", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 1976,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
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
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

port2_port = equinix.fabric.Connection("port2port",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EVPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                vlan_s_tag=1976,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<zside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionZSideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.QIN_Q,
                vlan_s_tag=3711,
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "port2port", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(1976),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
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
    var port2Port = new Equinix.Fabric.Connection("port2port", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 1976,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
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
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
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
            .name("ConnectionName")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag("1976")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("QINQ")
                        .vlanSTag("3711")
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
  port2port:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '1976'
      zSide:
        accessPoint:
          type: COLO
          port:
            uuid: <zside_port_uuid>
          linkProtocol:
            type: QINQ
            vlanSTag: '3711'
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 14
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const epl = new equinix.fabric.Connection("epl", {
    name: "ConnectionName",
    type: "EPLAN_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Network,
            network: {
                uuid: "<network_uuid>",
            },
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

epl = equinix.fabric.Connection("epl",
    name="ConnectionName",
    type="EPLAN_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.NETWORK,
            network=equinix.fabric.ConnectionZSideAccessPointNetworkArgs(
                uuid="<network_uuid>",
            ),
        ),
    ))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "epl", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("EPLAN_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
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
    var epl = new Equinix.Fabric.Connection("epl", new()
    {
        Name = "ConnectionName",
        Type = "EPLAN_VC",
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Network,
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
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
            .name("ConnectionName")
            .type("EPLAN_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("NETWORK")
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .build())
                .build())
            .build());

    }
}
```
```yaml
  epl:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EPLAN_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: <aside_port_uuid>
      zSide:
        accessPoint:
          type: NETWORK
          network:
            uuid: <network_uuid>
```
{{% /example %}}

{{% example %}}
### example 3
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const epl = new equinix.fabric.Connection("epl", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<zside_port_uuid>",
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

epl = equinix.fabric.Connection("epl",
    name="ConnectionName",
    type=equinix.fabric.ConnectionType.EPL,
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<zside_port_uuid>",
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "epl", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
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
    var epl = new Equinix.Fabric.Connection("epl", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EPL,
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = "<zside_port_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
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
        var epl = new Connection("epl", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<zside_port_uuid>")
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
  epl:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EPL_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: <aside_port_uuid>
      zSide:
        accessPoint:
          type: COLO
          port:
            uuid: <zside_port_uuid>
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 15
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const epl = new equinix.fabric.Connection("epl", {
    name: "ConnectionName",
    type: "EVPLAN_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanSTag: 1976,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Network,
            network: {
                uuid: "<network_uuid>",
            },
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

epl = equinix.fabric.Connection("epl",
    name="ConnectionName",
    type="EVPLAN_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionASideAccessPointPortArgs(
                uuid="<aside_port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionASideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                vlan_s_tag=1976,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.NETWORK,
            network=equinix.fabric.ConnectionZSideAccessPointNetworkArgs(
                uuid="<network_uuid>",
            ),
        ),
    ))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "epl", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("EVPLAN_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanSTag: pulumi.Int(1976),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
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
    var epl = new Equinix.Fabric.Connection("epl", new()
    {
        Name = "ConnectionName",
        Type = "EVPLAN_VC",
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanSTag = 1976,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Network,
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
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
            .name("ConnectionName")
            .type("EVPLAN_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid("<aside_port_uuid>")
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanSTag("1976")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("NETWORK")
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .build())
                .build())
            .build());

    }
}
```
```yaml
  epl:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPLAN_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: COLO
          port:
            uuid: <aside_port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanSTag: '1976'
      zSide:
        accessPoint:
          type: NETWORK
          network:
            uuid: <network_uuid>
```
{{% /example %}}

{{% example %}}
### example 8
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Port = new equinix.fabric.Connection("fcr2port", {
    name: "ConnectionName",
    type: "IP_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: "CLOUD_ROUTER",
            router: {
                uuid: "<cloud_router_uuid>",
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
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
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

fcr2_port = equinix.fabric.Connection("fcr2port",
    name="ConnectionName",
    type="IP_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="CLOUD_ROUTER",
            router=equinix.fabric.ConnectionASideAccessPointRouterArgs(
                uuid="<cloud_router_uuid>",
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.COLO,
            port=equinix.fabric.ConnectionZSideAccessPointPortArgs(
                uuid="<port_uuid>",
            ),
            link_protocol=equinix.fabric.ConnectionZSideAccessPointLinkProtocolArgs(
                type=equinix.fabric.AccessPointLinkProtocolType.DOT1Q,
                vlan_tag=2711,
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "fcr2port", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("IP_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("CLOUD_ROUTER"),
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.String("<cloud_router_uuid>"),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
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
    var fcr2Port = new Equinix.Fabric.Connection("fcr2port", new()
    {
        Name = "ConnectionName",
        Type = "IP_VC",
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
        Bandwidth = 50,
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
                    Uuid = "<cloud_router_uuid>",
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
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
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLinkProtocolArgs;
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
        var fcr2Port = new Connection("fcr2Port", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("IP_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid("<cloud_router_uuid>")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid("<port_uuid>")
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag("2711")
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
  fcr2port:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: IP_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: CLOUD_ROUTER
          router:
            uuid: <cloud_router_uuid>
      zSide:
        accessPoint:
          type: COLO
          port:
            uuid: <port_uuid>
          linkProtocol:
            type: DOT1Q
            vlanTag: '2711'
          location:
            metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 13
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Token = new equinix.fabric.Connection("vd2token", {
    name: "ConnectionName",
    type: "EVPLAN_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Network,
            network: {
                uuid: "<network_uuid>",
            },
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

vd2_token = equinix.fabric.Connection("vd2token",
    name="ConnectionName",
    type="EVPLAN_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type=equinix.fabric.AccessPointType.VD,
            virtual_device=equinix.fabric.ConnectionASideAccessPointVirtualDeviceArgs(
                type="EDGE",
                uuid="<device_uuid>",
            ),
            interface=equinix.fabric.ConnectionASideAccessPointInterfaceArgs(
                type="CLOUD",
                id=7,
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.NETWORK,
            network=equinix.fabric.ConnectionZSideAccessPointNetworkArgs(
                uuid="<network_uuid>",
            ),
        ),
    ))
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
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("EVPLAN_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
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
    var vd2Token = new Equinix.Fabric.Connection("vd2token", new()
    {
        Name = "ConnectionName",
        Type = "EVPLAN_VC",
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
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
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Network,
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointNetworkArgs;
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
            .name("ConnectionName")
            .type("EVPLAN_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("NETWORK")
                    .network(ConnectionZSideAccessPointNetworkArgs.builder()
                        .uuid("<network_uuid>")
                        .build())
                    .build())
                .build())
            .build());

    }
}
```
```yaml
  vd2token:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: EVPLAN_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: VD
          virtualDevice:
            type: EDGE
            uuid: <device_uuid>
          interface:
            type: CLOUD
            id: 7
      zSide:
        accessPoint:
          type: NETWORK
          network:
            uuid: <network_uuid>
```
{{% /example %}}

{{% example %}}
### example 9
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Azure = new equinix.fabric.Connection("fcr2azure", {
    name: "ConnectionName",
    type: "IP_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: "CLOUD_ROUTER",
            router: {
                uuid: "<cloud_router_uuid>",
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
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

fcr2_azure = equinix.fabric.Connection("fcr2azure",
    name="ConnectionName",
    type="IP_VC",
    notifications=[equinix.fabric.ConnectionNotificationArgs(
        type=equinix.fabric.NotificationsType.ALL,
        emails=[
            "example@equinix.com",
            "test1@equinix.com",
        ],
    )],
    bandwidth=50,
    order=equinix.fabric.ConnectionOrderArgs(
        purchase_order_number="1-323292",
    ),
    a_side=equinix.fabric.ConnectionASideArgs(
        access_point=equinix.fabric.ConnectionASideAccessPointArgs(
            type="CLOUD_ROUTER",
            router=equinix.fabric.ConnectionASideAccessPointRouterArgs(
                uuid="<cloud_router_uuid>",
            ),
        ),
    ),
    z_side=equinix.fabric.ConnectionZSideArgs(
        access_point=equinix.fabric.ConnectionZSideAccessPointArgs(
            type=equinix.fabric.AccessPointType.SP,
            authentication_key="<Azure_ExpressRouter_Auth_Key>",
            peering_type=equinix.fabric.AccessPointPeeringType.PRIVATE,
            profile=equinix.fabric.ConnectionZSideAccessPointProfileArgs(
                type=equinix.fabric.ProfileType.L2_PROFILE,
                uuid="<Azure_Service_Profile_UUID>",
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
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "fcr2azure", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("IP_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("CLOUD_ROUTER"),
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.String("<cloud_router_uuid>"),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
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
    var fcr2Azure = new Equinix.Fabric.Connection("fcr2azure", new()
    {
        Name = "ConnectionName",
        Type = "IP_VC",
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
        Bandwidth = 50,
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
                    Uuid = "<cloud_router_uuid>",
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
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
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
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
        var fcr2Azure = new Connection("fcr2Azure", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("IP_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid("<cloud_router_uuid>")
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
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
  fcr2azure:
    type: equinix:fabric:Connection
    properties:
      name: ConnectionName
      type: IP_VC
      notifications:
        - type: ALL
          emails:
            - example@equinix.com
            - test1@equinix.com
      bandwidth: 50
      order:
        purchaseOrderNumber: 1-323292
      aSide:
        accessPoint:
          type: CLOUD_ROUTER
          router:
            uuid: <cloud_router_uuid>
      zSide:
        accessPoint:
          type: SP
          authenticationKey: <Azure_ExpressRouter_Auth_Key>
          peeringType: PRIVATE
          profile:
            type: L2_PROFILE
            uuid: <Azure_Service_Profile_UUID>
          location:
            metroCode: SV
```
{{% /example %}}


