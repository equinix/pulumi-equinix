using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.Project("example", new()
    {
        Name = "example",
    });

    var exampleVrf = new Equinix.Metal.Vrf("exampleVrf", new()
    {
        Description = "VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
        Name = "example-vrf",
        Metro = "da",
        LocalAsn = 65000,
        IpRanges = new[]
        {
            "192.168.100.0/25",
            "192.168.200.0/25",
        },
        ProjectId = example.Id,
    });

});

