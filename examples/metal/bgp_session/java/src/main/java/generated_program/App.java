package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.BgpSession;
import com.equinix.pulumi.metal.BgpSessionArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        var bgp = new BgpSession("bgp", BgpSessionArgs.builder()        
            .deviceId(deviceId)
            .addressFamily("ipv4")
            .build());

        ctx.export("bgpSessionStatus", bgp.status());
    }
}
