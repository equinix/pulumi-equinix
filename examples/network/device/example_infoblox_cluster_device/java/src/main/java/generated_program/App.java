package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
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
            .build());

        var iNFOBLOXSV = new Device("iNFOBLOXSV", DeviceArgs.builder()
            .name("TF_INFOBLOX")
            .projectId("XXXXXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("INFOBLOX-GRID-MEMBER")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("9.0.5")
            .hostname("test")
            .connectivity("PRIVATE")
            .coreCount(8)
            .termLength(1)
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .clusterName("tf-infoblox-cluster")
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .adminPassword("Welcome@1")
                        .ipAddress("192.168.1.35")
                        .subnetMaskIp("255.255.255.0")
                        .gatewayIp("192.168.1.1")
                        .hostname("test")
                        .build())
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .adminPassword("Welcome@1")
                        .ipAddress("192.168.1.35")
                        .subnetMaskIp("255.255.255.0")
                        .gatewayIp("192.168.1.1")
                        .hostname("test")
                        .build())
                    .build())
                .build())
            .build());

    }
}
