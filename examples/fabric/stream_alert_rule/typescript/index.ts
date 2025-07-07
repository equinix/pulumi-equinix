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
