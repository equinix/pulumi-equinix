package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ProjectApiKey;
import com.pulumi.equinix.metal.ProjectApiKeyArgs;
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
        var test = new ProjectApiKey("test", ProjectApiKeyArgs.builder()
            .projectId(existingProjectId)
            .description("Read-only key scoped to a projct")
            .readOnly(true)
            .build());

    }
}
