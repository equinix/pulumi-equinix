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
            .name("account-name")
            .build());

        var c8000VByol = new Device("c8000VByol", DeviceArgs.builder()
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .connectivity("PRIVATE")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .tier(1)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .vendorConfiguration(Map.ofEntries(
                Map.entry("restApiSupportRequirement", "true"),
                Map.entry("ipAddressType", "NO_IP_ADDRESS")
            ))
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-c8000v-byol-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("csr8000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("restApiSupportRequirement", "true"),
                    Map.entry("ipAddressType", "NO_IP_ADDRESS")
                ))
                .build())
            .build());

    }
}
