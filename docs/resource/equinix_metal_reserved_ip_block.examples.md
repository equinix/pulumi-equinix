## Example Usage

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const twoElasticAddresses = new equinix.metal.ReservedIpBlock("twoElasticAddresses", {
    projectId: projectId,
    metro: "sv",
    quantity: 2,
});
const test1 = new equinix.metal.ReservedIpBlock("test1", {
    projectId: projectId,
    type: equinix.metal.IpBlockType.PublicIPv4,
    metro: "sv",
    quantity: 1,
});
const test = new equinix.metal.ReservedIpBlock("test", {
    projectId: projectId,
    type: equinix.metal.IpBlockType.GlobalIPv4,
    quantity: 1,
});
```
```python
import pulumi
import pulumi_equinix as equinix

two_elastic_addresses = equinix.metal.ReservedIpBlock("twoElasticAddresses",
    project_id=project_id,
    metro="sv",
    quantity=2)
test1 = equinix.metal.ReservedIpBlock("test1",
    project_id=project_id,
    type=equinix.metal.IpBlockType.PUBLIC_I_PV4,
    metro="sv",
    quantity=1)
test = equinix.metal.ReservedIpBlock("test",
    project_id=project_id,
    type=equinix.metal.IpBlockType.GLOBAL_I_PV4,
    quantity=1)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewReservedIpBlock(ctx, "twoElasticAddresses", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(2),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewReservedIpBlock(ctx, "test1", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Type:      pulumi.String(metal.IpBlockTypePublicIPv4),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(1),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewReservedIpBlock(ctx, "test", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Type:      pulumi.String(metal.IpBlockTypeGlobalIPv4),
			Quantity:  pulumi.Int(1),
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
    var twoElasticAddresses = new Equinix.Metal.ReservedIpBlock("twoElasticAddresses", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Quantity = 2,
    });

    var test1 = new Equinix.Metal.ReservedIpBlock("test1", new()
    {
        ProjectId = projectId,
        Type = Equinix.Metal.IpBlockType.PublicIPv4,
        Metro = "sv",
        Quantity = 1,
    });

    var test = new Equinix.Metal.ReservedIpBlock("test", new()
    {
        ProjectId = projectId,
        Type = Equinix.Metal.IpBlockType.GlobalIPv4,
        Quantity = 1,
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
        var twoElasticAddresses = new ReservedIpBlock("twoElasticAddresses", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .quantity(2)
            .build());

        var test1 = new ReservedIpBlock("test1", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .type("public_ipv4")
            .metro("sv")
            .quantity(1)
            .build());

        var test = new ReservedIpBlock("test", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .type("global_ipv4")
            .quantity(1)
            .build());

    }
}
```
```yaml
resources:
  # Allocate /31 block of max 2 public IPv4 addresses in Silicon Valley (sv) metro for myproject
  twoElasticAddresses:
    type: equinix:metal:ReservedIpBlock
    name: two_elastic_addresses
    properties:
      projectId: ${projectId}
      metro: sv
      quantity: 2
  # Allocate 1 floating IP in Silicon Valley (sv) metro
  test1:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      type: public_ipv4
      metro: sv
      quantity: 1
  # Allocate 1 global floating IP, which can be assigned to device in any metro
  test:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      type: global_ipv4
      quantity: 1
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.ReservedIpBlock("example", {
    projectId: projectId,
    metro: "sv",
    quantity: 2,
});
const nodes = new equinix.metal.Device("nodes", {
    projectId: projectId,
    metro: "sv",
    plan: equinix.metal.Plan.C3SmallX86,
    operatingSystem: "ubuntu_24_04",
    hostname: "test",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    ipAddresses: [
        {
            type: "public_ipv4",
            cidr: 31,
            reservationIds: [example.id],
        },
        {
            type: "private_ipv4",
        },
    ],
});
```
```python
import pulumi
import pulumi_equinix as equinix

example = equinix.metal.ReservedIpBlock("example",
    project_id=project_id,
    metro="sv",
    quantity=2)
nodes = equinix.metal.Device("nodes",
    project_id=project_id,
    metro="sv",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    operating_system="ubuntu_24_04",
    hostname="test",
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    ip_addresses=[
        {
            "type": "public_ipv4",
            "cidr": 31,
            "reservation_ids": [example.id],
        },
        {
            "type": "private_ipv4",
        },
    ])
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
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(2),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewDevice(ctx, "nodes", &metal.DeviceArgs{
			ProjectId:       pulumi.Any(projectId),
			Metro:           pulumi.String("sv"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			OperatingSystem: pulumi.String("ubuntu_24_04"),
			Hostname:        pulumi.String("test"),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			IpAddresses: metal.DeviceIpAddressArray{
				&metal.DeviceIpAddressArgs{
					Type: pulumi.String("public_ipv4"),
					Cidr: pulumi.Int(31),
					ReservationIds: pulumi.StringArray{
						example.ID(),
					},
				},
				&metal.DeviceIpAddressArgs{
					Type: pulumi.String("private_ipv4"),
				},
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

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.ReservedIpBlock("example", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Quantity = 2,
    });

    var nodes = new Equinix.Metal.Device("nodes", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        OperatingSystem = "ubuntu_24_04",
        Hostname = "test",
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        IpAddresses = new[]
        {
            new Equinix.Metal.Inputs.DeviceIpAddressArgs
            {
                Type = "public_ipv4",
                Cidr = 31,
                ReservationIds = new[]
                {
                    example.Id,
                },
            },
            new Equinix.Metal.Inputs.DeviceIpAddressArgs
            {
                Type = "private_ipv4",
            },
        },
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
import com.equinix.pulumi.equinix.metal.Device;
import com.equinix.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.inputs.DeviceIpAddressArgs;
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
            .projectId(projectId)
            .metro("sv")
            .quantity(2)
            .build());

        var nodes = new Device("nodes", DeviceArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .plan("c3.small.x86")
            .operatingSystem("ubuntu_24_04")
            .hostname("test")
            .billingCycle("hourly")
            .ipAddresses(            
                DeviceIpAddressArgs.builder()
                    .type("public_ipv4")
                    .cidr(31)
                    .reservationIds(example.id())
                    .build(),
                DeviceIpAddressArgs.builder()
                    .type("private_ipv4")
                    .build())
            .build());

    }
}
```
```yaml
resources:
  # Allocate /31 block of max 2 public IPv4 addresses in Silicon Valley (sv) metro
  example:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      metro: sv
      quantity: 2
  # Run a device with both public IPv4 from the block assigned
  nodes:
    type: equinix:metal:Device
    properties:
      projectId: ${projectId}
      metro: sv
      plan: c3.small.x86
      operatingSystem: ubuntu_24_04
      hostname: test
      billingCycle: hourly
      ipAddresses:
        - type: public_ipv4
          cidr: 31
          reservationIds:
            - ${example.id}
        - type: private_ipv4
```
{{% /example %}}


