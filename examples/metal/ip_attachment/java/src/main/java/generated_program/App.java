package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.IpAttachment;
import com.equinix.pulumi.metal.IpAttachmentArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        final var subnetCidr = config.get("subnetCidr").orElse("147.229.10.152/31");
        var ipAttachResource = new IpAttachment("ipAttachResource", IpAttachmentArgs.builder()        
            .deviceId(deviceId)
            .cidrNotation(subnetCidr)
            .build());

        ctx.export("ipAttach", ipAttachResource.id());
        ctx.export("ipNetmask", ipAttachResource.netmask());
    }
}
