using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var web1 = new Equinix.Metal.Device("web1", new()
    {
        Hostname = "tftest",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
        HardwareReservationId = "next-available",
        Storage = @"{  \""disks\"": [    {      \""device\"": \""/dev/sda\"",      \""wipeTable\"": true,      \""partitions\"": [        {          \""label\"": \""BIOS\"",          \""number\"": 1,          \""size\"": \""4096\""        },        {          \""label\"": \""SWAP\"",          \""number\"": 2,          \""size\"": \""3993600\""        },        {          \""label\"": \""ROOT\"",          \""number\"": 3,          \""size\"": \""0\""        }      ]    }  ],  \""filesystems\"": [    {      \""mount\"": {        \""device\"": \""/dev/sda3\"",        \""format\"": \""ext4\"",        \""point\"": \""/\"",        \""create\"": {          \""options\"": [            \""-L\"",            \""ROOT\""          ]        }      }    },    {      \""mount\"": {        \""device\"": \""/dev/sda2\"",        \""format\"": \""swap\"",        \""point\"": \""none\"",        \""create\"": {          \""options\"": [            \""-L\"",            \""SWAP\""          ]        }      }    }  ]}
",
    });

});

