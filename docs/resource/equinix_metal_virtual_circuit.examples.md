## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const projectId = "52000fb2-ee46-4673-93a8-de2c2bdba33c";
const connId = "73f12f29-3e19-43a0-8e90-ae81580db1e0";
const test = equinix.metal.getInterconnectionOutput({
    connectionId: connId,
});
const testVlan = new equinix.metal.Vlan("testVlan", {
    projectId: projectId,
    metro: test.apply(test => test.metro),
});
const testVirtualCircuit = new equinix.metal.VirtualCircuit("testVirtualCircuit", {
    connectionId: connId,
    projectId: projectId,
    portId: test.apply(test => test.ports?.[0]?.id),
    vlanId: testVlan.id,
    nniVlan: 1056,
});
```
```python
import pulumi
import pulumi_equinix as equinix

project_id = "52000fb2-ee46-4673-93a8-de2c2bdba33c"
conn_id = "73f12f29-3e19-43a0-8e90-ae81580db1e0"
test = equinix.metal.get_interconnection_output(connection_id=conn_id)
test_vlan = equinix.metal.Vlan("testVlan",
    project_id=project_id,
    metro=test.metro)
test_virtual_circuit = equinix.metal.VirtualCircuit("testVirtualCircuit",
    connection_id=conn_id,
    project_id=project_id,
    port_id=test.ports[0].id,
    vlan_id=test_vlan.id,
    nni_vlan=1056)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		projectId := "52000fb2-ee46-4673-93a8-de2c2bdba33c"
		connId := "73f12f29-3e19-43a0-8e90-ae81580db1e0"
		test := metal.LookupInterconnectionOutput(ctx, metal.GetInterconnectionOutputArgs{
			ConnectionId: pulumi.String(connId),
		}, nil)
		testVlan, err := metal.NewVlan(ctx, "testVlan", &metal.VlanArgs{
			ProjectId: pulumi.String(projectId),
			Metro: pulumi.String(test.ApplyT(func(test metal.GetInterconnectionResult) (*string, error) {
				return &test.Metro, nil
			}).(pulumi.StringPtrOutput)),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewVirtualCircuit(ctx, "testVirtualCircuit", &metal.VirtualCircuitArgs{
			ConnectionId: pulumi.String(connId),
			ProjectId:    pulumi.String(projectId),
			PortId: pulumi.String(test.ApplyT(func(test metal.GetInterconnectionResult) (*string, error) {
				return &test.Ports[0].Id, nil
			}).(pulumi.StringPtrOutput)),
			VlanId:  testVlan.ID(),
			NniVlan: pulumi.Int(1056),
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
    var projectId = "52000fb2-ee46-4673-93a8-de2c2bdba33c";

    var connId = "73f12f29-3e19-43a0-8e90-ae81580db1e0";

    var test = Equinix.Metal.GetInterconnection.Invoke(new()
    {
        ConnectionId = connId,
    });

    var testVlan = new Equinix.Metal.Vlan("testVlan", new()
    {
        ProjectId = projectId,
        Metro = test.Apply(getInterconnectionResult => getInterconnectionResult.Metro),
    });

    var testVirtualCircuit = new Equinix.Metal.VirtualCircuit("testVirtualCircuit", new()
    {
        ConnectionId = connId,
        ProjectId = projectId,
        PortId = test.Apply(getInterconnectionResult => getInterconnectionResult.Ports[0]?.Id),
        VlanId = testVlan.Id,
        NniVlan = 1056,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.MetalFunctions;
import com.pulumi.equinix.metal.inputs.GetInterconnectionArgs;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.VirtualCircuit;
import com.pulumi.equinix.metal.VirtualCircuitArgs;
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
        final var projectId = "52000fb2-ee46-4673-93a8-de2c2bdba33c";

        final var connId = "73f12f29-3e19-43a0-8e90-ae81580db1e0";

        final var test = MetalFunctions.getInterconnection(GetInterconnectionArgs.builder()
            .connectionId(connId)
            .build());

        var testVlan = new Vlan("testVlan", VlanArgs.builder()
            .projectId(projectId)
            .metro(test.applyValue(_test -> _test.metro()))
            .build());

        var testVirtualCircuit = new VirtualCircuit("testVirtualCircuit", VirtualCircuitArgs.builder()
            .connectionId(connId)
            .projectId(projectId)
            .portId(test.applyValue(_test -> _test.ports()[0].id()))
            .vlanId(testVlan.id())
            .nniVlan(1056)
            .build());

    }
}
```
```yaml
resources:
  testVlan:
    type: equinix:metal:Vlan
    name: test
    properties:
      projectId: ${projectId}
      metro: ${test.metro}
  testVirtualCircuit:
    type: equinix:metal:VirtualCircuit
    name: test
    properties:
      connectionId: ${connId}
      projectId: ${projectId}
      portId: ${test.ports[0].id}
      vlanId: ${testVlan.id}
      nniVlan: 1056
variables:
  projectId: 52000fb2-ee46-4673-93a8-de2c2bdba33c
  connId: 73f12f29-3e19-43a0-8e90-ae81580db1e0
  test:
    fn::invoke:
      function: equinix:metal:getInterconnection
      arguments:
        connectionId: ${connId}
```
{{% /example %}}
