package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewProject(ctx, "example", &metal.ProjectArgs{
			Name: pulumi.String("example"),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewVrf(ctx, "exampleVrf", &metal.VrfArgs{
			Description: pulumi.String("VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25"),
			Name:        pulumi.String("example-vrf"),
			Metro:       pulumi.String("da"),
			LocalAsn:    pulumi.Int(65000),
			IpRanges: pulumi.StringArray{
				pulumi.String("192.168.100.0/25"),
				pulumi.String("192.168.200.0/25"),
			},
			ProjectId: example.ID(),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
