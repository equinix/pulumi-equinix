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

        var f5XcSingle = new Device("f5XcSingle", DeviceArgs.builder()
            .name("tf-f5xc")
            .projectId("XXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("F5XC")
            .selfManaged(true)
            .byol(true)
            .connectivity("INTERNET-ACCESS")
            .packageCode("STD")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(1)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .aclTemplateId("xxxx")
            .version("9.2025.17")
            .interfaceCount(8)
            .coreCount(8)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("token", "XXXXXXXXXX"),
                Map.entry("hostname", "XXXX")
            ))
            .build());

    }
}
