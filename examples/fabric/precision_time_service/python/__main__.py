import pulumi
import pulumi_equinix as equinix

ptp = equinix.fabric.PrecisionTimeService("ptp",
    type="PTP",
    name="tf_acc_eptptp_PFCR",
    package={
        "code": "PTP_STANDARD",
    },
    connections=[{
        "uuid": "<connection_id>",
    }],
    ipv4={
        "primary": "191.168.254.241",
        "secondary": "191.168.254.242",
        "network_mask": "255.255.255.240",
        "default_gateway": "191.168.254.254",
    })
pulumi.export("eptServiceId", ptp.id)
pulumi.export("eptServiceName", ptp.name)
pulumi.export("eptServiceState", ptp.state)
pulumi.export("eptServiceType", ptp.type)
pulumi.export("eptServiceConnection", ptp.connections)
pulumi.export("eptServiceIpv4", ptp.ipv4)
