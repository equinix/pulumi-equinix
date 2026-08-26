package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
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

        final var interfaceLo0 = """
auto lo:0
iface lo:0 inet static
   address %s
   netmask %s
", addr.address(),addr.netmask());

        final var birdConf = """
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
", addr.address(),addr.cidr(),test.network()[2].address(),test.network()[2].gateway(),bgpPassword);

        var configureBird = new Resource("configureBird", ResourceArgs.builder()
            .triggers(Map.ofEntries(
                Map.entry("bird_conf", birdConf),
                Map.entry("interface", interfaceLo0)
            ))
            .build());

    }
}
