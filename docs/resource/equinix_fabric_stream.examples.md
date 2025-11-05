## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newStream = new equinix.fabric.Stream("newStream", {
    type: "TELEMETRY_STREAM",
    name: "<name_of_stream_resource>",
    description: "<description_of_stream_resource>",
    project: {
        projectId: "<destination_project_id_for_stream",
    },
});
export const streamState = newStream.state;
```
```python
import pulumi
import pulumi_equinix as equinix

new_stream = equinix.fabric.Stream("newStream",
    type="TELEMETRY_STREAM",
    name="<name_of_stream_resource>",
    description="<description_of_stream_resource>",
    project={
        "project_id": "<destination_project_id_for_stream",
    })
pulumi.export("streamState", new_stream.state)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		newStream, err := fabric.NewStream(ctx, "newStream", &fabric.StreamArgs{
			Type:        pulumi.String("TELEMETRY_STREAM"),
			Name:        pulumi.String("<name_of_stream_resource>"),
			Description: pulumi.String("<description_of_stream_resource>"),
			Project: &fabric.StreamProjectArgs{
				ProjectId: pulumi.String("<destination_project_id_for_stream"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("streamState", newStream.State)
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
    var newStream = new Equinix.Fabric.Stream("newStream", new()
    {
        Type = "TELEMETRY_STREAM",
        Name = "<name_of_stream_resource>",
        Description = "<description_of_stream_resource>",
        Project = new Equinix.Fabric.Inputs.StreamProjectArgs
        {
            ProjectId = "<destination_project_id_for_stream",
        },
    });

    return new Dictionary<string, object?>
    {
        ["streamState"] = newStream.State,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.Stream;
import com.equinix.pulumi.equinix.fabric.StreamArgs;
import com.pulumi.equinix.fabric.inputs.StreamProjectArgs;
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
        var newStream = new Stream("newStream", StreamArgs.builder()
            .type("TELEMETRY_STREAM")
            .name("<name_of_stream_resource>")
            .description("<description_of_stream_resource>")
            .project(StreamProjectArgs.builder()
                .projectId("<destination_project_id_for_stream")
                .build())
            .build());

        ctx.export("streamState", newStream.state());
    }
}
```
```yaml
resources:
  newStream:
    type: equinix:fabric:Stream
    name: new_stream
    properties:
      type: TELEMETRY_STREAM
      name: <name_of_stream_resource>
      description: <description_of_stream_resource>
      project:
        projectId: <destination_project_id_for_stream
outputs:
  streamState: ${newStream.state}
```
{{% /example %}}
