using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var aclTemplate = new Equinix.NetworkEdge.AclTemplate("aclTemplate", new()
    {
        Name = "test",
        Description = "Test ACL template",
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
                Subnet = "2.2.2.2/28",
                Protocol = Equinix.NetworkEdge.AclRuleProtocolType.TCP,
                SrcPort = "any",
                DstPort = "any",
                Description = "inbound rule description",
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["templateId"] = aclTemplate.Id,
    };
});

