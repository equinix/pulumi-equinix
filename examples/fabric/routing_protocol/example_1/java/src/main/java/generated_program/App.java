package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.RoutingProtocol;
import com.equinix.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv4Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv6Args;
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
        var direct = new RoutingProtocol("direct", RoutingProtocolArgs.builder()
            .connectionUuid("<some_id>")
            .type("DIRECT")
            .name("direct_rp")
            .directIpv4(RoutingProtocolDirectIpv4Args.builder()
                .equinixIfaceIp("190.1.1.1/30")
                .build())
            .directIpv6(RoutingProtocolDirectIpv6Args.builder()
                .equinixIfaceIp("190::1:1/126")
                .build())
            .build());

    }
}
