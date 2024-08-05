## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const config = new pulumi.Config();
const filepath = config.get("filepath") || "fileFolder/fileName.txt";
const testFile = new equinix.networkedge.NetworkFile("test-file", {
    fileName: "fileName.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: equinix.index.Metro.SiliconValley,
    deviceTypeCode: "AVIATRIX_EDGE",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

config = pulumi.Config()
filepath = config.get("filepath")
if filepath is None:
    filepath = "fileFolder/fileName.txt"
test_file = equinix.networkedge.NetworkFile("test-file",
    file_name="fileName.txt",
    content=std.file_output(input=filepath).apply(lambda invoke: invoke.result),
    metro_code=equinix.Metro.SILICON_VALLEY,
    device_type_code="AVIATRIX_EDGE",
    process_type=equinix.networkedge.FileType.CLOUD_INIT,
    self_managed=True,
    byol=True)
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
		filepath := "fileFolder/fileName.txt"
		if param := cfg.Get("filepath"); param != "" {
			filepath = param
		}
		invokeFile, err := std.File(ctx, &std.FileArgs{
			Input: filepath,
		}, nil)
		if err != nil {
			return err
		}
		_, err = networkedge.NewNetworkFile(ctx, "test-file", &networkedge.NetworkFileArgs{
			FileName:       pulumi.String("fileName.txt"),
			Content:        invokeFile.Result,
			MetroCode:      pulumi.String(equinix.MetroSiliconValley),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
			ProcessType:    pulumi.String(networkedge.FileTypeCloudInit),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
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
    var filepath = config.Get("filepath") ?? "fileFolder/fileName.txt";
    var testFile = new Equinix.NetworkEdge.NetworkFile("test-file", new()
    {
        FileName = "fileName.txt",
        Content = Std.File.Invoke(new()
        {
            Input = filepath,
        }).Apply(invoke => invoke.Result),
        MetroCode = Equinix.Metro.SiliconValley,
        DeviceTypeCode = "AVIATRIX_EDGE",
        ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
        SelfManaged = true,
        Byol = true,
    });

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
        final var filepath = config.get("filepath").orElse("fileFolder/fileName.txt");
        var testFile = new NetworkFile("testFile", NetworkFileArgs.builder()
            .fileName("fileName.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).result())
            .metroCode("SV")
            .deviceTypeCode("AVIATRIX_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

    }
}
```
```yaml
configuration:
  filepath:
    type: string
    default: fileFolder/fileName.txt
resources:
  test-file:
    type: equinix:networkedge:NetworkFile
    properties:
      fileName: fileName.txt
      content:
        fn::invoke:
          Function: std:file
          Arguments:
            input: ${filepath}
          Return: result
      metroCode: SV
      deviceTypeCode: AVIATRIX_EDGE
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
```
{{% /example %}}
