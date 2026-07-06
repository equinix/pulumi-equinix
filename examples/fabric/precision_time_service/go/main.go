package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("eptServiceId", ptp.Id)
		ctx.Export("eptServiceName", ptp.Name)
		ctx.Export("eptServiceState", ptp.State)
		ctx.Export("eptServiceType", ptp.Type)
		ctx.Export("eptServiceConnection", ptp.Connections)
		ctx.Export("eptServiceIpv4", ptp.Ipv4)
		return nil
	})
}
