package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.PrecisionTimeService;
import com.equinix.pulumi.equinix.fabric.PrecisionTimeServiceArgs;
import com.pulumi.equinix.fabric.inputs.PrecisionTimeServicePackageArgs;
import com.pulumi.equinix.fabric.inputs.PrecisionTimeServiceConnectionArgs;
import com.pulumi.equinix.fabric.inputs.PrecisionTimeServiceIpv4Args;
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
        var ptp = new PrecisionTimeService("ptp", PrecisionTimeServiceArgs.builder()
            .type("PTP")
            .name("tf_acc_eptptp_PFCR")
            .package_(PrecisionTimeServicePackageArgs.builder()
                .code("PTP_STANDARD")
                .build())
            .connections(PrecisionTimeServiceConnectionArgs.builder()
                .uuid("<connection_id>")
                .build())
            .ipv4(PrecisionTimeServiceIpv4Args.builder()
                .primary("191.168.254.241")
                .secondary("191.168.254.242")
                .networkMask("255.255.255.240")
                .defaultGateway("191.168.254.254")
                .build())
            .build());

        ctx.export("eptServiceId", ptp.id());
        ctx.export("eptServiceName", ptp.name());
        ctx.export("eptServiceState", ptp.state());
        ctx.export("eptServiceType", ptp.type());
        ctx.export("eptServiceConnection", ptp.connections());
        ctx.export("eptServiceIpv4", ptp.ipv4());
    }
}
