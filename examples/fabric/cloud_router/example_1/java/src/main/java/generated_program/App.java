package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.CloudRouter;
import com.equinix.pulumi.equinix.fabric.CloudRouterArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterNotificationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterOrderArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterLocationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterPackageArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterProjectArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterAccountArgs;
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
        var newCloudRouter = new CloudRouter("newCloudRouter", CloudRouterArgs.builder()
            .name("Router-SV")
            .type("XF_ROUTER")
            .notifications(CloudRouterNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .order(CloudRouterOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .location(CloudRouterLocationArgs.builder()
                .metroCode("SV")
                .build())
            .package_(CloudRouterPackageArgs.builder()
                .code("STANDARD")
                .build())
            .project(CloudRouterProjectArgs.builder()
                .projectId("776847000642406")
                .build())
            .account(CloudRouterAccountArgs.builder()
                .accountNumber(203612)
                .build())
            .build());

    }
}
