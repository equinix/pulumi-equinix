package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
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

        var cHECKPOINTSV = new Device("cHECKPOINTSV", DeviceArgs.builder()
            .name("TF_CHECKPOINT")
            .projectId("XXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("CGUARD")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("R81.20")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(5)
            .aclTemplateId("XXXXXXX")
            .sshKey(DeviceSshKeyArgs.builder()
                .username("XXXXX")
                .keyName("XXXXXX")
                .build())
            .build());

    }
}
