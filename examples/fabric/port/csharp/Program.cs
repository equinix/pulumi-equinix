using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var order = new Equinix.Fabric.Port("order", new()
    {
        Type = "XF_PORT",
        ConnectivitySourceType = "COLO",
        Location = new Equinix.Fabric.Inputs.PortLocationArgs
        {
            MetroCode = "TR",
        },
        Settings = new Equinix.Fabric.Inputs.PortSettingsArgs
        {
            PackageType = "STANDARD",
            SharedPortType = false,
        },
        Encapsulation = new Equinix.Fabric.Inputs.PortEncapsulationArgs
        {
            Type = "DOT1Q",
            TagProtocolId = "33024",
        },
        Account = new Equinix.Fabric.Inputs.PortAccountArgs
        {
            AccountNumber = "<account_number>",
        },
        Project = new Equinix.Fabric.Inputs.PortProjectArgs
        {
            ProjectId = "<project_id>",
        },
        Redundancy = new Equinix.Fabric.Inputs.PortRedundancyArgs
        {
            Priority = "PRIMARY",
        },
        LagEnabled = true,
        PhysicalPorts = new[]
        {
            new Equinix.Fabric.Inputs.PortPhysicalPortArgs
            {
                Type = "XF_PHYSICAL_PORT",
                DemarcationPoint = new Equinix.Fabric.Inputs.PortPhysicalPortDemarcationPointArgs
                {
                    Ibx = "TR2",
                    CageUniqueSpaceId = "TR2:01:002087",
                    CabinetUniqueSpaceId = "Demarc",
                    PatchPanel = "PP:Demarc:00002087",
                    ConnectorType = "SC",
                },
            },
        },
        PhysicalPortsSpeed = 1000,
        PhysicalPortsType = "1000BASE_LX",
        PhysicalPortsCount = 1,
        DemarcationPointIbx = "TR2",
        Notifications = new[]
        {
            new Equinix.Fabric.Inputs.PortNotificationArgs
            {
                Type = "TECHNICAL",
                RegisteredUsers = new[]
                {
                    "<username>",
                },
            },
            new Equinix.Fabric.Inputs.PortNotificationArgs
            {
                Type = "NOTIFICATION",
                RegisteredUsers = new[]
                {
                    "<username>",
                },
            },
        },
        AdditionalInfos = new[]
        {
            new Equinix.Fabric.Inputs.PortAdditionalInfoArgs
            {
                Key = "lagType",
                Value = "New",
            },
        },
    });

});

