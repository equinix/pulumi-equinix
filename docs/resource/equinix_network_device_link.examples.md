## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const accountName = config.require("accountName");
const accountMetro = config.require("accountMetro");
const device1Id = config.require("device1Id");
const device2Id = config.require("device2Id");
const accountfNum = equinix.networkedge.getAccountOutput({
    name: accountName,
    metroCode: accountMetro,
}).apply(invoke => invoke.number);
const device1Metro = equinix.networkedge.getDeviceOutput({
    uuid: device1Id,
}).apply(invoke => invoke.metroCode);
const device2Metro = equinix.networkedge.getDeviceOutput({
    uuid: device2Id,
}).apply(invoke => invoke.metroCode);
const deviceLink = new equinix.networkedge.DeviceLink("deviceLink", {
    name: "test-link",
    subnet: "192.168.40.64/27",
    devices: [
        {
            id: "device1Id",
            asn: 22111,
            interfaceId: 6,
        },
        {
            id: "device2Id",
            asn: 22333,
            interfaceId: 7,
        },
    ],
    links: [{
        accountNumber: accountfNum,
        srcMetroCode: device1Metro,
        dstMetroCode: device2Metro,
        throughput: "50",
        throughputUnit: "Mbps",
    }],
});
export const status = deviceLink.status;
export const devices = deviceLink.devices;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
account_name = config.require("accountName")
account_metro = config.require("accountMetro")
device1_id = config.require("device1Id")
device2_id = config.require("device2Id")
accountf_num = equinix.networkedge.get_account_output(name=account_name,
    metro_code=account_metro).apply(lambda invoke: invoke.number)
device1_metro = equinix.networkedge.get_device_output(uuid=device1_id).apply(lambda invoke: invoke.metro_code)
device2_metro = equinix.networkedge.get_device_output(uuid=device2_id).apply(lambda invoke: invoke.metro_code)
device_link = equinix.networkedge.DeviceLink("deviceLink",
    name="test-link",
    subnet="192.168.40.64/27",
    devices=[
        equinix.networkedge.DeviceLinkDeviceArgs(
            id="device1Id",
            asn=22111,
            interface_id=6,
        ),
        equinix.networkedge.DeviceLinkDeviceArgs(
            id="device2Id",
            asn=22333,
            interface_id=7,
        ),
    ],
    links=[equinix.networkedge.DeviceLinkLinkArgs(
        account_number=accountf_num,
        src_metro_code=device1_metro,
        dst_metro_code=device2_metro,
        throughput="50",
        throughput_unit="Mbps",
    )])
