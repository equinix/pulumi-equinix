using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var example = new Equinix.Metal.ReservedIpBlock("example", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Quantity = 2,
    });

    var nodes = new Equinix.Metal.Device("nodes", new()
    {
        ProjectId = projectId,
        Metro = "sv",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        OperatingSystem = "ubuntu_24_04",
        Hostname = "test",
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        IpAddresses = new[]
        {
            new Equinix.Metal.Inputs.DeviceIpAddressArgs
            {
                Type = "public_ipv4",
                Cidr = 31,
                ReservationIds = new[]
                {
                    example.Id,
                },
            },
            new Equinix.Metal.Inputs.DeviceIpAddressArgs
            {
                Type = "private_ipv4",
            },
        },
    });

});

