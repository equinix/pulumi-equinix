package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Stream;
import com.pulumi.equinix.fabric.StreamArgs;
import com.pulumi.equinix.fabric.inputs.StreamProjectArgs;
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
        var newStream = new Stream("newStream", StreamArgs.builder()
            .type("TELEMETRY_STREAM")
            .name("<name_of_stream_resource>")
            .description("<description_of_stream_resource>")
            .project(StreamProjectArgs.builder()
                .projectId("<destination_project_id_for_stream")
                .build())
            .build());

        ctx.export("streamState", newStream.state());
    }
}
