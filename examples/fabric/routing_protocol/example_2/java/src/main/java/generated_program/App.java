package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RoutingProtocol;
import com.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolBgpIpv4Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolBgpIpv6Args;
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
        var bgp = new RoutingProtocol("bgp", RoutingProtocolArgs.builder()
            .connectionUuid("<same_connection_id_as_first_equinix_fabric_routing_protocol>")
            .type("BGP")
            .name("bgp_rp")
            .bgpIpv4(RoutingProtocolBgpIpv4Args.builder()
                .customerPeerIp("190.1.1.2")
                .enabled(true)
                .build())
            .bgpIpv6(RoutingProtocolBgpIpv6Args.builder()
                .customerPeerIp("190::1:2")
                .enabled(true)
                .build())
            .customerAsn(4532)
            .build());

    }
}
