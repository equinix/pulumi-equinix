## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const john = new equinix.networkedge.SshUser("john", {
    username: "john",
    password: "secret",
    deviceIds: [
        "csr1000v-ha-uuid",
        "csr1000v-ha-redundant-uuid",
    ],
});
```
```python
import pulumi
import pulumi_equinix as equinix

john = equinix.networkedge.SshUser("john",
    username="john",
    password="secret",
    device_ids=[
        "csr1000v-ha-uuid",
        "csr1000v-ha-redundant-uuid",
    ])
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewSshUser(ctx, "john", &networkedge.SshUserArgs{
			Username: pulumi.String("john"),
			Password: pulumi.String("secret"),
			DeviceIds: pulumi.StringArray{
				pulumi.String("csr1000v-ha-uuid"),
				pulumi.String("csr1000v-ha-redundant-uuid"),
			},
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
    var john = new Equinix.NetworkEdge.SshUser("john", new()
    {
        Username = "john",
        Password = "secret",
        DeviceIds = new[]
        {
            "csr1000v-ha-uuid",
            "csr1000v-ha-redundant-uuid",
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.SshUser;
import com.pulumi.equinix.networkedge.SshUserArgs;
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
        var john = new SshUser("john", SshUserArgs.builder()
            .username("john")
            .password("secret")
            .deviceIds(            
                "csr1000v-ha-uuid",
                "csr1000v-ha-redundant-uuid")
            .build());

    }
}
```
```yaml
  # Create SSH user with password auth method and associate it with
  # two virtual network devices
  john:
    type: equinix:networkedge:SshUser
    properties:
      username: john
      password: secret
      deviceIds:
        - csr1000v-ha-uuid
        - csr1000v-ha-redundant-uuid
```
{{% /example %}}
