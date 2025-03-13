package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkedgeFunctions;
import com.pulumi.equinix.networkedge.inputs.GetAccountArgs;
import com.pulumi.equinix.networkedge.NetworkFile;
import com.pulumi.equinix.networkedge.NetworkFileArgs;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
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
        final var filepath = config.get("filepath").orElse("cloudInitFileFolder/TF-AVX-cloud-init-file.txt");
        final var sv = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .metroCode("SV")
            .build());

        var aviatrixCloudinitFile = new NetworkFile("aviatrixCloudinitFile", NetworkFileArgs.builder()
            .fileName("TF-AVX-cloud-init-file.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).result())
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .deviceTypeCode("AVIATRIX_TRANSIT_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        var aviatrixTransitEdgeSingle = new Device("aviatrixTransitEdgeSingle", DeviceArgs.builder()
            .name("tf-aviatrix")
            .metroCode(sv.applyValue(getAccountResult -> getAccountResult.metroCode()))
            .typeCode("AVIATRIX_TRANSIT_EDGE")
            .selfManaged(true)
            .byol(true)
            .packageCode("STD")
            .notifications("john@equinix.com")
            .termLength(12)
            .accountNumber(sv.applyValue(getAccountResult -> getAccountResult.number()))
            .version("7.2.a")
            .coreCount(2)
            .cloudInitFileId(aviatrixCloudinitFile.uuid())
            .aclTemplateId("c06150ea-b604-4ad1-832a-d63936e9b938")
            .build());

    }
}
