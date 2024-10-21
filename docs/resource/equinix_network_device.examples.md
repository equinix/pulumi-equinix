## Example Usage

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const dc = equinix.networkedge.getAccountOutput({
    metroCode: "DC",
});
const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const csr1000VHa = new equinix.networkedge.Device("csr1000vHa", {
    name: "tf-csr1000v-p",
    throughput: 500,
    throughputUnit: equinix.networkedge.ThroughputUnit.Mbps,
    metroCode: dc.apply(dc => dc.metroCode),
    typeCode: "CSR1000V",
    selfManaged: false,
    connectivity: "INTERNET-ACCESS",
    byol: false,
    packageCode: "SEC",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    hostname: "csr1000v-p",
    termLength: 12,
    accountNumber: dc.apply(dc => dc.number),
    version: "16.09.05",
    coreCount: 2,
    secondaryDevice: {
        name: "tf-csr1000v-s",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr1000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

dc = equinix.networkedge.get_account_output(metro_code="DC")
sv = equinix.networkedge.get_account_output(metro_code="SV")
csr1000_v_ha = equinix.networkedge.Device("csr1000vHa",
    name="tf-csr1000v-p",
    throughput=500,
    throughput_unit=equinix.networkedge.ThroughputUnit.MBPS,
    metro_code=dc.metro_code,
    type_code="CSR1000V",
    self_managed=False,
    connectivity="INTERNET-ACCESS",
    byol=False,
    package_code="SEC",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    hostname="csr1000v-p",
    term_length=12,
    account_number=dc.number,
    version="16.09.05",
    core_count=2,
    secondary_device={
        "name": "tf-csr1000v-s",
        "metro_code": sv.metro_code,
        "hostname": "csr1000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		dc := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("DC"),
		}, nil)
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "csr1000vHa", &networkedge.DeviceArgs{
			Name:           pulumi.String("tf-csr1000v-p"),
			Throughput:     pulumi.Int(500),
			ThroughputUnit: pulumi.String(networkedge.ThroughputUnitMbps),
			MetroCode: pulumi.String(dc.ApplyT(func(dc networkedge.GetAccountResult) (*string, error) {
				return &dc.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("CSR1000V"),
			SelfManaged:  pulumi.Bool(false),
			Connectivity: pulumi.String("INTERNET-ACCESS"),
			Byol:         pulumi.Bool(false),
			PackageCode:  pulumi.String("SEC"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			Hostname:   pulumi.String("csr1000v-p"),
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(dc.ApplyT(func(dc networkedge.GetAccountResult) (*string, error) {
				return &dc.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:   pulumi.String("16.09.05"),
			CoreCount: pulumi.Int(2),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-csr1000v-s"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("csr1000v-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
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
    var dc = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "DC",
    });

    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var csr1000VHa = new Equinix.NetworkEdge.Device("csr1000vHa", new()
    {
        Name = "tf-csr1000v-p",
        Throughput = 500,
        ThroughputUnit = Equinix.NetworkEdge.ThroughputUnit.Mbps,
        MetroCode = dc.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "CSR1000V",
        SelfManaged = false,
        Connectivity = "INTERNET-ACCESS",
        Byol = false,
        PackageCode = "SEC",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        Hostname = "csr1000v-p",
        TermLength = 12,
        AccountNumber = dc.Apply(getAccountResult => getAccountResult.Number),
        Version = "16.09.05",
        CoreCount = 2,
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-csr1000v-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "csr1000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
        final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("DC")
            .build());

        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var csr1000VHa = new Device("csr1000VHa", DeviceArgs.builder()
            .name("tf-csr1000v-p")
            .throughput(500)
            .throughputUnit("Mbps")
            .metroCode(dc.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("CSR1000V")
            .selfManaged(false)
            .connectivity("INTERNET-ACCESS")
            .byol(false)
            .packageCode("SEC")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .hostname("csr1000v-p")
            .termLength(12)
            .accountNumber(dc.applyValue(getAccountResult -> getAccountResult.number()))
            .version("16.09.05")
            .coreCount(2)
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-csr1000v-s")
                .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
                .hostname("csr1000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
                .build())
            .build());

    }
}
```
```yaml
resources:
  csr1000vHa:
    type: equinix:networkedge:Device
    name: csr1000v_ha
    properties:
      name: tf-csr1000v-p
      throughput: 500
      throughputUnit: Mbps
      metroCode: ${dc.metroCode}
      typeCode: CSR1000V
      selfManaged: false
      connectivity: INTERNET-ACCESS
      byol: false
      packageCode: SEC
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      hostname: csr1000v-p
      termLength: 12
      accountNumber: ${dc.number}
      version: 16.09.05
      coreCount: 2
      secondaryDevice:
        name: tf-csr1000v-s
        metroCode: ${sv.metroCode}
        hostname: csr1000v-s
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
variables:
  # Create pair of redundant, managed CSR1000V routers with license subscription
  # in two different metro locations
  dc:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        metroCode: DC
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const panwCluster = new equinix.networkedge.Device("panwCluster", {
    name: "tf-panw",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "PA-VM",
    selfManaged: true,
    byol: true,
    packageCode: "VM100",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "10.1.3",
    interfaceCount: 10,
    coreCount: 2,
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    clusterDetails: {
        clusterName: "tf-panw-cluster",
        node0: {
            vendorConfiguration: {
                hostname: "panw-node0",
            },
            licenseToken: "licenseToken",
        },
        node1: {
            vendorConfiguration: {
                hostname: "panw-node1",
            },
            licenseToken: "licenseToken",
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
panw_cluster = equinix.networkedge.Device("panwCluster",
    name="tf-panw",
    metro_code=sv.metro_code,
    type_code="PA-VM",
    self_managed=True,
    byol=True,
    package_code="VM100",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="10.1.3",
    interface_count=10,
    core_count=2,
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    cluster_details={
        "cluster_name": "tf-panw-cluster",
        "node0": {
            "vendor_configuration": {
                "hostname": "panw-node0",
            },
            "license_token": "licenseToken",
        },
        "node1": {
            "vendor_configuration": {
                "hostname": "panw-node1",
            },
            "license_token": "licenseToken",
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "panwCluster", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-panw"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("PA-VM"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("VM100"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("10.1.3"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				ClusterName: pulumi.String("tf-panw-cluster"),
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						Hostname: pulumi.String("panw-node0"),
					},
					LicenseToken: pulumi.String("licenseToken"),
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						Hostname: pulumi.String("panw-node1"),
					},
					LicenseToken: pulumi.String("licenseToken"),
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
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var panwCluster = new Equinix.NetworkEdge.Device("panwCluster", new()
    {
        Name = "tf-panw",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "PA-VM",
        SelfManaged = true,
        Byol = true,
        PackageCode = "VM100",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "10.1.3",
        InterfaceCount = 10,
        CoreCount = 2,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            ClusterName = "tf-panw-cluster",
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    Hostname = "panw-node0",
                },
                LicenseToken = "licenseToken",
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    Hostname = "panw-node1",
                },
                LicenseToken = "licenseToken",
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
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0Args;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0VendorConfigurationArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1Args;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1VendorConfigurationArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var panwCluster = new Device("panwCluster", DeviceArgs.builder()
            .name("tf-panw")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("PA-VM")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM100")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("10.1.3")
            .interfaceCount(10)
            .coreCount(2)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .clusterName("tf-panw-cluster")
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .hostname("panw-node0")
                        .build())
                    .licenseToken("licenseToken")
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .hostname("panw-node1")
                        .build())
                    .licenseToken("licenseToken")
                    .build())
                .build())
            .build());

    }
}
```
```yaml
resources:
  panwCluster:
    type: equinix:networkedge:Device
    name: panw_cluster
    properties:
      name: tf-panw
      metroCode: ${sv.metroCode}
      typeCode: PA-VM
      selfManaged: true
      byol: true
      packageCode: VM100
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 10.1.3
      interfaceCount: 10
      coreCount: 2
      sshKey:
        username: test
        keyName: test-key
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
      clusterDetails:
        clusterName: tf-panw-cluster
        node0:
          vendorConfiguration:
            hostname: panw-node0
          licenseToken: licenseToken
        node1:
          vendorConfiguration:
            hostname: panw-node1
          licenseToken: licenseToken
variables:
  # Create self configured PANW cluster with BYOL license
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 3
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";
import * as std from "@pulumi/std";

const config = new pulumi.Config();
const filepath = config.get("filepath") || "cloudInitFileFolder/TF-AVX-cloud-init-file.txt";
const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const aviatrixCloudinitFile = new equinix.networkedge.NetworkFile("aviatrixCloudinitFile", {
    fileName: "TF-AVX-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "AVIATRIX_EDGE",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const aviatrixSingle = new equinix.networkedge.Device("aviatrixSingle", {
    name: "tf-aviatrix",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "AVIATRIX_EDGE",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["john@equinix.com"],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "6.9",
    coreCount: 2,
    cloudInitFileId: aviatrixCloudinitFile.uuid,
    aclTemplateId: "c06150ea-b604-4ad1-832a-d63936e9b938",
});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

config = pulumi.Config()
filepath = config.get("filepath")
if filepath is None:
    filepath = "cloudInitFileFolder/TF-AVX-cloud-init-file.txt"
sv = equinix.networkedge.get_account_output(metro_code="SV")
aviatrix_cloudinit_file = equinix.networkedge.NetworkFile("aviatrixCloudinitFile",
    file_name="TF-AVX-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="AVIATRIX_EDGE",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
aviatrix_single = equinix.networkedge.Device("aviatrixSingle",
    name="tf-aviatrix",
    metro_code=sv.metro_code,
    type_code="AVIATRIX_EDGE",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["john@equinix.com"],
    term_length=12,
    account_number=sv.number,
    version="6.9",
    core_count=2,
    cloud_init_file_id=aviatrix_cloudinit_file.uuid,
    acl_template_id="c06150ea-b604-4ad1-832a-d63936e9b938")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		filepath := "cloudInitFileFolder/TF-AVX-cloud-init-file.txt"
		if param := cfg.Get("filepath"); param != "" {
			filepath = param
		}
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
		}, nil)
		aviatrixCloudinitFile, err := networkedge.NewNetworkFile(ctx, "aviatrixCloudinitFile", &networkedge.NetworkFileArgs{
			FileName: pulumi.String("TF-AVX-cloud-init-file.txt"),
			Content: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.String(filepath),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
			MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput).ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "aviatrixSingle", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-aviatrix"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("AVIATRIX_EDGE"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:         pulumi.String("6.9"),
			CoreCount:       pulumi.Int(2),
			CloudInitFileId: aviatrixCloudinitFile.Uuid,
			AclTemplateId:   pulumi.String("c06150ea-b604-4ad1-832a-d63936e9b938"),
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
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var filepath = config.Get("filepath") ?? "cloudInitFileFolder/TF-AVX-cloud-init-file.txt";
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var aviatrixCloudinitFile = new Equinix.NetworkEdge.NetworkFile("aviatrixCloudinitFile", new()
    {
        FileName = "TF-AVX-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "AVIATRIX_EDGE",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var aviatrixSingle = new Equinix.NetworkEdge.Device("aviatrixSingle", new()
    {
        Name = "tf-aviatrix",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "AVIATRIX_EDGE",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "6.9",
        CoreCount = 2,
        CloudInitFileId = aviatrixCloudinitFile.Uuid,
        AclTemplateId = "c06150ea-b604-4ad1-832a-d63936e9b938",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.NetworkFile;
import com.pulumi.equinix.networkedge.NetworkFileArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
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
        final var filepath = config.get("filepath").orElse("cloudInitFileFolder/TF-AVX-cloud-init-file.txt");
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var aviatrixCloudinitFile = new NetworkFile("aviatrixCloudinitFile", NetworkFileArgs.builder()
            .fileName("TF-AVX-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).result())
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .deviceTypeCode("AVIATRIX_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var aviatrixSingle = new Device("aviatrixSingle", DeviceArgs.builder()
            .name("tf-aviatrix")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("AVIATRIX_EDGE")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("john@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("6.9")
            .coreCount(2)
            .cloudInitFileId(aviatrixCloudinitFile.uuid())
            .aclTemplateId("c06150ea-b604-4ad1-832a-d63936e9b938")
            .build());

    }
}
```
```yaml
configuration:
  filepath:
    type: string
    default: cloudInitFileFolder/TF-AVX-cloud-init-file.txt
resources:
  aviatrixCloudinitFile:
    type: equinix:networkedge:NetworkFile
    name: aviatrix_cloudinit_file
    properties:
      fileName: TF-AVX-cloud-init-file.txt
      content:
        fn::invoke:
          Function: std:file
          Arguments:
            input: ${filepath}
          Return: result
      metroCode: ${sv.metroCode}
      deviceTypeCode: AVIATRIX_EDGE
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
  aviatrixSingle:
    type: equinix:networkedge:Device
    name: aviatrix_single
    properties:
      name: tf-aviatrix
      metroCode: ${sv.metroCode}
      typeCode: AVIATRIX_EDGE
      selfManaged: true
      byol: true
      packageCode: STD
      notifications:
        - john@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: '6.9'
      coreCount: 2
      cloudInitFileId: ${aviatrixCloudinitFile.uuid}
      aclTemplateId: c06150ea-b604-4ad1-832a-d63936e9b938
variables:
  # Create self configured single Aviatrix device with cloud init file
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 4
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const c8KvSingle = new equinix.networkedge.Device("c8kvSingle", {
    name: "tf-c8kv",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    notifications: ["test@equinix.com"],
    hostname: "C8KV",
    accountNumber: sv.apply(sv => sv.number),
    version: "17.06.01a",
    coreCount: 2,
    termLength: 12,
    licenseToken: "valid-license-token",
    additionalBandwidth: 5,
    sshKey: {
        username: "test-username",
        keyName: "valid-key-name",
    },
    aclTemplateId: "3e548c02-9164-4197-aa23-05b1f644883c",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
c8_kv_single = equinix.networkedge.Device("c8kvSingle",
    name="tf-c8kv",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    notifications=["test@equinix.com"],
    hostname="C8KV",
    account_number=sv.number,
    version="17.06.01a",
    core_count=2,
    term_length=12,
    license_token="valid-license-token",
    additional_bandwidth=5,
    ssh_key={
        "username": "test-username",
        "key_name": "valid-key-name",
    },
    acl_template_id="3e548c02-9164-4197-aa23-05b1f644883c")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "c8kvSingle", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-c8kv"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			Hostname: pulumi.String("C8KV"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("17.06.01a"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(12),
			LicenseToken:        pulumi.String("valid-license-token"),
			AdditionalBandwidth: pulumi.Int(5),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  pulumi.String("valid-key-name"),
			},
			AclTemplateId: pulumi.String("3e548c02-9164-4197-aa23-05b1f644883c"),
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
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var c8KvSingle = new Equinix.NetworkEdge.Device("c8kvSingle", new()
    {
        Name = "tf-c8kv",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        Hostname = "C8KV",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.06.01a",
        CoreCount = 2,
        TermLength = 12,
        LicenseToken = "valid-license-token",
        AdditionalBandwidth = 5,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = "valid-key-name",
        },
        AclTemplateId = "3e548c02-9164-4197-aa23-05b1f644883c",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name("account-name")
            .metroCode("SV")
            .build());

        var c8KvSingle = new Device("c8KvSingle", DeviceArgs.builder()
            .name("tf-c8kv")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .notifications("test@equinix.com")
            .hostname("C8KV")
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("17.06.01a")
            .coreCount(2)
            .termLength(12)
            .licenseToken("valid-license-token")
            .additionalBandwidth(5)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName("valid-key-name")
                .build())
            .aclTemplateId("3e548c02-9164-4197-aa23-05b1f644883c")
            .build());

    }
}
```
```yaml
resources:
  c8kvSingle:
    type: equinix:networkedge:Device
    name: c8kv_single
    properties:
      name: tf-c8kv
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: network-essentials
      notifications:
        - test@equinix.com
      hostname: C8KV
      accountNumber: ${sv.number}
      version: 17.06.01a
      coreCount: 2
      termLength: 12
      licenseToken: valid-license-token
      additionalBandwidth: 5
      sshKey:
        username: test-username
        keyName: valid-key-name
      aclTemplateId: 3e548c02-9164-4197-aa23-05b1f644883c
variables:
  # Create self configured single Catalyst 8000V (Autonomous Mode) router with license token
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        name: account-name
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 5
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const vsrxSingle = new equinix.networkedge.Device("vsrxSingle", {
    name: "tf-c8kv-sdwan",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "VSRX",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["test@equinix.com"],
    hostname: "VSRX",
    accountNumber: sv.apply(sv => sv.number),
    version: "23.2R1.13",
    coreCount: 2,
    termLength: 12,
    additionalBandwidth: 5,
    projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
    diverseDeviceId: "ed7891bd-15b4-4f72-ac56-d96cfdacddcc",
    sshKey: {
        username: "test-username",
        keyName: "valid-key-name",
    },
    aclTemplateId: "3e548c02-9164-4197-aa23-05b1f644883c",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
vsrx_single = equinix.networkedge.Device("vsrxSingle",
    name="tf-c8kv-sdwan",
    metro_code=sv.metro_code,
    type_code="VSRX",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["test@equinix.com"],
    hostname="VSRX",
    account_number=sv.number,
    version="23.2R1.13",
    core_count=2,
    term_length=12,
    additional_bandwidth=5,
    project_id="a86d7112-d740-4758-9c9c-31e66373746b",
    diverse_device_id="ed7891bd-15b4-4f72-ac56-d96cfdacddcc",
    ssh_key={
        "username": "test-username",
        "key_name": "valid-key-name",
    },
    acl_template_id="3e548c02-9164-4197-aa23-05b1f644883c")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "vsrxSingle", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-c8kv-sdwan"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("VSRX"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			Hostname: pulumi.String("VSRX"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("23.2R1.13"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(12),
			AdditionalBandwidth: pulumi.Int(5),
			ProjectId:           pulumi.String("a86d7112-d740-4758-9c9c-31e66373746b"),
			DiverseDeviceId:     pulumi.String("ed7891bd-15b4-4f72-ac56-d96cfdacddcc"),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  pulumi.String("valid-key-name"),
			},
			AclTemplateId: pulumi.String("3e548c02-9164-4197-aa23-05b1f644883c"),
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
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var vsrxSingle = new Equinix.NetworkEdge.Device("vsrxSingle", new()
    {
        Name = "tf-c8kv-sdwan",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "VSRX",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        Hostname = "VSRX",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "23.2R1.13",
        CoreCount = 2,
        TermLength = 12,
        AdditionalBandwidth = 5,
        ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        DiverseDeviceId = "ed7891bd-15b4-4f72-ac56-d96cfdacddcc",
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = "valid-key-name",
        },
        AclTemplateId = "3e548c02-9164-4197-aa23-05b1f644883c",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name("account-name")
            .metroCode("SV")
            .build());

        var vsrxSingle = new Device("vsrxSingle", DeviceArgs.builder()
            .name("tf-c8kv-sdwan")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("VSRX")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .hostname("VSRX")
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("23.2R1.13")
            .coreCount(2)
            .termLength(12)
            .additionalBandwidth(5)
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .diverseDeviceId("ed7891bd-15b4-4f72-ac56-d96cfdacddcc")
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName("valid-key-name")
                .build())
            .aclTemplateId("3e548c02-9164-4197-aa23-05b1f644883c")
            .build());

    }
}
```
```yaml
resources:
  vsrxSingle:
    type: equinix:networkedge:Device
    name: vsrx_single
    properties:
      name: tf-c8kv-sdwan
      metroCode: ${sv.metroCode}
      typeCode: VSRX
      selfManaged: true
      byol: true
      packageCode: STD
      notifications:
        - test@equinix.com
      hostname: VSRX
      accountNumber: ${sv.number}
      version: 23.2R1.13
      coreCount: 2
      termLength: 12
      additionalBandwidth: 5
      projectId: a86d7112-d740-4758-9c9c-31e66373746b
      diverseDeviceId: ed7891bd-15b4-4f72-ac56-d96cfdacddcc
      sshKey:
        username: test-username
        keyName: valid-key-name
      aclTemplateId: 3e548c02-9164-4197-aa23-05b1f644883c
variables:
  # Create self configured single VSRX device with BYOL License
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        name: account-name
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 6
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const testPublicKey = new equinix.networkedge.SshKey("testPublicKey", {
    name: "key-name",
    publicKey: "ssh-dss key-value",
    type: "DSA",
});
const aristaHa = new equinix.networkedge.Device("aristaHa", {
    name: "tf-arista-p",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "ARISTA-ROUTER",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "CloudEOS",
    notifications: ["test@equinix.com"],
    hostname: "arista-p",
    accountNumber: sv.apply(sv => sv.number),
    version: "4.29.0",
    coreCount: 4,
    termLength: 12,
    additionalBandwidth: 5,
    sshKey: {
        username: "test-username",
        keyName: testPublicKey.name,
    },
    aclTemplateId: "c637a17b-7a6a-4486-924b-30e6c36904b0",
    secondaryDevice: {
        name: "tf-arista-s",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "arista-s",
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
test_public_key = equinix.networkedge.SshKey("testPublicKey",
    name="key-name",
    public_key="ssh-dss key-value",
    type="DSA")
arista_ha = equinix.networkedge.Device("aristaHa",
    name="tf-arista-p",
    metro_code=sv.metro_code,
    type_code="ARISTA-ROUTER",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="CloudEOS",
    notifications=["test@equinix.com"],
    hostname="arista-p",
    account_number=sv.number,
    version="4.29.0",
    core_count=4,
    term_length=12,
    additional_bandwidth=5,
    ssh_key={
        "username": "test-username",
        "key_name": test_public_key.name,
    },
    acl_template_id="c637a17b-7a6a-4486-924b-30e6c36904b0",
    secondary_device={
        "name": "tf-arista-s",
        "metro_code": sv.metro_code,
        "hostname": "arista-s",
        "notifications": ["test@eq.com"],
        "account_number": sv.number,
        "acl_template_id": "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		testPublicKey, err := networkedge.NewSshKey(ctx, "testPublicKey", &networkedge.SshKeyArgs{
			Name:      pulumi.String("key-name"),
			PublicKey: pulumi.String("ssh-dss key-value"),
			Type:      pulumi.String("DSA"),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "aristaHa", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-arista-p"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("ARISTA-ROUTER"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("CloudEOS"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			Hostname: pulumi.String("arista-p"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("4.29.0"),
			CoreCount:           pulumi.Int(4),
			TermLength:          pulumi.Int(12),
			AdditionalBandwidth: pulumi.Int(5),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  testPublicKey.Name,
			},
			AclTemplateId: pulumi.String("c637a17b-7a6a-4486-924b-30e6c36904b0"),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-arista-s"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("arista-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				AclTemplateId: pulumi.String("fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138"),
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
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var testPublicKey = new Equinix.NetworkEdge.SshKey("testPublicKey", new()
    {
        Name = "key-name",
        PublicKey = "ssh-dss key-value",
        Type = "DSA",
    });

    var aristaHa = new Equinix.NetworkEdge.Device("aristaHa", new()
    {
        Name = "tf-arista-p",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "ARISTA-ROUTER",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "CloudEOS",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        Hostname = "arista-p",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "4.29.0",
        CoreCount = 4,
        TermLength = 12,
        AdditionalBandwidth = 5,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = testPublicKey.Name,
        },
        AclTemplateId = "c637a17b-7a6a-4486-924b-30e6c36904b0",
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-arista-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "arista-s",
            Notifications = new[]
            {
                "test@eq.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            AclTemplateId = "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.SshKey;
import com.pulumi.equinix.networkedge.SshKeyArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name("account-name")
            .metroCode("SV")
            .build());

        var testPublicKey = new SshKey("testPublicKey", SshKeyArgs.builder()
            .name("key-name")
            .publicKey("ssh-dss key-value")
            .type("DSA")
            .build());

        var aristaHa = new Device("aristaHa", DeviceArgs.builder()
            .name("tf-arista-p")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("ARISTA-ROUTER")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("CloudEOS")
            .notifications("test@equinix.com")
            .hostname("arista-p")
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("4.29.0")
            .coreCount(4)
            .termLength(12)
            .additionalBandwidth(5)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName(testPublicKey.name())
                .build())
            .aclTemplateId("c637a17b-7a6a-4486-924b-30e6c36904b0")
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-arista-s")
                .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
                .hostname("arista-s")
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
                .aclTemplateId("fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138")
                .build())
            .build());

    }
}
```
```yaml
resources:
  testPublicKey:
    type: equinix:networkedge:SshKey
    name: test_public_key
    properties:
      name: key-name
      publicKey: ssh-dss key-value
      type: DSA
  aristaHa:
    type: equinix:networkedge:Device
    name: arista_ha
    properties:
      name: tf-arista-p
      metroCode: ${sv.metroCode}
      typeCode: ARISTA-ROUTER
      selfManaged: true
      connectivity: PRIVATE
      byol: true
      packageCode: CloudEOS
      notifications:
        - test@equinix.com
      hostname: arista-p
      accountNumber: ${sv.number}
      version: 4.29.0
      coreCount: 4
      termLength: 12
      additionalBandwidth: 5
      sshKey:
        username: test-username
        keyName: ${testPublicKey.name}
      aclTemplateId: c637a17b-7a6a-4486-924b-30e6c36904b0
      secondaryDevice:
        name: tf-arista-s
        metroCode: ${sv.metroCode}
        hostname: arista-s
        notifications:
          - test@eq.com
        accountNumber: ${sv.number}
        aclTemplateId: fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138
variables:
  # Create self configured redundant Arista router with DSA key
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        name: account-name
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 7
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const testPublicKey = new equinix.networkedge.SshKey("testPublicKey", {
    name: "key-name",
    publicKey: "ssh-dss key-value",
    type: "DSA",
});
const bluecatBddsHa = new equinix.networkedge.Device("bluecatBddsHa", {
    name: "tf-bluecat-bdds-p",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "BLUECAT",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "STD",
    notifications: ["test@equinix.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.6.0",
    coreCount: 2,
    termLength: 12,
    vendorConfiguration: {
        hostname: "test",
        privateAddress: "x.x.x.x",
        privateCidrMask: "24",
        privateGateway: "x.x.x.x",
        licenseKey: "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
        licenseId: "xxxxxxxxxxxxxxx",
    },
    sshKey: {
        username: "test-username",
        keyName: testPublicKey.name,
    },
    secondaryDevice: {
        name: "tf-bluecat-bdds-s",
        metroCode: sv.apply(sv => sv.metroCode),
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            hostname: "test",
            privateAddress: "x.x.x.x",
            privateCidrMask: "24",
            privateGateway: "x.x.x.x",
            licenseKey: "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
            licenseId: "xxxxxxxxxxxxxxx",
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
test_public_key = equinix.networkedge.SshKey("testPublicKey",
    name="key-name",
    public_key="ssh-dss key-value",
    type="DSA")
bluecat_bdds_ha = equinix.networkedge.Device("bluecatBddsHa",
    name="tf-bluecat-bdds-p",
    metro_code=sv.metro_code,
    type_code="BLUECAT",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="STD",
    notifications=["test@equinix.com"],
    account_number=sv.number,
    version="9.6.0",
    core_count=2,
    term_length=12,
    vendor_configuration={
        "hostname": "test",
        "privateAddress": "x.x.x.x",
        "privateCidrMask": "24",
        "privateGateway": "x.x.x.x",
        "licenseKey": "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
        "licenseId": "xxxxxxxxxxxxxxx",
    },
    ssh_key={
        "username": "test-username",
        "key_name": test_public_key.name,
    },
    secondary_device={
        "name": "tf-bluecat-bdds-s",
        "metro_code": sv.metro_code,
        "notifications": ["test@eq.com"],
        "account_number": sv.number,
        "vendor_configuration": {
            "hostname": "test",
            "private_address": "x.x.x.x",
            "private_cidr_mask": "24",
            "private_gateway": "x.x.x.x",
            "license_key": "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
            "license_id": "xxxxxxxxxxxxxxx",
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		testPublicKey, err := networkedge.NewSshKey(ctx, "testPublicKey", &networkedge.SshKeyArgs{
			Name:      pulumi.String("key-name"),
			PublicKey: pulumi.String("ssh-dss key-value"),
			Type:      pulumi.String("DSA"),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "bluecatBddsHa", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-bluecat-bdds-p"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("BLUECAT"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("9.6.0"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(12),
			VendorConfiguration: pulumi.StringMap{
				"hostname":        pulumi.String("test"),
				"privateAddress":  pulumi.String("x.x.x.x"),
				"privateCidrMask": pulumi.String("24"),
				"privateGateway":  pulumi.String("x.x.x.x"),
				"licenseKey":      pulumi.String("xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
				"licenseId":       pulumi.String("xxxxxxxxxxxxxxx"),
			},
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  testPublicKey.Name,
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-bluecat-bdds-s"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"hostname":        pulumi.String("test"),
					"privateAddress":  pulumi.String("x.x.x.x"),
					"privateCidrMask": pulumi.String("24"),
					"privateGateway":  pulumi.String("x.x.x.x"),
					"licenseKey":      pulumi.String("xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
					"licenseId":       pulumi.String("xxxxxxxxxxxxxxx"),
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
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var testPublicKey = new Equinix.NetworkEdge.SshKey("testPublicKey", new()
    {
        Name = "key-name",
        PublicKey = "ssh-dss key-value",
        Type = "DSA",
    });

    var bluecatBddsHa = new Equinix.NetworkEdge.Device("bluecatBddsHa", new()
    {
        Name = "tf-bluecat-bdds-p",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "BLUECAT",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.6.0",
        CoreCount = 2,
        TermLength = 12,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "privateAddress", "x.x.x.x" },
            { "privateCidrMask", "24" },
            { "privateGateway", "x.x.x.x" },
            { "licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx" },
            { "licenseId", "xxxxxxxxxxxxxxx" },
        },
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = testPublicKey.Name,
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-bluecat-bdds-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Notifications = new[]
            {
                "test@eq.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "privateAddress", "x.x.x.x" },
                { "privateCidrMask", "24" },
                { "privateGateway", "x.x.x.x" },
                { "licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx" },
                { "licenseId", "xxxxxxxxxxxxxxx" },
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
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.SshKey;
import com.pulumi.equinix.networkedge.SshKeyArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name("account-name")
            .metroCode("SV")
            .build());

        var testPublicKey = new SshKey("testPublicKey", SshKeyArgs.builder()
            .name("key-name")
            .publicKey("ssh-dss key-value")
            .type("DSA")
            .build());

        var bluecatBddsHa = new Device("bluecatBddsHa", DeviceArgs.builder()
            .name("tf-bluecat-bdds-p")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("BLUECAT")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("9.6.0")
            .coreCount(2)
            .termLength(12)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("privateAddress", "x.x.x.x"),
                Map.entry("privateCidrMask", "24"),
                Map.entry("privateGateway", "x.x.x.x"),
                Map.entry("licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
                Map.entry("licenseId", "xxxxxxxxxxxxxxx")
            ))
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName(testPublicKey.name())
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-bluecat-bdds-s")
                .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("privateAddress", "x.x.x.x"),
                    Map.entry("privateCidrMask", "24"),
                    Map.entry("privateGateway", "x.x.x.x"),
                    Map.entry("licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
                    Map.entry("licenseId", "xxxxxxxxxxxxxxx")
                ))
                .build())
            .build());

    }
}
```
```yaml
resources:
  testPublicKey:
    type: equinix:networkedge:SshKey
    name: test_public_key
    properties:
      name: key-name
      publicKey: ssh-dss key-value
      type: DSA
  bluecatBddsHa:
    type: equinix:networkedge:Device
    name: bluecat_bdds_ha
    properties:
      name: tf-bluecat-bdds-p
      metroCode: ${sv.metroCode}
      typeCode: BLUECAT
      selfManaged: true
      connectivity: PRIVATE
      byol: true
      packageCode: STD
      notifications:
        - test@equinix.com
      accountNumber: ${sv.number}
      version: 9.6.0
      coreCount: 2
      termLength: 12
      vendorConfiguration:
        hostname: test
        privateAddress: x.x.x.x
        privateCidrMask: '24'
        privateGateway: x.x.x.x
        licenseKey: xxxxx-xxxxx-xxxxx-xxxxx-xxxxx
        licenseId: xxxxxxxxxxxxxxx
      sshKey:
        username: test-username
        keyName: ${testPublicKey.name}
      secondaryDevice:
        name: tf-bluecat-bdds-s
        metroCode: ${sv.metroCode}
        notifications:
          - test@eq.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          hostname: test
          privateAddress: x.x.x.x
          privateCidrMask: '24'
          privateGateway: x.x.x.x
          licenseKey: xxxxx-xxxxx-xxxxx-xxxxx-xxxxx
          licenseId: xxxxxxxxxxxxxxx
variables:
  # Create self configured redundant BlueCat DNS and DHCP Server
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        name: account-name
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 8
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";
import * as std from "@pulumi/std";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const bluecatEdgeServicePointCloudinitPrimaryFile = new equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile", {
    fileName: "TF-BLUECAT-ESP-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "BLUECAT-EDGE-SERVICE-POINT",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const bluecatEdgeServicePointCloudinitSecondaryFile = new equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", {
    fileName: "TF-BLUECAT-ESP-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "BLUECAT-EDGE-SERVICE-POINT",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const bluecatEdgeServicePointHa = new equinix.networkedge.Device("bluecatEdgeServicePointHa", {
    name: "tf-bluecat-edge-service-point-p",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "BLUECAT-EDGE-SERVICE-POINT",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "STD",
    notifications: ["test@equinix.com"],
    accountNumber: sv.apply(sv => sv.number),
    cloudInitFileId: bluecatEdgeServicePointCloudinitPrimaryFile.uuid,
    version: "4.6.3",
    coreCount: 4,
    termLength: 12,
    secondaryDevice: {
        name: "tf-bluecat-edge-service-point-s",
        metroCode: sv.apply(sv => sv.metroCode),
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        cloudInitFileId: bluecatEdgeServicePointCloudinitSecondaryFile.uuid,
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
bluecat_edge_service_point_cloudinit_primary_file = equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile",
    file_name="TF-BLUECAT-ESP-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="BLUECAT-EDGE-SERVICE-POINT",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
bluecat_edge_service_point_cloudinit_secondary_file = equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile",
    file_name="TF-BLUECAT-ESP-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="BLUECAT-EDGE-SERVICE-POINT",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
bluecat_edge_service_point_ha = equinix.networkedge.Device("bluecatEdgeServicePointHa",
    name="tf-bluecat-edge-service-point-p",
    metro_code=sv.metro_code,
    type_code="BLUECAT-EDGE-SERVICE-POINT",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="STD",
    notifications=["test@equinix.com"],
    account_number=sv.number,
    cloud_init_file_id=bluecat_edge_service_point_cloudinit_primary_file.uuid,
    version="4.6.3",
    core_count=4,
    term_length=12,
    secondary_device={
        "name": "tf-bluecat-edge-service-point-s",
        "metro_code": sv.metro_code,
        "notifications": ["test@eq.com"],
        "account_number": sv.number,
        "cloud_init_file_id": bluecat_edge_service_point_cloudinit_secondary_file.uuid,
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		bluecatEdgeServicePointCloudinitPrimaryFile, err := networkedge.NewNetworkFile(ctx, "bluecatEdgeServicePointCloudinitPrimaryFile", &networkedge.NetworkFileArgs{
			FileName: pulumi.String("TF-BLUECAT-ESP-cloud-init-file.txt"),
			Content: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.Any(filepath),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
			MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput).ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("BLUECAT-EDGE-SERVICE-POINT"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		bluecatEdgeServicePointCloudinitSecondaryFile, err := networkedge.NewNetworkFile(ctx, "bluecatEdgeServicePointCloudinitSecondaryFile", &networkedge.NetworkFileArgs{
			FileName: pulumi.String("TF-BLUECAT-ESP-cloud-init-file.txt"),
			Content: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.Any(filepath),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
			MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput).ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("BLUECAT-EDGE-SERVICE-POINT"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "bluecatEdgeServicePointHa", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-bluecat-edge-service-point-p"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("BLUECAT-EDGE-SERVICE-POINT"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			CloudInitFileId: bluecatEdgeServicePointCloudinitPrimaryFile.Uuid,
			Version:         pulumi.String("4.6.3"),
			CoreCount:       pulumi.Int(4),
			TermLength:      pulumi.Int(12),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-bluecat-edge-service-point-s"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				CloudInitFileId: bluecatEdgeServicePointCloudinitSecondaryFile.Uuid,
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
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = "account-name",
        MetroCode = "SV",
    });

    var bluecatEdgeServicePointCloudinitPrimaryFile = new Equinix.NetworkEdge.NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile", new()
    {
        FileName = "TF-BLUECAT-ESP-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "BLUECAT-EDGE-SERVICE-POINT",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var bluecatEdgeServicePointCloudinitSecondaryFile = new Equinix.NetworkEdge.NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", new()
    {
        FileName = "TF-BLUECAT-ESP-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "BLUECAT-EDGE-SERVICE-POINT",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var bluecatEdgeServicePointHa = new Equinix.NetworkEdge.Device("bluecatEdgeServicePointHa", new()
    {
        Name = "tf-bluecat-edge-service-point-p",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "BLUECAT-EDGE-SERVICE-POINT",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@equinix.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        CloudInitFileId = bluecatEdgeServicePointCloudinitPrimaryFile.Uuid,
        Version = "4.6.3",
        CoreCount = 4,
        TermLength = 12,
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-bluecat-edge-service-point-s",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Notifications = new[]
            {
                "test@eq.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            CloudInitFileId = bluecatEdgeServicePointCloudinitSecondaryFile.Uuid,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.NetworkFile;
import com.pulumi.equinix.networkedge.NetworkFileArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name("account-name")
            .metroCode("SV")
            .build());

        var bluecatEdgeServicePointCloudinitPrimaryFile = new NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile", NetworkFileArgs.builder()
            .fileName("TF-BLUECAT-ESP-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).result())
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .deviceTypeCode("BLUECAT-EDGE-SERVICE-POINT")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var bluecatEdgeServicePointCloudinitSecondaryFile = new NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", NetworkFileArgs.builder()
            .fileName("TF-BLUECAT-ESP-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).result())
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .deviceTypeCode("BLUECAT-EDGE-SERVICE-POINT")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var bluecatEdgeServicePointHa = new Device("bluecatEdgeServicePointHa", DeviceArgs.builder()
            .name("tf-bluecat-edge-service-point-p")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("BLUECAT-EDGE-SERVICE-POINT")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .cloudInitFileId(bluecatEdgeServicePointCloudinitPrimaryFile.uuid())
            .version("4.6.3")
            .coreCount(4)
            .termLength(12)
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-bluecat-edge-service-point-s")
                .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
                .cloudInitFileId(bluecatEdgeServicePointCloudinitSecondaryFile.uuid())
                .build())
            .build());

    }
}
```
```yaml
resources:
  bluecatEdgeServicePointCloudinitPrimaryFile:
    type: equinix:networkedge:NetworkFile
    name: bluecat_edge_service_point_cloudinit_primary_file
    properties:
      fileName: TF-BLUECAT-ESP-cloud-init-file.txt
      content:
        fn::invoke:
          Function: std:file
          Arguments:
            input: ${filepath}
          Return: result
      metroCode: ${sv.metroCode}
      deviceTypeCode: BLUECAT-EDGE-SERVICE-POINT
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
  bluecatEdgeServicePointCloudinitSecondaryFile:
    type: equinix:networkedge:NetworkFile
    name: bluecat_edge_service_point_cloudinit_secondary_file
    properties:
      fileName: TF-BLUECAT-ESP-cloud-init-file.txt
      content:
        fn::invoke:
          Function: std:file
          Arguments:
            input: ${filepath}
          Return: result
      metroCode: ${sv.metroCode}
      deviceTypeCode: BLUECAT-EDGE-SERVICE-POINT
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
  bluecatEdgeServicePointHa:
    type: equinix:networkedge:Device
    name: bluecat_edge_service_point_ha
    properties:
      name: tf-bluecat-edge-service-point-p
      metroCode: ${sv.metroCode}
      typeCode: BLUECAT-EDGE-SERVICE-POINT
      selfManaged: true
      connectivity: PRIVATE
      byol: true
      packageCode: STD
      notifications:
        - test@equinix.com
      accountNumber: ${sv.number}
      cloudInitFileId: ${bluecatEdgeServicePointCloudinitPrimaryFile.uuid}
      version: 4.6.3
      coreCount: 4
      termLength: 12
      secondaryDevice:
        name: tf-bluecat-edge-service-point-s
        metroCode: ${sv.metroCode}
        notifications:
          - test@eq.com
        accountNumber: ${sv.number}
        cloudInitFileId: ${bluecatEdgeServicePointCloudinitSecondaryFile.uuid}
variables:
  # Create self configured redundant BlueCat Edge Service Point
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        name: account-name
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 9
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const panwCluster = new equinix.networkedge.Device("panwCluster", {
    name: "tf-panw",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "PA-VM",
    selfManaged: true,
    byol: true,
    packageCode: "VM100",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "11.1.3",
    interfaceCount: 10,
    coreCount: 2,
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    clusterDetails: {
        clusterName: "tf-panw-cluster",
        node0: {
            vendorConfiguration: {
                hostname: "panw-node0",
                panoramaIpAddress: "x.x.x.x",
                panoramaAuthKey: "xxxxxxxxxxx",
            },
            licenseToken: "licenseToken",
        },
        node1: {
            vendorConfiguration: {
                hostname: "panw-node1",
                panoramaIpAddress: "x.x.x.x",
                panoramaAuthKey: "xxxxxxxxxxx",
            },
            licenseToken: "licenseToken",
        },
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
panw_cluster = equinix.networkedge.Device("panwCluster",
    name="tf-panw",
    metro_code=sv.metro_code,
    type_code="PA-VM",
    self_managed=True,
    byol=True,
    package_code="VM100",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="11.1.3",
    interface_count=10,
    core_count=2,
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    cluster_details={
        "cluster_name": "tf-panw-cluster",
        "node0": {
            "vendor_configuration": {
                "hostname": "panw-node0",
                "panorama_ip_address": "x.x.x.x",
                "panorama_auth_key": "xxxxxxxxxxx",
            },
            "license_token": "licenseToken",
        },
        "node1": {
            "vendor_configuration": {
                "hostname": "panw-node1",
                "panorama_ip_address": "x.x.x.x",
                "panorama_auth_key": "xxxxxxxxxxx",
            },
            "license_token": "licenseToken",
        },
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "panwCluster", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-panw"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("PA-VM"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("VM100"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("11.1.3"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				ClusterName: pulumi.String("tf-panw-cluster"),
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						Hostname:          pulumi.String("panw-node0"),
						PanoramaIpAddress: pulumi.String("x.x.x.x"),
						PanoramaAuthKey:   pulumi.String("xxxxxxxxxxx"),
					},
					LicenseToken: pulumi.String("licenseToken"),
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						Hostname:          pulumi.String("panw-node1"),
						PanoramaIpAddress: pulumi.String("x.x.x.x"),
						PanoramaAuthKey:   pulumi.String("xxxxxxxxxxx"),
					},
					LicenseToken: pulumi.String("licenseToken"),
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
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var panwCluster = new Equinix.NetworkEdge.Device("panwCluster", new()
    {
        Name = "tf-panw",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "PA-VM",
        SelfManaged = true,
        Byol = true,
        PackageCode = "VM100",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "11.1.3",
        InterfaceCount = 10,
        CoreCount = 2,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            ClusterName = "tf-panw-cluster",
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    Hostname = "panw-node0",
                    PanoramaIpAddress = "x.x.x.x",
                    PanoramaAuthKey = "xxxxxxxxxxx",
                },
                LicenseToken = "licenseToken",
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    Hostname = "panw-node1",
                    PanoramaIpAddress = "x.x.x.x",
                    PanoramaAuthKey = "xxxxxxxxxxx",
                },
                LicenseToken = "licenseToken",
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
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0Args;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0VendorConfigurationArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1Args;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1VendorConfigurationArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var panwCluster = new Device("panwCluster", DeviceArgs.builder()
            .name("tf-panw")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("PA-VM")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM100")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("11.1.3")
            .interfaceCount(10)
            .coreCount(2)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .clusterName("tf-panw-cluster")
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .hostname("panw-node0")
                        .panoramaIpAddress("x.x.x.x")
                        .panoramaAuthKey("xxxxxxxxxxx")
                        .build())
                    .licenseToken("licenseToken")
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .hostname("panw-node1")
                        .panoramaIpAddress("x.x.x.x")
                        .panoramaAuthKey("xxxxxxxxxxx")
                        .build())
                    .licenseToken("licenseToken")
                    .build())
                .build())
            .build());

    }
}
```
```yaml
resources:
  panwCluster:
    type: equinix:networkedge:Device
    name: panw_cluster
    properties:
      name: tf-panw
      metroCode: ${sv.metroCode}
      typeCode: PA-VM
      selfManaged: true
      byol: true
      packageCode: VM100
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 11.1.3
      interfaceCount: 10
      coreCount: 2
      sshKey:
        username: test
        keyName: test-key
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
      clusterDetails:
        clusterName: tf-panw-cluster
        node0:
          vendorConfiguration:
            hostname: panw-node0
            panoramaIpAddress: x.x.x.x
            panoramaAuthKey: xxxxxxxxxxx
          licenseToken: licenseToken
        node1:
          vendorConfiguration:
            hostname: panw-node1
            panoramaIpAddress: x.x.x.x
            panoramaAuthKey: xxxxxxxxxxx
          licenseToken: licenseToken
variables:
  # Create PA-VM firewall cluster with Panorama Server Integration
  # with Panorama Server IP and Panorama Auth Key in vendor Configuration
  sv:
    fn::invoke:
      Function: equinix:networkedge:getAccount
      Arguments:
        metroCode: SV
```
{{% /example %}}


