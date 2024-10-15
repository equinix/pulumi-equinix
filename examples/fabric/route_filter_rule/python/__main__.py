import pulumi

pulumi.export("routeFilterRuleId", rf_rule["id"])
pulumi.export("routeFilterId", rf_rule["routeFilterId"])
pulumi.export("routeFilterRulePrefix", rf_rule["prefix"])
pulumi.export("routeFilterRulePrefixMatch", rf_rule["prefixMatch"])
