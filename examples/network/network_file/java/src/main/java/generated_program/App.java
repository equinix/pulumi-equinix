package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.networkedge.NetworkFile;
import com.equinix.pulumi.networkedge.NetworkFileArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var metro = config.get("metro").orElse("SV");

        String content = null;
        try {
            content = Files.readString(Paths.get("./../assets/aviatrix-cloud-init.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        var networkFile = new NetworkFile("networkFile", NetworkFileArgs.builder()        
            .fileName("Aviatrix-ZTP-file")
            .content(content)
            .metroCode(metro)
            .deviceTypeCode("AVIATRIX_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

        ctx.export("networkFileId", networkFile.id());
        ctx.export("networkFileStatus", networkFile.status());
    }
}
