{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as fs from "fs";

const sshKey = new equinix.metal.SshKey("sshKey", {
    name: "johnKent",
    publicKey: fs.readFileSync("/Users/John/.ssh/metal_rsa.pub"),
});
export const sshKeyId = sshKey.id;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

ssh_key = equinix.metal.SshKey("sshKey",
    name="johnKent",
    public_key=(lambda path: open(path).read())("/Users/John/.ssh/metal_rsa.pub"))
pulumi.export("sshKeyId", ssh_key.id)
```

{{% /choosable %}}

{{% choosable language go %}}

```go
package main

import (
	"os"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func readFileOrPanic(path string) pulumi.StringPtrInput {
	data, err := os.ReadFile(path)
	if err != nil {
		panic(err.Error())
	}
	return pulumi.String(string(data))
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sshKey, err := metal.NewSshKey(ctx, "sshKey", &metal.SshKeyArgs{
			Name:      pulumi.String("johnKent"),
			PublicKey: readFileOrPanic("/Users/John/.ssh/metal_rsa.pub"),
		})
		if err != nil {
			return err
		}
		ctx.Export("sshKeyId", sshKey.ID())
		return nil
	})
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using System.IO;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var sshKey = new Equinix.Metal.SshKey("sshKey", new()
    {
        Name = "johnKent",
        PublicKey = File.ReadAllText("/Users/John/.ssh/metal_rsa.pub"),
    });

    return new Dictionary<string, object?>
    {
        ["sshKeyId"] = sshKey.Id,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.SshKey;
import com.equinix.pulumi.metal.SshKeyArgs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        String content = null;
        try {
            content = Files.readString(Paths.get("/Users/John/.ssh/metal_rsa.pub"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        var sshKey = new SshKey("sshKey", SshKeyArgs.builder()        
            .name("johnKent")
            .publicKey(content)
            .build());

        ctx.export("sshKeyId", sshKey.id());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
resources:
  sshKey:
    type: equinix:metal:SshKey
    properties:
      name: johnKent
      publicKey:
        fn::readFile: /Users/John/.ssh/metal_rsa.pub
outputs:
  sshKeyId: ${sshKey.id}
```

{{% /choosable %}}
