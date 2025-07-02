package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.DeviceNetworkType;
import com.pulumi.equinix.metal.DeviceNetworkTypeArgs;
import com.pulumi.equinix.metal.PortVlanAttachment;
import com.pulumi.equinix.metal.PortVlanAttachmentArgs;
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
        var test = new Vlan("test", VlanArgs.builder()
            .description("VLAN in New York")
            .metro("ny")
            .projectId(projectId)
            .build());

        var testDevice = new Device("testDevice", DeviceArgs.builder()
            .hostname("test")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_24_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        var testDeviceNetworkType = new DeviceNetworkType("testDeviceNetworkType", DeviceNetworkTypeArgs.builder()
            .deviceId(testDevice.id())
            .type("hybrid")
            .build());

        var testPortVlanAttachment = new PortVlanAttachment("testPortVlanAttachment", PortVlanAttachmentArgs.builder()
            .deviceId(testDeviceNetworkType.id())
            .portName("eth1")
            .vlanVnid(test.vxlan())
            .build());

    }
}
