using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Fabric.ServiceToken("test", new()
    {
        Type = "VC_TOKEN",
        Description = "Zside Network Service Token",
        ExpirationDateTime = "2025-01-18T06:43:49.986Z",
        ServiceTokenConnections = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionArgs
            {
                Type = "EVPL_VC",
                SupportedBandwidths = new[]
                {
                    50,
                    200,
                    10000,
                },
                ZSides = new[]
                {
                    new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideArgs
                    {
                        AccessPointSelectors = new[]
                        {
                            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArgs
                            {
                                Type = "NETWORK",
                                Network = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkArgs
                                {
                                    Uuid = "<network_uuid>",
                                },
                            },
                        },
                    },
                },
            },
        },
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                },
            },
        },
    });

});

