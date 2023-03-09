// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { BgpSessionArgs, BgpSessionState } from "./bgpSession";
export type BgpSession = import("./bgpSession").BgpSession;
export const BgpSession: typeof import("./bgpSession").BgpSession = null as any;
utilities.lazyLoad(exports, ["BgpSession"], () => require("./bgpSession"));

export { ConnectionArgs, ConnectionState } from "./connection";
export type Connection = import("./connection").Connection;
export const Connection: typeof import("./connection").Connection = null as any;
utilities.lazyLoad(exports, ["Connection"], () => require("./connection"));

export { DeviceArgs, DeviceState } from "./device";
export type Device = import("./device").Device;
export const Device: typeof import("./device").Device = null as any;
utilities.lazyLoad(exports, ["Device"], () => require("./device"));

export { DeviceNetworkTypeArgs, DeviceNetworkTypeState } from "./deviceNetworkType";
export type DeviceNetworkType = import("./deviceNetworkType").DeviceNetworkType;
export const DeviceNetworkType: typeof import("./deviceNetworkType").DeviceNetworkType = null as any;
utilities.lazyLoad(exports, ["DeviceNetworkType"], () => require("./deviceNetworkType"));

export { GatewayArgs, GatewayState } from "./gateway";
export type Gateway = import("./gateway").Gateway;
export const Gateway: typeof import("./gateway").Gateway = null as any;
utilities.lazyLoad(exports, ["Gateway"], () => require("./gateway"));

export { GetConnectionArgs, GetConnectionResult, GetConnectionOutputArgs } from "./getConnection";
export const getConnection: typeof import("./getConnection").getConnection = null as any;
export const getConnectionOutput: typeof import("./getConnection").getConnectionOutput = null as any;
utilities.lazyLoad(exports, ["getConnection","getConnectionOutput"], () => require("./getConnection"));

export { GetDeviceArgs, GetDeviceResult, GetDeviceOutputArgs } from "./getDevice";
export const getDevice: typeof import("./getDevice").getDevice = null as any;
export const getDeviceOutput: typeof import("./getDevice").getDeviceOutput = null as any;
utilities.lazyLoad(exports, ["getDevice","getDeviceOutput"], () => require("./getDevice"));

export { GetDeviceBgpNeighborsArgs, GetDeviceBgpNeighborsResult, GetDeviceBgpNeighborsOutputArgs } from "./getDeviceBgpNeighbors";
export const getDeviceBgpNeighbors: typeof import("./getDeviceBgpNeighbors").getDeviceBgpNeighbors = null as any;
export const getDeviceBgpNeighborsOutput: typeof import("./getDeviceBgpNeighbors").getDeviceBgpNeighborsOutput = null as any;
utilities.lazyLoad(exports, ["getDeviceBgpNeighbors","getDeviceBgpNeighborsOutput"], () => require("./getDeviceBgpNeighbors"));

export { GetFacilityArgs, GetFacilityResult, GetFacilityOutputArgs } from "./getFacility";
export const getFacility: typeof import("./getFacility").getFacility = null as any;
export const getFacilityOutput: typeof import("./getFacility").getFacilityOutput = null as any;
utilities.lazyLoad(exports, ["getFacility","getFacilityOutput"], () => require("./getFacility"));

export { GetGatewayArgs, GetGatewayResult, GetGatewayOutputArgs } from "./getGateway";
export const getGateway: typeof import("./getGateway").getGateway = null as any;
export const getGatewayOutput: typeof import("./getGateway").getGatewayOutput = null as any;
utilities.lazyLoad(exports, ["getGateway","getGatewayOutput"], () => require("./getGateway"));

export { GetHardwareReservationArgs, GetHardwareReservationResult, GetHardwareReservationOutputArgs } from "./getHardwareReservation";
export const getHardwareReservation: typeof import("./getHardwareReservation").getHardwareReservation = null as any;
export const getHardwareReservationOutput: typeof import("./getHardwareReservation").getHardwareReservationOutput = null as any;
utilities.lazyLoad(exports, ["getHardwareReservation","getHardwareReservationOutput"], () => require("./getHardwareReservation"));

export { GetIpBlockRangesArgs, GetIpBlockRangesResult, GetIpBlockRangesOutputArgs } from "./getIpBlockRanges";
export const getIpBlockRanges: typeof import("./getIpBlockRanges").getIpBlockRanges = null as any;
export const getIpBlockRangesOutput: typeof import("./getIpBlockRanges").getIpBlockRangesOutput = null as any;
utilities.lazyLoad(exports, ["getIpBlockRanges","getIpBlockRangesOutput"], () => require("./getIpBlockRanges"));

