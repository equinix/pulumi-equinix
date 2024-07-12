## Example Usage

{{% example %}}
### ssh key
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

{{% example %}}
### example 3
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const existingProject = new equinix.metal.Project("existingProject", {
    name: "The name of the project (if different, will rewrite)",
    bgpConfig: {
        deploymentType: "local",
        md5: "C179c28c41a85b",
        asn: 65000,
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

existing_project = equinix.metal.Project("existingProject",
    name="The name of the project (if different, will rewrite)",
    bgp_config=equinix.metal.ProjectBgpConfigArgs(
        deployment_type="local",
        md5="C179c28c41a85b",
        asn=65000,
    ))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProject(ctx, "existingProject", &metal.ProjectArgs{
			Name: pulumi.String("The name of the project (if different, will rewrite)"),
			BgpConfig: &metal.ProjectBgpConfigArgs{
				DeploymentType: pulumi.String("local"),
				Md5:            pulumi.String("C179c28c41a85b"),
				Asn:            pulumi.Int(65000),
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
    var existingProject = new Equinix.Metal.Project("existingProject", new()
    {
        Name = "The name of the project (if different, will rewrite)",
        BgpConfig = new Equinix.Metal.Inputs.ProjectBgpConfigArgs
        {
            DeploymentType = "local",
            Md5 = "C179c28c41a85b",
            Asn = 65000,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Project;
import com.pulumi.equinix.metal.ProjectArgs;
import com.pulumi.equinix.metal.inputs.ProjectBgpConfigArgs;
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
        var existingProject = new Project("existingProject", ProjectArgs.builder()
            .name("The name of the project (if different, will rewrite)")
            .bgpConfig(ProjectBgpConfigArgs.builder()
                .deploymentType("local")
                .md5("C179c28c41a85b")
                .asn(65000)
                .build())
            .build());

    }
}
```
```yaml
  existingProject:
    type: equinix:metal:Project
    name: existing_project
    properties:
      name: The name of the project (if different, will rewrite)
      bgpConfig:
        deploymentType: local
        md5: C179c28c41a85b
        asn: 65000
```
{{% /example %}}

{{% example %}}
### api key
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.ProjectApiKey("test", {
    projectId: existingProjectId,
    description: "Read-only key scoped to a projct",
    readOnly: true,
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.ProjectApiKey("test",
    project_id=existing_project_id,
    description="Read-only key scoped to a projct",
    read_only=True)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProjectApiKey(ctx, "test", &metal.ProjectApiKeyArgs{
			ProjectId:   pulumi.Any(existingProjectId),
			Description: pulumi.String("Read-only key scoped to a projct"),
			ReadOnly:    pulumi.Bool(true),
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
    var test = new Equinix.Metal.ProjectApiKey("test", new()
    {
        ProjectId = existingProjectId,
        Description = "Read-only key scoped to a projct",
        ReadOnly = true,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ProjectApiKey;
import com.pulumi.equinix.metal.ProjectApiKeyArgs;
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
        var test = new ProjectApiKey("test", ProjectApiKeyArgs.builder()
            .projectId(existingProjectId)
            .description("Read-only key scoped to a projct")
            .readOnly(true)
            .build());

    }
}
```
```yaml
  # Create a new read-only API key in existing project
  test:
    type: equinix:metal:ProjectApiKey
    properties:
      projectId: ${existingProjectId}
      description: Read-only key scoped to a projct
      readOnly: true
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const tfProject1 = new equinix.metal.Project("tfProject1", {
    name: "tftest",
    bgpConfig: {
        deploymentType: "local",
        md5: "C179c28c41a85b",
        asn: 65000,
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

tf_project1 = equinix.metal.Project("tfProject1",
    name="tftest",
    bgp_config=equinix.metal.ProjectBgpConfigArgs(
        deployment_type="local",
        md5="C179c28c41a85b",
        asn=65000,
    ))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProject(ctx, "tfProject1", &metal.ProjectArgs{
			Name: pulumi.String("tftest"),
			BgpConfig: &metal.ProjectBgpConfigArgs{
				DeploymentType: pulumi.String("local"),
				Md5:            pulumi.String("C179c28c41a85b"),
				Asn:            pulumi.Int(65000),
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
    var tfProject1 = new Equinix.Metal.Project("tfProject1", new()
    {
        Name = "tftest",
        BgpConfig = new Equinix.Metal.Inputs.ProjectBgpConfigArgs
        {
            DeploymentType = "local",
            Md5 = "C179c28c41a85b",
            Asn = 65000,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Project;
import com.pulumi.equinix.metal.ProjectArgs;
import com.pulumi.equinix.metal.inputs.ProjectBgpConfigArgs;
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
        var tfProject1 = new Project("tfProject1", ProjectArgs.builder()
            .name("tftest")
            .bgpConfig(ProjectBgpConfigArgs.builder()
                .deploymentType("local")
                .md5("C179c28c41a85b")
                .asn(65000)
                .build())
            .build());

    }
}
```
```yaml
  # Create a new Project
  tfProject1:
    type: equinix:metal:Project
    name: tf_project_1
    properties:
      name: tftest
      bgpConfig:
        deploymentType: local
        md5: C179c28c41a85b
        asn: 65000
```
{{% /example %}}

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const tfProject1 = new equinix.metal.Project("tfProject1", {name: "Terraform Fun"});
```
```python
import pulumi
import pulumi_equinix as equinix

tf_project1 = equinix.metal.Project("tfProject1", name="Terraform Fun")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProject(ctx, "tfProject1", &metal.ProjectArgs{
			Name: pulumi.String("Terraform Fun"),
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
    var tfProject1 = new Equinix.Metal.Project("tfProject1", new()
    {
        Name = "Terraform Fun",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Project;
import com.pulumi.equinix.metal.ProjectArgs;
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
        var tfProject1 = new Project("tfProject1", ProjectArgs.builder()
            .name("Terraform Fun")
            .build());

    }
}
```
```yaml
  tfProject1:
    type: equinix:metal:Project
    name: tf_project_1
    properties:
      name: Terraform Fun
```
{{% /example %}}


