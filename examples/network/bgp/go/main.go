package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bgp, err := networkedge.NewBgp(ctx, "bgp", &networkedge.BgpArgs{
			ConnectionId:      pulumi.String("54014acf-9730-4b55-a791-459283d05fb1"),
			LocalIpAddress:    pulumi.String("10.1.1.1/30"),
			LocalAsn:          pulumi.Int(12345),
			RemoteIpAddress:   pulumi.String("10.1.1.2"),
			RemoteAsn:         pulumi.Int(66123),
			AuthenticationKey: pulumi.String("secret"),
		})
		if err != nil {
			return err
		}
		ctx.Export("state", bgp.State)
		ctx.Export("provisioningStatus", bgp.ProvisioningStatus)
		return nil
	})
}
