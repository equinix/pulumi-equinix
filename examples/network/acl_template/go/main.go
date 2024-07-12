package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewAclTemplate(ctx, "myacl", &networkedge.AclTemplateArgs{
			Name:        pulumi.String("test"),
			Description: pulumi.String("Test ACL template"),
			ProjectId:   pulumi.String("a86d7112-d740-4758-9c9c-31e66373746b"),
			InboundRules: networkedge.AclTemplateInboundRuleArray{
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:      pulumi.String("1.1.1.1/32"),
					Protocol:    pulumi.String(networkedge.AclRuleProtocolTypeIP),
					SrcPort:     pulumi.String("any"),
					DstPort:     pulumi.String("any"),
					Description: pulumi.String("inbound rule description"),
				},
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:   pulumi.String("172.16.25.0/24"),
					Protocol: pulumi.String(networkedge.AclRuleProtocolTypeUDP),
					SrcPort:  pulumi.String("any"),
					DstPort:  pulumi.String("53,1045,2041"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
