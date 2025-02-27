package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vrf;
import com.pulumi.equinix.metal.VrfArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
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
        var example = new Vrf("example", VrfArgs.builder()
            .name("tf-metal-from-ne")
            .metro("FR")
            .localAsn(65001)
            .ipRanges("10.99.1.0/24")
            .projectId(test.id())
            .build());

        var exampleInterconnection = new Interconnection("exampleInterconnection", InterconnectionArgs.builder()
            .name("tf-metal-from-ne")
            .projectId("<metal_project_id>")
            .type("shared")
            .redundancy("primary")
            .metro("FR")
            .speed("200Mbps")
            .serviceTokenType("z_side")
            .contactEmail("username@example.com")
            .vrfs(example.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-from-ne")
            .type("EVPL_VC")
            .bandwidth(200)
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
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid(exampleEquinixNetworkDevice.id())
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .serviceToken(ConnectionZSideServiceTokenArgs.builder()
                    .uuid(exampleInterconnection.serviceTokens().applyValue(_serviceTokens -> _serviceTokens[0].id()))
                    .build())
                .build())
            .build());

    }
}
