package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.NetworkFile;
import com.pulumi.equinix.networkedge.NetworkFileArgs;
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSecondaryDeviceArgs;
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
            .name("account-name")
            .metroCode("SV")
            .build());

        var bluecatEdgeServicePointCloudinitPrimaryFile = new NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile", NetworkFileArgs.builder()
            .fileName("TF-BLUECAT-ESP-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .deviceTypeCode("BLUECAT-EDGE-SERVICE-POINT")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var bluecatEdgeServicePointCloudinitSecondaryFile = new NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", NetworkFileArgs.builder()
            .fileName("TF-BLUECAT-ESP-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).applyValue(_invoke -> _invoke.result()))
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .deviceTypeCode("BLUECAT-EDGE-SERVICE-POINT")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var bluecatEdgeServicePointHa = new Device("bluecatEdgeServicePointHa", DeviceArgs.builder()
            .name("tf-bluecat-edge-service-point-p")
            .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
            .typeCode("BLUECAT-EDGE-SERVICE-POINT")
            .selfManaged(true)
            .connectivity("PRIVATE")
            .byol(true)
            .packageCode("STD")
            .notifications("test@equinix.com")
            .accountNumber(sv.applyValue(_sv -> _sv.number()))
            .cloudInitFileId(bluecatEdgeServicePointCloudinitPrimaryFile.uuid())
            .version("4.6.3")
            .coreCount(4)
            .termLength(12)
            .secondaryDevice(DeviceSecondaryDeviceArgs.builder()
                .name("tf-bluecat-edge-service-point-s")
                .metroCode(sv.applyValue(_sv -> _sv.metroCode()))
                .notifications("test@eq.com")
                .accountNumber(sv.applyValue(_sv -> _sv.number()))
                .cloudInitFileId(bluecatEdgeServicePointCloudinitSecondaryFile.uuid())
                .build())
            .build());

    }
}
