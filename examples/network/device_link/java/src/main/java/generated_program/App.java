package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.DeviceLink;
import com.pulumi.equinix.networkedge.DeviceLinkArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkDeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceLinkMetroLinkArgs;
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
            .name("test-DLG")
            .projectId("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
            .devices(            
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.uuid())
                    .interfaceId(6)
                    .build(),
                DeviceLinkDeviceArgs.builder()
                    .id(testEquinixNetworkDevice.secondaryDevice()[0].uuid())
                    .interfaceId(7)
                    .build())
            .metroLinks(            
                DeviceLinkMetroLinkArgs.builder()
                    .accountNumber(testEquinixNetworkDevice.accountNumber())
                    .metroCode(testEquinixNetworkDevice.metroCode())
                    .throughput("50")
                    .throughputUnit("Mbps")
                    .build(),
                DeviceLinkMetroLinkArgs.builder()
                    .accountNumber(testEquinixNetworkDevice.secondaryDevice()[0].accountNumber())
                    .metroCode(testEquinixNetworkDevice.secondaryDevice()[0].metroCode())
                    .throughput("50")
                    .throughputUnit("Mbps")
                    .build())
            .build());

    }
}
