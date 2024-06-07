## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const aclTemplate = new equinix.networkedge.AclTemplate("aclTemplate", {
    name: "test",
    description: "Test ACL template",
    inboundRules: [
        {
            subnet: "1.1.1.1/32",
            protocol: "IP",
            srcPort: "any",
            dstPort: "any",
            description: "inbound rule description",
        },
        {
            subnet: "2.2.2.2/28",
            protocol: "TCP",
            srcPort: "any",
            dstPort: "any",
            description: "inbound rule description",
        },
    ],
});
export const templateId = aclTemplate.id;
```
```python
import pulumi
import pulumi_equinix as equinix

acl_template = equinix.networkedge.AclTemplate("aclTemplate",
    name="test",
    description="Test ACL template",
    inbound_rules=[
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="1.1.1.1/32",
            protocol="IP",
            src_port="any",
            dst_port="any",
            description="inbound rule description",
        ),
        equinix.networkedge.AclTemplateInboundRuleArgs(
            subnet="2.2.2.2/28",
            protocol="TCP",
            src_port="any",
            dst_port="any",
            description="inbound rule description",
        ),
    ])
pulumi.export("templateId", acl_template.id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		aclTemplate, err := networkedge.NewAclTemplate(ctx, "aclTemplate", &networkedge.AclTemplateArgs{
			Name:        pulumi.String("test"),
			Description: pulumi.String("Test ACL template"),
			InboundRules: networkedge.AclTemplateInboundRuleArray{
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:      pulumi.String("1.1.1.1/32"),
					Protocol:    pulumi.String("IP"),
					SrcPort:     pulumi.String("any"),
					DstPort:     pulumi.String("any"),
					Description: pulumi.String("inbound rule description"),
				},
				&networkedge.AclTemplateInboundRuleArgs{
					Subnet:      pulumi.String("2.2.2.2/28"),
					Protocol:    pulumi.String("TCP"),
					SrcPort:     pulumi.String("any"),
					DstPort:     pulumi.String("any"),
					Description: pulumi.String("inbound rule description"),
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("templateId", aclTemplate.ID())
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
    var aclTemplate = new Equinix.NetworkEdge.AclTemplate("aclTemplate", new()
    {
        Name = "test",
        Description = "Test ACL template",
        InboundRules = new[]
        {
            new Equinix.NetworkEdge.Inputs.AclTemplateInboundRuleArgs
            {
                Subnet = "1.1.1.1/32",
                Protocol = "IP",
                SrcPort = "any",
                DstPort = "any",
                Description = "inbound rule description",
            },
            new Equinix.NetworkEdge.Inputs.AclTemplateInboundRuleArgs
            {
                Subnet = "2.2.2.2/28",
                Protocol = "TCP",
                SrcPort = "any",
                DstPort = "any",
                Description = "inbound rule description",
            },
        },
    });

    return new Dictionary<string, object?>
    {
        ["templateId"] = aclTemplate.Id,
    };
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
        var aclTemplate = new AclTemplate("aclTemplate", AclTemplateArgs.builder()        
            .name("test")
            .description("Test ACL template")
            .inboundRules(            
                AclTemplateInboundRuleArgs.builder()
                    .subnet("1.1.1.1/32")
                    .protocol("IP")
                    .srcPort("any")
                    .dstPort("any")
                    .description("inbound rule description")
                    .build(),
                AclTemplateInboundRuleArgs.builder()
                    .subnet("2.2.2.2/28")
                    .protocol("TCP")
                    .srcPort("any")
                    .dstPort("any")
                    .description("inbound rule description")
                    .build())
            .build());

        ctx.export("templateId", aclTemplate.id());
    }
}
```
```yaml
resources:
  aclTemplate:
    type: equinix:networkedge:AclTemplate
    properties:
      name: test
      description: Test ACL template
      inboundRules:
      - subnet: 1.1.1.1/32
        protocol: IP
        srcPort: any
        dstPort: any
        description: inbound rule description
      - subnet: 2.2.2.2/28
        protocol: TCP
        srcPort: any
        dstPort: any
        description: inbound rule description
outputs:
  templateId: ${aclTemplate.id}
```
{{% /example %}}
