using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var tfOrganization1 = new Equinix.Metal.Organization("tfOrganization1", new()
    {
        Name = "foobar",
        Description = "quux",
    });

});

