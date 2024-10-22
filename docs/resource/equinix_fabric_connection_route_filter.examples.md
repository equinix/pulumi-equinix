## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const policyAttachment = new equinix.fabric.ConnectionRouteFilter("policyAttachment", {
    connectionId: "<connection_uuid>",
    routeFilterId: "<route_filter_policy_uuid>",
    direction: "INBOUND",
});
export const connectionRouteFilterId = policyAttachment.id;
export const connectionRouteFilterConnectionId = policyAttachment.connectionId;
export const connectionRouteFilterDirection = policyAttachment.direction;
export const connectionRouteFilterType = policyAttachment.type;
export const connectionRouteFilterAttachmentStatus = policyAttachment.attachmentStatus;
```
```python
import pulumi
import pulumi_equinix as equinix

policy_attachment = equinix.fabric.ConnectionRouteFilter("policyAttachment",
    connection_id="<connection_uuid>",
    route_filter_id="<route_filter_policy_uuid>",
    direction="INBOUND")
pulumi.export("connectionRouteFilterId", policy_attachment.id)
pulumi.export("connectionRouteFilterConnectionId", policy_attachment.connection_id)
pulumi.export("connectionRouteFilterDirection", policy_attachment.direction)
pulumi.export("connectionRouteFilterType", policy_attachment.type)
pulumi.export("connectionRouteFilterAttachmentStatus", policy_attachment.attachment_status)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		policyAttachment, err := fabric.NewConnectionRouteFilter(ctx, "policyAttachment", &fabric.ConnectionRouteFilterArgs{
			ConnectionId:  pulumi.String("<connection_uuid>"),
			RouteFilterId: pulumi.String("<route_filter_policy_uuid>"),
			Direction:     pulumi.String("INBOUND"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionRouteFilterId", policyAttachment.ID())
		ctx.Export("connectionRouteFilterConnectionId", policyAttachment.ConnectionId)
		ctx.Export("connectionRouteFilterDirection", policyAttachment.Direction)
		ctx.Export("connectionRouteFilterType", policyAttachment.Type)
		ctx.Export("connectionRouteFilterAttachmentStatus", policyAttachment.AttachmentStatus)
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
    var policyAttachment = new Equinix.Fabric.ConnectionRouteFilter("policyAttachment", new()
    {
        ConnectionId = "<connection_uuid>",
        RouteFilterId = "<route_filter_policy_uuid>",
        Direction = "INBOUND",
    });

    return new Dictionary<string, object?>
    {
        ["connectionRouteFilterId"] = policyAttachment.Id,
        ["connectionRouteFilterConnectionId"] = policyAttachment.ConnectionId,
        ["connectionRouteFilterDirection"] = policyAttachment.Direction,
        ["connectionRouteFilterType"] = policyAttachment.Type,
        ["connectionRouteFilterAttachmentStatus"] = policyAttachment.AttachmentStatus,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.ConnectionRouteFilter;
import com.pulumi.equinix.fabric.ConnectionRouteFilterArgs;
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
        var policyAttachment = new ConnectionRouteFilter("policyAttachment", ConnectionRouteFilterArgs.builder()
            .connectionId("<connection_uuid>")
            .routeFilterId("<route_filter_policy_uuid>")
            .direction("INBOUND")
            .build());

        ctx.export("connectionRouteFilterId", policyAttachment.id());
        ctx.export("connectionRouteFilterConnectionId", policyAttachment.connectionId());
        ctx.export("connectionRouteFilterDirection", policyAttachment.direction());
        ctx.export("connectionRouteFilterType", policyAttachment.type());
        ctx.export("connectionRouteFilterAttachmentStatus", policyAttachment.attachmentStatus());
    }
}
```
```yaml
resources:
  policyAttachment:
    type: equinix:fabric:ConnectionRouteFilter
    name: policy_attachment
    properties:
      connectionId: <connection_uuid>
      routeFilterId: <route_filter_policy_uuid>
      direction: INBOUND
outputs:
  connectionRouteFilterId: ${policyAttachment.id}
  connectionRouteFilterConnectionId: ${policyAttachment.connectionId}
  connectionRouteFilterDirection: ${policyAttachment.direction}
  connectionRouteFilterType: ${policyAttachment.type}
  connectionRouteFilterAttachmentStatus: ${policyAttachment.attachmentStatus}
```
{{% /example %}}
