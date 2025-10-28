## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newStreamAlertRule = new equinix.fabric.StreamAlertRule("newStreamAlertRule", {
    streamId: "<stream_id>",
    name: "<name>",
    type: "METRIC_ALERT",
    description: "<description>",
    enabled: true,
    operand: "ABOVE",
    windowSize: "<window_size>",
    warningThreshold: "<warning_threshold>",
    criticalThreshold: "<critical_threshold>",
    metricName: "equinix.fabric.connection.bandwidth_tx.usage",
    resourceSelector: {
        includes: ["*/connections/<connection_id>"],
    },
});
export const streamAlertRuleType = newStreamAlertRule.type;
export const streamAlertRuleId = newStreamAlertRule.uuid;
export const streamAlertRuleStreamId = newStreamAlertRule.streamId;
export const streamAlertRuleState = newStreamAlertRule.state;
```
```python
import pulumi
import pulumi_equinix as equinix

new_stream_alert_rule = equinix.fabric.StreamAlertRule("newStreamAlertRule",
    stream_id="<stream_id>",
    name="<name>",
    type="METRIC_ALERT",
    description="<description>",
    enabled=True,
    operand="ABOVE",
    window_size="<window_size>",
    warning_threshold="<warning_threshold>",
    critical_threshold="<critical_threshold>",
    metric_name="equinix.fabric.connection.bandwidth_tx.usage",
    resource_selector={
        "includes": ["*/connections/<connection_id>"],
    })
pulumi.export("streamAlertRuleType", new_stream_alert_rule.type)
pulumi.export("streamAlertRuleId", new_stream_alert_rule.uuid)
pulumi.export("streamAlertRuleStreamId", new_stream_alert_rule.stream_id)
pulumi.export("streamAlertRuleState", new_stream_alert_rule.state)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		newStreamAlertRule, err := fabric.NewStreamAlertRule(ctx, "newStreamAlertRule", &fabric.StreamAlertRuleArgs{
			StreamId:          pulumi.String("<stream_id>"),
			Name:              pulumi.String("<name>"),
			Type:              pulumi.String("METRIC_ALERT"),
			Description:       pulumi.String("<description>"),
			Enabled:           pulumi.Bool(true),
			Operand:           pulumi.String("ABOVE"),
			WindowSize:        pulumi.String("<window_size>"),
			WarningThreshold:  pulumi.String("<warning_threshold>"),
			CriticalThreshold: pulumi.String("<critical_threshold>"),
			MetricName:        pulumi.String("equinix.fabric.connection.bandwidth_tx.usage"),
			ResourceSelector: &fabric.StreamAlertRuleResourceSelectorArgs{
				Includes: pulumi.StringArray{
					pulumi.String("*/connections/<connection_id>"),
				},
			},
		})
		if err != nil {
			return err
		}
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
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var newStreamAlertRule = new Equinix.Fabric.StreamAlertRule("newStreamAlertRule", new()
    {
        StreamId = "<stream_id>",
        Name = "<name>",
        Type = "METRIC_ALERT",
        Description = "<description>",
        Enabled = true,
        Operand = "ABOVE",
        WindowSize = "<window_size>",
        WarningThreshold = "<warning_threshold>",
        CriticalThreshold = "<critical_threshold>",
        MetricName = "equinix.fabric.connection.bandwidth_tx.usage",
        ResourceSelector = new Equinix.Fabric.Inputs.StreamAlertRuleResourceSelectorArgs
        {
            Includes = new[]
            {
                "*/connections/<connection_id>",
            },
        },
    });

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
import com.equinix.equinix.fabric.StreamAlertRule;
import com.equinix.equinix.fabric.StreamAlertRuleArgs;
import com.pulumi.equinix.fabric.inputs.StreamAlertRuleResourceSelectorArgs;
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
        var newStreamAlertRule = new StreamAlertRule("newStreamAlertRule", StreamAlertRuleArgs.builder()
            .streamId("<stream_id>")
            .name("<name>")
            .type("METRIC_ALERT")
            .description("<description>")
            .enabled(true)
            .operand("ABOVE")
            .windowSize("<window_size>")
            .warningThreshold("<warning_threshold>")
            .criticalThreshold("<critical_threshold>")
            .metricName("equinix.fabric.connection.bandwidth_tx.usage")
            .resourceSelector(StreamAlertRuleResourceSelectorArgs.builder()
                .includes("*/connections/<connection_id>")
                .build())
            .build());

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
    type: equinix:fabric:StreamAlertRule
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
        includes:
          - '*/connections/<connection_id>'
outputs:
  streamAlertRuleType: ${newStreamAlertRule.type}
  streamAlertRuleId: ${newStreamAlertRule.uuid}
  streamAlertRuleStreamId: ${newStreamAlertRule.streamId}
  streamAlertRuleState: ${newStreamAlertRule.state}
```
{{% /example %}}
