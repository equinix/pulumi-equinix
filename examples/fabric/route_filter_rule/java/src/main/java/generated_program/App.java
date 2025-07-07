package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
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
        ctx.export("routeFilterRuleId", rfRule.id());
        ctx.export("routeFilterId", rfRule.routeFilterId());
        ctx.export("routeFilterRulePrefix", rfRule.prefix());
        ctx.export("routeFilterRulePrefixMatch", rfRule.prefixMatch());
    }
}
