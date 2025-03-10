package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.FabricFunctions;
import com.pulumi.equinix.fabric.inputs.GetPortsArgs;
import com.pulumi.equinix.fabric.inputs.GetPortsFilterArgs;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideServiceTokenArgs;
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
        final var aSide = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filter(GetPortsFilterArgs.builder()
                .name("<name_of_port||port_prefix>")
                .build())
            .build());

        var example = new Vlan("example", VlanArgs.builder()
            .projectId("<metal_project_id>")
            .metro("FR")
            .build());

        var exampleInterconnection = new Interconnection("exampleInterconnection", InterconnectionArgs.builder()
            .name("tf-metal-from-port")
            .projectId("<metal_project_id>")
            .type("shared")
            .redundancy("primary")
            .metro("FR")
            .speed("200Mbps")
            .serviceTokenType("z_side")
            .contactEmail("username@example.com")
            .vlans(example.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-from-port")
            .type("EVPL_VC")
            .bandwidth("200")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid(aSide.applyValue(getPortsResult -> getPortsResult.data()[0].uuid()))
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(1234)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .serviceToken(ConnectionZSideServiceTokenArgs.builder()
                    .uuid(exampleInterconnection.serviceTokens().applyValue(serviceTokens -> serviceTokens[0].id()))
                    .build())
                .build())
            .build());

    }
}
