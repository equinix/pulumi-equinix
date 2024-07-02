package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Organization;
import com.pulumi.equinix.metal.OrganizationArgs;
import com.pulumi.equinix.metal.inputs.OrganizationAddressArgs;
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
        var orgResource = new Organization("orgResource", OrganizationArgs.builder()
            .name("Foo Organization")
            .address(OrganizationAddressArgs.builder()
                .address("org street")
                .city("london")
                .country("GB")
                .zipCode("12345")
                .build())
            .description("An organization")
            .build());

        ctx.export("org", orgResource.id());
    }
}
