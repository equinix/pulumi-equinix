package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.DeviceNetworkType;
import com.equinix.pulumi.metal.DeviceNetworkTypeArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        final var networkType = config.get("networkType").orElse("hybrid");
        var deviceNetwork = new DeviceNetworkType("deviceNetwork", DeviceNetworkTypeArgs.builder()        
            .deviceId(deviceId)
            .type(networkType)
            .build());

        ctx.export("deviceNetworkId", deviceNetwork.id());
    }
}
