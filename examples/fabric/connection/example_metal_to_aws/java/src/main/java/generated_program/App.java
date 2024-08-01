package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.Connection;
import com.pulumi.equinix.fabric.ConnectionArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionASideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointProfileArgs;
import com.pulumi.equinix.fabric.inputs.ConnectionZSideAccessPointLocationArgs;
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
        var metal2Aws = new Connection("metal2Aws", ConnectionArgs.builder()
            .name("ConnectionName")
            .type("EVPLAN_VC")
            .notifications(ConnectionNotificationArgs.builder()
                .type("ALL")
                .emails(                
                    "example@equinix.com",
                    "test1@equinix.com")
                .build())
            .bandwidth(50)
            .order(ConnectionOrderArgs.builder()
                .purchaseOrderNumber("1-323292")
                .build())
            .aSide(ConnectionASideArgs.builder()
                .accessPoint(ConnectionASideAccessPointArgs.builder()
                    .type("METAL_NETWORK")
                    .authenticationKey("<metal_authorization_code>")
                    .build())
                .build())
            .zSide(ConnectionZSideArgs.builder()
                .accessPoint(ConnectionZSideAccessPointArgs.builder()
                    .type("SP")
                    .authenticationKey("<aws_account_id>")
                    .sellerRegion("us-west-1")
                    .profile(ConnectionZSideAccessPointProfileArgs.builder()
                        .type("L2_PROFILE")
                        .uuid("<service_profile_uuid>")
                        .build())
                    .location(ConnectionZSideAccessPointLocationArgs.builder()
                        .metroCode("SV")
                        .build())
                    .build())
                .build())
            .build());

    }
}
