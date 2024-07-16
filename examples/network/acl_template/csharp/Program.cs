using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var myacl = new Equinix.NetworkEdge.AclTemplate("myacl", new()
    {
        Name = "test",
        Description = "Test ACL template",
        ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        InboundRules = new[]
        {
            new Equinix.NetworkEdge.Inputs.AclTemplateInboundRuleArgs
            {
                Subnet = "1.1.1.1/32",
                Protocol = Equinix.NetworkEdge.AclRuleProtocolType.IP,
                SrcPort = "any",
                DstPort = "any",
                Description = "inbound rule description",
            },
            new Equinix.NetworkEdge.Inputs.AclTemplateInboundRuleArgs
            {
                Subnet = "172.16.25.0/24",
                Protocol = Equinix.NetworkEdge.AclRuleProtocolType.UDP,
                SrcPort = "any",
                DstPort = "53,1045,2041",
            },
        },
    });

});

