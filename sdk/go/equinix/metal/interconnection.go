// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package metal

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to request the creation an Interconnection asset to connect with other parties using [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/).
//
// > Equinix Metal connection with with Service Token A-side / Z-side (service_token_type) is not generally available and may not be enabled yet for your organization.
//
// ## Example Usage
// ### example fabric billed token
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			projectId := cfg.Require("projectId")
//			metro := "SV"
//			if param := cfg.Get("metro"); param != "" {
//				metro = param
//			}
//			speedInMbps := 200
//			if param := cfg.GetInt("speedInMbps"); param != 0 {
//				speedInMbps = param
//			}
//			connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
//				Name:             pulumi.String("fabric-port-to-metal"),
//				ProjectId:        pulumi.String(projectId),
//				Type:             pulumi.String("shared"),
//				Redundancy:       pulumi.String("primary"),
//				Metro:            pulumi.String(metro),
//				Speed:            pulumi.Sprintf("%vMbps", speedInMbps),
//				ServiceTokenType: pulumi.String("z_side"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("connectionStatus", connection.Status)
//			ctx.Export("connectionTokens", connection.ServiceTokens)
//			return nil
//		})
//	}
//
// ```
// ### example metal billed token
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			projectId := cfg.Require("projectId")
//			metro := "SV"
//			if param := cfg.Get("metro"); param != "" {
//				metro = param
//			}
//			speedInMbps := 1000
//			if param := cfg.GetInt("speedInMbps"); param != 0 {
//				speedInMbps = param
//			}
//			connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
//				Name:             pulumi.String("metal-to-cloudprovider"),
//				ProjectId:        pulumi.String(projectId),
//				Type:             pulumi.String("shared"),
//				Redundancy:       pulumi.String("primary"),
//				Metro:            pulumi.String(metro),
//				Speed:            pulumi.Sprintf("%vMbps", speedInMbps),
//				ServiceTokenType: pulumi.String("a_side"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("connectionStatus", connection.Status)
//			ctx.Export("connectionTokens", connection.ServiceTokens)
//			return nil
//		})
//	}
//
// ```
type Interconnection struct {
	pulumi.CustomResourceState

	// Fabric Authorization code to configure the Metal-Fabric Integration connection with Cloud Service Provider through Equinix Fabric with the fabric.Connection resource from the [Equinix Developer Portal](https://developer.equinix.com/dev-docs/fabric/getting-started/fabric-v4-apis/connect-metal-to-amazon-web-services).
	AuthorizationCode pulumi.StringOutput `pulumi:"authorizationCode"`
	// The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
	ContactEmail pulumi.StringOutput `pulumi:"contactEmail"`
	// Description for the connection resource.
	Description pulumi.StringOutput `pulumi:"description"`
	// Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility. For more information, read the migration guide.
	Facility pulumi.StringOutput `pulumi:"facility"`
	// Metro where the connection will be created.
	Metro pulumi.StringOutput `pulumi:"metro"`
	// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// Name of the connection resource
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the organization where the connection is scoped to.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the metal.Interconnection datasource.
	Ports InterconnectionPortArrayOutput `pulumi:"ports"`
	// ID of the project where the connection is scoped to, must be set for.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Connection redundancy - redundant or primary.
	Redundancy pulumi.StringOutput `pulumi:"redundancy"`
	// Only used with shared connection. Type of service token to use for the connection, aSide or z_side
	ServiceTokenType pulumi.StringPtrOutput `pulumi:"serviceTokenType"`
	// List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of serviceToken is described in documentation of the metal.Interconnection datasource.
	ServiceTokens InterconnectionServiceTokenArrayOutput `pulumi:"serviceTokens"`
	// Connection speed - Values must be in the format '<number>Mbps' or '<number>Gpbs', for example '100Mbps' or '50Gbps'. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
	Speed pulumi.StringOutput `pulumi:"speed"`
	// Status of the connection resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// String list of tags.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `serviceTokens` instead.
	//
	// Deprecated: If your organization already has connection service tokens enabled, use `serviceTokens` instead
	Token pulumi.StringOutput `pulumi:"token"`
	// Connection type - dedicated or shared.
	Type pulumi.StringOutput `pulumi:"type"`
	// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
	Vlans pulumi.IntArrayOutput `pulumi:"vlans"`
	// Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
	// connection
	Vrfs pulumi.StringArrayOutput `pulumi:"vrfs"`
}

