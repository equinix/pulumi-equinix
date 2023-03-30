package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Project;
import com.equinix.pulumi.metal.ProjectArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var organizationId = config.get("organizationId").get();
        final var name = config.get("name").orElse("Default Project");
        var projectResource = new Project("projectResource", ProjectArgs.builder()        
            .name(name)
            .organizationId(organizationId)
            .build());

        ctx.export("projectId", projectResource.id());
    }
}
