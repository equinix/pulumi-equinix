using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var pxe1 = new Equinix.Metal.Device("pxe1", new()
    {
        Hostname = "tf.coreos2-pxe",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = Equinix.Metal.OperatingSystem.CustomIPXE,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
        IpxeScriptUrl = "https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
        AlwaysPxe = false,
        UserData = userData,
        CustomData = customData,
        Behavior = new Equinix.Metal.Inputs.DeviceBehaviorArgs
        {
            AllowChanges = new[]
            {
                "custom_data",
                "user_data",
            },
        },
    });

});

