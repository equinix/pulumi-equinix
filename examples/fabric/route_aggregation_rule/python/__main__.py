import pulumi

pulumi.export("routeAggregationRuleName", ra_rule["name"])
pulumi.export("routeAggregationRuleDescription", ra_rule["description"])
pulumi.export("routeAggregationRuleType", ra_rule["type"])
pulumi.export("routeAggregationRulePrefix", ra_rule["prefix"])
pulumi.export("routeAggregationRuleState", ra_rule["state"])
