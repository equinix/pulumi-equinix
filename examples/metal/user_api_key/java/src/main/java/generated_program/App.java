package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.UserApiKey;
import com.equinix.pulumi.metal.UserApiKeyArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var description = config.get("description").orElse("An user level API Key");
        final var readOnly = config.getBoolean("readOnly").orElse(false);
        var apiKey = new UserApiKey("apiKey", UserApiKeyArgs.builder()        
            .description(description)
            .readOnly(readOnly)
            .build());

        ctx.export("apiKeyToken", apiKey.token());
    }
}
