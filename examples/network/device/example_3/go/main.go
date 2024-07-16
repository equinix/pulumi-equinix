package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		filepath := "cloudInitFileFolder/TF-AVX-cloud-init-file.txt"
		if param := cfg.Get("filepath"); param != "" {
			filepath = param
		}
		sv, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
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
		aviatrixCloudinitFile, err := networkedge.NewNetworkFile(ctx, "aviatrixCloudinitFile", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("TF-AVX-cloud-init-file.txt"),
			Content:        invokeFile.Result,
			MetroCode:      sv.MetroCode.ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "aviatrixSingle", &networkedge.DeviceArgs{
			Name:        pulumi.String("tf-aviatrix"),
			MetroCode:   pulumi.String(sv.MetroCode),
			TypeCode:    pulumi.String("AVIATRIX_EDGE"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
			},
			TermLength:      pulumi.Int(12),
			AccountNumber:   pulumi.String(sv.Number),
			Version:         pulumi.String("6.9"),
			CoreCount:       pulumi.Int(2),
			CloudInitFileId: aviatrixCloudinitFile.Uuid,
			AclTemplateId:   pulumi.String("c06150ea-b604-4ad1-832a-d63936e9b938"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
