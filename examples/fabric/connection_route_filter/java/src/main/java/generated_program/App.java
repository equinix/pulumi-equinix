package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.ConnectionRouteFilter;
import com.pulumi.equinix.fabric.ConnectionRouteFilterArgs;
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
        var policyAttachment = new ConnectionRouteFilter("policyAttachment", ConnectionRouteFilterArgs.builder()
            .connectionId("<connection_uuid>")
            .routeFilterId("<route_filter_policy_uuid>")
            .direction("INBOUND")
            .build());

        ctx.export("connectionRouteFilterId", policyAttachment.id());
        ctx.export("connectionRouteFilterConnectionId", policyAttachment.connectionId());
        ctx.export("connectionRouteFilterDirection", policyAttachment.direction());
        ctx.export("connectionRouteFilterType", policyAttachment.type());
        ctx.export("connectionRouteFilterAttachmentStatus", policyAttachment.attachmentStatus());
    }
}
