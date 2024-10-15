using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var aSide = Equinix.Fabric.GetPorts.Invoke(new()
    {
        Filter = new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
        {
            Name = "<name_of_port||port_prefix>",
        },
    });

    var example = new Equinix.Metal.Interconnection("example", new()
    {
        Name = "tf-metal-2-port",
        ProjectId = "<metal_project_id>",
        Type = "shared",
        Redundancy = "redundant",
        Metro = "FR",
        Speed = "1Gbps",
        ServiceTokenType = "a_side",
        ContactEmail = "username@example.com",
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-2-port",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = new[]
                {
                    "username@example.com",
                },
            },
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = "<fabric_project_id>",
        },
        Bandwidth = 100,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionASideServiceTokenArgs
            {
                Uuid = example.ServiceTokens.Apply(serviceTokens => serviceTokens[0].Id),
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointPortArgs
                {
                    Uuid = aSide.Apply(getPortsResult => getPortsResult.Data[0]?.Uuid),
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanTag = 1234,
                },
            },
        },
    });

});

