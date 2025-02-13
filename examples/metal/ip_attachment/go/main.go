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
		_, err = metal.NewIpAttachment(ctx, "firstAddressAssignment", &metal.IpAttachmentArgs{
			DeviceId: pulumi.Any(mydevice.Id),
			CidrNotation: pulumi.String(std.JoinOutput(ctx, std.JoinOutputArgs{
				Separator: pulumi.String("/"),
				Input: pulumi.StringArray{
					std.CidrhostOutput(ctx, std.CidrhostOutputArgs{
						Input: pulumi.Any(myblockMetalReservedIpBlock.CidrNotation),
						Host:  pulumi.Int(0),
					}, nil).ApplyT(func(invoke std.CidrhostResult) (*string, error) {
						return invoke.Result, nil
					}).(pulumi.StringPtrOutput),
					pulumi.String("32"),
				},
			}, nil).ApplyT(func(invoke std.JoinResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
