using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var projectId = config.Require("projectId");
    var readOnly = config.GetBoolean("readOnly") ?? false;
    var apiKey = new Equinix.Metal.ProjectApiKey("apiKey", new()
    {
        ProjectId = projectId,
        Description = "A project level API Key",
        ReadOnly = readOnly,
    });

    return new Dictionary<string, object?>
    {
        ["apiKeyToken"] = apiKey.Token,
    };
});

