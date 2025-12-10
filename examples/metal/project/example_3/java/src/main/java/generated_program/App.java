package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.Project;
import com.equinix.pulumi.equinix.metal.ProjectArgs;
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
        var existingProject = new Project("existingProject", ProjectArgs.builder()
            .name("The name of the project (if different, will rewrite)")
            .bgpConfig(ProjectBgpConfigArgs.builder()
                .deploymentType("local")
                .md5("C179c28c41a85b")
                .asn(65000)
                .build())
            .build());

    }
}
