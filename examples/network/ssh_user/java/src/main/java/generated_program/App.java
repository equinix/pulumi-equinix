package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.networkedge.SshUser;
import com.equinix.pulumi.equinix.networkedge.SshUserArgs;
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
        var john = new SshUser("john", SshUserArgs.builder()
            .username("john")
            .password("secret")
            .deviceIds(            
                "csr1000v-ha-uuid",
                "csr1000v-ha-redundant-uuid")
            .build());

    }
}
