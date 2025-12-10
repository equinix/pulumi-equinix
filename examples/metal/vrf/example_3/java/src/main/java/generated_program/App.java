package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
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
        var exampleVirtualCircuit = new VirtualCircuit("exampleVirtualCircuit", VirtualCircuitArgs.builder()
            .name("example-vc")
            .description("Virtual Circuit")
            .connectionId(example.id())
            .projectId(exampleEquinixMetalProject.id())
            .portId(example.ports()[0].id())
            .nniVlan(1024)
            .vrfId(exampleEquinixMetalVrf.id())
            .peerAsn(65530)
            .subnet("192.168.100.16/31")
            .metalIp("192.168.100.16")
            .customerIp("192.168.100.17")
            .build());

    }
}
