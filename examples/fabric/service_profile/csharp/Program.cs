using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var profile = new Equinix.Fabric.ServiceProfile("profile", new()
    {
        Name = "Example Cloud Provider",
        Description = "50 to 500 Mbps Hosted Connection to Example Cloud",
        Type = Equinix.Fabric.ProfileType.L2Profile,
        AccessPointTypeConfigs = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigArgs
            {
                Type = Equinix.Fabric.ProfileAccessPointType.Colo,
                SupportedBandwidths = new[]
                {
                    50,
                    100,
                    200,
                    500,
                },
                AllowRemoteConnections = true,
                AllowCustomBandwidth = false,
                AllowBandwidthAutoApproval = false,
                LinkProtocolConfig = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs
                {
                    EncapsulationStrategy = "CTAGED",
                    ReuseVlanSTag = false,
                    Encapsulation = "DOT1Q",
                },
                EnableAutoGenerateServiceKey = "false,",
                ConnectionRedundancyRequired = "false,",
                ApiConfig = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigApiConfigArgs
                {
                    ApiAvailable = true,
                    IntegrationId = "Example-Connect-01",
                    BandwidthFromApi = false,
                },
                ConnectionLabel = "Virtual Circuit Name",
                AuthenticationKey = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs
                {
                    Required = true,
                    Label = "Example ACCOUNT ID",
                },
            },
        },
        Metros = null,
        Visibility = Equinix.Fabric.ProfileVisibility.Public,
        MarketingInfo = new Equinix.Fabric.Inputs.ServiceProfileMarketingInfoArgs
        {
            Promotion = true,
        },
    });

    return new Dictionary<string, object?>
    {
        ["profileId"] = profile.Id,
    };
});

