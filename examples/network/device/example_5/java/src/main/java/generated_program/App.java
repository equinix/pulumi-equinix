package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.equinix.networkedge.Device;
import com.equinix.pulumi.equinix.networkedge.DeviceArgs;
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
            .name("account-name")
            .metroCode("SV")
            .build());

        var vsrxSingle = new Device("vsrxSingle", DeviceArgs.builder()
            .name("tf-c8kv-sdwan")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("VSRX")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .hostname("VSRX")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("23.2R1.13")
            .coreCount(2)
            .termLength(12)
            .additionalBandwidth(5)
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .diverseDeviceId("ed7891bd-15b4-4f72-ac56-d96cfdacddcc")
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName("valid-key-name")
                .build())
            .aclTemplateId("3e548c02-9164-4197-aa23-05b1f644883c")
            .build());

    }
}
