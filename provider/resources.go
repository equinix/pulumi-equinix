// Copyright 2016-2024, Pulumi Corporation.
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
	"context"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	equinixShim "github.com/equinix/terraform-provider-equinix/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgeTokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	pulumiSchema "github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/equinix/pulumi-equinix/provider/pkg/version"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	equinixPkg = "equinix"
	// modules:
	equinixMod     = "index"       // the equinix root module
	fabricMod      = "Fabric"      // Equinix Fabric
	networkEdgeMod = "NetworkEdge" // Equinix Network Edge
)

// namespaceMap sets the C# namespace for each module. Modules are listed explicitly because
// computed tokens don't go through makeEquinixResource/makeEquinixDataSource.
var namespaceMap = map[string]string{
	"equinix":                       "Equinix",
	strings.ToLower(fabricMod):      fabricMod,
	strings.ToLower(networkEdgeMod): networkEdgeMod,
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
func makeEquinixType(moduleTitle, res string) tokens.Type {
	return tokens.Type(tokens.ModuleMember(makeEquinixToken(moduleTitle, res)))
}

// makeEquinixToken
func makeEquinixToken(moduleTitle, res string) string {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return strings.Join([]string{equinixPkg, strings.ToLower(moduleTitle) + "/" + fn, res}, ":")
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	upstreamProvider := equinixShim.NewUpstreamProvider(version.Version)
	v2p := shimv2.NewProvider(upstreamProvider.SDKV2Provider)
	p := pfbridge.MuxShimWithDisjointgPF(context.Background(), v2p, upstreamProvider.PluginFrameworkProvider)

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
		// You may host a logo on a domain you control or add an PNG logo (100x100) for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "https://raw.githubusercontent.com/equinix/pulumi-equinix/main/assets/logo.png",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/equinix",
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
		GitHubOrg:        "equinix",
		UpstreamRepoPath: "./upstream",
		Version:          version.Version,
		MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
		DocRules:         &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Config:           map[string]*tfbridge.SchemaInfo{},

		Resources: map[string]*tfbridge.ResourceInfo{
			// Equinix Fabric v4
			"equinix_fabric_connection": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"a_side": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"access_point": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"account": {
												MaxItemsOne: tfbridge.True(),
											},
											"peering_type": {
												Type: "string",
												AltTypes: []tokens.Type{makeEquinixType(fabricMod,
													"AccessPointPeeringType")},
											},
											"type": {
												Type: "string",
												AltTypes: []tokens.Type{makeEquinixType(fabricMod,
													"AccessPointType")},
											},
											"link_protocol": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"type": {
															Type: "string",
															AltTypes: []tokens.Type{makeEquinixType(fabricMod,
																"AccessPointLinkProtocolType")},
														},
													},
												},
											},
											"location": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"metro_code": {
															Type: "string",
															AltTypes: []tokens.Type{makeEquinixType(equinixMod,
																"Metro")},
														},
													},
												},
											},
											"port": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"redundancy": {
															MaxItemsOne: tfbridge.True(),
														},
													},
												},
											},
											"profile": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"type": {
															Type: "string",
															AltTypes: []tokens.Type{makeEquinixType(fabricMod,
																"ProfileType")},
														},
													},
												},
											},
										},
									},
								},
								"additional_info": {
									Name: "additionalInfo",
								},
								"service_token": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"type": {
												Type:     "string",
												AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ServiceTokenType")},
											},
										},
									},
								},
							},
						},
					},
					"notifications": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"type": {
									Type:     "string",
									AltTypes: []tokens.Type{makeEquinixType(fabricMod, "NotificationsType")},
								},
							},
						},
					},
					"type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ConnectionType")},
					},
					"additional_info": {
						Name: "additionalInfo",
					},
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"operation": {
						MaxItemsOne: tfbridge.True(),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"errors": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"additional_info": {
												Name: "additionalInfo",
											},
										},
									},
								},
							},
						},
					},
					"z_side": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"access_point": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"account": {
												MaxItemsOne: tfbridge.True(),
											},
											"peering_type": {
												Type: "string",
												AltTypes: []tokens.Type{makeEquinixType(fabricMod,
													"AccessPointPeeringType")},
											},
											"type": {
												Type:     "string",
												AltTypes: []tokens.Type{makeEquinixType(fabricMod, "AccessPointType")},
											},
											"link_protocol": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"type": {
															Type: "string",
															AltTypes: []tokens.Type{makeEquinixType(fabricMod,
																"AccessPointLinkProtocolType")},
														},
													},
												},
											},
											"location": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"metro_code": {
															Type: "string",
															AltTypes: []tokens.Type{makeEquinixType(equinixMod,
																"Metro")},
														},
													},
												},
											},
											"port": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"redundancy": {
															MaxItemsOne: tfbridge.True(),
														},
													},
												},
											},
											"profile": {
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"type": {
															Type: "string",
															AltTypes: []tokens.Type{makeEquinixType(fabricMod,
																"ProfileType")},
														},
													},
												},
											},
										},
									},
								},
								"additional_info": {
									Name: "additionalInfo",
								},
								"service_token": {
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"type": {
												Type:     "string",
												AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ServiceTokenType")},
											},
										},
									},
								},
							},
						},
					},
				},
			},
			"equinix_fabric_service_profile": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ProfileType")},
					},
					"access_point_type_configs": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"type": {
									Type:     "string",
									AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ProfileAccessPointType")},
								},
							},
						},
					},
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"state": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ProfileState")},
					},
					"visibility": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(fabricMod, "ProfileVisibility")},
					},
					"notifications": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"type": {
									Type:     "string",
									AltTypes: []tokens.Type{makeEquinixType(fabricMod, "NotificationsType")},
								},
							},
						},
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_routing_protocol": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"direct_ipv4": {
						MaxItemsOne: tfbridge.True(),
					},
					"direct_ipv6": {
						MaxItemsOne: tfbridge.True(),
					},
					"bfd": {
						MaxItemsOne: tfbridge.True(),
					},
					"bgp_ipv4": {
						MaxItemsOne: tfbridge.True(),
					},
					"bgp_ipv6": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_network": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
					"operation": {
						MaxItemsOne: tfbridge.True(),
					},
					"change": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			// Network Edge v1
			"equinix_network_acl_template": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"inbound_rule": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"protocol": {
									Type:     "string",
									AltTypes: []tokens.Type{makeEquinixType(networkEdgeMod, "AclRuleProtocolType")},
								},
							},
						},
					},
				},
			},
			"equinix_network_device": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"throughput_unit": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(networkEdgeMod, "ThroughputUnit")},
					},
				},
			},
			"equinix_network_file": {
				Tok: makeEquinixResource(networkEdgeMod, "NetworkFile"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"metro_code": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(equinixMod, "Metro")},
					},
					"process_type": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(networkEdgeMod, "FileType")},
					},
				},
			},
		},
		ExtraTypes: map[string]pulumiSchema.ComplexTypeSpec{
			makeEquinixToken(equinixMod, "Metro"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Amsterdam", Value: "AM"},
					{Name: "Ashburn", Value: "DC"},
					{Name: "Atlanta", Value: "AT"},
					{Name: "Barcelona", Value: "BA"},
					{Name: "Bogota", Value: "BG"},
					{Name: "Bordeaux", Value: "BX"},
					{Name: "Boston", Value: "BO"},
					{Name: "Brussels", Value: "BL"},
					{Name: "Calgary", Value: "CL"},
					{Name: "Canberra", Value: "CA"},
					{Name: "Chicago", Value: "CH"},
					{Name: "Dallas", Value: "DA"},
					{Name: "Denver", Value: "DE"},
					{Name: "Dubai", Value: "DX"},
					{Name: "Dublin", Value: "DB"},
					{Name: "Frankfurt", Value: "FR"},
					{Name: "Geneva", Value: "GV"},
					{Name: "Hamburg", Value: "HH"},
					{Name: "Helsinki", Value: "HE"},
					{Name: "HongKong", Value: "HK"},
					{Name: "Istanbul", Value: "IL"},
					{Name: "Kamloops", Value: "KA"},
					{Name: "Lisbon", Value: "LS"},
					{Name: "London", Value: "LD"},
					{Name: "LosAngeles", Value: "LA"},
					{Name: "Madrid", Value: "MD"},
					{Name: "Manchester", Value: "MA"},
					{Name: "Melbourne", Value: "ME"},
					{Name: "MexicoCity", Value: "MX"},
					{Name: "Miami", Value: "MI"},
					{Name: "Milan", Value: "ML"},
					{Name: "Montreal", Value: "MT"},
					{Name: "Mumbai", Value: "MB"},
					{Name: "Munich", Value: "MU"},
					{Name: "NewYork", Value: "NY"},
					{Name: "Osaka", Value: "OS"},
					{Name: "Paris", Value: "PA"},
					{Name: "Perth", Value: "PE"},
					{Name: "Philadelphia", Value: "PH"},
					{Name: "RioDeJaneiro", Value: "RJ"},
					{Name: "SaoPaulo", Value: "SP"},
					{Name: "Seattle", Value: "SE"},
					{Name: "Seoul", Value: "SL"},
					{Name: "SiliconValley", Value: "SV"},
					{Name: "Singapore", Value: "SG"},
					{Name: "Sofia", Value: "SO"},
					{Name: "Stockholm", Value: "SK"},
					{Name: "Sydney", Value: "SY"},
					{Name: "Tokyo", Value: "TY"},
					{Name: "Toronto", Value: "TR"},
					{Name: "Vancouver", Value: "VA"},
					{Name: "Warsaw", Value: "WA"},
					{Name: "Winnipeg", Value: "WI"},
					{Name: "Zurich", Value: "ZH"},
				},
			},
			makeEquinixToken(fabricMod, "ServiceTokenType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "VCToken", Value: "VC_TOKEN"},
				},
			},
			makeEquinixToken(fabricMod, "AccessPointLinkProtocolType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Untagged", Value: "UNTAGGED"},
					{Name: "Dot1q", Value: "DOT1Q"},
					{Name: "QinQ", Value: "QINQ"},
					{Name: "EVPN_VXLAN", Value: "EVPN_VXLAN"},
				},
			},
			makeEquinixToken(fabricMod, "AccessPointType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Colo", Value: "COLO", Description: "Colocation"},
					{Name: "VD", Value: "VD", Description: "Virtual Device"},
					{Name: "SP", Value: "SP", Description: "Service Profile"},
					{Name: "IGW", Value: "IGW", Description: "Internet Gateway"},
					{Name: "Subnet", Value: "SUBNET", Description: "Subnet"},
					{Name: "GW", Value: "GW", Description: "Gateway"},
					{Name: "Network", Value: "NETWORK", Description: "Network"},
				},
			},
			makeEquinixToken(fabricMod, "AccessPointPeeringType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Private", Value: "PRIVATE"},
					{Name: "Microsoft", Value: "MICROSOFT"},
					{Name: "Public", Value: "PUBLIC"},
				},
			},
			makeEquinixToken(fabricMod, "ConnectionType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "VG", Value: "VG_VC", Description: "Virtual Gateway"},
					{Name: "EVPL", Value: "EVPL_VC", Description: "Ethernet Virtual Private Line"},
					{Name: "EPL", Value: "EPL_VC", Description: "Ethernet Private Line"},
					{Name: "GW", Value: "GW_VC", Description: "Fabric Gateway virtual connection"},
					{Name: "AccessEPL", Value: "ACCESS_EPL_VC",
						Description: "E-access, layer 2 connection between a QINQ port and an EPL port."},
				},
			},
			makeEquinixToken(fabricMod, "NotificationsType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "All", Value: "ALL"},
					{Name: "ConnectionApproval", Value: "CONNECTION_APPROVAL"},
					{Name: "SalesNotifications", Value: "SALES_REP_NOTIFICATIONS"},
					{Name: "Notifications", Value: "NOTIFICATIONS"},
				},
			},
			makeEquinixToken(fabricMod, "ProfileType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "L2Profile", Value: "L2_PROFILE"},
					{Name: "L3Profile", Value: "L3_PROFILE"},
				},
			},
			makeEquinixToken(fabricMod, "ProfileState"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Active", Value: "ACTIVE"},
					{Name: "PendingApproval", Value: "PENDING_APPROVAL"},
					{Name: "Deleted", Value: "DELETED"},
					{Name: "Rejected", Value: "REJECTED"},
				},
			},
			makeEquinixToken(fabricMod, "ProfileVisibility"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Public", Value: "PUBLIC"},
					{Name: "Private", Value: "PRIVATE"},
				},
			},
			makeEquinixToken(fabricMod, "ProfileAccessPointType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Colo", Value: "COLO", Description: "Colocation"},
					{Name: "VD", Value: "VD", Description: "Virtual Device"},
				},
			},
			makeEquinixToken(networkEdgeMod, "AclRuleProtocolType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "IP", Value: "IP"},
					{Name: "TCP", Value: "TCP"},
					{Name: "UDP", Value: "UDP"},
				},
			},
			makeEquinixToken(networkEdgeMod, "ThroughputUnit"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "Mbps", Value: "Mbps"},
					{Name: "Gbps", Value: "Gbps"},
				},
			},
			makeEquinixToken(networkEdgeMod, "FileType"): {
				ObjectTypeSpec: pulumiSchema.ObjectTypeSpec{
					Type: "string",
				},
				Enum: []pulumiSchema.EnumValueSpec{
					{Name: "License", Value: "LICENSE"},
					{Name: "CloudInit", Value: "CLOUD_INIT"},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Equinix Fabric v4
			"equinix_fabric_connection": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"a_side": {
						MaxItemsOne: tfbridge.True(),
					},
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"additional_info": {
						Name: "additionalInfo",
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"operation": {
						MaxItemsOne: tfbridge.True(),
					},
					"order": {
						MaxItemsOne: tfbridge.True(),
					},
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
					"redundancy": {
						MaxItemsOne: tfbridge.True(),
					},
					"z_side": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_connections": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"outer_operator": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_port": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"device": {
						MaxItemsOne: tfbridge.True(),
					},
					"encapsulation": {
						MaxItemsOne: tfbridge.True(),
					},
					"location": {
						MaxItemsOne: tfbridge.True(),
					},
					"operation": {
						MaxItemsOne: tfbridge.True(),
					},
					"redundancy": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_ports": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"filters": {
						Name: "filter",
					},
					"data": {
						Name: "data",
					},
				},
			},
			"equinix_fabric_service_profile": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"marketing_info": {
						MaxItemsOne: tfbridge.True(),
					},
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_service_profiles": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"filter": {
						MaxItemsOne: tfbridge.True(),
					},
					"sort": {
						Name: "sort",
					},
					"data": {
						Name: "data",
					},
				},
			},
			"equinix_fabric_cloud_routers": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"sort": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_routing_protocol": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"direct_ipv4": {
						MaxItemsOne: tfbridge.True(),
					},
					"direct_ipv6": {
						MaxItemsOne: tfbridge.True(),
					},
					"bfd": {
						MaxItemsOne: tfbridge.True(),
					},
					"bgp_ipv4": {
						MaxItemsOne: tfbridge.True(),
					},
					"bgp_ipv6": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_network": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
					"operation": {
						MaxItemsOne: tfbridge.True(),
					},
					"change": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_networks": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"outer_operator": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_market_place_subscription": {
				Tok: makeEquinixDataSource(fabricMod, "MarketplaceSubscription"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"trial": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			// Network Edge v1
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@equinix-labs/pulumi-equinix",
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
			RootNamespace: "Pulumi",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: namespaceMap,
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.equinix",
			BuildFiles:  "gradle",
			// The ci-mgmt publish workflow releases the Java SDK with the Gradle Nexus
			// plugin's publishToSonatype task.
			GradleNexusPublishPluginVersion: "2.0.0",
			Dependencies: map[string]string{
				"com.pulumi:pulumi": "1.16.0",
			},
		},
	}

	// MustComputeTokens maps upstream resources and datasources that have no explicit entry in
	// [tfbridge.ProviderInfo.Resources] or [tfbridge.ProviderInfo.DataSources] into Pulumi, e.g.
	// equinix_fabric_foo => equinix:fabric/foo:Foo. Explicit entries always take precedence.
	prov.MustComputeTokens(tfbridgeTokens.MappedModules("equinix_", equinixMod,
		map[string]string{
			"fabric_":  strings.ToLower(fabricMod),
			"network_": strings.ToLower(networkEdgeMod),
		},
		tfbridgeTokens.MakeStandard(equinixPkg)))

	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-equinix/bridge-metadata.json
var metadata []byte
