using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.UserApiKey("test", new()
    {
        Description = "Read-only user key",
        ReadOnly = true,
    });

});

