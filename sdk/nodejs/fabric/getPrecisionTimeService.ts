// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch Equinix Precision Time Service by UUID
 * Additional Documentation:
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Precision-Time
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const ept_test = equinix.fabric.getPrecisionTimeService({
 *     eptServiceId: "<ept_service_id",
 * });
 * export const eptServiceId = ept_test.then(ept_test => ept_test.id);
 * export const eptServiceName = ept_test.then(ept_test => ept_test.name);
 * export const eptServiceState = ept_test.then(ept_test => ept_test.state);
 * export const eptServiceType = ept_test.then(ept_test => ept_test.type);
 * export const eptServiceIpv4 = ept_test.then(ept_test => ept_test.ipv4);
 * export const eptServiceConnection = equinix_fabric_precision_time_service.ptp.connections;
 * ```
 */
export function getPrecisionTimeService(args: GetPrecisionTimeServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetPrecisionTimeServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getPrecisionTimeService:getPrecisionTimeService", {
        "eptServiceId": args.eptServiceId,
        "ntpAdvancedConfigurations": args.ntpAdvancedConfigurations,
        "project": args.project,
        "ptpAdvancedConfiguration": args.ptpAdvancedConfiguration,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrecisionTimeService.
 */
export interface GetPrecisionTimeServiceArgs {
    /**
     * The uuid of the EPT Service this data source should retrieve
     */
    eptServiceId: string;
    /**
     * NTP Advanced configuration
     */
    ntpAdvancedConfigurations?: inputs.fabric.GetPrecisionTimeServiceNtpAdvancedConfiguration[];
    /**
     * Equinix Project attribute object
     */
    project?: inputs.fabric.GetPrecisionTimeServiceProject;
    /**
     * PTP Advanced Configuration
     */
    ptpAdvancedConfiguration?: inputs.fabric.GetPrecisionTimeServicePtpAdvancedConfiguration;
}

/**
 * A collection of values returned by getPrecisionTimeService.
 */
export interface GetPrecisionTimeServiceResult {
    /**
     * Equinix User Account associated with Precision Time Service
     */
    readonly account: outputs.fabric.GetPrecisionTimeServiceAccount;
    /**
     * Details of the last change on the route aggregation resource
     */
    readonly changeLog: outputs.fabric.GetPrecisionTimeServiceChangeLog;
    /**
     * An array of objects with unique identifiers of connections.
     */
    readonly connections: outputs.fabric.GetPrecisionTimeServiceConnection[];
    /**
     * The uuid of the EPT Service this data source should retrieve
     */
    readonly eptServiceId: string;
    /**
     * Equinix generated Portal link for the created Precision Time Service
     */
    readonly href: string;
    /**
     * The unique identifier of the resource
     */
    readonly id: string;
    /**
     * An object that has Network IP Configurations for Timing Master Servers.
     */
    readonly ipv4: outputs.fabric.GetPrecisionTimeServiceIpv4;
    /**
     * Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
     */
    readonly name: string;
    /**
     * NTP Advanced configuration
     */
    readonly ntpAdvancedConfigurations?: outputs.fabric.GetPrecisionTimeServiceNtpAdvancedConfiguration[];
    /**
     * Precision Time Order
     */
    readonly order: outputs.fabric.GetPrecisionTimeServiceOrder;
    /**
     * Precision Time Service Package Details
     */
    readonly package: outputs.fabric.GetPrecisionTimeServicePackage;
    /**
     * Precision Time Service Price
     */
    readonly precisionTimePrice: outputs.fabric.GetPrecisionTimeServicePrecisionTimePrice;
    /**
     * Equinix Project attribute object
     */
    readonly project?: outputs.fabric.GetPrecisionTimeServiceProject;
    /**
     * PTP Advanced Configuration
     */
    readonly ptpAdvancedConfiguration?: outputs.fabric.GetPrecisionTimeServicePtpAdvancedConfiguration;
    /**
     * Indicator of the state of this Precision Time Service
     */
    readonly state: string;
    /**
     * Choose type of Precision Time Service
     */
    readonly type: string;
    /**
     * Equinix generated id for the Precision Time Service
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch Equinix Precision Time Service by UUID
 * Additional Documentation:
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Precision-Time
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const ept_test = equinix.fabric.getPrecisionTimeService({
 *     eptServiceId: "<ept_service_id",
 * });
 * export const eptServiceId = ept_test.then(ept_test => ept_test.id);
 * export const eptServiceName = ept_test.then(ept_test => ept_test.name);
 * export const eptServiceState = ept_test.then(ept_test => ept_test.state);
 * export const eptServiceType = ept_test.then(ept_test => ept_test.type);
 * export const eptServiceIpv4 = ept_test.then(ept_test => ept_test.ipv4);
 * export const eptServiceConnection = equinix_fabric_precision_time_service.ptp.connections;
 * ```
 */
export function getPrecisionTimeServiceOutput(args: GetPrecisionTimeServiceOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPrecisionTimeServiceResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getPrecisionTimeService:getPrecisionTimeService", {
        "eptServiceId": args.eptServiceId,
        "ntpAdvancedConfigurations": args.ntpAdvancedConfigurations,
        "project": args.project,
        "ptpAdvancedConfiguration": args.ptpAdvancedConfiguration,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrecisionTimeService.
 */
export interface GetPrecisionTimeServiceOutputArgs {
    /**
     * The uuid of the EPT Service this data source should retrieve
     */
    eptServiceId: pulumi.Input<string>;
    /**
     * NTP Advanced configuration
     */
    ntpAdvancedConfigurations?: pulumi.Input<pulumi.Input<inputs.fabric.GetPrecisionTimeServiceNtpAdvancedConfigurationArgs>[]>;
    /**
     * Equinix Project attribute object
     */
    project?: pulumi.Input<inputs.fabric.GetPrecisionTimeServiceProjectArgs>;
    /**
     * PTP Advanced Configuration
     */
    ptpAdvancedConfiguration?: pulumi.Input<inputs.fabric.GetPrecisionTimeServicePtpAdvancedConfigurationArgs>;
}
