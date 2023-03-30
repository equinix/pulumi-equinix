## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "FR";
const type = config.get("type") || "public_ipv4";
const quantity = config.getNumber("quantity") || 1;
const ipBlock = new equinix.metal.ReservedIpBlock("ipBlock", {
    projectId: projectId,
    type: "public_ipv4",
    quantity: quantity,
    metro: metro,
});
export const ipBlockId = ipBlock.id;
export const ipBlockSubent = ipBlock.cidrNotation;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "FR"
type = config.get("type")
if type is None:
    type = "public_ipv4"
quantity = config.get_int("quantity")
if quantity is None:
    quantity = 1
ip_block = equinix.metal.ReservedIpBlock("ipBlock",
    project_id=project_id,
    type="public_ipv4",
    quantity=quantity,
    metro=metro)
pulumi.export("ipBlockId", ip_block.id)
pulumi.export("ipBlockSubent", ip_block.cidr_notation)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "FR"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		_type := "public_ipv4"
		if param := cfg.Get("type"); param != "" {
			_type = param
		}
		quantity := 1
		if param := cfg.GetInt("quantity"); param != 0 {
			quantity = param
		}
		ipBlock, err := metal.NewReservedIpBlock(ctx, "ipBlock", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.String(projectId),
			Type:      pulumi.String("public_ipv4"),
			Quantity:  pulumi.Int(quantity),
			Metro:     pulumi.String(metro),
		})
		if err != nil {
			return err
		}
		ctx.Export("ipBlockId", ipBlock.ID())
		ctx.Export("ipBlockSubent", ipBlock.CidrNotation)
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
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "FR";
    var type = config.Get("type") ?? "public_ipv4";
    var quantity = config.GetNumber("quantity") ?? 1;
    var ipBlock = new Equinix.Metal.ReservedIpBlock("ipBlock", new()
    {
        ProjectId = projectId,
        Type = "public_ipv4",
        Quantity = quantity,
        Metro = metro,
    });

    return new Dictionary<string, object?>
    {
        ["ipBlockId"] = ipBlock.Id,
        ["ipBlockSubent"] = ipBlock.CidrNotation,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.ReservedIpBlock;
import com.equinix.pulumi.metal.ReservedIpBlockArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var metro = config.get("metro").orElse("FR");
        final var type = config.get("type").orElse("public_ipv4");
        final var quantity = Integer.parseInt(config.get("quantity").orElse("1"));
        var ipBlock = new ReservedIpBlock("ipBlock", ReservedIpBlockArgs.builder()        
            .projectId(projectId)
            .type(type)
            .quantity(quantity)
            .metro(metro)
            .build());

        ctx.export("ipBlockId", ipBlock.id());
        ctx.export("ipBlockSubent", ipBlock.cidrNotation());
    }
}
```
```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: FR
  type:
    type: string
    default: public_ipv4
  quantity:
    type: integer
    default: 1
resources:
  ipBlock:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      type: public_ipv4
      quantity: ${quantity}
      metro: ${metro}
outputs:
  ipBlockId: ${ipBlock.id}
  ipBlockSubent: ${ipBlock.cidrNotation}
```
{{% /example %}}
