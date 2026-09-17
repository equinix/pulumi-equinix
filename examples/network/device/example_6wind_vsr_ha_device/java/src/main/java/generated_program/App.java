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
            .build());

        var sixWindVsr = new Device("sixWindVsr", DeviceArgs.builder()
            .sshKey(DeviceSshKeyArgs.builder()
                .username("xxxx")
                .keyName("xxxxx")
                .build())
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("6WIND-VSR-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("token", "xxxx")
                ))
                .build())
            .name("6WIND-VSR")
            .projectId("xxxxxxx")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("6WIND-VSR")
            .selfManaged(true)
            .byol(true)
            .interfaceCount(10)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("3.10.8")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("token", "xxxx")
            ))
            .build());

    }
}
