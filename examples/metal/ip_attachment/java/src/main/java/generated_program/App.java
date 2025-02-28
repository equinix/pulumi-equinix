package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.pulumi.equinix.metal.IpAttachment;
import com.pulumi.equinix.metal.IpAttachmentArgs;
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.CidrhostArgs;
import com.pulumi.std.inputs.JoinArgs;
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
        var myblock = new ReservedIpBlock("myblock", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("ny")
            .quantity(2)
            .build());

        var firstAddressAssignment = new IpAttachment("firstAddressAssignment", IpAttachmentArgs.builder()
            .deviceId(mydevice.id())
            .cidrNotation(StdFunctions.join(JoinArgs.builder()
                .separator("/")
                .input(                
                    StdFunctions.cidrhost(CidrhostArgs.builder()
                        .input(myblockMetalReservedIpBlock.cidrNotation())
                        .host(0)
                        .build()).applyValue(_invoke -> _invoke.result()),
                    "32")
                .build()).applyValue(_invoke -> _invoke.result()))
            .build());

    }
}
