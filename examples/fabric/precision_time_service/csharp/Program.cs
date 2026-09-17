using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var ptp = new Equinix.Fabric.PrecisionTimeService("ptp", new()
    {
        Type = "PTP",
        Name = "tf_acc_eptptp_PFCR",
        Package = new Equinix.Fabric.Inputs.PrecisionTimeServicePackageArgs
        {
            Code = "PTP_STANDARD",
        },
        Connections = new[]
        {
            new Equinix.Fabric.Inputs.PrecisionTimeServiceConnectionArgs
            {
                Uuid = "<connection_id>",
            },
        },
        Ipv4 = new Equinix.Fabric.Inputs.PrecisionTimeServiceIpv4Args
        {
            Primary = "191.168.254.241",
            Secondary = "191.168.254.242",
            NetworkMask = "255.255.255.240",
            DefaultGateway = "191.168.254.254",
        },
    });

    return new Dictionary<string, object?>
    {
        ["eptServiceId"] = ptp.Id,
        ["eptServiceName"] = ptp.Name,
        ["eptServiceState"] = ptp.State,
        ["eptServiceType"] = ptp.Type,
        ["eptServiceConnection"] = ptp.Connections,
        ["eptServiceIpv4"] = ptp.Ipv4,
    };
});

