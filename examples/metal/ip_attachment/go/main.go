package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewReservedIpBlock(ctx, "myblock", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("ny"),
			Quantity:  pulumi.Int(2),
		})
		if err != nil {
			return err
		}
		invokeJoin, err := std.Join(ctx, &std.JoinArgs{
			Separator: "/",
			Input: []*string{
				std.Cidrhost(ctx, &std.CidrhostArgs{
					Input: myblockMetalReservedIpBlock.CidrNotation,
					Host:  0,
				}, nil).Result,
				"32",
			},
		}, nil)
		if err != nil {
			return err
		}
		_, err = metal.NewIpAttachment(ctx, "firstAddressAssignment", &metal.IpAttachmentArgs{
			DeviceId:     pulumi.Any(mydevice.Id),
			CidrNotation: invokeJoin.Result,
		})
		if err != nil {
			return err
		}
		return nil
	})
}
