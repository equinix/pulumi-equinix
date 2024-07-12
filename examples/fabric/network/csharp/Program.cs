using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var newNetwork = new Equinix.Fabric.Network("newNetwork", new()
    {
        Name = "Network-SV",
        Type = "EVPLAN",
        Scope = "GLOBAL",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.NetworkNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Project = new Equinix.Fabric.Inputs.NetworkProjectArgs
        {
            ProjectId = "776847000642406",
        },
    });

});

