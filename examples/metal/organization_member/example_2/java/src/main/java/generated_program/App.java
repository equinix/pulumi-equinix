package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.equinix.metal.OrganizationMember;
import com.equinix.equinix.metal.OrganizationMemberArgs;
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
        var owner = new OrganizationMember("owner", OrganizationMemberArgs.builder()
            .invitee("admin@example.com")
            .roles("owner")
            .projectsIds()
            .organizationId(organizationId)
            .build());

    }
}
