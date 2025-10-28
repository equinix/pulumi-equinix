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

        var c8000VByolThroughput = new Device("c8000VByolThroughput", DeviceArgs.builder()
            .name("tf-c8000v-byol")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode("network-essentials")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("17.11.01a")
            .interfaceCount(10)
            .coreCount(2)
            .throughput(100)
            .throughputUnit("Mbps")
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .build());

    }
}
