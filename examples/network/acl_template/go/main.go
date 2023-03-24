package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		aclTemplate, err := networkedge.NewAclTemplate(ctx, "aclTemplate", &networkedge.AclTemplateArgs{
			Name:        pulumi.String("test"),
			Description: pulumi.String("Test ACL template"),
			InboundRules: networkedge.AclTemplateInboundRuleArray{
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:      pulumi.String("1.1.1.1/32"),
					Protocol:    pulumi.String("IP"),
					SrcPort:     pulumi.String("any"),
					DstPort:     pulumi.String("any"),
					Description: pulumi.String("inbound rule description"),
				},
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:      pulumi.String("2.2.2.2/28"),
					Protocol:    pulumi.String("TCP"),
					SrcPort:     pulumi.String("any"),
					DstPort:     pulumi.String("any"),
					Description: pulumi.String("inbound rule description"),
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("templateId", aclTemplate.ID())
		return nil
	})
}
