package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.ProjectApiKey;
import com.equinix.pulumi.metal.ProjectApiKeyArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var readOnly = config.getBoolean("readOnly").orElse(false);
        var apiKey = new ProjectApiKey("apiKey", ProjectApiKeyArgs.builder()        
            .projectId(projectId)
            .description("A project level API Key")
            .readOnly(readOnly)
            .build());

        ctx.export("apiKeyToken", apiKey.token());
    }
}
