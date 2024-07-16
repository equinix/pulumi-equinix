using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var vd2AzurePrimary = new Equinix.Fabric.Connection("vd2azurePrimary", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "CLOUD",
                    Id = 7,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
            },
        },
    });

    var vd2AzureSecondary = new Equinix.Fabric.Connection("vd2azureSecondary", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "SECONDARY",
            Group = vd2AzurePrimary.Redundancy.Apply(redundancy => redundancy?.Group),
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
        Bandwidth = 50,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.VD,
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = "<device_uuid>",
                },
                Interface = new Equinix.Fabric.Inputs.ConnectionASideAccessPointInterfaceArgs
                {
                    Type = "CLOUD",
                    Id = 5,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
            },
        },
    });

});

