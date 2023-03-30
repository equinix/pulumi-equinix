package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.inputs.GetInterconnectionArgs;
import com.equinix.pulumi.metal.MetalFunctions;
import com.equinix.pulumi.metal.VirtualCircuit;
import com.equinix.pulumi.metal.VirtualCircuitArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var connectionId = config.get("connectionId").get();
        final var vlanId = config.get("vlanId").get();
        final var portId = MetalFunctions.getInterconnection(GetInterconnectionArgs.builder()
            .connectionId(connectionId)
            .build()).applyValue(data -> data.ports().get(0).id());

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
