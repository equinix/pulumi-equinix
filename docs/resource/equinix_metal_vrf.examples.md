## Example Usage

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.Project("example", {name: "example"});
const exampleVrf = new equinix.metal.Vrf("exampleVrf", {
    description: "VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
    name: "example-vrf",
    metro: "da",
    localAsn: 65000,
    ipRanges: [
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    projectId: example.id,
});
```
```python
import pulumi
import pulumi_equinix as equinix

example = equinix.metal.Project("example", name="example")
example_vrf = equinix.metal.Vrf("exampleVrf",
    description="VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
    name="example-vrf",
    metro="da",
    local_asn=65000,
    ip_ranges=[
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    project_id=example.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewProject(ctx, "example", &metal.ProjectArgs{
			Name: pulumi.String("example"),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewVrf(ctx, "exampleVrf", &metal.VrfArgs{
			Description: pulumi.String("VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25"),
			Name:        pulumi.String("example-vrf"),
			Metro:       pulumi.String("da"),
			LocalAsn:    pulumi.Int(65000),
			IpRanges: pulumi.StringArray{
				pulumi.String("192.168.100.0/25"),
				pulumi.String("192.168.200.0/25"),
			},
			ProjectId: example.ID(),
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

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.Project("example", new()
    {
        Name = "example",
    });

    var exampleVrf = new Equinix.Metal.Vrf("exampleVrf", new()
    {
        Description = "VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
        Name = "example-vrf",
        Metro = "da",
        LocalAsn = 65000,
        IpRanges = new[]
        {
            "192.168.100.0/25",
            "192.168.200.0/25",
        },
        ProjectId = example.Id,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.Project;
import com.equinix.pulumi.equinix.metal.ProjectArgs;
import com.equinix.pulumi.equinix.metal.Vrf;
import com.equinix.pulumi.equinix.metal.VrfArgs;
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
        var example = new Project("example", ProjectArgs.builder()
            .name("example")
            .build());

        var exampleVrf = new Vrf("exampleVrf", VrfArgs.builder()
            .description("VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25")
            .name("example-vrf")
            .metro("da")
            .localAsn(65000)
            .ipRanges(            
                "192.168.100.0/25",
                "192.168.200.0/25")
            .projectId(example.id())
            .build());

    }
}
```
```yaml
resources:
  example:
    type: equinix:metal:Project
    properties:
      name: example
  exampleVrf:
    type: equinix:metal:Vrf
    name: example
    properties:
      description: VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25
      name: example-vrf
      metro: da
      localAsn: '65000'
      ipRanges:
        - 192.168.100.0/25
        - 192.168.200.0/25
      projectId: ${example.id}
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.ReservedIpBlock("example", {
    description: "Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
    projectId: exampleEquinixMetalProject.id,
    metro: exampleEquinixMetalVrf.metro,
    type: "vrf",
    vrfId: exampleEquinixMetalVrf.id,
    cidr: 29,
    network: "192.168.100.0",
});
const exampleVlan = new equinix.metal.Vlan("exampleVlan", {
    description: "A VLAN for Layer2 and Hybrid Metal devices",
    metro: exampleEquinixMetalVrf.metro,
    projectId: exampleEquinixMetalProject.id,
});
const exampleGateway = new equinix.metal.Gateway("exampleGateway", {
    projectId: exampleEquinixMetalProject.id,
    vlanId: exampleVlan.id,
    ipReservationId: example.id,
});
```
```python
import pulumi
import pulumi_equinix as equinix

example = equinix.metal.ReservedIpBlock("example",
    description="Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
    project_id=example_equinix_metal_project["id"],
    metro=example_equinix_metal_vrf["metro"],
    type="vrf",
    vrf_id=example_equinix_metal_vrf["id"],
    cidr=29,
    network="192.168.100.0")
example_vlan = equinix.metal.Vlan("exampleVlan",
    description="A VLAN for Layer2 and Hybrid Metal devices",
    metro=example_equinix_metal_vrf["metro"],
    project_id=example_equinix_metal_project["id"])
example_gateway = equinix.metal.Gateway("exampleGateway",
    project_id=example_equinix_metal_project["id"],
    vlan_id=example_vlan.id,
    ip_reservation_id=example.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewReservedIpBlock(ctx, "example", &metal.ReservedIpBlockArgs{
			Description: pulumi.String("Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space."),
			ProjectId:   pulumi.Any(exampleEquinixMetalProject.Id),
			Metro:       pulumi.Any(exampleEquinixMetalVrf.Metro),
			Type:        pulumi.String("vrf"),
			VrfId:       pulumi.Any(exampleEquinixMetalVrf.Id),
			Cidr:        pulumi.Int(29),
			Network:     pulumi.String("192.168.100.0"),
		})
		if err != nil {
			return err
		}
		exampleVlan, err := metal.NewVlan(ctx, "exampleVlan", &metal.VlanArgs{
			Description: pulumi.String("A VLAN for Layer2 and Hybrid Metal devices"),
			Metro:       pulumi.Any(exampleEquinixMetalVrf.Metro),
			ProjectId:   pulumi.Any(exampleEquinixMetalProject.Id),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewGateway(ctx, "exampleGateway", &metal.GatewayArgs{
			ProjectId:       pulumi.Any(exampleEquinixMetalProject.Id),
			VlanId:          exampleVlan.ID(),
			IpReservationId: example.ID(),
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

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.ReservedIpBlock("example", new()
    {
        Description = "Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
        ProjectId = exampleEquinixMetalProject.Id,
        Metro = exampleEquinixMetalVrf.Metro,
        Type = "vrf",
        VrfId = exampleEquinixMetalVrf.Id,
        Cidr = 29,
        Network = "192.168.100.0",
    });

    var exampleVlan = new Equinix.Metal.Vlan("exampleVlan", new()
    {
        Description = "A VLAN for Layer2 and Hybrid Metal devices",
        Metro = exampleEquinixMetalVrf.Metro,
        ProjectId = exampleEquinixMetalProject.Id,
    });

    var exampleGateway = new Equinix.Metal.Gateway("exampleGateway", new()
    {
        ProjectId = exampleEquinixMetalProject.Id,
        VlanId = exampleVlan.Id,
        IpReservationId = example.Id,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.ReservedIpBlock;
import com.equinix.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.equinix.pulumi.equinix.metal.Vlan;
import com.equinix.pulumi.equinix.metal.VlanArgs;
import com.equinix.pulumi.equinix.metal.Gateway;
import com.equinix.pulumi.equinix.metal.GatewayArgs;
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
        var example = new ReservedIpBlock("example", ReservedIpBlockArgs.builder()
            .description("Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.")
            .projectId(exampleEquinixMetalProject.id())
            .metro(exampleEquinixMetalVrf.metro())
            .type("vrf")
            .vrfId(exampleEquinixMetalVrf.id())
            .cidr(29)
            .network("192.168.100.0")
            .build());

        var exampleVlan = new Vlan("exampleVlan", VlanArgs.builder()
            .description("A VLAN for Layer2 and Hybrid Metal devices")
            .metro(exampleEquinixMetalVrf.metro())
            .projectId(exampleEquinixMetalProject.id())
            .build());

        var exampleGateway = new Gateway("exampleGateway", GatewayArgs.builder()
            .projectId(exampleEquinixMetalProject.id())
            .vlanId(exampleVlan.id())
            .ipReservationId(example.id())
            .build());

    }
}
```
```yaml
resources:
  example:
    type: equinix:metal:ReservedIpBlock
    properties:
      description: Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.
      projectId: ${exampleEquinixMetalProject.id}
      metro: ${exampleEquinixMetalVrf.metro}
      type: vrf
      vrfId: ${exampleEquinixMetalVrf.id}
      cidr: 29
      network: 192.168.100.0
  exampleVlan:
    type: equinix:metal:Vlan
    name: example
    properties:
      description: A VLAN for Layer2 and Hybrid Metal devices
      metro: ${exampleEquinixMetalVrf.metro}
      projectId: ${exampleEquinixMetalProject.id}
  exampleGateway:
    type: equinix:metal:Gateway
    name: example
    properties:
      projectId: ${exampleEquinixMetalProject.id}
      vlanId: ${exampleVlan.id}
      ipReservationId: ${example.id}
```
{{% /example %}}

{{% example %}}
### example 3
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const exampleVirtualCircuit = new equinix.metal.VirtualCircuit("exampleVirtualCircuit", {
    name: "example-vc",
    description: "Virtual Circuit",
    connectionId: example.id,
    projectId: exampleEquinixMetalProject.id,
    portId: example.ports[0].id,
    nniVlan: 1024,
    vrfId: exampleEquinixMetalVrf.id,
    peerAsn: 65530,
    subnet: "192.168.100.16/31",
    metalIp: "192.168.100.16",
    customerIp: "192.168.100.17",
});
```
```python
import pulumi
import pulumi_equinix as equinix

example_virtual_circuit = equinix.metal.VirtualCircuit("exampleVirtualCircuit",
    name="example-vc",
    description="Virtual Circuit",
    connection_id=example["id"],
    project_id=example_equinix_metal_project["id"],
    port_id=example["ports"][0]["id"],
    nni_vlan=1024,
    vrf_id=example_equinix_metal_vrf["id"],
    peer_asn=65530,
    subnet="192.168.100.16/31",
    metal_ip="192.168.100.16",
    customer_ip="192.168.100.17")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewVirtualCircuit(ctx, "exampleVirtualCircuit", &metal.VirtualCircuitArgs{
			Name:         pulumi.String("example-vc"),
			Description:  pulumi.String("Virtual Circuit"),
			ConnectionId: pulumi.Any(example.Id),
			ProjectId:    pulumi.Any(exampleEquinixMetalProject.Id),
			PortId:       pulumi.Any(example.Ports[0].Id),
			NniVlan:      pulumi.Int(1024),
			VrfId:        pulumi.Any(exampleEquinixMetalVrf.Id),
			PeerAsn:      pulumi.Int(65530),
			Subnet:       pulumi.String("192.168.100.16/31"),
			MetalIp:      pulumi.String("192.168.100.16"),
			CustomerIp:   pulumi.String("192.168.100.17"),
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

return await Deployment.RunAsync(() => 
{
    var exampleVirtualCircuit = new Equinix.Metal.VirtualCircuit("exampleVirtualCircuit", new()
    {
        Name = "example-vc",
        Description = "Virtual Circuit",
        ConnectionId = example.Id,
        ProjectId = exampleEquinixMetalProject.Id,
        PortId = example.Ports[0].Id,
        NniVlan = 1024,
        VrfId = exampleEquinixMetalVrf.Id,
        PeerAsn = 65530,
        Subnet = "192.168.100.16/31",
        MetalIp = "192.168.100.16",
        CustomerIp = "192.168.100.17",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.VirtualCircuit;
import com.equinix.pulumi.equinix.metal.VirtualCircuitArgs;
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
        var exampleVirtualCircuit = new VirtualCircuit("exampleVirtualCircuit", VirtualCircuitArgs.builder()
            .name("example-vc")
            .description("Virtual Circuit")
            .connectionId(example.id())
            .projectId(exampleEquinixMetalProject.id())
            .portId(example.ports()[0].id())
            .nniVlan(1024)
            .vrfId(exampleEquinixMetalVrf.id())
            .peerAsn(65530)
            .subnet("192.168.100.16/31")
            .metalIp("192.168.100.16")
            .customerIp("192.168.100.17")
            .build());

    }
}
```
```yaml
resources:
  exampleVirtualCircuit:
    type: equinix:metal:VirtualCircuit
    name: example
    properties:
      name: example-vc
      description: Virtual Circuit
      connectionId: ${example.id}
      projectId: ${exampleEquinixMetalProject.id}
      portId: ${example.ports[0].id}
      nniVlan: 1024
      vrfId: ${exampleEquinixMetalVrf.id}
      peerAsn: 65530
      subnet: 192.168.100.16/31
      metalIp: 192.168.100.16
      customerIp: 192.168.100.17
variables:
  example:
    fn::invoke:
      function: equinix:metal:getInterconnection
      arguments:
        connectionId: ${metalDedicatedConnectionId}
```
{{% /example %}}


