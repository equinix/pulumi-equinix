using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var metal2Aws = new Equinix.Fabric.Connection("metal2aws", new()
    {
        Name = "ConnectionName",
        Type = "EVPLAN_VC",
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
                Type = "METAL_NETWORK",
                AuthenticationKey = "<metal_authorization_code>",
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
    });

});

