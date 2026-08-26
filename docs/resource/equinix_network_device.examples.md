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
const csr1000VHa = new equinix.networkedge.Device("csr1000v_ha", {
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
});
```
```python
import pulumi
import pulumi_equinix as equinix

dc = equinix.networkedge.get_account_output(metro_code="DC")
sv = equinix.networkedge.get_account_output(metro_code="SV")
csr1000_v_ha = equinix.networkedge.Device("csr1000v_ha",
    secondary_device={
        "name": "tf-csr1000v-s",
        "metro_code": sv.metro_code,
        "hostname": "csr1000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
    },
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
    core_count=2)
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
		_, err := networkedge.NewDevice(ctx, "csr1000v_ha", &networkedge.DeviceArgs{
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

    var csr1000VHa = new Equinix.NetworkEdge.Device("csr1000v_ha", new()
    {
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
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-csr1000v-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("csr1000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .build())
            .name("tf-csr1000v-p")
            .throughput(500)
            .throughputUnit("Mbps")
            .metroCode(dc.applyValue(_dc -> _dc.metroCode()))
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
            .accountNumber(dc.applyValue(_dc -> _dc.number()))
            .version("16.09.05")
            .coreCount(2)
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
      secondaryDevice:
        name: tf-csr1000v-s
        metroCode: ${sv.metroCode}
        hostname: csr1000v-s
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
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
variables:
  # Create pair of redundant, managed CSR1000V routers with license subscription
  # in two different metro locations
  dc:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: DC
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const panwCluster = new equinix.networkedge.Device("panw_cluster", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    clusterDetails: {
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
        clusterName: "tf-panw-cluster",
    },
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
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
panw_cluster = equinix.networkedge.Device("panw_cluster",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    cluster_details={
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
        "cluster_name": "tf-panw-cluster",
    },
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
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
		_, err := networkedge.NewDevice(ctx, "panw_cluster", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
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
				ClusterName: pulumi.String("tf-panw-cluster"),
			},
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
			AclTemplateId:  pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
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

    var panwCluster = new Equinix.NetworkEdge.Device("panw_cluster", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
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
            ClusterName = "tf-panw-cluster",
        },
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
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
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
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .clusterDetails(DeviceClusterDetailsArgs.builder()
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
                .clusterName("tf-panw-cluster")
                .build())
            .name("tf-panw")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("PA-VM")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM100")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("10.1.3")
            .interfaceCount(10)
            .coreCount(2)
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
      sshKey:
        username: test
        keyName: test-key
      clusterDetails:
        node0:
          vendorConfiguration:
            hostname: panw-node0
          licenseToken: licenseToken
        node1:
          vendorConfiguration:
            hostname: panw-node1
          licenseToken: licenseToken
        clusterName: tf-panw-cluster
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
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
variables:
  # Create self configured PANW cluster with BYOL license
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const aviatrixCloudinitFile = new equinix.networkedge.NetworkFile("aviatrix_cloudinit_file", {
    fileName: "TF-AVX-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "AVIATRIX_EDGE_10",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const aviatrixSingle = new equinix.networkedge.Device("aviatrix_single", {
    name: "tf-aviatrix",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "AVIATRIX_EDGE_10",
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
aviatrix_cloudinit_file = equinix.networkedge.NetworkFile("aviatrix_cloudinit_file",
    file_name="TF-AVX-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="AVIATRIX_EDGE_10",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
aviatrix_single = equinix.networkedge.Device("aviatrix_single",
    name="tf-aviatrix",
    metro_code=sv.metro_code,
    type_code="AVIATRIX_EDGE_10",
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
	"github.com/pulumi/pulumi-std/sdk/v2/go/std"
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
		aviatrixCloudinitFile, err := networkedge.NewNetworkFile(ctx, "aviatrix_cloudinit_file", &networkedge.NetworkFileArgs{
			FileName: pulumi.String("TF-AVX-cloud-init-file.txt"),
			Content: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.String(filepath),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
			MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput).ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE_10"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "aviatrix_single", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-aviatrix"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("AVIATRIX_EDGE_10"),
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

    var aviatrixCloudinitFile = new Equinix.NetworkEdge.NetworkFile("aviatrix_cloudinit_file", new()
    {
        FileName = "TF-AVX-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "AVIATRIX_EDGE_10",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var aviatrixSingle = new Equinix.NetworkEdge.Device("aviatrix_single", new()
    {
        Name = "tf-aviatrix",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "AVIATRIX_EDGE_10",
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
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
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
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .deviceTypeCode("AVIATRIX_EDGE_10")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var aviatrixSingle = new Device("aviatrixSingle", DeviceArgs.builder()
            .name("tf-aviatrix")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("AVIATRIX_EDGE_10")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("john@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
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
          function: std:file
          arguments:
            input: ${filepath}
          return: result
      metroCode: ${sv.metroCode}
      deviceTypeCode: AVIATRIX_EDGE_10
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
  aviatrixSingle:
    type: equinix:networkedge:Device
    name: aviatrix_single
    properties:
      name: tf-aviatrix
      metroCode: ${sv.metroCode}
      typeCode: AVIATRIX_EDGE_10
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
      function: equinix:networkedge:getAccount
      arguments:
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
const c8KvSingle = new equinix.networkedge.Device("c8kv_single", {
    sshKey: {
        username: "test-username",
        keyName: "valid-key-name",
    },
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
    aclTemplateId: "3e548c02-9164-4197-aa23-05b1f644883c",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
c8_kv_single = equinix.networkedge.Device("c8kv_single",
    ssh_key={
        "username": "test-username",
        "key_name": "valid-key-name",
    },
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
		_, err := networkedge.NewDevice(ctx, "c8kv_single", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  pulumi.String("valid-key-name"),
			},
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
			AclTemplateId:       pulumi.String("3e548c02-9164-4197-aa23-05b1f644883c"),
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

    var c8KvSingle = new Equinix.NetworkEdge.Device("c8kv_single", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = "valid-key-name",
        },
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
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName("valid-key-name")
                .build())
            .name("tf-c8kv")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .notifications("test@equinix.com")
            .hostname("C8KV")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.06.01a")
            .coreCount(2)
            .termLength(12)
            .licenseToken("valid-license-token")
            .additionalBandwidth(5)
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
      sshKey:
        username: test-username
        keyName: valid-key-name
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
      aclTemplateId: 3e548c02-9164-4197-aa23-05b1f644883c
variables:
  # Create self configured single Catalyst 8000V (Autonomous Mode) router with license token
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const vsrxSingle = new equinix.networkedge.Device("vsrx_single", {
    sshKey: {
        username: "test-username",
        keyName: "valid-key-name",
    },
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
    aclTemplateId: "3e548c02-9164-4197-aa23-05b1f644883c",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
vsrx_single = equinix.networkedge.Device("vsrx_single",
    ssh_key={
        "username": "test-username",
        "key_name": "valid-key-name",
    },
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
		_, err := networkedge.NewDevice(ctx, "vsrx_single", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  pulumi.String("valid-key-name"),
			},
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
			AclTemplateId:       pulumi.String("3e548c02-9164-4197-aa23-05b1f644883c"),
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

    var vsrxSingle = new Equinix.NetworkEdge.Device("vsrx_single", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = "valid-key-name",
        },
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
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName("valid-key-name")
                .build())
            .name("tf-c8kv-sdwan")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("VSRX")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .hostname("VSRX")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("23.2R1.13")
            .coreCount(2)
            .termLength(12)
            .additionalBandwidth(5)
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .diverseDeviceId("ed7891bd-15b4-4f72-ac56-d96cfdacddcc")
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
      sshKey:
        username: test-username
        keyName: valid-key-name
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
      aclTemplateId: 3e548c02-9164-4197-aa23-05b1f644883c
variables:
  # Create self configured single VSRX device with BYOL License
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const testPublicKey = new equinix.networkedge.SshKey("test_public_key", {
    name: "key-name",
    publicKey: "ssh-dss key-value",
    type: "DSA",
});
const aristaHa = new equinix.networkedge.Device("arista_ha", {
    sshKey: {
        username: "test-username",
        keyName: testPublicKey.name,
    },
    secondaryDevice: {
        name: "tf-arista-s",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "arista-s",
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
    },
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
    aclTemplateId: "c637a17b-7a6a-4486-924b-30e6c36904b0",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
test_public_key = equinix.networkedge.SshKey("test_public_key",
    name="key-name",
    public_key="ssh-dss key-value",
    type="DSA")
arista_ha = equinix.networkedge.Device("arista_ha",
    ssh_key={
        "username": "test-username",
        "key_name": test_public_key.name,
    },
    secondary_device={
        "name": "tf-arista-s",
        "metro_code": sv.metro_code,
        "hostname": "arista-s",
        "notifications": ["test@eq.com"],
        "account_number": sv.number,
        "acl_template_id": "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
    },
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
    acl_template_id="c637a17b-7a6a-4486-924b-30e6c36904b0")
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
		testPublicKey, err := networkedge.NewSshKey(ctx, "test_public_key", &networkedge.SshKeyArgs{
			Name:      pulumi.String("key-name"),
			PublicKey: pulumi.String("ssh-dss key-value"),
			Type:      pulumi.String("DSA"),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "arista_ha", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  testPublicKey.Name,
			},
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
			AclTemplateId:       pulumi.String("c637a17b-7a6a-4486-924b-30e6c36904b0"),
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

    var testPublicKey = new Equinix.NetworkEdge.SshKey("test_public_key", new()
    {
        Name = "key-name",
        PublicKey = "ssh-dss key-value",
        Type = "DSA",
    });

    var aristaHa = new Equinix.NetworkEdge.Device("arista_ha", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test-username",
            KeyName = testPublicKey.Name,
        },
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
        AclTemplateId = "c637a17b-7a6a-4486-924b-30e6c36904b0",
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
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName(testPublicKey.name())
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-arista-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("arista-s")
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .aclTemplateId("fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138")
                .build())
            .name("tf-arista-p")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("ARISTA-ROUTER")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("CloudEOS")
            .notifications("test@equinix.com")
            .hostname("arista-p")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("4.29.0")
            .coreCount(4)
            .termLength(12)
            .additionalBandwidth(5)
            .aclTemplateId("c637a17b-7a6a-4486-924b-30e6c36904b0")
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
      sshKey:
        username: test-username
        keyName: ${testPublicKey.name}
      secondaryDevice:
        name: tf-arista-s
        metroCode: ${sv.metroCode}
        hostname: arista-s
        notifications:
          - test@eq.com
        accountNumber: ${sv.number}
        aclTemplateId: fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138
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
      aclTemplateId: c637a17b-7a6a-4486-924b-30e6c36904b0
variables:
  # Create self configured redundant Arista router with DSA key
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        name: account-name
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example 6wind vsr ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const sixWindVsr = new equinix.networkedge.Device("six-wind-vsr", {
    sshKey: {
        username: "xxxx",
        keyName: "xxxxx",
    },
    secondaryDevice: {
        name: "6WIND-VSR-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            hostname: "test",
            token: "xxxx",
        },
    },
    name: "6WIND-VSR",
    projectId: "xxxxxxx",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "6WIND-VSR",
    selfManaged: true,
    byol: true,
    interfaceCount: 10,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "3.10.8",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        hostname: "test",
        token: "xxxx",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
six_wind_vsr = equinix.networkedge.Device("six-wind-vsr",
    ssh_key={
        "username": "xxxx",
        "key_name": "xxxxx",
    },
    secondary_device={
        "name": "6WIND-VSR-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "hostname": "test",
            "token": "xxxx",
        },
    },
    name="6WIND-VSR",
    project_id="xxxxxxx",
    metro_code=sv.metro_code,
    type_code="6WIND-VSR",
    self_managed=True,
    byol=True,
    interface_count=10,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="3.10.8",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "hostname": "test",
        "token": "xxxx",
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
		_, err := networkedge.NewDevice(ctx, "six-wind-vsr", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("xxxx"),
				KeyName:  pulumi.String("xxxxx"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("6WIND-VSR-Sec"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"hostname": pulumi.String("test"),
					"token":    pulumi.String("xxxx"),
				},
			},
			Name:      pulumi.String("6WIND-VSR"),
			ProjectId: pulumi.String("xxxxxxx"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:       pulumi.String("6WIND-VSR"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			InterfaceCount: pulumi.Int(10),
			PackageCode:    pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("3.10.8"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"hostname": pulumi.String("test"),
				"token":    pulumi.String("xxxx"),
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

    var sixWindVsr = new Equinix.NetworkEdge.Device("six-wind-vsr", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "xxxx",
            KeyName = "xxxxx",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "6WIND-VSR-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "token", "xxxx" },
            },
        },
        Name = "6WIND-VSR",
        ProjectId = "xxxxxxx",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "6WIND-VSR",
        SelfManaged = true,
        Byol = true,
        InterfaceCount = 10,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "3.10.8",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "token", "xxxx" },
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
            .metroCode("SV")
            .build());

        var sixWindVsr = new Device("sixWindVsr", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("xxxx")
                .keyName("xxxxx")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("6WIND-VSR-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("token", "xxxx")
                ))
                .build())
            .name("6WIND-VSR")
            .projectId("xxxxxxx")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("6WIND-VSR")
            .selfManaged(true)
            .byol(true)
            .interfaceCount(10)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("3.10.8")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("token", "xxxx")
            ))
            .build());

    }
}
```
```yaml
resources:
  six-wind-vsr:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: xxxx
        keyName: xxxxx
      secondaryDevice:
        name: 6WIND-VSR-Sec
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        notifications:
          - test@eq.com
        vendorConfiguration:
          hostname: test
          token: xxxx
      name: 6WIND-VSR
      projectId: xxxxxxx
      metroCode: ${sv.metroCode}
      typeCode: 6WIND-VSR
      selfManaged: true
      byol: true
      interfaceCount: 10
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 3.10.8
      coreCount: 2
      termLength: 1
      vendorConfiguration:
        hostname: test
        token: xxxx
variables:
  # Create 6WIND VSR HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const testPublicKey = new equinix.networkedge.SshKey("test_public_key", {
    name: "key-name",
    publicKey: "ssh-dss key-value",
    type: "DSA",
});
const bluecatBddsHa = new equinix.networkedge.Device("bluecat_bdds_ha", {
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
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
test_public_key = equinix.networkedge.SshKey("test_public_key",
    name="key-name",
    public_key="ssh-dss key-value",
    type="DSA")
bluecat_bdds_ha = equinix.networkedge.Device("bluecat_bdds_ha",
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
            "privateAddress": "x.x.x.x",
            "privateCidrMask": "24",
            "privateGateway": "x.x.x.x",
            "licenseKey": "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
            "licenseId": "xxxxxxxxxxxxxxx",
        },
    },
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
		testPublicKey, err := networkedge.NewSshKey(ctx, "test_public_key", &networkedge.SshKeyArgs{
			Name:      pulumi.String("key-name"),
			PublicKey: pulumi.String("ssh-dss key-value"),
			Type:      pulumi.String("DSA"),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "bluecat_bdds_ha", &networkedge.DeviceArgs{
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

    var testPublicKey = new Equinix.NetworkEdge.SshKey("test_public_key", new()
    {
        Name = "key-name",
        PublicKey = "ssh-dss key-value",
        Type = "DSA",
    });

    var bluecatBddsHa = new Equinix.NetworkEdge.Device("bluecat_bdds_ha", new()
    {
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
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName(testPublicKey.name())
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-bluecat-bdds-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("privateAddress", "x.x.x.x"),
                    Map.entry("privateCidrMask", "24"),
                    Map.entry("privateGateway", "x.x.x.x"),
                    Map.entry("licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
                    Map.entry("licenseId", "xxxxxxxxxxxxxxx")
                ))
                .build())
            .name("tf-bluecat-bdds-p")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("BLUECAT")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
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
variables:
  # Create self configured redundant BlueCat DNS and DHCP Server
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const bluecatEdgeServicePointCloudinitPrimaryFile = new equinix.networkedge.NetworkFile("bluecat_edge_service_point_cloudinit_primary_file", {
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
const bluecatEdgeServicePointCloudinitSecondaryFile = new equinix.networkedge.NetworkFile("bluecat_edge_service_point_cloudinit_secondary_file", {
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
const bluecatEdgeServicePointHa = new equinix.networkedge.Device("bluecat_edge_service_point_ha", {
    secondaryDevice: {
        name: "tf-bluecat-edge-service-point-s",
        metroCode: sv.apply(sv => sv.metroCode),
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        cloudInitFileId: bluecatEdgeServicePointCloudinitSecondaryFile.uuid,
    },
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
});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

sv = equinix.networkedge.get_account_output(name="account-name",
    metro_code="SV")
bluecat_edge_service_point_cloudinit_primary_file = equinix.networkedge.NetworkFile("bluecat_edge_service_point_cloudinit_primary_file",
    file_name="TF-BLUECAT-ESP-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="BLUECAT-EDGE-SERVICE-POINT",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
bluecat_edge_service_point_cloudinit_secondary_file = equinix.networkedge.NetworkFile("bluecat_edge_service_point_cloudinit_secondary_file",
    file_name="TF-BLUECAT-ESP-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="BLUECAT-EDGE-SERVICE-POINT",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
bluecat_edge_service_point_ha = equinix.networkedge.Device("bluecat_edge_service_point_ha",
    secondary_device={
        "name": "tf-bluecat-edge-service-point-s",
        "metro_code": sv.metro_code,
        "notifications": ["test@eq.com"],
        "account_number": sv.number,
        "cloud_init_file_id": bluecat_edge_service_point_cloudinit_secondary_file.uuid,
    },
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
    term_length=12)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi-std/sdk/v2/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		bluecatEdgeServicePointCloudinitPrimaryFile, err := networkedge.NewNetworkFile(ctx, "bluecat_edge_service_point_cloudinit_primary_file", &networkedge.NetworkFileArgs{
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
		bluecatEdgeServicePointCloudinitSecondaryFile, err := networkedge.NewNetworkFile(ctx, "bluecat_edge_service_point_cloudinit_secondary_file", &networkedge.NetworkFileArgs{
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
		_, err = networkedge.NewDevice(ctx, "bluecat_edge_service_point_ha", &networkedge.DeviceArgs{
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

    var bluecatEdgeServicePointCloudinitPrimaryFile = new Equinix.NetworkEdge.NetworkFile("bluecat_edge_service_point_cloudinit_primary_file", new()
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

    var bluecatEdgeServicePointCloudinitSecondaryFile = new Equinix.NetworkEdge.NetworkFile("bluecat_edge_service_point_cloudinit_secondary_file", new()
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

    var bluecatEdgeServicePointHa = new Equinix.NetworkEdge.Device("bluecat_edge_service_point_ha", new()
    {
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
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
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
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .deviceTypeCode("BLUECAT-EDGE-SERVICE-POINT")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var bluecatEdgeServicePointCloudinitSecondaryFile = new NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", NetworkFileArgs.builder()
            .fileName("TF-BLUECAT-ESP-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .deviceTypeCode("BLUECAT-EDGE-SERVICE-POINT")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var bluecatEdgeServicePointHa = new Device("bluecatEdgeServicePointHa", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-bluecat-edge-service-point-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .cloudInitFileId(bluecatEdgeServicePointCloudinitSecondaryFile.uuid())
                .build())
            .name("tf-bluecat-edge-service-point-p")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("BLUECAT-EDGE-SERVICE-POINT")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .cloudInitFileId(bluecatEdgeServicePointCloudinitPrimaryFile.uuid())
            .version("4.6.3")
            .coreCount(4)
            .termLength(12)
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
          function: std:file
          arguments:
            input: ${filepath}
          return: result
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
          function: std:file
          arguments:
            input: ${filepath}
          return: result
      metroCode: ${sv.metroCode}
      deviceTypeCode: BLUECAT-EDGE-SERVICE-POINT
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
  bluecatEdgeServicePointHa:
    type: equinix:networkedge:Device
    name: bluecat_edge_service_point_ha
    properties:
      secondaryDevice:
        name: tf-bluecat-edge-service-point-s
        metroCode: ${sv.metroCode}
        notifications:
          - test@eq.com
        accountNumber: ${sv.number}
        cloudInitFileId: ${bluecatEdgeServicePointCloudinitSecondaryFile.uuid}
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
variables:
  # Create self configured redundant BlueCat Edge Service Point
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
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
const panwCluster = new equinix.networkedge.Device("panw_cluster", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    clusterDetails: {
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
        clusterName: "tf-panw-cluster",
    },
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
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
panw_cluster = equinix.networkedge.Device("panw_cluster",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    cluster_details={
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
        "cluster_name": "tf-panw-cluster",
    },
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
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
		_, err := networkedge.NewDevice(ctx, "panw_cluster", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
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
				ClusterName: pulumi.String("tf-panw-cluster"),
			},
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
			AclTemplateId:  pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
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

    var panwCluster = new Equinix.NetworkEdge.Device("panw_cluster", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
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
            ClusterName = "tf-panw-cluster",
        },
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
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
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
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .clusterDetails(DeviceClusterDetailsArgs.builder()
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
                .clusterName("tf-panw-cluster")
                .build())
            .name("tf-panw")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("PA-VM")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM100")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("11.1.3")
            .interfaceCount(10)
            .coreCount(2)
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
      sshKey:
        username: test
        keyName: test-key
      clusterDetails:
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
        clusterName: tf-panw-cluster
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
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
variables:
  # Create PA-VM firewall cluster with Panorama Server Integration
  # with Panorama Server IP and Panorama Auth Key in vendor Configuration
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example Aviatrix Transit Edge
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
const aviatrixCloudinitFile = new equinix.networkedge.NetworkFile("aviatrix_cloudinit_file", {
    fileName: "TF-AVX-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "AVIATRIX_TRANSIT_EDGE",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const aviatrixTransitEdgeSingle = new equinix.networkedge.Device("aviatrix-transit-edge-single", {
    name: "tf-aviatrix",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "AVIATRIX_TRANSIT_EDGE",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["john@equinix.com"],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "7.2.a",
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
aviatrix_cloudinit_file = equinix.networkedge.NetworkFile("aviatrix_cloudinit_file",
    file_name="TF-AVX-cloud-init-file.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=sv.metro_code.apply(lambda x: equinix.Metro(x)),
    device_type_code="AVIATRIX_TRANSIT_EDGE",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
aviatrix_transit_edge_single = equinix.networkedge.Device("aviatrix-transit-edge-single",
    name="tf-aviatrix",
    metro_code=sv.metro_code,
    type_code="AVIATRIX_TRANSIT_EDGE",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["john@equinix.com"],
    term_length=12,
    account_number=sv.number,
    version="7.2.a",
    core_count=2,
    cloud_init_file_id=aviatrix_cloudinit_file.uuid,
    acl_template_id="c06150ea-b604-4ad1-832a-d63936e9b938")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi-std/sdk/v2/go/std"
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
		aviatrixCloudinitFile, err := networkedge.NewNetworkFile(ctx, "aviatrix_cloudinit_file", &networkedge.NetworkFileArgs{
			FileName: pulumi.String("TF-AVX-cloud-init-file.txt"),
			Content: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.String(filepath),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
			MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput).ApplyT(func(x *string) equinix.Metro { return equinix.Metro(*x) }).(equinix.MetroOutput),
			DeviceTypeCode: pulumi.String("AVIATRIX_TRANSIT_EDGE"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "aviatrix-transit-edge-single", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-aviatrix"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("AVIATRIX_TRANSIT_EDGE"),
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
			Version:         pulumi.String("7.2.a"),
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

    var aviatrixCloudinitFile = new Equinix.NetworkEdge.NetworkFile("aviatrix_cloudinit_file", new()
    {
        FileName = "TF-AVX-cloud-init-file.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode).Apply(System.Enum.Parse<Equinix.Metro>),
        DeviceTypeCode = "AVIATRIX_TRANSIT_EDGE",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

    var aviatrixTransitEdgeSingle = new Equinix.NetworkEdge.Device("aviatrix-transit-edge-single", new()
    {
        Name = "tf-aviatrix",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "AVIATRIX_TRANSIT_EDGE",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.2.a",
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
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
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
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .deviceTypeCode("AVIATRIX_TRANSIT_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var aviatrixTransitEdgeSingle = new Device("aviatrixTransitEdgeSingle", DeviceArgs.builder()
            .name("tf-aviatrix")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("AVIATRIX_TRANSIT_EDGE")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("john@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.2.a")
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
          function: std:file
          arguments:
            input: ${filepath}
          return: result
      metroCode: ${sv.metroCode}
      deviceTypeCode: AVIATRIX_TRANSIT_EDGE
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
  aviatrix-transit-edge-single:
    type: equinix:networkedge:Device
    properties:
      name: tf-aviatrix
      metroCode: ${sv.metroCode}
      typeCode: AVIATRIX_TRANSIT_EDGE
      selfManaged: true
      byol: true
      packageCode: STD
      notifications:
        - john@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 7.2.a
      coreCount: 2
      cloudInitFileId: ${aviatrixCloudinitFile.uuid}
      aclTemplateId: c06150ea-b604-4ad1-832a-d63936e9b938
variables:
  # Create self configured single Aviatrix Transit Edge device with cloud init file
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example aruba edgeconnect ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const arubaEdgeconnectAm = new equinix.networkedge.Device("ARUBA-EDGECONNECT-AM", {
    secondaryDevice: {
        name: "TF_CHECKPOINT",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "XXXXXXX",
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            accountKey: "xxxxx",
            accountName: "xxxx",
            applianceTag: "test",
            hostname: "test",
        },
    },
    name: "TF_Aruba_Edge_Connect",
    projectId: "XXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "EDGECONNECT-SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "EC-V",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.4.2.3",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    interfaceCount: 32,
    aclTemplateId: "XXXXXXX",
    vendorConfiguration: {
        accountKey: "xxxxx",
        accountName: "xxxx",
        applianceTag: "tests",
        hostname: "test",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
aruba_edgeconnect_am = equinix.networkedge.Device("ARUBA-EDGECONNECT-AM",
    secondary_device={
        "name": "TF_CHECKPOINT",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "acl_template_id": "XXXXXXX",
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "accountKey": "xxxxx",
            "accountName": "xxxx",
            "applianceTag": "test",
            "hostname": "test",
        },
    },
    name="TF_Aruba_Edge_Connect",
    project_id="XXXXX",
    metro_code=sv.metro_code,
    type_code="EDGECONNECT-SDWAN",
    self_managed=True,
    byol=True,
    package_code="EC-V",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.4.2.3",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    interface_count=32,
    acl_template_id="XXXXXXX",
    vendor_configuration={
        "accountKey": "xxxxx",
        "accountName": "xxxx",
        "applianceTag": "tests",
        "hostname": "test",
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
		_, err := networkedge.NewDevice(ctx, "ARUBA-EDGECONNECT-AM", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_CHECKPOINT"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				AclTemplateId: pulumi.String("XXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"accountKey":   pulumi.String("xxxxx"),
					"accountName":  pulumi.String("xxxx"),
					"applianceTag": pulumi.String("test"),
					"hostname":     pulumi.String("test"),
				},
			},
			Name:      pulumi.String("TF_Aruba_Edge_Connect"),
			ProjectId: pulumi.String("XXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("EDGECONNECT-SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("EC-V"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("9.4.2.3"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			InterfaceCount:      pulumi.Int(32),
			AclTemplateId:       pulumi.String("XXXXXXX"),
			VendorConfiguration: pulumi.StringMap{
				"accountKey":   pulumi.String("xxxxx"),
				"accountName":  pulumi.String("xxxx"),
				"applianceTag": pulumi.String("tests"),
				"hostname":     pulumi.String("test"),
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

    var arubaEdgeconnectAm = new Equinix.NetworkEdge.Device("ARUBA-EDGECONNECT-AM", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_CHECKPOINT",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            AclTemplateId = "XXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "accountKey", "xxxxx" },
                { "accountName", "xxxx" },
                { "applianceTag", "test" },
                { "hostname", "test" },
            },
        },
        Name = "TF_Aruba_Edge_Connect",
        ProjectId = "XXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "EDGECONNECT-SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "EC-V",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.4.2.3",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        InterfaceCount = 32,
        AclTemplateId = "XXXXXXX",
        VendorConfiguration = 
        {
            { "accountKey", "xxxxx" },
            { "accountName", "xxxx" },
            { "applianceTag", "tests" },
            { "hostname", "test" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var arubaEdgeconnectAm = new Device("arubaEdgeconnectAm", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_CHECKPOINT")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .aclTemplateId("XXXXXXX")
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("accountKey", "xxxxx"),
                    Map.entry("accountName", "xxxx"),
                    Map.entry("applianceTag", "test"),
                    Map.entry("hostname", "test")
                ))
                .build())
            .name("TF_Aruba_Edge_Connect")
            .projectId("XXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("EDGECONNECT-SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("EC-V")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.4.2.3")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .interfaceCount(32)
            .aclTemplateId("XXXXXXX")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("accountKey", "xxxxx"),
                Map.entry("accountName", "xxxx"),
                Map.entry("applianceTag", "tests"),
                Map.entry("hostname", "test")
            ))
            .build());

    }
}
```
```yaml
resources:
  ARUBA-EDGECONNECT-AM:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_CHECKPOINT
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        aclTemplateId: XXXXXXX
        notifications:
          - test@eq.com
        vendorConfiguration:
          accountKey: xxxxx
          accountName: xxxx
          applianceTag: test
          hostname: test
      name: TF_Aruba_Edge_Connect
      projectId: XXXXX
      metroCode: ${sv.metroCode}
      typeCode: EDGECONNECT-SDWAN
      selfManaged: true
      byol: true
      packageCode: EC-V
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 9.4.2.3
      coreCount: 2
      termLength: 1
      additionalBandwidth: 50
      interfaceCount: 32
      aclTemplateId: XXXXXXX
      vendorConfiguration:
        accountKey: xxxxx
        accountName: xxxx
        applianceTag: tests
        hostname: test
variables:
  # Create Aruba Edgeconnect SDWAN HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example aruba edgeconnect ha device wth purchase order
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const arubaEdgeconnectAm = new equinix.networkedge.Device("ARUBA-EDGECONNECT-AM", {
    secondaryDevice: {
        name: "TF_CHECKPOINT",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        purchaseOrderNumber: "PO-Secondary-Account-123",
        aclTemplateId: "XXXXXXX",
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            accountKey: "xxxxx",
            accountName: "xxxx",
            applianceTag: "test",
            hostname: "test",
        },
    },
    name: "TF_Aruba_Edge_Connect",
    projectId: "XXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "EDGECONNECT-SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "EC-V",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.4.2.3",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    interfaceCount: 32,
    aclTemplateId: "XXXXXXX",
    purchaseOrderNumber: "PO-Primary-Account-123",
    vendorConfiguration: {
        accountKey: "xxxxx",
        accountName: "xxxx",
        applianceTag: "tests",
        hostname: "test",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
aruba_edgeconnect_am = equinix.networkedge.Device("ARUBA-EDGECONNECT-AM",
    secondary_device={
        "name": "TF_CHECKPOINT",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "purchase_order_number": "PO-Secondary-Account-123",
        "acl_template_id": "XXXXXXX",
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "accountKey": "xxxxx",
            "accountName": "xxxx",
            "applianceTag": "test",
            "hostname": "test",
        },
    },
    name="TF_Aruba_Edge_Connect",
    project_id="XXXXX",
    metro_code=sv.metro_code,
    type_code="EDGECONNECT-SDWAN",
    self_managed=True,
    byol=True,
    package_code="EC-V",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.4.2.3",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    interface_count=32,
    acl_template_id="XXXXXXX",
    purchase_order_number="PO-Primary-Account-123",
    vendor_configuration={
        "accountKey": "xxxxx",
        "accountName": "xxxx",
        "applianceTag": "tests",
        "hostname": "test",
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
		_, err := networkedge.NewDevice(ctx, "ARUBA-EDGECONNECT-AM", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_CHECKPOINT"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				PurchaseOrderNumber: pulumi.String("PO-Secondary-Account-123"),
				AclTemplateId:       pulumi.String("XXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"accountKey":   pulumi.String("xxxxx"),
					"accountName":  pulumi.String("xxxx"),
					"applianceTag": pulumi.String("test"),
					"hostname":     pulumi.String("test"),
				},
			},
			Name:      pulumi.String("TF_Aruba_Edge_Connect"),
			ProjectId: pulumi.String("XXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("EDGECONNECT-SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("EC-V"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("9.4.2.3"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			InterfaceCount:      pulumi.Int(32),
			AclTemplateId:       pulumi.String("XXXXXXX"),
			PurchaseOrderNumber: pulumi.String("PO-Primary-Account-123"),
			VendorConfiguration: pulumi.StringMap{
				"accountKey":   pulumi.String("xxxxx"),
				"accountName":  pulumi.String("xxxx"),
				"applianceTag": pulumi.String("tests"),
				"hostname":     pulumi.String("test"),
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

    var arubaEdgeconnectAm = new Equinix.NetworkEdge.Device("ARUBA-EDGECONNECT-AM", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_CHECKPOINT",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            PurchaseOrderNumber = "PO-Secondary-Account-123",
            AclTemplateId = "XXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "accountKey", "xxxxx" },
                { "accountName", "xxxx" },
                { "applianceTag", "test" },
                { "hostname", "test" },
            },
        },
        Name = "TF_Aruba_Edge_Connect",
        ProjectId = "XXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "EDGECONNECT-SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "EC-V",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.4.2.3",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        InterfaceCount = 32,
        AclTemplateId = "XXXXXXX",
        PurchaseOrderNumber = "PO-Primary-Account-123",
        VendorConfiguration = 
        {
            { "accountKey", "xxxxx" },
            { "accountName", "xxxx" },
            { "applianceTag", "tests" },
            { "hostname", "test" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var arubaEdgeconnectAm = new Device("arubaEdgeconnectAm", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_CHECKPOINT")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .purchaseOrderNumber("PO-Secondary-Account-123")
                .aclTemplateId("XXXXXXX")
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("accountKey", "xxxxx"),
                    Map.entry("accountName", "xxxx"),
                    Map.entry("applianceTag", "test"),
                    Map.entry("hostname", "test")
                ))
                .build())
            .name("TF_Aruba_Edge_Connect")
            .projectId("XXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("EDGECONNECT-SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("EC-V")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.4.2.3")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .interfaceCount(32)
            .aclTemplateId("XXXXXXX")
            .purchaseOrderNumber("PO-Primary-Account-123")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("accountKey", "xxxxx"),
                Map.entry("accountName", "xxxx"),
                Map.entry("applianceTag", "tests"),
                Map.entry("hostname", "test")
            ))
            .build());

    }
}
```
```yaml
resources:
  ARUBA-EDGECONNECT-AM:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_CHECKPOINT
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        purchaseOrderNumber: PO-Secondary-Account-123
        aclTemplateId: XXXXXXX
        notifications:
          - test@eq.com
        vendorConfiguration:
          accountKey: xxxxx
          accountName: xxxx
          applianceTag: test
          hostname: test
      name: TF_Aruba_Edge_Connect
      projectId: XXXXX
      metroCode: ${sv.metroCode}
      typeCode: EDGECONNECT-SDWAN
      selfManaged: true
      byol: true
      packageCode: EC-V
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 9.4.2.3
      coreCount: 2
      termLength: 1
      additionalBandwidth: 50
      interfaceCount: 32
      aclTemplateId: XXXXXXX
      purchaseOrderNumber: PO-Primary-Account-123
      vendorConfiguration:
        accountKey: xxxxx
        accountName: xxxx
        applianceTag: tests
        hostname: test
variables:
  # Create Aruba Edgeconnect SDWAN HA device with 2different account numbers with purchase orders
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example c8000v byol without default password
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const c8000VByolWithtoutDefaultPassword = new equinix.networkedge.Device("c8000v-byol-withtout-default-password", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    generateDefaultPassword: false,
    packageCode: "network-essentials",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
c8000_v_byol_withtout_default_password = equinix.networkedge.Device("c8000v-byol-withtout-default-password",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    generate_default_password=False,
    package_code="network-essentials",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    tier=1,
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
		_, err := networkedge.NewDevice(ctx, "c8000v-byol-withtout-default-password", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:                pulumi.String("C8000V"),
			SelfManaged:             pulumi.Bool(true),
			Byol:                    pulumi.Bool(true),
			GenerateDefaultPassword: pulumi.Bool(false),
			PackageCode:             pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			AclTemplateId:  pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
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

    var c8000VByolWithtoutDefaultPassword = new Equinix.NetworkEdge.Device("c8000v-byol-withtout-default-password", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        GenerateDefaultPassword = false,
        PackageCode = "network-essentials",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
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
            .metroCode("SV")
            .build());

        var c8000VByolWithtoutDefaultPassword = new Device("c8000VByolWithtoutDefaultPassword", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .generateDefaultPassword(false)
            .packageCode("network-essentials")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol-withtout-default-password:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      generateDefaultPassword: false
      packageCode: network-essentials
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      tier: 1
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
variables:
  # Create C8000V BYOL device with bandwidth tier information
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example c8000v byol with bandwidth throughput
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const c8000VByolThroughput = new equinix.networkedge.Device("c8000v-byol-throughput", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    throughput: 100,
    throughputUnit: equinix.networkedge.ThroughputUnit.Mbps,
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
c8000_v_byol_throughput = equinix.networkedge.Device("c8000v-byol-throughput",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    throughput=100,
    throughput_unit=equinix.networkedge.ThroughputUnit.MBPS,
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
		_, err := networkedge.NewDevice(ctx, "c8000v-byol-throughput", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Throughput:     pulumi.Int(100),
			ThroughputUnit: pulumi.String(networkedge.ThroughputUnitMbps),
			AclTemplateId:  pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
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

    var c8000VByolThroughput = new Equinix.NetworkEdge.Device("c8000v-byol-throughput", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Throughput = 100,
        ThroughputUnit = Equinix.NetworkEdge.ThroughputUnit.Mbps,
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
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
            .metroCode("SV")
            .build());

        var c8000VByolThroughput = new Device("c8000VByolThroughput", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .throughput(100)
            .throughputUnit("Mbps")
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol-throughput:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: network-essentials
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      throughput: '100'
      throughputUnit: Mbps
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
variables:
  # Create C8000V BYOL device with numeric bandwidth throughput information
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example c8000v byol with bandwidth tier
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const c8000VByolTier = new equinix.networkedge.Device("c8000v-byol-tier", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
c8000_v_byol_tier = equinix.networkedge.Device("c8000v-byol-tier",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    tier=1,
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
		_, err := networkedge.NewDevice(ctx, "c8000v-byol-tier", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			AclTemplateId:  pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
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

    var c8000VByolTier = new Equinix.NetworkEdge.Device("c8000v-byol-tier", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
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
            .metroCode("SV")
            .build());

        var c8000VByolTier = new Device("c8000VByolTier", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol-tier:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: network-essentials
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      tier: 1
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
variables:
  # Create C8000V BYOL device with bandwidth tier information
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example c8000v ha with cloud init rest api support
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const c8000VByol = new equinix.networkedge.Device("c8000v-byol", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    secondaryDevice: {
        name: "tf-c8000v-byol-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr1000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            restApiSupportRequirement: "true",
        },
        aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    generateDefaultPassword: true,
    packageCode: "network-essentials",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    vendorConfiguration: {
        restApiSupportRequirement: "true",
    },
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
c8000_v_byol = equinix.networkedge.Device("c8000v-byol",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    secondary_device={
        "name": "tf-c8000v-byol-secondary",
        "metro_code": sv.metro_code,
        "hostname": "csr1000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "restApiSupportRequirement": "true",
        },
        "acl_template_id": "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    generate_default_password=True,
    package_code="network-essentials",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    tier=1,
    vendor_configuration={
        "restApiSupportRequirement": "true",
    },
    acl_template_id="0bff6e05-f0e7-44cd-804a-25b92b835f8b")
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
		_, err := networkedge.NewDevice(ctx, "c8000v-byol", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-c8000v-byol-secondary"),
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
				VendorConfiguration: pulumi.StringMap{
					"restApiSupportRequirement": pulumi.String("true"),
				},
				AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:                pulumi.String("C8000V"),
			SelfManaged:             pulumi.Bool(true),
			Byol:                    pulumi.Bool(true),
			GenerateDefaultPassword: pulumi.Bool(true),
			PackageCode:             pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"restApiSupportRequirement": pulumi.String("true"),
			},
			AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
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

    var c8000VByol = new Equinix.NetworkEdge.Device("c8000v-byol", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-c8000v-byol-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "csr1000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "restApiSupportRequirement", "true" },
            },
            AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        GenerateDefaultPassword = true,
        PackageCode = "network-essentials",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        VendorConfiguration = 
        {
            { "restApiSupportRequirement", "true" },
        },
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
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
            .metroCode("SV")
            .build());

        var c8000VByol = new Device("c8000VByol", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-c8000v-byol-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("csr1000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.of("restApiSupportRequirement", "true"))
                .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .generateDefaultPassword(true)
            .packageCode("network-essentials")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .vendorConfiguration(Map.of("restApiSupportRequirement", "true"))
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      secondaryDevice:
        name: tf-c8000v-byol-secondary
        metroCode: ${sv.metroCode}
        hostname: csr1000v-s
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          restApiSupportRequirement: 'true'
        aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      generateDefaultPassword: true
      packageCode: network-essentials
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      tier: 1
      vendorConfiguration:
        restApiSupportRequirement: 'true'
      aclTemplateId: 0bff6e05-f0e7-44cd-804a-25b92b835f8b
variables:
  # Create C8000V HA - BYOL device with cloud init rest api support
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example c8000v znpd ha dhcp
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const c8000VByol = new equinix.networkedge.Device("c8000v-byol", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    secondaryDevice: {
        name: "tf-c8000v-byol-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "c8000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            restApiSupportRequirement: "true",
            ipAddressType: "DHCP",
            managementInterfaceId: "6",
        },
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    connectivity: "PRIVATE",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    vendorConfiguration: {
        restApiSupportRequirement: "true",
        ipAddressType: "DHCP",
        managementInterfaceId: "6",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
c8000_v_byol = equinix.networkedge.Device("c8000v-byol",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    secondary_device={
        "name": "tf-c8000v-byol-secondary",
        "metro_code": sv.metro_code,
        "hostname": "c8000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "restApiSupportRequirement": "true",
            "ipAddressType": "DHCP",
            "managementInterfaceId": "6",
        },
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    connectivity="PRIVATE",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    tier=1,
    vendor_configuration={
        "restApiSupportRequirement": "true",
        "ipAddressType": "DHCP",
        "managementInterfaceId": "6",
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
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "c8000v-byol", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-c8000v-byol-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("c8000v-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"restApiSupportRequirement": pulumi.String("true"),
					"ipAddressType":             pulumi.String("DHCP"),
					"managementInterfaceId":     pulumi.String("6"),
				},
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("C8000V"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("network-essentials"),
			Connectivity: pulumi.String("PRIVATE"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"restApiSupportRequirement": pulumi.String("true"),
				"ipAddressType":             pulumi.String("DHCP"),
				"managementInterfaceId":     pulumi.String("6"),
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
        Name = "account-name",
    });

    var c8000VByol = new Equinix.NetworkEdge.Device("c8000v-byol", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-c8000v-byol-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "c8000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "restApiSupportRequirement", "true" },
                { "ipAddressType", "DHCP" },
                { "managementInterfaceId", "6" },
            },
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Connectivity = "PRIVATE",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        VendorConfiguration = 
        {
            { "restApiSupportRequirement", "true" },
            { "ipAddressType", "DHCP" },
            { "managementInterfaceId", "6" },
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
            .metroCode("SV")
            .name("account-name")
            .build());

        var c8000VByol = new Device("c8000VByol", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-c8000v-byol-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("c8000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("restApiSupportRequirement", "true"),
                    Map.entry("ipAddressType", "DHCP"),
                    Map.entry("managementInterfaceId", "6")
                ))
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .connectivity("PRIVATE")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("restApiSupportRequirement", "true"),
                Map.entry("ipAddressType", "DHCP"),
                Map.entry("managementInterfaceId", "6")
            ))
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      secondaryDevice:
        name: tf-c8000v-byol-secondary
        metroCode: ${sv.metroCode}
        hostname: c8000v-s
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          restApiSupportRequirement: 'true'
          ipAddressType: DHCP
          managementInterfaceId: '6'
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: network-essentials
      connectivity: PRIVATE
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      tier: 1
      vendorConfiguration:
        restApiSupportRequirement: 'true'
        ipAddressType: DHCP
        managementInterfaceId: '6'
variables:
  # Create C8000V HA - BYOL device with connectivity PRIVATE with DHCP IP address type
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example c8000v znpd ha no ip address
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const c8000VByol = new equinix.networkedge.Device("c8000v-byol", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    secondaryDevice: {
        name: "tf-c8000v-byol-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr8000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            restApiSupportRequirement: "true",
            ipAddressType: "NO_IP_ADDRESS",
        },
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    connectivity: "PRIVATE",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    vendorConfiguration: {
        restApiSupportRequirement: "true",
        ipAddressType: "NO_IP_ADDRESS",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
c8000_v_byol = equinix.networkedge.Device("c8000v-byol",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    secondary_device={
        "name": "tf-c8000v-byol-secondary",
        "metro_code": sv.metro_code,
        "hostname": "csr8000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "restApiSupportRequirement": "true",
            "ipAddressType": "NO_IP_ADDRESS",
        },
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    connectivity="PRIVATE",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    tier=1,
    vendor_configuration={
        "restApiSupportRequirement": "true",
        "ipAddressType": "NO_IP_ADDRESS",
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
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "c8000v-byol", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-c8000v-byol-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("csr8000v-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"restApiSupportRequirement": pulumi.String("true"),
					"ipAddressType":             pulumi.String("NO_IP_ADDRESS"),
				},
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("C8000V"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("network-essentials"),
			Connectivity: pulumi.String("PRIVATE"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"restApiSupportRequirement": pulumi.String("true"),
				"ipAddressType":             pulumi.String("NO_IP_ADDRESS"),
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
        Name = "account-name",
    });

    var c8000VByol = new Equinix.NetworkEdge.Device("c8000v-byol", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-c8000v-byol-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "csr8000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "restApiSupportRequirement", "true" },
                { "ipAddressType", "NO_IP_ADDRESS" },
            },
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Connectivity = "PRIVATE",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        VendorConfiguration = 
        {
            { "restApiSupportRequirement", "true" },
            { "ipAddressType", "NO_IP_ADDRESS" },
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
            .metroCode("SV")
            .name("account-name")
            .build());

        var c8000VByol = new Device("c8000VByol", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-c8000v-byol-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("csr8000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("restApiSupportRequirement", "true"),
                    Map.entry("ipAddressType", "NO_IP_ADDRESS")
                ))
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .connectivity("PRIVATE")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("restApiSupportRequirement", "true"),
                Map.entry("ipAddressType", "NO_IP_ADDRESS")
            ))
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      secondaryDevice:
        name: tf-c8000v-byol-secondary
        metroCode: ${sv.metroCode}
        hostname: csr8000v-s
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          restApiSupportRequirement: 'true'
          ipAddressType: NO_IP_ADDRESS
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: network-essentials
      connectivity: PRIVATE
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      tier: 1
      vendorConfiguration:
        restApiSupportRequirement: 'true'
        ipAddressType: NO_IP_ADDRESS
variables:
  # Create C8000V HA - BYOL device with connectivity PRIVATE with NO IP address type
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example c8000v znpd ha static
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const c8000VByol = new equinix.networkedge.Device("c8000v-byol", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    secondaryDevice: {
        name: "tf-c8000v-byol-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr8000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            restApiSupportRequirement: "true",
            ipAddressType: "STATIC",
            ipAddress: "x.x.x.x",
            gatewayIp: "x.x.x.x",
            subnetMaskIp: "x.x.x.x",
            managementInterfaceId: "6",
        },
    },
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    connectivity: "PRIVATE",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    vendorConfiguration: {
        restApiSupportRequirement: "true",
        ipAddressType: "STATIC",
        ipAddress: "x.x.x.x",
        gatewayIp: "x.x.x.x",
        subnetMaskIp: "x.x.x.x",
        managementInterfaceId: "6",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
c8000_v_byol = equinix.networkedge.Device("c8000v-byol",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    secondary_device={
        "name": "tf-c8000v-byol-secondary",
        "metro_code": sv.metro_code,
        "hostname": "csr8000v-s",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "restApiSupportRequirement": "true",
            "ipAddressType": "STATIC",
            "ipAddress": "x.x.x.x",
            "gatewayIp": "x.x.x.x",
            "subnetMaskIp": "x.x.x.x",
            "managementInterfaceId": "6",
        },
    },
    name="tf-c8000v-byol",
    metro_code=sv.metro_code,
    type_code="C8000V",
    self_managed=True,
    byol=True,
    package_code="network-essentials",
    connectivity="PRIVATE",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="17.11.01a",
    interface_count=10,
    core_count=2,
    tier=1,
    vendor_configuration={
        "restApiSupportRequirement": "true",
        "ipAddressType": "STATIC",
        "ipAddress": "x.x.x.x",
        "gatewayIp": "x.x.x.x",
        "subnetMaskIp": "x.x.x.x",
        "managementInterfaceId": "6",
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
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "c8000v-byol", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-c8000v-byol-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("csr8000v-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"restApiSupportRequirement": pulumi.String("true"),
					"ipAddressType":             pulumi.String("STATIC"),
					"ipAddress":                 pulumi.String("x.x.x.x"),
					"gatewayIp":                 pulumi.String("x.x.x.x"),
					"subnetMaskIp":              pulumi.String("x.x.x.x"),
					"managementInterfaceId":     pulumi.String("6"),
				},
			},
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("C8000V"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("network-essentials"),
			Connectivity: pulumi.String("PRIVATE"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"restApiSupportRequirement": pulumi.String("true"),
				"ipAddressType":             pulumi.String("STATIC"),
				"ipAddress":                 pulumi.String("x.x.x.x"),
				"gatewayIp":                 pulumi.String("x.x.x.x"),
				"subnetMaskIp":              pulumi.String("x.x.x.x"),
				"managementInterfaceId":     pulumi.String("6"),
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
        Name = "account-name",
    });

    var c8000VByol = new Equinix.NetworkEdge.Device("c8000v-byol", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "tf-c8000v-byol-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "csr8000v-s",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "restApiSupportRequirement", "true" },
                { "ipAddressType", "STATIC" },
                { "ipAddress", "x.x.x.x" },
                { "gatewayIp", "x.x.x.x" },
                { "subnetMaskIp", "x.x.x.x" },
                { "managementInterfaceId", "6" },
            },
        },
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = "network-essentials",
        Connectivity = "PRIVATE",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Tier = 1,
        VendorConfiguration = 
        {
            { "restApiSupportRequirement", "true" },
            { "ipAddressType", "STATIC" },
            { "ipAddress", "x.x.x.x" },
            { "gatewayIp", "x.x.x.x" },
            { "subnetMaskIp", "x.x.x.x" },
            { "managementInterfaceId", "6" },
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
            .metroCode("SV")
            .name("account-name")
            .build());

        var c8000VByol = new Device("c8000VByol", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-c8000v-byol-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("csr8000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("restApiSupportRequirement", "true"),
                    Map.entry("ipAddressType", "STATIC"),
                    Map.entry("ipAddress", "x.x.x.x"),
                    Map.entry("gatewayIp", "x.x.x.x"),
                    Map.entry("subnetMaskIp", "x.x.x.x"),
                    Map.entry("managementInterfaceId", "6")
                ))
                .build())
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .connectivity("PRIVATE")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("restApiSupportRequirement", "true"),
                Map.entry("ipAddressType", "STATIC"),
                Map.entry("ipAddress", "x.x.x.x"),
                Map.entry("gatewayIp", "x.x.x.x"),
                Map.entry("subnetMaskIp", "x.x.x.x"),
                Map.entry("managementInterfaceId", "6")
            ))
            .build());

    }
}
```
```yaml
resources:
  c8000v-byol:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      secondaryDevice:
        name: tf-c8000v-byol-secondary
        metroCode: ${sv.metroCode}
        hostname: csr8000v-s
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          restApiSupportRequirement: 'true'
          ipAddressType: STATIC
          ipAddress: x.x.x.x
          gatewayIp: x.x.x.x
          subnetMaskIp: x.x.x.x
          managementInterfaceId: '6'
      name: tf-c8000v-byol
      metroCode: ${sv.metroCode}
      typeCode: C8000V
      selfManaged: true
      byol: true
      packageCode: network-essentials
      connectivity: PRIVATE
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 17.11.01a
      interfaceCount: 10
      coreCount: 2
      tier: 1
      vendorConfiguration:
        restApiSupportRequirement: 'true'
        ipAddressType: STATIC
        ipAddress: x.x.x.x
        gatewayIp: x.x.x.x
        subnetMaskIp: x.x.x.x
        managementInterfaceId: '6'
variables:
  # Create C8000V HA - BYOL device with connectivity PRIVATE with static IP address type
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example checkpoint single device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const checkpointSv = new equinix.networkedge.Device("CHECKPOINT-SV", {
    sshKey: {
        username: "XXXXX",
        keyName: "XXXXXX",
    },
    name: "TF_CHECKPOINT",
    projectId: "XXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "CGUARD",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "R81.20",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 5,
    aclTemplateId: "XXXXXXX",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
checkpoint_sv = equinix.networkedge.Device("CHECKPOINT-SV",
    ssh_key={
        "username": "XXXXX",
        "key_name": "XXXXXX",
    },
    name="TF_CHECKPOINT",
    project_id="XXXX",
    metro_code=sv.metro_code,
    type_code="CGUARD",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="R81.20",
    hostname="test",
    core_count=2,
    term_length=1,
    additional_bandwidth=5,
    acl_template_id="XXXXXXX")
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
		_, err := networkedge.NewDevice(ctx, "CHECKPOINT-SV", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("XXXXX"),
				KeyName:  pulumi.String("XXXXXX"),
			},
			Name:      pulumi.String("TF_CHECKPOINT"),
			ProjectId: pulumi.String("XXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("CGUARD"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("R81.20"),
			Hostname:            pulumi.String("test"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(5),
			AclTemplateId:       pulumi.String("XXXXXXX"),
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

    var checkpointSv = new Equinix.NetworkEdge.Device("CHECKPOINT-SV", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "XXXXX",
            KeyName = "XXXXXX",
        },
        Name = "TF_CHECKPOINT",
        ProjectId = "XXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "CGUARD",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "R81.20",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 5,
        AclTemplateId = "XXXXXXX",
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
            .metroCode("SV")
            .build());

        var checkpointSv = new Device("checkpointSv", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("XXXXX")
                .keyName("XXXXXX")
                .build())
            .name("TF_CHECKPOINT")
            .projectId("XXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("CGUARD")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("R81.20")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(5)
            .aclTemplateId("XXXXXXX")
            .build());

    }
}
```
```yaml
resources:
  CHECKPOINT-SV:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: XXXXX
        keyName: XXXXXX
      name: TF_CHECKPOINT
      projectId: XXXX
      metroCode: ${sv.metroCode}
      typeCode: CGUARD
      selfManaged: true
      byol: true
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: R81.20
      hostname: test
      coreCount: 2
      termLength: 1
      additionalBandwidth: 5
      aclTemplateId: XXXXXXX
variables:
  # Create Checkpoint single device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example cisco ftd cluster znpd
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const ciscoFtdSv = new equinix.networkedge.Device("Cisco-FTD-SV", {
    clusterDetails: {
        node0: {
            vendorConfiguration: {
                hostname: "test",
                activationKey: "XXXXX",
                controller1: "X.X.X.X",
                managementType: "FMC",
            },
        },
        node1: {
            vendorConfiguration: {
                hostname: "test",
                managementType: "FMC",
            },
        },
        clusterName: "tf-ftd-cluster",
    },
    name: "TF_Cisco_NGFW_CLUSTER_ZNPD",
    projectId: "XXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "Cisco_NGFW",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "FTDv10",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.0.4-55",
    hostname: "test",
    coreCount: 4,
    termLength: 1,
    interfaceCount: 10,
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
cisco_ftd_sv = equinix.networkedge.Device("Cisco-FTD-SV",
    cluster_details={
        "node0": {
            "vendor_configuration": {
                "hostname": "test",
                "activation_key": "XXXXX",
                "controller1": "X.X.X.X",
                "management_type": "FMC",
            },
        },
        "node1": {
            "vendor_configuration": {
                "hostname": "test",
                "management_type": "FMC",
            },
        },
        "cluster_name": "tf-ftd-cluster",
    },
    name="TF_Cisco_NGFW_CLUSTER_ZNPD",
    project_id="XXXXXXX",
    metro_code=sv.metro_code,
    type_code="Cisco_NGFW",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="FTDv10",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.0.4-55",
    hostname="test",
    core_count=4,
    term_length=1,
    interface_count=10)
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
		_, err := networkedge.NewDevice(ctx, "Cisco-FTD-SV", &networkedge.DeviceArgs{
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						Hostname:       pulumi.String("test"),
						ActivationKey:  pulumi.String("XXXXX"),
						Controller1:    pulumi.String("X.X.X.X"),
						ManagementType: pulumi.String("FMC"),
					},
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						Hostname:       pulumi.String("test"),
						ManagementType: pulumi.String("FMC"),
					},
				},
				ClusterName: pulumi.String("tf-ftd-cluster"),
			},
			Name:      pulumi.String("TF_Cisco_NGFW_CLUSTER_ZNPD"),
			ProjectId: pulumi.String("XXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("Cisco_NGFW"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("FTDv10"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("7.0.4-55"),
			Hostname:       pulumi.String("test"),
			CoreCount:      pulumi.Int(4),
			TermLength:     pulumi.Int(1),
			InterfaceCount: pulumi.Int(10),
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

    var ciscoFtdSv = new Equinix.NetworkEdge.Device("Cisco-FTD-SV", new()
    {
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    Hostname = "test",
                    ActivationKey = "XXXXX",
                    Controller1 = "X.X.X.X",
                    ManagementType = "FMC",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    Hostname = "test",
                    ManagementType = "FMC",
                },
            },
            ClusterName = "tf-ftd-cluster",
        },
        Name = "TF_Cisco_NGFW_CLUSTER_ZNPD",
        ProjectId = "XXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "Cisco_NGFW",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "FTDv10",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.0.4-55",
        Hostname = "test",
        CoreCount = 4,
        TermLength = 1,
        InterfaceCount = 10,
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

        var ciscoFtdSv = new Device("ciscoFtdSv", DeviceArgs.builder()
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .hostname("test")
                        .activationKey("XXXXX")
                        .controller1("X.X.X.X")
                        .managementType("FMC")
                        .build())
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .hostname("test")
                        .managementType("FMC")
                        .build())
                    .build())
                .clusterName("tf-ftd-cluster")
                .build())
            .name("TF_Cisco_NGFW_CLUSTER_ZNPD")
            .projectId("XXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("Cisco_NGFW")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("FTDv10")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.0.4-55")
            .hostname("test")
            .coreCount(4)
            .termLength(1)
            .interfaceCount(10)
            .build());

    }
}
```
```yaml
resources:
  cisco-FTD-SV:
    type: equinix:networkedge:Device
    name: Cisco-FTD-SV
    properties:
      clusterDetails:
        node0:
          vendorConfiguration:
            hostname: test
            activationKey: XXXXX
            controller1: X.X.X.X
            managementType: FMC
        node1:
          vendorConfiguration:
            hostname: test
            managementType: FMC
        clusterName: tf-ftd-cluster
      name: TF_Cisco_NGFW_CLUSTER_ZNPD
      projectId: XXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: Cisco_NGFW
      selfManaged: true
      connectivity: PRIVATE
      byol: true
      packageCode: FTDv10
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 7.0.4-55
      hostname: test
      coreCount: 4
      termLength: 1
      interfaceCount: 10
variables:
  # Create Cisco FTD Cluster with Connectivity- PRIVATE
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example f5xc single
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const f5XcSingle = new equinix.networkedge.Device("f5xc-single", {
    name: "tf-f5xc",
    projectId: "XXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "F5XC",
    selfManaged: true,
    byol: true,
    connectivity: "INTERNET-ACCESS",
    packageCode: "STD",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 1,
    accountNumber: sv.apply(sv => sv.number),
    aclTemplateId: "xxxx",
    version: "9.2025.17",
    interfaceCount: 8,
    coreCount: 8,
    vendorConfiguration: {
        token: "XXXXXXXXXX",
        hostname: "XXXX",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
f5_xc_single = equinix.networkedge.Device("f5xc-single",
    name="tf-f5xc",
    project_id="XXXXXX",
    metro_code=sv.metro_code,
    type_code="F5XC",
    self_managed=True,
    byol=True,
    connectivity="INTERNET-ACCESS",
    package_code="STD",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=1,
    account_number=sv.number,
    acl_template_id="xxxx",
    version="9.2025.17",
    interface_count=8,
    core_count=8,
    vendor_configuration={
        "token": "XXXXXXXXXX",
        "hostname": "XXXX",
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
		_, err := networkedge.NewDevice(ctx, "f5xc-single", &networkedge.DeviceArgs{
			Name:      pulumi.String("tf-f5xc"),
			ProjectId: pulumi.String("XXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("F5XC"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("INTERNET-ACCESS"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(1),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			AclTemplateId:  pulumi.String("xxxx"),
			Version:        pulumi.String("9.2025.17"),
			InterfaceCount: pulumi.Int(8),
			CoreCount:      pulumi.Int(8),
			VendorConfiguration: pulumi.StringMap{
				"token":    pulumi.String("XXXXXXXXXX"),
				"hostname": pulumi.String("XXXX"),
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

    var f5XcSingle = new Equinix.NetworkEdge.Device("f5xc-single", new()
    {
        Name = "tf-f5xc",
        ProjectId = "XXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "F5XC",
        SelfManaged = true,
        Byol = true,
        Connectivity = "INTERNET-ACCESS",
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 1,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        AclTemplateId = "xxxx",
        Version = "9.2025.17",
        InterfaceCount = 8,
        CoreCount = 8,
        VendorConfiguration = 
        {
            { "token", "XXXXXXXXXX" },
            { "hostname", "XXXX" },
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

        var f5XcSingle = new Device("f5XcSingle", DeviceArgs.builder()
            .name("tf-f5xc")
            .projectId("XXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("F5XC")
            .selfManaged(true)
            .byol(true)
            .connectivity("INTERNET-ACCESS")
            .packageCode("STD")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(1)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .aclTemplateId("xxxx")
            .version("9.2025.17")
            .interfaceCount(8)
            .coreCount(8)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("token", "XXXXXXXXXX"),
                Map.entry("hostname", "XXXX")
            ))
            .build());

    }
}
```
```yaml
resources:
  f5xc-single:
    type: equinix:networkedge:Device
    properties:
      name: tf-f5xc
      projectId: XXXXXX
      metroCode: ${sv.metroCode}
      typeCode: F5XC
      selfManaged: true
      byol: true
      connectivity: INTERNET-ACCESS
      packageCode: STD
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 1
      accountNumber: ${sv.number}
      aclTemplateId: xxxx
      version: 9.2025.17
      interfaceCount: 8
      coreCount: 8
      vendorConfiguration:
        token: XXXXXXXXXX
        hostname: XXXX
variables:
  # Create F5XC device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example fortigate firewall cluster device znpd static ip
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const fgvmSv = new equinix.networkedge.Device("FGVM-SV", {
    sshKey: {
        username: "sanity1",
        keyName: "",
    },
    clusterDetails: {
        node0: {
            vendorConfiguration: {
                ipAddress: "x.x.x.x",
                subnetMaskIp: "x.x.x.x",
                gatewayIp: "x.x.x.x",
                managementInterfaceId: "5",
                hostname: "test",
                ipAddressType: "STATIC",
            },
        },
        node1: {
            vendorConfiguration: {
                ipAddress: "x.x.x.x",
                subnetMaskIp: "x.x.x.x",
                gatewayIp: "x.x.x.x",
                managementInterfaceId: "5",
                hostname: "test",
                ipAddressType: "STATIC",
            },
        },
        clusterName: "tf-fgvm--cluster",
    },
    name: "tf-fgvm-cluster-static-znpd",
    metroCode: "DC",
    typeCode: "FG-VM",
    projectId: "xxxxxxx",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "VM02",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: xxxxxx,
    version: "7.6.2",
    interfaceCount: 10,
    coreCount: 2,
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
fgvm_sv = equinix.networkedge.Device("FGVM-SV",
    ssh_key={
        "username": "sanity1",
        "key_name": "",
    },
    cluster_details={
        "node0": {
            "vendor_configuration": {
                "ip_address": "x.x.x.x",
                "subnet_mask_ip": "x.x.x.x",
                "gateway_ip": "x.x.x.x",
                "management_interface_id": "5",
                "hostname": "test",
                "ip_address_type": "STATIC",
            },
        },
        "node1": {
            "vendor_configuration": {
                "ip_address": "x.x.x.x",
                "subnet_mask_ip": "x.x.x.x",
                "gateway_ip": "x.x.x.x",
                "management_interface_id": "5",
                "hostname": "test",
                "ip_address_type": "STATIC",
            },
        },
        "cluster_name": "tf-fgvm--cluster",
    },
    name="tf-fgvm-cluster-static-znpd",
    metro_code="DC",
    type_code="FG-VM",
    project_id="xxxxxxx",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="VM02",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=xxxxxx,
    version="7.6.2",
    interface_count=10,
    core_count=2)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_ = networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "FGVM-SV", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("sanity1"),
				KeyName:  pulumi.String(""),
			},
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						IpAddress:             pulumi.String("x.x.x.x"),
						SubnetMaskIp:          pulumi.String("x.x.x.x"),
						GatewayIp:             pulumi.String("x.x.x.x"),
						ManagementInterfaceId: pulumi.String("5"),
						Hostname:              pulumi.String("test"),
						IpAddressType:         pulumi.String("STATIC"),
					},
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						IpAddress:             pulumi.String("x.x.x.x"),
						SubnetMaskIp:          pulumi.String("x.x.x.x"),
						GatewayIp:             pulumi.String("x.x.x.x"),
						ManagementInterfaceId: pulumi.String("5"),
						Hostname:              pulumi.String("test"),
						IpAddressType:         pulumi.String("STATIC"),
					},
				},
				ClusterName: pulumi.String("tf-fgvm--cluster"),
			},
			Name:         pulumi.String("tf-fgvm-cluster-static-znpd"),
			MetroCode:    pulumi.String("DC"),
			TypeCode:     pulumi.String("FG-VM"),
			ProjectId:    pulumi.String("xxxxxxx"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength:     pulumi.Int(12),
			AccountNumber:  pulumi.Any(xxxxxx),
			Version:        pulumi.String("7.6.2"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
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
        Name = "account-name",
    });

    var fgvmSv = new Equinix.NetworkEdge.Device("FGVM-SV", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "sanity1",
            KeyName = "",
        },
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    IpAddress = "x.x.x.x",
                    SubnetMaskIp = "x.x.x.x",
                    GatewayIp = "x.x.x.x",
                    ManagementInterfaceId = "5",
                    Hostname = "test",
                    IpAddressType = "STATIC",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    IpAddress = "x.x.x.x",
                    SubnetMaskIp = "x.x.x.x",
                    GatewayIp = "x.x.x.x",
                    ManagementInterfaceId = "5",
                    Hostname = "test",
                    IpAddressType = "STATIC",
                },
            },
            ClusterName = "tf-fgvm--cluster",
        },
        Name = "tf-fgvm-cluster-static-znpd",
        MetroCode = "DC",
        TypeCode = "FG-VM",
        ProjectId = "xxxxxxx",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "VM02",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = xxxxxx,
        Version = "7.6.2",
        InterfaceCount = 10,
        CoreCount = 2,
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
            .name("account-name")
            .build());

        var fgvmSv = new Device("fgvmSv", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("sanity1")
                .keyName("")
                .build())
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .ipAddress("x.x.x.x")
                        .subnetMaskIp("x.x.x.x")
                        .gatewayIp("x.x.x.x")
                        .managementInterfaceId("5")
                        .hostname("test")
                        .ipAddressType("STATIC")
                        .build())
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .ipAddress("x.x.x.x")
                        .subnetMaskIp("x.x.x.x")
                        .gatewayIp("x.x.x.x")
                        .managementInterfaceId("5")
                        .hostname("test")
                        .ipAddressType("STATIC")
                        .build())
                    .build())
                .clusterName("tf-fgvm--cluster")
                .build())
            .name("tf-fgvm-cluster-static-znpd")
            .metroCode("DC")
            .typeCode("FG-VM")
            .projectId("xxxxxxx")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("VM02")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(xxxxxx)
            .version("7.6.2")
            .interfaceCount(10)
            .coreCount(2)
            .build());

    }
}
```
```yaml
resources:
  FGVM-SV:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: sanity1
        keyName: ""
      clusterDetails:
        node0:
          vendorConfiguration:
            ipAddress: x.x.x.x
            subnetMaskIp: x.x.x.x
            gatewayIp: x.x.x.x
            managementInterfaceId: '5'
            hostname: test
            ipAddressType: STATIC
        node1:
          vendorConfiguration:
            ipAddress: x.x.x.x
            subnetMaskIp: x.x.x.x
            gatewayIp: x.x.x.x
            managementInterfaceId: '5'
            hostname: test
            ipAddressType: STATIC
        clusterName: tf-fgvm--cluster
      name: tf-fgvm-cluster-static-znpd
      metroCode: DC
      typeCode: FG-VM
      projectId: xxxxxxx
      selfManaged: true
      connectivity: PRIVATE
      byol: true
      packageCode: VM02
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${xxxxxx}
      version: 7.6.2
      interfaceCount: 10
      coreCount: 2
variables:
  # Create FG VM Cluster with connectivity PRIVATE and IP Address Type as STATIC
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example fortigate firewall ha device znpd dhcp
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const ftntFirewallSv = new equinix.networkedge.Device("FTNT-FIREWALL-SV", {
    secondaryDevice: {
        name: "TF_FTNT-FIREWALL-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "fg-vm-znpd",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            ipAddressType: "DHCP",
            managementInterfaceId: "6",
        },
    },
    name: "TF_FTNT-FIREWALL",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "FG-VM",
    selfManaged: true,
    byol: true,
    interfaceCount: 10,
    connectivity: "PRIVATE",
    packageCode: "VM02",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.6.3",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        ipAddressType: "DHCP",
        managementInterfaceId: "6",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
ftnt_firewall_sv = equinix.networkedge.Device("FTNT-FIREWALL-SV",
    secondary_device={
        "name": "TF_FTNT-FIREWALL-secondary",
        "metro_code": sv.metro_code,
        "hostname": "fg-vm-znpd",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "ipAddressType": "DHCP",
            "managementInterfaceId": "6",
        },
    },
    name="TF_FTNT-FIREWALL",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="FG-VM",
    self_managed=True,
    byol=True,
    interface_count=10,
    connectivity="PRIVATE",
    package_code="VM02",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.6.3",
    hostname="test",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "ipAddressType": "DHCP",
        "managementInterfaceId": "6",
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
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "FTNT-FIREWALL-SV", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_FTNT-FIREWALL-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("fg-vm-znpd"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"ipAddressType":         pulumi.String("DHCP"),
					"managementInterfaceId": pulumi.String("6"),
				},
			},
			Name:      pulumi.String("TF_FTNT-FIREWALL"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:       pulumi.String("FG-VM"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			InterfaceCount: pulumi.Int(10),
			Connectivity:   pulumi.String("PRIVATE"),
			PackageCode:    pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("7.6.3"),
			Hostname:   pulumi.String("test"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"ipAddressType":         pulumi.String("DHCP"),
				"managementInterfaceId": pulumi.String("6"),
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
        Name = "account-name",
    });

    var ftntFirewallSv = new Equinix.NetworkEdge.Device("FTNT-FIREWALL-SV", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_FTNT-FIREWALL-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "fg-vm-znpd",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "ipAddressType", "DHCP" },
                { "managementInterfaceId", "6" },
            },
        },
        Name = "TF_FTNT-FIREWALL",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "FG-VM",
        SelfManaged = true,
        Byol = true,
        InterfaceCount = 10,
        Connectivity = "PRIVATE",
        PackageCode = "VM02",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.6.3",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "ipAddressType", "DHCP" },
            { "managementInterfaceId", "6" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .name("account-name")
            .build());

        var ftntFirewallSv = new Device("ftntFirewallSv", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_FTNT-FIREWALL-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("fg-vm-znpd")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("ipAddressType", "DHCP"),
                    Map.entry("managementInterfaceId", "6")
                ))
                .build())
            .name("TF_FTNT-FIREWALL")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("FG-VM")
            .selfManaged(true)
            .byol(true)
            .interfaceCount(10)
            .connectivity("PRIVATE")
            .packageCode("VM02")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.6.3")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("ipAddressType", "DHCP"),
                Map.entry("managementInterfaceId", "6")
            ))
            .build());

    }
}
```
```yaml
resources:
  FTNT-FIREWALL-SV:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_FTNT-FIREWALL-secondary
        metroCode: ${sv.metroCode}
        hostname: fg-vm-znpd
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          ipAddressType: DHCP
          managementInterfaceId: '6'
      name: TF_FTNT-FIREWALL
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: FG-VM
      selfManaged: true
      byol: true
      interfaceCount: 10
      connectivity: PRIVATE
      packageCode: VM02
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 7.6.3
      hostname: test
      coreCount: 2
      termLength: 1
      vendorConfiguration:
        ipAddressType: DHCP
        managementInterfaceId: '6'
variables:
  # Create Fortinet VM firewall ha device with connectivity PRIVATE and IP Address Type as DHCP
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example fortigate firewall ha device znpd no ip
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const ftntFirewallSv = new equinix.networkedge.Device("FTNT-FIREWALL-SV", {
    secondaryDevice: {
        name: "TF_FTNT-FIREWALL-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "fg-vm-znpd",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            ipAddressType: "NO_IP_ADDRESS",
        },
    },
    name: "TF_FTNT-FIREWALL",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "FG-VM",
    interfaceCount: 10,
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "VM02",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.6.3",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        ipAddressType: "NO_IP_ADDRESS",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
ftnt_firewall_sv = equinix.networkedge.Device("FTNT-FIREWALL-SV",
    secondary_device={
        "name": "TF_FTNT-FIREWALL-secondary",
        "metro_code": sv.metro_code,
        "hostname": "fg-vm-znpd",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "ipAddressType": "NO_IP_ADDRESS",
        },
    },
    name="TF_FTNT-FIREWALL",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="FG-VM",
    interface_count=10,
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="VM02",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.6.3",
    hostname="test",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "ipAddressType": "NO_IP_ADDRESS",
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
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "FTNT-FIREWALL-SV", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_FTNT-FIREWALL-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("fg-vm-znpd"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"ipAddressType": pulumi.String("NO_IP_ADDRESS"),
				},
			},
			Name:      pulumi.String("TF_FTNT-FIREWALL"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:       pulumi.String("FG-VM"),
			InterfaceCount: pulumi.Int(10),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			Connectivity:   pulumi.String("PRIVATE"),
			PackageCode:    pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("7.6.3"),
			Hostname:   pulumi.String("test"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"ipAddressType": pulumi.String("NO_IP_ADDRESS"),
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
        Name = "account-name",
    });

    var ftntFirewallSv = new Equinix.NetworkEdge.Device("FTNT-FIREWALL-SV", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_FTNT-FIREWALL-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "fg-vm-znpd",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "ipAddressType", "NO_IP_ADDRESS" },
            },
        },
        Name = "TF_FTNT-FIREWALL",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "FG-VM",
        InterfaceCount = 10,
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "VM02",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.6.3",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "ipAddressType", "NO_IP_ADDRESS" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .name("account-name")
            .build());

        var ftntFirewallSv = new Device("ftntFirewallSv", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_FTNT-FIREWALL-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("fg-vm-znpd")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.of("ipAddressType", "NO_IP_ADDRESS"))
                .build())
            .name("TF_FTNT-FIREWALL")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("FG-VM")
            .interfaceCount(10)
            .selfManaged(true)
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("VM02")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.6.3")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.of("ipAddressType", "NO_IP_ADDRESS"))
            .build());

    }
}
```
```yaml
resources:
  FTNT-FIREWALL-SV:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_FTNT-FIREWALL-secondary
        metroCode: ${sv.metroCode}
        hostname: fg-vm-znpd
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          ipAddressType: NO_IP_ADDRESS
      name: TF_FTNT-FIREWALL
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: FG-VM
      interfaceCount: 10
      selfManaged: true
      byol: true
      connectivity: PRIVATE
      packageCode: VM02
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 7.6.3
      hostname: test
      coreCount: 2
      termLength: 1
      vendorConfiguration:
        ipAddressType: NO_IP_ADDRESS
variables:
  # Create Fortinet firewall ha device with connectivity PRIVATE and IP Address Type as NO IP Address
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example fortigate firewall ha device znpd static
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const ftntFirewallSv = new equinix.networkedge.Device("FTNT-FIREWALL-SV", {
    secondaryDevice: {
        name: "TF_FTNT-FIREWALL-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "fg-vm-znpd",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            gatewayIp: "X.X.X.X",
            ipAddress: "X.X.X.X",
            ipAddressType: "STATIC",
            subnetMaskIp: "X.X.X.X",
            managementInterfaceId: "6",
        },
    },
    name: "TF_FTNT-FIREWALL",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    interfaceCount: 10,
    typeCode: "FG-VM",
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "VM02",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.6.3",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        gatewayIp: "X.X.X.X",
        ipAddress: "X.X.X.X",
        ipAddressType: "STATIC",
        subnetMaskIp: "x.x.x.x",
        managementInterfaceId: "6",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV",
    name="account-name")
ftnt_firewall_sv = equinix.networkedge.Device("FTNT-FIREWALL-SV",
    secondary_device={
        "name": "TF_FTNT-FIREWALL-secondary",
        "metro_code": sv.metro_code,
        "hostname": "fg-vm-znpd",
        "notifications": [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        "account_number": sv.number,
        "vendor_configuration": {
            "gatewayIp": "X.X.X.X",
            "ipAddress": "X.X.X.X",
            "ipAddressType": "STATIC",
            "subnetMaskIp": "X.X.X.X",
            "managementInterfaceId": "6",
        },
    },
    name="TF_FTNT-FIREWALL",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    interface_count=10,
    type_code="FG-VM",
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="VM02",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.6.3",
    hostname="test",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "gatewayIp": "X.X.X.X",
        "ipAddress": "X.X.X.X",
        "ipAddressType": "STATIC",
        "subnetMaskIp": "x.x.x.x",
        "managementInterfaceId": "6",
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
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "FTNT-FIREWALL-SV", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_FTNT-FIREWALL-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("fg-vm-znpd"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"gatewayIp":             pulumi.String("X.X.X.X"),
					"ipAddress":             pulumi.String("X.X.X.X"),
					"ipAddressType":         pulumi.String("STATIC"),
					"subnetMaskIp":          pulumi.String("X.X.X.X"),
					"managementInterfaceId": pulumi.String("6"),
				},
			},
			Name:      pulumi.String("TF_FTNT-FIREWALL"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			InterfaceCount: pulumi.Int(10),
			TypeCode:       pulumi.String("FG-VM"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			Connectivity:   pulumi.String("PRIVATE"),
			PackageCode:    pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("7.6.3"),
			Hostname:   pulumi.String("test"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"gatewayIp":             pulumi.String("X.X.X.X"),
				"ipAddress":             pulumi.String("X.X.X.X"),
				"ipAddressType":         pulumi.String("STATIC"),
				"subnetMaskIp":          pulumi.String("x.x.x.x"),
				"managementInterfaceId": pulumi.String("6"),
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
        Name = "account-name",
    });

    var ftntFirewallSv = new Equinix.NetworkEdge.Device("FTNT-FIREWALL-SV", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_FTNT-FIREWALL-secondary",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            Hostname = "fg-vm-znpd",
            Notifications = new[]
            {
                "john@equinix.com",
                "marry@equinix.com",
            },
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            VendorConfiguration = 
            {
                { "gatewayIp", "X.X.X.X" },
                { "ipAddress", "X.X.X.X" },
                { "ipAddressType", "STATIC" },
                { "subnetMaskIp", "X.X.X.X" },
                { "managementInterfaceId", "6" },
            },
        },
        Name = "TF_FTNT-FIREWALL",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        InterfaceCount = 10,
        TypeCode = "FG-VM",
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "VM02",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.6.3",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "gatewayIp", "X.X.X.X" },
            { "ipAddress", "X.X.X.X" },
            { "ipAddressType", "STATIC" },
            { "subnetMaskIp", "x.x.x.x" },
            { "managementInterfaceId", "6" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .name("account-name")
            .build());

        var ftntFirewallSv = new Device("ftntFirewallSv", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_FTNT-FIREWALL-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("fg-vm-znpd")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("gatewayIp", "X.X.X.X"),
                    Map.entry("ipAddress", "X.X.X.X"),
                    Map.entry("ipAddressType", "STATIC"),
                    Map.entry("subnetMaskIp", "X.X.X.X"),
                    Map.entry("managementInterfaceId", "6")
                ))
                .build())
            .name("TF_FTNT-FIREWALL")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .interfaceCount(10)
            .typeCode("FG-VM")
            .selfManaged(true)
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("VM02")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.6.3")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("gatewayIp", "X.X.X.X"),
                Map.entry("ipAddress", "X.X.X.X"),
                Map.entry("ipAddressType", "STATIC"),
                Map.entry("subnetMaskIp", "x.x.x.x"),
                Map.entry("managementInterfaceId", "6")
            ))
            .build());

    }
}
```
```yaml
resources:
  FTNT-FIREWALL-SV:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_FTNT-FIREWALL-secondary
        metroCode: ${sv.metroCode}
        hostname: fg-vm-znpd
        notifications:
          - john@equinix.com
          - marry@equinix.com
        accountNumber: ${sv.number}
        vendorConfiguration:
          gatewayIp: X.X.X.X
          ipAddress: X.X.X.X
          ipAddressType: STATIC
          subnetMaskIp: X.X.X.X
          managementInterfaceId: '6'
      name: TF_FTNT-FIREWALL
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      interfaceCount: 10
      typeCode: FG-VM
      selfManaged: true
      byol: true
      connectivity: PRIVATE
      packageCode: VM02
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 7.6.3
      hostname: test
      coreCount: 2
      termLength: 1
      vendorConfiguration:
        gatewayIp: X.X.X.X
        ipAddress: X.X.X.X
        ipAddressType: STATIC
        subnetMaskIp: x.x.x.x
        managementInterfaceId: '6'
variables:
  # Create FG VM ha device with connectivity PRIVATE and IP Address Type as STATIC
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
        name: account-name
```
{{% /example %}}

{{% example %}}
### example fortigate sdwan single device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const ftntSdwanSv = new equinix.networkedge.Device("FTNT-SDWAN-SV", {
    name: "TF_FTNT-SDWAN",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "FG-SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "VM02",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.0.14",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    aclTemplateId: "XXXXXXXX",
    vendorConfiguration: {
        adminPassword: "XXXXX",
        controller1: "X.X.X.X",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
ftnt_sdwan_sv = equinix.networkedge.Device("FTNT-SDWAN-SV",
    name="TF_FTNT-SDWAN",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="FG-SDWAN",
    self_managed=True,
    byol=True,
    package_code="VM02",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="7.0.14",
    hostname="test",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    acl_template_id="XXXXXXXX",
    vendor_configuration={
        "adminPassword": "XXXXX",
        "controller1": "X.X.X.X",
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
		_, err := networkedge.NewDevice(ctx, "FTNT-SDWAN-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_FTNT-SDWAN"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("FG-SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("7.0.14"),
			Hostname:            pulumi.String("test"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			AclTemplateId:       pulumi.String("XXXXXXXX"),
			VendorConfiguration: pulumi.StringMap{
				"adminPassword": pulumi.String("XXXXX"),
				"controller1":   pulumi.String("X.X.X.X"),
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

    var ftntSdwanSv = new Equinix.NetworkEdge.Device("FTNT-SDWAN-SV", new()
    {
        Name = "TF_FTNT-SDWAN",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "FG-SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "VM02",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.0.14",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        AclTemplateId = "XXXXXXXX",
        VendorConfiguration = 
        {
            { "adminPassword", "XXXXX" },
            { "controller1", "X.X.X.X" },
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

        var ftntSdwanSv = new Device("ftntSdwanSv", DeviceArgs.builder()
            .name("TF_FTNT-SDWAN")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("FG-SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM02")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.0.14")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .aclTemplateId("XXXXXXXX")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("adminPassword", "XXXXX"),
                Map.entry("controller1", "X.X.X.X")
            ))
            .build());

    }
}
```
```yaml
resources:
  FTNT-SDWAN-SV:
    type: equinix:networkedge:Device
    properties:
      name: TF_FTNT-SDWAN
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: FG-SDWAN
      selfManaged: true
      byol: true
      packageCode: VM02
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 7.0.14
      hostname: test
      coreCount: 2
      termLength: 1
      additionalBandwidth: 50
      aclTemplateId: XXXXXXXX
      vendorConfiguration:
        adminPassword: XXXXX
        controller1: X.X.X.X
variables:
  # Create Fortinet SDWAN single device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example infoblox cluster device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const infobloxSv = new equinix.networkedge.Device("INFOBLOX-SV", {
    clusterDetails: {
        node0: {
            vendorConfiguration: {
                adminPassword: "xxxxxxx",
                ipAddress: "X.X.X.X",
                subnetMaskIp: "X.X.X.X",
                gatewayIp: "X.X.X.X",
            },
        },
        node1: {
            vendorConfiguration: {
                adminPassword: "xxxxxxx",
                ipAddress: "X.X.X.X",
                subnetMaskIp: "X.X.X.X",
                gatewayIp: "X.X.X.X",
            },
        },
        clusterName: "tf-infoblox-cluster",
    },
    name: "TF_INFOBLOX",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "INFOBLOX-GRID-MEMBER",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.0.5",
    connectivity: "PRIVATE",
    coreCount: 8,
    termLength: 1,
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
infoblox_sv = equinix.networkedge.Device("INFOBLOX-SV",
    cluster_details={
        "node0": {
            "vendor_configuration": {
                "admin_password": "xxxxxxx",
                "ip_address": "X.X.X.X",
                "subnet_mask_ip": "X.X.X.X",
                "gateway_ip": "X.X.X.X",
            },
        },
        "node1": {
            "vendor_configuration": {
                "admin_password": "xxxxxxx",
                "ip_address": "X.X.X.X",
                "subnet_mask_ip": "X.X.X.X",
                "gateway_ip": "X.X.X.X",
            },
        },
        "cluster_name": "tf-infoblox-cluster",
    },
    name="TF_INFOBLOX",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-GRID-MEMBER",
    self_managed=True,
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.0.5",
    connectivity="PRIVATE",
    core_count=8,
    term_length=1)
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
		_, err := networkedge.NewDevice(ctx, "INFOBLOX-SV", &networkedge.DeviceArgs{
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						AdminPassword: pulumi.String("xxxxxxx"),
						IpAddress:     pulumi.String("X.X.X.X"),
						SubnetMaskIp:  pulumi.String("X.X.X.X"),
						GatewayIp:     pulumi.String("X.X.X.X"),
					},
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						AdminPassword: pulumi.String("xxxxxxx"),
						IpAddress:     pulumi.String("X.X.X.X"),
						SubnetMaskIp:  pulumi.String("X.X.X.X"),
						GatewayIp:     pulumi.String("X.X.X.X"),
					},
				},
				ClusterName: pulumi.String("tf-infoblox-cluster"),
			},
			Name:      pulumi.String("TF_INFOBLOX"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("INFOBLOX-GRID-MEMBER"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:      pulumi.String("9.0.5"),
			Connectivity: pulumi.String("PRIVATE"),
			CoreCount:    pulumi.Int(8),
			TermLength:   pulumi.Int(1),
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

    var infobloxSv = new Equinix.NetworkEdge.Device("INFOBLOX-SV", new()
    {
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    AdminPassword = "xxxxxxx",
                    IpAddress = "X.X.X.X",
                    SubnetMaskIp = "X.X.X.X",
                    GatewayIp = "X.X.X.X",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    AdminPassword = "xxxxxxx",
                    IpAddress = "X.X.X.X",
                    SubnetMaskIp = "X.X.X.X",
                    GatewayIp = "X.X.X.X",
                },
            },
            ClusterName = "tf-infoblox-cluster",
        },
        Name = "TF_INFOBLOX",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-GRID-MEMBER",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.0.5",
        Connectivity = "PRIVATE",
        CoreCount = 8,
        TermLength = 1,
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

        var infobloxSv = new Device("infobloxSv", DeviceArgs.builder()
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .adminPassword("xxxxxxx")
                        .ipAddress("X.X.X.X")
                        .subnetMaskIp("X.X.X.X")
                        .gatewayIp("X.X.X.X")
                        .build())
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .adminPassword("xxxxxxx")
                        .ipAddress("X.X.X.X")
                        .subnetMaskIp("X.X.X.X")
                        .gatewayIp("X.X.X.X")
                        .build())
                    .build())
                .clusterName("tf-infoblox-cluster")
                .build())
            .name("TF_INFOBLOX")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-GRID-MEMBER")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.0.5")
            .connectivity("PRIVATE")
            .coreCount(8)
            .termLength(1)
            .build());

    }
}
```
```yaml
resources:
  INFOBLOX-SV:
    type: equinix:networkedge:Device
    properties:
      clusterDetails:
        node0:
          vendorConfiguration:
            adminPassword: xxxxxxx
            ipAddress: X.X.X.X
            subnetMaskIp: X.X.X.X
            gatewayIp: X.X.X.X
        node1:
          vendorConfiguration:
            adminPassword: xxxxxxx
            ipAddress: X.X.X.X
            subnetMaskIp: X.X.X.X
            gatewayIp: X.X.X.X
        clusterName: tf-infoblox-cluster
      name: TF_INFOBLOX
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: INFOBLOX-GRID-MEMBER
      selfManaged: true
      byol: true
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 9.0.5
      connectivity: PRIVATE
      coreCount: 8
      termLength: 1
variables:
  # Create Infoblox Grid Member HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example infoblox ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const infobloxSv = new equinix.networkedge.Device("INFOBLOX-SV", {
    secondaryDevice: {
        name: "TF_INFOBLOX-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            adminPassword: "X.X.X.X",
            ipAddress: "X.X.X.X",
            subnetMaskIp: "X.X.X.X",
            gatewayIp: "X.X.X.X",
        },
    },
    name: "TF_INFOBLOX",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "INFOBLOX-GRID-MEMBER",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.0.5",
    coreCount: 8,
    termLength: 1,
    vendorConfiguration: {
        adminPassword: "X.X.X.X",
        ipAddress: "X.X.X.X",
        subnetMaskIp: "X.X.X.X",
        gatewayIp: "X.X.X.X",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
infoblox_sv = equinix.networkedge.Device("INFOBLOX-SV",
    secondary_device={
        "name": "TF_INFOBLOX-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "adminPassword": "X.X.X.X",
            "ipAddress": "X.X.X.X",
            "subnetMaskIp": "X.X.X.X",
            "gatewayIp": "X.X.X.X",
        },
    },
    name="TF_INFOBLOX",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-GRID-MEMBER",
    self_managed=True,
    connectivity="PRIVATE",
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.0.5",
    core_count=8,
    term_length=1,
    vendor_configuration={
        "adminPassword": "X.X.X.X",
        "ipAddress": "X.X.X.X",
        "subnetMaskIp": "X.X.X.X",
        "gatewayIp": "X.X.X.X",
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
		_, err := networkedge.NewDevice(ctx, "INFOBLOX-SV", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_INFOBLOX-Sec"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"adminPassword": pulumi.String("X.X.X.X"),
					"ipAddress":     pulumi.String("X.X.X.X"),
					"subnetMaskIp":  pulumi.String("X.X.X.X"),
					"gatewayIp":     pulumi.String("X.X.X.X"),
				},
			},
			Name:      pulumi.String("TF_INFOBLOX"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("INFOBLOX-GRID-MEMBER"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("9.0.5"),
			CoreCount:  pulumi.Int(8),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"adminPassword": pulumi.String("X.X.X.X"),
				"ipAddress":     pulumi.String("X.X.X.X"),
				"subnetMaskIp":  pulumi.String("X.X.X.X"),
				"gatewayIp":     pulumi.String("X.X.X.X"),
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

    var infobloxSv = new Equinix.NetworkEdge.Device("INFOBLOX-SV", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_INFOBLOX-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "adminPassword", "X.X.X.X" },
                { "ipAddress", "X.X.X.X" },
                { "subnetMaskIp", "X.X.X.X" },
                { "gatewayIp", "X.X.X.X" },
            },
        },
        Name = "TF_INFOBLOX",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-GRID-MEMBER",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.0.5",
        CoreCount = 8,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "adminPassword", "X.X.X.X" },
            { "ipAddress", "X.X.X.X" },
            { "subnetMaskIp", "X.X.X.X" },
            { "gatewayIp", "X.X.X.X" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var infobloxSv = new Device("infobloxSv", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_INFOBLOX-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("adminPassword", "X.X.X.X"),
                    Map.entry("ipAddress", "X.X.X.X"),
                    Map.entry("subnetMaskIp", "X.X.X.X"),
                    Map.entry("gatewayIp", "X.X.X.X")
                ))
                .build())
            .name("TF_INFOBLOX")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-GRID-MEMBER")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.0.5")
            .coreCount(8)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("adminPassword", "X.X.X.X"),
                Map.entry("ipAddress", "X.X.X.X"),
                Map.entry("subnetMaskIp", "X.X.X.X"),
                Map.entry("gatewayIp", "X.X.X.X")
            ))
            .build());

    }
}
```
```yaml
resources:
  INFOBLOX-SV:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_INFOBLOX-Sec
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        notifications:
          - test@eq.com
        vendorConfiguration:
          adminPassword: X.X.X.X
          ipAddress: X.X.X.X
          subnetMaskIp: X.X.X.X
          gatewayIp: X.X.X.X
      name: TF_INFOBLOX
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: INFOBLOX-GRID-MEMBER
      selfManaged: true
      connectivity: PRIVATE
      byol: true
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 9.0.5
      coreCount: 8
      termLength: 1
      vendorConfiguration:
        adminPassword: X.X.X.X
        ipAddress: X.X.X.X
        subnetMaskIp: X.X.X.X
        gatewayIp: X.X.X.X
variables:
  # Create Infoblox Grid Member HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example infoblox niosx ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const niosXHa = new equinix.networkedge.Device("nios-x-ha", {
    secondaryDevice: {
        name: "TF_INFOBLOX-NIOS-X-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            hostname: "test",
            token: "xxxxx",
        },
    },
    name: "TF_INFOBLOX-NIOS-X",
    projectId: "xxxxxxx",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "INFOBLOX-NIOSX",
    selfManaged: true,
    connectivity: "INTERNET-ACCESS",
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "4.0",
    coreCount: 3,
    interfaceCount: 5,
    termLength: 1,
    vendorConfiguration: {
        hostname: "test",
        token: "xxxxx",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
nios_x_ha = equinix.networkedge.Device("nios-x-ha",
    secondary_device={
        "name": "TF_INFOBLOX-NIOS-X-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "hostname": "test",
            "token": "xxxxx",
        },
    },
    name="TF_INFOBLOX-NIOS-X",
    project_id="xxxxxxx",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-NIOSX",
    self_managed=True,
    connectivity="INTERNET-ACCESS",
    byol=True,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="4.0",
    core_count=3,
    interface_count=5,
    term_length=1,
    vendor_configuration={
        "hostname": "test",
        "token": "xxxxx",
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
		_, err := networkedge.NewDevice(ctx, "nios-x-ha", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_INFOBLOX-NIOS-X-Sec"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"hostname": pulumi.String("test"),
					"token":    pulumi.String("xxxxx"),
				},
			},
			Name:      pulumi.String("TF_INFOBLOX-NIOS-X"),
			ProjectId: pulumi.String("xxxxxxx"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("INFOBLOX-NIOSX"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("INTERNET-ACCESS"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("4.0"),
			CoreCount:      pulumi.Int(3),
			InterfaceCount: pulumi.Int(5),
			TermLength:     pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"hostname": pulumi.String("test"),
				"token":    pulumi.String("xxxxx"),
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

    var niosXHa = new Equinix.NetworkEdge.Device("nios-x-ha", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_INFOBLOX-NIOS-X-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "token", "xxxxx" },
            },
        },
        Name = "TF_INFOBLOX-NIOS-X",
        ProjectId = "xxxxxxx",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-NIOSX",
        SelfManaged = true,
        Connectivity = "INTERNET-ACCESS",
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "4.0",
        CoreCount = 3,
        InterfaceCount = 5,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "token", "xxxxx" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var niosXHa = new Device("niosXHa", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_INFOBLOX-NIOS-X-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("token", "xxxxx")
                ))
                .build())
            .name("TF_INFOBLOX-NIOS-X")
            .projectId("xxxxxxx")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-NIOSX")
            .selfManaged(true)
            .connectivity("INTERNET-ACCESS")
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("4.0")
            .coreCount(3)
            .interfaceCount(5)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("token", "xxxxx")
            ))
            .build());

    }
}
```
```yaml
resources:
  nios-x-ha:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: TF_INFOBLOX-NIOS-X-Sec
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        notifications:
          - test@eq.com
        vendorConfiguration:
          hostname: test
          token: xxxxx
      name: TF_INFOBLOX-NIOS-X
      projectId: xxxxxxx
      metroCode: ${sv.metroCode}
      typeCode: INFOBLOX-NIOSX
      selfManaged: true
      connectivity: INTERNET-ACCESS
      byol: true
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: '4.0'
      coreCount: 3
      interfaceCount: 5
      termLength: 1
      vendorConfiguration:
        hostname: test
        token: xxxxx
variables:
  # Create Infoblox NIOS-X HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example infoblox single device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const infobloxSv = new equinix.networkedge.Device("INFOBLOX-SV", {
    name: "TF_INFOBLOX",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "INFOBLOX-GRID-MEMBER",
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.0.5",
    coreCount: 8,
    termLength: 1,
    vendorConfiguration: {
        adminPassword: "xxxxxx",
        ipAddress: "X.X.X.X",
        subnetMaskIp: "X.X.X.X",
        gatewayIp: "X.X.X.X",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
infoblox_sv = equinix.networkedge.Device("INFOBLOX-SV",
    name="TF_INFOBLOX",
    project_id="XXXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="INFOBLOX-GRID-MEMBER",
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="9.0.5",
    core_count=8,
    term_length=1,
    vendor_configuration={
        "adminPassword": "xxxxxx",
        "ipAddress": "X.X.X.X",
        "subnetMaskIp": "X.X.X.X",
        "gatewayIp": "X.X.X.X",
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
		_, err := networkedge.NewDevice(ctx, "INFOBLOX-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_INFOBLOX"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("INFOBLOX-GRID-MEMBER"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("9.0.5"),
			CoreCount:  pulumi.Int(8),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"adminPassword": pulumi.String("xxxxxx"),
				"ipAddress":     pulumi.String("X.X.X.X"),
				"subnetMaskIp":  pulumi.String("X.X.X.X"),
				"gatewayIp":     pulumi.String("X.X.X.X"),
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

    var infobloxSv = new Equinix.NetworkEdge.Device("INFOBLOX-SV", new()
    {
        Name = "TF_INFOBLOX",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-GRID-MEMBER",
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.0.5",
        CoreCount = 8,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "adminPassword", "xxxxxx" },
            { "ipAddress", "X.X.X.X" },
            { "subnetMaskIp", "X.X.X.X" },
            { "gatewayIp", "X.X.X.X" },
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

        var infobloxSv = new Device("infobloxSv", DeviceArgs.builder()
            .name("TF_INFOBLOX")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-GRID-MEMBER")
            .selfManaged(true)
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.0.5")
            .coreCount(8)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("adminPassword", "xxxxxx"),
                Map.entry("ipAddress", "X.X.X.X"),
                Map.entry("subnetMaskIp", "X.X.X.X"),
                Map.entry("gatewayIp", "X.X.X.X")
            ))
            .build());

    }
}
```
```yaml
resources:
  INFOBLOX-SV:
    type: equinix:networkedge:Device
    properties:
      name: TF_INFOBLOX
      projectId: XXXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: INFOBLOX-GRID-MEMBER
      selfManaged: true
      byol: true
      connectivity: PRIVATE
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 9.0.5
      coreCount: 8
      termLength: 1
      vendorConfiguration:
        adminPassword: xxxxxx
        ipAddress: X.X.X.X
        subnetMaskIp: X.X.X.X
        gatewayIp: X.X.X.X
variables:
  # Create Infoblox Grid Member Single device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example netskope npa ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const netskopeNpa = new equinix.networkedge.Device("netskope-npa", {
    secondaryDevice: {
        name: "NETSKOPE-NPA-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            hostname: "test",
            privateCidrMask: "24",
            ipAddressType: "STATIC",
            ipAddress: "x.x.x.x",
            gatewayIp: "x.x.x.x",
            primaryNameServer: "x.x.x.x",
            secondaryNameServer: "x.x.x.x",
            dnsSearchDomain: "xxxxx",
        },
    },
    name: "NETSKOPE-NPA",
    projectId: "xxxxxxx",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "NETSKOPE-NPA",
    selfManaged: true,
    byol: true,
    interfaceCount: 1,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    connectivity: "PRIVATE",
    accountNumber: sv.apply(sv => sv.number),
    version: "R138",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        hostname: "test",
        privateCidrMask: "24",
        ipAddressType: "STATIC",
        ipAddress: "x.x.x.x",
        gatewayIp: "x.x.x.x",
        primaryNameServer: "x.x.x.x",
        secondaryNameServer: "x.x.x.x",
        dnsSearchDomain: "xxxxx",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
netskope_npa = equinix.networkedge.Device("netskope-npa",
    secondary_device={
        "name": "NETSKOPE-NPA-Sec",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "hostname": "test",
            "privateCidrMask": "24",
            "ipAddressType": "STATIC",
            "ipAddress": "x.x.x.x",
            "gatewayIp": "x.x.x.x",
            "primaryNameServer": "x.x.x.x",
            "secondaryNameServer": "x.x.x.x",
            "dnsSearchDomain": "xxxxx",
        },
    },
    name="NETSKOPE-NPA",
    project_id="xxxxxxx",
    metro_code=sv.metro_code,
    type_code="NETSKOPE-NPA",
    self_managed=True,
    byol=True,
    interface_count=1,
    package_code="STD",
    notifications=["test@eq.com"],
    connectivity="PRIVATE",
    account_number=sv.number,
    version="R138",
    core_count=2,
    term_length=1,
    vendor_configuration={
        "hostname": "test",
        "privateCidrMask": "24",
        "ipAddressType": "STATIC",
        "ipAddress": "x.x.x.x",
        "gatewayIp": "x.x.x.x",
        "primaryNameServer": "x.x.x.x",
        "secondaryNameServer": "x.x.x.x",
        "dnsSearchDomain": "xxxxx",
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
		_, err := networkedge.NewDevice(ctx, "netskope-npa", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("NETSKOPE-NPA-Sec"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"hostname":            pulumi.String("test"),
					"privateCidrMask":     pulumi.String("24"),
					"ipAddressType":       pulumi.String("STATIC"),
					"ipAddress":           pulumi.String("x.x.x.x"),
					"gatewayIp":           pulumi.String("x.x.x.x"),
					"primaryNameServer":   pulumi.String("x.x.x.x"),
					"secondaryNameServer": pulumi.String("x.x.x.x"),
					"dnsSearchDomain":     pulumi.String("xxxxx"),
				},
			},
			Name:      pulumi.String("NETSKOPE-NPA"),
			ProjectId: pulumi.String("xxxxxxx"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:       pulumi.String("NETSKOPE-NPA"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			InterfaceCount: pulumi.Int(1),
			PackageCode:    pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			Connectivity: pulumi.String("PRIVATE"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("R138"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"hostname":            pulumi.String("test"),
				"privateCidrMask":     pulumi.String("24"),
				"ipAddressType":       pulumi.String("STATIC"),
				"ipAddress":           pulumi.String("x.x.x.x"),
				"gatewayIp":           pulumi.String("x.x.x.x"),
				"primaryNameServer":   pulumi.String("x.x.x.x"),
				"secondaryNameServer": pulumi.String("x.x.x.x"),
				"dnsSearchDomain":     pulumi.String("xxxxx"),
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

    var netskopeNpa = new Equinix.NetworkEdge.Device("netskope-npa", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "NETSKOPE-NPA-Sec",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "hostname", "test" },
                { "privateCidrMask", "24" },
                { "ipAddressType", "STATIC" },
                { "ipAddress", "x.x.x.x" },
                { "gatewayIp", "x.x.x.x" },
                { "primaryNameServer", "x.x.x.x" },
                { "secondaryNameServer", "x.x.x.x" },
                { "dnsSearchDomain", "xxxxx" },
            },
        },
        Name = "NETSKOPE-NPA",
        ProjectId = "xxxxxxx",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "NETSKOPE-NPA",
        SelfManaged = true,
        Byol = true,
        InterfaceCount = 1,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        Connectivity = "PRIVATE",
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "R138",
        CoreCount = 2,
        TermLength = 1,
        VendorConfiguration = 
        {
            { "hostname", "test" },
            { "privateCidrMask", "24" },
            { "ipAddressType", "STATIC" },
            { "ipAddress", "x.x.x.x" },
            { "gatewayIp", "x.x.x.x" },
            { "primaryNameServer", "x.x.x.x" },
            { "secondaryNameServer", "x.x.x.x" },
            { "dnsSearchDomain", "xxxxx" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var netskopeNpa = new Device("netskopeNpa", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("NETSKOPE-NPA-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("privateCidrMask", "24"),
                    Map.entry("ipAddressType", "STATIC"),
                    Map.entry("ipAddress", "x.x.x.x"),
                    Map.entry("gatewayIp", "x.x.x.x"),
                    Map.entry("primaryNameServer", "x.x.x.x"),
                    Map.entry("secondaryNameServer", "x.x.x.x"),
                    Map.entry("dnsSearchDomain", "xxxxx")
                ))
                .build())
            .name("NETSKOPE-NPA")
            .projectId("xxxxxxx")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("NETSKOPE-NPA")
            .selfManaged(true)
            .byol(true)
            .interfaceCount(1)
            .packageCode("STD")
            .notifications("test@eq.com")
            .connectivity("PRIVATE")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("R138")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("privateCidrMask", "24"),
                Map.entry("ipAddressType", "STATIC"),
                Map.entry("ipAddress", "x.x.x.x"),
                Map.entry("gatewayIp", "x.x.x.x"),
                Map.entry("primaryNameServer", "x.x.x.x"),
                Map.entry("secondaryNameServer", "x.x.x.x"),
                Map.entry("dnsSearchDomain", "xxxxx")
            ))
            .build());

    }
}
```
```yaml
resources:
  netskope-npa:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: NETSKOPE-NPA-Sec
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        notifications:
          - test@eq.com
        vendorConfiguration:
          hostname: test
          privateCidrMask: '24'
          ipAddressType: STATIC
          ipAddress: x.x.x.x
          gatewayIp: x.x.x.x
          primaryNameServer: x.x.x.x
          secondaryNameServer: x.x.x.x
          dnsSearchDomain: xxxxx
      name: NETSKOPE-NPA
      projectId: xxxxxxx
      metroCode: ${sv.metroCode}
      typeCode: NETSKOPE-NPA
      selfManaged: true
      byol: true
      interfaceCount: 1
      packageCode: STD
      notifications:
        - test@eq.com
      connectivity: PRIVATE
      accountNumber: ${sv.number}
      version: R138
      coreCount: 2
      termLength: 1
      vendorConfiguration:
        hostname: test
        privateCidrMask: '24'
        ipAddressType: STATIC
        ipAddress: x.x.x.x
        gatewayIp: x.x.x.x
        primaryNameServer: x.x.x.x
        secondaryNameServer: x.x.x.x
        dnsSearchDomain: xxxxx
variables:
  # Create NETSKOPE NPA HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example versa sdwan ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const ftntSdwanSv = new equinix.networkedge.Device("FTNT-SDWAN-SV", {
    secondaryDevice: {
        name: "Praveena_TF_VERSA",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "XXXXXXXX",
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            controller1: "X.X.X.X",
            controller2: "X.X.X.X",
            localId: "test@test.com",
            remoteId: "test@test.com",
            serialNumber: "4",
        },
    },
    name: "TF_VERSA-SDWAN",
    projectId: "XXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "VERSA_SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "FLEX_VNF_2",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "21.2.3",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    aclTemplateId: "XXXXXXXXX",
    vendorConfiguration: {
        controller1: "X.X.X.X",
        controller2: "X.X.X.X",
        localId: "test@test.com",
        remoteId: "test@test.com",
        serialNumber: "4",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
ftnt_sdwan_sv = equinix.networkedge.Device("FTNT-SDWAN-SV",
    secondary_device={
        "name": "Praveena_TF_VERSA",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "acl_template_id": "XXXXXXXX",
        "notifications": ["test@eq.com"],
        "vendor_configuration": {
            "controller1": "X.X.X.X",
            "controller2": "X.X.X.X",
            "localId": "test@test.com",
            "remoteId": "test@test.com",
            "serialNumber": "4",
        },
    },
    name="TF_VERSA-SDWAN",
    project_id="XXXXXXXXX",
    metro_code=sv.metro_code,
    type_code="VERSA_SDWAN",
    self_managed=True,
    byol=True,
    package_code="FLEX_VNF_2",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="21.2.3",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    acl_template_id="XXXXXXXXX",
    vendor_configuration={
        "controller1": "X.X.X.X",
        "controller2": "X.X.X.X",
        "localId": "test@test.com",
        "remoteId": "test@test.com",
        "serialNumber": "4",
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
		_, err := networkedge.NewDevice(ctx, "FTNT-SDWAN-SV", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("Praveena_TF_VERSA"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				AclTemplateId: pulumi.String("XXXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"controller1":  pulumi.String("X.X.X.X"),
					"controller2":  pulumi.String("X.X.X.X"),
					"localId":      pulumi.String("test@test.com"),
					"remoteId":     pulumi.String("test@test.com"),
					"serialNumber": pulumi.String("4"),
				},
			},
			Name:      pulumi.String("TF_VERSA-SDWAN"),
			ProjectId: pulumi.String("XXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("VERSA_SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("FLEX_VNF_2"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("21.2.3"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			AclTemplateId:       pulumi.String("XXXXXXXXX"),
			VendorConfiguration: pulumi.StringMap{
				"controller1":  pulumi.String("X.X.X.X"),
				"controller2":  pulumi.String("X.X.X.X"),
				"localId":      pulumi.String("test@test.com"),
				"remoteId":     pulumi.String("test@test.com"),
				"serialNumber": pulumi.String("4"),
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

    var ftntSdwanSv = new Equinix.NetworkEdge.Device("FTNT-SDWAN-SV", new()
    {
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "Praveena_TF_VERSA",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            AclTemplateId = "XXXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
            VendorConfiguration = 
            {
                { "controller1", "X.X.X.X" },
                { "controller2", "X.X.X.X" },
                { "localId", "test@test.com" },
                { "remoteId", "test@test.com" },
                { "serialNumber", "4" },
            },
        },
        Name = "TF_VERSA-SDWAN",
        ProjectId = "XXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "VERSA_SDWAN",
        SelfManaged = true,
        Byol = true,
        PackageCode = "FLEX_VNF_2",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "21.2.3",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        AclTemplateId = "XXXXXXXXX",
        VendorConfiguration = 
        {
            { "controller1", "X.X.X.X" },
            { "controller2", "X.X.X.X" },
            { "localId", "test@test.com" },
            { "remoteId", "test@test.com" },
            { "serialNumber", "4" },
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var ftntSdwanSv = new Device("ftntSdwanSv", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("Praveena_TF_VERSA")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .aclTemplateId("XXXXXXXX")
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("controller1", "X.X.X.X"),
                    Map.entry("controller2", "X.X.X.X"),
                    Map.entry("localId", "test@test.com"),
                    Map.entry("remoteId", "test@test.com"),
                    Map.entry("serialNumber", "4")
                ))
                .build())
            .name("TF_VERSA-SDWAN")
            .projectId("XXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("VERSA_SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("FLEX_VNF_2")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("21.2.3")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .aclTemplateId("XXXXXXXXX")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("controller1", "X.X.X.X"),
                Map.entry("controller2", "X.X.X.X"),
                Map.entry("localId", "test@test.com"),
                Map.entry("remoteId", "test@test.com"),
                Map.entry("serialNumber", "4")
            ))
            .build());

    }
}
```
```yaml
resources:
  FTNT-SDWAN-SV:
    type: equinix:networkedge:Device
    properties:
      secondaryDevice:
        name: Praveena_TF_VERSA
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        aclTemplateId: XXXXXXXX
        notifications:
          - test@eq.com
        vendorConfiguration:
          controller1: X.X.X.X
          controller2: X.X.X.X
          localId: test@test.com
          remoteId: test@test.com
          serialNumber: '4'
      name: TF_VERSA-SDWAN
      projectId: XXXXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: VERSA_SDWAN
      selfManaged: true
      byol: true
      packageCode: FLEX_VNF_2
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 21.2.3
      coreCount: 2
      termLength: 1
      additionalBandwidth: 50
      aclTemplateId: XXXXXXXXX
      vendorConfiguration:
        controller1: X.X.X.X
        controller2: X.X.X.X
        localId: test@test.com
        remoteId: test@test.com
        serialNumber: '4'
variables:
  # Create Fortinet SDWAN single device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example vyos router ha device
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const vyosAm = new equinix.networkedge.Device("VYOS-AM", {
    sshKey: {
        username: "test",
        keyName: "xxxxxxxx",
    },
    secondaryDevice: {
        name: "TF_CHECKPOINT",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        hostname: "test",
        aclTemplateId: "XXXXXXXXXXX",
        notifications: ["test@eq.com"],
    },
    name: "TF_VYOS",
    projectId: "XXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "VYOS-ROUTER",
    selfManaged: true,
    byol: false,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "1.4.1-2501",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    aclTemplateId: "XXXXXXXX",
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
vyos_am = equinix.networkedge.Device("VYOS-AM",
    ssh_key={
        "username": "test",
        "key_name": "xxxxxxxx",
    },
    secondary_device={
        "name": "TF_CHECKPOINT",
        "metro_code": sv.metro_code,
        "account_number": sv.number,
        "hostname": "test",
        "acl_template_id": "XXXXXXXXXXX",
        "notifications": ["test@eq.com"],
    },
    name="TF_VYOS",
    project_id="XXXXXXX",
    metro_code=sv.metro_code,
    type_code="VYOS-ROUTER",
    self_managed=True,
    byol=False,
    package_code="STD",
    notifications=["test@eq.com"],
    account_number=sv.number,
    version="1.4.1-2501",
    hostname="test",
    core_count=2,
    term_length=1,
    additional_bandwidth=50,
    acl_template_id="XXXXXXXX")
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
		_, err := networkedge.NewDevice(ctx, "VYOS-AM", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("xxxxxxxx"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_CHECKPOINT"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Hostname:      pulumi.String("test"),
				AclTemplateId: pulumi.String("XXXXXXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
			},
			Name:      pulumi.String("TF_VYOS"),
			ProjectId: pulumi.String("XXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("VYOS-ROUTER"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(false),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("1.4.1-2501"),
			Hostname:            pulumi.String("test"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			AclTemplateId:       pulumi.String("XXXXXXXX"),
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

    var vyosAm = new Equinix.NetworkEdge.Device("VYOS-AM", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "xxxxxxxx",
        },
        SecondaryDevice = new Equinix.NetworkEdge.Inputs.DeviceSecondaryDeviceArgs
        {
            Name = "TF_CHECKPOINT",
            MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
            AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
            Hostname = "test",
            AclTemplateId = "XXXXXXXXXXX",
            Notifications = new[]
            {
                "test@eq.com",
            },
        },
        Name = "TF_VYOS",
        ProjectId = "XXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "VYOS-ROUTER",
        SelfManaged = true,
        Byol = false,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "1.4.1-2501",
        Hostname = "test",
        CoreCount = 2,
        TermLength = 1,
        AdditionalBandwidth = 50,
        AclTemplateId = "XXXXXXXX",
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
            .metroCode("SV")
            .build());

        var vyosAm = new Device("vyosAm", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("xxxxxxxx")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_CHECKPOINT")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .hostname("test")
                .aclTemplateId("XXXXXXXXXXX")
                .notifications("test@eq.com")
                .build())
            .name("TF_VYOS")
            .projectId("XXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("VYOS-ROUTER")
            .selfManaged(true)
            .byol(false)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("1.4.1-2501")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .aclTemplateId("XXXXXXXX")
            .build());

    }
}
```
```yaml
resources:
  VYOS-AM:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: xxxxxxxx
      secondaryDevice:
        name: TF_CHECKPOINT
        metroCode: ${sv.metroCode}
        accountNumber: ${sv.number}
        hostname: test
        aclTemplateId: XXXXXXXXXXX
        notifications:
          - test@eq.com
      name: TF_VYOS
      projectId: XXXXXXX
      metroCode: ${sv.metroCode}
      typeCode: VYOS-ROUTER
      selfManaged: true
      byol: false
      packageCode: STD
      notifications:
        - test@eq.com
      accountNumber: ${sv.number}
      version: 1.4.1-2501
      hostname: test
      coreCount: 2
      termLength: 1
      additionalBandwidth: 50
      aclTemplateId: XXXXXXXX
variables:
  # Create VYos Router HA device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example zscaler appc
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const zscalerAppcSingle = new equinix.networkedge.Device("zscaler-appc-single", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    name: "tf-zscaler-appc",
    projectId: "XXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "ZSCALER-APPC",
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "STD",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "23.395.1",
    interfaceCount: 1,
    coreCount: 4,
    vendorConfiguration: {
        provisioningKey: "XXXXXXXXXX",
        hostname: "XXXX",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
zscaler_appc_single = equinix.networkedge.Device("zscaler-appc-single",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    name="tf-zscaler-appc",
    project_id="XXXXXX",
    metro_code=sv.metro_code,
    type_code="ZSCALER-APPC",
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="STD",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="23.395.1",
    interface_count=1,
    core_count=4,
    vendor_configuration={
        "provisioningKey": "XXXXXXXXXX",
        "hostname": "XXXX",
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
		_, err := networkedge.NewDevice(ctx, "zscaler-appc-single", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			Name:      pulumi.String("tf-zscaler-appc"),
			ProjectId: pulumi.String("XXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("ZSCALER-APPC"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("23.395.1"),
			InterfaceCount: pulumi.Int(1),
			CoreCount:      pulumi.Int(4),
			VendorConfiguration: pulumi.StringMap{
				"provisioningKey": pulumi.String("XXXXXXXXXX"),
				"hostname":        pulumi.String("XXXX"),
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

    var zscalerAppcSingle = new Equinix.NetworkEdge.Device("zscaler-appc-single", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        Name = "tf-zscaler-appc",
        ProjectId = "XXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "ZSCALER-APPC",
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "23.395.1",
        InterfaceCount = 1,
        CoreCount = 4,
        VendorConfiguration = 
        {
            { "provisioningKey", "XXXXXXXXXX" },
            { "hostname", "XXXX" },
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

        var zscalerAppcSingle = new Device("zscalerAppcSingle", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .name("tf-zscaler-appc")
            .projectId("XXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("ZSCALER-APPC")
            .selfManaged(true)
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("STD")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("23.395.1")
            .interfaceCount(1)
            .coreCount(4)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("provisioningKey", "XXXXXXXXXX"),
                Map.entry("hostname", "XXXX")
            ))
            .build());

    }
}
```
```yaml
resources:
  zscaler-appc-single:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      name: tf-zscaler-appc
      projectId: XXXXXX
      metroCode: ${sv.metroCode}
      typeCode: ZSCALER-APPC
      selfManaged: true
      byol: true
      connectivity: PRIVATE
      packageCode: STD
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 23.395.1
      interfaceCount: 1
      coreCount: 4
      vendorConfiguration:
        provisioningKey: XXXXXXXXXX
        hostname: XXXX
variables:
  # Create ZSCALER APPC device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}

{{% example %}}
### example zscaler pse
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const zscalerPseSingle = new equinix.networkedge.Device("zscaler-pse-single", {
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    name: "tf-zscaler-pse",
    projectId: "XXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "ZSCALER-PSE",
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "STD",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "23.395.1",
    interfaceCount: 1,
    coreCount: 4,
    vendorConfiguration: {
        provisioningKey: "XXXXXXXXXX",
        hostname: "XXXX",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

sv = equinix.networkedge.get_account_output(metro_code="SV")
zscaler_pse_single = equinix.networkedge.Device("zscaler-pse-single",
    ssh_key={
        "username": "test",
        "key_name": "test-key",
    },
    name="tf-zscaler-pse",
    project_id="XXXXXX",
    metro_code=sv.metro_code,
    type_code="ZSCALER-PSE",
    self_managed=True,
    byol=True,
    connectivity="PRIVATE",
    package_code="STD",
    notifications=[
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    term_length=12,
    account_number=sv.number,
    version="23.395.1",
    interface_count=1,
    core_count=4,
    vendor_configuration={
        "provisioningKey": "XXXXXXXXXX",
        "hostname": "XXXX",
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
		_, err := networkedge.NewDevice(ctx, "zscaler-pse-single", &networkedge.DeviceArgs{
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			Name:      pulumi.String("tf-zscaler-pse"),
			ProjectId: pulumi.String("XXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("ZSCALER-PSE"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("23.395.1"),
			InterfaceCount: pulumi.Int(1),
			CoreCount:      pulumi.Int(4),
			VendorConfiguration: pulumi.StringMap{
				"provisioningKey": pulumi.String("XXXXXXXXXX"),
				"hostname":        pulumi.String("XXXX"),
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

    var zscalerPseSingle = new Equinix.NetworkEdge.Device("zscaler-pse-single", new()
    {
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        Name = "tf-zscaler-pse",
        ProjectId = "XXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "ZSCALER-PSE",
        SelfManaged = true,
        Byol = true,
        Connectivity = "PRIVATE",
        PackageCode = "STD",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "23.395.1",
        InterfaceCount = 1,
        CoreCount = 4,
        VendorConfiguration = 
        {
            { "provisioningKey", "XXXXXXXXXX" },
            { "hostname", "XXXX" },
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

        var zscalerPseSingle = new Device("zscalerPseSingle", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .name("tf-zscaler-pse")
            .projectId("XXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("ZSCALER-PSE")
            .selfManaged(true)
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("STD")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("23.395.1")
            .interfaceCount(1)
            .coreCount(4)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("provisioningKey", "XXXXXXXXXX"),
                Map.entry("hostname", "XXXX")
            ))
            .build());

    }
}
```
```yaml
resources:
  zscaler-pse-single:
    type: equinix:networkedge:Device
    properties:
      sshKey:
        username: test
        keyName: test-key
      name: tf-zscaler-pse
      projectId: XXXXXX
      metroCode: ${sv.metroCode}
      typeCode: ZSCALER-PSE
      selfManaged: true
      byol: true
      connectivity: PRIVATE
      packageCode: STD
      notifications:
        - john@equinix.com
        - marry@equinix.com
        - fred@equinix.com
      termLength: 12
      accountNumber: ${sv.number}
      version: 23.395.1
      interfaceCount: 1
      coreCount: 4
      vendorConfiguration:
        provisioningKey: XXXXXXXXXX
        hostname: XXXX
variables:
  # Create ZSCALER APPC device
  sv:
    fn::invoke:
      function: equinix:networkedge:getAccount
      arguments:
        metroCode: SV
```
{{% /example %}}


