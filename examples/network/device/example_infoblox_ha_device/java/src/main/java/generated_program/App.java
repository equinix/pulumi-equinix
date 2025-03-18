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
            .build());

        var iNFOBLOXSV = new Device("iNFOBLOXSV", DeviceArgs.builder()
            .name("TF_INFOBLOX")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-GRID-MEMBER")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.0.5")
            .hostname("test")
            .coreCount(8)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("adminPassword", "X.X.X.X"),
                Map.entry("ipAddress", "X.X.X.X"),
                Map.entry("subnetMaskIp", "X.X.X.X"),
                Map.entry("gatewayIp", "X.X.X.X")
            ))
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_INFOBLOX-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .hostname("test")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("adminPassword", "X.X.X.X"),
                    Map.entry("ipAddress", "X.X.X.X"),
                    Map.entry("subnetMaskIp", "X.X.X.X"),
                    Map.entry("gatewayIp", "X.X.X.X")
                ))
                .build())
            .build());

    }
}
