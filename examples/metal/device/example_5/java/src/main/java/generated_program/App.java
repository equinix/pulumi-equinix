package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.inputs.DeviceBehaviorArgs;
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
        var pxe1 = new Device("pxe1", DeviceArgs.builder()
            .hostname("tf.coreos2-pxe")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("custom_ipxe")
            .billingCycle("hourly")
            .projectId(projectId)
            .ipxeScriptUrl("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe")
            .alwaysPxe("false")
            .userData(userData)
            .customData(customData)
            .behavior(DeviceBehaviorArgs.builder()
                .allowChanges(                
                    "custom_data",
                    "user_data")
                .build())
            .build());

    }
}
