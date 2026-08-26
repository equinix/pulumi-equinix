using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Null = Pulumi.Null;

return await Deployment.RunAsync(() => 
{
    var bgpPassword = "955dB0b81Ef";

    var projectId = "<UUID_of_your_project>";

    var interfaceLo0 = @$"auto lo:0
iface lo:0 inet static
   address {addr.Address}
   netmask {addr.Netmask}
";

    var birdConf = @$"filter equinix_metal_bgp {{
    if net = {addr.Address}/{addr.Cidr} then accept;
}}
router id {test.Network[2].Address};
protocol direct {{
    interface ""lo"";
}}
protocol kernel {{
    scan time 10;
    persist;
    import all;
    export all;
}}
protocol device {{
    scan time 10;
}}
protocol bgp {{
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor {test.Network[2].Gateway} as 65530;
    password ""{bgpPassword}"";
}}
";

    var configureBird = new Null.Resource("configure_bird", new()
    {
        Triggers = 
        {
            { "bird_conf", birdConf },
            { "interface", interfaceLo0 },
        },
    });

});

