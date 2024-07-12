using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var member = new Equinix.Metal.OrganizationMember("member", new()
    {
        Invitee = "member@example.com",
        Roles = new[]
        {
            "limited_collaborator",
        },
        ProjectsIds = new[]
        {
            projectId,
        },
        OrganizationId = organizationId,
    });

});

