package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.ServiceProfile;
import com.equinix.pulumi.equinix.fabric.ServiceProfileArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfilePortArgs;
import com.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigArgs;
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
        var newServiceProfile = new ServiceProfile("newServiceProfile", ServiceProfileArgs.builder()
            .description("Service Profile for Receiving Connections")
            .name("Name Of Business + Use Case Tag")
            .type("L2_PROFILE")
            .visibility("PUBLIC")
            .notifications(ServiceProfileNotificationArgs.builder()
                .emails("someone@sample.com")
                .type("BANDWIDTH_ALERT")
                .build())
            .allowedEmails(            
                "test@equinix.com",
                "testagain@equinix.com")
            .ports(ServiceProfilePortArgs.builder()
                .uuid("c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee")
                .type("XF_PORT")
                .build())
            .accessPointTypeConfigs(ServiceProfileAccessPointTypeConfigArgs.builder()
                .type("COLO")
                .allowRemoteConnections(true)
                .allowCustomBandwidth(true)
                .allowBandwidthAutoApproval(false)
                .connectionRedundancyRequired(false)
                .connectionLabel("Service Profile Tag1")
                .bandwidthAlertThreshold(10.0)
                .supportedBandwidths(                
                    100,
                    500)
                .build())
            .build());

    }
}
