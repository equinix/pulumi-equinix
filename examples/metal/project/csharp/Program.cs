using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var organizationId = config.Require("organizationId");
    var name = config.Get("name") ?? "Default Project";
    var projectResource = new Equinix.Metal.Project("project", new()
    {
        Name = name,
        OrganizationId = organizationId,
    });

    return new Dictionary<string, object?>
    {
        ["projectId"] = projectResource.Id,
    };
});

