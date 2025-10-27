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
