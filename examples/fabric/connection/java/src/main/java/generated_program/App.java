package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
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
        final var config = ctx.config();
        final var metro = config.get("metro").orElse("FR");
        final var speedInMbps = config.get("speedInMbps").orElse(50);
        final var fabricPortName = config.get("fabricPortName");
        final var awsRegion = config.get("awsRegion").orElse("eu-central-1");
        final var awsAccountId = config.get("awsAccountId");
        final var serviceProfileId = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
            .filter(GetServiceProfilesFilterArgs.builder()
                .property("/name")
                .operator("=")
                .values("AWS Direct Connect")
                .build())
            .build()).data()[0].uuid();

        final var portId = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filter(GetPortsFilterArgs.builder()
                .name(fabricPortName)
                .build())
            .build()).data()[0].uuid();

        var colo2Aws = new Connection("colo2Aws", ConnectionArgs.builder()
            .name("Pulumi-colo2Aws")
            .type("EVPL_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails("example@equinix.com")
                .build())
            .bandwidth(speedInMbps)
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("COLO")
                    .port(ConnectionASideAccessPointPortArgs.builder()
                        .uuid(portId)
                        .build())
                    .linkProtocol(ConnectionASideAccessPointLinkProtocolArgs.builder()
                        .type("DOT1Q")
                        .vlanTag(1234)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey(awsAccountId)
                    .sellerRegion(awsRegion)
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid(serviceProfileId)
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode(metro)
                        .build())
                    .build())
                .build())
            .build());

        ctx.export("connectionId", colo2Aws.id());
        ctx.export("connectionStatus", colo2Aws.operation().applyValue(operation -> operation.equinixStatus()));
        ctx.export("connectionProviderStatus", colo2Aws.operation().applyValue(operation -> operation.providerStatus()));
        ctx.export("awsDirectConnectId", colo2Aws.zSide().applyValue(zSide -> zSide.accessPoint().providerConnectionId()));
    }
}
