## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as _null from "@pulumi/null";

const bgpPassword = "955dB0b81Ef";
const projectId = "<UUID_of_your_project>";
const interfaceLo0 = `auto lo:0
iface lo:0 inet static
   address ${addr.address}
   netmask ${addr.netmask}
`;
const birdConf = `filter equinix_metal_bgp {
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
`;
const configureBird = new _null.Resource("configure_bird", {triggers: {
    bird_conf: birdConf,
    "interface": interfaceLo0,
}});
```
```python
import pulumi
import pulumi_null as null

bgp_password = "955dB0b81Ef"
project_id = "<UUID_of_your_project>"
interface_lo0 = f"""auto lo:0
iface lo:0 inet static
   address {addr["address"]}
   netmask {addr["netmask"]}
"""
bird_conf = f"""filter equinix_metal_bgp {{
    if net = {addr["address"]}/{addr["cidr"]} then accept;
}}
router id {test["network"][2]["address"]};
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
    neighbor {test["network"][2]["gateway"]} as 65530;
    password "{bgp_password}";
}}
"""
configure_bird = null.Resource("configure_bird", triggers={
    "bird_conf": bird_conf,
    "interface": interface_lo0,
})
```
```go
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
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Null = Pulumi.Null;

return await Deployment.RunAsync(() => 
{
    var bgpPassword = "955dB0b81Ef";

    var projectId = "<UUID_of_your_project>";

    var interfaceLo0 = @$"auto lo:0
iface lo:0 inet static
   address {addr.Address}
   netmask {addr.Netmask}
";

    var birdConf = @$"filter equinix_metal_bgp {{
    if net = {addr.Address}/{addr.Cidr} then accept;
}}
router id {test.Network[2].Address};
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
    neighbor {test.Network[2].Gateway} as 65530;
    password ""{bgpPassword}"";
}}
";

    var configureBird = new Null.Resource("configure_bird", new()
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

        final var interfaceLo0 = """
auto lo:0
iface lo:0 inet static
   address %s
   netmask %s
", addr.address(),addr.netmask());

        final var birdConf = """
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
", addr.address(),addr.cidr(),test.network()[2].address(),test.network()[2].gateway(),bgpPassword);

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
