package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Gateway;
import com.pulumi.equinix.metal.GatewayArgs;
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
        final var projectId = config.get("projectId");
        final var vlanId = config.get("vlanId");
        var gateway = new Gateway("gateway", GatewayArgs.builder()        
            .projectId(projectId)
            .vlanId(vlanId)
            .privateIpv4SubnetSize(8)
            .build());

        ctx.export("gatewayState", gateway.state());
    }
}
