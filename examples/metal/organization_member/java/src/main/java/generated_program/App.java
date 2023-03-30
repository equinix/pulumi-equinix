package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.OrganizationMember;
import com.equinix.pulumi.metal.OrganizationMemberArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var organizationId = config.get("organizationId").get();
        final var projectId = config.get("projectId").get();
        final var userEmailAddress = config.get("userEmailAddress").get();
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
