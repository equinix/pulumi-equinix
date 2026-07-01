## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const connectionRouteFilterId = policyAttachment.id;
export const connectionRouteFilterConnectionId = policyAttachment.connectionId;
export const connectionRouteFilterDirection = policyAttachment.direction;
export const connectionRouteFilterType = policyAttachment.type;
export const connectionRouteFilterAttachmentStatus = policyAttachment.attachmentStatus;
```
```python
import pulumi

pulumi.export("connectionRouteFilterId", policy_attachment["id"])
pulumi.export("connectionRouteFilterConnectionId", policy_attachment["connectionId"])
pulumi.export("connectionRouteFilterDirection", policy_attachment["direction"])
pulumi.export("connectionRouteFilterType", policy_attachment["type"])
pulumi.export("connectionRouteFilterAttachmentStatus", policy_attachment["attachmentStatus"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("connectionRouteFilterId", policyAttachment.Id)
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

return await Deployment.RunAsync(() => 
{
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
    type: equinix:fabricConnectionRouteFilter
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
