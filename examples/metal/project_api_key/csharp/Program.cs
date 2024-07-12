using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.ProjectApiKey("test", new()
    {
        ProjectId = existingProjectId,
        Description = "Read-only key scoped to a projct",
        ReadOnly = true,
    });

});

