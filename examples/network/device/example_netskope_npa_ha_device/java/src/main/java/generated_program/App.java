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

        var netskopeNpa = new Device("netskopeNpa", DeviceArgs.builder()
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("NETSKOPE-NPA-Sec")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .notifications("test@eq.com")
                .vendorConfiguration(Map.ofEntries(
                    Map.entry("hostname", "test"),
                    Map.entry("privateCidrMask", "24"),
                    Map.entry("ipAddressType", "STATIC"),
                    Map.entry("ipAddress", "x.x.x.x"),
                    Map.entry("gatewayIp", "x.x.x.x"),
                    Map.entry("primaryNameServer", "x.x.x.x"),
                    Map.entry("secondaryNameServer", "x.x.x.x"),
                    Map.entry("dnsSearchDomain", "xxxxx")
                ))
                .build())
            .name("NETSKOPE-NPA")
            .projectId("xxxxxxx")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("NETSKOPE-NPA")
            .selfManaged(true)
            .byol(true)
            .interfaceCount(1)
            .packageCode("STD")
            .notifications("test@eq.com")
            .connectivity("PRIVATE")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("R138")
            .coreCount(2)
            .termLength(1)
            .vendorConfiguration(Map.ofEntries(
                Map.entry("hostname", "test"),
                Map.entry("privateCidrMask", "24"),
                Map.entry("ipAddressType", "STATIC"),
                Map.entry("ipAddress", "x.x.x.x"),
                Map.entry("gatewayIp", "x.x.x.x"),
                Map.entry("primaryNameServer", "x.x.x.x"),
                Map.entry("secondaryNameServer", "x.x.x.x"),
                Map.entry("dnsSearchDomain", "xxxxx")
            ))
            .build());

    }
}
