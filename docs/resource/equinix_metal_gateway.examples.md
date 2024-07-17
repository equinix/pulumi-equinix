## Example Usage

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Vlan("test", {
    description: "test VLAN in SV",
    metro: "sv",
    projectId: projectId,
});
const test1 = new equinix.metal.ReservedIpBlock("test1", {
    projectId: projectId,
    metro: "sv",
    quantity: 8,
});
const testGateway = new equinix.metal.Gateway("testGateway", {
    projectId: projectId,
    vlanId: test.id,
    ipReservationId: testEquinixMetalReservedIpBlock.id,
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Vlan("test",
    description="test VLAN in SV",
    metro="sv",
    project_id=project_id)
test1 = equinix.metal.ReservedIpBlock("test1",
    project_id=project_id,
    metro="sv",
    quantity=8)
test_gateway = equinix.metal.Gateway("testGateway",
    project_id=project_id,
    vlan_id=test.id,
    ip_reservation_id=test_equinix_metal_reserved_ip_block["id"])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		test, err := metal.NewVlan(ctx, "test", &metal.VlanArgs{
			Description: pulumi.String("test VLAN in SV"),
			Metro:       pulumi.String("sv"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewReservedIpBlock(ctx, "test1", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(8),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewGateway(ctx, "testGateway", &metal.GatewayArgs{
			ProjectId:       pulumi.Any(projectId),
			VlanId:          test.ID(),
			IpReservationId: pulumi.Any(testEquinixMetalReservedIpBlock.Id),
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
    var test = new Equinix.Metal.Vlan("test", new()
    {
        Description = "test VLAN in SV",
        Metro = "sv",
        ProjectId = projectId,
    });

    var test1 = new Equinix.Metal.ReservedIpBlock("test1", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Quantity = 8,
    });

    var testGateway = new Equinix.Metal.Gateway("testGateway", new()
    {
        ProjectId = projectId,
        VlanId = test.Id,
        IpReservationId = testEquinixMetalReservedIpBlock.Id,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.pulumi.equinix.metal.Gateway;
import com.pulumi.equinix.metal.GatewayArgs;
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
        var test = new Vlan("test", VlanArgs.builder()
            .description("test VLAN in SV")
            .metro("sv")
            .projectId(projectId)
            .build());

        var test1 = new ReservedIpBlock("test1", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .quantity(8)
            .build());

        var testGateway = new Gateway("testGateway", GatewayArgs.builder()
            .projectId(projectId)
            .vlanId(test.id())
            .ipReservationId(testEquinixMetalReservedIpBlock.id())
            .build());

    }
}
```
```yaml
  # Create Metal Gateway for a VLAN and reserved IP address block
  test:
    type: equinix:metal:Vlan
    properties:
      description: test VLAN in SV
      metro: sv
      projectId: ${projectId}
  test1:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      metro: sv
      quantity: 8
  testGateway:
    type: equinix:metal:Gateway
    name: test
    properties:
      projectId: ${projectId}
      vlanId: ${test.id}
      ipReservationId: ${testEquinixMetalReservedIpBlock.id}
```
{{% /example %}}

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Vlan("test", {
    description: "test VLAN in SV",
    metro: "sv",
    projectId: projectId,
});
const testGateway = new equinix.metal.Gateway("testGateway", {
    projectId: projectId,
    vlanId: test.id,
    privateIpv4SubnetSize: 8,
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Vlan("test",
    description="test VLAN in SV",
    metro="sv",
    project_id=project_id)
test_gateway = equinix.metal.Gateway("testGateway",
    project_id=project_id,
    vlan_id=test.id,
    private_ipv4_subnet_size=8)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		test, err := metal.NewVlan(ctx, "test", &metal.VlanArgs{
			Description: pulumi.String("test VLAN in SV"),
			Metro:       pulumi.String("sv"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewGateway(ctx, "testGateway", &metal.GatewayArgs{
			ProjectId:             pulumi.Any(projectId),
			VlanId:                test.ID(),
			PrivateIpv4SubnetSize: pulumi.Int(8),
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
    var test = new Equinix.Metal.Vlan("test", new()
    {
        Description = "test VLAN in SV",
        Metro = "sv",
        ProjectId = projectId,
    });

    var testGateway = new Equinix.Metal.Gateway("testGateway", new()
    {
        ProjectId = projectId,
        VlanId = test.Id,
        PrivateIpv4SubnetSize = 8,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Gateway;
import com.pulumi.equinix.metal.GatewayArgs;
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
        var test = new Vlan("test", VlanArgs.builder()
            .description("test VLAN in SV")
            .metro("sv")
            .projectId(projectId)
            .build());

        var testGateway = new Gateway("testGateway", GatewayArgs.builder()
            .projectId(projectId)
            .vlanId(test.id())
            .privateIpv4SubnetSize(8)
            .build());

    }
}
```
```yaml
  # Create Metal Gateway for a VLAN with a private IPv4 block with 8 IP addresses
  test:
    type: equinix:metal:Vlan
    properties:
      description: test VLAN in SV
      metro: sv
      projectId: ${projectId}
  testGateway:
    type: equinix:metal:Gateway
    name: test
    properties:
      projectId: ${projectId}
      vlanId: ${test.id}
      privateIpv4SubnetSize: 8
```
{{% /example %}}


