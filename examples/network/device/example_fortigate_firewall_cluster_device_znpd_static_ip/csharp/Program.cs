using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sv = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        MetroCode = "SV",
        Name = "account-name",
    });

    var fGVMSV = new Equinix.NetworkEdge.Device("FGVM-SV", new()
    {
        Name = "tf-fgvm-cluster-static-znpd",
        MetroCode = "DC",
        TypeCode = "FG-VM",
        ProjectId = "xxxxxxx",
        SelfManaged = true,
        Connectivity = "PRIVATE",
        Byol = true,
        PackageCode = "VM02",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = xxxxxx,
        Version = "7.6.2",
        InterfaceCount = 10,
        CoreCount = 2,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "sanity1",
            KeyName = "",
        },
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            ClusterName = "tf-fgvm--cluster",
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    IpAddress = "x.x.x.x",
                    SubnetMaskIp = "x.x.x.x",
                    GatewayIp = "x.x.x.x",
                    ManagementInterfaceId = "5",
                    Hostname = "test",
                    IpAddressType = "STATIC",
                },
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    IpAddress = "x.x.x.x",
                    SubnetMaskIp = "x.x.x.x",
                    GatewayIp = "x.x.x.x",
                    ManagementInterfaceId = "5",
                    Hostname = "test",
                    IpAddressType = "STATIC",
                },
            },
        },
    });

});

