package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
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
        final var metro = config.get("metro").orElse("FR");
        final var type = config.get("type").orElse("public_ipv4");
        final var quantity = config.get("quantity").orElse(1);
        var ipBlock = new ReservedIpBlock("ipBlock", ReservedIpBlockArgs.builder()        
            .projectId(projectId)
            .type(type)
            .quantity(quantity)
            .metro(metro)
            .build());

        ctx.export("ipBlockId", ipBlock.id());
        ctx.export("ipBlockSubent", ipBlock.cidrNotation());
    }
}
