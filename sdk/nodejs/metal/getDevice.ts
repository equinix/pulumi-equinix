// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * The datasource can be used to fetch a single device.
 *
 * If you need to fetch a list of devices which meet filter criteria, you can use the equinix.metal.getDevices datasource.
 *
 * > **Note:** All arguments including the `rootPassword` and `userData` will be stored in the raw state as plain-text. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = equinix.metal.getDevice({
 *     projectId: local.project_id,
 *     hostname: "mydevice",
 * });
 * export const id = test.then(test => test.id);
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = equinix.metal.getDevice({
 *     deviceId: "4c641195-25e5-4c3c-b2b7-4cd7a42c7b40",
 * });
 * export const ipv4 = test.then(test => test.accessPublicIpv4);
 * ```
 */
export function getDevice(args?: GetDeviceArgs, opts?: pulumi.InvokeOptions): Promise<GetDeviceResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getDevice:getDevice", {
        "deviceId": args.deviceId,
        "hostname": args.hostname,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevice.
 */
export interface GetDeviceArgs {
    /**
     * Device ID
     */
    deviceId?: string;
    /**
     * The device name
     */
    hostname?: string;
    /**
     * The id of the project in which the devices exists
     */
    projectId?: string;
}

/**
 * A collection of values returned by getDevice.
 */
export interface GetDeviceResult {
    /**
     * The ipv4 private IP assigned to the device
     */
    readonly accessPrivateIpv4: string;
    /**
     * The ipv4 management IP assigned to the device
     */
    readonly accessPublicIpv4: string;
    /**
     * The ipv6 management IP assigned to the device
     */
    readonly accessPublicIpv6: string;
    readonly alwaysPxe: boolean;
    /**
     * The billing cycle of the device (monthly or hourly)
     */
    readonly billingCycle: string;
    /**
     * Description string for the device
     */
    readonly description: string;
    /**
     * Device ID
     */
    readonly deviceId: string;
    /**
     * The facility where the device is deployed
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    readonly facility: string;
    /**
     * The id of hardware reservation which this device occupies
     */
    readonly hardwareReservationId: string;
    /**
     * The device name
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipxeScriptUrl: string;
    /**
     * The metro where the device is deployed
     */
    readonly metro: string;
    /**
     * L2 network type of the device, one oflayer3, hybrid, layer2-individual, layer2-bonded
     */
    readonly networkType: string;
    /**
     * The device's private and public IP (v4 and v6) network details. When a device is run without any special network configuration, it will have 3 networks: ublic IPv4 at equinix*metal*device.name.network.0, IPv6 at equinix*metal*device.name.network.1 and private IPv4 at equinix*metal*device.name.network.2. Elastic addresses then stack by type - an assigned public IPv4 will go after the management public IPv4 (to index 1), and will then shift the indices of the IPv6 and private IPv4. Assigned private IPv4 will go after the management private IPv4 (to the end of the network list).
     */
    readonly networks: outputs.metal.GetDeviceNetwork[];
    /**
     * The operating system running on the device
     */
    readonly operatingSystem: string;
    /**
     * The hardware config of the device
     */
    readonly plan: string;
    /**
     * Ports assigned to the device
     */
    readonly ports: outputs.metal.GetDevicePort[];
    /**
     * The id of the project in which the devices exists
     */
    readonly projectId: string;
    /**
     * Root password to the server (if still available)
     */
    readonly rootPassword: string;
    /**
     * The hostname to use for [Serial over SSH](https://deploy.equinix.com/developers/docs/metal/resilience-recovery/serial-over-ssh/) access to the device
     */
    readonly sosHostname: string;
    /**
     * List of IDs of SSH keys deployed in the device, can be both user or project SSH keys
     */
    readonly sshKeyIds: string[];
    /**
     * The state of the device
     */
    readonly state: string;
    readonly storage: string;
    /**
     * Tags attached to the device
     */
    readonly tags: string[];
}
/**
 * The datasource can be used to fetch a single device.
 *
 * If you need to fetch a list of devices which meet filter criteria, you can use the equinix.metal.getDevices datasource.
 *
 * > **Note:** All arguments including the `rootPassword` and `userData` will be stored in the raw state as plain-text. Read more about sensitive data in state.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = equinix.metal.getDevice({
 *     projectId: local.project_id,
 *     hostname: "mydevice",
 * });
 * export const id = test.then(test => test.id);
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = equinix.metal.getDevice({
 *     deviceId: "4c641195-25e5-4c3c-b2b7-4cd7a42c7b40",
 * });
 * export const ipv4 = test.then(test => test.accessPublicIpv4);
 * ```
 */
export function getDeviceOutput(args?: GetDeviceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeviceResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:metal/getDevice:getDevice", {
        "deviceId": args.deviceId,
        "hostname": args.hostname,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevice.
 */
export interface GetDeviceOutputArgs {
    /**
     * Device ID
     */
    deviceId?: pulumi.Input<string>;
    /**
     * The device name
     */
    hostname?: pulumi.Input<string>;
    /**
     * The id of the project in which the devices exists
     */
    projectId?: pulumi.Input<string>;
}