export { GetMetroArgs, GetMetroResult, GetMetroOutputArgs } from "./getMetro";
export const getMetro: typeof import("./getMetro").getMetro = null as any;
export const getMetroOutput: typeof import("./getMetro").getMetroOutput = null as any;
utilities.lazyLoad(exports, ["getMetro","getMetroOutput"], () => require("./getMetro"));

export { GetOperatingSystemArgs, GetOperatingSystemResult, GetOperatingSystemOutputArgs } from "./getOperatingSystem";
export const getOperatingSystem: typeof import("./getOperatingSystem").getOperatingSystem = null as any;
export const getOperatingSystemOutput: typeof import("./getOperatingSystem").getOperatingSystemOutput = null as any;
utilities.lazyLoad(exports, ["getOperatingSystem","getOperatingSystemOutput"], () => require("./getOperatingSystem"));

export { GetOrganizationArgs, GetOrganizationResult, GetOrganizationOutputArgs } from "./getOrganization";
export const getOrganization: typeof import("./getOrganization").getOrganization = null as any;
export const getOrganizationOutput: typeof import("./getOrganization").getOrganizationOutput = null as any;
utilities.lazyLoad(exports, ["getOrganization","getOrganizationOutput"], () => require("./getOrganization"));

export { GetPlansArgs, GetPlansResult, GetPlansOutputArgs } from "./getPlans";
export const getPlans: typeof import("./getPlans").getPlans = null as any;
export const getPlansOutput: typeof import("./getPlans").getPlansOutput = null as any;
utilities.lazyLoad(exports, ["getPlans","getPlansOutput"], () => require("./getPlans"));

export { GetPortArgs, GetPortResult, GetPortOutputArgs } from "./getPort";
export const getPort: typeof import("./getPort").getPort = null as any;
export const getPortOutput: typeof import("./getPort").getPortOutput = null as any;
utilities.lazyLoad(exports, ["getPort","getPortOutput"], () => require("./getPort"));

export { GetPrecreatedIpBlockArgs, GetPrecreatedIpBlockResult, GetPrecreatedIpBlockOutputArgs } from "./getPrecreatedIpBlock";
export const getPrecreatedIpBlock: typeof import("./getPrecreatedIpBlock").getPrecreatedIpBlock = null as any;
export const getPrecreatedIpBlockOutput: typeof import("./getPrecreatedIpBlock").getPrecreatedIpBlockOutput = null as any;
utilities.lazyLoad(exports, ["getPrecreatedIpBlock","getPrecreatedIpBlockOutput"], () => require("./getPrecreatedIpBlock"));

export { GetProjectArgs, GetProjectResult, GetProjectOutputArgs } from "./getProject";
export const getProject: typeof import("./getProject").getProject = null as any;
export const getProjectOutput: typeof import("./getProject").getProjectOutput = null as any;
utilities.lazyLoad(exports, ["getProject","getProjectOutput"], () => require("./getProject"));

export { GetProjectSshKeyArgs, GetProjectSshKeyResult, GetProjectSshKeyOutputArgs } from "./getProjectSshKey";
export const getProjectSshKey: typeof import("./getProjectSshKey").getProjectSshKey = null as any;
export const getProjectSshKeyOutput: typeof import("./getProjectSshKey").getProjectSshKeyOutput = null as any;
utilities.lazyLoad(exports, ["getProjectSshKey","getProjectSshKeyOutput"], () => require("./getProjectSshKey"));

export { GetReservedIpBlockArgs, GetReservedIpBlockResult, GetReservedIpBlockOutputArgs } from "./getReservedIpBlock";
export const getReservedIpBlock: typeof import("./getReservedIpBlock").getReservedIpBlock = null as any;
export const getReservedIpBlockOutput: typeof import("./getReservedIpBlock").getReservedIpBlockOutput = null as any;
utilities.lazyLoad(exports, ["getReservedIpBlock","getReservedIpBlockOutput"], () => require("./getReservedIpBlock"));

export { GetSpotMarketPriceArgs, GetSpotMarketPriceResult, GetSpotMarketPriceOutputArgs } from "./getSpotMarketPrice";
export const getSpotMarketPrice: typeof import("./getSpotMarketPrice").getSpotMarketPrice = null as any;
export const getSpotMarketPriceOutput: typeof import("./getSpotMarketPrice").getSpotMarketPriceOutput = null as any;
utilities.lazyLoad(exports, ["getSpotMarketPrice","getSpotMarketPriceOutput"], () => require("./getSpotMarketPrice"));

