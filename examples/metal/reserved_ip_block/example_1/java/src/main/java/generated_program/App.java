package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
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
        var twoElasticAddresses = new ReservedIpBlock("twoElasticAddresses", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .quantity(2)
            .build());

        var test1 = new ReservedIpBlock("test1", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .type("public_ipv4")
            .metro("sv")
            .quantity(1)
            .build());

        var test = new ReservedIpBlock("test", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .type("global_ipv4")
            .quantity(1)
            .build());

    }
}
