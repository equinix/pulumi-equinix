using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var organizationId = config.Require("organizationId");
    var projectId = config.Require("projectId");
    var userEmailAddress = config.Require("userEmailAddress");
    var member = new Equinix.Metal.OrganizationMember("member", new()
    {
        Invitee = userEmailAddress,
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

    return new Dictionary<string, object?>
    {
        ["memberId"] = member.Id,
        ["memberState"] = member.State,
    };
});