export { GetSpotMarketRequestArgs, GetSpotMarketRequestResult, GetSpotMarketRequestOutputArgs } from "./getSpotMarketRequest";
export const getSpotMarketRequest: typeof import("./getSpotMarketRequest").getSpotMarketRequest = null as any;
export const getSpotMarketRequestOutput: typeof import("./getSpotMarketRequest").getSpotMarketRequestOutput = null as any;
utilities.lazyLoad(exports, ["getSpotMarketRequest","getSpotMarketRequestOutput"], () => require("./getSpotMarketRequest"));

export { GetVirtualCircuitArgs, GetVirtualCircuitResult, GetVirtualCircuitOutputArgs } from "./getVirtualCircuit";
export const getVirtualCircuit: typeof import("./getVirtualCircuit").getVirtualCircuit = null as any;
export const getVirtualCircuitOutput: typeof import("./getVirtualCircuit").getVirtualCircuitOutput = null as any;
utilities.lazyLoad(exports, ["getVirtualCircuit","getVirtualCircuitOutput"], () => require("./getVirtualCircuit"));

export { GetVlanArgs, GetVlanResult, GetVlanOutputArgs } from "./getVlan";
export const getVlan: typeof import("./getVlan").getVlan = null as any;
export const getVlanOutput: typeof import("./getVlan").getVlanOutput = null as any;
utilities.lazyLoad(exports, ["getVlan","getVlanOutput"], () => require("./getVlan"));

export { GetVrfArgs, GetVrfResult, GetVrfOutputArgs } from "./getVrf";
export const getVrf: typeof import("./getVrf").getVrf = null as any;
export const getVrfOutput: typeof import("./getVrf").getVrfOutput = null as any;
utilities.lazyLoad(exports, ["getVrf","getVrfOutput"], () => require("./getVrf"));

export { IpAttachmentArgs, IpAttachmentState } from "./ipAttachment";
export type IpAttachment = import("./ipAttachment").IpAttachment;
export const IpAttachment: typeof import("./ipAttachment").IpAttachment = null as any;
utilities.lazyLoad(exports, ["IpAttachment"], () => require("./ipAttachment"));

export { OrganizationArgs, OrganizationState } from "./organization";
export type Organization = import("./organization").Organization;
export const Organization: typeof import("./organization").Organization = null as any;
utilities.lazyLoad(exports, ["Organization"], () => require("./organization"));

export { OrganizationMemberArgs, OrganizationMemberState } from "./organizationMember";
export type OrganizationMember = import("./organizationMember").OrganizationMember;
export const OrganizationMember: typeof import("./organizationMember").OrganizationMember = null as any;
utilities.lazyLoad(exports, ["OrganizationMember"], () => require("./organizationMember"));

export { PortArgs, PortState } from "./port";
export type Port = import("./port").Port;
export const Port: typeof import("./port").Port = null as any;
utilities.lazyLoad(exports, ["Port"], () => require("./port"));

export { PortVlanAttachmentArgs, PortVlanAttachmentState } from "./portVlanAttachment";
export type PortVlanAttachment = import("./portVlanAttachment").PortVlanAttachment;
export const PortVlanAttachment: typeof import("./portVlanAttachment").PortVlanAttachment = null as any;
utilities.lazyLoad(exports, ["PortVlanAttachment"], () => require("./portVlanAttachment"));

export { ProjectArgs, ProjectState } from "./project";
export type Project = import("./project").Project;
export const Project: typeof import("./project").Project = null as any;
utilities.lazyLoad(exports, ["Project"], () => require("./project"));

export { ProjectApiKeyArgs, ProjectApiKeyState } from "./projectApiKey";
export type ProjectApiKey = import("./projectApiKey").ProjectApiKey;
export const ProjectApiKey: typeof import("./projectApiKey").ProjectApiKey = null as any;
utilities.lazyLoad(exports, ["ProjectApiKey"], () => require("./projectApiKey"));

export { ProjectSshKeyArgs, ProjectSshKeyState } from "./projectSshKey";
export type ProjectSshKey = import("./projectSshKey").ProjectSshKey;
export const ProjectSshKey: typeof import("./projectSshKey").ProjectSshKey = null as any;
utilities.lazyLoad(exports, ["ProjectSshKey"], () => require("./projectSshKey"));

export { ReservedIpBlockArgs, ReservedIpBlockState } from "./reservedIpBlock";
export type ReservedIpBlock = import("./reservedIpBlock").ReservedIpBlock;
export const ReservedIpBlock: typeof import("./reservedIpBlock").ReservedIpBlock = null as any;
utilities.lazyLoad(exports, ["ReservedIpBlock"], () => require("./reservedIpBlock"));

