package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		newStream, err := fabric.NewStream(ctx, "newStream", &fabric.StreamArgs{
			Type:        pulumi.String("TELEMETRY_STREAM"),
			Name:        pulumi.String("<name_of_stream_resource>"),
			Description: pulumi.String("<description_of_stream_resource>"),
			Project: &fabric.StreamProjectArgs{
				ProjectId: pulumi.String("<destination_project_id_for_stream"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("streamState", newStream.State)
		return nil
	})
}