// NewInterconnection registers a new resource with the given unique name, arguments, and options.
func NewInterconnection(ctx *pulumi.Context,
	name string, args *InterconnectionArgs, opts ...pulumi.ResourceOption) (*Interconnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Redundancy == nil {
		return nil, errors.New("invalid value for required argument 'Redundancy'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Interconnection
	err := ctx.RegisterResource("equinix:metal/interconnection:Interconnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInterconnection gets an existing Interconnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInterconnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InterconnectionState, opts ...pulumi.ResourceOption) (*Interconnection, error) {
	var resource Interconnection
	err := ctx.ReadResource("equinix:metal/interconnection:Interconnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Interconnection resources.
type interconnectionState struct {
	// Fabric Authorization code to configure the Metal-Fabric Integration connection with Cloud Service Provider through Equinix Fabric with the fabric.Connection resource from the [Equinix Developer Portal](https://developer.equinix.com/dev-docs/fabric/getting-started/fabric-v4-apis/connect-metal-to-amazon-web-services).
	AuthorizationCode *string `pulumi:"authorizationCode"`
	// The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
	ContactEmail *string `pulumi:"contactEmail"`
	// Description for the connection resource.
	Description *string `pulumi:"description"`
	// Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility. For more information, read the migration guide.
	Facility *string `pulumi:"facility"`
	// Metro where the connection will be created.
	Metro *string `pulumi:"metro"`
	// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
	Mode *string `pulumi:"mode"`
	// Name of the connection resource
	Name *string `pulumi:"name"`
	// ID of the organization where the connection is scoped to.
	OrganizationId *string `pulumi:"organizationId"`
	// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the metal.Interconnection datasource.
	Ports []InterconnectionPort `pulumi:"ports"`
	// ID of the project where the connection is scoped to, must be set for.
	ProjectId *string `pulumi:"projectId"`
	// Connection redundancy - redundant or primary.
	Redundancy *string `pulumi:"redundancy"`
	// Only used with shared connection. Type of service token to use for the connection, aSide or z_side
	ServiceTokenType *string `pulumi:"serviceTokenType"`
	// List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of serviceToken is described in documentation of the metal.Interconnection datasource.
	ServiceTokens []InterconnectionServiceToken `pulumi:"serviceTokens"`
	// Connection speed - Values must be in the format '<number>Mbps' or '<number>Gpbs', for example '100Mbps' or '50Gbps'. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
	Speed *string `pulumi:"speed"`
	// Status of the connection resource.
	Status *string `pulumi:"status"`
	// String list of tags.
	Tags []string `pulumi:"tags"`
	// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `serviceTokens` instead.
	//
	// Deprecated: If your organization already has connection service tokens enabled, use `serviceTokens` instead
	Token *string `pulumi:"token"`
	// Connection type - dedicated or shared.
	Type *string `pulumi:"type"`
	// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
	Vlans []int `pulumi:"vlans"`
	// Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
	// connection
	Vrfs []string `pulumi:"vrfs"`
}

type InterconnectionState struct {
	// Fabric Authorization code to configure the Metal-Fabric Integration connection with Cloud Service Provider through Equinix Fabric with the fabric.Connection resource from the [Equinix Developer Portal](https://developer.equinix.com/dev-docs/fabric/getting-started/fabric-v4-apis/connect-metal-to-amazon-web-services).
	AuthorizationCode pulumi.StringPtrInput
	// The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
	ContactEmail pulumi.StringPtrInput
	// Description for the connection resource.
	Description pulumi.StringPtrInput
	// Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility. For more information, read the migration guide.
	Facility pulumi.StringPtrInput
	// Metro where the connection will be created.
	Metro pulumi.StringPtrInput
	// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
	Mode pulumi.StringPtrInput
	// Name of the connection resource
	Name pulumi.StringPtrInput
	// ID of the organization where the connection is scoped to.
	OrganizationId pulumi.StringPtrInput
	// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the metal.Interconnection datasource.
	Ports InterconnectionPortArrayInput
	// ID of the project where the connection is scoped to, must be set for.
	ProjectId pulumi.StringPtrInput
	// Connection redundancy - redundant or primary.
	Redundancy pulumi.StringPtrInput
	// Only used with shared connection. Type of service token to use for the connection, aSide or z_side
	ServiceTokenType pulumi.StringPtrInput
	// List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of serviceToken is described in documentation of the metal.Interconnection datasource.
	ServiceTokens InterconnectionServiceTokenArrayInput
	// Connection speed - Values must be in the format '<number>Mbps' or '<number>Gpbs', for example '100Mbps' or '50Gbps'. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
	Speed pulumi.StringPtrInput
	// Status of the connection resource.
	Status pulumi.StringPtrInput
	// String list of tags.
	Tags pulumi.StringArrayInput
	// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `serviceTokens` instead.
	//
	// Deprecated: If your organization already has connection service tokens enabled, use `serviceTokens` instead
	Token pulumi.StringPtrInput
	// Connection type - dedicated or shared.
	Type pulumi.StringPtrInput
	// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
	Vlans pulumi.IntArrayInput
	// Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
	// connection
	Vrfs pulumi.StringArrayInput
}

func (InterconnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*interconnectionState)(nil)).Elem()
}

type interconnectionArgs struct {
	// The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
	ContactEmail *string `pulumi:"contactEmail"`
	// Description for the connection resource.
	Description *string `pulumi:"description"`
	// Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility. For more information, read the migration guide.
	Facility *string `pulumi:"facility"`
	// Metro where the connection will be created.
	Metro *string `pulumi:"metro"`
	// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
	Mode *string `pulumi:"mode"`
	// Name of the connection resource
	Name *string `pulumi:"name"`
	// ID of the organization where the connection is scoped to.
	OrganizationId *string `pulumi:"organizationId"`
	// ID of the project where the connection is scoped to, must be set for.
	ProjectId *string `pulumi:"projectId"`
	// Connection redundancy - redundant or primary.
	Redundancy string `pulumi:"redundancy"`
	// Only used with shared connection. Type of service token to use for the connection, aSide or z_side
	ServiceTokenType *string `pulumi:"serviceTokenType"`
	// Connection speed - Values must be in the format '<number>Mbps' or '<number>Gpbs', for example '100Mbps' or '50Gbps'. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
	Speed *string `pulumi:"speed"`
	// String list of tags.
	Tags []string `pulumi:"tags"`
	// Connection type - dedicated or shared.
	Type string `pulumi:"type"`
	// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
	Vlans []int `pulumi:"vlans"`
	// Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
	// connection
	Vrfs []string `pulumi:"vrfs"`
}

// The set of arguments for constructing a Interconnection resource.
type InterconnectionArgs struct {
	// The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
	ContactEmail pulumi.StringPtrInput
	// Description for the connection resource.
	Description pulumi.StringPtrInput
	// Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
	//
	// Deprecated: Use metro instead of facility. For more information, read the migration guide.
	Facility pulumi.StringPtrInput
	// Metro where the connection will be created.
	Metro pulumi.StringPtrInput
	// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
	Mode pulumi.StringPtrInput
	// Name of the connection resource
	Name pulumi.StringPtrInput
	// ID of the organization where the connection is scoped to.
	OrganizationId pulumi.StringPtrInput
	// ID of the project where the connection is scoped to, must be set for.
	ProjectId pulumi.StringPtrInput
	// Connection redundancy - redundant or primary.
	Redundancy pulumi.StringInput
	// Only used with shared connection. Type of service token to use for the connection, aSide or z_side
	ServiceTokenType pulumi.StringPtrInput
	// Connection speed - Values must be in the format '<number>Mbps' or '<number>Gpbs', for example '100Mbps' or '50Gbps'. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
	Speed pulumi.StringPtrInput
	// String list of tags.
	Tags pulumi.StringArrayInput
	// Connection type - dedicated or shared.
	Type pulumi.StringInput
	// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
	Vlans pulumi.IntArrayInput
	// Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
	// connection
	Vrfs pulumi.StringArrayInput
}

func (InterconnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*interconnectionArgs)(nil)).Elem()
}

type InterconnectionInput interface {
	pulumi.Input

	ToInterconnectionOutput() InterconnectionOutput
	ToInterconnectionOutputWithContext(ctx context.Context) InterconnectionOutput
}

func (*Interconnection) ElementType() reflect.Type {
	return reflect.TypeOf((**Interconnection)(nil)).Elem()
}

func (i *Interconnection) ToInterconnectionOutput() InterconnectionOutput {
	return i.ToInterconnectionOutputWithContext(context.Background())
}

func (i *Interconnection) ToInterconnectionOutputWithContext(ctx context.Context) InterconnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterconnectionOutput)
}

