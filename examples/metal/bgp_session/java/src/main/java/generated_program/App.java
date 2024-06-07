package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.BgpSession;
import com.pulumi.equinix.metal.BgpSessionArgs;
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
        final var deviceId = config.get("deviceId");
        var bgp = new BgpSession("bgp", BgpSessionArgs.builder()        
            .deviceId(deviceId)
            .addressFamily("ipv4")
            .build());

        ctx.export("bgpSessionStatus", bgp.status());
    }
}
