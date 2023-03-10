---
title: Equinix
meta_desc: Provides an overview of the Equinix Provider for Pulumi.
layout: overview
---

The Equinix provider for Pulumi can be used to provision resources in [Equinix](https://deploy.Equinix.com).

The Equinix provider must be configured with credentials to create and update resources in Equinix.

## Example

{{< chooser language "typescript,python,go,csharp,java,yaml" >}}
{{% choosable language typescript %}}

```typescript
import * as equinix from "@equinix/pulumi-equinix";

const web1 = new equinix.metal.Device("web1", {
    hostname: "webserver1",
    plan: "c3.small.x86",
    metro: "sv",
    operatingSystem: "ubuntu_20_04",
    billingCycle: "hourly",
    projectId: "my-project-id",
});
```

{{% /choosable %}}
{{% choosable language python %}}

```python
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="webserver1",
    plan="c3.small.x86",
    metro="sv",
    operating_system="ubuntu_20_04",
    billing_cycle="hourly",
    project_id="my-project-id")
```

{{% /choosable %}}
{{% choosable language go %}}

```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
    pulumi.Run(func(ctx *pulumi.Context) error {
        _, err := metal.NewDevice(ctx, "web1", &metal.DeviceArgs{
            Hostname:        pulumi.String("webserver1"),
            Plan:            pulumi.String("c3.small.x86"),
            Metro:           pulumi.String("sv"),
            OperatingSystem: pulumi.String("ubuntu_20_04"),
            BillingCycle:    pulumi.String("hourly"),
            ProjectId:       pulumi.Any("my-project-id"),
        })
        if err != nil {
            return err
        }
        return nil
    })
}
```

{{% /choosable %}}
{{% choosable language csharp %}}

```csharp
using Pulumi;
using Equinix = Pulumi.Equinix;

class MyStack : Stack
{
    public MyStack()
    {
        var web1 = new EquinixMetal.Device("web1", new EquinixMetal.DeviceArgs
        {
            Hostname = "webserver1",
            Plan = "c3.small.x86",
            Metro = "sv",
            OperatingSystem = "ubuntu_20_04",
            BillingCycle = "hourly",
            ProjectId = "my-project-id",
        });
    }

}
```

{{% /choosable %}}
{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.equinix.metal.Device;
import com.equinix.pulumi.equinix.metal.DeviceArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var web1 = new Device("web1";, DeviceArgs.builder()        
            .hostname("webserver1")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId("my-project-id")
            .build());
    }
}
```

{{% /choosable %}}
{{% choosable language yaml %}}

```yaml
resources:
  web:
    type: equinix:metal:Device
    properties:
      hostname: webserver1
      instanceType: c3.small.x86
      operatingSystem: ubuntu_20_04
      metro: sv
      billingCycle: hourly
      projectId: my-project-id
```

{{% /choosable %}}

{{< /chooser >}}
