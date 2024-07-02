package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.Bgp;
import com.pulumi.equinix.networkedge.BgpArgs;
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
        var bgp = new Bgp("bgp", BgpArgs.builder()
            .connectionId("54014acf-9730-4b55-a791-459283d05fb1")
            .localIpAddress("10.1.1.1/30")
            .localAsn(12345)
            .remoteIpAddress("10.1.1.2")
            .remoteAsn(66123)
            .authenticationKey("secret")
            .build());

        ctx.export("state", bgp.state());
        ctx.export("provisioningStatus", bgp.provisioningStatus());
    }
}
