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
        final var dc = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("DC")
            .build());

        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var csr1000VHa = new Device("csr1000VHa", DeviceArgs.builder()
            .name("tf-csr1000v-p")
            .throughput(500)
            .throughputUnit("Mbps")
            .metroCode(dc.applyValue(_dc -> _dc.metroCode()))
            .typeCode("CSR1000V")
            .selfManaged(false)
            .connectivity("INTERNET-ACCESS")
            .byol(false)
            .packageCode("SEC")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .hostname("csr1000v-p")
            .termLength(12)
            .accountNumber(dc.applyValue(_dc -> _dc.number()))
            .version("16.09.05")
            .coreCount(2)
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-csr1000v-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .hostname("csr1000v-s")
                .notifications(                
                    "john@equinix.com",
                    "marry@equinix.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .build())
            .build());

    }
}