// InterconnectionArrayInput is an input type that accepts InterconnectionArray and InterconnectionArrayOutput values.
// You can construct a concrete instance of `InterconnectionArrayInput` via:
//
//	InterconnectionArray{ InterconnectionArgs{...} }
type InterconnectionArrayInput interface {
	pulumi.Input

	ToInterconnectionArrayOutput() InterconnectionArrayOutput
	ToInterconnectionArrayOutputWithContext(context.Context) InterconnectionArrayOutput
}

type InterconnectionArray []InterconnectionInput

func (InterconnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Interconnection)(nil)).Elem()
}

func (i InterconnectionArray) ToInterconnectionArrayOutput() InterconnectionArrayOutput {
	return i.ToInterconnectionArrayOutputWithContext(context.Background())
}

func (i InterconnectionArray) ToInterconnectionArrayOutputWithContext(ctx context.Context) InterconnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterconnectionArrayOutput)
}

// InterconnectionMapInput is an input type that accepts InterconnectionMap and InterconnectionMapOutput values.
// You can construct a concrete instance of `InterconnectionMapInput` via:
//
//	InterconnectionMap{ "key": InterconnectionArgs{...} }
type InterconnectionMapInput interface {
	pulumi.Input

	ToInterconnectionMapOutput() InterconnectionMapOutput
	ToInterconnectionMapOutputWithContext(context.Context) InterconnectionMapOutput
}

