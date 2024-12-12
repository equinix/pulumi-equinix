using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Fabric.ServiceToken("test", new()
    {
        Type = "VC_TOKEN",
        Description = "Zside COLO Service Token",
        ExpirationDateTime = "2025-01-18T06:43:49.981Z",
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
                                Type = "COLO",
                                Port = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortArgs
                                {
                                    Uuid = "<port_uuid>",
                                },
                                LinkProtocol = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorLinkProtocolArgs
                                {
                                    Type = "DOT1Q",
                                    VlanTag = 2087,
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
                    "test1@equinix.com",
                },
            },
        },
    });

});

