## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const order = new equinix.fabric.Port("order", {
    type: "XF_PORT",
    connectivitySourceType: "COLO",
    location: {
        metroCode: "TR",
    },
    settings: {
        packageType: "STANDARD",
        sharedPortType: false,
    },
    encapsulation: {
        type: "DOT1Q",
        tagProtocolId: "33024",
    },
    account: {
        accountNumber: "<account_number>",
    },
    project: {
        projectId: "<project_id>",
    },
    redundancy: {
        priority: "PRIMARY",
    },
    lagEnabled: true,
    physicalPorts: [{
        type: "XF_PHYSICAL_PORT",
        demarcationPoint: {
            ibx: "TR2",
            cageUniqueSpaceId: "TR2:01:002087",
            cabinetUniqueSpaceId: "Demarc",
            patchPanel: "PP:Demarc:00002087",
            connectorType: "SC",
        },
    }],
    physicalPortsSpeed: 1000,
    physicalPortsType: "1000BASE_LX",
    physicalPortsCount: 1,
    demarcationPointIbx: "TR2",
    notifications: [
        {
            type: "TECHNICAL",
            registeredUsers: ["<username>"],
        },
        {
            type: "NOTIFICATION",
            registeredUsers: ["<username>"],
        },
    ],
    additionalInfos: [{
        key: "lagType",
        value: "New",
    }],
});
```
```python
import pulumi
import pulumi_equinix as equinix

