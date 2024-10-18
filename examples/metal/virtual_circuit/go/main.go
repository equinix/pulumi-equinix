package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		projectId := "52000fb2-ee46-4673-93a8-de2c2bdba33c"
		connId := "73f12f29-3e19-43a0-8e90-ae81580db1e0"
		test := metal.LookupInterconnectionOutput(ctx, metal.GetInterconnectionOutputArgs{
			ConnectionId: pulumi.String(connId),
		}, nil)
		testVlan, err := metal.NewVlan(ctx, "testVlan", &metal.VlanArgs{
			ProjectId: pulumi.String(projectId),
			Metro: pulumi.String(test.ApplyT(func(test metal.GetInterconnectionResult) (*string, error) {
				return &test.Metro, nil
			}).(pulumi.StringPtrOutput)),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewVirtualCircuit(ctx, "testVirtualCircuit", &metal.VirtualCircuitArgs{
			ConnectionId: pulumi.String(connId),
			ProjectId:    pulumi.String(projectId),
			PortId: pulumi.String(test.ApplyT(func(test metal.GetInterconnectionResult) (*string, error) {
				return &test.Ports[0].Id, nil
			}).(pulumi.StringPtrOutput)),
			VlanId:  testVlan.ID(),
			NniVlan: pulumi.Int(1056),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
