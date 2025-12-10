package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.ReservedIpBlock;
import com.equinix.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.equinix.pulumi.equinix.metal.Device;
import com.equinix.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.inputs.DeviceIpAddressArgs;
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
        var example = new ReservedIpBlock("example", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .quantity(2)
            .build());

        var nodes = new Device("nodes", DeviceArgs.builder()
            .projectId(projectId)
            .metro("sv")
            .plan("c3.small.x86")
            .operatingSystem("ubuntu_24_04")
            .hostname("test")
            .billingCycle("hourly")
            .ipAddresses(            
                DeviceIpAddressArgs.builder()
                    .type("public_ipv4")
                    .cidr(31)
                    .reservationIds(example.id())
                    .build(),
                DeviceIpAddressArgs.builder()
                    .type("private_ipv4")
                    .build())
            .build());

    }
}
