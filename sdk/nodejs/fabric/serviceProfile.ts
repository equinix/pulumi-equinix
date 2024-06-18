// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Service Profile
 *
 * Additional documentation:
 * * Getting Started: <https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm>
 * * API: <https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const profile = new equinix.fabric.ServiceProfile("profile", {
 *     name: "Example Cloud Provider",
 *     description: "50 to 500 Mbps Hosted Connection to Example Cloud",
 *     type: "L2_PROFILE",
 *     accessPointTypeConfigs: [{
 *         type: "COLO",
 *         supportedBandwidths: [
 *             50,
 *             100,
 *             200,
 *             500,
 *         ],
 *         allowRemoteConnections: true,
 *         allowCustomBandwidth: false,
 *         allowBandwidthAutoApproval: false,
 *         linkProtocolConfig: {
 *             encapsulationStrategy: "CTAGED",
 *             reuseVlanSTag: false,
 *             encapsulation: "DOT1Q",
 *         },
 *         enableAutoGenerateServiceKey: "false,",
 *         connectionRedundancyRequired: "false,",
 *         apiConfig: {
 *             apiAvailable: true,
 *             integrationId: "Example-Connect-01",
 *             bandwidthFromApi: false,
 *         },
 *         connectionLabel: "Virtual Circuit Name",
 *         authenticationKey: {
 *             required: true,
 *             label: "Example ACCOUNT ID",
 *         },
 *     }],
 *     account: {
 *         organizationName: "Example Cloud",
 *         globalOrganizationName: "Example Global",
 *     },
 *     metros: undefined,
 *     visibility: "PUBLIC",
 *     marketingInfo: {
 *         promotion: true,
 *     },
 * });
 * export const profileId = profile.id;
 * ```
 */
export class ServiceProfile extends pulumi.CustomResource {
    /**
     * Get an existing ServiceProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceProfileState, opts?: pulumi.CustomResourceOptions): ServiceProfile {
        return new ServiceProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/serviceProfile:ServiceProfile';

    /**
     * Returns true if the given object is an instance of ServiceProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceProfile.__pulumiType;
    }

    /**
     * Access point config information
     */
    public readonly accessPointTypeConfigs!: pulumi.Output<outputs.fabric.ServiceProfileAccessPointTypeConfig[] | undefined>;
    /**
     * Service Profile Owner Account Information
     */
    public /*out*/ readonly account!: pulumi.Output<outputs.fabric.ServiceProfileAccount>;
    /**
     * Array of contact emails
     */
    public readonly allowedEmails!: pulumi.Output<string[] | undefined>;
    /**
     * Captures connection lifecycle change information
     */
    public /*out*/ readonly changeLog!: pulumi.Output<outputs.fabric.ServiceProfileChangeLog>;
    /**
     * Custom Fields
     */
    public readonly customFields!: pulumi.Output<outputs.fabric.ServiceProfileCustomField[] | undefined>;
    /**
     * User-provided service description
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Service Profile URI response attribute
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Marketing Info
     */
    public readonly marketingInfo!: pulumi.Output<outputs.fabric.ServiceProfileMarketingInfo | undefined>;
    /**
     * Access point config information
     */
    public readonly metros!: pulumi.Output<outputs.fabric.ServiceProfileMetro[] | undefined>;
    /**
     * Customer-assigned service profile name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    public readonly notifications!: pulumi.Output<outputs.fabric.ServiceProfileNotification[] | undefined>;
    /**
     * Ports
     */
    public readonly ports!: pulumi.Output<outputs.fabric.ServiceProfilePort[] | undefined>;
    /**
     * Project information
     */
    public readonly project!: pulumi.Output<outputs.fabric.ServiceProfileProject | undefined>;
    /**
     * Self Profile indicating if the profile is created for customer's  self use
     */
    public readonly selfProfile!: pulumi.Output<boolean | undefined>;
    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * Tags attached to the connection
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Equinix assigned service profile identifier
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;
    /**
     * Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     */
    public readonly viewPoint!: pulumi.Output<string | undefined>;
    /**
     * Virtual Devices
     */
    public readonly virtualDevices!: pulumi.Output<outputs.fabric.ServiceProfileVirtualDevice[] | undefined>;
    /**
     * Service profile visibility - PUBLIC, PRIVATE
     */
    public readonly visibility!: pulumi.Output<string | undefined>;

    /**
     * Create a ServiceProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceProfileArgs | ServiceProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceProfileState | undefined;
            resourceInputs["accessPointTypeConfigs"] = state ? state.accessPointTypeConfigs : undefined;
            resourceInputs["account"] = state ? state.account : undefined;
            resourceInputs["allowedEmails"] = state ? state.allowedEmails : undefined;
            resourceInputs["changeLog"] = state ? state.changeLog : undefined;
            resourceInputs["customFields"] = state ? state.customFields : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["marketingInfo"] = state ? state.marketingInfo : undefined;
            resourceInputs["metros"] = state ? state.metros : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["ports"] = state ? state.ports : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["selfProfile"] = state ? state.selfProfile : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
            resourceInputs["viewPoint"] = state ? state.viewPoint : undefined;
            resourceInputs["virtualDevices"] = state ? state.virtualDevices : undefined;
            resourceInputs["visibility"] = state ? state.visibility : undefined;
        } else {
            const args = argsOrState as ServiceProfileArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accessPointTypeConfigs"] = args ? args.accessPointTypeConfigs : undefined;
            resourceInputs["allowedEmails"] = args ? args.allowedEmails : undefined;
            resourceInputs["customFields"] = args ? args.customFields : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["marketingInfo"] = args ? args.marketingInfo : undefined;
            resourceInputs["metros"] = args ? args.metros : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["ports"] = args ? args.ports : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["selfProfile"] = args ? args.selfProfile : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["viewPoint"] = args ? args.viewPoint : undefined;
            resourceInputs["virtualDevices"] = args ? args.virtualDevices : undefined;
            resourceInputs["visibility"] = args ? args.visibility : undefined;
            resourceInputs["account"] = undefined /*out*/;
            resourceInputs["changeLog"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceProfile resources.
 */
export interface ServiceProfileState {
    /**
     * Access point config information
     */
    accessPointTypeConfigs?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileAccessPointTypeConfig>[]>;
    /**
     * Service Profile Owner Account Information
     */
    account?: pulumi.Input<inputs.fabric.ServiceProfileAccount>;
    /**
     * Array of contact emails
     */
    allowedEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Captures connection lifecycle change information
     */
    changeLog?: pulumi.Input<inputs.fabric.ServiceProfileChangeLog>;
    /**
     * Custom Fields
     */
    customFields?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileCustomField>[]>;
    /**
     * User-provided service description
     */
    description?: pulumi.Input<string>;
    /**
     * Service Profile URI response attribute
     */
    href?: pulumi.Input<string>;
    /**
     * Marketing Info
     */
    marketingInfo?: pulumi.Input<inputs.fabric.ServiceProfileMarketingInfo>;
    /**
     * Access point config information
     */
    metros?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileMetro>[]>;
    /**
     * Customer-assigned service profile name
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileNotification>[]>;
    /**
     * Ports
     */
    ports?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfilePort>[]>;
    /**
     * Project information
     */
    project?: pulumi.Input<inputs.fabric.ServiceProfileProject>;
    /**
     * Self Profile indicating if the profile is created for customer's  self use
     */
    selfProfile?: pulumi.Input<boolean>;
    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     */
    state?: pulumi.Input<string | enums.fabric.ProfileState>;
    /**
     * Tags attached to the connection
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     */
    type?: pulumi.Input<string | enums.fabric.ProfileType>;
    /**
     * Equinix assigned service profile identifier
     */
    uuid?: pulumi.Input<string>;
    /**
     * Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     */
    viewPoint?: pulumi.Input<string>;
    /**
     * Virtual Devices
     */
    virtualDevices?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileVirtualDevice>[]>;
    /**
     * Service profile visibility - PUBLIC, PRIVATE
     */
    visibility?: pulumi.Input<string | enums.fabric.ProfileVisibility>;
}

/**
 * The set of arguments for constructing a ServiceProfile resource.
 */
export interface ServiceProfileArgs {
    /**
     * Access point config information
     */
    accessPointTypeConfigs?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileAccessPointTypeConfig>[]>;
    /**
     * Array of contact emails
     */
    allowedEmails?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Custom Fields
     */
    customFields?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileCustomField>[]>;
    /**
     * User-provided service description
     */
    description: pulumi.Input<string>;
    /**
     * Marketing Info
     */
    marketingInfo?: pulumi.Input<inputs.fabric.ServiceProfileMarketingInfo>;
    /**
     * Access point config information
     */
    metros?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileMetro>[]>;
    /**
     * Customer-assigned service profile name
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileNotification>[]>;
    /**
     * Ports
     */
    ports?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfilePort>[]>;
    /**
     * Project information
     */
    project?: pulumi.Input<inputs.fabric.ServiceProfileProject>;
    /**
     * Self Profile indicating if the profile is created for customer's  self use
     */
    selfProfile?: pulumi.Input<boolean>;
    /**
     * Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     */
    state?: pulumi.Input<string | enums.fabric.ProfileState>;
    /**
     * Tags attached to the connection
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     */
    type: pulumi.Input<string | enums.fabric.ProfileType>;
    /**
     * Flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     */
    viewPoint?: pulumi.Input<string>;
    /**
     * Virtual Devices
     */
    virtualDevices?: pulumi.Input<pulumi.Input<inputs.fabric.ServiceProfileVirtualDevice>[]>;
    /**
     * Service profile visibility - PUBLIC, PRIVATE
     */
    visibility?: pulumi.Input<string | enums.fabric.ProfileVisibility>;
}
