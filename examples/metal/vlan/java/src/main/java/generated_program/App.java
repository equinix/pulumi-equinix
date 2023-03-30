package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Vlan;
import com.equinix.pulumi.metal.VlanArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var metro = config.get("metro").orElse("DA");
        final var vxlan = Integer.parseInt(config.get("vxlan").get());
        var vlan = new Vlan("vlan", VlanArgs.builder()        
            .description("VLAN in Dallas")
            .projectId(projectId)
            .metro(metro)
            .vxlan(vxlan)
            .build());

        ctx.export("vlanId", vlan.id());
    }
}