pulumi.export("status", device_link.status)
pulumi.export("devices", device_link.devices)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		accountName := cfg.Require("accountName")
		accountMetro := cfg.Require("accountMetro")
		device1Id := cfg.Require("device1Id")
		device2Id := cfg.Require("device2Id")
		accountfNum := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			Name:      pulumi.StringRef(accountName),
			MetroCode: accountMetro,
		}, nil).Number
		device1Metro := networkedge.LookupDevice(ctx, &networkedge.LookupDeviceArgs{
			Uuid: pulumi.StringRef(device1Id),
		}, nil).MetroCode
		device2Metro := networkedge.LookupDevice(ctx, &networkedge.LookupDeviceArgs{
			Uuid: pulumi.StringRef(device2Id),
		}, nil).MetroCode
		deviceLink, err := networkedge.NewDeviceLink(ctx, "deviceLink", &networkedge.DeviceLinkArgs{
			Name:   pulumi.String("test-link"),
			Subnet: pulumi.String("192.168.40.64/27"),
			Devices: networkedge.DeviceLinkDeviceArray{
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.String("device1Id"),
					Asn:         pulumi.Int(22111),
					InterfaceId: pulumi.Int(6),
				},
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.String("device2Id"),
					Asn:         pulumi.Int(22333),
					InterfaceId: pulumi.Int(7),
				},
			},
			Links: networkedge.DeviceLinkLinkArray{
				&networkedge.DeviceLinkLinkArgs{
					AccountNumber:  *pulumi.String(accountfNum),
					SrcMetroCode:   *pulumi.String(device1Metro),
					DstMetroCode:   *pulumi.String(device2Metro),
					Throughput:     pulumi.String("50"),
					ThroughputUnit: pulumi.String("Mbps"),
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("status", deviceLink.Status)
		ctx.Export("devices", deviceLink.Devices)
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
    var accountName = config.Require("accountName");
    var accountMetro = config.Require("accountMetro");
    var device1Id = config.Require("device1Id");
    var device2Id = config.Require("device2Id");
    var accountfNum = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = accountName,
        MetroCode = accountMetro,
    }).Apply(invoke => invoke.Number);

    var device1Metro = Equinix.NetworkEdge.GetDevice.Invoke(new()
    {
        Uuid = device1Id,
    }).Apply(invoke => invoke.MetroCode);

    var device2Metro = Equinix.NetworkEdge.GetDevice.Invoke(new()
    {
        Uuid = device2Id,
    }).Apply(invoke => invoke.MetroCode);

    var deviceLink = new Equinix.NetworkEdge.DeviceLink("deviceLink", new()
    {
        Name = "test-link",
        Subnet = "192.168.40.64/27",
        Devices = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = "device1Id",
                Asn = 22111,
                InterfaceId = 6,
            },
            new Equinix.NetworkEdge.Inputs.DeviceLinkDeviceArgs
            {
                Id = "device2Id",
                Asn = 22333,
                InterfaceId = 7,
            },
        },
        Links = new[]
        {
            new Equinix.NetworkEdge.Inputs.DeviceLinkLinkArgs
            {
                AccountNumber = accountfNum,
                SrcMetroCode = device1Metro,
                DstMetroCode = device2Metro,
                Throughput = "50",
                ThroughputUnit = "Mbps",
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["status"] = deviceLink.Status,
        ["devices"] = deviceLink.Devices,
    };
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
        final var config = ctx.config();
        final var accountName = config.get("accountName");
        final var accountMetro = config.get("accountMetro");
        final var device1Id = config.get("device1Id");
        final var device2Id = config.get("device2Id");
        final var accountfNum = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name(accountName)
            .metroCode(accountMetro)
            .build()).number();

        final var device1Metro = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
            .uuid(device1Id)
            .build()).metroCode();

        final var device2Metro = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
            .uuid(device2Id)
            .build()).metroCode();

        var deviceLink = new DeviceLink("deviceLink", DeviceLinkArgs.builder()        
            .name("test-link")
            .subnet("192.168.40.64/27")
            .devices(            
                DeviceLinkDeviceArgs.builder()
                    .id("device1Id")
                    .asn(22111)
                    .interfaceId(6)
                    .build(),
                DeviceLinkDeviceArgs.builder()
                    .id("device2Id")
                    .asn(22333)
                    .interfaceId(7)
                    .build())
            .links(DeviceLinkLinkArgs.builder()
                .accountNumber(accountfNum)
                .srcMetroCode(device1Metro)
                .dstMetroCode(device2Metro)
                .throughput("50")
                .throughputUnit("Mbps")
                .build())
            .build());

        ctx.export("status", deviceLink.status());
        ctx.export("devices", deviceLink.devices());
    }
}
```
```yaml
config:
  accountName:
    type: string
  accountMetro:
    type: string
  device1Id:
    type: string
  device2Id:
    type: string
variables:
  accountfNum:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        name: ${accountName}
        metroCode: ${accountMetro}
      return: number
  device1Metro:
    fn::invoke:
      function: equinix:networkedge:getDevice
      arguments:
        uuid: ${device1Id}
      return: metroCode
  device2Metro:
    fn::invoke:
      function: equinix:networkedge:getDevice
      arguments:
        uuid: ${device2Id}
      return: metroCode
resources:
  deviceLink:
    type: equinix:networkedge:DeviceLink
    properties:
      name: test-link
      subnet: 192.168.40.64/27
      devices:
      - id: device1Id
        asn: 22111
        interfaceId: 6
      - id: device2Id
        asn: 22333
        interfaceId: 7
      links:
      - accountNumber: ${accountfNum}
        srcMetroCode: ${device1Metro}
        dstMetroCode: ${device2Metro}
        throughput: "50"
        throughputUnit: Mbps
outputs:
  status: ${deviceLink.status}
  devices: ${deviceLink.devices}
```
{{% /example %}}
