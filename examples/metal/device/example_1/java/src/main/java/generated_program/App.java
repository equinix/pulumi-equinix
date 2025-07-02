package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        var web1 = new Device("web1", DeviceArgs.builder()
            .hostname("tf.coreos2")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("ubuntu_24_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

    }
}
