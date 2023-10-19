package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RoutingProtocol;
import com.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv4Args;
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
        final var config = ctx.config();
        final var connectionId = config.get("connectionId");
        var routingProtocol = new RoutingProtocol("routingProtocol", RoutingProtocolArgs.builder()        
            .connectionUuid(connectionId)
            .name("My-Direct-route-1")
            .type("DIRECT")
            .directIpv4(RoutingProtocolDirectIpv4Args.builder()
                .equinixIfaceIp("192.168.100.1/30")
                .build())
            .build());

        ctx.export("routingProtocolId", routingProtocol.id());
        ctx.export("routingProtocolState", routingProtocol.state());
        ctx.export("routingProtocolEquinixAsn", routingProtocol.equinixAsn());
    }
}
