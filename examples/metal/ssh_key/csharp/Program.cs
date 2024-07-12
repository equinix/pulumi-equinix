using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var key1 = new Equinix.Metal.SshKey("key1", new()
    {
        Name = "terraform-1",
        PublicKey = Std.File.Invoke(new()
        {
            Input = "/home/terraform/.ssh/id_rsa.pub",
        }).Apply(invoke => invoke.Result),
    });

    var test = new Equinix.Metal.Device("test", new()
    {
        Hostname = "test-device",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    }, new CustomResourceOptions
    {
        DependsOn =
        {
            key1,
        },
    });

});

