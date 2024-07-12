package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Network;
import com.pulumi.equinix.fabric.NetworkArgs;
import com.pulumi.equinix.fabric.inputs.NetworkNotificationArgs;
import com.pulumi.equinix.fabric.inputs.NetworkProjectArgs;
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
        var newNetwork = new Network("newNetwork", NetworkArgs.builder()
            .name("Network-SV")
            .type("EVPLAN")
            .scope("GLOBAL")
            .notifications(NetworkNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .project(NetworkProjectArgs.builder()
                .projectId("776847000642406")
                .build())
            .build());

    }
}
