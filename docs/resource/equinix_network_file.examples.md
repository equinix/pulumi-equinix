## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as fs from "fs";

const config = new pulumi.Config();
const metro = config.get("metro") || "SV";
const networkFile = new equinix.networkedge.NetworkFile("networkFile", {
    fileName: "Aviatrix-ZTP-file",
    content: fs.readFileSync("./../assets/aviatrix-cloud-init.txt"),
    metroCode: metro,
    deviceTypeCode: "AVIATRIX_EDGE",
    processType: "CLOUD_INIT",
    selfManaged: true,
    byol: true,
});
export const networkFileId = networkFile.id;
export const networkFileStatus = networkFile.status;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
metro = config.get("metro")
if metro is None:
    metro = "SV"
network_file = equinix.networkedge.NetworkFile("networkFile",
    file_name="Aviatrix-ZTP-file",
    content=(lambda path: open(path).read())("./../assets/aviatrix-cloud-init.txt"),
    metro_code=metro,
    device_type_code="AVIATRIX_EDGE",
    process_type="CLOUD_INIT",
    self_managed=True,
    byol=True)
pulumi.export("networkFileId", network_file.id)
pulumi.export("networkFileStatus", network_file.status)
```
```go
package main

import (
	"os"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func readFileOrPanic(path string) pulumi.StringPtrInput {
	data, err := os.ReadFile(path)
	if err != nil {
		panic(err.Error())
	}
	return pulumi.String(string(data))
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		networkFile, err := networkedge.NewNetworkFile(ctx, "networkFile", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("Aviatrix-ZTP-file"),
			Content:        readFileOrPanic("./../assets/aviatrix-cloud-init.txt"),
			MetroCode:      pulumi.String(metro),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
			ProcessType:    pulumi.String("CLOUD_INIT"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		ctx.Export("networkFileId", networkFile.ID())
		ctx.Export("networkFileStatus", networkFile.Status)
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.IO;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var metro = config.Get("metro") ?? "SV";
    var networkFile = new Equinix.NetworkEdge.NetworkFile("networkFile", new()
    {
        FileName = "Aviatrix-ZTP-file",
        Content = File.ReadAllText("./../assets/aviatrix-cloud-init.txt"),
        MetroCode = metro,
        DeviceTypeCode = "AVIATRIX_EDGE",
        ProcessType = "CLOUD_INIT",
        SelfManaged = true,
        Byol = true,
    });

    return new Dictionary<string, object?>
    {
        ["networkFileId"] = networkFile.Id,
        ["networkFileStatus"] = networkFile.Status,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkFile;
import com.pulumi.equinix.networkedge.NetworkFileArgs;
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
        final var metro = config.get("metro").orElse("SV");
        var networkFile = new NetworkFile("networkFile", NetworkFileArgs.builder()        
            .fileName("Aviatrix-ZTP-file")
            .content(Files.readString(Paths.get("./../assets/aviatrix-cloud-init.txt")))
            .metroCode(metro)
            .deviceTypeCode("AVIATRIX_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        ctx.export("networkFileId", networkFile.id());
        ctx.export("networkFileStatus", networkFile.status());
    }
}
```
```yaml
config:
  metro:
    type: string
    default: SV
resources:
  networkFile:
    type: equinix:networkedge:NetworkFile
    properties:
      fileName: Aviatrix-ZTP-file
      content:
        fn::readFile: ./../assets/aviatrix-cloud-init.txt
      metroCode: ${metro}
      deviceTypeCode: AVIATRIX_EDGE
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
outputs:
  networkFileId: ${networkFile.id}
  networkFileStatus: ${networkFile.status}
```
{{% /example %}}
