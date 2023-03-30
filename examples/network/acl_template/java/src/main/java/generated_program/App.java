package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.networkedge.AclTemplate;
import com.equinix.pulumi.networkedge.AclTemplateArgs;
import com.equinix.pulumi.networkedge.inputs.AclTemplateInboundRuleArgs;
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
        var aclTemplate = new AclTemplate("aclTemplate", AclTemplateArgs.builder()        
            .name("test")
            .description("Test ACL template")
            .inboundRules(            
                AclTemplateInboundRuleArgs.builder()
                    .subnet("1.1.1.1/32")
                    .protocol("IP")
                    .srcPort("any")
                    .dstPort("any")
                    .description("inbound rule description")
                    .build(),
                AclTemplateInboundRuleArgs.builder()
                    .subnet("2.2.2.2/28")
                    .protocol("TCP")
                    .srcPort("any")
                    .dstPort("any")
                    .description("inbound rule description")
                    .build())
            .build());

        ctx.export("templateId", aclTemplate.id());
    }
}
