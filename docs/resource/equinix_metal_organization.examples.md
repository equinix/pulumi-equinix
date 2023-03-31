## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const orgResource = new equinix.metal.Organization("org", {
    name: "Foo Organization",
    address: {
        address: "org street",
        city: "london",
        country: "GB",
        zipCode: "12345",
    },
    description: "An organization",
});
export const org = orgResource.id;
```
```python
import pulumi
import pulumi_equinix as equinix

org_resource = equinix.metal.Organization("org",
    name="Foo Organization",
    address=equinix.metal.OrganizationAddressArgs(
        address="org street",
        city="london",
        country="GB",
        zip_code="12345",
    ),
    description="An organization")
pulumi.export("org", org_resource.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		orgResource, err := metal.NewOrganization(ctx, "org", &metal.OrganizationArgs{
			Name: pulumi.String("Foo Organization"),
			Address: &metal.OrganizationAddressArgs{
				Address: pulumi.String("org street"),
				City:    pulumi.String("london"),
				Country: pulumi.String("GB"),
				ZipCode: pulumi.String("12345"),
			},
			Description: pulumi.String("An organization"),
		})
		if err != nil {
			return err
		}
		ctx.Export("org", orgResource.ID())
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var orgResource = new Equinix.Metal.Organization("org", new()
    {
        Name = "Foo Organization",
        Address = new Equinix.Metal.Inputs.OrganizationAddressArgs
        {
            Address = "org street",
            City = "london",
            Country = "GB",
            ZipCode = "12345",
        },
        Description = "An organization",
    });

    return new Dictionary<string, object?>
    {
        ["org"] = orgResource.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.metal.Organization;
import com.equinix.pulumi.metal.OrganizationArgs;
import com.equinix.pulumi.metal.inputs.OrganizationAddressArgs;
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
        var orgResource = new Organization("orgResource", OrganizationArgs.builder()        
            .name("Foo Organization")
            .address(OrganizationAddressArgs.builder()
                .address("org street")
                .city("london")
                .country("GB")
                .zipCode("12345")
                .build())
            .description("An organization")
            .build());

        ctx.export("org", orgResource.id());
    }
}
```
```yaml
resources:
  org:
    type: equinix:metal:Organization
    properties:
      name: Foo Organization
      address:
        address: org street
        city: london
        country: GB
        zipCode: "12345"
      description: An organization
outputs:
  org: ${org.id}
```
{{% /example %}}
