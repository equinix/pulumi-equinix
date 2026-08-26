package main

import (
	"fmt"

	"github.com/pulumi/pulumi-null/sdk/go/null"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bgpPassword := "955dB0b81Ef"
		_ := "<UUID_of_your_project>"
		interfaceLo0 := fmt.Sprintf("auto lo:0\niface lo:0 inet static\n   address %v\n   netmask %v\n", addr.Address, addr.Netmask)
		birdConf := fmt.Sprintf(`filter equinix_metal_bgp {
    if net = %v/%v then accept;
}
router id %v;
protocol direct {
    interface "lo";
}
protocol kernel {
    scan time 10;
    persist;
    import all;
    export all;
}
protocol device {
    scan time 10;
}
protocol bgp {
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor %v as 65530;
    password "%v";
}
`, addr.Address, addr.Cidr, test.Network[2].Address, test.Network[2].Gateway, bgpPassword)
		_, err := null.NewResource(ctx, "configure_bird", &null.ResourceArgs{
			Triggers: pulumi.StringMap{
				"bird_conf": pulumi.String(birdConf),
				"interface": pulumi.String(interfaceLo0),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
