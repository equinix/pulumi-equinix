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

    var panwCluster = new Equinix.NetworkEdge.Device("panwCluster", new()
    {
        Name = "tf-panw",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "PA-VM",
        SelfManaged = true,
        Byol = true,
        PackageCode = "VM100",
        Notifications = new[]
        {
            "john@equinix.com",
            "marry@equinix.com",
            "fred@equinix.com",
        },
        TermLength = 12,
        AccountNumber = sv.Apply(getAccountResult => getAccountResult.Number),
        Version = "10.1.3",
        InterfaceCount = 10,
        CoreCount = 2,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
        ClusterDetails = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsArgs
        {
            ClusterName = "tf-panw-cluster",
            Node0 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode0VendorConfigurationArgs
                {
                    Hostname = "panw-node0",
                },
                LicenseToken = "licenseToken",
            },
            Node1 = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1Args
            {
                VendorConfiguration = new Equinix.NetworkEdge.Inputs.DeviceClusterDetailsNode1VendorConfigurationArgs
                {
                    Hostname = "panw-node1",
                },
                LicenseToken = "licenseToken",
            },
        },
    });

});

