## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const asset = new equinix.fabric.StreamAttachment("asset", {
    assetId: "<id_of_the_asset_being_attached>",
    asset: "<asset_group>",
    streamId: "<id_of_the_stream_asset_is_being_attached_to>",
});
```
```python
import pulumi
import pulumi_equinix as equinix

asset = equinix.fabric.StreamAttachment("asset",
    asset_id="<id_of_the_asset_being_attached>",
    asset="<asset_group>",
    stream_id="<id_of_the_stream_asset_is_being_attached_to>")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewStreamAttachment(ctx, "asset", &fabric.StreamAttachmentArgs{
			AssetId:  pulumi.String("<id_of_the_asset_being_attached>"),
			Asset:    pulumi.String("<asset_group>"),
			StreamId: pulumi.String("<id_of_the_stream_asset_is_being_attached_to>"),
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
    var asset = new Equinix.Fabric.StreamAttachment("asset", new()
    {
        AssetId = "<id_of_the_asset_being_attached>",
        Asset = "<asset_group>",
        StreamId = "<id_of_the_stream_asset_is_being_attached_to>",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.StreamAttachment;
import com.equinix.pulumi.equinix.fabric.StreamAttachmentArgs;
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
        var asset = new StreamAttachment("asset", StreamAttachmentArgs.builder()
            .assetId("<id_of_the_asset_being_attached>")
            .asset("<asset_group>")
            .streamId("<id_of_the_stream_asset_is_being_attached_to>")
            .build());

    }
}
```
```yaml
resources:
  asset:
    type: equinix:fabric:StreamAttachment
    properties:
      assetId: <id_of_the_asset_being_attached>
      asset: <asset_group>
      streamId: <id_of_the_stream_asset_is_being_attached_to>
```
{{% /example %}}
