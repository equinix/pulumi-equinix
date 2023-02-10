// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package equinix

import (
	"fmt"
	"path/filepath"
	"strings"

	"github.com/equinix/pulumi-equinix/provider/pkg/version"
	"github.com/equinix/terraform-provider-equinix/equinix"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	pulumiSchema "github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	equinixPkg = "equinix"
	// modules:
	equinixMod 		= "index" 		// the equinix root module
	fabricMod  		= "Fabric"  	// Equinix Fabric
	metalMod		= "Metal"  		// Equinix Metal
	networkEdgeMod 	= "NetworkEdge"	// Equinix Network Edge

)

var namespaceMap = map[string]string{
	"equinix": "Equinix",
}

// makeEquinixResource
func makeEquinixResource(moduleTitle, mem string) tokens.Type {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	return tfbridge.MakeResource(equinixPkg, moduleName, mem)
}

// makeEquinixDataSource 
func makeEquinixDataSource(moduleTitle, mem string) tokens.ModuleMember {
	moduleName := strings.ToLower(moduleTitle)
	namespaceMap[moduleName] = moduleTitle
	return tfbridge.MakeDataSource(equinixPkg, moduleName, "get"+mem)
}

// makeEquinixType
func makeEquinixType(moduleTitle, typ string) tokens.Type {
	return tfbridge.MakeType(equinixPkg, strings.ToLower(moduleTitle) + "/" + typ, typ)
}

