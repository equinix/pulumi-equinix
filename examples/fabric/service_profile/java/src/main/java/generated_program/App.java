package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.fabric.ServiceProfile;
import com.equinix.pulumi.fabric.ServiceProfileArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccessPointTypeConfigApiConfigArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileAccountArgs;
import com.equinix.pulumi.fabric.inputs.ServiceProfileMarketingInfoArgs;

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
                .enableAutoGenerateServiceKey(false)
                .connectionRedundancyRequired(false)
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
            .visibility("PUBLIC")
            .marketingInfo(ServiceProfileMarketingInfoArgs.builder()
                .promotion(true)
                .build())
            .build());

        ctx.export("profileId", profile.id());
    }
}
