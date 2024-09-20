using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var newCloudRouter = new Equinix.Fabric.CloudRouter("newCloudRouter", new()
    {
        Name = "Router-SV",
        Type = "XF_ROUTER",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.CloudRouterNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Order = new Equinix.Fabric.Inputs.CloudRouterOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        Location = new Equinix.Fabric.Inputs.CloudRouterLocationArgs
        {
            MetroCode = "SV",
        },
        Package = new Equinix.Fabric.Inputs.CloudRouterPackageArgs
        {
            Code = "STANDARD",
        },
        Project = new Equinix.Fabric.Inputs.CloudRouterProjectArgs
        {
            ProjectId = "776847000642406",
        },
        Account = new Equinix.Fabric.Inputs.CloudRouterAccountArgs
        {
            AccountNumber = 203612,
        },
    });

});

