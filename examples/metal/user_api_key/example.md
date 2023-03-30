{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const description = config.get("description") || "An user level API Key";
const readOnly = config.getBoolean("readOnly") || false;
const apiKey = new equinix.metal.UserApiKey("apiKey", {
    description: description,
    readOnly: readOnly,
});
export const apiKeyToken = apiKey.token;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
description = config.get("description")
if description is None:
    description = "An user level API Key"
read_only = config.get_bool("readOnly")
if read_only is None:
    read_only = False
api_key = equinix.metal.UserApiKey("apiKey",
    description=description,
    read_only=read_only)
pulumi.export("apiKeyToken", api_key.token)
```

{{% /choosable %}}

{{% choosable language go %}}

```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		description := "An user level API Key"
		if param := cfg.Get("description"); param != "" {
			description = param
		}
		readOnly := false
		if param := cfg.GetBool("readOnly"); param {
			readOnly = param
		}
		apiKey, err := metal.NewUserApiKey(ctx, "apiKey", &metal.UserApiKeyArgs{
			Description: pulumi.String(description),
			ReadOnly:    pulumi.Bool(readOnly),
		})
		if err != nil {
			return err
		}
		ctx.Export("apiKeyToken", apiKey.Token)
		return nil
	})
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var description = config.Get("description") ?? "An user level API Key";
    var readOnly = config.GetBoolean("readOnly") ?? false;
    var apiKey = new Equinix.Metal.UserApiKey("apiKey", new()
    {
        Description = description,
        ReadOnly = readOnly,
    });

    return new Dictionary<string, object?>
    {
        ["apiKeyToken"] = apiKey.Token,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.UserApiKey;
import com.equinix.pulumi.metal.UserApiKeyArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var description = config.get("description").orElse("An user level API Key");
        final var readOnly = config.getBoolean("readOnly").orElse(false);
        var apiKey = new UserApiKey("apiKey", UserApiKeyArgs.builder()        
            .description(description)
            .readOnly(readOnly)
            .build());

        ctx.export("apiKeyToken", apiKey.token());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  description:
    type: string
    default: An user level API Key
  readOnly:
    type: boolean
    default: false
resources:
  apiKey:
    type: equinix:metal:UserApiKey
    properties:
      description: ${description}
      readOnly: ${readOnly}
outputs:
  apiKeyToken: ${apiKey.token}
```

{{% /choosable %}}
