package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
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
        ctx.export("connectionRouteAggregationId", policyAttachment.id());
        ctx.export("connectionRouteAggregationConnectionId", policyAttachment.connectionId());
        ctx.export("connectionRouteAggregationType", policyAttachment.type());
        ctx.export("connectionRouteAggregationAttachmentStatus", policyAttachment.attachmentStatus());
    }
}
