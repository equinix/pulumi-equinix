package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.CloudRouter;
import com.pulumi.equinix.fabric.CloudRouterArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterLocationArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterPackageArgs;
import com.pulumi.equinix.fabric.inputs.CloudRouterNotificationArgs;
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
        final var config = ctx.config();
        final var metro = config.get("metro").orElse("FR");
        final var accountNum = config.get("accountNum");
        var router = new CloudRouter("router", CloudRouterArgs.builder()        
            .name("My-Fabric-Cloud-Router")
            .type("XF_ROUTER")
            .location(CloudRouterLocationArgs.builder()
                .metroCode(metro)
                .build())
            .package_(CloudRouterPackageArgs.builder()
                .code("BASIC")
                .build())
            .notifications(CloudRouterNotificationArgs.builder()
                .type("ALL")
                .emails("example@equinix.com")
                .build())
            .account(CloudRouterAccountArgs.builder()
                .accountNumber(272010)
                .build())
            .build());

        ctx.export("routerId", router.id());
    }
}
