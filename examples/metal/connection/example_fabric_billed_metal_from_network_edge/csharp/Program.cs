using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.Vrf("example", new()
    {
        Name = "tf-metal-from-ne",
        Metro = "FR",
        LocalAsn = 65001,
        IpRanges = new[]
        {
            "10.99.1.0/24",
        },
        ProjectId = test.Id,
    });

    var exampleInterconnection = new Equinix.Metal.Interconnection("exampleInterconnection", new()
    {
        Name = "tf-metal-from-ne",
        ProjectId = "<metal_project_id>",
        Type = "shared",
        Redundancy = "primary",
        Metro = "FR",
        Speed = "200Mbps",
        ServiceTokenType = "z_side",
        ContactEmail = "username@example.com",
        Vrfs = new[]
        {
            example.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-metal-from-ne",
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
                Type = Equinix.Fabric.AccessPointType.VD,
                VirtualDevice = new Equinix.Fabric.Inputs.ConnectionASideAccessPointVirtualDeviceArgs
                {
                    Type = "EDGE",
                    Uuid = exampleEquinixNetworkDevice.Id,
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

