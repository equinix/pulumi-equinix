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
        final var speedInMbps = config.get("speedInMbps").orElse(50);
        final var linkProtocolType = config.get("linkProtocolType").orElse("QINQ");
        final var linkProtocolStag = config.get("linkProtocolStag").orElse(2019);
        final var linkProtocolCtag = config.get("linkProtocolCtag").orElse(2112);
        final var portName = config.get("portName");
        final var serviceProfileName = config.get("serviceProfileName").orElse("AWS Direct Connect");
        final var serviceProfileRegion = config.get("serviceProfileRegion").orElse("us-west-1");
        final var serviceProfileMetro = config.get("serviceProfileMetro").orElse("SV");
        final var serviceProfileAuthKey = config.get("serviceProfileAuthKey");
        final var serviceProfileId = FabricFunctions.getServiceProfiles(GetServiceProfilesArgs.builder()
            .filter(GetServiceProfilesFilterArgs.builder()
                .property("/name")
                .operator("=")
                .values(serviceProfileName)
                .build())
            .build()).data().uuid();

        final var portId = FabricFunctions.getPorts(GetPortsArgs.builder()
            .filters(GetPortsFilterArgs.builder()
                .name(portName)
                .build())
            .build()).data().uuid();

        var colo2Aws = new Connection("colo2Aws", ConnectionArgs.builder()        
            .name("colo2Aws")
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
                        .type(linkProtocolType)
                        .vlanSTag(linkProtocolStag)
                        .vlanTag(linkProtocolCtag)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey(serviceProfileAuthKey)
                    .sellerRegion(serviceProfileRegion)
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid(serviceProfileId)
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode(serviceProfileMetro)
                        .build())
                    .build())
                .build())
            .build());

        ctx.export("connectionId", colo2Aws.id().applyValue(id -> String.format("http://%s", id)));
    }
}
