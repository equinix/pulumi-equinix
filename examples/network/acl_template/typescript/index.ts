import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const myacl = new equinix.networkedge.AclTemplate("myacl", {
    name: "test",
    description: "Test ACL template",
    projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
    inboundRules: [
        {
            subnet: "1.1.1.1/32",
            protocol: equinix.networkedge.AclRuleProtocolType.IP,
            srcPort: "any",
            dstPort: "any",
            description: "inbound rule description",
        },
        {
            subnet: "172.16.25.0/24",
            protocol: equinix.networkedge.AclRuleProtocolType.UDP,
            srcPort: "any",
            dstPort: "53,1045,2041",
        },
    ],
});
