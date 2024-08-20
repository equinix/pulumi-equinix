## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const req = new equinix.metal.SpotMarketRequest("req", {
    projectId: projectId,
    maxBidPrice: 0.03,
    metro: "ny",
    devicesMin: 1,
    devicesMax: 1,
    instanceParameters: {
        hostname: "testspot",
        billingCycle: "hourly",
        operatingSystem: "ubuntu_20_04",
        plan: "c3.small.x86",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

req = equinix.metal.SpotMarketRequest("req",
    project_id=project_id,
    max_bid_price=0.03,
    metro="ny",
    devices_min=1,
    devices_max=1,
    instance_parameters={
        "hostname": "testspot",
        "billing_cycle": "hourly",
        "operating_system": "ubuntu_20_04",
        "plan": "c3.small.x86",
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewSpotMarketRequest(ctx, "req", &metal.SpotMarketRequestArgs{
			ProjectId:   pulumi.Any(projectId),
			MaxBidPrice: pulumi.Float64(0.03),
			Metro:       pulumi.String("ny"),
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
    var req = new Equinix.Metal.SpotMarketRequest("req", new()
    {
        ProjectId = projectId,
        MaxBidPrice = 0.03,
        Metro = "ny",
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
        var req = new SpotMarketRequest("req", SpotMarketRequestArgs.builder()
            .projectId(projectId)
            .maxBidPrice(0.03)
            .metro("ny")
            .devicesMin(1)
            .devicesMax(1)
            .instanceParameters(SpotMarketRequestInstanceParametersArgs.builder()
                .hostname("testspot")
                .billingCycle("hourly")
                .operatingSystem("ubuntu_20_04")
                .plan("c3.small.x86")
                .build())
            .build());

    }
}
```
```yaml
resources:
  # Create a spot market request
  req:
    type: equinix:metal:SpotMarketRequest
    properties:
      projectId: ${projectId}
      maxBidPrice: 0.03
      metro: ny
      devicesMin: 1
      devicesMax: 1
      instanceParameters:
        hostname: testspot
        billingCycle: hourly
        operatingSystem: ubuntu_20_04
        plan: c3.small.x86
```
{{% /example %}}
