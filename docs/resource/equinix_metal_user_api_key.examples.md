## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.UserApiKey("test", {
    description: "Read-only user key",
    readOnly: true,
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.metal.UserApiKey("test",
    description="Read-only user key",
    read_only=True)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewUserApiKey(ctx, "test", &metal.UserApiKeyArgs{
			Description: pulumi.String("Read-only user key"),
			ReadOnly:    pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var test = new Equinix.Metal.UserApiKey("test", new()
    {
        Description = "Read-only user key",
        ReadOnly = true,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.UserApiKey;
import com.equinix.pulumi.equinix.metal.UserApiKeyArgs;
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
        var test = new UserApiKey("test", UserApiKeyArgs.builder()
            .description("Read-only user key")
            .readOnly(true)
            .build());

    }
}
```
```yaml
resources:
  # Create a new read-only user API key
  test:
    type: equinix:metal:UserApiKey
    properties:
      description: Read-only user key
      readOnly: true
```
{{% /example %}}
