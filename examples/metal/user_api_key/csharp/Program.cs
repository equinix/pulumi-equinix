using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var description = config.Get("description") ?? "An user level API Key";
    var readOnly = config.GetBoolean("readOnly") ?? false;
    var apiKey = new Equinix.Metal.UserApiKey("apiKey", new()
    {
        Description = description,
        ReadOnly = readOnly,
    });

    return new Dictionary<string, object?>
    {
        ["apiKeyToken"] = apiKey.Token,
    };
});

