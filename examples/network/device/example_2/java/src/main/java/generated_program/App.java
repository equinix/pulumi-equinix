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
            .build());

        var panwCluster = new Device("panwCluster", DeviceArgs.builder()
            .name("tf-panw")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("PA-VM")
            .selfManaged(true)
            .byol(true)
            .packageCode("VM100")
            .notifications(            
                "john@equinix.com",
                "marry@equinix.com",
                "fred@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .version("10.1.3")
            .interfaceCount(10)
            .coreCount(2)
            .sshKey(DeviceSshKeyArgs.builder()
                .username("test")
                .keyName("test-key")
                .build())
            .aclTemplateId("0bff6e05-f0e7-44cd-804a-25b92b835f8b")
            .clusterDetails(DeviceClusterDetailsArgs.builder()
                .clusterName("tf-panw-cluster")
                .node0(DeviceClusterDetailsNode0Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode0VendorConfigurationArgs.builder()
                        .hostname("panw-node0")
                        .build())
                    .licenseToken("licenseToken")
                    .build())
                .node1(DeviceClusterDetailsNode1Args.builder()
                    .vendorConfiguration(DeviceClusterDetailsNode1VendorConfigurationArgs.builder()
                        .hostname("panw-node1")
                        .build())
                    .licenseToken("licenseToken")
                    .build())
                .build())
            .build());

    }
}
