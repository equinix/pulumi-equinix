## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const projectId = "<UUID_of_your_project>";
const test = new equinix.metal.ProjectSshKey("test", {
    name: "test",
    publicKey: "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2",
    projectId: projectId,
});
const testDevice = new equinix.metal.Device("testDevice", {
    hostname: "test",
    plan: equinix.metal.Plan.C3MediumX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectSshKeyIds: [test.id],
    projectId: projectId,
});
```
```python
import pulumi
import pulumi_equinix as equinix

project_id = "<UUID_of_your_project>"
test = equinix.metal.ProjectSshKey("test",
    name="test",
    public_key="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2",
    project_id=project_id)
test_device = equinix.metal.Device("testDevice",
    hostname="test",
    plan=equinix.metal.Plan.C3_MEDIUM_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_ssh_key_ids=[test.id],
    project_id=project_id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		projectId := "<UUID_of_your_project>"
		test, err := metal.NewProjectSshKey(ctx, "test", &metal.ProjectSshKeyArgs{
			Name:      pulumi.String("test"),
			PublicKey: pulumi.String("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2"),
			ProjectId: pulumi.String(projectId),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewDevice(ctx, "testDevice", &metal.DeviceArgs{
			Hostname:        pulumi.String("test"),
			Plan:            pulumi.String(metal.PlanC3MediumX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectSshKeyIds: pulumi.StringArray{
				test.ID(),
			},
			ProjectId: pulumi.String(projectId),
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
    var projectId = "<UUID_of_your_project>";

    var test = new Equinix.Metal.ProjectSshKey("test", new()
    {
        Name = "test",
        PublicKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2",
        ProjectId = projectId,
    });

    var testDevice = new Equinix.Metal.Device("testDevice", new()
    {
        Hostname = "test",
        Plan = Equinix.Metal.Plan.C3MediumX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectSshKeyIds = new[]
        {
            test.Id,
        },
        ProjectId = projectId,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ProjectSshKey;
import com.pulumi.equinix.metal.ProjectSshKeyArgs;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        final var projectId = "<UUID_of_your_project>";

        var test = new ProjectSshKey("test", ProjectSshKeyArgs.builder()
            .name("test")
            .publicKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2")
            .projectId(projectId)
            .build());

        var testDevice = new Device("testDevice", DeviceArgs.builder()
            .hostname("test")
            .plan("c3.medium.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectSshKeyIds(test.id())
            .projectId(projectId)
            .build());

    }
}
```
```yaml
  test:
    type: equinix:metal:ProjectSshKey
    properties:
      name: test
      publicKey: ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDM/unxJeFqxsTJcu6mhqsMHSaVlpu+Jj/P+44zrm6X/MAoHSX3X9oLgujEjjZ74yLfdfe0bJrbL2YgJzNaEkIQQ1VPMHB5EhTKUBGnzlPP0hHTnxsjAm9qDHgUPgvgFDQSAMzdJRJ0Cexo16Ph9VxCoLh3dxiE7s2gaM2FdVg7P8aSxKypsxAhYV3D0AwqzoOyT6WWhBoQ0xZ85XevOTnJCpImSemEGs6nVGEsWcEc1d1YvdxFjAK4SdsKUMkj4Dsy/leKsdi/DEAf356vbMT1UHsXXvy5TlHu/Pa6qF53v32Enz+nhKy7/8W2Yt2yWx8HnQcT2rug9lvCXagJO6oauqRTO77C4QZn13ZLMZgLT66S/tNh2EX0gi6vmIs5dth8uF+K6nxIyKJXbcA4ASg7F1OJrHKFZdTc5v1cPeq6PcbqGgc+8SrPYQmzvQqLoMBuxyos2hUkYOmw3aeWJj9nFa8Wu5WaN89mUeOqSkU4S5cgUzWUOmKey56B/j/s1sVys9rMhZapVs0wL4L9GBBM48N5jAQZnnpo85A8KsZq5ME22bTLqnxsDXqDYZvS7PSI6Dxi7eleOFE/NYYDkrgDLHTQri8ucDMVeVWHgoMY2bPXdn7KKy5jW5jKsf8EPARXg77A4gRYmgKrcwIKqJEUPqyxJBe0CPoGTqgXPRsUiQ== tomk@hp2
      projectId: ${projectId}
  testDevice:
    type: equinix:metal:Device
    name: test
    properties:
      hostname: test
      plan: c3.medium.x86
      metro: ny
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectSshKeyIds:
        - ${test.id}
      projectId: ${projectId}
variables:
  projectId: <UUID_of_your_project>
```
{{% /example %}}
