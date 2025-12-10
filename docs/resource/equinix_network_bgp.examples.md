## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.networkedge.Bgp("test", {
    connectionId: "54014acf-9730-4b55-a791-459283d05fb1",
    localIpAddress: "10.1.1.1/30",
    localAsn: 12345,
    remoteIpAddress: "10.1.1.2",
    remoteAsn: 66123,
    authenticationKey: "secret",
});
```
```python
import pulumi
import pulumi_equinix as equinix

test = equinix.networkedge.Bgp("test",
    connection_id="54014acf-9730-4b55-a791-459283d05fb1",
    local_ip_address="10.1.1.1/30",
    local_asn=12345,
    remote_ip_address="10.1.1.2",
    remote_asn=66123,
    authentication_key="secret")
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewBgp(ctx, "test", &networkedge.BgpArgs{
			ConnectionId:      pulumi.String("54014acf-9730-4b55-a791-459283d05fb1"),
			LocalIpAddress:    pulumi.String("10.1.1.1/30"),
			LocalAsn:          pulumi.Int(12345),
			RemoteIpAddress:   pulumi.String("10.1.1.2"),
			RemoteAsn:         pulumi.Int(66123),
			AuthenticationKey: pulumi.String("secret"),
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
    var test = new Equinix.NetworkEdge.Bgp("test", new()
    {
        ConnectionId = "54014acf-9730-4b55-a791-459283d05fb1",
        LocalIpAddress = "10.1.1.1/30",
        LocalAsn = 12345,
        RemoteIpAddress = "10.1.1.2",
        RemoteAsn = 66123,
        AuthenticationKey = "secret",
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.networkedge.Bgp;
import com.equinix.pulumi.equinix.networkedge.BgpArgs;
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
        var test = new Bgp("test", BgpArgs.builder()
            .connectionId("54014acf-9730-4b55-a791-459283d05fb1")
            .localIpAddress("10.1.1.1/30")
            .localAsn(12345)
            .remoteIpAddress("10.1.1.2")
            .remoteAsn(66123)
            .authenticationKey("secret")
            .build());

    }
}
```
```yaml
resources:
  # Create BGP peering configuration on a existing connection
  # between network device and service provider
  test:
    type: equinix:networkedge:Bgp
    properties:
      connectionId: 54014acf-9730-4b55-a791-459283d05fb1
      localIpAddress: 10.1.1.1/30
      localAsn: 12345
      remoteIpAddress: 10.1.1.2
      remoteAsn: 66123
      authenticationKey: secret
```
{{% /example %}}
