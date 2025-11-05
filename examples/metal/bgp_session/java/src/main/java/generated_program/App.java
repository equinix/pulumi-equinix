package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.ReservedIpBlock;
import com.equinix.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.equinix.pulumi.equinix.metal.Device;
import com.equinix.pulumi.equinix.metal.DeviceArgs;
import com.equinix.pulumi.equinix.metal.BgpSession;
import com.equinix.pulumi.equinix.metal.BgpSessionArgs;
import com.pulumi.null.Resource;
import com.pulumi.null.ResourceArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var bgpPassword = "955dB0b81Ef";

        final var projectId = "<UUID_of_your_project>";

        var addr = new ReservedIpBlock("addr", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("ny")
            .quantity(1)
            .build());

        final var interfaceLo0 = Output.tuple(addr.address(), addr.netmask()).applyValue(values -> {
            var address = values.t1;
            var netmask = values.t2;
            return """
auto lo:0
iface lo:0 inet static
   address %s
   netmask %s
", address,netmask);
        });

        var test = new Device("test", DeviceArgs.builder()
            .hostname("terraform-test-bgp-sesh")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        final var birdConf = Output.tuple(addr.address(), addr.cidr(), test.network(), test.network()).applyValue(values -> {
            var address = values.t1;
            var cidr = values.t2;
            var testNetwork = values.t3;
            var testNetwork1 = values.t4;
            return """
filter equinix_metal_bgp {
    if net = %s/%s then accept;
}
router id %s;
protocol direct {
    interface "lo";
}
protocol kernel {
    scan time 10;
    persist;
    import all;
    export all;
}
protocol device {
    scan time 10;
}
protocol bgp {
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor %s as 65530;
    password "%s";
}
", address,cidr,testNetwork[2].address(),testNetwork1[2].gateway(),bgpPassword);
        });

        var testBgpSession = new BgpSession("testBgpSession", BgpSessionArgs.builder()
            .deviceId(test.id())
            .addressFamily("ipv4")
            .build());

        var configureBird = new Resource("configureBird", ResourceArgs.builder()
            .triggers(Map.ofEntries(
                Map.entry("bird_conf", birdConf),
                Map.entry("interface", interfaceLo0)
            ))
            .build());

    }
}
