using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var myblock = new Equinix.Metal.ReservedIpBlock("myblock", new()
    {
        ProjectId = projectId,
        Metro = "ny",
        Quantity = 2,
    });

    var firstAddressAssignment = new Equinix.Metal.IpAttachment("firstAddressAssignment", new()
    {
        DeviceId = mydevice.Id,
        CidrNotation = Std.Cidrhost.Invoke(new()
        {
            Input = myblockMetalReservedIpBlock.CidrNotation,
            Host = 0,
        }).Apply(invoke => Std.Join.Invoke(new()
        {
            Separator = "/",
            Input = new[]
            {
                invoke.Result,
                "32",
            },
        })).Apply(invoke => invoke.Result),
    });

});

