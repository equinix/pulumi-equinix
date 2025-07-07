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
