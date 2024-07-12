package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProject(ctx, "tfProject1", &metal.ProjectArgs{
			Name: pulumi.String("tftest"),
			BgpConfig: &metal.ProjectBgpConfigArgs{
				DeploymentType: pulumi.String("local"),
				Md5:            pulumi.String("C179c28c41a85b"),
				Asn:            pulumi.Int(65000),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
