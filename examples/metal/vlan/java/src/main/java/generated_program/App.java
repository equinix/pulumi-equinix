package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.equinix.metal.Vlan;
import com.equinix.equinix.metal.VlanArgs;
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
        var vlan1 = new Vlan("vlan1", VlanArgs.builder()
            .description("VLAN in New Jersey")
            .metro("sv")
            .projectId(projectId)
            .vxlan(1040)
            .build());

    }
}
