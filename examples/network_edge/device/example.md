{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const accountName = config.require("accountName");
const licenseToken = config.require("licenseToken");
const sshUserName = config.require("sshUserName");
const sshKeyName = config.require("sshKeyName");
const aclTemplateId = config.require("aclTemplateId");
const metro = config.get("metro") || "SV";
const devicePackageCode = config.get("devicePackageCode") || "network-essentials";
const deviceVersion = config.get("deviceVersion") || "17.06.01a";
const sizeInCores = config.getNumber("sizeInCores") || 2;
const termLength = config.getNumber("termLength") || 6;
const additionalBandwidth = config.getNumber("additionalBandwidth") || 5;
const accountNum = equinix.networkedge.getAccount({
    name: accountName,
    metroCode: metro,
}).then(invoke => invoke.number);
const c8KRouter = new equinix.networkedge.Device("c8kRouter", {
    name: "catalystRouter",
    metroCode: metro,
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: devicePackageCode,
    notifications: ["example@equinix.com"],
    hostname: "C8KV",
    accountNumber: accountNum,
    version: version,
    coreCount: sizeInCores,
    termLength: termLength,
    licenseToken: licenseToken,
    additionalBandwidth: additionalBandwidth,
    sshKey: {
        username: sshUserName,
        keyName: sshKeyName,
    },
    aclTemplateId: aclTemplateId,
});
export const routerId = c8KRouter.id;
export const provisionStatus = c8KRouter.status;
export const licenseStatus = c8KRouter.licenseStatus;
export const sshIpAddress = c8KRouter.sshIpAddress;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
account_name = config.require("accountName")
license_token = config.require("licenseToken")
ssh_user_name = config.require("sshUserName")
ssh_key_name = config.require("sshKeyName")
acl_template_id = config.require("aclTemplateId")
metro = config.get("metro")
if metro is None:
    metro = "SV"
device_package_code = config.get("devicePackageCode")
if device_package_code is None:
    device_package_code = "network-essentials"
device_version = config.get("deviceVersion")
if device_version is None:
    device_version = "17.06.01a"
size_in_cores = config.get_int("sizeInCores")
if size_in_cores is None:
    size_in_cores = 2
term_length = config.get_int("termLength")
if term_length is None:
    term_length = 6
additional_bandwidth = config.get_int("additionalBandwidth")
if additional_bandwidth is None:
    additional_bandwidth = 5
account_num = equinix.networkedge.get_account(name=account_name,
    metro_code=metro).number
c8_k_router = equinix.networkedge.Device("c8kRouter",
    name="catalystRouter",
    metro_code=metro,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code=device_package_code,
    notifications=["example@equinix.com"],
    hostname="C8KV",
    account_number=account_num,
    version=version,
    core_count=size_in_cores,
    term_length=term_length,
    license_token=license_token,
    additional_bandwidth=additional_bandwidth,
    ssh_key=equinix.networkedge.DeviceSshKeyArgs(
        username=ssh_user_name,
        key_name=ssh_key_name,
    ),
    acl_template_id=acl_template_id)
pulumi.export("routerId", c8_k_router.id)
pulumi.export("provisionStatus", c8_k_router.status)
pulumi.export("licenseStatus", c8_k_router.license_status)
pulumi.export("sshIpAddress", c8_k_router.ssh_ip_address)
```

{{% /choosable %}}

{{% choosable language go %}}

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
		licenseToken := cfg.Require("licenseToken")
		sshUserName := cfg.Require("sshUserName")
		sshKeyName := cfg.Require("sshKeyName")
		aclTemplateId := cfg.Require("aclTemplateId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		devicePackageCode := "network-essentials"
		if param := cfg.Get("devicePackageCode"); param != "" {
			devicePackageCode = param
		}
		deviceVersion := "17.06.01a"
		if param := cfg.Get("deviceVersion"); param != "" {
			deviceVersion = param
		}
		sizeInCores := 2
		if param := cfg.GetInt("sizeInCores"); param != 0 {
			sizeInCores = param
		}
		termLength := 6
		if param := cfg.GetInt("termLength"); param != 0 {
			termLength = param
		}
		additionalBandwidth := 5
		if param := cfg.GetInt("additionalBandwidth"); param != 0 {
			additionalBandwidth = param
		}
		accountNum := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			Name:      pulumi.StringRef(accountName),
			MetroCode: metro,
		}, nil).Number
		c8KRouter, err := networkedge.NewDevice(ctx, "c8kRouter", &networkedge.DeviceArgs{
			Name:        pulumi.String("catalystRouter"),
			MetroCode:   pulumi.String(metro),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String(devicePackageCode),
			Notifications: pulumi.StringArray{
				pulumi.String("example@equinix.com"),
			},
			Hostname:            pulumi.String("C8KV"),
			AccountNumber:       *pulumi.String(accountNum),
			Version:             pulumi.Any(version),
			CoreCount:           pulumi.Int(sizeInCores),
			TermLength:          pulumi.Int(termLength),
			LicenseToken:        pulumi.String(licenseToken),
			AdditionalBandwidth: pulumi.Int(additionalBandwidth),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String(sshUserName),
				KeyName:  pulumi.String(sshKeyName),
			},
			AclTemplateId: pulumi.String(aclTemplateId),
		})
		if err != nil {
			return err
		}
		ctx.Export("routerId", c8KRouter.ID())
		ctx.Export("provisionStatus", c8KRouter.Status)
		ctx.Export("licenseStatus", c8KRouter.LicenseStatus)
		ctx.Export("sshIpAddress", c8KRouter.SshIpAddress)
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
    var accountName = config.Require("accountName");
    var licenseToken = config.Require("licenseToken");
    var sshUserName = config.Require("sshUserName");
    var sshKeyName = config.Require("sshKeyName");
    var aclTemplateId = config.Require("aclTemplateId");
    var metro = config.Get("metro") ?? "SV";
    var devicePackageCode = config.Get("devicePackageCode") ?? "network-essentials";
    var deviceVersion = config.Get("deviceVersion") ?? "17.06.01a";
    var sizeInCores = config.GetNumber("sizeInCores") ?? 2;
    var termLength = config.GetNumber("termLength") ?? 6;
    var additionalBandwidth = config.GetNumber("additionalBandwidth") ?? 5;
    var accountNum = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = accountName,
        MetroCode = metro,
    }).Apply(invoke => invoke.Number);

    var c8KRouter = new Equinix.NetworkEdge.Device("c8kRouter", new()
    {
        Name = "catalystRouter",
        MetroCode = metro,
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = devicePackageCode,
        Notifications = new[]
        {
            "example@equinix.com",
        },
        Hostname = "C8KV",
        AccountNumber = accountNum,
        Version = version,
        CoreCount = sizeInCores,
        TermLength = termLength,
        LicenseToken = licenseToken,
        AdditionalBandwidth = additionalBandwidth,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = sshUserName,
            KeyName = sshKeyName,
        },
        AclTemplateId = aclTemplateId,
    });

    return new Dictionary<string, object?>
    {
        ["routerId"] = c8KRouter.Id,
        ["provisionStatus"] = c8KRouter.Status,
        ["licenseStatus"] = c8KRouter.LicenseStatus,
        ["sshIpAddress"] = c8KRouter.SshIpAddress,
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
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
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
        final var licenseToken = config.get("licenseToken");
        final var sshUserName = config.get("sshUserName");
        final var sshKeyName = config.get("sshKeyName");
        final var aclTemplateId = config.get("aclTemplateId");
        final var metro = config.get("metro").orElse("SV");
        final var devicePackageCode = config.get("devicePackageCode").orElse("network-essentials");
        final var deviceVersion = config.get("deviceVersion").orElse("17.06.01a");
        final var sizeInCores = config.get("sizeInCores").orElse(2);
        final var termLength = config.get("termLength").orElse(6);
        final var additionalBandwidth = config.get("additionalBandwidth").orElse(5);
        final var accountNum = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name(accountName)
            .metroCode(metro)
            .build()).number();

        var c8KRouter = new Device("c8KRouter", DeviceArgs.builder()        
            .name("catalystRouter")
            .metroCode(metro)
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode(devicePackageCode)
            .notifications("example@equinix.com")
            .hostname("C8KV")
            .accountNumber(accountNum)
            .version(version)
            .coreCount(sizeInCores)
            .termLength(termLength)
            .licenseToken(licenseToken)
            .additionalBandwidth(additionalBandwidth)
            .sshKey(DeviceSshKeyArgs.builder()
                .username(sshUserName)
                .keyName(sshKeyName)
                .build())
            .aclTemplateId(aclTemplateId)
            .build());

        ctx.export("routerId", c8KRouter.id());
        ctx.export("provisionStatus", c8KRouter.status());
        ctx.export("licenseStatus", c8KRouter.licenseStatus());
        ctx.export("sshIpAddress", c8KRouter.sshIpAddress());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  accountName:
    type: string
  licenseToken:
    type: string
  sshUserName:
    type: string
  sshKeyName:
    type: string
  aclTemplateId:
    type: string
  metro:
    type: string
    default: SV
  devicePackageCode:
    type: string
    default: network-essentials
  deviceVersion:
    type: string
    default: 17.06.01a
  sizeInCores:
    type: integer
    default: 2
  termLength:
    type: integer
    default: 6
  additionalBandwidth:
    type: integer
    default: 5
variables:
  accountNum:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        name: ${accountName}
        metroCode: ${metro}
      return: number
resources:
  c8kRouter:
    type: equinix:networkedge:Device
    properties:
      name: catalystRouter
      metroCode: ${metro}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: ${devicePackageCode}
      notifications:
      - "example@equinix.com"
      hostname: C8KV
      accountNumber: ${accountNum}
      version: ${version}
      coreCount: ${sizeInCores}
      termLength: ${termLength}
      licenseToken: ${licenseToken}
      additionalBandwidth: ${additionalBandwidth}
      sshKey:
        username: ${sshUserName}
        keyName: ${sshKeyName}
      aclTemplateId: ${aclTemplateId}
outputs:
  routerId: ${c8kRouter.id}
  provisionStatus: ${c8kRouter.status}
  licenseStatus: ${c8kRouter.licenseStatus}
  sshIpAddress: ${c8kRouter.sshIpAddress}
```

{{% /choosable %}}
