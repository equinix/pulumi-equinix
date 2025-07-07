## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const streamState = newStream.state;
```
```python
import pulumi

pulumi.export("streamState", new_stream["state"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("streamState", newStream.State)
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
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
        ctx.export("streamState", newStream.state());
    }
}
```
```yaml
resources:
  newStream:
    type: equinix:fabricStream
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
