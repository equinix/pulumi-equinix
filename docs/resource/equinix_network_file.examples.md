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
    deviceTypeCode: "AVIATRIX_EDGE_10",
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
    device_type_code="AVIATRIX_EDGE_10",
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
		_, err := networkedge.NewNetworkFile(ctx, "test-file", &networkedge.NetworkFileArgs{
			FileName: pulumi.String("fileName.txt"),
			Content: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.String(filepath),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
			MetroCode:      pulumi.String(equinix.MetroSiliconValley),
			DeviceTypeCode: pulumi.String("AVIATRIX_EDGE_10"),
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
        DeviceTypeCode = "AVIATRIX_EDGE_10",
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
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
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
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode("SV")
            .deviceTypeCode("AVIATRIX_EDGE_10")
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
          function: std:file
          arguments:
            input: ${filepath}
          return: result
      metroCode: SV
      deviceTypeCode: AVIATRIX_EDGE_10
      processType: CLOUD_INIT
      selfManaged: true
      byol: true
```
{{% /example %}}
