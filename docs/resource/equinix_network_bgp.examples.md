## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const bgp = new equinix.networkedge.Bgp("bgp", {
    connectionId: "54014acf-9730-4b55-a791-459283d05fb1",
    localIpAddress: "10.1.1.1/30",
    localAsn: 12345,
    remoteIpAddress: "10.1.1.2",
    remoteAsn: 66123,
    authenticationKey: "secret",
});
export const state = bgp.state;
export const provisioningStatus = bgp.provisioningStatus;
```
```python
import pulumi
import pulumi_equinix as equinix

bgp = equinix.networkedge.Bgp("bgp",
    connection_id="54014acf-9730-4b55-a791-459283d05fb1",
    local_ip_address="10.1.1.1/30",
    local_asn=12345,
    remote_ip_address="10.1.1.2",
    remote_asn=66123,
    authentication_key="secret")
pulumi.export("state", bgp.state)
pulumi.export("provisioningStatus", bgp.provisioning_status)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		bgp, err := networkedge.NewBgp(ctx, "bgp", &networkedge.BgpArgs{
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
		ctx.Export("state", bgp.State)
		ctx.Export("provisioningStatus", bgp.ProvisioningStatus)
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var bgp = new Equinix.NetworkEdge.Bgp("bgp", new()
    {
        ConnectionId = "54014acf-9730-4b55-a791-459283d05fb1",
        LocalIpAddress = "10.1.1.1/30",
        LocalAsn = 12345,
        RemoteIpAddress = "10.1.1.2",
        RemoteAsn = 66123,
        AuthenticationKey = "secret",
    });

    return new Dictionary<string, object?>
    {
        ["state"] = bgp.State,
        ["provisioningStatus"] = bgp.ProvisioningStatus,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.networkedge.Bgp;
import com.equinix.pulumi.networkedge.BgpArgs;
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
        var bgp = new Bgp("bgp", BgpArgs.builder()        
            .connectionId("54014acf-9730-4b55-a791-459283d05fb1")
            .localIpAddress("10.1.1.1/30")
            .localAsn(12345)
            .remoteIpAddress("10.1.1.2")
            .remoteAsn(66123)
            .authenticationKey("secret")
            .build());

        ctx.export("state", bgp.state());
        ctx.export("provisioningStatus", bgp.provisioningStatus());
    }
}
```
```yaml
resources:
  bgp:
    type: equinix:networkedge:Bgp
    properties:
      connectionId: 54014acf-9730-4b55-a791-459283d05fb1
      localIpAddress: 10.1.1.1/30
      localAsn: 12345
      remoteIpAddress: 10.1.1.2
      remoteAsn: 66123
      authenticationKey: secret
outputs:
  state: ${bgp.state}
  provisioningStatus: ${bgp.provisioningStatus}
```
{{% /example %}}
