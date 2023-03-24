package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.ServiceProfile;
import com.pulumi.equinix.fabric.ServiceProfileArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigApiConfigArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccountArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileMarketingInfoArgs;
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
        var profile = new ServiceProfile("profile", ServiceProfileArgs.builder()        
            .name("Example Cloud Provider")
            .description("50 to 500 Mbps Hosted Connection to Example Cloud")
            .type("L2_PROFILE")
            .accessPointTypeConfigs(ServiceProfileAccessPointTypeConfigArgs.builder()
                .type("COLO")
                .supportedBandwidths(                
                    50,
                    100,
                    200,
                    500)
                .allowRemoteConnections(true)
                .allowCustomBandwidth(false)
                .allowBandwidthAutoApproval(false)
                .linkProtocolConfig(ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs.builder()
                    .encapsulationStrategy("CTAGED")
                    .reuseVlanSTag(false)
                    .encapsulation("DOT1Q")
                    .build())
                .enableAutoGenerateServiceKey("false,")
                .connectionRedundancyRequired("false,")
                .apiConfig(ServiceProfileAccessPointTypeConfigApiConfigArgs.builder()
                    .apiAvailable(true)
                    .integrationId("Example-Connect-01")
                    .bandwidthFromApi(false)
                    .build())
                .connectionLabel("Virtual Circuit Name")
                .authenticationKey(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs.builder()
                    .required(true)
                    .label("Example ACCOUNT ID")
                    .build())
                .build())
            .account(ServiceProfileAccountArgs.builder()
                .organizationName("Example Cloud")
                .globalOrganizationName("Example Global")
                .build())
            .metros(null)
            .visibility("PUBLIC")
            .marketingInfo(ServiceProfileMarketingInfoArgs.builder()
                .promotion(true)
                .build())
            .build());

        ctx.export("profileId", profile.id());
    }
}
