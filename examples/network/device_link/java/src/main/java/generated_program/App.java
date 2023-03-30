package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.networkedge.DeviceLink;
import com.equinix.pulumi.networkedge.DeviceLinkArgs;
import com.equinix.pulumi.networkedge.inputs.DeviceLinkDeviceArgs;
import com.equinix.pulumi.networkedge.inputs.DeviceLinkLinkArgs;
import com.equinix.pulumi.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.networkedge.inputs.GetDeviceArgs;
import com.equinix.pulumi.networkedge.NetworkedgeFunctions;
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
        final var config = ctx.config();
        final var accountName = config.get("accountName").get();
        final var accountMetro = config.get("accountMetro").get();
        final var device1Id = config.get("device1Id").get();
        final var device2Id = config.get("device2Id").get();
        final var accountfNum = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name(accountName)
            .metroCode(accountMetro)
            .build()).applyValue(account -> account.number());

        final var device1Metro = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
            .uuid(device1Id)
            .build()).applyValue(device -> device.metroCode());

        final var device2Metro = NetworkedgeFunctions.getDevice(GetDeviceArgs.builder()
            .uuid(device2Id)
            .build()).applyValue(device -> device.metroCode());

        var deviceLink = new DeviceLink("deviceLink", DeviceLinkArgs.builder()        
            .name("test-link")
            .subnet("192.168.40.64/27")
            .devices(            
                DeviceLinkDeviceArgs.builder()
                    .id("device1Id")
                    .asn(22111)
                    .interfaceId(6)
                    .build(),
                DeviceLinkDeviceArgs.builder()
                    .id("device2Id")
                    .asn(22333)
                    .interfaceId(7)
                    .build())
            .links(DeviceLinkLinkArgs.builder()
                .accountNumber(accountfNum)
                .srcMetroCode(device1Metro)
                .dstMetroCode(device2Metro)
                .throughput("50")
                .throughputUnit("Mbps")
                .build())
            .build());

        ctx.export("status", deviceLink.status());
        ctx.export("devices", deviceLink.devices());
    }
}
