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

        var fTNTSDWANSV = new Device("fTNTSDWANSV", DeviceArgs.builder()
            .name("TF_VERSA-SDWAN")
            .projectId("XXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("VERSA_SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("FLEX_VNF_2")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("21.2.3")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .aclTemplateId("XXXXXXXXX")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("controller1", "X.X.X.X"),
                Map.entry("controller2", "X.X.X.X"),
                Map.entry("localId", "test@test.com"),
                Map.entry("remoteId", "test@test.com"),
                Map.entry("serialNumber", "4")
            ))
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("Praveena_TF_VERSA")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .aclTemplateId("XXXXXXXX")
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("controller1", "X.X.X.X"),
                    Map.entry("controller2", "X.X.X.X"),
                    Map.entry("localId", "test@test.com"),
                    Map.entry("remoteId", "test@test.com"),
                    Map.entry("serialNumber", "4")
                ))
                .build())
            .build());

    }
}
