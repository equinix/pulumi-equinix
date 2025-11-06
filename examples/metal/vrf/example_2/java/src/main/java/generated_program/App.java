package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.ReservedIpBlock;
import com.equinix.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.equinix.pulumi.equinix.metal.Vlan;
import com.equinix.pulumi.equinix.metal.VlanArgs;
import com.equinix.pulumi.equinix.metal.Gateway;
import com.equinix.pulumi.equinix.metal.GatewayArgs;
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
        var example = new ReservedIpBlock("example", ReservedIpBlockArgs.builder()
            .description("Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.")
            .projectId(exampleEquinixMetalProject.id())
            .metro(exampleEquinixMetalVrf.metro())
            .type("vrf")
            .vrfId(exampleEquinixMetalVrf.id())
            .cidr(29)
            .network("192.168.100.0")
            .build());

        var exampleVlan = new Vlan("exampleVlan", VlanArgs.builder()
            .description("A VLAN for Layer2 and Hybrid Metal devices")
            .metro(exampleEquinixMetalVrf.metro())
            .projectId(exampleEquinixMetalProject.id())
            .build());

        var exampleGateway = new Gateway("exampleGateway", GatewayArgs.builder()
            .projectId(exampleEquinixMetalProject.id())
            .vlanId(exampleVlan.id())
            .ipReservationId(example.id())
            .build());

    }
}
