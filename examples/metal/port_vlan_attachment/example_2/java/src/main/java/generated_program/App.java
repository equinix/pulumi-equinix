package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.equinix.metal.DeviceNetworkType;
import com.pulumi.equinix.metal.DeviceNetworkTypeArgs;
import com.pulumi.equinix.metal.Vlan;
import com.pulumi.equinix.metal.VlanArgs;
import com.pulumi.equinix.metal.PortVlanAttachment;
import com.pulumi.equinix.metal.PortVlanAttachmentArgs;
import com.pulumi.resources.CustomResourceOptions;
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
        var test = new Device("test", DeviceArgs.builder()
            .hostname("test")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_20_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build());

        var testDeviceNetworkType = new DeviceNetworkType("testDeviceNetworkType", DeviceNetworkTypeArgs.builder()
            .deviceId(test.id())
            .type("layer2-individual")
            .build());

        var test1 = new Vlan("test1", VlanArgs.builder()
            .description("VLAN in New York")
            .metro("ny")
            .projectId(projectId)
            .build());

        var test2 = new Vlan("test2", VlanArgs.builder()
            .description("VLAN in New Jersey")
            .metro("ny")
            .projectId(projectId)
            .build());

        var test1PortVlanAttachment = new PortVlanAttachment("test1PortVlanAttachment", PortVlanAttachmentArgs.builder()
            .deviceId(testDeviceNetworkType.id())
            .vlanVnid(test1.vxlan())
            .portName("eth1")
            .build());

        var test2PortVlanAttachment = new PortVlanAttachment("test2PortVlanAttachment", PortVlanAttachmentArgs.builder()
            .deviceId(testDeviceNetworkType.id())
            .vlanVnid(test2.vxlan())
            .portName("eth1")
            .native_(true)
            .build(), CustomResourceOptions.builder()
                .dependsOn(test1PortVlanAttachment)
                .build());

    }
}
