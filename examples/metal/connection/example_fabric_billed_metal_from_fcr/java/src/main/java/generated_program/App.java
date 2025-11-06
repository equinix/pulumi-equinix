package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.Vlan;
import com.equinix.pulumi.equinix.metal.VlanArgs;
import com.equinix.pulumi.equinix.metal.Interconnection;
import com.equinix.pulumi.equinix.metal.InterconnectionArgs;
import com.equinix.pulumi.equinix.fabric.Connection;
import com.equinix.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointRouterArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
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
        var example1 = new Vlan("example1", VlanArgs.builder()
            .projectId("<metal_project_id>")
            .metro("SV")
            .build());

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-metal-from-fcr")
            .projectId("<metal_project_id>")
            .metro("SV")
            .redundancy("primary")
            .type("shared_port_vlan")
            .contactEmail("username@example.com")
            .speed("200Mbps")
            .vlans(example1.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-metal-from-fcr")
            .type("IP_VC")
            .bandwidth(200)
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("username@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId("<fabric_project_id>")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid(exampleEquinixFabricCloudRouter.id())
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("METAL_NETWORK")
                    .authenticationKey(example.authorizationCode())
                    .build())
                .build())
            .build());

    }
}
