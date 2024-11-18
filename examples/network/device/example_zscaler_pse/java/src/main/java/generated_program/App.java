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
            .metroCode("SV")
            .build());

        var zscalerPseSingle = new Device("zscalerPseSingle", DeviceArgs.builder()
            .name("tf-zscaler-pse")
            .projectId("XXXXXX")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("ZSCALER-PSE")
            .selfManaged(true)
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("STD")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("23.395.1")
            .interfaceCount(1)
            .coreCount(4)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("provisioningKey", "XXXXXXXXXX"),
                Map.entry("hostname", "XXXX")
            ))
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .build());

    }
}