// makeEquinixToken
func makeEquinixToken(moduleTitle, typ string) string {
	return strings.Join([]string{equinixPkg, strings.ToLower(moduleTitle) + "/" + typ, typ}, ":")
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(equinix.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "equinix",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Equinix",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "Equinix",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/equinix/pulumi-equinix",
		Description:       "A Pulumi package for creating and managing equinix cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "equinix", "category/cloud"},
		License:    "Apache-2.0",
		Homepage:   "https://deploy.equinix.com/",
		Repository: "https://github.com/equinix/pulumi-equinix",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "equinix",
		Config:    map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		Resources:            map[string]*tfbridge.ResourceInfo{
			// Equinix Fabric v4
			"equinix_fabric_connection":      {Tok: makeEquinixResource(fabricMod, "Connection")},
			// TODO add equinix_fabric_connection enum fileds
			// 	type //VG_VC, EVPL_VC, EPL_VC, EC_VC, GW_VC, ACCESS_EPL_VC
			// 	a_side/zside.access_point.peering_type --> PRIVATE,MICROSOFT,PUBLIC, MANUAL
			// 	a_side/zside.access_point.type --> COLO, VD, VG, SP, IGW, SUBNET, GW
			// 	a_side/zside.access_point.location.metro_code -->  https://developer.equinix.com/dev-docs/ecp/getting-started/appendix/country-codes
			// 	a_side/zside.access_point.link_protocol.type --> UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
			// 	a_side/zside.access_point.profile.type --> L2_PROFILE, L3_PROFILE, ECIA_PROFILE, ECMC_PROFILE
			// 	a_side.service_token.type --> VC_TOKEN
			// 	notifications.type --> ALL,CONNECTION_APPROVAL,SALES_REP_NOTIFICATIONS, NOTIFICATIONS
			// 
			"equinix_fabric_service_profile": {Tok: makeEquinixResource(fabricMod, "ServiceProfile")},
			// TODO add equinix_fabric_service_profile enum fileds
			// 	type --> L2_PROFILE, L3_PROFILE, ECIA_PROFILE, ECMC_PROFILE
			//	state --> ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
			// 	visibility --> PUBLIC, PRIVATE
			// 	access_point_type_configs.type --> VD, COLO
			// 	notifications.type --> ALL,CONNECTION_APPROVAL,SALES_REP_NOTIFICATIONS, NOTIFICATIONS
			// 
			// Equinix Metal v1
			"equinix_metal_bgp_session":          {Tok: makeEquinixResource(metalMod, "BgpSession")},
			"equinix_metal_connection":           {Tok: makeEquinixResource(metalMod, "Connection")},
			"equinix_metal_device":      		  {
				Tok: makeEquinixResource(metalMod, "Device"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"billing_cycle": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "BillingCycle")},
					},
					"facilities": {
						Elem: &tfbridge.SchemaInfo{
							Type:     "string",
							AltTypes: []tokens.Type{makeEquinixType(metalMod, "Facility")},
						},
					},
					"network_type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "NetworkType")},
					},
					"operating_system": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "OperatingSystem")},
					},
					"plan": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "Plan")},
					},
				},
			},
			"equinix_metal_device_network_type":  {Tok: makeEquinixResource(metalMod, "DeviceNetworkType")},
			"equinix_metal_gateway":      		  {Tok: makeEquinixResource(metalMod, "Gateway")},
			"equinix_metal_ip_attachment":        {Tok: makeEquinixResource(metalMod, "IpAttachment")},
			"equinix_metal_organization":      	  {Tok: makeEquinixResource(metalMod, "Organization")},
			"equinix_metal_organization_member":  {Tok: makeEquinixResource(metalMod, "OrganizationMember")},
			"equinix_metal_port":      			  {Tok: makeEquinixResource(metalMod, "Port")},
			"equinix_metal_port_vlan_attachment": {Tok: makeEquinixResource(metalMod, "PortVlanAttachment")},
			"equinix_metal_project":      		  {Tok: makeEquinixResource(metalMod, "Project")},
			"equinix_metal_project_api_key":      {Tok: makeEquinixResource(metalMod, "ProjectApiKey")},
			"equinix_metal_project_ssh_key":      {Tok: makeEquinixResource(metalMod, "ProjectSshKey")},
			"equinix_metal_reserved_ip_block": {
				Tok: makeEquinixResource(metalMod, "ReservedIpBlock"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"facility": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "Facility")},
					},
					"type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "IpBlockType")},
					},
				},
			},
			"equinix_metal_spot_market_request":  {Tok: makeEquinixResource(metalMod, "SpotMarketRequest")},
			"equinix_metal_ssh_key":      		  {Tok: makeEquinixResource(metalMod, "SshKey")},
			"equinix_metal_user_api_key":      	  {Tok: makeEquinixResource(metalMod, "UserApiKey")},
			"equinix_metal_virtual_circuit":      {Tok: makeEquinixResource(metalMod, "VirtualCircuit")},
			"equinix_metal_vlan":      			  {
				Tok: makeEquinixResource(metalMod, "Vlan"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"facility": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(metalMod, "Facility")},
					},
				},
			},
			"equinix_metal_vrf":      			  {Tok: makeEquinixResource(metalMod, "Vrf")},
			// Network Edge v1
			"equinix_network_acl_template": {Tok: makeEquinixResource(networkEdgeMod, "AclTemplate")},
			// TODO add equinix_network_acl_template enum fileds
			// 	inbound_rule.protocol --> IP, TCP, UDP
			"equinix_network_bgp":     	 	{Tok: makeEquinixResource(networkEdgeMod, "Bgp")},
			"equinix_network_device":       {Tok: makeEquinixResource(networkEdgeMod, "Device")},
			// TODO add equinix_network_device enum fileds
			// 	throughput_unit --> Mbps or Gbps
			"equinix_network_device_link":  {Tok: makeEquinixResource(networkEdgeMod, "DeviceLink")},
			"equinix_network_ssh_key":      {Tok: makeEquinixResource(networkEdgeMod, "SshKey")},
			"equinix_network_ssh_user":     {Tok: makeEquinixResource(networkEdgeMod, "SshUser")},
		},
		ExtraTypes: map[string]pulumiSchema.ComplexTypeSpec{
			makeEquinixToken(metalMod, "BillingCycle"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Value: "hourly", Name: "Hourly"},
					{Value: "monthly", Name: "Monthly"},
				},
			},
			makeEquinixToken(metalMod, "IpBlockType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Value: "global_ipv4", Name: "GlobalIPv4"},
					{Value: "public_ipv4", Name: "PublicIPv4"},
				},
			},
			makeEquinixToken(metalMod, "NetworkType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Value: "layer3", Name: "Layer3"},
					{Value: "layer2-individual", Name: "Layer2Individual"},
					{Value: "layer2-bonded", Name: "Layer2Bonded"},
					{Value: "hybrid", Name: "Hybrid"},
				},
			},
			makeEquinixToken(metalMod, "Plan"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "C2LargeARM", Value: "c2.large.arm"},
					{Name: "C2MediumX86", Value: "c2.medium.x86"},
					{Name: "C1SmallX86", Value: "baremetal_1"},
					{Name: "C1LargeARM", Value: "baremetal_2a"},
					{Name: "C1XLargeX86", Value: "baremetal_3"},
					{Name: "X2XLargeX86", Value: "x2.xlarge.x86"},
					{Name: "X1SmallX86", Value: "baremetal_1e"},
					{Name: "G2LargeX86", Value: "g2.large.x86"},
					{Name: "M2XLargeX86", Value: "m2.xlarge.x86"},
					{Name: "M1XLargeX86", Value: "baremetal_2"},
					{Name: "T1SmallX86", Value: "baremetal_0"},
					{Name: "S1LargeX86", Value: "baremetal_s"},
					{Name: "C3SmallX86", Value: "c3.small.x86"},
					{Name: "C3MediumX86", Value: "c3.medium.x86"},
					{Name: "F3MediumX86", Value: "f3.medium.x86"},
					{Name: "F3LargeX86", Value: "f3.large.x86"},
					{Name: "M3LargeX86", Value: "m3.large.x86"},
					{Name: "S3XLargeX86", Value: "s3.xlarge.x86"},
					{Name: "N2XLargeX86", Value: "n2.xlarge.x86"},
				},
			},
			makeEquinixToken(metalMod, "OperatingSystem"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Alpine3", Value: "alpine_3"},
					{Name: "CentOS6", Value: "centos_6"},
					{Name: "CentOS7", Value: "centos_7"},
					{Name: "CentOS8", Value: "centos_8"},
					{Name: "CoreOSAlpha", Value: "coreos_alpha"},
					{Name: "CoreOSBeta", Value: "coreos_beta"},
					{Name: "CoreOSStable", Value: "coreos_stable"},
					{Name: "CustomIPXE", Value: "custom_ipxe"},
					{Name: "Debian8", Value: "debian_8"},
					{Name: "Debian9", Value: "debian_9"},
					{Name: "Debian10", Value: "debian_10"},
					{Name: "FlatcarAlpha", Value: "flatcar_alpha"},
					{Name: "FlatcarBeta", Value: "flatcar_beta"},
					{Name: "FlatcarEdge", Value: "flatcar_edge"},
					{Name: "FlatcarStable", Value: "flatcar_stable"},
					{Name: "FreeBSD10_4", Value: "freebsd_10_4"},
					{Name: "FreeBSD11_1", Value: "freebsd_11_1"},
					{Name: "FreeBSD11_2", Value: "freebsd_11_2"},
					{Name: "FreeBSD12Testing", Value: "freebsd_12_testing"},
					{Name: "NixOS18_03", Value: "nixos_18_03"},
					{Name: "NixOS19_03", Value: "nixos_19_03"},
					{Name: "OpenSUSE42_3", Value: "opensuse_42_3"},
					{Name: "RancherOS", Value: "rancher"},
					{Name: "RHEL7", Value: "rhel_7"},
					{Name: "RHEL8", Value: "rhel_8"},
					{Name: "ScientificLinux6", Value: "scientific_6"},
					{Name: "SLES12SP3", Value: "suse_sles12_sp3"},
					{Name: "Ubuntu1404", Value: "ubuntu_14_04"},
					{Name: "Ubuntu1604", Value: "ubuntu_16_04"},
					{Name: "Ubuntu1710", Value: "ubuntu_17_10"},
					{Name: "Ubuntu1804", Value: "ubuntu_18_04"},
					{Name: "Ubuntu2004", Value: "ubuntu_20_04"},
					{Name: "Ubuntu2010", Value: "ubuntu_20_10"},
					{Name: "VMWareEsxi6_5", Value: "vmware_esxi_6_5"},
					{Name: "VMWareEsxi6_7", Value: "vmware_esxi_6_7"},
					{Name: "VMWareEsxi7_0", Value: "vmware_esxi_7_0"},
					{Name: "Windows2012R2", Value: "windows_2012_r2"},
					{Name: "Windows2016", Value: "windows_2016"},
					{Name: "Windows2019", Value: "windows_2019"},
				},
			},
			makeEquinixToken(metalMod, "Facility"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Value: "ewr1", Name: "EWR1"},
					{Value: "sjc1", Name: "SJC1"},
					{Value: "dfw1", Name: "DFW1"},
					{Value: "dfw2", Name: "DFW2"},
					{Value: "ams1", Name: "AMS1"},
					{Value: "nrt1", Name: "NRT1"},
					{Value: "sea1", Name: "SEA1"},
					{Value: "lax1", Name: "LAX1"},
					{Value: "ord1", Name: "ORD1"},
					{Value: "atl1", Name: "ATL1"},
					{Value: "iad1", Name: "IAD1"},
					{Value: "sin1", Name: "SIN1"},
					{Value: "hkg1", Name: "HKG1"},
					{Value: "syd1", Name: "SYD1"},
					{Value: "mrs1", Name: "MRS1"},
					{Value: "yyz1", Name: "YYZ1"},
					{Value: "fra2", Name: "FRA2"},
					{Value: "am6", Name: "AM6"},
					{Value: "dc13", Name: "DC13"},
					{Value: "ch3", Name: "CH3"},
					{Value: "da3", Name: "DA3"},
					{Value: "da11", Name: "DA11"},
					{Value: "la4", Name: "LA4"},
					{Value: "ny5", Name: "NY5"},
					{Value: "sg1", Name: "SG1"},
					{Value: "sv15", Name: "SV15"},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Equinix Fabric v4
			"equinix_fabric_connection": 	   {Tok: makeEquinixDataSource(fabricMod, "Connection")},
			"equinix_fabric_ports": 		   {Tok: makeEquinixDataSource(fabricMod, "Ports")},
			"equinix_fabric_service_profile":  {Tok: makeEquinixDataSource(fabricMod, "ServiceProfile")},
			"equinix_fabric_service_profiles": {Tok: makeEquinixDataSource(fabricMod, "ServiceProfiles")},
			// Equinix Metal v1
			"equinix_metal_connection": 		  {Tok: makeEquinixDataSource(metalMod, "Connection")},
			"equinix_metal_device": 			  {Tok: makeEquinixDataSource(metalMod, "Device")},
			"equinix_metal_device_bgp_neighbors": {Tok: makeEquinixDataSource(metalMod, "DeviceBgpNeighbors")},
			"equinix_metal_facility": 			  {Tok: makeEquinixDataSource(metalMod, "Facility")},
			"equinix_metal_gateway": 			  {Tok: makeEquinixDataSource(metalMod, "Gateway")},
			"equinix_metal_hardware_reservation": {Tok: makeEquinixDataSource(metalMod, "HardwareReservation")},
			"equinix_metal_ip_block_ranges":	  {Tok: makeEquinixDataSource(metalMod, "IpBlockRanges")},
			"equinix_metal_metro":				  {Tok: makeEquinixDataSource(metalMod, "Metro")},
			"equinix_metal_operating_system": 	  {Tok: makeEquinixDataSource(metalMod, "OperatingSystem")},
			"equinix_metal_organization": 		  {Tok: makeEquinixDataSource(metalMod, "Organization")},
			"equinix_metal_plans":		 		  {Tok: makeEquinixDataSource(metalMod, "Plans")},
			"equinix_metal_port": 				  {Tok: makeEquinixDataSource(metalMod, "Port")},
			"equinix_metal_precreated_ip_block":  {Tok: makeEquinixDataSource(metalMod, "PrecreatedIpBlock")},
			"equinix_metal_project":			  {Tok: makeEquinixDataSource(metalMod, "Project")},
			"equinix_metal_project_ssh_key": 	  {Tok: makeEquinixDataSource(metalMod, "ProjectSshKey")},
			"equinix_metal_reserved_ip_block": 	  {Tok: makeEquinixDataSource(metalMod, "ReservedIpBlock")},
			"equinix_metal_spot_market_price": 	  {Tok: makeEquinixDataSource(metalMod, "SpotMarketPrice")},
			"equinix_metal_spot_market_request":  {Tok: makeEquinixDataSource(metalMod, "SpotMarketRequest")},
			"equinix_metal_virtual_circuit": 	  {Tok: makeEquinixDataSource(metalMod, "VirtualCircuit")},
			"equinix_metal_vlan": 				  {Tok: makeEquinixDataSource(metalMod, "Vlan")},
			"equinix_metal_vrf": 				  {Tok: makeEquinixDataSource(metalMod, "Vrf")},
			// Network Edge v1
			"equinix_network_account": 		   {Tok: makeEquinixDataSource(networkEdgeMod, "Account")},
			"equinix_network_device": 		   {Tok: makeEquinixDataSource(networkEdgeMod, "Device")},
			"equinix_network_device_platform": {Tok: makeEquinixDataSource(networkEdgeMod, "DevicePlatform")},
			"equinix_network_device_software": {Tok: makeEquinixDataSource(networkEdgeMod, "DeviceSoftware")},
			"equinix_network_device_type":     {Tok: makeEquinixDataSource(networkEdgeMod, "DeviceType")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/equinix",
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			// Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "pulumi_equinix",
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/equinix/pulumi-%[1]s/sdk/", equinixPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				equinixPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			// RootNamespace: "Pulumi",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
		Java: &tfbridge.JavaInfo{
			// BasePackage: "com.pulumi",
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
