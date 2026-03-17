package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0Args;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode0VendorConfigurationArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1Args;
import com.pulumi.equinix.networkedge.inputs.DeviceClusterDetailsNode1VendorConfigurationArgs;
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
            .name("account-name")
            .build());

        var fGVMSV = new Device("fGVMSV", DeviceArgs.builder()
            .name("tf-fgvm-cluster-static-znpd")
            .metroCode("DC")
            .typeCode("FG-VM")
            .projectId("xxxxxxx")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("VM02")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(xxxxxx)
            .version("7.6.2")
            .interfaceCount(10)
            .coreCount(2)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("sanity1")
                .keyName("")
                .build())
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .clusterName("tf-fgvm--cluster")
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .ipAddress("x.x.x.x")
                        .subnetMaskIp("x.x.x.x")
                        .gatewayIp("x.x.x.x")
                        .managementInterfaceId("5")
                        .hostname("test")
                        .ipAddressType("STATIC")
                        .build())
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .ipAddress("x.x.x.x")
                        .subnetMaskIp("x.x.x.x")
                        .gatewayIp("x.x.x.x")
                        .managementInterfaceId("5")
                        .hostname("test")
                        .ipAddressType("STATIC")
                        .build())
                    .build())
                .build())
            .build());

    }
}
