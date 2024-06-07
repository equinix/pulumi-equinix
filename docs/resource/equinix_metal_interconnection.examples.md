## Example Usage

{{% example %}}
### equinix metal interconnection fabric billed token
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "SV";
const speedInMbps = config.getNumber("speedInMbps") || 200;
const connection = new equinix.metal.Interconnection("connection", {
    name: "fabric-port-to-metal",
    projectId: projectId,
    type: "shared",
    redundancy: "primary",
    metro: metro,
    speed: `${speedInMbps}Mbps`,
    serviceTokenType: "z_side",
});
export const connectionStatus = connection.status;
export const connectionTokens = connection.serviceTokens;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 200
connection = equinix.metal.Interconnection("connection",
    name="fabric-port-to-metal",
    project_id=project_id,
    type="shared",
    redundancy="primary",
    metro=metro,
    speed=f"{speed_in_mbps}Mbps",
    service_token_type="z_side")
pulumi.export("connectionStatus", connection.status)
pulumi.export("connectionTokens", connection.service_tokens)
```
```go
package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		speedInMbps := 200
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
			Name:             pulumi.String("fabric-port-to-metal"),
			ProjectId:        pulumi.String(projectId),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String(metro),
			Speed:            pulumi.String(fmt.Sprintf("%vMbps", speedInMbps)),
			ServiceTokenType: pulumi.String("z_side"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionStatus", connection.Status)
		ctx.Export("connectionTokens", connection.ServiceTokens)
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
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "SV";
    var speedInMbps = config.GetInt32("speedInMbps") ?? 200;
    var connection = new Equinix.Metal.Interconnection("connection", new()
    {
        Name = "fabric-port-to-metal",
        ProjectId = projectId,
        Type = "shared",
        Redundancy = "primary",
        Metro = metro,
        Speed = $"{speedInMbps}Mbps",
        ServiceTokenType = "z_side",
    });

    return new Dictionary<string, object?>
    {
        ["connectionStatus"] = connection.Status,
        ["connectionTokens"] = connection.ServiceTokens,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
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
        final var projectId = config.get("projectId");
        final var metro = config.get("metro").orElse("SV");
        final var speedInMbps = config.get("speedInMbps").orElse(200);
        var connection = new Interconnection("connection", InterconnectionArgs.builder()        
            .name("fabric-port-to-metal")
            .projectId(projectId)
            .type("shared")
            .redundancy("primary")
            .metro(metro)
            .speed(String.format("%sMbps", speedInMbps))
            .serviceTokenType("z_side")
            .build());

        ctx.export("connectionStatus", connection.status());
        ctx.export("connectionTokens", connection.serviceTokens());
    }
}
```
```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: SV
  speedInMbps:
    type: integer
    default: 200
resources:
  connection:
    type: equinix:metal:Interconnection
    properties:
      name: fabric-port-to-metal
      projectId: ${projectId}
      type: shared
      redundancy: primary
      metro: ${metro}
      speed: ${speedInMbps}Mbps
      serviceTokenType: z_side
outputs:
  connectionStatus: ${connection.status}
  connectionTokens: ${connection.serviceTokens}
```
{{% /example %}}

{{% example %}}
### equinix metal interconnection metal billed token
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "SV";
const speedInMbps = config.getNumber("speedInMbps") || 1000;
const connection = new equinix.metal.Interconnection("connection", {
    name: "metal-to-cloudprovider",
    projectId: projectId,
    type: "shared",
    redundancy: "primary",
    metro: metro,
    speed: `${speedInMbps}Mbps`,
    serviceTokenType: "a_side",
});
export const connectionStatus = connection.status;
export const connectionTokens = connection.serviceTokens;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
speed_in_mbps = config.get_int("speedInMbps")
if speed_in_mbps is None:
    speed_in_mbps = 1000
connection = equinix.metal.Interconnection("connection",
    name="metal-to-cloudprovider",
    project_id=project_id,
    type="shared",
    redundancy="primary",
    metro=metro,
    speed=f"{speed_in_mbps}Mbps",
    service_token_type="a_side")
pulumi.export("connectionStatus", connection.status)
pulumi.export("connectionTokens", connection.service_tokens)
```
```go
package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		speedInMbps := 1000
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
			Name:             pulumi.String("metal-to-cloudprovider"),
			ProjectId:        pulumi.String(projectId),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String(metro),
			Speed:            pulumi.String(fmt.Sprintf("%vMbps", speedInMbps)),
			ServiceTokenType: pulumi.String("a_side"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionStatus", connection.Status)
		ctx.Export("connectionTokens", connection.ServiceTokens)
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
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "SV";
    var speedInMbps = config.GetInt32("speedInMbps") ?? 1000;
    var connection = new Equinix.Metal.Interconnection("connection", new()
    {
        Name = "metal-to-cloudprovider",
        ProjectId = projectId,
        Type = "shared",
        Redundancy = "primary",
        Metro = metro,
        Speed = $"{speedInMbps}Mbps",
        ServiceTokenType = "a_side",
    });

    return new Dictionary<string, object?>
    {
        ["connectionStatus"] = connection.Status,
        ["connectionTokens"] = connection.ServiceTokens,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
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
        final var projectId = config.get("projectId");
        final var metro = config.get("metro").orElse("SV");
        final var speedInMbps = config.get("speedInMbps").orElse(1000);
        var connection = new Interconnection("connection", InterconnectionArgs.builder()        
            .name("metal-to-cloudprovider")
            .projectId(projectId)
            .type("shared")
            .redundancy("primary")
            .metro(metro)
            .speed(String.format("%sMbps", speedInMbps))
            .serviceTokenType("a_side")
            .build());

        ctx.export("connectionStatus", connection.status());
        ctx.export("connectionTokens", connection.serviceTokens());
    }
}
```
```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: SV
  speedInMbps:
    type: integer
    default: 1000
resources:
  connection:
    type: equinix:metal:Interconnection
    properties:
      name: metal-to-cloudprovider
      projectId: ${projectId}
      type: shared
      redundancy: primary
      metro: ${metro}
      speed: ${speedInMbps}Mbps
      serviceTokenType: a_side
outputs:
  connectionStatus: ${connection.status}
  connectionTokens: ${connection.serviceTokens}
```
{{% /example %}}


