package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ProjectSshKey;
import com.pulumi.equinix.metal.ProjectSshKeyArgs;
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
        final var projectId = config.get("projectId");
        var sshKey = new ProjectSshKey("sshKey", ProjectSshKeyArgs.builder()        
            .projectId(projectId)
            .name("johnKent")
            .publicKey(Files.readString(Paths.get("/Users/John/.ssh/metal_rsa.pub")))
            .build());

        ctx.export("sshKeyId", sshKey.id());
    }
}
