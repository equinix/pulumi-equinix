import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const aclTemplate = new equinix.networkedge.AclTemplate("aclTemplate", {
    name: "test",
    description: "Test ACL template",
    inboundRules: [
        {
            subnet: "1.1.1.1/32",
            protocol: equinix.networkedge.AclRuleProtocolType.IP,
            srcPort: "any",
            dstPort: "any",
            description: "inbound rule description",
        },
        {
            subnet: "2.2.2.2/28",
            protocol: equinix.networkedge.AclRuleProtocolType.TCP,
            srcPort: "any",
            dstPort: "any",
            description: "inbound rule description",
        },
    ],
});
export const templateId = aclTemplate.id;
