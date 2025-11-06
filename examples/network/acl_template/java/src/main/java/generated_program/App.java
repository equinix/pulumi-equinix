package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.networkedge.AclTemplate;
import com.equinix.pulumi.equinix.networkedge.AclTemplateArgs;
import com.pulumi.equinix.networkedge.inputs.AclTemplateInboundRuleArgs;
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
        var myacl = new AclTemplate("myacl", AclTemplateArgs.builder()
            .name("test")
            .description("Test ACL template")
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .inboundRules(            
                AclTemplateInboundRuleArgs.builder()
                    .subnet("1.1.1.1/32")
                    .protocol("IP")
                    .srcPort("any")
                    .dstPort("any")
                    .description("inbound rule description")
                    .build(),
                AclTemplateInboundRuleArgs.builder()
                    .subnet("172.16.25.0/24")
                    .protocol("UDP")
                    .srcPort("any")
                    .dstPort("53,1045,2041")
                    .build())
            .build());

    }
}
