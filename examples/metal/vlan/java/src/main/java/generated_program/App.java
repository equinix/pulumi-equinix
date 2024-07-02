package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
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
        final var vxlan = config.get("vxlan");
        var vlan = new Vlan("vlan", VlanArgs.builder()
            .description("VLAN in Dallas")
            .projectId(projectId)
            .metro(metro)
            .vxlan(vxlan)
            .build());

        ctx.export("vlanId", vlan.id());
    }
}
