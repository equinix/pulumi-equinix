## Example Usage

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const web1 = new equinix.metal.Device("web1", {
    hostname: "tf.coreos2",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
```
```python
import pulumi
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="tf.coreos2",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "web1", &metal.DeviceArgs{
			Hostname:        pulumi.String("tf.coreos2"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
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
    var web1 = new Equinix.Metal.Device("web1", new()
    {
        Hostname = "tf.coreos2",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        var web1 = new Device("web1", DeviceArgs.builder()
            .hostname("tf.coreos2")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

    }
}
```
```yaml
resources:
  web1:
    type: equinix:metal:Device
    properties:
      hostname: tf.coreos2
      plan: c3.small.x86
      metro: sv
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectId: ${projectId}
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const pxe1 = new equinix.metal.Device("pxe1", {
    hostname: "tf.coreos2-pxe",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: equinix.metal.OperatingSystem.CustomIPXE,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
    ipxeScriptUrl: "https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
    alwaysPxe: false,
    userData: example.rendered,
});
```
```python
import pulumi
import pulumi_equinix as equinix

pxe1 = equinix.metal.Device("pxe1",
    hostname="tf.coreos2-pxe",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system=equinix.metal.OperatingSystem.CUSTOM_IPXE,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    ipxe_script_url="https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
    always_pxe=False,
    user_data=example["rendered"])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "pxe1", &metal.DeviceArgs{
			Hostname:        pulumi.String("tf.coreos2-pxe"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String(metal.OperatingSystemCustomIPXE),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
			IpxeScriptUrl:   pulumi.String("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe"),
			AlwaysPxe:       pulumi.Bool(false),
			UserData:        pulumi.Any(example.Rendered),
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
    var pxe1 = new Equinix.Metal.Device("pxe1", new()
    {
        Hostname = "tf.coreos2-pxe",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = Equinix.Metal.OperatingSystem.CustomIPXE,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
        IpxeScriptUrl = "https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
        AlwaysPxe = false,
        UserData = example.Rendered,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        var pxe1 = new Device("pxe1", DeviceArgs.builder()
            .hostname("tf.coreos2-pxe")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("custom_ipxe")
            .billingCycle("hourly")
            .projectId(projectId)
            .ipxeScriptUrl("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe")
            .alwaysPxe(false)
            .userData(example.rendered())
            .build());

    }
}
```
```yaml
resources:
  pxe1:
    type: equinix:metal:Device
    properties:
      hostname: tf.coreos2-pxe
      plan: c3.small.x86
      metro: sv
      operatingSystem: custom_ipxe
      billingCycle: hourly
      projectId: ${projectId}
      ipxeScriptUrl: https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe
      alwaysPxe: 'false'
      userData: ${example.rendered}
```
{{% /example %}}

{{% example %}}
### example 3
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const web1 = new equinix.metal.Device("web1", {
    hostname: "tf.coreos2",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
    ipAddresses: [{
        type: "private_ipv4",
        cidr: 30,
    }],
});
```
```python
import pulumi
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="tf.coreos2",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    ip_addresses=[{
        "type": "private_ipv4",
        "cidr": 30,
    }])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "web1", &metal.DeviceArgs{
			Hostname:        pulumi.String("tf.coreos2"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
			IpAddresses: metal.DeviceIpAddressArray{
				&metal.DeviceIpAddressArgs{
					Type: pulumi.String("private_ipv4"),
					Cidr: pulumi.Int(30),
				},
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
    var web1 = new Equinix.Metal.Device("web1", new()
    {
        Hostname = "tf.coreos2",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
        IpAddresses = new[]
        {
            new Equinix.Metal.Inputs.DeviceIpAddressArgs
            {
                Type = "private_ipv4",
                Cidr = 30,
            },
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.inputs.DeviceIpAddressArgs;
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
        var web1 = new Device("web1", DeviceArgs.builder()
            .hostname("tf.coreos2")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .ipAddresses(DeviceIpAddressArgs.builder()
                .type("private_ipv4")
                .cidr(30)
                .build())
            .build());

    }
}
```
```yaml
resources:
  web1:
    type: equinix:metal:Device
    properties:
      hostname: tf.coreos2
      plan: c3.small.x86
      metro: ny
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectId: ${projectId}
      ipAddresses:
        - type: private_ipv4
          cidr: 30
```
{{% /example %}}

{{% example %}}
### example 4
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const web1 = new equinix.metal.Device("web1", {
    hostname: "tftest",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
    hardwareReservationId: "next-available",
    storage: `{
  "disks": [
    {
      "device": "/dev/sda",
      "wipeTable": true,
      "partitions": [
        {
          "label": "BIOS",
          "number": 1,
          "size": "4096"
        },
        {
          "label": "SWAP",
          "number": 2,
          "size": "3993600"
        },
        {
          "label": "ROOT",
          "number": 3,
          "size": "0"
        }
      ]
    }
  ],
  "filesystems": [
    {
      "mount": {
        "device": "/dev/sda3",
        "format": "ext4",
        "point": "/",
        "create": {
          "options": [
            "-L",
            "ROOT"
          ]
        }
      }
    },
    {
      "mount": {
        "device": "/dev/sda2",
        "format": "swap",
        "point": "none",
        "create": {
          "options": [
            "-L",
            "SWAP"
          ]
        }
      }
    }
  ]
}
`,
});
```
```python
import pulumi
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="tftest",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    hardware_reservation_id="next-available",
    storage="""{
  "disks": [
    {
      "device": "/dev/sda",
      "wipeTable": true,
      "partitions": [
        {
          "label": "BIOS",
          "number": 1,
          "size": "4096"
        },
        {
          "label": "SWAP",
          "number": 2,
          "size": "3993600"
        },
        {
          "label": "ROOT",
          "number": 3,
          "size": "0"
        }
      ]
    }
  ],
  "filesystems": [
    {
      "mount": {
        "device": "/dev/sda3",
        "format": "ext4",
        "point": "/",
        "create": {
          "options": [
            "-L",
            "ROOT"
          ]
        }
      }
    },
    {
      "mount": {
        "device": "/dev/sda2",
        "format": "swap",
        "point": "none",
        "create": {
          "options": [
            "-L",
            "SWAP"
          ]
        }
      }
    }
  ]
}
""")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "web1", &metal.DeviceArgs{
			Hostname:              pulumi.String("tftest"),
			Plan:                  pulumi.String(metal.PlanC3SmallX86),
			Metro:                 pulumi.String("ny"),
			OperatingSystem:       pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:          pulumi.String(metal.BillingCycleHourly),
			ProjectId:             pulumi.Any(projectId),
			HardwareReservationId: pulumi.String("next-available"),
			Storage: pulumi.String(`{
  "disks": [
    {
      "device": "/dev/sda",
      "wipeTable": true,
      "partitions": [
        {
          "label": "BIOS",
          "number": 1,
          "size": "4096"
        },
        {
          "label": "SWAP",
          "number": 2,
          "size": "3993600"
        },
        {
          "label": "ROOT",
          "number": 3,
          "size": "0"
        }
      ]
    }
  ],
  "filesystems": [
    {
      "mount": {
        "device": "/dev/sda3",
        "format": "ext4",
        "point": "/",
        "create": {
          "options": [
            "-L",
            "ROOT"
          ]
        }
      }
    },
    {
      "mount": {
        "device": "/dev/sda2",
        "format": "swap",
        "point": "none",
        "create": {
          "options": [
            "-L",
            "SWAP"
          ]
        }
      }
    }
  ]
}
`),
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
    var web1 = new Equinix.Metal.Device("web1", new()
    {
        Hostname = "tftest",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
        HardwareReservationId = "next-available",
        Storage = @"{
  ""disks"": [
    {
      ""device"": ""/dev/sda"",
      ""wipeTable"": true,
      ""partitions"": [
        {
          ""label"": ""BIOS"",
          ""number"": 1,
          ""size"": ""4096""
        },
        {
          ""label"": ""SWAP"",
          ""number"": 2,
          ""size"": ""3993600""
        },
        {
          ""label"": ""ROOT"",
          ""number"": 3,
          ""size"": ""0""
        }
      ]
    }
  ],
  ""filesystems"": [
    {
      ""mount"": {
        ""device"": ""/dev/sda3"",
        ""format"": ""ext4"",
        ""point"": ""/"",
        ""create"": {
          ""options"": [
            ""-L"",
            ""ROOT""
          ]
        }
      }
    },
    {
      ""mount"": {
        ""device"": ""/dev/sda2"",
        ""format"": ""swap"",
        ""point"": ""none"",
        ""create"": {
          ""options"": [
            ""-L"",
            ""SWAP""
          ]
        }
      }
    }
  ]
}
",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        var web1 = new Device("web1", DeviceArgs.builder()
            .hostname("tftest")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .hardwareReservationId("next-available")
            .storage("""
{
  "disks": [
    {
      "device": "/dev/sda",
      "wipeTable": true,
      "partitions": [
        {
          "label": "BIOS",
          "number": 1,
          "size": "4096"
        },
        {
          "label": "SWAP",
          "number": 2,
          "size": "3993600"
        },
        {
          "label": "ROOT",
          "number": 3,
          "size": "0"
        }
      ]
    }
  ],
  "filesystems": [
    {
      "mount": {
        "device": "/dev/sda3",
        "format": "ext4",
        "point": "/",
        "create": {
          "options": [
            "-L",
            "ROOT"
          ]
        }
      }
    },
    {
      "mount": {
        "device": "/dev/sda2",
        "format": "swap",
        "point": "none",
        "create": {
          "options": [
            "-L",
            "SWAP"
          ]
        }
      }
    }
  ]
}
            """)
            .build());

    }
}
```
```yaml
resources:
  web1:
    type: equinix:metal:Device
    properties:
      hostname: tftest
      plan: c3.small.x86
      metro: ny
      operatingSystem: ubuntu_20_04
      billingCycle: hourly
      projectId: ${projectId}
      hardwareReservationId: next-available
      storage: |
        {
          "disks": [
            {
              "device": "/dev/sda",
              "wipeTable": true,
              "partitions": [
                {
                  "label": "BIOS",
                  "number": 1,
                  "size": "4096"
                },
                {
                  "label": "SWAP",
                  "number": 2,
                  "size": "3993600"
                },
                {
                  "label": "ROOT",
                  "number": 3,
                  "size": "0"
                }
              ]
            }
          ],
          "filesystems": [
            {
              "mount": {
                "device": "/dev/sda3",
                "format": "ext4",
                "point": "/",
                "create": {
                  "options": [
                    "-L",
                    "ROOT"
                  ]
                }
              }
            },
            {
              "mount": {
                "device": "/dev/sda2",
                "format": "swap",
                "point": "none",
                "create": {
                  "options": [
                    "-L",
                    "SWAP"
                  ]
                }
              }
            }
          ]
        }
```
{{% /example %}}

{{% example %}}
### example 5
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const pxe1 = new equinix.metal.Device("pxe1", {
    hostname: "tf.coreos2-pxe",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: equinix.metal.OperatingSystem.CustomIPXE,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
    ipxeScriptUrl: "https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
    alwaysPxe: false,
    userData: userData,
    customData: customData,
    behavior: {
        allowChanges: [
            "custom_data",
            "user_data",
        ],
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

pxe1 = equinix.metal.Device("pxe1",
    hostname="tf.coreos2-pxe",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system=equinix.metal.OperatingSystem.CUSTOM_IPXE,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    ipxe_script_url="https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
    always_pxe=False,
    user_data=user_data,
    custom_data=custom_data,
    behavior={
        "allow_changes": [
            "custom_data",
            "user_data",
        ],
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
		_, err := metal.NewDevice(ctx, "pxe1", &metal.DeviceArgs{
			Hostname:        pulumi.String("tf.coreos2-pxe"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String(metal.OperatingSystemCustomIPXE),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
			IpxeScriptUrl:   pulumi.String("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe"),
			AlwaysPxe:       pulumi.Bool(false),
			UserData:        pulumi.Any(userData),
			CustomData:      pulumi.Any(customData),
			Behavior: &metal.DeviceBehaviorArgs{
				AllowChanges: pulumi.StringArray{
					pulumi.String("custom_data"),
					pulumi.String("user_data"),
				},
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
    var pxe1 = new Equinix.Metal.Device("pxe1", new()
    {
        Hostname = "tf.coreos2-pxe",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = Equinix.Metal.OperatingSystem.CustomIPXE,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
        IpxeScriptUrl = "https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
        AlwaysPxe = false,
        UserData = userData,
        CustomData = customData,
        Behavior = new Equinix.Metal.Inputs.DeviceBehaviorArgs
        {
            AllowChanges = new[]
            {
                "custom_data",
                "user_data",
            },
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.inputs.DeviceBehaviorArgs;
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
        var pxe1 = new Device("pxe1", DeviceArgs.builder()
            .hostname("tf.coreos2-pxe")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("custom_ipxe")
            .billingCycle("hourly")
            .projectId(projectId)
            .ipxeScriptUrl("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe")
            .alwaysPxe(false)
            .userData(userData)
            .customData(customData)
            .behavior(DeviceBehaviorArgs.builder()
                .allowChanges(                
                    "custom_data",
                    "user_data")
                .build())
            .build());

    }
}
```
```yaml
resources:
  pxe1:
    type: equinix:metal:Device
    properties:
      hostname: tf.coreos2-pxe
      plan: c3.small.x86
      metro: sv
      operatingSystem: custom_ipxe
      billingCycle: hourly
      projectId: ${projectId}
      ipxeScriptUrl: https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe
      alwaysPxe: 'false'
      userData: ${userData}
      customData: ${customData}
      behavior:
        allowChanges:
          - custom_data
          - user_data
```
{{% /example %}}


