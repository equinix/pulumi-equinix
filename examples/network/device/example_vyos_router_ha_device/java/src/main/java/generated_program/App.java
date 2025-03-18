package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var vYOSAM = new Device("vYOSAM", DeviceArgs.builder()
            .name("TF_VYOS")
            .projectId("XXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("VYOS-ROUTER")
            .selfManaged(true)
            .byol(false)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("1.4.1-2501")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .aclTemplateId("XXXXXXXX")
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("xxxxxxxx")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_CHECKPOINT")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .hostname("test")
                .aclTemplateId("XXXXXXXXXXX")
                .notifications("test@eq.com")
                .build())
            .build());

    }
}
