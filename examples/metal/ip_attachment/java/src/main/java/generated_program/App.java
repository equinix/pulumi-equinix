package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.IpAttachment;
import com.pulumi.equinix.metal.IpAttachmentArgs;
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
        final var subnetCidr = config.get("subnetCidr").orElse("147.229.10.152/31");
        var ipAttachResource = new IpAttachment("ipAttachResource", IpAttachmentArgs.builder()
            .deviceId(deviceId)
            .cidrNotation(subnetCidr)
            .build());

        ctx.export("ipAttach", ipAttachResource.id());
        ctx.export("ipNetmask", ipAttachResource.netmask());
    }
}
