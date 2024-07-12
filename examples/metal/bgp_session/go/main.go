package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi-null/sdk/go/null"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bgpPassword := "955dB0b81Ef"
		projectId := "<UUID_of_your_project>"
		addr, err := metal.NewReservedIpBlock(ctx, "addr", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.String(projectId),
			Metro:     pulumi.String("ny"),
			Quantity:  pulumi.Int(1),
		})
		if err != nil {
			return err
		}
		interfaceLo0 := pulumi.All(addr.Address, addr.Netmask).ApplyT(func(_args []interface{}) (string, error) {
			address := _args[0].(string)
			netmask := _args[1].(string)
			return fmt.Sprintf("auto lo:0\niface lo:0 inet static\n   address %v\n   netmask %v\n", address, netmask), nil
		}).(pulumi.StringOutput)
		test, err := metal.NewDevice(ctx, "test", &metal.DeviceArgs{
			Hostname:        pulumi.String("terraform-test-bgp-sesh"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.String(projectId),
		})
		if err != nil {
			return err
		}
		birdConf := pulumi.All(addr.Address, addr.Cidr, test.Network, test.Network).ApplyT(func(_args []interface{}) (string, error) {
			address := _args[0].(string)
			cidr := _args[1].(int)
			testNetwork := _args[2].([]metal.DeviceNetwork)
			testNetwork1 := _args[3].([]metal.DeviceNetwork)
			return fmt.Sprintf(`filter equinix_metal_bgp {
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
`, address, cidr, testNetwork[2].Address, testNetwork1[2].Gateway, bgpPassword), nil
		}).(pulumi.StringOutput)
		_, err = metal.NewBgpSession(ctx, "testBgpSession", &metal.BgpSessionArgs{
			DeviceId:      test.ID(),
			AddressFamily: pulumi.String("ipv4"),
		})
		if err != nil {
			return err
		}
		_, err = null.NewResource(ctx, "configureBird", &null.ResourceArgs{
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
