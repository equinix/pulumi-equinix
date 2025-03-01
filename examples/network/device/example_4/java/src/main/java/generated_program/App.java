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
            .name("account-name")
            .metroCode("SV")
            .build());

        var c8KvSingle = new Device("c8KvSingle", DeviceArgs.builder()
            .name("tf-c8kv")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .notifications("test@equinix.com")
            .hostname("C8KV")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.06.01a")
            .coreCount(2)
            .termLength(12)
            .licenseToken("valid-license-token")
            .additionalBandwidth(5)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName("valid-key-name")
                .build())
            .aclTemplateId("3e548c02-9164-4197-aa23-05b1f644883c")
            .build());

    }
}
