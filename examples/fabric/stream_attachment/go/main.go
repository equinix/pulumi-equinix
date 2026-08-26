package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewStreamAttachment(ctx, "asset", &fabric.StreamAttachmentArgs{
			AssetId:  pulumi.String("<id_of_the_asset_being_attached>"),
			Asset:    pulumi.String("<asset_group>"),
			StreamId: pulumi.String("<id_of_the_stream_asset_is_being_attached_to>"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
