package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RouteAggregationRule;
import com.pulumi.equinix.fabric.RouteAggregationRuleArgs;
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
        var raRule = new RouteAggregationRule("raRule", RouteAggregationRuleArgs.builder()
            .routeAggregationId("<route_aggregation_id>")
            .name("ra-rule-test")
            .description("Route aggregation rule")
            .prefix("192.168.0.0/24")
            .build());

        ctx.export("routeAggregationRuleName", raRule.name());
        ctx.export("routeAggregationRuleDescription", raRule.description());
        ctx.export("routeAggregationRuleType", raRule.type());
        ctx.export("routeAggregationRulePrefix", raRule.prefix());
        ctx.export("routeAggregationRuleState", raRule.state());
    }
}
