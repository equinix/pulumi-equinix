{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const org = new equinix.metal.Port("org", {
    portId: portId,
    bonded: true,
    layer2: true,
});
export const portType = port.type;
export const portBondedNetworkType = port.networkType;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
org = equinix.metal.Port("org",
    port_id=port_id,
    bonded=True,
    layer2=True)
pulumi.export("portType", port["type"])
pulumi.export("portBondedNetworkType", port["networkType"])
```

{{% /choosable %}}

{{% choosable language go %}}

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
		portId := cfg.Require("portId")
		_, err := metal.NewPort(ctx, "org", &metal.PortArgs{
			PortId: pulumi.String(portId),
			Bonded: pulumi.Bool(true),
			Layer2: pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		ctx.Export("portType", port.Type)
		ctx.Export("portBondedNetworkType", port.NetworkType)
		return nil
	})
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var portId = config.Require("portId");
    var org = new Equinix.Metal.Port("org", new()
    {
        PortId = portId,
        Bonded = true,
        Layer2 = true,
    });

    return new Dictionary<string, object?>
    {
        ["portType"] = port.Type,
        ["portBondedNetworkType"] = port.NetworkType,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Port;
import com.pulumi.equinix.metal.PortArgs;
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
        final var config = ctx.config();
        final var portId = config.get("portId");
        var org = new Port("org", PortArgs.builder()        
            .portId(portId)
            .bonded(true)
            .layer2(true)
            .build());

        ctx.export("portType", port.type());
        ctx.export("portBondedNetworkType", port.networkType());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  portId:
    type: string
resources:
  org:
    type: equinix:metal:Port
    properties:
      portId: ${portId}
      bonded: true
      layer2: true
outputs:
  portType: ${port.type}
  portBondedNetworkType: ${port.networkType}
```

{{% /choosable %}}
