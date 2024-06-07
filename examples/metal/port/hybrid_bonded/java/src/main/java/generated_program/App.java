package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Port;
import com.pulumi.equinix.metal.PortArgs;
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
        final var portId = config.get("portId");
        final var vlanId = config.get("vlanId");
        var port = new Port("port", PortArgs.builder()        
            .portId(portId)
            .bonded(true)
            .layer2(false)
            .vlanIds(vlanId)
            .build());

        ctx.export("portType", port.type());
        ctx.export("portBondedNetworkType", port.networkType());
    }
}
