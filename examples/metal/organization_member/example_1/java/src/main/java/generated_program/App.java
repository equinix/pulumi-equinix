package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.OrganizationMember;
import com.equinix.pulumi.equinix.metal.OrganizationMemberArgs;
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
        var member = new OrganizationMember("member", OrganizationMemberArgs.builder()
            .invitee("member@example.com")
            .roles("limited_collaborator")
            .projectsIds(projectId)
            .organizationId(organizationId)
            .build());

    }
}
