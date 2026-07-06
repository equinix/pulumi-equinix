using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
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

