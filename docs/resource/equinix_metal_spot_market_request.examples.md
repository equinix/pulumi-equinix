## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "FR";
const request = new equinix.metal.SpotMarketRequest("request", {
    projectId: projectId,
    metro: metro,
    maxBidPrice: 0.75,
    devicesMin: 1,
    devicesMax: 1,
    instanceParameters: {
        hostname: "testspot",
        billingCycle: "hourly",
        operatingSystem: "ubuntu_20_04",
        plan: "c3.small.x86",
    },
});
export const requestId = request.id;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "FR"
request = equinix.metal.SpotMarketRequest("request",
    project_id=project_id,
    metro=metro,
    max_bid_price=0.75,
    devices_min=1,
    devices_max=1,
    instance_parameters=equinix.metal.SpotMarketRequestInstanceParametersArgs(
        hostname="testspot",
        billing_cycle="hourly",
        operating_system="ubuntu_20_04",
        plan="c3.small.x86",
    ))
pulumi.export("requestId", request.id)
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
		request, err := metal.NewSpotMarketRequest(ctx, "request", &metal.SpotMarketRequestArgs{
			ProjectId:   pulumi.String(projectId),
			Metro:       pulumi.String(metro),
			MaxBidPrice: pulumi.Float64(0.75),
			DevicesMin:  pulumi.Int(1),
			DevicesMax:  pulumi.Int(1),
			InstanceParameters: &metal.SpotMarketRequestInstanceParametersArgs{
				Hostname:        pulumi.String("testspot"),
				BillingCycle:    pulumi.String("hourly"),
				OperatingSystem: pulumi.String("ubuntu_20_04"),
				Plan:            pulumi.String("c3.small.x86"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("requestId", request.ID())
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
    var metro = config.Get("metro") ?? "FR";
    var request = new Equinix.Metal.SpotMarketRequest("request", new()
    {
        ProjectId = projectId,
        Metro = metro,
        MaxBidPrice = 0.75,
        DevicesMin = 1,
        DevicesMax = 1,
        InstanceParameters = new Equinix.Metal.Inputs.SpotMarketRequestInstanceParametersArgs
        {
            Hostname = "testspot",
            BillingCycle = "hourly",
            OperatingSystem = "ubuntu_20_04",
            Plan = "c3.small.x86",
        },
    });

    return new Dictionary<string, object?>
    {
        ["requestId"] = request.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.SpotMarketRequest;
import com.pulumi.equinix.metal.SpotMarketRequestArgs;
import com.pulumi.equinix.metal.inputs.SpotMarketRequestInstanceParametersArgs;
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
        final var metro = config.get("metro").orElse("FR");
        var request = new SpotMarketRequest("request", SpotMarketRequestArgs.builder()
            .projectId(projectId)
            .metro(metro)
            .maxBidPrice(0.75)
            .devicesMin(1)
            .devicesMax(1)
            .instanceParameters(SpotMarketRequestInstanceParametersArgs.builder()
                .hostname("testspot")
                .billingCycle("hourly")
                .operatingSystem("ubuntu_20_04")
                .plan("c3.small.x86")
                .build())
            .build());

        ctx.export("requestId", request.id());
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
resources:
  request:
    type: equinix:metal:SpotMarketRequest
    properties:
      projectId: ${projectId}
      metro: ${metro}
      maxBidPrice: 0.75
      devicesMin: 1
      devicesMax: 1
      instanceParameters:
        hostname: testspot
        billingCycle: hourly
        operatingSystem: ubuntu_20_04
        plan: c3.small.x86
outputs:
  requestId: ${request.id}
```
{{% /example %}}
