using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var tfProject1 = new Equinix.Metal.Project("tfProject1", new()
    {
        Name = "Terraform Fun",
    });

});

