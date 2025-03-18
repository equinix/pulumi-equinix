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

        var aRUBAEDGECONNECTAM = new Device("aRUBAEDGECONNECTAM", DeviceArgs.builder()
            .name("TF_Aruba_Edge_Connect")
            .projectId("XXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("EDGECONNECT-SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("EC-V")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.4.2.3")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .interfaceCount(32)
            .aclTemplateId("XXXXXXX")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("accountKey", "xxxxx"),
                Map.entry("accountName", "xxxx"),
                Map.entry("applianceTag", "tests"),
                Map.entry("hostname", "test")
            ))
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_CHECKPOINT")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .aclTemplateId("XXXXXXX")
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("accountKey", "xxxxx"),
                    Map.entry("accountName", "xxxx"),
                    Map.entry("applianceTag", "test"),
                    Map.entry("hostname", "test")
                ))
                .build())
            .build());

    }
}
