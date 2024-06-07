package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.OrganizationMember;
import com.pulumi.equinix.metal.OrganizationMemberArgs;
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
        final var organizationId = config.get("organizationId");
        final var projectId = config.get("projectId");
        final var userEmailAddress = config.get("userEmailAddress");
        var member = new OrganizationMember("member", OrganizationMemberArgs.builder()        
            .invitee(userEmailAddress)
            .roles("limited_collaborator")
            .projectsIds(projectId)
            .organizationId(organizationId)
            .build());

        ctx.export("memberId", member.id());
        ctx.export("memberState", member.state());
    }
}
