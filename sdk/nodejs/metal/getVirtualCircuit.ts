// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve a virtual circuit resource from [Equinix Fabric - software-defined interconnections](https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/)
 *
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 */
export function getVirtualCircuit(args: GetVirtualCircuitArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualCircuitResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getVirtualCircuit:getVirtualCircuit", {
        "customerIpv6": args.customerIpv6,
        "metalIpv6": args.metalIpv6,
        "subnetIpv6": args.subnetIpv6,
        "virtualCircuitId": args.virtualCircuitId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualCircuit.
 */
export interface GetVirtualCircuitArgs {
    /**
     * The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
     */
    customerIpv6?: string;
    /**
     * The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
     */
    metalIpv6?: string;
    /**
     * A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
     * 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
     * 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     */
    subnetIpv6?: string;
    /**
     * ID of the virtual circuit to lookup
     */
    virtualCircuitId: string;
}

/**
 * A collection of values returned by getVirtualCircuit.
 */
export interface GetVirtualCircuitResult {
    /**
     * UUID of Connection where the VC is scoped to
     */
    readonly connectionId: string;
    /**
     * The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
     */
    readonly customerIp: string;
    /**
     * The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
     */
    readonly customerIpv6?: string;
    /**
     * Description of the virtual circuit
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The password that can be set for the VRF BGP peer
     */
    readonly md5: string;
    /**
     * The Metal IP address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the subnet.
     */
    readonly metalIp: string;
    /**
     * The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
     */
    readonly metalIpv6?: string;
    /**
     * Name of the virtual circuit
     */
    readonly name: string;
    /**
     * Nni VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
     */
    readonly nniVlan: number;
    /**
     * Nni VLAN ID parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
     */
    readonly nniVnid: number;
    /**
     * The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
     */
    readonly peerAsn: number;
    /**
     * UUID of the Connection Port where the VC is scoped to
     */
    readonly portId: string;
    /**
     * ID of the projct to which the virtual circuit belongs
     */
    readonly projectId: string;
    /**
     * Description of the Virtual Circuit speed. This is for information purposes and is computed when the connection type is shared.
     */
    readonly speed: string;
    /**
     * Status of the virtual circuit
     */
    readonly status: string;
    /**
     * A subnet from one of the IP blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
     * 			 * For a /31 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
     * 			 * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     */
    readonly subnet: string;
    /**
     * A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
     * 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
     * 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     */
    readonly subnetIpv6?: string;
    /**
     * Tags attached to the virtual circuit
     */
    readonly tags: string[];
    /**
     * ID of the virtual circuit to lookup
     */
    readonly virtualCircuitId: string;
    /**
     * UUID of the associated VLAN
     */
    readonly vlanId: string;
    /**
     * VNID VLAN parameter, see https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/
     */
    readonly vnid: number;
    /**
     * UUID of the associated VRF
     */
    readonly vrfId: string;
}
/**
 * Use this data source to retrieve a virtual circuit resource from [Equinix Fabric - software-defined interconnections](https://deploy.equinix.com/developers/docs/metal/interconnections/introduction/)
 *
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 */
export function getVirtualCircuitOutput(args: GetVirtualCircuitOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVirtualCircuitResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:metal/getVirtualCircuit:getVirtualCircuit", {
        "customerIpv6": args.customerIpv6,
        "metalIpv6": args.metalIpv6,
        "subnetIpv6": args.subnetIpv6,
        "virtualCircuitId": args.virtualCircuitId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualCircuit.
 */
export interface GetVirtualCircuitOutputArgs {
    /**
     * The Customer IPv6 address which the CSR switch will peer with. Will default to the other usable IP in the IPv6 subnet.
     */
    customerIpv6?: pulumi.Input<string>;
    /**
     * The Metal IPv6 address for the SVI (Switch Virtual Interface) of the VirtualCircuit. Will default to the first usable IP in the IPv6 subnet.
     */
    metalIpv6?: pulumi.Input<string>;
    /**
     * A subnet from one of the IPv6 blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /126 or /127.
     * 			 * For a /127 block, it will only have two IP addresses, which will be used for the metal*ip and customer*ip.
     * 			 * For a /126 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     */
    subnetIpv6?: pulumi.Input<string>;
    /**
     * ID of the virtual circuit to lookup
     */
    virtualCircuitId: pulumi.Input<string>;
}
