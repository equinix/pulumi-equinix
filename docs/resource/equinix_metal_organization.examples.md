## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const tfOrganization1 = new equinix.metal.Organization("tfOrganization1", {
    name: "foobar",
    description: "quux",
});
```
```python
import pulumi
import pulumi_equinix as equinix

tf_organization1 = equinix.metal.Organization("tfOrganization1",
    name="foobar",
    description="quux")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewOrganization(ctx, "tfOrganization1", &metal.OrganizationArgs{
			Name:        pulumi.String("foobar"),
			Description: pulumi.String("quux"),
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
    var tfOrganization1 = new Equinix.Metal.Organization("tfOrganization1", new()
    {
        Name = "foobar",
        Description = "quux",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.Organization;
import com.equinix.pulumi.equinix.metal.OrganizationArgs;
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
        var tfOrganization1 = new Organization("tfOrganization1", OrganizationArgs.builder()
            .name("foobar")
            .description("quux")
            .build());

    }
}
```
```yaml
resources:
  # Create a new Organization
  tfOrganization1:
    type: equinix:metal:Organization
    name: tf_organization_1
    properties:
      name: foobar
      description: quux
```
{{% /example %}}
