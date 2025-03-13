## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const connectionRouteAggregationId = policyAttachment.id;
export const connectionRouteAggregationConnectionId = policyAttachment.connectionId;
export const connectionRouteAggregationType = policyAttachment.type;
export const connectionRouteAggregationAttachmentStatus = policyAttachment.attachmentStatus;
```
```python
import pulumi

pulumi.export("connectionRouteAggregationId", policy_attachment["id"])
pulumi.export("connectionRouteAggregationConnectionId", policy_attachment["connectionId"])
pulumi.export("connectionRouteAggregationType", policy_attachment["type"])
pulumi.export("connectionRouteAggregationAttachmentStatus", policy_attachment["attachmentStatus"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("connectionRouteAggregationId", policyAttachment.Id)
		ctx.Export("connectionRouteAggregationConnectionId", policyAttachment.ConnectionId)
		ctx.Export("connectionRouteAggregationType", policyAttachment.Type)
		ctx.Export("connectionRouteAggregationAttachmentStatus", policyAttachment.AttachmentStatus)
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
        ["connectionRouteAggregationId"] = policyAttachment.Id,
        ["connectionRouteAggregationConnectionId"] = policyAttachment.ConnectionId,
        ["connectionRouteAggregationType"] = policyAttachment.Type,
        ["connectionRouteAggregationAttachmentStatus"] = policyAttachment.AttachmentStatus,
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
        ctx.export("connectionRouteAggregationId", policyAttachment.id());
        ctx.export("connectionRouteAggregationConnectionId", policyAttachment.connectionId());
        ctx.export("connectionRouteAggregationType", policyAttachment.type());
        ctx.export("connectionRouteAggregationAttachmentStatus", policyAttachment.attachmentStatus());
    }
}
```
```yaml
resources:
  policyAttachment:
    type: equinix:FabricConnectionRouteAggregation
    name: policy_attachment
    properties:
      routeAggregationId: <route_aggregation_id>
      connectionId: <connection_id>
outputs:
  connectionRouteAggregationId: ${policyAttachment.id}
  connectionRouteAggregationConnectionId: ${policyAttachment.connectionId}
  connectionRouteAggregationType: ${policyAttachment.type}
  connectionRouteAggregationAttachmentStatus: ${policyAttachment.attachmentStatus}
```
{{% /example %}}
