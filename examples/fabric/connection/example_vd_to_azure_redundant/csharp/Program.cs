using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var vd2AzurePrimary = new Equinix.Fabric.Connection("vd2azure_primary", new()
    {
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
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
                    Type = "CLOUD",
                    Id = 7,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
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

    var vd2AzureSecondary = new Equinix.Fabric.Connection("vd2azure_secondary", new()
    {
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "SECONDARY",
            Group = vd2AzurePrimary.Redundancy.Apply(redundancy => redundancy?.Group),
        },
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
                    Type = "CLOUD",
                    Id = 5,
                },
                Type = Equinix.Fabric.AccessPointType.VD,
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<Azure_Service_Profile_UUID>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<Azure_ExpressRouter_Auth_Key>",
                PeeringType = Equinix.Fabric.AccessPointPeeringType.Private,
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

