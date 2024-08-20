## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const myacl = new equinix.networkedge.AclTemplate("myacl", {
    name: "test",
    description: "Test ACL template",
    projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
    inboundRules: [
        {
            subnet: "1.1.1.1/32",
            protocol: equinix.networkedge.AclRuleProtocolType.IP,
            srcPort: "any",
            dstPort: "any",
            description: "inbound rule description",
        },
        {
            subnet: "172.16.25.0/24",
            protocol: equinix.networkedge.AclRuleProtocolType.UDP,
            srcPort: "any",
            dstPort: "53,1045,2041",
        },
    ],
});
```
```python
import pulumi
import pulumi_equinix as equinix

myacl = equinix.networkedge.AclTemplate("myacl",
    name="test",
    description="Test ACL template",
    project_id="a86d7112-d740-4758-9c9c-31e66373746b",
    inbound_rules=[
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="1.1.1.1/32",
            protocol=equinix.networkedge.AclRuleProtocolType.IP,
            src_port="any",
            dst_port="any",
            description="inbound rule description",
        ),
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="172.16.25.0/24",
            protocol=equinix.networkedge.AclRuleProtocolType.UDP,
            src_port="any",
            dst_port="53,1045,2041",
        ),
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
		_, err := networkedge.NewAclTemplate(ctx, "myacl", &networkedge.AclTemplateArgs{
			Name:        pulumi.String("test"),
			Description: pulumi.String("Test ACL template"),
			ProjectId:   pulumi.String("a86d7112-d740-4758-9c9c-31e66373746b"),
			InboundRules: networkedge.AclTemplateInboundRuleArray{
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:      pulumi.String("1.1.1.1/32"),
					Protocol:    pulumi.String(networkedge.AclRuleProtocolTypeIP),
					SrcPort:     pulumi.String("any"),
					DstPort:     pulumi.String("any"),
					Description: pulumi.String("inbound rule description"),
				},
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:   pulumi.String("172.16.25.0/24"),
					Protocol: pulumi.String(networkedge.AclRuleProtocolTypeUDP),
					SrcPort:  pulumi.String("any"),
					DstPort:  pulumi.String("53,1045,2041"),
				},
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
    var myacl = new Equinix.NetworkEdge.AclTemplate("myacl", new()
    {
        Name = "test",
        Description = "Test ACL template",
        ProjectId = "a86d7112-d740-4758-9c9c-31e66373746b",
        InboundRules = new[]
        {
            new Equinix.NetworkEdge.Inputs.AclTemplateInboundRuleArgs
            {
                Subnet = "1.1.1.1/32",
                Protocol = Equinix.NetworkEdge.AclRuleProtocolType.IP,
                SrcPort = "any",
                DstPort = "any",
                Description = "inbound rule description",
            },
            new Equinix.NetworkEdge.Inputs.AclTemplateInboundRuleArgs
            {
                Subnet = "172.16.25.0/24",
                Protocol = Equinix.NetworkEdge.AclRuleProtocolType.UDP,
                SrcPort = "any",
                DstPort = "53,1045,2041",
            },
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.AclTemplate;
import com.pulumi.equinix.networkedge.AclTemplateArgs;
import com.pulumi.equinix.networkedge.inputs.AclTemplateInboundRuleArgs;
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
        var myacl = new AclTemplate("myacl", AclTemplateArgs.builder()
            .name("test")
            .description("Test ACL template")
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .inboundRules(            
                AclTemplateInboundRuleArgs.builder()
                    .subnet("1.1.1.1/32")
                    .protocol("IP")
                    .srcPort("any")
                    .dstPort("any")
                    .description("inbound rule description")
                    .build(),
                AclTemplateInboundRuleArgs.builder()
                    .subnet("172.16.25.0/24")
                    .protocol("UDP")
                    .srcPort("any")
                    .dstPort("53,1045,2041")
                    .build())
            .build());

    }
}
```
```yaml
resources:
  # Creates ACL template and assigns it to the network device
  myacl:
    type: equinix:networkedge:AclTemplate
    properties:
      name: test
      description: Test ACL template
      projectId: a86d7112-d740-4758-9c9c-31e66373746b
      inboundRules:
        - subnet: 1.1.1.1/32
          protocol: IP
          srcPort: any
          dstPort: any
          description: inbound rule description
        - subnet: 172.16.25.0/24
          protocol: UDP
          srcPort: any
          dstPort: 53,1045,2041
```
{{% /example %}}
