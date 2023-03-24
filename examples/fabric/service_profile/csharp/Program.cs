using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var profile = new Equinix.Fabric.ServiceProfile("profile", new()
    {
        Name = "Example Cloud Provider",
        Description = "50 to 500 Mbps Hosted Connection to Example Cloud",
        Type = "L2_PROFILE",
        AccessPointTypeConfigs = new[]
        {
            new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigArgs
            {
                Type = "COLO",
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
        Account = new Equinix.Fabric.Inputs.ServiceProfileAccountArgs
        {
            OrganizationName = "Example Cloud",
            GlobalOrganizationName = "Example Global",
        },
        Metros = null,
        Visibility = "PUBLIC",
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

