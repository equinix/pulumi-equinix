// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to retrieve a virtual circuit resource from
 * [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/)
 *
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 */
export function getVirtualCircuit(args: GetVirtualCircuitArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualCircuitResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getVirtualCircuit:getVirtualCircuit", {
        "virtualCircuitId": args.virtualCircuitId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualCircuit.
 */
export interface GetVirtualCircuitArgs {
    /**
     * ID of the virtual circuit resource
     */
    virtualCircuitId: string;
}

/**
 * A collection of values returned by getVirtualCircuit.
 */
export interface GetVirtualCircuitResult {
    /**
     * UUID of Connection where the VC is scoped to.
     */
    readonly connectionId: string;
    /**
     * The Customer IP address which the CSR switch will peer with. Will default to the other usable IP in the subnet.
     */
    readonly customerIp: string;
    /**
     * Description for the Virtual Circuit resource.
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
     * Name of the virtual circuit resource.
     */
    readonly name: string;
    readonly nniVlan: number;
    readonly nniVnid: number;
    /**
     * The BGP ASN of the peer. The same ASN may be the used across several VCs, but it cannot be the same as the localAsn of the VRF.
     */
    readonly peerAsn: number;
    /**
     * UUID of the Connection Port where the VC is scoped to.
     */
    readonly portId: string;
    /**
     * ID of project to which the VC belongs.
     */
    readonly projectId: string;
    /**
     * Speed of the Virtual Circuit resource.
     */
    readonly speed: string;
    /**
     * Status of the virtal circuit.
     */
    readonly status: string;
    /**
     * A subnet from one of the IP
     * blocks associated with the VRF that we will help create an IP reservation for. Can only be either a /30 or /31.
     * * For a /31 block, it will only have two IP addresses, which will be used for
     * the metalIp and customer_ip.
     * * For a /30 block, it will have four IP addresses, but the first and last IP addresses are not usable. We will default to the first usable IP address for the metal_ip.
     */
    readonly subnet: string;
    /**
     * Tags for the Virtual Circuit resource.
     */
    readonly tags: string[];
    readonly virtualCircuitId: string;
    readonly vlanId: string;
    /**
     * , `nniVlan`, `nniNvid` - VLAN parameters, see the
     * [documentation for Equinix Fabric](https://metal.equinix.com/developers/docs/networking/fabric/).
     */
    readonly vnid: number;
    /**
     * UUID of the VLAN to associate.
     */
    readonly vrfId: string;
}
/**
 * Use this data source to retrieve a virtual circuit resource from
 * [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/)
 *
 * See the [Virtual Routing and Forwarding documentation](https://deploy.equinix.com/developers/docs/metal/layer2-networking/vrf/) for product details and API reference material.
 */
export function getVirtualCircuitOutput(args: GetVirtualCircuitOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVirtualCircuitResult> {
    return pulumi.output(args).apply((a: any) => getVirtualCircuit(a, opts))
}

/**
 * A collection of arguments for invoking getVirtualCircuit.
 */
export interface GetVirtualCircuitOutputArgs {
    /**
     * ID of the virtual circuit resource
     */
    virtualCircuitId: pulumi.Input<string>;
}
