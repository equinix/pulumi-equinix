## Example Usage

{{% example %}}
### equinix metal port hybrid bonded
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const vlanId = config.require("vlanId");
const port = new equinix.metal.Port("port", {
    portId: portId,
    bonded: true,
    layer2: false,
    vlanIds: [vlanId],
});
export const portType = port.type;
export const portBondedNetworkType = port.networkType;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
vlan_id = config.require("vlanId")
port = equinix.metal.Port("port",
    port_id=port_id,
    bonded=True,
    layer2=False,
    vlan_ids=[vlan_id])
pulumi.export("portType", port.type)
pulumi.export("portBondedNetworkType", port.network_type)
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
		portId := cfg.Require("portId")
		vlanId := cfg.Require("vlanId")
		port, err := metal.NewPort(ctx, "port", &metal.PortArgs{
			PortId: pulumi.String(portId),
			Bonded: pulumi.Bool(true),
			Layer2: pulumi.Bool(false),
			VlanIds: pulumi.StringArray{
				pulumi.String(vlanId),
			},
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
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var portId = config.Require("portId");
    var vlanId = config.Require("vlanId");
    var port = new Equinix.Metal.Port("port", new()
    {
        PortId = portId,
        Bonded = true,
        Layer2 = false,
        VlanIds = new[]
        {
            vlanId,
        },
    });

    return new Dictionary<string, object?>
    {
        ["portType"] = port.Type,
        ["portBondedNetworkType"] = port.NetworkType,
    };
});
```
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
        final var vlanId = config.get("vlanId");
        var port = new Port("port", PortArgs.builder()        
            .portId(portId)
            .bonded(true)
            .layer2(false)
            .vlanIds(vlanId)
            .build());

        ctx.export("portType", port.type());
        ctx.export("portBondedNetworkType", port.networkType());
    }
}
```
```yaml
config:
  portId:
    type: string
  vlanId:
    type: string
resources:
  port:
    type: equinix:metal:Port
    properties:
      portId: ${portId}
      bonded: true
      layer2: false
      vlanIds:
      - ${vlanId}
outputs:
  portType: ${port.type}
  portBondedNetworkType: ${port.networkType}
```
{{% /example %}}

{{% example %}}
### equinix metal port hybrid unbonded
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const port = new equinix.metal.Port("port", {
    portId: portId,
    bonded: false,
});
export const portType = port.type;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
port = equinix.metal.Port("port",
    port_id=port_id,
    bonded=False)
pulumi.export("portType", port.type)
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
```csharp
using System.Collections.Generic;
using System.Linq;
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
        var port = new Port("port", PortArgs.builder()        
            .portId(portId)
            .bonded(false)
            .build());

        ctx.export("portType", port.type());
    }
}
```
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
{{% /example %}}

{{% example %}}
### equinix metal port layer2 bonded
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const port = new equinix.metal.Port("port", {
    portId: portId,
    bonded: true,
    layer2: true,
});
export const portType = port.type;
export const portBondedNetworkType = port.networkType;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
port = equinix.metal.Port("port",
    port_id=port_id,
    bonded=True,
    layer2=True)
pulumi.export("portType", port.type)
pulumi.export("portBondedNetworkType", port.network_type)
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
		portId := cfg.Require("portId")
		port, err := metal.NewPort(ctx, "port", &metal.PortArgs{
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
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var portId = config.Require("portId");
    var port = new Equinix.Metal.Port("port", new()
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
        var port = new Port("port", PortArgs.builder()        
            .portId(portId)
            .bonded(true)
            .layer2(true)
            .build());

        ctx.export("portType", port.type());
        ctx.export("portBondedNetworkType", port.networkType());
    }
}
```
```yaml
config:
  portId:
    type: string
resources:
  port:
    type: equinix:metal:Port
    properties:
      portId: ${portId}
      bonded: true
      layer2: true
outputs:
  portType: ${port.type}
  portBondedNetworkType: ${port.networkType}
```
{{% /example %}}


