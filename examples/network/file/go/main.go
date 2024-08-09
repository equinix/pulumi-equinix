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
		filepath := "fileFolder/fileName.txt"
		if param := cfg.Get("filepath"); param != "" {
			filepath = param
		}
		invokeFile, err := std.File(ctx, &std.FileArgs{
			Input: filepath,
		}, nil)
		if err != nil {
			return err
		}
		_, err = networkedge.NewNetworkFile(ctx, "test-file", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("fileName.txt"),
			Content:        pulumi.String(invokeFile.Result),
			MetroCode:      pulumi.String(equinix.MetroSiliconValley),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
