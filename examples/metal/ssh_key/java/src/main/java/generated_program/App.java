package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.SshKey;
import com.equinix.pulumi.equinix.metal.SshKeyArgs;
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
import com.equinix.pulumi.equinix.metal.Device;
import com.equinix.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.resources.CustomResourceOptions;
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
        var key1 = new SshKey("key1", SshKeyArgs.builder()
            .name("terraform-1")
            .publicKey(StdFunctions.file(FileArgs.builder()
                .input("/home/terraform/.ssh/id_rsa.pub")
                .build()).applyValue(_invoke -> _invoke.result()))
            .build());

        var test = new Device("test", DeviceArgs.builder()
            .hostname("test-device")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("ubuntu_24_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build(), CustomResourceOptions.builder()
                .dependsOn(key1)
                .build());

    }
}
