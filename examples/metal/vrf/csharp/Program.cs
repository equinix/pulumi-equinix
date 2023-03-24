using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "DA";
    var vrf = new Equinix.Metal.Vrf("vrf", new()
    {
        Description = "VRF with ASN 65000 and a pool of address space",
        Name = "example-vrf",
        Metro = metro,
        LocalAsn = 65000,
        IpRanges = new[]
        {
            "192.168.100.0/25",
            "192.168.200.0/25",
        },
        ProjectId = projectId,
    });

    return new Dictionary<string, object?>
    {
        ["vrfId"] = vrf.Id,
    };
});

