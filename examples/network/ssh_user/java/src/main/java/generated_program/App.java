package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.SshUser;
import com.pulumi.equinix.networkedge.SshUserArgs;
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
        final var device1Id = config.get("device1Id");
        final var device2Id = config.get("device2Id");
        var sshUser = new SshUser("sshUser", SshUserArgs.builder()        
            .username("johnKent")
            .deviceIds(            
                device1Id,
                device2Id)
            .build());

        ctx.export("sshUserId", sshUser.id());
    }
}
