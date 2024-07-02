package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Interconnection;
import com.pulumi.equinix.metal.InterconnectionArgs;
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
        final var projectId = config.get("projectId");
        final var metro = config.get("metro").orElse("SV");
        final var speedInMbps = config.get("speedInMbps").orElse(200);
        var connection = new Interconnection("connection", InterconnectionArgs.builder()
            .name("fabric-port-to-metal")
            .projectId(projectId)
            .type("shared")
            .redundancy("primary")
            .metro(metro)
            .speed(String.format("%sMbps", speedInMbps))
            .serviceTokenType("z_side")
            .build());

        ctx.export("connectionStatus", connection.status());
        ctx.export("connectionTokens", connection.serviceTokens());
    }
}
