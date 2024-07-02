package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.UserApiKey;
import com.pulumi.equinix.metal.UserApiKeyArgs;
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
        final var description = config.get("description").orElse("An user level API Key");
        final var readOnly = config.get("readOnly").orElse(false);
        var apiKey = new UserApiKey("apiKey", UserApiKeyArgs.builder()
            .description(description)
            .readOnly(readOnly)
            .build());

        ctx.export("apiKeyToken", apiKey.token());
    }
}
