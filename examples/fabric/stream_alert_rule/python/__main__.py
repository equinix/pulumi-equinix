import pulumi

pulumi.export("streamAlertRuleType", new_stream_alert_rule["type"])
pulumi.export("streamAlertRuleId", new_stream_alert_rule["uuid"])
pulumi.export("streamAlertRuleStreamId", new_stream_alert_rule["streamId"])
pulumi.export("streamAlertRuleState", new_stream_alert_rule["state"])
