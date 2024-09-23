## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as _null from "@pulumi/null";
import * as equinix from "@equinix-labs/pulumi-equinix";

const bgpPassword = "955dB0b81Ef";
const projectId = "<UUID_of_your_project>";
const addr = new equinix.metal.ReservedIpBlock("addr", {
    projectId: projectId,
    metro: "ny",
    quantity: 1,
});
const interfaceLo0 = pulumi.interpolate`auto lo:0
iface lo:0 inet static
   address ${addr.address}
   netmask ${addr.netmask}
`;
const test = new equinix.metal.Device("test", {
    hostname: "terraform-test-bgp-sesh",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
const birdConf = pulumi.all([addr.address, addr.cidr, test.network, test.network]).apply(([address, cidr, testNetwork, testNetwork1]) => `filter equinix_metal_bgp {
    if net = ${address}/${cidr} then accept;
}
router id ${testNetwork[2].address};
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
    neighbor ${testNetwork1[2].gateway} as 65530;
    password "${bgpPassword}";
}
`);
const testBgpSession = new equinix.metal.BgpSession("testBgpSession", {
    deviceId: test.id,
    addressFamily: "ipv4",
});
const configureBird = new _null.Resource("configureBird", {triggers: {
    bird_conf: birdConf,
    "interface": interfaceLo0,
}});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_null as null

bgp_password = "955dB0b81Ef"
project_id = "<UUID_of_your_project>"
addr = equinix.metal.ReservedIpBlock("addr",
    project_id=project_id,
    metro="ny",
    quantity=1)
interface_lo0 = pulumi.Output.all(
    address=addr.address,
    netmask=addr.netmask
).apply(lambda resolved_outputs: f"""auto lo:0
iface lo:0 inet static
   address {resolved_outputs['address']}
   netmask {resolved_outputs['netmask']}
""")

test = equinix.metal.Device("test",
    hostname="terraform-test-bgp-sesh",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
bird_conf = pulumi.Output.all(
    address=addr.address,
    cidr=addr.cidr,
    testNetwork=test.network,
    testNetwork1=test.network
).apply(lambda resolved_outputs: f"""filter equinix_metal_bgp {{
    if net = {resolved_outputs['address']}/{resolved_outputs['cidr']} then accept;
}}
router id {test_network[2].address};
protocol direct {{
    interface "lo";
}}
protocol kernel {{
    scan time 10;
    persist;
    import all;
    export all;
}}
protocol device {{
    scan time 10;
}}
protocol bgp {{
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor {test_network1[2].gateway} as 65530;
    password "{bgp_password}";
}}
""")

test_bgp_session = equinix.metal.BgpSession("testBgpSession",
    device_id=test.id,
    address_family="ipv4")
configure_bird = null.Resource("configureBird", triggers={
    "bird_conf": bird_conf,
    "interface": interface_lo0,
})
```
```go
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
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Null = Pulumi.Null;

return await Deployment.RunAsync(() => 
{
    var bgpPassword = "955dB0b81Ef";

    var projectId = "<UUID_of_your_project>";

    var addr = new Equinix.Metal.ReservedIpBlock("addr", new()
    {
        ProjectId = projectId,
        Metro = "ny",
        Quantity = 1,
    });

    var interfaceLo0 = Output.Tuple(addr.Address, addr.Netmask).Apply(values =>
    {
        var address = values.Item1;
        var netmask = values.Item2;
        return @$"auto lo:0
iface lo:0 inet static
   address {address}
   netmask {netmask}
";
    });

    var test = new Equinix.Metal.Device("test", new()
    {
        Hostname = "terraform-test-bgp-sesh",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    var birdConf = Output.Tuple(addr.Address, addr.Cidr, test.Network, test.Network).Apply(values =>
    {
        var address = values.Item1;
        var cidr = values.Item2;
        var testNetwork = values.Item3;
        var testNetwork1 = values.Item4;
        return @$"filter equinix_metal_bgp {{
    if net = {address}/{cidr} then accept;
}}
router id {testNetwork[2].Address};
protocol direct {{
    interface ""lo"";
}}
protocol kernel {{
    scan time 10;
    persist;
    import all;
    export all;
}}
protocol device {{
    scan time 10;
}}
protocol bgp {{
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor {testNetwork1[2].Gateway} as 65530;
    password ""{bgpPassword}"";
}}
";
    });

    var testBgpSession = new Equinix.Metal.BgpSession("testBgpSession", new()
    {
        DeviceId = test.Id,
        AddressFamily = "ipv4",
    });

    var configureBird = new Null.Resource("configureBird", new()
    {
        Triggers = 
        {
            { "bird_conf", birdConf },
            { "interface", interfaceLo0 },
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.BgpSession;
import com.pulumi.equinix.metal.BgpSessionArgs;
import com.pulumi.null.Resource;
import com.pulumi.null.ResourceArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var bgpPassword = "955dB0b81Ef";

        final var projectId = "<UUID_of_your_project>";

        var addr = new ReservedIpBlock("addr", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("ny")
            .quantity(1)
            .build());

        final var interfaceLo0 = Output.tuple(addr.address(), addr.netmask()).applyValue(values -> {
            var address = values.t1;
            var netmask = values.t2;
            return """
auto lo:0
iface lo:0 inet static
   address %s
   netmask %s
", address,netmask);
        });

        var test = new Device("test", DeviceArgs.builder()
            .hostname("terraform-test-bgp-sesh")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        final var birdConf = Output.tuple(addr.address(), addr.cidr(), test.network(), test.network()).applyValue(values -> {
            var address = values.t1;
            var cidr = values.t2;
            var testNetwork = values.t3;
            var testNetwork1 = values.t4;
            return """
filter equinix_metal_bgp {
    if net = %s/%s then accept;
}
router id %s;
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
    neighbor %s as 65530;
    password "%s";
}
", address,cidr,testNetwork[2].address(),testNetwork1[2].gateway(),bgpPassword);
        });

        var testBgpSession = new BgpSession("testBgpSession", BgpSessionArgs.builder()
            .deviceId(test.id())
            .addressFamily("ipv4")
            .build());

        var configureBird = new Resource("configureBird", ResourceArgs.builder()
            .triggers(Map.ofEntries(
                Map.entry("bird_conf", birdConf),
                Map.entry("interface", interfaceLo0)
            ))
            .build());

    }
}
```
```yaml
  # you need to enable BGP config for the project. If you decide to create new
  # project, you can use the bgp_config section to enable BGP.
  # resource "equinix_metal_project" "test" {
  #   name = "testpro"
  #   bgp_config {
  #      deployment_type = "local"
  #      md5 = local.bgp_password
  #      asn = 65000
  #   }
  # }
  addr:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      metro: ny
      quantity: 1
  test:
    type: equinix:metal:Device
    properties:
      hostname: terraform-test-bgp-sesh
      plan: c3.small.x86
      metro: ny
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectId: ${projectId}
  testBgpSession:
    type: equinix:metal:BgpSession
    name: test
    properties:
      deviceId: ${test.id}
      addressFamily: ipv4
  configureBird:
    type: null:Resource
    name: configure_bird
    properties:
      triggers:
        bird_conf: ${birdConf}
        interface: ${interfaceLo0}
variables:
  bgpPassword: 955dB0b81Ef
  projectId: <UUID_of_your_project>
  interfaceLo0: |
    auto lo:0
    iface lo:0 inet static
       address ${addr.address}
       netmask ${addr.netmask}
  birdConf: |
    filter equinix_metal_bgp {
        if net = ${addr.address}/${addr.cidr} then accept;
    }
    router id ${test.network[2].address};
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
        neighbor ${test.network[2].gateway} as 65530;
        password "${bgpPassword}";
    }
```
{{% /example %}}