export { SpotMarketRequestArgs, SpotMarketRequestState } from "./spotMarketRequest";
export type SpotMarketRequest = import("./spotMarketRequest").SpotMarketRequest;
export const SpotMarketRequest: typeof import("./spotMarketRequest").SpotMarketRequest = null as any;
utilities.lazyLoad(exports, ["SpotMarketRequest"], () => require("./spotMarketRequest"));

export { SshKeyArgs, SshKeyState } from "./sshKey";
export type SshKey = import("./sshKey").SshKey;
export const SshKey: typeof import("./sshKey").SshKey = null as any;
utilities.lazyLoad(exports, ["SshKey"], () => require("./sshKey"));

export { UserApiKeyArgs, UserApiKeyState } from "./userApiKey";
export type UserApiKey = import("./userApiKey").UserApiKey;
export const UserApiKey: typeof import("./userApiKey").UserApiKey = null as any;
utilities.lazyLoad(exports, ["UserApiKey"], () => require("./userApiKey"));

export { VirtualCircuitArgs, VirtualCircuitState } from "./virtualCircuit";
export type VirtualCircuit = import("./virtualCircuit").VirtualCircuit;
export const VirtualCircuit: typeof import("./virtualCircuit").VirtualCircuit = null as any;
utilities.lazyLoad(exports, ["VirtualCircuit"], () => require("./virtualCircuit"));

export { VlanArgs, VlanState } from "./vlan";
export type Vlan = import("./vlan").Vlan;
export const Vlan: typeof import("./vlan").Vlan = null as any;
utilities.lazyLoad(exports, ["Vlan"], () => require("./vlan"));

export { VrfArgs, VrfState } from "./vrf";
export type Vrf = import("./vrf").Vrf;
export const Vrf: typeof import("./vrf").Vrf = null as any;
utilities.lazyLoad(exports, ["Vrf"], () => require("./vrf"));


// Export enums:
export * from "../types/enums/metal";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "equinix:metal/bgpSession:BgpSession":
                return new BgpSession(name, <any>undefined, { urn })
            case "equinix:metal/connection:Connection":
                return new Connection(name, <any>undefined, { urn })
            case "equinix:metal/device:Device":
                return new Device(name, <any>undefined, { urn })
            case "equinix:metal/deviceNetworkType:DeviceNetworkType":
                return new DeviceNetworkType(name, <any>undefined, { urn })
            case "equinix:metal/gateway:Gateway":
                return new Gateway(name, <any>undefined, { urn })
            case "equinix:metal/ipAttachment:IpAttachment":
                return new IpAttachment(name, <any>undefined, { urn })
            case "equinix:metal/organization:Organization":
                return new Organization(name, <any>undefined, { urn })
            case "equinix:metal/organizationMember:OrganizationMember":
                return new OrganizationMember(name, <any>undefined, { urn })
            case "equinix:metal/port:Port":
                return new Port(name, <any>undefined, { urn })
            case "equinix:metal/portVlanAttachment:PortVlanAttachment":
                return new PortVlanAttachment(name, <any>undefined, { urn })
            case "equinix:metal/project:Project":
                return new Project(name, <any>undefined, { urn })
            case "equinix:metal/projectApiKey:ProjectApiKey":
                return new ProjectApiKey(name, <any>undefined, { urn })
            case "equinix:metal/projectSshKey:ProjectSshKey":
                return new ProjectSshKey(name, <any>undefined, { urn })
            case "equinix:metal/reservedIpBlock:ReservedIpBlock":
                return new ReservedIpBlock(name, <any>undefined, { urn })
            case "equinix:metal/spotMarketRequest:SpotMarketRequest":
                return new SpotMarketRequest(name, <any>undefined, { urn })
            case "equinix:metal/sshKey:SshKey":
                return new SshKey(name, <any>undefined, { urn })
            case "equinix:metal/userApiKey:UserApiKey":
                return new UserApiKey(name, <any>undefined, { urn })
            case "equinix:metal/virtualCircuit:VirtualCircuit":
                return new VirtualCircuit(name, <any>undefined, { urn })
            case "equinix:metal/vlan:Vlan":
                return new Vlan(name, <any>undefined, { urn })
            case "equinix:metal/vrf:Vrf":
                return new Vrf(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("equinix", "metal/bgpSession", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/connection", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/device", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/deviceNetworkType", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/gateway", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/ipAttachment", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/organization", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/organizationMember", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/port", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/portVlanAttachment", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/project", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/projectApiKey", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/projectSshKey", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/reservedIpBlock", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/spotMarketRequest", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/sshKey", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/userApiKey", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/virtualCircuit", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/vlan", _module)
pulumi.runtime.registerResourceModule("equinix", "metal/vrf", _module)
