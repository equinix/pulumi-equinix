package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
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
        var test = new Vlan("test", VlanArgs.builder()
            .description("test VLAN in SV")
            .metro("sv")
            .projectId(projectId)
            .build());

        var test1 = new ReservedIpBlock("test1", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .quantity(8)
            .build());

        var testGateway = new Gateway("testGateway", GatewayArgs.builder()
            .projectId(projectId)
            .vlanId(test.id())
            .ipReservationId(testEquinixMetalReservedIpBlock.id())
            .build());

    }
}
