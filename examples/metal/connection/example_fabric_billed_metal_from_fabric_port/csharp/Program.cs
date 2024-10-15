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

    var example = new Equinix.Metal.Vlan("example", new()
    {
        ProjectId = "<metal_project_id>",
        Metro = "FR",
    });

    var exampleInterconnection = new Equinix.Metal.Interconnection("exampleInterconnection", new()
    {
        Name = "tf-metal-from-port",
        ProjectId = "<metal_project_id>",
        Type = "shared",
        Redundancy = "primary",
        Metro = "FR",
        Speed = "200Mbps",
        ServiceTokenType = "z_side",
        ContactEmail = "username@example.com",
        Vlans = new[]
        {
            example.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-from-port",
        Type = Equinix.Fabric.ConnectionType.EVPL,
        Bandwidth = 200,
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
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = "<fabric_project_id>",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = Equinix.Fabric.AccessPointType.Colo,
                Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
                {
                    Uuid = aSide.Apply(getPortsResult => getPortsResult.Data[0]?.Uuid),
                },
                LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
                {
                    Type = Equinix.Fabric.AccessPointLinkProtocolType.Dot1q,
                    VlanTag = 1234,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            ServiceToken = new Equinix.Fabric.Inputs.ConnectionZSideServiceTokenArgs
            {
                Uuid = exampleInterconnection.ServiceTokens.Apply(serviceTokens => serviceTokens[0].Id),
            },
        },
    });

});

