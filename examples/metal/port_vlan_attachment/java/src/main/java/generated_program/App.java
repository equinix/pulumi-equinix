package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.PortVlanAttachment;
import com.pulumi.equinix.metal.PortVlanAttachmentArgs;
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
        final var portName = config.get("portName").orElse("eth1");
        final var vxlanId = config.get("vxlanId").orElse(1004);
        var attach = new PortVlanAttachment("attach", PortVlanAttachmentArgs.builder()
            .deviceId(deviceId)
            .portName(portName)
            .vlanVnid(vxlanId)
            .build());

        ctx.export("attachId", attach.id());
        ctx.export("portId", attach.portId());
    }
}
