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

        var niosXHa = new Device("niosXHa", DeviceArgs.builder()
            .name("TF_INFOBLOX-NIOS-X")
            .projectId("xxxxxxx")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-NIOSX")
            .selfManaged(true)
            .connectivity("INTERNET-ACCESS")
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("4.0")
            .coreCount(3)
            .interfaceCount(5)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("token", "xxxxx")
            ))
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("TF_INFOBLOX-NIOS-X-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("token", "xxxxx")
                ))
                .build())
            .build());

    }
}
