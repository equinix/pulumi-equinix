import pulumi
import pulumi_equinix as equinix

acl_template = equinix.networkedge.AclTemplate("aclTemplate",
    name="test",
    description="Test ACL template",
    inbound_rules=[
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="1.1.1.1/32",
            protocol=equinix.networkedge.AclRuleProtocolType.IP,
            src_port="any",
            dst_port="any",
            description="inbound rule description",
        ),
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="2.2.2.2/28",
            protocol=equinix.networkedge.AclRuleProtocolType.TCP,
            src_port="any",
            dst_port="any",
            description="inbound rule description",
        ),
    ])
pulumi.export("templateId", acl_template.id)
