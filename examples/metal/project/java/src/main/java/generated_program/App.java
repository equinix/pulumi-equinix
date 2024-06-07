package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Project;
import com.pulumi.equinix.metal.ProjectArgs;
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
        final var organizationId = config.get("organizationId");
        final var name = config.get("name").orElse("Default Project");
        var projectResource = new Project("projectResource", ProjectArgs.builder()        
            .name(name)
            .organizationId(organizationId)
            .build());

        ctx.export("projectId", projectResource.id());
    }
}
