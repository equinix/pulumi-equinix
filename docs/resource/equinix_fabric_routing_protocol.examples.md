## Example Usage

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const direct = new equinix.fabric.RoutingProtocol("direct", {
    connectionUuid: "<some_id>",
    type: "DIRECT",
    name: "direct_rp",
    directIpv4: {
        equinixIfaceIp: "190.1.1.1/30",
    },
    directIpv6: {
        equinixIfaceIp: "190::1:1/126",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

direct = equinix.fabric.RoutingProtocol("direct",
    connection_uuid="<some_id>",
    type="DIRECT",
    name="direct_rp",
    direct_ipv4={
        "equinix_iface_ip": "190.1.1.1/30",
    },
    direct_ipv6={
        "equinix_iface_ip": "190::1:1/126",
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewRoutingProtocol(ctx, "direct", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String("<some_id>"),
			Type:           pulumi.String("DIRECT"),
			Name:           pulumi.String("direct_rp"),
			DirectIpv4: &fabric.RoutingProtocolDirectIpv4Args{
				EquinixIfaceIp: pulumi.String("190.1.1.1/30"),
			},
			DirectIpv6: &fabric.RoutingProtocolDirectIpv6Args{
				EquinixIfaceIp: pulumi.String("190::1:1/126"),
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
    var direct = new Equinix.Fabric.RoutingProtocol("direct", new()
    {
        ConnectionUuid = "<some_id>",
        Type = "DIRECT",
        Name = "direct_rp",
        DirectIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv4Args
        {
            EquinixIfaceIp = "190.1.1.1/30",
        },
        DirectIpv6 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv6Args
        {
            EquinixIfaceIp = "190::1:1/126",
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RoutingProtocol;
import com.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv4Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv6Args;
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
        var direct = new RoutingProtocol("direct", RoutingProtocolArgs.builder()
            .connectionUuid("<some_id>")
            .type("DIRECT")
            .name("direct_rp")
            .directIpv4(RoutingProtocolDirectIpv4Args.builder()
                .equinixIfaceIp("190.1.1.1/30")
                .build())
            .directIpv6(RoutingProtocolDirectIpv6Args.builder()
                .equinixIfaceIp("190::1:1/126")
                .build())
            .build());

    }
}
```
```yaml
resources:
  direct:
    type: equinix:fabric:RoutingProtocol
    properties:
      connectionUuid: <some_id>
      type: DIRECT
      name: direct_rp
      directIpv4:
        equinixIfaceIp: 190.1.1.1/30
      directIpv6:
        equinixIfaceIp: 190::1:1/126
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const bgp = new equinix.fabric.RoutingProtocol("bgp", {
    connectionUuid: "<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type: "BGP",
    name: "bgp_rp",
    bgpIpv4: {
        customerPeerIp: "190.1.1.2",
        enabled: true,
    },
    bgpIpv6: {
        customerPeerIp: "190::1:2",
        enabled: true,
    },
    customerAsn: 4532,
});
```
```python
import pulumi
import pulumi_equinix as equinix

bgp = equinix.fabric.RoutingProtocol("bgp",
    connection_uuid="<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type="BGP",
    name="bgp_rp",
    bgp_ipv4={
        "customer_peer_ip": "190.1.1.2",
        "enabled": True,
    },
    bgp_ipv6={
        "customer_peer_ip": "190::1:2",
        "enabled": True,
    },
    customer_asn=4532)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewRoutingProtocol(ctx, "bgp", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String("<same_connection_id_as_first_equinix_fabric_routing_protocol>"),
			Type:           pulumi.String("BGP"),
			Name:           pulumi.String("bgp_rp"),
			BgpIpv4: &fabric.RoutingProtocolBgpIpv4Args{
				CustomerPeerIp: pulumi.String("190.1.1.2"),
				Enabled:        pulumi.Bool(true),
			},
			BgpIpv6: &fabric.RoutingProtocolBgpIpv6Args{
				CustomerPeerIp: pulumi.String("190::1:2"),
				Enabled:        pulumi.Bool(true),
			},
			CustomerAsn: pulumi.Int(4532),
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
    var bgp = new Equinix.Fabric.RoutingProtocol("bgp", new()
    {
        ConnectionUuid = "<same_connection_id_as_first_equinix_fabric_routing_protocol>",
        Type = "BGP",
        Name = "bgp_rp",
        BgpIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolBgpIpv4Args
        {
            CustomerPeerIp = "190.1.1.2",
            Enabled = true,
        },
        BgpIpv6 = new Equinix.Fabric.Inputs.RoutingProtocolBgpIpv6Args
        {
            CustomerPeerIp = "190::1:2",
            Enabled = true,
        },
        CustomerAsn = 4532,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RoutingProtocol;
import com.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolBgpIpv4Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolBgpIpv6Args;
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
        var bgp = new RoutingProtocol("bgp", RoutingProtocolArgs.builder()
            .connectionUuid("<same_connection_id_as_first_equinix_fabric_routing_protocol>")
            .type("BGP")
            .name("bgp_rp")
            .bgpIpv4(RoutingProtocolBgpIpv4Args.builder()
                .customerPeerIp("190.1.1.2")
                .enabled(true)
                .build())
            .bgpIpv6(RoutingProtocolBgpIpv6Args.builder()
                .customerPeerIp("190::1:2")
                .enabled(true)
                .build())
            .customerAsn(4532)
            .build());

    }
}
```
```yaml
resources:
  bgp:
    type: equinix:fabric:RoutingProtocol
    properties:
      connectionUuid: <same_connection_id_as_first_equinix_fabric_routing_protocol>
      type: BGP
      name: bgp_rp
      bgpIpv4:
        customerPeerIp: 190.1.1.2
        enabled: true
      bgpIpv6:
        customerPeerIp: 190::1:2
        enabled: true
      customerAsn: 4532
```
{{% /example %}}

{{% example %}}
### example 3
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const direct = new equinix.fabric.RoutingProtocol("direct", {
    connectionUuid: "<some_id>",
    type: "DIRECT",
    name: "direct_rp",
    directIpv4: {
        equinixIfaceIp: "190.1.1.1/30",
    },
    directIpv6: {
        equinixIfaceIp: "190::1:1/126",
    },
});
const bgp = new equinix.fabric.RoutingProtocol("bgp", {
    connectionUuid: "<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type: "BGP",
    name: "bgp_rp",
    bgpIpv4: {
        customerPeerIp: "190.1.1.2",
        enabled: true,
    },
    bgpIpv6: {
        customerPeerIp: "190::1:2",
        enabled: true,
    },
    customerAsn: 4532,
}, {
    dependsOn: [direct],
});
```
```python
import pulumi
import pulumi_equinix as equinix

direct = equinix.fabric.RoutingProtocol("direct",
    connection_uuid="<some_id>",
    type="DIRECT",
    name="direct_rp",
    direct_ipv4={
        "equinix_iface_ip": "190.1.1.1/30",
    },
    direct_ipv6={
        "equinix_iface_ip": "190::1:1/126",
    })
bgp = equinix.fabric.RoutingProtocol("bgp",
    connection_uuid="<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type="BGP",
    name="bgp_rp",
    bgp_ipv4={
        "customer_peer_ip": "190.1.1.2",
        "enabled": True,
    },
    bgp_ipv6={
        "customer_peer_ip": "190::1:2",
        "enabled": True,
    },
    customer_asn=4532,
    opts = pulumi.ResourceOptions(depends_on=[direct]))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		direct, err := fabric.NewRoutingProtocol(ctx, "direct", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String("<some_id>"),
			Type:           pulumi.String("DIRECT"),
			Name:           pulumi.String("direct_rp"),
			DirectIpv4: &fabric.RoutingProtocolDirectIpv4Args{
				EquinixIfaceIp: pulumi.String("190.1.1.1/30"),
			},
			DirectIpv6: &fabric.RoutingProtocolDirectIpv6Args{
				EquinixIfaceIp: pulumi.String("190::1:1/126"),
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewRoutingProtocol(ctx, "bgp", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String("<same_connection_id_as_first_equinix_fabric_routing_protocol>"),
			Type:           pulumi.String("BGP"),
			Name:           pulumi.String("bgp_rp"),
			BgpIpv4: &fabric.RoutingProtocolBgpIpv4Args{
				CustomerPeerIp: pulumi.String("190.1.1.2"),
				Enabled:        pulumi.Bool(true),
			},
			BgpIpv6: &fabric.RoutingProtocolBgpIpv6Args{
				CustomerPeerIp: pulumi.String("190::1:2"),
				Enabled:        pulumi.Bool(true),
			},
			CustomerAsn: pulumi.Int(4532),
		}, pulumi.DependsOn([]pulumi.Resource{
			direct,
		}))
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
    var direct = new Equinix.Fabric.RoutingProtocol("direct", new()
    {
        ConnectionUuid = "<some_id>",
        Type = "DIRECT",
        Name = "direct_rp",
        DirectIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv4Args
        {
            EquinixIfaceIp = "190.1.1.1/30",
        },
        DirectIpv6 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv6Args
        {
            EquinixIfaceIp = "190::1:1/126",
        },
    });

    var bgp = new Equinix.Fabric.RoutingProtocol("bgp", new()
    {
        ConnectionUuid = "<same_connection_id_as_first_equinix_fabric_routing_protocol>",
        Type = "BGP",
        Name = "bgp_rp",
        BgpIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolBgpIpv4Args
        {
            CustomerPeerIp = "190.1.1.2",
            Enabled = true,
        },
        BgpIpv6 = new Equinix.Fabric.Inputs.RoutingProtocolBgpIpv6Args
        {
            CustomerPeerIp = "190::1:2",
            Enabled = true,
        },
        CustomerAsn = 4532,
    }, new CustomResourceOptions
    {
        DependsOn =
        {
            direct,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RoutingProtocol;
import com.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv4Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv6Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolBgpIpv4Args;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolBgpIpv6Args;
import com.pulumi.resources.CustomResourceOptions;
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
        var direct = new RoutingProtocol("direct", RoutingProtocolArgs.builder()
            .connectionUuid("<some_id>")
            .type("DIRECT")
            .name("direct_rp")
            .directIpv4(RoutingProtocolDirectIpv4Args.builder()
                .equinixIfaceIp("190.1.1.1/30")
                .build())
            .directIpv6(RoutingProtocolDirectIpv6Args.builder()
                .equinixIfaceIp("190::1:1/126")
                .build())
            .build());

        var bgp = new RoutingProtocol("bgp", RoutingProtocolArgs.builder()
            .connectionUuid("<same_connection_id_as_first_equinix_fabric_routing_protocol>")
            .type("BGP")
            .name("bgp_rp")
            .bgpIpv4(RoutingProtocolBgpIpv4Args.builder()
                .customerPeerIp("190.1.1.2")
                .enabled(true)
                .build())
            .bgpIpv6(RoutingProtocolBgpIpv6Args.builder()
                .customerPeerIp("190::1:2")
                .enabled(true)
                .build())
            .customerAsn(4532)
            .build(), CustomResourceOptions.builder()
                .dependsOn(direct)
                .build());

    }
}
```
```yaml
resources:
  direct:
    type: equinix:fabric:RoutingProtocol
    properties:
      connectionUuid: <some_id>
      type: DIRECT
      name: direct_rp
      directIpv4:
        equinixIfaceIp: 190.1.1.1/30
      directIpv6:
        equinixIfaceIp: 190::1:1/126
  bgp:
    type: equinix:fabric:RoutingProtocol
    properties:
      connectionUuid: <same_connection_id_as_first_equinix_fabric_routing_protocol>
      type: BGP
      name: bgp_rp
      bgpIpv4:
        customerPeerIp: 190.1.1.2
        enabled: true
      bgpIpv6:
        customerPeerIp: 190::1:2
        enabled: true
      customerAsn: 4532
    options:
      dependsOn:
        - ${direct}
```
{{% /example %}}


