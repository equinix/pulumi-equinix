package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.ReservedIpBlock;
import com.equinix.pulumi.metal.ReservedIpBlockArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var metro = config.get("metro").orElse("FR");
        final var type = config.get("type").orElse("public_ipv4");
        final var quantity = Integer.parseInt(config.get("quantity").orElse("1"));
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
