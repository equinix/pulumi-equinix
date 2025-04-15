package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
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
            .byol(true)
            .connectivity("PRIVATE")
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.0.5")
            .coreCount(8)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("adminPassword", "xxxxxx"),
                Map.entry("ipAddress", "X.X.X.X"),
                Map.entry("subnetMaskIp", "X.X.X.X"),
                Map.entry("gatewayIp", "X.X.X.X")
            ))
            .build());

    }
}
