using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var example1 = new Equinix.Metal.Vlan("example1", new()
    {
        ProjectId = myProjectId,
        Metro = "SV",
    });

    var example = new Equinix.Metal.Interconnection("example", new()
    {
        Name = "tf-port-to-metal-legacy",
        ProjectId = myProjectId,
        Metro = "SV",
        Redundancy = "primary",
        Type = "shared_port_vlan",
        ContactEmail = "username@example.com",
        Vlans = new[]
        {
            example1.Vxlan,
        },
    });

    var exampleConnection = new Equinix.Fabric.Connection("exampleConnection", new()
    {
        Name = "tf-NIMF-metal-2-aws-legacy",
        Type = "IP_VC",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.ConnectionNotificationArgs
            {
                Type = Equinix.Fabric.NotificationsType.All,
                Emails = "sername@example.com",
            },
        },
        Project = new Equinix.Fabric.Inputs.ConnectionProjectArgs
        {
            ProjectId = fabricProjectId,
        },
        Bandwidth = 200,
        Order = new Equinix.Fabric.Inputs.ConnectionOrderArgs
        {
            PurchaseOrderNumber = "1-323292",
        },
        ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
            {
                Type = "CLOUD_ROUTER",
                Router = new Equinix.Fabric.Inputs.ConnectionASideAccessPointRouterArgs
                {
                    Uuid = cloudRouterUuid,
                },
            },
        },
        ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
        {
            AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
            {
                Type = "METAL_NETWORK",
                AuthenticationKey = example.AuthorizationCode,
            },
        },
    });

});

