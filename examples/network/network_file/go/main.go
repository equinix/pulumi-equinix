package main

import (
	"os"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func readFileOrPanic(path string) pulumi.StringPtrInput {
	data, err := os.ReadFile(path)
	if err != nil {
		panic(err.Error())
	}
	return pulumi.String(string(data))
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		networkFile, err := networkedge.NewNetworkFile(ctx, "networkFile", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("Aviatrix-ZTP-file"),
			Content:        readFileOrPanic("./../assets/aviatrix-cloud-init.txt"),
			MetroCode:      pulumi.String(metro),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
			ProcessType:    pulumi.String("CLOUD_INIT"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		ctx.Export("networkFileId", networkFile.ID())
		ctx.Export("networkFileStatus", networkFile.Status)
		return nil
	})
}
