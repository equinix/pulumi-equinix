package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.SshKey;
import com.pulumi.equinix.networkedge.SshKeyArgs;
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
            .name("account-name")
            .metroCode("SV")
            .build());

        var testPublicKey = new SshKey("testPublicKey", SshKeyArgs.builder()
            .name("key-name")
            .publicKey("ssh-dss key-value")
            .type("DSA")
            .build());

        var bluecatBddsHa = new Device("bluecatBddsHa", DeviceArgs.builder()
            .name("tf-bluecat-bdds-p")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("BLUECAT")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("9.6.0")
            .coreCount(2)
            .termLength(12)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("privateAddress", "x.x.x.x"),
                Map.entry("privateCidrMask", "24"),
                Map.entry("privateGateway", "x.x.x.x"),
                Map.entry("licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
                Map.entry("licenseId", "xxxxxxxxxxxxxxx")
            ))
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test-username")
                .keyName(testPublicKey.name())
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-bluecat-bdds-s")
                .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("privateAddress", "x.x.x.x"),
                    Map.entry("privateCidrMask", "24"),
                    Map.entry("privateGateway", "x.x.x.x"),
                    Map.entry("licenseKey", "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
                    Map.entry("licenseId", "xxxxxxxxxxxxxxx")
                ))
                .build())
            .build());

    }
}
