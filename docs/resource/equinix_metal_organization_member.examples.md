## Example Usage

{{% example %}}
### example 1
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const member = new equinix.metal.OrganizationMember("member", {
    invitee: "member@example.com",
    roles: ["limited_collaborator"],
    projectsIds: [projectId],
    organizationId: organizationId,
});
```
```python
import pulumi
import pulumi_equinix as equinix

member = equinix.metal.OrganizationMember("member",
    invitee="member@example.com",
    roles=["limited_collaborator"],
    projects_ids=[project_id],
    organization_id=organization_id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewOrganizationMember(ctx, "member", &metal.OrganizationMemberArgs{
			Invitee: pulumi.String("member@example.com"),
			Roles: pulumi.StringArray{
				pulumi.String("limited_collaborator"),
			},
			ProjectsIds: pulumi.StringArray{
				projectId,
			},
			OrganizationId: pulumi.Any(organizationId),
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
    var member = new Equinix.Metal.OrganizationMember("member", new()
    {
        Invitee = "member@example.com",
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

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.OrganizationMember;
import com.equinix.pulumi.equinix.metal.OrganizationMemberArgs;
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
        var member = new OrganizationMember("member", OrganizationMemberArgs.builder()
            .invitee("member@example.com")
            .roles("limited_collaborator")
            .projectsIds(projectId)
            .organizationId(organizationId)
            .build());

    }
}
```
```yaml
resources:
  member:
    type: equinix:metal:OrganizationMember
    properties:
      invitee: member@example.com
      roles:
        - limited_collaborator
      projectsIds:
        - ${projectId}
      organizationId: ${organizationId}
```
{{% /example %}}

{{% example %}}
### example 2
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const owner = new equinix.metal.OrganizationMember("owner", {
    invitee: "admin@example.com",
    roles: ["owner"],
    projectsIds: [],
    organizationId: organizationId,
});
```
```python
import pulumi
import pulumi_equinix as equinix

owner = equinix.metal.OrganizationMember("owner",
    invitee="admin@example.com",
    roles=["owner"],
    projects_ids=[],
    organization_id=organization_id)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewOrganizationMember(ctx, "owner", &metal.OrganizationMemberArgs{
			Invitee: pulumi.String("admin@example.com"),
			Roles: pulumi.StringArray{
				pulumi.String("owner"),
			},
			ProjectsIds:    pulumi.StringArray{},
			OrganizationId: pulumi.Any(organizationId),
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
    var owner = new Equinix.Metal.OrganizationMember("owner", new()
    {
        Invitee = "admin@example.com",
        Roles = new[]
        {
            "owner",
        },
        ProjectsIds = new[] {},
        OrganizationId = organizationId,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.OrganizationMember;
import com.equinix.pulumi.equinix.metal.OrganizationMemberArgs;
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
        var owner = new OrganizationMember("owner", OrganizationMemberArgs.builder()
            .invitee("admin@example.com")
            .roles("owner")
            .projectsIds()
            .organizationId(organizationId)
            .build());

    }
}
```
```yaml
resources:
  owner:
    type: equinix:metal:OrganizationMember
    properties:
      invitee: admin@example.com
      roles:
        - owner
      projectsIds: []
      organizationId: ${organizationId}
```
{{% /example %}}


