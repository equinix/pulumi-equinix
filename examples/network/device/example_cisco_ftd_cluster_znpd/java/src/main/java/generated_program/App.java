package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.equinix.networkedge.Device;
import com.equinix.pulumi.equinix.networkedge.DeviceArgs;
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

        var ciscoFTDSV = new Device("ciscoFTDSV", DeviceArgs.builder()
            .name("TF_Cisco_NGFW_CLUSTER_ZNPD")
            .projectId("XXXXXXX")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("Cisco_NGFW")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("FTDv10")
            .notifications("test@eq.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("7.0.4-55")
            .hostname("test")
            .coreCount(4)
            .termLength(1)
            .interfaceCount(10)
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .clusterName("tf-ftd-cluster")
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .hostname("test")
                        .activationKey("XXXXX")
                        .controller1("X.X.X.X")
                        .managementType("FMC")
                        .build())
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .hostname("test")
                        .managementType("FMC")
                        .build())
                    .build())
                .build())
            .build());

    }
}
