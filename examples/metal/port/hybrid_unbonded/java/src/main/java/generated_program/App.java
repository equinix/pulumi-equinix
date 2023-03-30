package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.metal.Port;
import com.equinix.pulumi.metal.PortArgs;
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
        final var portId = config.get("portId").get();
        var port = new Port("port", PortArgs.builder()        
            .portId(portId)
            .bonded(false)
            .build());

        ctx.export("portType", port.type());
    }
}
