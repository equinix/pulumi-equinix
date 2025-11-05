package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.DeviceNetworkType;
import com.equinix.pulumi.equinix.metal.DeviceNetworkTypeArgs;
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
        final var deviceId = config.get("deviceId");
        final var networkType = config.get("networkType").orElse("hybrid");
        var deviceNetwork = new DeviceNetworkType("deviceNetwork", DeviceNetworkTypeArgs.builder()
            .deviceId(deviceId)
            .type(networkType)
            .build());

        ctx.export("deviceNetworkId", deviceNetwork.id());
    }
}
