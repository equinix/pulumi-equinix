package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.DeviceLink;
import com.pulumi.equinix.networkedge.DeviceLinkArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkDeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkLinkArgs;
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
        var test = new DeviceLink("test", DeviceLinkArgs.builder()
            .name("test-link")
            .subnet("192.168.40.64/27")
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .devices(            
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.uuid())
                    .asn(22111)
                    .interfaceId(6)
                    .build(),
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.secondaryDevice()[0].uuid())
                    .asn(22333)
                    .interfaceId(7)
                    .build())
            .links(DeviceLinkLinkArgs.builder()
                .accountNumber(testEquinixNetworkDevice.accountNumber())
                .srcMetroCode(testEquinixNetworkDevice.metroCode())
                .dstMetroCode(testEquinixNetworkDevice.secondaryDevice()[0].metroCode())
                .throughput("50")
                .throughputUnit("Mbps")
                .build())
            .build());

    }
}
