package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.Project;
import com.equinix.pulumi.equinix.metal.ProjectArgs;
import com.equinix.pulumi.equinix.metal.Vrf;
import com.equinix.pulumi.equinix.metal.VrfArgs;
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
        var example = new Project("example", ProjectArgs.builder()
            .name("example")
            .build());

        var exampleVrf = new Vrf("exampleVrf", VrfArgs.builder()
            .description("VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25")
            .name("example-vrf")
            .metro("da")
            .localAsn(65000)
            .ipRanges(            
                "192.168.100.0/25",
                "192.168.200.0/25")
            .projectId(example.id())
            .build());

    }
}
