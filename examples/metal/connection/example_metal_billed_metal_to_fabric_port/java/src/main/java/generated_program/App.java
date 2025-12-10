package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.FabricFunctions;
import com.pulumi.equinix.fabric.inputs.GetPortsArgs;
import com.pulumi.equinix.fabric.inputs.GetPortsFilterArgs;
import com.equinix.pulumi.equinix.metal.Interconnection;
import com.equinix.pulumi.equinix.metal.InterconnectionArgs;
import com.equinix.pulumi.equinix.fabric.Connection;
import com.equinix.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLinkProtocolArgs;
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

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-metal-2-port")
            .projectId("<metal_project_id>")
            .type("shared")
            .redundancy("redundant")
            .metro("FR")
            .speed("1Gbps")
            .serviceTokenType("a_side")
            .contactEmail("username@example.com")
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-2-port")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .bandwidth(100)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .serviceToken(ConnectionASideServiceTokenArgs.builder()
                    .uuid(example.serviceTokens().applyValue(_serviceTokens -> _serviceTokens[0].id()))
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionZSideAccessPointPortArgs.builder()
                        .uuid(aSide.applyValue(_aSide -> _aSide.data()[0].uuid()))
                        .build())
                    .linkProtocol(ConnectionZSideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(1234)
                        .build())
                    .build())
                .build())
            .build());

    }
}
