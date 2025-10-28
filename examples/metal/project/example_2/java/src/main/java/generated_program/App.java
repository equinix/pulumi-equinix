package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.equinix.metal.Project;
import com.equinix.equinix.metal.ProjectArgs;
import com.pulumi.equinix.metal.inputs.ProjectBgpConfigArgs;
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
        var tfProject1 = new Project("tfProject1", ProjectArgs.builder()
            .name("tftest")
            .bgpConfig(ProjectBgpConfigArgs.builder()
                .deploymentType("local")
                .md5("C179c28c41a85b")
                .asn(65000)
                .build())
            .build());

    }
}
