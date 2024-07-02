package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        var web = new Device("web", DeviceArgs.builder()
            .hostname("webserver1")
            .plan("c3.small.x86")
            .operatingSystem("ubuntu_20_04")
            .metro("sv")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        ctx.export("webPublicIp", web.accessPublicIpv4().applyValue(accessPublicIpv4 -> String.format("http://%s", accessPublicIpv4)));
    }
}
