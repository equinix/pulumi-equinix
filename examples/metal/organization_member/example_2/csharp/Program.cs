using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var owner = new Equinix.Metal.OrganizationMember("owner", new()
    {
        Invitee = "admin@example.com",
        Roles = new[]
        {
            "owner",
        },
        ProjectsIds = new[] {},
        OrganizationId = organizationId,
    });

});

