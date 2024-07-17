## Example Usage

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


