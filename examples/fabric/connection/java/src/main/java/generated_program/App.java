package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.fabric.Connection;
import com.equinix.pulumi.fabric.ConnectionArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionNotificationArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionRedundancyArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointPortArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionASideAccessPointLinkProtocolArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
import com.equinix.pulumi.fabric.inputs.GetServiceProfilesArgs;
import com.equinix.pulumi.fabric.inputs.GetServiceProfilesFilterArgs;
import com.equinix.pulumi.fabric.inputs.GetPortsArgs;
import com.equinix.pulumi.fabric.inputs.GetPortsFilterArgs;
import com.equinix.pulumi.fabric.FabricFunctions;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var metro = config.get("metro").orElse("FR");
        final var speedInMbps = Integer.parseInt(config.get("speedInMbps").orElse("50"));
        final var fabricPortName = config.get("fabricPortName").get().toString();
        final var awsRegion = config.get("awsRegion").orElse("eu-central-1");
        final var awsAccountId = config.get("awsAccountId").get().toString();
        System.out.println(System.getProperty("java.classpath"));
        final var serviceProfileId = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
            .filter(GetServiceProfilesFilterArgs.builder()
                .property("/name")
                .operator("=")
                .values("AWS Direct Connect")
                .build())
            .build()).applyValue(data -> data.data().get(0).uuid().get());

        final var portId = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filter(GetPortsFilterArgs.builder()
                .name(fabricPortName)
                .build())
            .build()).applyValue(data -> data.data().get(0).uuid().get());

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
        ctx.export("awsDirectConnectId", colo2Aws.zSide().applyValue(zSide -> zSide.accessPoint().get().providerConnectionId()));
    }
}
