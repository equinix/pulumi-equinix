using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Fabric.ServiceToken("test", new()
    {
        Type = "VC_TOKEN",
        Description = "Aside COLO Service Token",
        ExpirationDateTime = "2025-01-18T06:43:49.981Z",
        ServiceTokenConnections = new[]
        {
            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionArgs
            {
                Type = "EVPL_VC",
                BandwidthLimit = 1000,
                ASides = new[]
                {
                    new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideArgs
                    {
                        AccessPointSelectors = new[]
                        {
                            new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs
                            {
                                Type = "COLO",
                                Port = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs
                                {
                                    Uuid = "<port_uuid>",
                                },
                                LinkProtocol = new Equinix.Fabric.Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs
                                {
                                    Type = "DOT1Q",
                                    VlanTag = 2987,
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

