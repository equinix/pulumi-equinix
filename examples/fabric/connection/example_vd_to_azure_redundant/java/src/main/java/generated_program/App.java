package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.Connection;
import com.equinix.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointVirtualDeviceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointInterfaceArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
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
        var vd2AzurePrimary = new Connection("vd2AzurePrimary", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(7)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .build())
                .build())
            .build());

        var vd2AzureSecondary = new Connection("vd2AzureSecondary", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPL_VC")
            .redundancy(ConnectionRedundancyArgs.builder()
                .priority("SECONDARY")
                .group(vd2AzurePrimary.redundancy().applyValue(_redundancy -> _redundancy.group()))
                .build())
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("VD")
                    .virtualDevice(ConnectionASideAccessPointVirtualDeviceArgs.builder()
                        .type("EDGE")
                        .uuid("<device_uuid>")
                        .build())
                    .interface_(ConnectionASideAccessPointInterfaceArgs.builder()
                        .type("CLOUD")
                        .id(5)
                        .build())
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<Azure_ExpressRouter_Auth_Key>")
                    .peeringType("PRIVATE")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<Azure_Service_Profile_UUID>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .build())
                .build())
            .build());

    }
}
