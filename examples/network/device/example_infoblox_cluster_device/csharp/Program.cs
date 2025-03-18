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

    var iNFOBLOXSV = new Equinix.NetworkEdge.Device("INFOBLOX-SV", new()
    {
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
        Hostname = "test",
        Connectivity = "PRIVATE",
        CoreCount = 8,
        TermLength = 1,
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            ClusterName = "tf-infoblox-cluster",
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    AdminPassword = "Welcome@1",
                    IpAddress = "192.168.1.35",
                    SubnetMaskIp = "255.255.255.0",
                    GatewayIp = "192.168.1.1",
                    Hostname = "test",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    AdminPassword = "Welcome@1",
                    IpAddress = "192.168.1.35",
                    SubnetMaskIp = "255.255.255.0",
                    GatewayIp = "192.168.1.1",
                    Hostname = "test",
                },
            },
        },
    });

});

