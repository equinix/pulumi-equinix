package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.MetalFunctions;
import com.pulumi.equinix.metal.inputs.GetInterconnectionArgs;
import com.equinix.pulumi.equinix.metal.Vlan;
import com.equinix.pulumi.equinix.metal.VlanArgs;
import com.equinix.pulumi.equinix.metal.VirtualCircuit;
import com.equinix.pulumi.equinix.metal.VirtualCircuitArgs;
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
        final var projectId = "52000fb2-ee46-4673-93a8-de2c2bdba33c";

        final var connId = "73f12f29-3e19-43a0-8e90-ae81580db1e0";

        final var test = MetalFunctions.getInterconnection(GetInterconnectionArgs.builder()
            .connectionId(connId)
            .build());

        var testVlan = new Vlan("testVlan", VlanArgs.builder()
            .projectId(projectId)
            .metro(test.applyValue(_test -> _test.metro()))
            .build());

        var testVirtualCircuit = new VirtualCircuit("testVirtualCircuit", VirtualCircuitArgs.builder()
            .connectionId(connId)
            .projectId(projectId)
            .portId(test.applyValue(_test -> _test.ports()[0].id()))
            .vlanId(testVlan.id())
            .nniVlan(1056)
            .build());

    }
}
