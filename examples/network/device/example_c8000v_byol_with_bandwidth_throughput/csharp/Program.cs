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

    var c8000VByolThroughput = new Equinix.NetworkEdge.Device("c8000v-byol-throughput", new()
    {
        Name = "tf-c8000v-byol",
        MetroCode = sv.Apply(getAccountResult => getAccountResult.MetroCode),
        TypeCode = "C8000V",
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
        Version = "17.11.01a",
        InterfaceCount = 10,
        CoreCount = 2,
        Throughput = 100,
        ThroughputUnit = Equinix.NetworkEdge.ThroughputUnit.Mbps,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = "test",
            KeyName = "test-key",
        },
        AclTemplateId = "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    });

});

