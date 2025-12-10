package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.equinix.networkedge.Device;
import com.equinix.pulumi.equinix.networkedge.DeviceArgs;
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
            .name("TF_FTNT-SDWAN")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("FG-SDWAN")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM02")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.0.14")
            .hostname("test")
            .coreCount(2)
            .termLength(1)
            .additionalBandwidth(50)
            .aclTemplateId("XXXXXXXX")
            .vendorConfiguration(Map.ofEntries(
                Map.entry("adminPassword", "XXXXX"),
                Map.entry("controller1", "X.X.X.X")
            ))
            .build());

    }
}
