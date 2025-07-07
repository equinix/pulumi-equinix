## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const streamAlertRuleType = newStreamAlertRule.type;
export const streamAlertRuleId = newStreamAlertRule.uuid;
export const streamAlertRuleStreamId = newStreamAlertRule.streamId;
export const streamAlertRuleState = newStreamAlertRule.state;
```
```python
import pulumi

pulumi.export("streamAlertRuleType", new_stream_alert_rule["type"])
pulumi.export("streamAlertRuleId", new_stream_alert_rule["uuid"])
pulumi.export("streamAlertRuleStreamId", new_stream_alert_rule["streamId"])
pulumi.export("streamAlertRuleState", new_stream_alert_rule["state"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("streamAlertRuleType", newStreamAlertRule.Type)
		ctx.Export("streamAlertRuleId", newStreamAlertRule.Uuid)
		ctx.Export("streamAlertRuleStreamId", newStreamAlertRule.StreamId)
		ctx.Export("streamAlertRuleState", newStreamAlertRule.State)
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
        ["streamAlertRuleType"] = newStreamAlertRule.Type,
        ["streamAlertRuleId"] = newStreamAlertRule.Uuid,
        ["streamAlertRuleStreamId"] = newStreamAlertRule.StreamId,
        ["streamAlertRuleState"] = newStreamAlertRule.State,
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
        ctx.export("streamAlertRuleType", newStreamAlertRule.type());
        ctx.export("streamAlertRuleId", newStreamAlertRule.uuid());
        ctx.export("streamAlertRuleStreamId", newStreamAlertRule.streamId());
        ctx.export("streamAlertRuleState", newStreamAlertRule.state());
    }
}
```
```yaml
resources:
  newStreamAlertRule:
    type: equinix:fabricStreamAlertRule
    name: new_stream_alert_rule
    properties:
      streamId: <stream_id>
      name: <name>
      type: METRIC_ALERT
      description: <description>
      enabled: true
      operand: ABOVE
      windowSize: <window_size>
      warningThreshold: <warning_threshold>
      criticalThreshold: <critical_threshold>
      metricName: equinix.fabric.connection.bandwidth_tx.usage
      resourceSelector:
        include:
          - '*/connections/<connection_id>'
outputs:
  streamAlertRuleType: ${newStreamAlertRule.type}
  streamAlertRuleId: ${newStreamAlertRule.uuid}
  streamAlertRuleStreamId: ${newStreamAlertRule.streamId}
  streamAlertRuleState: ${newStreamAlertRule.state}
```
{{% /example %}}
