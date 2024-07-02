using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var orgResource = new Equinix.Metal.Organization("org", new()
    {
        Name = "Foo Organization",
        Address = new Equinix.Metal.Inputs.OrganizationAddressArgs
        {
            Address = "org street",
            City = "london",
            Country = "GB",
            ZipCode = "12345",
        },
        Description = "An organization",
    });

    return new Dictionary<string, object?>
    {
        ["org"] = orgResource.Id,
    };
});

