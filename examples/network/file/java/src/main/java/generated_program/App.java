package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.NetworkFile;
import com.pulumi.equinix.networkedge.NetworkFileArgs;
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
        final var filepath = config.get("filepath").orElse("fileFolder/fileName.txt");
        var testFile = new NetworkFile("testFile", NetworkFileArgs.builder()
            .fileName("fileName.txt")
            .content(StdFunctions.file(FileArgs.builder()
                .input(filepath)
                .build()).result())
            .metroCode("SV")
            .deviceTypeCode("AVIATRIX_EDGE")
            .processType("CLOUD_INIT")
            .selfManaged(true)
            .byol(true)
            .build());

    }
}
