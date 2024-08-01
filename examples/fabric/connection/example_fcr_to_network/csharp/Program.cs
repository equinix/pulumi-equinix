using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var fcr2Network = new Equinix.Fabric.Connection("fcr2network", new()
    {
        Name = "ConnectionName",
        Type = "IPWAN_VC",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "example@equinix.com",
                    "test1@equinix.com",
                },
            },
        },
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "CLOUD_ROUTER",
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = "<cloud_router_uuid>",
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Network,
                Network = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointNetworkArgs
                {
                    Uuid = "<network_uuid>",
                },
            },
        },
    });

});

