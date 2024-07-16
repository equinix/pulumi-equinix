package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.SpotMarketRequest;
import com.pulumi.equinix.metal.SpotMarketRequestArgs;
import com.pulumi.equinix.metal.inputs.SpotMarketRequestInstanceParametersArgs;
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
        var req = new SpotMarketRequest("req", SpotMarketRequestArgs.builder()
            .projectId(projectId)
            .maxBidPrice(0.03)
            .metro("ny")
            .devicesMin(1)
            .devicesMax(1)
            .instanceParameters(SpotMarketRequestInstanceParametersArgs.builder()
                .hostname("testspot")
                .billingCycle("hourly")
                .operatingSystem("ubuntu_20_04")
                .plan("c3.small.x86")
                .build())
            .build());

    }
}