type InterconnectionMap map[string]InterconnectionInput

func (InterconnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Interconnection)(nil)).Elem()
}

func (i InterconnectionMap) ToInterconnectionMapOutput() InterconnectionMapOutput {
	return i.ToInterconnectionMapOutputWithContext(context.Background())
}

func (i InterconnectionMap) ToInterconnectionMapOutputWithContext(ctx context.Context) InterconnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InterconnectionMapOutput)
}

type InterconnectionOutput struct{ *pulumi.OutputState }

func (InterconnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Interconnection)(nil)).Elem()
}

func (o InterconnectionOutput) ToInterconnectionOutput() InterconnectionOutput {
	return o
}

func (o InterconnectionOutput) ToInterconnectionOutputWithContext(ctx context.Context) InterconnectionOutput {
	return o
}

// Fabric Authorization code to configure the Metal-Fabric Integration connection with Cloud Service Provider through Equinix Fabric with the fabric.Connection resource from the [Equinix Developer Portal](https://developer.equinix.com/dev-docs/fabric/getting-started/fabric-v4-apis/connect-metal-to-amazon-web-services).
func (o InterconnectionOutput) AuthorizationCode() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.AuthorizationCode }).(pulumi.StringOutput)
}

// The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
func (o InterconnectionOutput) ContactEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.ContactEmail }).(pulumi.StringOutput)
}

// Description for the connection resource.
func (o InterconnectionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
//
// Deprecated: Use metro instead of facility. For more information, read the migration guide.
func (o InterconnectionOutput) Facility() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Facility }).(pulumi.StringOutput)
}

