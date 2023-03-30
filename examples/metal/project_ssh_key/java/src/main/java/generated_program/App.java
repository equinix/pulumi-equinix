package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.ProjectSshKey;
import com.equinix.pulumi.metal.ProjectSshKeyArgs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();

        String content = null;
        try {
            content = Files.readString(Paths.get("/Users/John/.ssh/metal_rsa.pub"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        var sshKey = new ProjectSshKey("sshKey", ProjectSshKeyArgs.builder()        
            .projectId(projectId)
            .name("johnKent")
            .publicKey(content)
            .build());

        ctx.export("sshKeyId", sshKey.id());
    }
}
