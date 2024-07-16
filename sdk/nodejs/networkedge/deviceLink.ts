// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource `equinix.networkedge.DeviceLink` allows creation and management of Equinix Network Edge virtual network device links.
 *
 * ## Example Usage
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = new equinix.networkedge.DeviceLink("test", {
 *     name: "test-link",
 *     subnet: "192.168.40.64/27",
 *     projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
 *     devices: [
 *         {
 *             id: testEquinixNetworkDevice.uuid,
 *             asn: 22111,
 *             interfaceId: 6,
 *         },
 *         {
 *             id: testEquinixNetworkDevice.secondaryDevice[0].uuid,
 *             asn: 22333,
 *             interfaceId: 7,
 *         },
 *     ],
 *     links: [{
 *         accountNumber: testEquinixNetworkDevice.accountNumber,
 *         srcMetroCode: testEquinixNetworkDevice.metroCode,
 *         dstMetroCode: testEquinixNetworkDevice.secondaryDevice[0].metroCode,
 *         throughput: "50",
 *         throughputUnit: "Mbps",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing ID:
 *
 * ```sh
 * $ pulumi import equinix:networkedge/deviceLink:DeviceLink example {existing_id}
 * ```
 */
export class DeviceLink extends pulumi.CustomResource {
    /**
     * Get an existing DeviceLink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceLinkState, opts?: pulumi.CustomResourceOptions): DeviceLink {
        return new DeviceLink(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:networkedge/deviceLink:DeviceLink';

    /**
     * Returns true if the given object is an instance of DeviceLink.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeviceLink {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeviceLink.__pulumiType;
    }

    /**
     * definition of one or more devices belonging to the device link. See Device section below for more details.
     */
    public readonly devices!: pulumi.Output<outputs.networkedge.DeviceLinkDevice[]>;
    /**
     * definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
     *
     * @deprecated Links is deprecated. Please use metro links instead.
     */
    public readonly links!: pulumi.Output<outputs.networkedge.DeviceLinkLink[] | undefined>;
    /**
     * definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
     */
    public readonly metroLinks!: pulumi.Output<outputs.networkedge.DeviceLinkMetroLink[] | undefined>;
    /**
     * device link name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
     */
    public readonly redundancyType!: pulumi.Output<string | undefined>;
    /**
     * device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * device link subnet in CIDR format. Not required for link between self configured devices.
     */
    public readonly subnet!: pulumi.Output<string | undefined>;
    /**
     * Device link unique identifier.
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a DeviceLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceLinkArgs | DeviceLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceLinkState | undefined;
            resourceInputs["devices"] = state ? state.devices : undefined;
            resourceInputs["links"] = state ? state.links : undefined;
            resourceInputs["metroLinks"] = state ? state.metroLinks : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["redundancyType"] = state ? state.redundancyType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subnet"] = state ? state.subnet : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as DeviceLinkArgs | undefined;
            if ((!args || args.devices === undefined) && !opts.urn) {
                throw new Error("Missing required property 'devices'");
            }
            resourceInputs["devices"] = args ? args.devices : undefined;
            resourceInputs["links"] = args ? args.links : undefined;
            resourceInputs["metroLinks"] = args ? args.metroLinks : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["redundancyType"] = args ? args.redundancyType : undefined;
            resourceInputs["subnet"] = args ? args.subnet : undefined;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeviceLink.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeviceLink resources.
 */
export interface DeviceLinkState {
    /**
     * definition of one or more devices belonging to the device link. See Device section below for more details.
     */
    devices?: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceLinkDevice>[]>;
    /**
     * definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
     *
     * @deprecated Links is deprecated. Please use metro links instead.
     */
    links?: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceLinkLink>[]>;
    /**
     * definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
     */
    metroLinks?: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceLinkMetroLink>[]>;
    /**
     * device link name.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
     */
    redundancyType?: pulumi.Input<string>;
    /**
     * device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
     */
    status?: pulumi.Input<string>;
    /**
     * device link subnet in CIDR format. Not required for link between self configured devices.
     */
    subnet?: pulumi.Input<string>;
    /**
     * Device link unique identifier.
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DeviceLink resource.
 */
export interface DeviceLinkArgs {
    /**
     * definition of one or more devices belonging to the device link. See Device section below for more details.
     */
    devices: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceLinkDevice>[]>;
    /**
     * definition of one or more, inter metro, connections belonging to the device link. See Link section below for more details.
     *
     * @deprecated Links is deprecated. Please use metro links instead.
     */
    links?: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceLinkLink>[]>;
    /**
     * definition of one or more, inter metro, connections belonging to the device link. See Metro Link section below for more details.
     */
    metroLinks?: pulumi.Input<pulumi.Input<inputs.networkedge.DeviceLinkMetroLink>[]>;
    /**
     * device link name.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique Identifier for the project resource where the device link is scoped to.If you leave it out, the device link will be created under the default project id of your organization.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Whether the connection should be created through Fabric's primary or secondary port. Supported values: `PRIMARY` (Default), `SECONDARY`, `HYBRID`
     */
    redundancyType?: pulumi.Input<string>;
    /**
     * device link subnet in CIDR format. Not required for link between self configured devices.
     */
    subnet?: pulumi.Input<string>;
}
