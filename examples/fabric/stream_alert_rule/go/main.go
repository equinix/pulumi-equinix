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
