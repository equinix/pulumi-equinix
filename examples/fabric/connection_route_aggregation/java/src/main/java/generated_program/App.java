package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.ConnectionRouteAggregation;
import com.equinix.pulumi.equinix.fabric.ConnectionRouteAggregationArgs;
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
        var policyAttachment = new ConnectionRouteAggregation("policyAttachment", ConnectionRouteAggregationArgs.builder()
            .routeAggregationId("<route_aggregation_id>")
            .connectionId("<connection_id>")
            .build());

        ctx.export("connectionRouteAggregationId", policyAttachment.id());
        ctx.export("connectionRouteAggregationConnectionId", policyAttachment.connectionId());
        ctx.export("connectionRouteAggregationType", policyAttachment.type());
        ctx.export("connectionRouteAggregationAttachmentStatus", policyAttachment.attachmentStatus());
    }
}
