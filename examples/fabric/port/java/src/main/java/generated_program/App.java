package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.fabric.Port;
import com.equinix.pulumi.equinix.fabric.PortArgs;
import com.pulumi.equinix.fabric.inputs.PortLocationArgs;
import com.pulumi.equinix.fabric.inputs.PortSettingsArgs;
import com.pulumi.equinix.fabric.inputs.PortEncapsulationArgs;
import com.pulumi.equinix.fabric.inputs.PortAccountArgs;
import com.pulumi.equinix.fabric.inputs.PortProjectArgs;
import com.pulumi.equinix.fabric.inputs.PortRedundancyArgs;
import com.pulumi.equinix.fabric.inputs.PortPhysicalPortArgs;
import com.pulumi.equinix.fabric.inputs.PortPhysicalPortDemarcationPointArgs;
import com.pulumi.equinix.fabric.inputs.PortNotificationArgs;
import com.pulumi.equinix.fabric.inputs.PortAdditionalInfoArgs;
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
        var order = new Port("order", PortArgs.builder()
            .type("XF_PORT")
            .connectivitySourceType("COLO")
            .location(PortLocationArgs.builder()
                .metroCode("TR")
                .build())
            .settings(PortSettingsArgs.builder()
                .packageType("STANDARD")
                .sharedPortType(false)
                .build())
            .encapsulation(PortEncapsulationArgs.builder()
                .type("DOT1Q")
                .tagProtocolId("33024")
                .build())
            .account(PortAccountArgs.builder()
                .accountNumber("<account_number>")
                .build())
            .project(PortProjectArgs.builder()
                .projectId("<project_id>")
                .build())
            .redundancy(PortRedundancyArgs.builder()
                .priority("PRIMARY")
                .build())
            .lagEnabled(true)
            .physicalPorts(PortPhysicalPortArgs.builder()
                .type("XF_PHYSICAL_PORT")
                .demarcationPoint(PortPhysicalPortDemarcationPointArgs.builder()
                    .ibx("TR2")
                    .cageUniqueSpaceId("TR2:01:002087")
                    .cabinetUniqueSpaceId("Demarc")
                    .patchPanel("PP:Demarc:00002087")
                    .connectorType("SC")
                    .build())
                .build())
            .physicalPortsSpeed(1000)
            .physicalPortsType("1000BASE_LX")
            .physicalPortsCount(1)
            .demarcationPointIbx("TR2")
            .notifications(            
                PortNotificationArgs.builder()
                    .type("TECHNICAL")
                    .registeredUsers("<username>")
                    .build(),
                PortNotificationArgs.builder()
                    .type("NOTIFICATION")
                    .registeredUsers("<username>")
                    .build())
            .additionalInfos(PortAdditionalInfoArgs.builder()
                .key("lagType")
                .value("New")
                .build())
            .build());

    }
}
