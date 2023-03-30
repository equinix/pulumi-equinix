package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Vrf;
import com.equinix.pulumi.metal.VrfArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
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
