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

    var infobloxSv = new Equinix.NetworkEdge.Device("INFOBLOX-SV", new()
    {
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    AdminPassword = "xxxxxxx",
                    IpAddress = "X.X.X.X",
                    SubnetMaskIp = "X.X.X.X",
                    GatewayIp = "X.X.X.X",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    AdminPassword = "xxxxxxx",
                    IpAddress = "X.X.X.X",
                    SubnetMaskIp = "X.X.X.X",
                    GatewayIp = "X.X.X.X",
                },
            },
            ClusterName = "tf-infoblox-cluster",
        },
        Name = "TF_INFOBLOX",
        ProjectId = "XXXXXXXXXX",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "INFOBLOX-GRID-MEMBER",
        SelfManaged = true,
        Byol = true,
        PackageCode = "STD",
        Notifications = new[]
        {
            "test@eq.com",
        },
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "9.0.5",
        Connectivity = "PRIVATE",
        CoreCount = 8,
        TermLength = 1,
    });

});