order = equinix.fabric.Port("order",
    type="XF_PORT",
    connectivity_source_type="COLO",
    location={
        "metro_code": "TR",
    },
    settings={
        "package_type": "STANDARD",
        "shared_port_type": False,
    },
    encapsulation={
        "type": "DOT1Q",
        "tag_protocol_id": "33024",
    },
    account={
        "account_number": "<account_number>",
    },
    project={
        "project_id": "<project_id>",
    },
    redundancy={
        "priority": "PRIMARY",
    },
    lag_enabled=True,
    physical_ports=[{
        "type": "XF_PHYSICAL_PORT",
        "demarcation_point": {
            "ibx": "TR2",
            "cage_unique_space_id": "TR2:01:002087",
            "cabinet_unique_space_id": "Demarc",
            "patch_panel": "PP:Demarc:00002087",
            "connector_type": "SC",
        },
    }],
    physical_ports_speed=1000,
    physical_ports_type="1000BASE_LX",
    physical_ports_count=1,
    demarcation_point_ibx="TR2",
    notifications=[
        {
            "type": "TECHNICAL",
            "registered_users": ["<username>"],
        },
        {
            "type": "NOTIFICATION",
            "registered_users": ["<username>"],
        },
    ],
    additional_infos=[{
        "key": "lagType",
        "value": "New",
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
		_, err := fabric.NewPort(ctx, "order", &fabric.PortArgs{
			Type:                   pulumi.String("XF_PORT"),
			ConnectivitySourceType: pulumi.String("COLO"),
			Location: &fabric.PortLocationArgs{
				MetroCode: pulumi.String("TR"),
			},
			Settings: &fabric.PortSettingsArgs{
				PackageType:    pulumi.String("STANDARD"),
				SharedPortType: pulumi.Bool(false),
			},
			Encapsulation: &fabric.PortEncapsulationArgs{
				Type:          pulumi.String("DOT1Q"),
				TagProtocolId: pulumi.String("33024"),
			},
			Account: &fabric.PortAccountArgs{
				AccountNumber: pulumi.Int("<account_number>"),
			},
			Project: &fabric.PortProjectArgs{
				ProjectId: pulumi.String("<project_id>"),
			},
			Redundancy: &fabric.PortRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			LagEnabled: pulumi.Bool(true),
			PhysicalPorts: fabric.PortPhysicalPortArray{
				&fabric.PortPhysicalPortArgs{
					Type: pulumi.String("XF_PHYSICAL_PORT"),
					DemarcationPoint: &fabric.PortPhysicalPortDemarcationPointArgs{
						Ibx:                  pulumi.String("TR2"),
						CageUniqueSpaceId:    pulumi.String("TR2:01:002087"),
						CabinetUniqueSpaceId: pulumi.String("Demarc"),
						PatchPanel:           pulumi.String("PP:Demarc:00002087"),
						ConnectorType:        pulumi.String("SC"),
					},
				},
			},
			PhysicalPortsSpeed:  pulumi.Int(1000),
			PhysicalPortsType:   pulumi.String("1000BASE_LX"),
			PhysicalPortsCount:  pulumi.Int(1),
			DemarcationPointIbx: pulumi.String("TR2"),
			Notifications: fabric.PortNotificationArray{
				&fabric.PortNotificationArgs{
					Type: pulumi.String("TECHNICAL"),
					RegisteredUsers: pulumi.StringArray{
						pulumi.String("<username>"),
					},
				},
				&fabric.PortNotificationArgs{
					Type: pulumi.String("NOTIFICATION"),
					RegisteredUsers: pulumi.StringArray{
						pulumi.String("<username>"),
					},
				},
			},
			AdditionalInfos: fabric.PortAdditionalInfoArray{
				&fabric.PortAdditionalInfoArgs{
					Key:   pulumi.String("lagType"),
					Value: pulumi.String("New"),
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
    var order = new Equinix.Fabric.Port("order", new()
    {
        Type = "XF_PORT",
        ConnectivitySourceType = "COLO",
        Location = new Equinix.Fabric.Inputs.PortLocationArgs
        {
            MetroCode = "TR",
        },
        Settings = new Equinix.Fabric.Inputs.PortSettingsArgs
        {
            PackageType = "STANDARD",
            SharedPortType = false,
        },
        Encapsulation = new Equinix.Fabric.Inputs.PortEncapsulationArgs
        {
            Type = "DOT1Q",
            TagProtocolId = "33024",
        },
        Account = new Equinix.Fabric.Inputs.PortAccountArgs
        {
            AccountNumber = "<account_number>",
        },
        Project = new Equinix.Fabric.Inputs.PortProjectArgs
        {
            ProjectId = "<project_id>",
        },
        Redundancy = new Equinix.Fabric.Inputs.PortRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        LagEnabled = true,
        PhysicalPorts = new[]
        {
            new Equinix.Fabric.Inputs.PortPhysicalPortArgs
            {
                Type = "XF_PHYSICAL_PORT",
                DemarcationPoint = new Equinix.Fabric.Inputs.PortPhysicalPortDemarcationPointArgs
                {
                    Ibx = "TR2",
                    CageUniqueSpaceId = "TR2:01:002087",
                    CabinetUniqueSpaceId = "Demarc",
                    PatchPanel = "PP:Demarc:00002087",
                    ConnectorType = "SC",
                },
            },
        },
        PhysicalPortsSpeed = 1000,
        PhysicalPortsType = "1000BASE_LX",
        PhysicalPortsCount = 1,
        DemarcationPointIbx = "TR2",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.PortNotificationArgs
            {
                Type = "TECHNICAL",
                RegisteredUsers = new[]
                {
                    "<username>",
                },
            },
            new Equinix.Fabric.Inputs.PortNotificationArgs
            {
                Type = "NOTIFICATION",
                RegisteredUsers = new[]
                {
                    "<username>",
                },
            },
        },
        AdditionalInfos = new[]
        {
            new Equinix.Fabric.Inputs.PortAdditionalInfoArgs
            {
                Key = "lagType",
                Value = "New",
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
import com.equinix.pulumi.equinix.fabric.Port;
import com.equinix.pulumi.equinix.fabric.PortArgs;
import com.pulumi.equinix.fabric.inputs.PortLocationArgs;
import com.pulumi.equinix.fabric.inputs.PortSettingsArgs;
import com.pulumi.equinix.fabric.inputs.PortEncapsulationArgs;
import com.pulumi.equinix.fabric.inputs.PortAccountArgs;
import com.pulumi.equinix.fabric.inputs.PortProjectArgs;
import com.pulumi.equinix.fabric.inputs.PortRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.PortPhysicalPortArgs;
import com.pulumi.equinix.fabric.inputs.PortPhysicalPortDemarcationPointArgs;
import com.pulumi.equinix.fabric.inputs.PortNotificationArgs;
import com.pulumi.equinix.fabric.inputs.PortAdditionalInfoArgs;
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
        var order = new Port("order", PortArgs.builder()
            .type("XF_PORT")
            .connectivitySourceType("COLO")
            .location(PortLocationArgs.builder()
                .metroCode("TR")
                .build())
            .settings(PortSettingsArgs.builder()
                .packageType("STANDARD")
                .sharedPortType(false)
                .build())
            .encapsulation(PortEncapsulationArgs.builder()
                .type("DOT1Q")
                .tagProtocolId("33024")
                .build())
            .account(PortAccountArgs.builder()
                .accountNumber("<account_number>")
                .build())
            .project(PortProjectArgs.builder()
                .projectId("<project_id>")
                .build())
            .redundancy(PortRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .lagEnabled(true)
            .physicalPorts(PortPhysicalPortArgs.builder()
                .type("XF_PHYSICAL_PORT")
                .demarcationPoint(PortPhysicalPortDemarcationPointArgs.builder()
                    .ibx("TR2")
                    .cageUniqueSpaceId("TR2:01:002087")
                    .cabinetUniqueSpaceId("Demarc")
                    .patchPanel("PP:Demarc:00002087")
                    .connectorType("SC")
                    .build())
                .build())
            .physicalPortsSpeed(1000)
            .physicalPortsType("1000BASE_LX")
            .physicalPortsCount(1)
            .demarcationPointIbx("TR2")
            .notifications(            
                PortNotificationArgs.builder()
                    .type("TECHNICAL")
                    .registeredUsers("<username>")
                    .build(),
                PortNotificationArgs.builder()
                    .type("NOTIFICATION")
                    .registeredUsers("<username>")
                    .build())
            .additionalInfos(PortAdditionalInfoArgs.builder()
                .key("lagType")
                .value("New")
                .build())
            .build());

    }
}
```
```yaml
resources:
  order:
    type: equinix:fabric:Port
    properties:
      type: XF_PORT
      connectivitySourceType: COLO
      location:
        metroCode: TR
      settings:
        packageType: STANDARD
        sharedPortType: false
      encapsulation:
        type: DOT1Q
        tagProtocolId: 0x8100
      account:
        accountNumber: <account_number>
      project:
        projectId: <project_id>
      redundancy:
        priority: PRIMARY
      lagEnabled: true
      physicalPorts:
        - type: XF_PHYSICAL_PORT
          demarcationPoint:
            ibx: TR2
            cageUniqueSpaceId: TR2:01:002087
            cabinetUniqueSpaceId: Demarc
            patchPanel: PP:Demarc:00002087
            connectorType: SC
      physicalPortsSpeed: 1000
      physicalPortsType: 1000BASE_LX
      physicalPortsCount: 1
      demarcationPointIbx: TR2
      notifications:
        - type: TECHNICAL
          registeredUsers:
            - <username>
        - type: NOTIFICATION
          registeredUsers:
            - <username>
      additionalInfos:
        - key: lagType
          value: New
```
{{% /example %}}
