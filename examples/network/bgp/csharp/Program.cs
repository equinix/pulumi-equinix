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

