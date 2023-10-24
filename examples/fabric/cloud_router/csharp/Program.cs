using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var metro = config.Get("metro") ?? "FR";
    var accountNum = config.RequireInt32("accountNum");
    var router = new Equinix.Fabric.CloudRouter("router", new()
    {
        Name = "My-Fabric-Cloud-Router",
        Type = "XF_ROUTER",
        Location = new Equinix.Fabric.Inputs.CloudRouterLocationArgs
        {
            MetroCode = metro,
        },
        Package = new Equinix.Fabric.Inputs.CloudRouterPackageArgs
        {
            Code = "BASIC",
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.CloudRouterNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                },
            },
        },
        Account = new Equinix.Fabric.Inputs.CloudRouterAccountArgs
        {
            AccountNumber = 272010,
        },
    });

    return new Dictionary<string, object?>
    {
        ["routerId"] = router.Id,
    };
});

