package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RouteAggregation;
import com.pulumi.equinix.fabric.RouteAggregationArgs;
import com.pulumi.equinix.fabric.inputs.RouteAggregationProjectArgs;
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
        var newRa = new RouteAggregation("newRa", RouteAggregationArgs.builder()
            .type("BGP_IPv4_PREFIX_AGGREGATION")
            .name("new-ra")
            .description("Test aggregation")
            .project(RouteAggregationProjectArgs.builder()
                .projectId("776847000642406")
                .build())
            .build());

    }
}
