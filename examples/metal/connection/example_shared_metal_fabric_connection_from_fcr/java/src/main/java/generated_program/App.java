package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
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
            .projectId(myProjectId)
            .metro("SV")
            .build());

        var example = new Interconnection("example", InterconnectionArgs.builder()
            .name("tf-port-to-metal-legacy")
            .projectId(myProjectId)
            .metro("SV")
            .redundancy("primary")
            .type("shared_port_vlan")
            .contactEmail("username@example.com")
            .vlans(example1.vxlan())
            .build());

        var exampleConnection = new Connection("exampleConnection", ConnectionArgs.builder()
            .name("tf-NIMF-metal-2-aws-legacy")
            .type("IP_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("sername@example.com")
                .build())
            .project(ConnectionProjectArgs.builder()
                .projectId(fabricProjectId)
                .build())
            .bandwidth("200")
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("CLOUD_ROUTER")
                    .router(ConnectionASideAccessPointRouterArgs.builder()
                        .uuid(cloudRouterUuid)
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
