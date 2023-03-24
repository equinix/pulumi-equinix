package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.Device;
import com.pulumi.equinix.networkedge.DeviceArgs;
import com.pulumi.equinix.networkedge.inputs.DeviceSshKeyArgs;
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
        final var accountName = config.get("accountName");
        final var licenseToken = config.get("licenseToken");
        final var sshUserName = config.get("sshUserName");
        final var sshKeyName = config.get("sshKeyName");
        final var aclTemplateId = config.get("aclTemplateId");
        final var metro = config.get("metro").orElse("SV");
        final var devicePackageCode = config.get("devicePackageCode").orElse("network-essentials");
        final var deviceVersion = config.get("deviceVersion").orElse("17.06.01a");
        final var sizeInCores = config.get("sizeInCores").orElse(2);
        final var termLength = config.get("termLength").orElse(6);
        final var additionalBandwidth = config.get("additionalBandwidth").orElse(5);
        final var accountNum = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name(accountName)
            .metroCode(metro)
            .build()).number();

        var c8KRouter = new Device("c8KRouter", DeviceArgs.builder()        
            .name("catalystRouter")
            .metroCode(metro)
            .typeCode("C8000V")
            .selfManaged(true)
            .byol(true)
            .packageCode(devicePackageCode)
            .notifications("example@equinix.com")
            .hostname("C8KV")
            .accountNumber(accountNum)
            .version(version)
            .coreCount(sizeInCores)
            .termLength(termLength)
            .licenseToken(licenseToken)
            .additionalBandwidth(additionalBandwidth)
            .sshKey(DeviceSshKeyArgs.builder()
                .username(sshUserName)
                .keyName(sshKeyName)
                .build())
            .aclTemplateId(aclTemplateId)
            .build());

        ctx.export("routerId", c8KRouter.id());
        ctx.export("provisionStatus", c8KRouter.status());
        ctx.export("licenseStatus", c8KRouter.licenseStatus());
        ctx.export("sshIpAddress", c8KRouter.sshIpAddress());
    }
}
