package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.RouteFilterRule;
import com.equinix.pulumi.equinix.fabric.RouteFilterRuleArgs;
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
        var rfRule = new RouteFilterRule("rfRule", RouteFilterRuleArgs.builder()
            .routeFilterId("<route_filter_policy_id>")
            .name("Route Filter Rule Name")
            .prefix("192.168.0.0/24")
            .prefixMatch("exact")
            .description("Route Filter Rule for X Purpose")
            .build());

        ctx.export("routeFilterRuleId", rfRule.id());
        ctx.export("routeFilterId", rfRule.routeFilterId());
        ctx.export("routeFilterRulePrefix", rfRule.prefix());
        ctx.export("routeFilterRulePrefixMatch", rfRule.prefixMatch());
    }
}
