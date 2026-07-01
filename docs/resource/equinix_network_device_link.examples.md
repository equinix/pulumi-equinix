## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.networkedge.DeviceLink("test", {
    name: "test-DLG",
    projectId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    devices: [
        {
            id: testEquinixNetworkDevice.uuid,
            interfaceId: 6,
        },
        {
            id: testEquinixNetworkDevice.secondaryDevice[0].uuid,
            interfaceId: 7,
        },
    ],
    metroLinks: [
        {
            accountNumber: testEquinixNetworkDevice.accountNumber,
            metroCode: testEquinixNetworkDevice.metroCode,
            throughput: "50",
            throughputUnit: "Mbps",
        },
        {
            accountNumber: testEquinixNetworkDevice.secondaryDevice[0].accountNumber,
            metroCode: testEquinixNetworkDevice.secondaryDevice[0].metroCode,
            throughput: "50",
            throughputUnit: "Mbps",
        },
    ],
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.networkedge.DeviceLink("test",
    name="test-DLG",
    project_id="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
    devices=[
        {
            "id": test_equinix_network_device["uuid"],
            "interface_id": 6,
        },
        {
            "id": test_equinix_network_device["secondaryDevice"][0]["uuid"],
            "interface_id": 7,
        },
    ],
    metro_links=[
        {
            "account_number": test_equinix_network_device["accountNumber"],
            "metro_code": test_equinix_network_device["metroCode"],
            "throughput": "50",
            "throughput_unit": "Mbps",
        },
        {
            "account_number": test_equinix_network_device["secondaryDevice"][0]["accountNumber"],
            "metro_code": test_equinix_network_device["secondaryDevice"][0]["metroCode"],
            "throughput": "50",
            "throughput_unit": "Mbps",
        },
    ])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewDeviceLink(ctx, "test", &networkedge.DeviceLinkArgs{
			Name:      pulumi.String("test-DLG"),
			ProjectId: pulumi.String("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"),
			Devices: networkedge.DeviceLinkDeviceArray{
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.Uuid),
					InterfaceId: pulumi.Int(6),
				},
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].Uuid),
					InterfaceId: pulumi.Int(7),
				},
			},
			MetroLinks: networkedge.DeviceLinkMetroLinkArray{
				&networkedge.DeviceLinkMetroLinkArgs{
					AccountNumber:  pulumi.Any(testEquinixNetworkDevice.AccountNumber),
					MetroCode:      pulumi.Any(testEquinixNetworkDevice.MetroCode),
					Throughput:     pulumi.String("50"),
					ThroughputUnit: pulumi.String("Mbps"),
				},
				&networkedge.DeviceLinkMetroLinkArgs{
					AccountNumber:  pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].AccountNumber),
					MetroCode:      pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].MetroCode),
					Throughput:     pulumi.String("50"),
					ThroughputUnit: pulumi.String("Mbps"),
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
    var test = new Equinix.NetworkEdge.DeviceLink("test", new()
    {
        Name = "test-DLG",
        ProjectId = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
        Devices = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.Uuid,
                InterfaceId = 6,
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.SecondaryDevice[0].Uuid,
                InterfaceId = 7,
            },
        },
        MetroLinks = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkMetroLinkArgs
            {
                AccountNumber = testEquinixNetworkDevice.AccountNumber,
                MetroCode = testEquinixNetworkDevice.MetroCode,
                Throughput = "50",
                ThroughputUnit = "Mbps",
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkMetroLinkArgs
            {
                AccountNumber = testEquinixNetworkDevice.SecondaryDevice[0].AccountNumber,
                MetroCode = testEquinixNetworkDevice.SecondaryDevice[0].MetroCode,
                Throughput = "50",
                ThroughputUnit = "Mbps",
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
import com.pulumi.equinix.networkedge.DeviceLink;
import com.pulumi.equinix.networkedge.DeviceLinkArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkDeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkMetroLinkArgs;
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
        var test = new DeviceLink("test", DeviceLinkArgs.builder()
            .name("test-DLG")
            .projectId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
            .devices(            
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.uuid())
                    .interfaceId(6)
                    .build(),
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.secondaryDevice()[0].uuid())
                    .interfaceId(7)
                    .build())
            .metroLinks(            
                DeviceLinkMetroLinkArgs.builder()
                    .accountNumber(testEquinixNetworkDevice.accountNumber())
                    .metroCode(testEquinixNetworkDevice.metroCode())
                    .throughput("50")
                    .throughputUnit("Mbps")
                    .build(),
                DeviceLinkMetroLinkArgs.builder()
                    .accountNumber(testEquinixNetworkDevice.secondaryDevice()[0].accountNumber())
                    .metroCode(testEquinixNetworkDevice.secondaryDevice()[0].metroCode())
                    .throughput("50")
                    .throughputUnit("Mbps")
                    .build())
            .build());

    }
}
```
```yaml
resources:
  # Example of device link with HA device pair
  # where each device is in a different metro
  test:
    type: equinix:networkedge:DeviceLink
    properties:
      name: test-DLG
      projectId: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
      devices:
        - id: ${testEquinixNetworkDevice.uuid}
          interfaceId: 6
        - id: ${testEquinixNetworkDevice.secondaryDevice[0].uuid}
          interfaceId: 7
      metroLinks:
        - accountNumber: ${testEquinixNetworkDevice.accountNumber}
          metroCode: ${testEquinixNetworkDevice.metroCode}
          throughput: '50'
          throughputUnit: Mbps
        - accountNumber: ${testEquinixNetworkDevice.secondaryDevice[0].accountNumber}
          metroCode: ${testEquinixNetworkDevice.secondaryDevice[0].metroCode}
          throughput: '50'
          throughputUnit: Mbps
```
{{% /example %}}
