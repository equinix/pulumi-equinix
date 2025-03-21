// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch routing protocol for a given UUID
 *
 * API documentation can be found here - https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/connections/FCR-connect-azureQC.htm#ConfigureRoutingDetailsintheFabricPortal
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const routingProtocolDataName = equinix.fabric.getRoutingProtocol({
 *     connectionUuid: "<uuid_of_connection_routing_protocol_is_applied_to>",
 *     uuid: "<uuid_of_routing_protocol>",
 * });
 * export const id = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.id);
 * export const name = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.name);
 * export const type = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.type);
 * export const directIpv4 = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.directIpv4?.equinixIfaceIp);
 * export const directIpv6 = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.directIpv6?.equinixIfaceIp);
 * export const bgpIpv4CustomerPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv4?.customerPeerIp);
 * export const bgpIpv4EquinixPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv4?.equinixPeerIp);
 * export const bgpIpv4Enabled = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv4?.enabled);
 * export const bgpIpv6CustomerPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv6?.customerPeerIp);
 * export const bgpIpv6EquinixPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv6?.equinixPeerIp);
 * export const bgpIpv6Enabled = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv6?.enabled);
 * export const customerAsn = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.customerAsn);
 * ```
 */
export function getRoutingProtocol(args: GetRoutingProtocolArgs, opts?: pulumi.InvokeOptions): Promise<GetRoutingProtocolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getRoutingProtocol:getRoutingProtocol", {
        "connectionUuid": args.connectionUuid,
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoutingProtocol.
 */
export interface GetRoutingProtocolArgs {
    /**
     * Connection URI associated with Routing Protocol
     */
    connectionUuid: string;
    /**
     * Equinix-assigned routing protocol identifier
     */
    uuid: string;
}

/**
 * A collection of values returned by getRoutingProtocol.
 */
export interface GetRoutingProtocolResult {
    /**
     * Enable AS number override
     */
    readonly asOverrideEnabled: boolean;
    /**
     * Bidirectional Forwarding Detection
     */
    readonly bfd: outputs.fabric.GetRoutingProtocolBfd;
    /**
     * BGP authorization key
     */
    readonly bgpAuthKey: string;
    /**
     * Routing Protocol BGP IPv4
     */
    readonly bgpIpv4: outputs.fabric.GetRoutingProtocolBgpIpv4;
    /**
     * Routing Protocol BGP IPv6
     */
    readonly bgpIpv6: outputs.fabric.GetRoutingProtocolBgpIpv6;
    /**
     * Captures Routing Protocol lifecycle change information
     */
    readonly changeLogs: outputs.fabric.GetRoutingProtocolChangeLog[];
    /**
     * Routing Protocol configuration Changes
     */
    readonly changes: outputs.fabric.GetRoutingProtocolChange[];
    /**
     * Connection URI associated with Routing Protocol
     */
    readonly connectionUuid: string;
    /**
     * Customer-provided ASN
     */
    readonly customerAsn: number;
    /**
     * Customer-provided Fabric Routing Protocol description
     */
    readonly description: string;
    /**
     * Routing Protocol Direct IPv4
     */
    readonly directIpv4: outputs.fabric.GetRoutingProtocolDirectIpv4;
    /**
     * Routing Protocol Direct IPv6
     */
    readonly directIpv6: outputs.fabric.GetRoutingProtocolDirectIpv6;
    /**
     * Equinix ASN
     */
    readonly equinixAsn: number;
    /**
     * Routing Protocol URI information
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    readonly name: string;
    /**
     * Routing Protocol type-specific operational data
     */
    readonly operations: outputs.fabric.GetRoutingProtocolOperation[];
    /**
     * Routing Protocol overall state
     */
    readonly state: string;
    /**
     * Defines the routing protocol type like BGP or DIRECT
     */
    readonly type: string;
    /**
     * Equinix-assigned routing protocol identifier
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch routing protocol for a given UUID
 *
 * API documentation can be found here - https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/connections/FCR-connect-azureQC.htm#ConfigureRoutingDetailsintheFabricPortal
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const routingProtocolDataName = equinix.fabric.getRoutingProtocol({
 *     connectionUuid: "<uuid_of_connection_routing_protocol_is_applied_to>",
 *     uuid: "<uuid_of_routing_protocol>",
 * });
 * export const id = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.id);
 * export const name = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.name);
 * export const type = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.type);
 * export const directIpv4 = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.directIpv4?.equinixIfaceIp);
 * export const directIpv6 = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.directIpv6?.equinixIfaceIp);
 * export const bgpIpv4CustomerPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv4?.customerPeerIp);
 * export const bgpIpv4EquinixPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv4?.equinixPeerIp);
 * export const bgpIpv4Enabled = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv4?.enabled);
 * export const bgpIpv6CustomerPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv6?.customerPeerIp);
 * export const bgpIpv6EquinixPeerIp = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv6?.equinixPeerIp);
 * export const bgpIpv6Enabled = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.bgpIpv6?.enabled);
 * export const customerAsn = routingProtocolDataName.then(routingProtocolDataName => routingProtocolDataName.customerAsn);
 * ```
 */
export function getRoutingProtocolOutput(args: GetRoutingProtocolOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRoutingProtocolResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getRoutingProtocol:getRoutingProtocol", {
        "connectionUuid": args.connectionUuid,
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoutingProtocol.
 */
export interface GetRoutingProtocolOutputArgs {
    /**
     * Connection URI associated with Routing Protocol
     */
    connectionUuid: pulumi.Input<string>;
    /**
     * Equinix-assigned routing protocol identifier
     */
    uuid: pulumi.Input<string>;
}
