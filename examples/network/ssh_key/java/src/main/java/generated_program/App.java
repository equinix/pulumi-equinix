package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.SshKey;
import com.pulumi.equinix.networkedge.SshKeyArgs;
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
        var sshKey = new SshKey("sshKey", SshKeyArgs.builder()        
            .name("johnKent")
            .publicKey(Files.readString(Paths.get("/Users/John/.ssh/ne_rsa.pub")))
            .build());

        ctx.export("sshKeyId", sshKey.id());
    }
}
