using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var port2Aws = new Equinix.Fabric.Connection("port2aws", new()
    {
        Name = "ConnectionName",
        Type = Equinix.Fabric.ConnectionType.EVPL,
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
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323929",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = "<aside_port_uuid>",
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.QinQ,
                    VlanSTag = 2019,
                    VlanCTag = 2112,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.SP,
                AuthenticationKey = "<aws_account_id>",
                SellerRegion = "us-west-1",
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = Equinix.Fabric.ProfileType.L2Profile,
                    Uuid = "<service_profile_uuid>",
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = Equinix.Metro.SiliconValley,
                },
            },
        },
        AdditionalInfo = new[]
        {
            
            {
                { "key", "accessKey" },
                { "value", "<aws_access_key>" },
            },
            
            {
                { "key", "secretKey" },
                { "value", "<aws_secret_key>" },
            },
        },
    });

});

