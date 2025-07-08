package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.StreamAlertRule;
import com.pulumi.equinix.fabric.StreamAlertRuleArgs;
import com.pulumi.equinix.fabric.inputs.StreamAlertRuleResourceSelectorArgs;
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
        var newStreamAlertRule = new StreamAlertRule("newStreamAlertRule", StreamAlertRuleArgs.builder()
            .streamId("<stream_id>")
            .name("<name>")
            .type("METRIC_ALERT")
            .description("<description>")
            .enabled(true)
            .operand("ABOVE")
            .windowSize("<window_size>")
            .warningThreshold("<warning_threshold>")
            .criticalThreshold("<critical_threshold>")
            .metricName("equinix.fabric.connection.bandwidth_tx.usage")
            .resourceSelector(StreamAlertRuleResourceSelectorArgs.builder()
                .includes("*/connections/<connection_id>")
                .build())
            .build());

        ctx.export("streamAlertRuleType", newStreamAlertRule.type());
        ctx.export("streamAlertRuleId", newStreamAlertRule.uuid());
        ctx.export("streamAlertRuleStreamId", newStreamAlertRule.streamId());
        ctx.export("streamAlertRuleState", newStreamAlertRule.state());
    }
}
