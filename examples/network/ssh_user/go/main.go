package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewSshUser(ctx, "john", &networkedge.SshUserArgs{
			Username: pulumi.String("john"),
			Password: pulumi.String("secret"),
			DeviceIds: pulumi.StringArray{
				pulumi.String("csr1000v-ha-uuid"),
				pulumi.String("csr1000v-ha-redundant-uuid"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
