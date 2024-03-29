package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Device;
import com.equinix.pulumi.metal.DeviceArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
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
