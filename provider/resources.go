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
	"context"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/equinix/pulumi-equinix/provider/pkg/version"
	equinixShim "github.com/equinix/terraform-provider-equinix/shim"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
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
	equinixMod     = "index"       // the equinix root module
	fabricMod      = "Fabric"      // Equinix Fabric
	networkEdgeMod = "NetworkEdge" // Equinix Network Edge
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
func makeEquinixType(moduleTitle, res string) tokens.Type {
	return tokens.Type(tokens.ModuleMember(makeEquinixToken(moduleTitle, res)))
}

// makeEquinixToken
func makeEquinixToken(moduleTitle, res string) string {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return strings.Join([]string{equinixPkg, strings.ToLower(moduleTitle) + "/" + fn, res}, ":")
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
	upstreamProvider := equinixShim.NewUpstreamProvider(version.Version)
	v2p := shimv2.NewProvider(upstreamProvider.SDKV2Provider,
		shimv2.WithDiffStrategy(shimv2.PlanState),
		shimv2.WithPlanResourceChange(func(s string) bool { return true }),
	)
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
		// You may host a logo on a domain you control or add an SVG logo for your package
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
		GitHubOrg:            "equinix",
		UpstreamRepoPath:     "./upstream",
		Version:              version.Version,
		MetadataInfo:         tfbridge.NewProviderMetadata(metadata),
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		// IgnoreMappings is a list of TF resources and data sources to ignore in mappings errors

		// See pulumi/pulumi-aws#2880
		SkipValidateProviderConfigForPluginFramework: true,

		IgnoreMappings: []string{
			"equinix_ecx_l2_connection",          // to be deprecated in terraform. Use equinix_fabric_connection
			"equinix_ecx_l2_connection_accepter", // deprecated in terraform
			"equinix_ecx_l2_serviceprofile",      // to be deprecated in tf. Use equinix_fabric_service_profile
			"equinix_ecx_l2_sellerprofile",       // to be deprecated in tf. Use equinix_fabric_service_profile ds
			"equinix_ecx_l2_sellerprofiles",      // to be deprecated in tf. Use equinix_fabric_service_profiles ds
			"equinix_ecx_port",                   // to be deprecated in tf. Use equinix_fabric_port ds
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			// Equinix Fabric v4
			"equinix_fabric_service_token": {
				Tok: makeEquinixResource(fabricMod, "ServiceToken"),
			},
			"equinix_fabric_connection_route_filter": {
				Tok: makeEquinixResource(fabricMod, "ConnectionRouteFilter"),
			},
			"equinix_fabric_stream": {
				Tok: makeEquinixResource(fabricMod, "Stream"),
			},
			"equinix_fabric_stream_attachment": {
				Tok: makeEquinixResource(fabricMod, "StreamAttachment"),
			},
			"equinix_fabric_stream_subscription": {
				Tok: makeEquinixResource(fabricMod, "StreamSubscription"),
			},
			"equinix_fabric_stream_alert_rule": {
				Tok: makeEquinixResource(fabricMod, "StreamAlertRule"),
			},
			"equinix_fabric_port": {
				Tok: makeEquinixResource(fabricMod, "Port"),
			},
			"equinix_fabric_route_filter": {
				Tok: makeEquinixResource(fabricMod, "RouteFilter"),
			},
			"equinix_fabric_route_filter_rule": {
				Tok: makeEquinixResource(fabricMod, "RouteFilterRule"),
			},
			"equinix_fabric_route_aggregation": {
				Tok: makeEquinixResource(fabricMod, "RouteAggregation"),
			},
			"equinix_fabric_route_aggregation_rule": {
				Tok: makeEquinixResource(fabricMod, "RouteAggregationRule"),
			},
			"equinix_fabric_connection_route_aggregation": {
				Tok: makeEquinixResource(fabricMod, "ConnectionRouteAggregation"),
			},
			"equinix_fabric_precision_time_service": {
				Tok: makeEquinixResource(fabricMod, "PrecisionTimeService"),
			},
			"equinix_fabric_connection": {
				Tok: makeEquinixResource(fabricMod, "Connection"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
				Fields: map[string]*tfbridge.SchemaInfo{
					"a_side": {
						MaxItemsOne: tfbridge.True(),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"access_point": {
									MaxItemsOne: tfbridge.True(),
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
											"gateway": {
												MaxItemsOne: tfbridge.True(),
											},
											"interface": {
												MaxItemsOne: tfbridge.True(),
											},
											"link_protocol": {
												MaxItemsOne: tfbridge.True(),
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
												MaxItemsOne: tfbridge.True(),
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
												MaxItemsOne: tfbridge.True(),
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"redundancy": {
															MaxItemsOne: tfbridge.True(),
														},
													},
												},
											},
											"profile": {
												MaxItemsOne: tfbridge.True(),
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
											"virtual_device": {
												MaxItemsOne: tfbridge.True(),
											},
										},
									},
								},
								"additional_info": {
									Name: "additionalInfo",
								},
								"service_token": {
									MaxItemsOne: tfbridge.True(),
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
					"order": {
						MaxItemsOne: tfbridge.True(),
					},
					"redundancy": {
						MaxItemsOne: tfbridge.True(),
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
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
					"z_side": {
						MaxItemsOne: tfbridge.True(),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"access_point": {
									MaxItemsOne: tfbridge.True(),
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
											"gateway": {
												MaxItemsOne: tfbridge.True(),
											},
											"interface": {
												MaxItemsOne: tfbridge.True(),
											},
											"link_protocol": {
												MaxItemsOne: tfbridge.True(),
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
												MaxItemsOne: tfbridge.True(),
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
												MaxItemsOne: tfbridge.True(),
												Elem: &tfbridge.SchemaInfo{
													Fields: map[string]*tfbridge.SchemaInfo{
														"redundancy": {
															MaxItemsOne: tfbridge.True(),
														},
													},
												},
											},
											"profile": {
												MaxItemsOne: tfbridge.True(),
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
											"virtual_device": {
												MaxItemsOne: tfbridge.True(),
											},
										},
									},
								},
								"additional_info": {
									Name: "additionalInfo",
								},
								"service_token": {
									MaxItemsOne: tfbridge.True(),
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
				Tok: makeEquinixResource(fabricMod, "ServiceProfile"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
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
								"api_config": {
									MaxItemsOne: tfbridge.True(),
								},
								"authentication_key": {
									MaxItemsOne: tfbridge.True(),
								},
								"link_protocol_config": {
									MaxItemsOne: tfbridge.True(),
								},
							},
						},
					},
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"marketing_info": {
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
					"virtual_devices": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"location": {
									MaxItemsOne: tfbridge.True(),
								},
							},
						},
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_cloud_router": {
				Tok: makeEquinixResource(fabricMod, "CloudRouter"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
			},
			"equinix_fabric_routing_protocol": {
				Tok: makeEquinixResource(fabricMod, "RoutingProtocol"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
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
				Tok: makeEquinixResource(fabricMod, "Network"),
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
				Tok: makeEquinixResource(networkEdgeMod, "AclTemplate"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
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
			"equinix_network_bgp": {
				Tok: makeEquinixResource(networkEdgeMod, "Bgp"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
			},
			"equinix_network_device": {
				Tok: makeEquinixResource(networkEdgeMod, "Device"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
				Fields: map[string]*tfbridge.SchemaInfo{
					"throughput_unit": {
						Type:     "string",
						AltTypes: []tokens.Type{makeEquinixType(networkEdgeMod, "ThroughputUnit")},
					},
				},
			},
			"equinix_network_device_link": {
				Tok: makeEquinixResource(networkEdgeMod, "DeviceLink"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
			},
			"equinix_network_ssh_key": {
				Tok: makeEquinixResource(networkEdgeMod, "SshKey"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
			},
			"equinix_network_ssh_user": {
				Tok: makeEquinixResource(networkEdgeMod, "SshUser"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
			},
			"equinix_network_file": {
				Tok: makeEquinixResource(networkEdgeMod, "NetworkFile"),
				Docs: &tfbridge.DocInfo{
					ReplaceExamplesSection: true,
				},
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
			"equinix_fabric_service_token": {
				Tok: makeEquinixDataSource(fabricMod, "ServiceToken"),
			},
			"equinix_fabric_service_tokens": {
				Tok: makeEquinixDataSource(fabricMod, "ServiceTokens"),
			},
			"equinix_fabric_metro": {
				Tok: makeEquinixDataSource(fabricMod, "Metro"),
			},
			"equinix_fabric_metros": {
				Tok: makeEquinixDataSource(fabricMod, "Metros"),
			},
			"equinix_fabric_stream": {
				Tok: makeEquinixDataSource(fabricMod, "Stream"),
			},
			"equinix_fabric_streams": {
				Tok: makeEquinixDataSource(fabricMod, "Streams"),
			},
			"equinix_fabric_stream_attachment": {
				Tok: makeEquinixDataSource(fabricMod, "StreamAttachment"),
			},
			"equinix_fabric_stream_attachments": {
				Tok: makeEquinixDataSource(fabricMod, "StreamAttachments"),
			},
			"equinix_fabric_stream_subscription": {
				Tok: makeEquinixDataSource(fabricMod, "StreamSubscription"),
			},
			"equinix_fabric_stream_subscriptions": {
				Tok: makeEquinixDataSource(fabricMod, "StreamSubscriptions"),
			},
			"equinix_fabric_stream_alert_rule": {
				Tok: makeEquinixDataSource(fabricMod, "StreamAlertRule"),
			},
			"equinix_fabric_stream_alert_rules": {
				Tok: makeEquinixDataSource(fabricMod, "StreamAlertRules"),
			},
			"equinix_fabric_connection_route_filter": {
				Tok: makeEquinixDataSource(fabricMod, "ConnectionRouteFilter"),
			},
			"equinix_fabric_connection_route_filters": {
				Tok: makeEquinixDataSource(fabricMod, "ConnectionRouteFilters"),
			},
			"equinix_fabric_received_routes": {
				Tok: makeEquinixDataSource(fabricMod, "ReceivedRoutes"),
			},
			"equinix_fabric_advertised_routes": {
				Tok: makeEquinixDataSource(fabricMod, "AdvertisedRoutes"),
			},
			"equinix_fabric_route_filter": {
				Tok: makeEquinixDataSource(fabricMod, "RouteFilter"),
			},
			"equinix_fabric_route_filters": {
				Tok: makeEquinixDataSource(fabricMod, "RouteFilters"),
			},
			"equinix_fabric_route_filter_rule": {
				Tok: makeEquinixDataSource(fabricMod, "RouteFilterRule"),
			},
			"equinix_fabric_route_filter_rules": {
				Tok: makeEquinixDataSource(fabricMod, "RouteFilterRules"),
			},
			"equinix_fabric_route_aggregation": {
				Tok: makeEquinixDataSource(fabricMod, "RouteAggregation"),
			},
			"equinix_fabric_route_aggregations": {
				Tok: makeEquinixDataSource(fabricMod, "RouteAggregations"),
			},
			"equinix_fabric_route_aggregation_rule": {
				Tok: makeEquinixDataSource(fabricMod, "RouteAggregationRule"),
			},
			"equinix_fabric_route_aggregation_rules": {
				Tok: makeEquinixDataSource(fabricMod, "RouteAggregationRules"),
			},
			"equinix_fabric_connection_route_aggregation": {
				Tok: makeEquinixDataSource(fabricMod, "ConnectionRouteAggregation"),
			},
			"equinix_fabric_connection_route_aggregations": {
				Tok: makeEquinixDataSource(fabricMod, "ConnectionRouteAggregations"),
			},
			"equinix_fabric_precision_time_service": {
				Tok: makeEquinixDataSource(fabricMod, "PrecisionTimeService"),
			},
			"equinix_fabric_precision_time_services": {
				Tok: makeEquinixDataSource(fabricMod, "PrecisionTimeServices"),
			},
			"equinix_fabric_connection": {
				Tok: makeEquinixDataSource(fabricMod, "Connection"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"a_side": {
						MaxItemsOne: tfbridge.True(),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"service_token": {
									MaxItemsOne: tfbridge.True(),
								},
								"access_point": {
									MaxItemsOne: tfbridge.True(),
									Fields: map[string]*tfbridge.SchemaInfo{
										"account": {
											MaxItemsOne: tfbridge.True(),
										},
										"interface": {
											MaxItemsOne: tfbridge.True(),
										},
										"virtual_device": {
											MaxItemsOne: tfbridge.True(),
										},
										"link_protocol": {
											MaxItemsOne: tfbridge.True(),
										},
										"gateway": {
											MaxItemsOne: tfbridge.True(),
										},
										"profile": {
											MaxItemsOne: tfbridge.True(),
											Fields: map[string]*tfbridge.SchemaInfo{
												"access_point_type_configs": {
													Fields: map[string]*tfbridge.SchemaInfo{
														"api_config": {
															MaxItemsOne: tfbridge.True(),
														},
														"authentication_key": {
															MaxItemsOne: tfbridge.True(),
														},
														"link_protocol_config": {
															MaxItemsOne: tfbridge.True(),
														},
													},
												},
											},
										},
										"port": {
											MaxItemsOne: tfbridge.True(),
											Fields: map[string]*tfbridge.SchemaInfo{
												"redundancy": {
													MaxItemsOne: tfbridge.True(),
												},
											},
										},
										"location": {
											MaxItemsOne: tfbridge.True(),
										},
									},
								},
							},
						},
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
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"service_token": {
									MaxItemsOne: tfbridge.True(),
								},
								"access_point": {
									MaxItemsOne: tfbridge.True(),
									Fields: map[string]*tfbridge.SchemaInfo{
										"account": {
											MaxItemsOne: tfbridge.True(),
										},
										"interface": {
											MaxItemsOne: tfbridge.True(),
										},
										"virtual_device": {
											MaxItemsOne: tfbridge.True(),
										},
										"link_protocol": {
											MaxItemsOne: tfbridge.True(),
										},
										"gateway": {
											MaxItemsOne: tfbridge.True(),
										},
										"profile": {
											MaxItemsOne: tfbridge.True(),
											Fields: map[string]*tfbridge.SchemaInfo{
												"access_point_type_configs": {
													Fields: map[string]*tfbridge.SchemaInfo{
														"api_config": {
															MaxItemsOne: tfbridge.True(),
														},
														"authentication_key": {
															MaxItemsOne: tfbridge.True(),
														},
														"link_protocol_config": {
															MaxItemsOne: tfbridge.True(),
														},
													},
												},
											},
										},
										"port": {
											MaxItemsOne: tfbridge.True(),
											Fields: map[string]*tfbridge.SchemaInfo{
												"redundancy": {
													MaxItemsOne: tfbridge.True(),
												},
											},
										},
										"location": {
											MaxItemsOne: tfbridge.True(),
										},
									},
								},
							},
						},
					},
				},
			},
			"equinix_fabric_connections": {
				Tok: makeEquinixDataSource(fabricMod, "Connections"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"data": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"uuid": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"filter": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"property": {
								MaxItemsOne: tfbridge.True(),
							},
							"operator": {
								MaxItemsOne: tfbridge.True(),
							},
							"values": {
								MaxItemsOne: tfbridge.True(),
							},
							"group": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"outer_operator": {
						MaxItemsOne: tfbridge.True(),
					},
					"pagination": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"offset": {
								MaxItemsOne: tfbridge.True(),
							},
							"limit": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"sort": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"direction": {
								MaxItemsOne: tfbridge.True(),
							},
							"property": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
				},
			},
			"equinix_fabric_port": {
				Tok: makeEquinixDataSource(fabricMod, "Port"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"device": {
						MaxItemsOne: tfbridge.True(),
						Fields: map[string]*tfbridge.SchemaInfo{
							"redundancy": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"encapsulation": {
						MaxItemsOne: tfbridge.True(),
					},
					"lag": {
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
				Tok: makeEquinixDataSource(fabricMod, "Ports"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"filters": {
						Name:        "filter",
						MaxItemsOne: tfbridge.True(),
					},
					"data": {
						Name: "data",
						Fields: map[string]*tfbridge.SchemaInfo{
							"account": {
								MaxItemsOne: tfbridge.True(),
							},
							"change_log": {
								MaxItemsOne: tfbridge.True(),
							},
							"device": {
								MaxItemsOne: tfbridge.True(),
								Fields: map[string]*tfbridge.SchemaInfo{
									"redundancy": {
										MaxItemsOne: tfbridge.True(),
									},
								},
							},
							"encapsulation": {
								MaxItemsOne: tfbridge.True(),
							},
							"lag": {
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
				},
			},
			"equinix_fabric_service_profile": {
				Tok: makeEquinixDataSource(fabricMod, "ServiceProfile"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"access_point_type_configs": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"api_config": {
								MaxItemsOne: tfbridge.True(),
							},
							"authentication_key": {
								MaxItemsOne: tfbridge.True(),
							},
							"link_protocol_config": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"account": {
						MaxItemsOne: tfbridge.True(),
					},
					"change_log": {
						MaxItemsOne: tfbridge.True(),
					},
					"marketing_info": {
						MaxItemsOne: tfbridge.True(),
					},
					"ports": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"location": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"project": {
						MaxItemsOne: tfbridge.True(),
					},
				},
			},
			"equinix_fabric_service_profiles": {
				Tok: makeEquinixDataSource(fabricMod, "ServiceProfiles"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"filter": {
						MaxItemsOne: tfbridge.True(),
					},
					"sort": {
						Name: "sort",
					},
					"data": {
						Name: "data",
						Fields: map[string]*tfbridge.SchemaInfo{
							"access_point_type_configs": {
								Fields: map[string]*tfbridge.SchemaInfo{
									"api_config": {
										MaxItemsOne: tfbridge.True(),
									},
									"authentication_key": {
										MaxItemsOne: tfbridge.True(),
									},
									"link_protocol_config": {
										MaxItemsOne: tfbridge.True(),
									},
								},
							},
							"account": {
								MaxItemsOne: tfbridge.True(),
							},
							"change_log": {
								MaxItemsOne: tfbridge.True(),
							},
							"marketing_info": {
								MaxItemsOne: tfbridge.True(),
								Fields: map[string]*tfbridge.SchemaInfo{
									"process_step": {
										MaxItemsOne: tfbridge.True(),
									},
								},
							},
							"ports": {
								Fields: map[string]*tfbridge.SchemaInfo{
									"location": {
										MaxItemsOne: tfbridge.True(),
									},
								},
							},
							"project": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
				},
			},
			"equinix_fabric_cloud_router": {Tok: makeEquinixDataSource(fabricMod, "CloudRouter")},
			"equinix_fabric_cloud_routers": {
				Tok: makeEquinixDataSource(fabricMod, "CloudRouters"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"data": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"uuid": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"filter": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"property": {
								MaxItemsOne: tfbridge.True(),
							},
							"operator": {
								MaxItemsOne: tfbridge.True(),
							},
							"values": {
								MaxItemsOne: tfbridge.True(),
							},
							"or": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"pagination": {
						MaxItemsOne: tfbridge.True(),
						Fields: map[string]*tfbridge.SchemaInfo{
							"offset": {
								MaxItemsOne: tfbridge.True(),
							},
							"limit": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"sort": {
						MaxItemsOne: tfbridge.True(),
						Fields: map[string]*tfbridge.SchemaInfo{
							"direction": {
								MaxItemsOne: tfbridge.True(),
							},
							"property": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
				},
			},
			"equinix_fabric_routing_protocol": {
				Tok: makeEquinixDataSource(fabricMod, "RoutingProtocol"),
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
				Tok: makeEquinixDataSource(fabricMod, "Network"),
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
				Tok: makeEquinixDataSource(fabricMod, "Networks"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"data": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"uuid": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"filter": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"property": {
								MaxItemsOne: tfbridge.True(),
							},
							"operator": {
								MaxItemsOne: tfbridge.True(),
							},
							"values": {
								MaxItemsOne: tfbridge.True(),
							},
							"group": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"outer_operator": {
						MaxItemsOne: tfbridge.True(),
					},
					"pagination": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"offset": {
								MaxItemsOne: tfbridge.True(),
							},
							"limit": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
					"sort": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"direction": {
								MaxItemsOne: tfbridge.True(),
							},
							"property": {
								MaxItemsOne: tfbridge.True(),
							},
						},
					},
				},
			},
			"equinix_fabric_market_place_subscription": {
				Tok: makeEquinixDataSource(fabricMod, "MarketplaceSubscription"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"trial": {
						MaxItemsOne: tfbridge.True(),
					},
					"entitlements": {
						Fields: map[string]*tfbridge.SchemaInfo{
							"asset": {
								MaxItemsOne: tfbridge.True(),
								Fields: map[string]*tfbridge.SchemaInfo{
									"package": {
										MaxItemsOne: tfbridge.True(),
									},
								},
							},
						},
					},
				},
			},
			// Network Edge v1
			"equinix_network_account": {Tok: makeEquinixDataSource(networkEdgeMod, "Account")},
			"equinix_network_device": {
				Tok: makeEquinixDataSource(networkEdgeMod, "Device"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"valid_status_list": {
						Name: "validStatusList",
					},
				},
			},
			"equinix_network_device_platform": {Tok: makeEquinixDataSource(networkEdgeMod, "DevicePlatform")},
			"equinix_network_device_software": {Tok: makeEquinixDataSource(networkEdgeMod, "DeviceSoftware")},
			"equinix_network_device_type":     {Tok: makeEquinixDataSource(networkEdgeMod, "DeviceType")},
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
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}

//go:embed cmd/pulumi-resource-equinix/bridge-metadata.json
var metadata []byte
