## Example Usage

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Device("test", {
    hostname: "test",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
const testDeviceNetworkType = new equinix.metal.DeviceNetworkType("testDeviceNetworkType", {
    deviceId: test.id,
    type: "layer2-individual",
});
const test1 = new equinix.metal.Vlan("test1", {
    description: "VLAN in New York",
    metro: "ny",
    projectId: projectId,
});
const test2 = new equinix.metal.Vlan("test2", {
    description: "VLAN in New Jersey",
    metro: "ny",
    projectId: projectId,
});
const test1PortVlanAttachment = new equinix.metal.PortVlanAttachment("test1PortVlanAttachment", {
    deviceId: testDeviceNetworkType.id,
    vlanVnid: test1.vxlan,
    portName: "eth1",
});
const test2PortVlanAttachment = new equinix.metal.PortVlanAttachment("test2PortVlanAttachment", {
    deviceId: testDeviceNetworkType.id,
    vlanVnid: test2.vxlan,
    portName: "eth1",
    native: true,
}, {
    dependsOn: [test1PortVlanAttachment],
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Device("test",
    hostname="test",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
test_device_network_type = equinix.metal.DeviceNetworkType("testDeviceNetworkType",
    device_id=test.id,
    type="layer2-individual")
test1 = equinix.metal.Vlan("test1",
    description="VLAN in New York",
    metro="ny",
    project_id=project_id)
test2 = equinix.metal.Vlan("test2",
    description="VLAN in New Jersey",
    metro="ny",
    project_id=project_id)
test1_port_vlan_attachment = equinix.metal.PortVlanAttachment("test1PortVlanAttachment",
    device_id=test_device_network_type.id,
    vlan_vnid=test1.vxlan,
    port_name="eth1")
test2_port_vlan_attachment = equinix.metal.PortVlanAttachment("test2PortVlanAttachment",
    device_id=test_device_network_type.id,
    vlan_vnid=test2.vxlan,
    port_name="eth1",
    native=True,
    opts = pulumi.ResourceOptions(depends_on=[test1_port_vlan_attachment]))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		test, err := metal.NewDevice(ctx, "test", &metal.DeviceArgs{
			Hostname:        pulumi.String("test"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		testDeviceNetworkType, err := metal.NewDeviceNetworkType(ctx, "testDeviceNetworkType", &metal.DeviceNetworkTypeArgs{
			DeviceId: test.ID(),
			Type:     pulumi.String("layer2-individual"),
		})
		if err != nil {
			return err
		}
		test1, err := metal.NewVlan(ctx, "test1", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New York"),
			Metro:       pulumi.String("ny"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		test2, err := metal.NewVlan(ctx, "test2", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New Jersey"),
			Metro:       pulumi.String("ny"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		test1PortVlanAttachment, err := metal.NewPortVlanAttachment(ctx, "test1PortVlanAttachment", &metal.PortVlanAttachmentArgs{
			DeviceId: testDeviceNetworkType.ID(),
			VlanVnid: test1.Vxlan,
			PortName: pulumi.String("eth1"),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewPortVlanAttachment(ctx, "test2PortVlanAttachment", &metal.PortVlanAttachmentArgs{
			DeviceId: testDeviceNetworkType.ID(),
			VlanVnid: test2.Vxlan,
			PortName: pulumi.String("eth1"),
			Native:   pulumi.Bool(true),
		}, pulumi.DependsOn([]pulumi.Resource{
			test1PortVlanAttachment,
		}))
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
    var test = new Equinix.Metal.Device("test", new()
    {
        Hostname = "test",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    var testDeviceNetworkType = new Equinix.Metal.DeviceNetworkType("testDeviceNetworkType", new()
    {
        DeviceId = test.Id,
        Type = "layer2-individual",
    });

    var test1 = new Equinix.Metal.Vlan("test1", new()
    {
        Description = "VLAN in New York",
        Metro = "ny",
        ProjectId = projectId,
    });

    var test2 = new Equinix.Metal.Vlan("test2", new()
    {
        Description = "VLAN in New Jersey",
        Metro = "ny",
        ProjectId = projectId,
    });

    var test1PortVlanAttachment = new Equinix.Metal.PortVlanAttachment("test1PortVlanAttachment", new()
    {
        DeviceId = testDeviceNetworkType.Id,
        VlanVnid = test1.Vxlan,
        PortName = "eth1",
    });

    var test2PortVlanAttachment = new Equinix.Metal.PortVlanAttachment("test2PortVlanAttachment", new()
    {
        DeviceId = testDeviceNetworkType.Id,
        VlanVnid = test2.Vxlan,
        PortName = "eth1",
        Native = true,
    }, new CustomResourceOptions
    {
        DependsOn =
        {
            test1PortVlanAttachment,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.DeviceNetworkType;
import com.pulumi.equinix.metal.DeviceNetworkTypeArgs;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.PortVlanAttachment;
import com.pulumi.equinix.metal.PortVlanAttachmentArgs;
import com.pulumi.resources.CustomResourceOptions;
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
        var test = new Device("test", DeviceArgs.builder()
            .hostname("test")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        var testDeviceNetworkType = new DeviceNetworkType("testDeviceNetworkType", DeviceNetworkTypeArgs.builder()
            .deviceId(test.id())
            .type("layer2-individual")
            .build());

        var test1 = new Vlan("test1", VlanArgs.builder()
            .description("VLAN in New York")
            .metro("ny")
            .projectId(projectId)
            .build());

        var test2 = new Vlan("test2", VlanArgs.builder()
            .description("VLAN in New Jersey")
            .metro("ny")
            .projectId(projectId)
            .build());

        var test1PortVlanAttachment = new PortVlanAttachment("test1PortVlanAttachment", PortVlanAttachmentArgs.builder()
            .deviceId(testDeviceNetworkType.id())
            .vlanVnid(test1.vxlan())
            .portName("eth1")
            .build());

        var test2PortVlanAttachment = new PortVlanAttachment("test2PortVlanAttachment", PortVlanAttachmentArgs.builder()
            .deviceId(testDeviceNetworkType.id())
            .vlanVnid(test2.vxlan())
            .portName("eth1")
            .native_(true)
            .build(), CustomResourceOptions.builder()
                .dependsOn(test1PortVlanAttachment)
                .build());

    }
}
```
```yaml
  test:
    type: equinix:metal:Device
    properties:
      hostname: test
      plan: c3.small.x86
      metro: ny
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectId: ${projectId}
  testDeviceNetworkType:
    type: equinix:metal:DeviceNetworkType
    name: test
    properties:
      deviceId: ${test.id}
      type: layer2-individual
  test1:
    type: equinix:metal:Vlan
    properties:
      description: VLAN in New York
      metro: ny
      projectId: ${projectId}
  test2:
    type: equinix:metal:Vlan
    properties:
      description: VLAN in New Jersey
      metro: ny
      projectId: ${projectId}
  test1PortVlanAttachment:
    type: equinix:metal:PortVlanAttachment
    name: test1
    properties:
      deviceId: ${testDeviceNetworkType.id}
      vlanVnid: ${test1.vxlan}
      portName: eth1
  test2PortVlanAttachment:
    type: equinix:metal:PortVlanAttachment
    name: test2
    properties:
      deviceId: ${testDeviceNetworkType.id}
      vlanVnid: ${test2.vxlan}
      portName: eth1
      native: true
    options:
      dependson:
        - ${test1PortVlanAttachment}
```
{{% /example %}}

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Vlan("test", {
    description: "VLAN in New York",
    metro: "ny",
    projectId: projectId,
});
const testDevice = new equinix.metal.Device("testDevice", {
    hostname: "test",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
const testDeviceNetworkType = new equinix.metal.DeviceNetworkType("testDeviceNetworkType", {
    deviceId: testDevice.id,
    type: "hybrid",
});
const testPortVlanAttachment = new equinix.metal.PortVlanAttachment("testPortVlanAttachment", {
    deviceId: testDeviceNetworkType.id,
    portName: "eth1",
    vlanVnid: test.vxlan,
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Vlan("test",
    description="VLAN in New York",
    metro="ny",
    project_id=project_id)
test_device = equinix.metal.Device("testDevice",
    hostname="test",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
test_device_network_type = equinix.metal.DeviceNetworkType("testDeviceNetworkType",
    device_id=test_device.id,
    type="hybrid")
test_port_vlan_attachment = equinix.metal.PortVlanAttachment("testPortVlanAttachment",
    device_id=test_device_network_type.id,
    port_name="eth1",
    vlan_vnid=test.vxlan)
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
			Description: pulumi.String("VLAN in New York"),
			Metro:       pulumi.String("ny"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		testDevice, err := metal.NewDevice(ctx, "testDevice", &metal.DeviceArgs{
			Hostname:        pulumi.String("test"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		testDeviceNetworkType, err := metal.NewDeviceNetworkType(ctx, "testDeviceNetworkType", &metal.DeviceNetworkTypeArgs{
			DeviceId: testDevice.ID(),
			Type:     pulumi.String("hybrid"),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewPortVlanAttachment(ctx, "testPortVlanAttachment", &metal.PortVlanAttachmentArgs{
			DeviceId: testDeviceNetworkType.ID(),
			PortName: pulumi.String("eth1"),
			VlanVnid: test.Vxlan,
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
        Description = "VLAN in New York",
        Metro = "ny",
        ProjectId = projectId,
    });

    var testDevice = new Equinix.Metal.Device("testDevice", new()
    {
        Hostname = "test",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    var testDeviceNetworkType = new Equinix.Metal.DeviceNetworkType("testDeviceNetworkType", new()
    {
        DeviceId = testDevice.Id,
        Type = "hybrid",
    });

    var testPortVlanAttachment = new Equinix.Metal.PortVlanAttachment("testPortVlanAttachment", new()
    {
        DeviceId = testDeviceNetworkType.Id,
        PortName = "eth1",
        VlanVnid = test.Vxlan,
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
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.DeviceNetworkType;
import com.pulumi.equinix.metal.DeviceNetworkTypeArgs;
import com.pulumi.equinix.metal.PortVlanAttachment;
import com.pulumi.equinix.metal.PortVlanAttachmentArgs;
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
            .description("VLAN in New York")
            .metro("ny")
            .projectId(projectId)
            .build());

        var testDevice = new Device("testDevice", DeviceArgs.builder()
            .hostname("test")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        var testDeviceNetworkType = new DeviceNetworkType("testDeviceNetworkType", DeviceNetworkTypeArgs.builder()
            .deviceId(testDevice.id())
            .type("hybrid")
            .build());

        var testPortVlanAttachment = new PortVlanAttachment("testPortVlanAttachment", PortVlanAttachmentArgs.builder()
            .deviceId(testDeviceNetworkType.id())
            .portName("eth1")
            .vlanVnid(test.vxlan())
            .build());

    }
}
```
```yaml
  test:
    type: equinix:metal:Vlan
    properties:
      description: VLAN in New York
      metro: ny
      projectId: ${projectId}
  testDevice:
    type: equinix:metal:Device
    name: test
    properties:
      hostname: test
      plan: c3.small.x86
      metro: ny
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectId: ${projectId}
  testDeviceNetworkType:
    type: equinix:metal:DeviceNetworkType
    name: test
    properties:
      deviceId: ${testDevice.id}
      type: hybrid
  testPortVlanAttachment:
    type: equinix:metal:PortVlanAttachment
    name: test
    properties:
      deviceId: ${testDeviceNetworkType.id}
      portName: eth1
      vlanVnid: ${test.vxlan}
```
{{% /example %}}


