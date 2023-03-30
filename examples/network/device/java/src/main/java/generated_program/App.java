package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.networkedge.Device;
import com.equinix.pulumi.networkedge.DeviceArgs;
import com.equinix.pulumi.networkedge.inputs.DeviceSshKeyArgs;
import com.equinix.pulumi.networkedge.inputs.GetAccountArgs;
import com.equinix.pulumi.networkedge.NetworkedgeFunctions;
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
        final var accountName = config.get("accountName").get();
        final var licenseToken = config.get("licenseToken").get();
        final var sshUserName = config.get("sshUserName").get();
        final var sshKeyName = config.get("sshKeyName").get();
        final var aclTemplateId = config.get("aclTemplateId").get();
        final var metro = config.get("metro").orElse("SV");
        final var devicePackageCode = config.get("devicePackageCode").orElse("network-essentials");
        final var deviceVersion = config.get("deviceVersion").orElse("17.06.01a");
        final var sizeInCores = Integer.parseInt(config.get("sizeInCores").orElse("2"));
        final var termLength = Integer.parseInt(config.get("termLength").orElse("6"));
        final var additionalBandwidth = Integer.parseInt(config.get("additionalBandwidth").orElse("5"));
        final var accountNum = NetworkedgeFunctions.getAccount(GetAccountArgs.builder()
            .name(accountName)
            .metroCode(metro)
            .build()).applyValue(account -> account.number());

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
            .version(deviceVersion)
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
