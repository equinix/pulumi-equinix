package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.equinix.networkedge.SshKey;
import com.equinix.pulumi.equinix.networkedge.SshKeyArgs;
import com.equinix.pulumi.equinix.networkedge.Device;
import com.equinix.pulumi.equinix.networkedge.DeviceArgs;
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
            .name("account-name")
            .metroCode("SV")
            .build());

        var testPublicKey = new SshKey("testPublicKey", SshKeyArgs.builder()
            .name("key-name")
            .publicKey("ssh-dss key-value")
            .type("DSA")
            .build());

        var aristaHa = new Device("aristaHa", DeviceArgs.builder()
            .name("tf-arista-p")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("ARISTA-ROUTER")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("CloudEOS")
            .notifications("test@equinix.com")
            .hostname("arista-p")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("4.29.0")
            .coreCount(4)
            .termLength(12)
            .additionalBandwidth(5)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName(testPublicKey.name())
                .build())
            .aclTemplateId("c637a17b-7a6a-4486-924b-30e6c36904b0")
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-arista-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("arista-s")
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .aclTemplateId("fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138")
                .build())
            .build());

    }
}
