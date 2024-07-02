package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vrf;
import com.pulumi.equinix.metal.VrfArgs;
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
        final var metro = config.get("metro").orElse("DA");
        var vrf = new Vrf("vrf", VrfArgs.builder()
            .description("VRF with ASN 65000 and a pool of address space")
            .name("example-vrf")
            .metro(metro)
            .localAsn(65000)
            .ipRanges(            
                "192.168.100.0/25",
                "192.168.200.0/25")
            .projectId(projectId)
            .build());

        ctx.export("vrfId", vrf.id());
    }
}
