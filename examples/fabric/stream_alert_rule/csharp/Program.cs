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
        MetricSelector = new Equinix.Fabric.Inputs.StreamAlertRuleMetricSelectorArgs
        {
            Includes = new[]
            {
                "equinix.fabric.connection.bandwidth_tx.usage",
            },
        },
        DetectionMethod = new Equinix.Fabric.Inputs.StreamAlertRuleDetectionMethodArgs
        {
            Operand = "ABOVE",
            WindowSize = "<window_size>",
            WarningThreshold = "<warning_threshold>",
            CriticalThreshold = "<critical_threshold>",
        },
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

