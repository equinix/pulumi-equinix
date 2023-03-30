using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var accountName = config.Require("accountName");
    var licenseToken = config.Require("licenseToken");
    var sshUserName = config.Require("sshUserName");
    var sshKeyName = config.Require("sshKeyName");
    var aclTemplateId = config.Require("aclTemplateId");
    var metro = config.Get("metro") ?? "SV";
    var devicePackageCode = config.Get("devicePackageCode") ?? "network-essentials";
    var deviceVersion = config.Get("deviceVersion") ?? "17.06.01a";
    var sizeInCores = config.GetNumber("sizeInCores") ?? 2;
    var termLength = config.GetNumber("termLength") ?? 6;
    var additionalBandwidth = config.GetNumber("additionalBandwidth") ?? 5;
    var accountNum = Equinix.NetworkEdge.GetAccount.Invoke(new()
    {
        Name = accountName,
        MetroCode = metro,
    }).Apply(invoke => invoke.Number);

    var c8KRouter = new Equinix.NetworkEdge.Device("c8kRouter", new()
    {
        Name = "catalystRouter",
        MetroCode = metro,
        TypeCode = "C8000V",
        SelfManaged = true,
        Byol = true,
        PackageCode = devicePackageCode,
        Notifications = new[]
        {
            "example@equinix.com",
        },
        Hostname = "C8KV",
        AccountNumber = accountNum,
        Version = deviceVersion,
        CoreCount = sizeInCores,
        TermLength = termLength,
        LicenseToken = licenseToken,
        AdditionalBandwidth = additionalBandwidth,
        SshKey = new Equinix.NetworkEdge.Inputs.DeviceSshKeyArgs
        {
            Username = sshUserName,
            KeyName = sshKeyName,
        },
        AclTemplateId = aclTemplateId,
    });

    return new Dictionary<string, object?>
    {
        ["routerId"] = c8KRouter.Id,
        ["provisionStatus"] = c8KRouter.Status,
        ["licenseStatus"] = c8KRouter.LicenseStatus,
        ["sshIpAddress"] = c8KRouter.SshIpAddress,
    };
});
