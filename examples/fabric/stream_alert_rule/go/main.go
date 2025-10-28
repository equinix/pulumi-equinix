package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		newStreamAlertRule, err := fabric.NewStreamAlertRule(ctx, "newStreamAlertRule", &fabric.StreamAlertRuleArgs{
			StreamId:    pulumi.String("<stream_id>"),
			Name:        pulumi.String("<name>"),
			Type:        pulumi.String("METRIC_ALERT"),
			Description: pulumi.String("<description>"),
			Enabled:     pulumi.Bool(true),
			MetricSelector: &fabric.StreamAlertRuleMetricSelectorArgs{
				Includes: pulumi.StringArray{
					pulumi.String("equinix.fabric.connection.bandwidth_tx.usage"),
				},
			},
			DetectionMethod: &fabric.StreamAlertRuleDetectionMethodArgs{
				Operand:           pulumi.String("ABOVE"),
				WindowSize:        pulumi.String("<window_size>"),
				WarningThreshold:  pulumi.String("<warning_threshold>"),
				CriticalThreshold: pulumi.String("<critical_threshold>"),
			},
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
