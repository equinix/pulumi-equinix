using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Null = Pulumi.Null;

return await Deployment.RunAsync(() => 
{
    var bgpPassword = "955dB0b81Ef";

    var projectId = "<UUID_of_your_project>";

    var addr = new Equinix.Metal.ReservedIpBlock("addr", new()
    {
        ProjectId = projectId,
        Metro = "ny",
        Quantity = 1,
    });

    var interfaceLo0 = Output.Tuple(addr.Address, addr.Netmask).Apply(values =>
    {
        var address = values.Item1;
        var netmask = values.Item2;
        return @$"auto lo:0
iface lo:0 inet static
   address {address}
   netmask {netmask}
";
    });

    var test = new Equinix.Metal.Device("test", new()
    {
        Hostname = "terraform-test-bgp-sesh",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "ny",
        OperatingSystem = Equinix.Metal.OperatingSystem.Ubuntu20_04,
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    });

    var birdConf = Output.Tuple(addr.Address, addr.Cidr, test.Network, test.Network).Apply(values =>
    {
        var address = values.Item1;
        var cidr = values.Item2;
        var testNetwork = values.Item3;
        var testNetwork1 = values.Item4;
        return @$"filter equinix_metal_bgp {{
    if net = {address}/{cidr} then accept;
}}
router id {testNetwork[2].Address};
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
    neighbor {testNetwork1[2].Gateway} as 65530;
    password ""{bgpPassword}"";
}}
";
    });

    var testBgpSession = new Equinix.Metal.BgpSession("testBgpSession", new()
    {
        DeviceId = test.Id,
        AddressFamily = "ipv4",
    });

    var configureBird = new Null.Resource("configureBird", new()
    {
        Triggers = 
        {
            { "bird_conf", birdConf },
            { "interface", interfaceLo0 },
        },
    });

});

