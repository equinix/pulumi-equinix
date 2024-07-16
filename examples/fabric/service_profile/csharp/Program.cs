using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var newServiceProfile = new Equinix.Fabric.ServiceProfile("newServiceProfile", new()
    {
        Description = "Service Profile for Receiving Connections",
        Name = "Name Of Business + Use Case Tag",
        Type = Equinix.Fabric.ProfileType.L2Profile,
        Visibility = Equinix.Fabric.ProfileVisibility.Public,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileNotificationArgs
            {
                Emails = new[]
                {
                    "someone@sample.com",
                },
                Type = "BANDWIDTH_ALERT",
            },
        },
        AllowedEmails = new[]
        {
            "test@equinix.com",
            "testagain@equinix.com",
        },
        Ports = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfilePortArgs
            {
                Uuid = "c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee",
                Type = "XF_PORT",
            },
        },
        AccessPointTypeConfigs = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigArgs
            {
                Type = Equinix.Fabric.ProfileAccessPointType.Colo,
                AllowRemoteConnections = true,
                AllowCustomBandwidth = true,
                AllowBandwidthAutoApproval = false,
                ConnectionRedundancyRequired = false,
                ConnectionLabel = "Service Profile Tag1",
                BandwidthAlertThreshold = 10,
                SupportedBandwidths = new[]
                {
                    100,
                    500,
                },
            },
        },
    });

});

