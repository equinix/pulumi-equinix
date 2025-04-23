## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const policyAttachment = new equinix.fabric.ConnectionRouteAggregation("policyAttachment", {
    routeAggregationId: "<route_aggregation_id>",
    connectionId: "<connection_id>",
});
export const connectionRouteAggregationId = policyAttachment.id;
export const connectionRouteAggregationConnectionId = policyAttachment.connectionId;
export const connectionRouteAggregationType = policyAttachment.type;
export const connectionRouteAggregationAttachmentStatus = policyAttachment.attachmentStatus;
```
```python
import pulumi
import pulumi_equinix as equinix

policy_attachment = equinix.fabric.ConnectionRouteAggregation("policyAttachment",
    route_aggregation_id="<route_aggregation_id>",
    connection_id="<connection_id>")
pulumi.export("connectionRouteAggregationId", policy_attachment.id)
pulumi.export("connectionRouteAggregationConnectionId", policy_attachment.connection_id)
pulumi.export("connectionRouteAggregationType", policy_attachment.type)
pulumi.export("connectionRouteAggregationAttachmentStatus", policy_attachment.attachment_status)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		policyAttachment, err := fabric.NewConnectionRouteAggregation(ctx, "policyAttachment", &fabric.ConnectionRouteAggregationArgs{
			RouteAggregationId: pulumi.String("<route_aggregation_id>"),
			ConnectionId:       pulumi.String("<connection_id>"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionRouteAggregationId", policyAttachment.ID())
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
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var policyAttachment = new Equinix.Fabric.ConnectionRouteAggregation("policyAttachment", new()
    {
        RouteAggregationId = "<route_aggregation_id>",
        ConnectionId = "<connection_id>",
    });

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
import com.pulumi.equinix.fabric.ConnectionRouteAggregation;
import com.pulumi.equinix.fabric.ConnectionRouteAggregationArgs;
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
        var policyAttachment = new ConnectionRouteAggregation("policyAttachment", ConnectionRouteAggregationArgs.builder()
            .routeAggregationId("<route_aggregation_id>")
            .connectionId("<connection_id>")
            .build());

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
    type: equinix:fabric:ConnectionRouteAggregation
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
