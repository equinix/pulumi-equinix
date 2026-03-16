package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
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

        var fTNTFIREWALLSV = new Device("fTNTFIREWALLSV", DeviceArgs.builder()
            .name("TF_FTNT-FIREWALL")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("FG-VM")
            .selfManaged(true)
            .byol(true)
            .interfaceCount(10)
            .connectivity("PRIVATE")
            .packageCode("VM02")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.6.3")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("ipAddressType", "DHCP"),
                Map.entry("managementInterfaceId", "6")
            ))
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_FTNT-FIREWALL-secondary")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("fg-vm-znpd")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("ipAddressType", "DHCP"),
                    Map.entry("managementInterfaceId", "6")
                ))
                .build())
            .build());

    }
}
