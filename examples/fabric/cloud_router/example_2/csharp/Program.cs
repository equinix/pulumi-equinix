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
        MarketplaceSubscription = new Equinix.Fabric.Inputs.CloudRouterMarketplaceSubscriptionArgs
        {
            Type = "AWS_MARKETPLACE_SUBSCRIPTION",
            Uuid = "2823b8ae07-a2a2-45b4-a658-c3542bb24e9",
        },
    });

});

