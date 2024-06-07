package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.VirtualCircuit;
import com.pulumi.equinix.metal.VirtualCircuitArgs;
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
        final var connectionId = config.get("connectionId");
        final var vlanId = config.get("vlanId");
        final var portId = MetalFunctions.getInterconnection(GetInterconnectionArgs.builder()
            .connectionId(connectionId)
            .build()).ports()[0].id();

        var vc = new VirtualCircuit("vc", VirtualCircuitArgs.builder()        
            .connectionId(connectionId)
            .projectId(projectId)
            .portId(portId)
            .vlanId(vlanId)
            .nniVlan(1056)
            .build());

        ctx.export("vcStatus", vc.status());
        ctx.export("vcVnid", vc.vnid());
    }
}
