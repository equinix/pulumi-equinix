using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var metro = config.Get("metro") ?? "FR";
    var speedInMbps = config.GetInt32("speedInMbps") ?? 50;
    var fabricPortName = config.Require("fabricPortName");
    var awsRegion = config.Get("awsRegion") ?? "eu-central-1";
    var awsAccountId = config.Require("awsAccountId");
    var serviceProfileId = Equinix.Fabric.GetServiceProfiles.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetServiceProfilesFilterInputArgs
        {
            Property = "/name",
            Operator = "=",
            Values = new[]
            {
                "AWS Direct Connect",
            },
        },
    }).Apply(invoke => invoke.Data[0]?.Uuid);

    var portId = Equinix.Fabric.GetPorts.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
        {
            Name = fabricPortName,
        },
    }).Apply(invoke => invoke.Data[0]?.Uuid);

    var colo2Aws = new Equinix.Fabric.Connection("colo2Aws", new()
    {
        Name = "Pulumi-colo2Aws",
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
                    Type = "DOT1Q",
                    VlanTag = 1234,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = "SP",
                AuthenticationKey = awsAccountId,
                SellerRegion = awsRegion,
                Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
                {
                    Type = "L2_PROFILE",
                    Uuid = serviceProfileId,
                },
                Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
                {
                    MetroCode = metro,
                },
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["connectionId"] = colo2Aws.Id,
        ["connectionStatus"] = colo2Aws.Operation.Apply(operation => operation.EquinixStatus),
        ["connectionProviderStatus"] = colo2Aws.Operation.Apply(operation => operation.ProviderStatus),
        ["awsDirectConnectId"] = colo2Aws.ZSide.Apply(zSide => zSide.AccessPoint?.ProviderConnectionId),
    };
});

