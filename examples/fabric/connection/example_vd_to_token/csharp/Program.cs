using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var vd2Token = new Equinix.Fabric.Connection("vd2token", new()
    {
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "NETWORK",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionZSideServiceTokenArgs
            {
                Uuid = "<service_token_uuid>",
            },
        },
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
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 50,
    });

});

