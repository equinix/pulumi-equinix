using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var speedInMbps = config.GetNumber("speedInMbps") ?? 50;
    var linkProtocolType = config.Get("linkProtocolType") ?? "QINQ";
    var linkProtocolStag = config.GetNumber("linkProtocolStag") ?? 2019;
    var linkProtocolCtag = config.GetNumber("linkProtocolCtag") ?? 2112;
    var portName = config.Require("portName");
    var serviceProfileName = config.Get("serviceProfileName") ?? "AWS Direct Connect";
    var serviceProfileRegion = config.Get("serviceProfileRegion") ?? "us-west-1";
    var serviceProfileMetro = config.Get("serviceProfileMetro") ?? "SV";
    var serviceProfileAuthKey = config.Require("serviceProfileAuthKey");
    var serviceProfileId = Equinix.Fabric.GetServiceProfiles.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetServiceProfilesFilterInputArgs
        {
            Property = "/name",
            Operator = "=",
            Values = new[]
            {
                serviceProfileName,
            },
        },
    }).Apply(invoke => invoke.Data?.Uuid);

    var portId = Equinix.Fabric.GetPorts.Invoke(new()
    {
        Filters = new[]
        {
            new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
            {
                Name = portName,
            },
        },
    }).Apply(invoke => invoke.Data?.Uuid);

    var colo2Aws = new Equinix.Fabric.Connection("colo2Aws", new()
    {
        Name = "colo2Aws",
        Type = "EVPL_VC",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = "ALL",
                Emails = new[]
                {
                    "example@equinix.com",
                },
            },
        },
        Bandwidth = speedInMbps,
        Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "COLO",
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = portId,
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = linkProtocolType,
                    VlanSTag = linkProtocolStag,
                    VlanTag = linkProtocolCtag,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = "SP",
                AuthenticationKey = serviceProfileAuthKey,
                SellerRegion = serviceProfileRegion,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = "L2_PROFILE",
                    Uuid = serviceProfileId,
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = serviceProfileMetro,
                },
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["connectionId"] = colo2Aws.Id.Apply(id => $"http://{id}"),
    };
});

