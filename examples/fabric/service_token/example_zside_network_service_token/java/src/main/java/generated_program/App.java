package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.ServiceToken;
import com.pulumi.equinix.fabric.ServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenServiceTokenConnectionArgs;
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
        var test = new ServiceToken("test", ServiceTokenArgs.builder()
            .notifications(ServiceTokenNotificationArgs.builder()
                .type("ALL")
                .emails("example@equinix.com")
                .build())
            .serviceTokenConnections(ServiceTokenServiceTokenConnectionArgs.builder()
                .zSides(ServiceTokenServiceTokenConnectionZSideArgs.builder()
                    .accessPointSelectors(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArgs.builder()
                        .network(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkArgs.builder()
                            .uuid("<network_uuid>")
                            .build())
                        .type("NETWORK")
                        .build())
                    .build())
                .type("EVPL_VC")
                .supportedBandwidths(                
                    50,
                    200,
                    10000)
                .build())
            .type("VC_TOKEN")
            .description("Zside Network Service Token")
            .expirationDateTime("2025-01-18T06:43:49.986Z")
            .build());

    }
}
