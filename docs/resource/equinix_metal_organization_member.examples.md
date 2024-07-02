## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const organizationId = config.require("organizationId");
const projectId = config.require("projectId");
const userEmailAddress = config.require("userEmailAddress");
const member = new equinix.metal.OrganizationMember("member", {
    invitee: userEmailAddress,
    roles: ["limited_collaborator"],
    projectsIds: [projectId],
    organizationId: organizationId,
});
export const memberId = member.id;
export const memberState = member.state;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
organization_id = config.require("organizationId")
project_id = config.require("projectId")
user_email_address = config.require("userEmailAddress")
member = equinix.metal.OrganizationMember("member",
    invitee=user_email_address,
    roles=["limited_collaborator"],
    projects_ids=[project_id],
    organization_id=organization_id)
pulumi.export("memberId", member.id)
pulumi.export("memberState", member.state)
```
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
		organizationId := cfg.Require("organizationId")
		projectId := cfg.Require("projectId")
		userEmailAddress := cfg.Require("userEmailAddress")
		member, err := metal.NewOrganizationMember(ctx, "member", &metal.OrganizationMemberArgs{
			Invitee: pulumi.String(userEmailAddress),
			Roles: pulumi.StringArray{
				pulumi.String("limited_collaborator"),
			},
			ProjectsIds: pulumi.StringArray{
				pulumi.String(projectId),
			},
			OrganizationId: pulumi.String(organizationId),
		})
		if err != nil {
			return err
		}
		ctx.Export("memberId", member.ID())
		ctx.Export("memberState", member.State)
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
    var config = new Config();
    var organizationId = config.Require("organizationId");
    var projectId = config.Require("projectId");
    var userEmailAddress = config.Require("userEmailAddress");
    var member = new Equinix.Metal.OrganizationMember("member", new()
    {
        Invitee = userEmailAddress,
        Roles = new[]
        {
            "limited_collaborator",
        },
        ProjectsIds = new[]
        {
            projectId,
        },
        OrganizationId = organizationId,
    });

    return new Dictionary<string, object?>
    {
        ["memberId"] = member.Id,
        ["memberState"] = member.State,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.OrganizationMember;
import com.pulumi.equinix.metal.OrganizationMemberArgs;
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
        final var config = ctx.config();
        final var organizationId = config.get("organizationId");
        final var projectId = config.get("projectId");
        final var userEmailAddress = config.get("userEmailAddress");
        var member = new OrganizationMember("member", OrganizationMemberArgs.builder()
            .invitee(userEmailAddress)
            .roles("limited_collaborator")
            .projectsIds(projectId)
            .organizationId(organizationId)
            .build());

        ctx.export("memberId", member.id());
        ctx.export("memberState", member.state());
    }
}
```
```yaml
config:
  organizationId:
    type: string
  projectId:
    type: string
  userEmailAddress:
    type: string
resources:
  member:
    type: equinix:metal:OrganizationMember
    properties:
      invitee: ${userEmailAddress}
      roles:
      - limited_collaborator
      projectsIds:
      - ${projectId}
      organizationId: ${organizationId}
outputs:
  memberId: ${member.id}
  memberState: ${member.state}
```
{{% /example %}}
