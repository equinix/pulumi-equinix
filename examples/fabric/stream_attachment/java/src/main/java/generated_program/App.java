package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.StreamAttachment;
import com.equinix.pulumi.equinix.fabric.StreamAttachmentArgs;
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
        var asset = new StreamAttachment("asset", StreamAttachmentArgs.builder()
            .assetId("<id_of_the_asset_being_attached>")
            .asset("<asset_group>")
            .streamId("<id_of_the_stream_asset_is_being_attached_to>")
            .build());

    }
}
