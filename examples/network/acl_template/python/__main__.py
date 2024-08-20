import pulumi
import pulumi_equinix as equinix

myacl = equinix.networkedge.AclTemplate("myacl",
    name="test",
    description="Test ACL template",
    project_id="a86d7112-d740-4758-9c9c-31e66373746b",
    inbound_rules=[
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="1.1.1.1/32",
            protocol=equinix.networkedge.AclRuleProtocolType.IP,
            src_port="any",
            dst_port="any",
            description="inbound rule description",
        ),
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="172.16.25.0/24",
            protocol=equinix.networkedge.AclRuleProtocolType.UDP,
            src_port="any",
            dst_port="53,1045,2041",
        ),
    ])
