## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.networkedge.DeviceLink("test", {
    name: "test-link",
    subnet: "192.168.40.64/27",
    projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
    devices: [
        {
            id: testEquinixNetworkDevice.uuid,
            asn: 22111,
            interfaceId: 6,
        },
        {
            id: testEquinixNetworkDevice.secondaryDevice[0].uuid,
            asn: 22333,
            interfaceId: 7,
        },
    ],
    links: [{
        accountNumber: testEquinixNetworkDevice.accountNumber,
        srcMetroCode: testEquinixNetworkDevice.metroCode,
        dstMetroCode: testEquinixNetworkDevice.secondaryDevice[0].metroCode,
        throughput: "50",
        throughputUnit: "Mbps",
    }],
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.networkedge.DeviceLink("test",
    name="test-link",
    subnet="192.168.40.64/27",
    project_id="a86d7112-d740-4758-9c9c-31e66373746b",
    devices=[
        equinix.networkedge.DeviceLinkDeviceArgs(
            id=test_equinix_network_device["uuid"],
            asn=22111,
            interface_id=6,
        ),
        equinix.networkedge.DeviceLinkDeviceArgs(
            id=test_equinix_network_device["secondaryDevice"][0]["uuid"],
            asn=22333,
            interface_id=7,
        ),
    ],
    links=[equinix.networkedge.DeviceLinkLinkArgs(
        account_number=test_equinix_network_device["accountNumber"],
        src_metro_code=test_equinix_network_device["metroCode"],
        dst_metro_code=test_equinix_network_device["secondaryDevice"][0]["metroCode"],
        throughput="50",
        throughput_unit="Mbps",
    )])
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
			Name:      pulumi.String("test-link"),
			Subnet:    pulumi.String("192.168.40.64/27"),
			ProjectId: pulumi.String("a86d7112-d740-4758-9c9c-31e66373746b"),
			Devices: networkedge.DeviceLinkDeviceArray{
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.Uuid),
					Asn:         pulumi.Int(22111),
					InterfaceId: pulumi.Int(6),
				},
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].Uuid),
					Asn:         pulumi.Int(22333),
					InterfaceId: pulumi.Int(7),
				},
			},
			Links: networkedge.DeviceLinkLinkArray{
				&networkedge.DeviceLinkLinkArgs{
					AccountNumber:  pulumi.Any(testEquinixNetworkDevice.AccountNumber),
					SrcMetroCode:   pulumi.Any(testEquinixNetworkDevice.MetroCode),
					DstMetroCode:   pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].MetroCode),
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
        Name = "test-link",
        Subnet = "192.168.40.64/27",
        ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        Devices = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.Uuid,
                Asn = 22111,
                InterfaceId = 6,
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = testEquinixNetworkDevice.SecondaryDevice[0].Uuid,
                Asn = 22333,
                InterfaceId = 7,
            },
        },
        Links = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkLinkArgs
            {
                AccountNumber = testEquinixNetworkDevice.AccountNumber,
                SrcMetroCode = testEquinixNetworkDevice.MetroCode,
                DstMetroCode = testEquinixNetworkDevice.SecondaryDevice[0].MetroCode,
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
import com.pulumi.equinix.networkedge.inputs.DeviceLinkLinkArgs;
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
            .name("test-link")
            .subnet("192.168.40.64/27")
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .devices(            
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.uuid())
                    .asn(22111)
                    .interfaceId(6)
                    .build(),
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.secondaryDevice()[0].uuid())
                    .asn(22333)
                    .interfaceId(7)
                    .build())
            .links(DeviceLinkLinkArgs.builder()
                .accountNumber(testEquinixNetworkDevice.accountNumber())
                .srcMetroCode(testEquinixNetworkDevice.metroCode())
                .dstMetroCode(testEquinixNetworkDevice.secondaryDevice()[0].metroCode())
                .throughput("50")
                .throughputUnit("Mbps")
                .build())
            .build());

    }
}
```
```yaml
  # Example of device link with HA device pair
  # where each device is in different metro
  test:
    type: equinix:networkedge:DeviceLink
    properties:
      name: test-link
      subnet: 192.168.40.64/27
      projectId: a86d7112-d740-4758-9c9c-31e66373746b
      devices:
        - id: ${testEquinixNetworkDevice.uuid}
          asn: 22111
          interfaceId: 6
        - id: ${testEquinixNetworkDevice.secondaryDevice[0].uuid}
          asn: 22333
          interfaceId: 7
      links:
        - accountNumber: ${testEquinixNetworkDevice.accountNumber}
          srcMetroCode: ${testEquinixNetworkDevice.metroCode}
          dstMetroCode: ${testEquinixNetworkDevice.secondaryDevice[0].metroCode}
          throughput: '50'
          throughputUnit: Mbps
```
{{% /example %}}