// Metro where the connection will be created.
func (o InterconnectionOutput) Metro() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Metro }).(pulumi.StringOutput)
}

// Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
func (o InterconnectionOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// Name of the connection resource
func (o InterconnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the organization where the connection is scoped to.
func (o InterconnectionOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the metal.Interconnection datasource.
func (o InterconnectionOutput) Ports() InterconnectionPortArrayOutput {
	return o.ApplyT(func(v *Interconnection) InterconnectionPortArrayOutput { return v.Ports }).(InterconnectionPortArrayOutput)
}

// ID of the project where the connection is scoped to, must be set for.
func (o InterconnectionOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Connection redundancy - redundant or primary.
func (o InterconnectionOutput) Redundancy() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Redundancy }).(pulumi.StringOutput)
}

// Only used with shared connection. Type of service token to use for the connection, aSide or z_side
func (o InterconnectionOutput) ServiceTokenType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringPtrOutput { return v.ServiceTokenType }).(pulumi.StringPtrOutput)
}

// List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of serviceToken is described in documentation of the metal.Interconnection datasource.
func (o InterconnectionOutput) ServiceTokens() InterconnectionServiceTokenArrayOutput {
	return o.ApplyT(func(v *Interconnection) InterconnectionServiceTokenArrayOutput { return v.ServiceTokens }).(InterconnectionServiceTokenArrayOutput)
}

// Connection speed - Values must be in the format '<number>Mbps' or '<number>Gpbs', for example '100Mbps' or '50Gbps'. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
func (o InterconnectionOutput) Speed() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Speed }).(pulumi.StringOutput)
}

// Status of the connection resource.
func (o InterconnectionOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// String list of tags.
func (o InterconnectionOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `serviceTokens` instead.
//
// Deprecated: If your organization already has connection service tokens enabled, use `serviceTokens` instead
func (o InterconnectionOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Token }).(pulumi.StringOutput)
}

// Connection type - dedicated or shared.
func (o InterconnectionOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
func (o InterconnectionOutput) Vlans() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.IntArrayOutput { return v.Vlans }).(pulumi.IntArrayOutput)
}

// Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
// connection
func (o InterconnectionOutput) Vrfs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Interconnection) pulumi.StringArrayOutput { return v.Vrfs }).(pulumi.StringArrayOutput)
}

type InterconnectionArrayOutput struct{ *pulumi.OutputState }

func (InterconnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Interconnection)(nil)).Elem()
}

func (o InterconnectionArrayOutput) ToInterconnectionArrayOutput() InterconnectionArrayOutput {
	return o
}

func (o InterconnectionArrayOutput) ToInterconnectionArrayOutputWithContext(ctx context.Context) InterconnectionArrayOutput {
	return o
}

func (o InterconnectionArrayOutput) Index(i pulumi.IntInput) InterconnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Interconnection {
		return vs[0].([]*Interconnection)[vs[1].(int)]
	}).(InterconnectionOutput)
}

type InterconnectionMapOutput struct{ *pulumi.OutputState }

func (InterconnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Interconnection)(nil)).Elem()
}

func (o InterconnectionMapOutput) ToInterconnectionMapOutput() InterconnectionMapOutput {
	return o
}

func (o InterconnectionMapOutput) ToInterconnectionMapOutputWithContext(ctx context.Context) InterconnectionMapOutput {
	return o
}

func (o InterconnectionMapOutput) MapIndex(k pulumi.StringInput) InterconnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Interconnection {
		return vs[0].(map[string]*Interconnection)[vs[1].(string)]
	}).(InterconnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InterconnectionInput)(nil)).Elem(), &Interconnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*InterconnectionArrayInput)(nil)).Elem(), InterconnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InterconnectionMapInput)(nil)).Elem(), InterconnectionMap{})
	pulumi.RegisterOutputType(InterconnectionOutput{})
	pulumi.RegisterOutputType(InterconnectionArrayOutput{})
	pulumi.RegisterOutputType(InterconnectionMapOutput{})
}
