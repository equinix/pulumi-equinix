package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.SpotMarketRequest;
import com.equinix.pulumi.metal.SpotMarketRequestArgs;
import com.equinix.pulumi.metal.inputs.SpotMarketRequestInstanceParametersArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var metro = config.get("metro").orElse("FR");
        var request = new SpotMarketRequest("request", SpotMarketRequestArgs.builder()        
            .projectId(projectId)
            .metro(metro)
            .maxBidPrice(0.75)
            .devicesMin(1)
            .devicesMax(1)
            .instanceParameters(SpotMarketRequestInstanceParametersArgs.builder()
                .hostname("testspot")
                .billingCycle("hourly")
                .operatingSystem("ubuntu_20_04")
                .plan("c3.small.x86")
                .build())
            .build());

        ctx.export("requestId", request.id());
    }
}
