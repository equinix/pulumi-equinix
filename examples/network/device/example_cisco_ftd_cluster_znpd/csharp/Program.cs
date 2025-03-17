using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
    });

    var ciscoFTDSV = new Equinix.NetworkEdge.Device("cisco-FTD-SV", new()
    {
        Name = "TF_Cisco_NGFW_CLUSTER_ZNPD",
        ProjectId = "XXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "Cisco_NGFW",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "FTDv10",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "7.0.4-55",
        Hostname = "test",
        CoreCount = 4,
        TermLength = 1,
        InterfaceCount = 10,
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            ClusterName = "tf-ftd-cluster",
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    Hostname = "test",
                    ActivationKey = "XXXXX",
                    Controller1 = "X.X.X.X",
                    ManagementType = "FMC",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    Hostname = "test",
                    ManagementType = "FMC",
                },
            },
        },
    });

});

