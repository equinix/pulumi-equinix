package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.PortVlanAttachment;
import com.equinix.pulumi.metal.PortVlanAttachmentArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        final var portName = config.get("portName").orElse("eth1");
        final var vxlanId = Integer.parseInt(config.get("vxlanId").orElse("1004"));

        var attach = new PortVlanAttachment("attach", PortVlanAttachmentArgs.builder()        
            .deviceId(deviceId)
            .portName(portName)
            .vlanVnid(vxlanId)
            .build());

        ctx.export("attachId", attach.id());
        ctx.export("portId", attach.portId());
    }
}
