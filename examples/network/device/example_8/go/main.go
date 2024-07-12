package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			Name:      pulumi.StringRef("account-name"),
			MetroCode: "SV",
		}, nil)
		if err != nil {
			return err
		}
		invokeFile, err := std.File(ctx, &std.FileArgs{
			Input: filepath,
		}, nil)
		if err != nil {
			return err
		}
		bluecatEdgeServicePointCloudinitPrimaryFile, err := networkedge.NewNetworkFile(ctx, "bluecatEdgeServicePointCloudinitPrimaryFile", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("TF-BLUECAT-ESP-cloud-init-file.txt"),
			Content:        invokeFile.Result,
			MetroCode:      sv.MetroCode.ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("BLUECAT-EDGE-SERVICE-POINT"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		invokeFile1, err := std.File(ctx, &std.FileArgs{
			Input: filepath,
		}, nil)
		if err != nil {
			return err
		}
		bluecatEdgeServicePointCloudinitSecondaryFile, err := networkedge.NewNetworkFile(ctx, "bluecatEdgeServicePointCloudinitSecondaryFile", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("TF-BLUECAT-ESP-cloud-init-file.txt"),
			Content:        invokeFile1.Result,
			MetroCode:      sv.MetroCode.ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("BLUECAT-EDGE-SERVICE-POINT"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "bluecatEdgeServicePointHa", &networkedge.DeviceArgs{
			Name:         pulumi.String("tf-bluecat-edge-service-point-p"),
			MetroCode:    pulumi.String(sv.MetroCode),
			TypeCode:     pulumi.String("BLUECAT-EDGE-SERVICE-POINT"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			AccountNumber:   pulumi.String(sv.Number),
			CloudInitFileId: bluecatEdgeServicePointCloudinitPrimaryFile.Uuid,
			Version:         pulumi.String("4.6.3"),
			CoreCount:       pulumi.Int(4),
			TermLength:      pulumi.Int(12),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name:      pulumi.String("tf-bluecat-edge-service-point-s"),
				MetroCode: pulumi.String(sv.MetroCode),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				AccountNumber:   pulumi.String(sv.Number),
				CloudInitFileId: bluecatEdgeServicePointCloudinitSecondaryFile.Uuid,
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
