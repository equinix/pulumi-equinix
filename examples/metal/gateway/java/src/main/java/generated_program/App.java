package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Gateway;
import com.equinix.pulumi.metal.GatewayArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var vlanId = config.get("vlanId").get();
        var gateway = new Gateway("gateway", GatewayArgs.builder()        
            .projectId(projectId)
            .vlanId(vlanId)
            .privateIpv4SubnetSize(8)
            .build());

        ctx.export("gatewayState", gateway.state());
    }
}
