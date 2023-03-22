using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var speedInMbps = config.GetNumber("speedInMbps") ?? 50;
    var profile = new Equinix.Fabric.ServiceProfile("profile", new()
    {
        Name = "FOO Cloud",
        Description = "50 to 500 Mbps Hosted Connection to Foo Cloud",
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
                    IntegrationId = "Foo-Connect-01",
                    BandwidthFromApi = false,
                },
                ConnectionLabel = "Virtual Circuit Name",
                AuthenticationKey = new Equinix.Fabric.Inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs
                {
                    Required = true,
                    Label = "FOO ACCOUNT ID",
                },
            },
        },
        Account = new Equinix.Fabric.Inputs.ServiceProfileAccountArgs
        {
            OrganizationName = "Foo",
            GlobalOrganizationName = "Foo Global",
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

