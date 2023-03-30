{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const port = new equinix.metal.Port("port", {
    portId: portId,
    bonded: false,
});
export const portType = port.type;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
port = equinix.metal.Port("port",
    port_id=port_id,
    bonded=False)
pulumi.export("portType", port["type"])
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
		port, err := metal.NewPort(ctx, "port", &metal.PortArgs{
			PortId: pulumi.String(portId),
			Bonded: pulumi.Bool(false),
		})
		if err != nil {
			return err
		}
		ctx.Export("portType", port.Type)
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
    var port = new Equinix.Metal.Port("port", new()
    {
        PortId = portId,
        Bonded = false,
    });

    return new Dictionary<string, object?>
    {
        ["portType"] = port.Type,
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
import com.equinix.pulumi.metal.Port;
import com.equinix.pulumi.metal.PortArgs;
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
        final var portId = config.get("portId").get();
        var port = new Port("port", PortArgs.builder()        
            .portId(portId)
            .bonded(false)
            .build());

        ctx.export("portType", port.type());
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
  port:
    type: equinix:metal:Port
    properties:
      portId: ${portId}
      bonded: false
outputs:
  portType: ${port.type}
```

{{% /choosable %}}
