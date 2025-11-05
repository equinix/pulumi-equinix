package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.networkedge.Bgp;
import com.equinix.pulumi.equinix.networkedge.BgpArgs;
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
        var test = new Bgp("test", BgpArgs.builder()
            .connectionId("54014acf-9730-4b55-a791-459283d05fb1")
            .localIpAddress("10.1.1.1/30")
            .localAsn(12345)
            .remoteIpAddress("10.1.1.2")
            .remoteAsn(66123)
            .authenticationKey("secret")
            .build());

    }
}
