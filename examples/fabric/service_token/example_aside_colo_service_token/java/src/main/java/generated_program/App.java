package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.ServiceToken;
import com.equinix.pulumi.equinix.fabric.ServiceTokenArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenServiceTokenConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ServiceTokenNotificationArgs;
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
            .type("VC_TOKEN")
            .description("Aside COLO Service Token")
            .expirationDateTime("2025-01-18T06:43:49.981Z")
            .serviceTokenConnections(ServiceTokenServiceTokenConnectionArgs.builder()
                .type("EVPL_VC")
                .bandwidthLimit(1000)
                .aSides(ServiceTokenServiceTokenConnectionASideArgs.builder()
                    .accessPointSelectors(ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs.builder()
                        .type("COLO")
                        .port(ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs.builder()
                            .uuid("<port_uuid>")
                            .build())
                        .linkProtocol(ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs.builder()
                            .type("DOT1Q")
                            .vlanTag(2987)
                            .build())
                        .build())
                    .build())
                .build())
            .notifications(ServiceTokenNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .build());

    }
}
