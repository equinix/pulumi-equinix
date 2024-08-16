package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.FabricFunctions;
import com.pulumi.equinix.fabric.inputs.GetServiceProfilesArgs;
import com.pulumi.equinix.fabric.inputs.GetServiceProfilesFilterArgs;
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
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
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
        final var zside = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
            .filter(GetServiceProfilesFilterArgs.builder()
                .property("/name")
                .operator("=")
                .values("AWS Direct Connect")
                .build())
            .build());

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
            .type("EVPL_VC")
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
                    .type("METAL_NETWORK")
                    .authenticationKey(example.authorizationCode())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey(awsAccountId)
                    .sellerRegion("us-west-1")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid(zside.applyValue(getServiceProfilesResult -> getServiceProfilesResult.id()))
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .build())
                .build())
            .build());

    }
}
