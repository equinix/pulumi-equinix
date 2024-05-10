// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			metro := "FR"
//			if param := cfg.Get("metro"); param != "" {
//				metro = param
//			}
//			speedInMbps := 50
//			if param := cfg.GetInt("speedInMbps"); param != 0 {
//				speedInMbps = param
//			}
//			fabricPortName := cfg.Require("fabricPortName")
//			awsRegion := "eu-central-1"
//			if param := cfg.Get("awsRegion"); param != "" {
//				awsRegion = param
//			}
//			awsAccountId := cfg.Require("awsAccountId")
//			serviceProfileId := fabric.GetServiceProfiles(ctx, &fabric.GetServiceProfilesArgs{
//				Filter: fabric.GetServiceProfilesFilter{
//					Property: pulumi.StringRef("/name"),
//					Operator: pulumi.StringRef("="),
//					Values: []string{
//						"AWS Direct Connect",
//					},
//				},
//			}, nil).Data[0].Uuid
//			portId := fabric.GetPorts(ctx, &fabric.GetPortsArgs{
//				Filter: fabric.GetPortsFilter{
//					Name: pulumi.StringRef(fabricPortName),
//				},
//			}, nil).Data[0].Uuid
//			colo2Aws, err := fabric.NewConnection(ctx, "colo2Aws", &fabric.ConnectionArgs{
//				Name: pulumi.String("Pulumi-colo2Aws"),
//				Type: pulumi.String("EVPL_VC"),
//				Notifications: fabric.ConnectionNotificationArray{
//					&fabric.ConnectionNotificationArgs{
//						Type: pulumi.String("ALL"),
//						Emails: pulumi.StringArray{
//							pulumi.String("example@equinix.com"),
//						},
//					},
//				},
//				Bandwidth: pulumi.Int(speedInMbps),
//				Redundancy: &fabric.ConnectionRedundancyArgs{
//					Priority: pulumi.String("PRIMARY"),
//				},
//				ASide: &fabric.ConnectionASideArgs{
//					AccessPoint: &fabric.ConnectionASideAccessPointArgs{
//						Type: pulumi.String("COLO"),
//						Port: &fabric.ConnectionASideAccessPointPortArgs{
//							Uuid: *pulumi.String(portId),
//						},
//						LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
//							Type:    pulumi.String("DOT1Q"),
//							VlanTag: pulumi.Int(1234),
//						},
//					},
//				},
//				ZSide: &fabric.ConnectionZSideArgs{
//					AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
//						Type:              pulumi.String("SP"),
//						AuthenticationKey: pulumi.String(awsAccountId),
//						SellerRegion:      pulumi.String(awsRegion),
//						Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
//							Type: pulumi.String("L2_PROFILE"),
//							Uuid: *pulumi.String(serviceProfileId),
//						},
//						Location: &fabric.ConnectionZSideAccessPointLocationArgs{
//							MetroCode: pulumi.String(metro),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("connectionId", colo2Aws.ID())
//			ctx.Export("connectionStatus", colo2Aws.Operation.ApplyT(func(operation fabric.ConnectionOperation) (*string, error) {
//				return &operation.EquinixStatus, nil
//			}).(pulumi.StringPtrOutput))
//			ctx.Export("connectionProviderStatus", colo2Aws.Operation.ApplyT(func(operation fabric.ConnectionOperation) (*string, error) {
//				return &operation.ProviderStatus, nil
//			}).(pulumi.StringPtrOutput))
//			ctx.Export("awsDirectConnectId", colo2Aws.ZSide.ApplyT(func(zSide fabric.ConnectionZSide) (*string, error) {
//				return &zSide.AccessPoint.ProviderConnectionId, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Requester or Customer side connection configuration object of the multi-segment connection
	ASide ConnectionASideOutput `pulumi:"aSide"`
	// Customer account information that is associated with this connection
	Account ConnectionAccountOutput `pulumi:"account"`
	// Connection additional information
	AdditionalInfo pulumi.MapArrayOutput `pulumi:"additionalInfo"`
	// Connection bandwidth in Mbps
	Bandwidth pulumi.IntOutput `pulumi:"bandwidth"`
	// Captures connection lifecycle change information
	ChangeLog ConnectionChangeLogOutput `pulumi:"changeLog"`
	// Customer-provided connection description
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Connection directionality from the requester point of view
	Direction pulumi.StringOutput `pulumi:"direction"`
	// Connection URI information
	Href pulumi.StringOutput `pulumi:"href"`
	// Connection property derived from access point locations
	IsRemote pulumi.BoolOutput `pulumi:"isRemote"`
	// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications ConnectionNotificationArrayOutput `pulumi:"notifications"`
	// Connection type-specific operational data
	Operation ConnectionOperationOutput `pulumi:"operation"`
	// Order details
	Order ConnectionOrderOutput `pulumi:"order"`
	// Project information
	Project ConnectionProjectOutput `pulumi:"project"`
	// Connection Redundancy Configuration
	Redundancy ConnectionRedundancyPtrOutput `pulumi:"redundancy"`
	// Connection overall state
	State pulumi.StringOutput `pulumi:"state"`
	// Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix-assigned connection identifier
	Uuid pulumi.StringOutput `pulumi:"uuid"`
	// Destination or Provider side connection configuration object of the multi-segment connection
	ZSide ConnectionZSideOutput `pulumi:"zSide"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ASide == nil {
		return nil, errors.New("invalid value for required argument 'ASide'")
	}
	if args.Bandwidth == nil {
		return nil, errors.New("invalid value for required argument 'Bandwidth'")
	}
	if args.Notifications == nil {
		return nil, errors.New("invalid value for required argument 'Notifications'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ZSide == nil {
		return nil, errors.New("invalid value for required argument 'ZSide'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connection
	err := ctx.RegisterResource("equinix:fabric/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("equinix:fabric/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Requester or Customer side connection configuration object of the multi-segment connection
	ASide *ConnectionASide `pulumi:"aSide"`
	// Customer account information that is associated with this connection
	Account *ConnectionAccount `pulumi:"account"`
	// Connection additional information
	AdditionalInfo []map[string]interface{} `pulumi:"additionalInfo"`
	// Connection bandwidth in Mbps
	Bandwidth *int `pulumi:"bandwidth"`
	// Captures connection lifecycle change information
	ChangeLog *ConnectionChangeLog `pulumi:"changeLog"`
	// Customer-provided connection description
	Description *string `pulumi:"description"`
	// Connection directionality from the requester point of view
	Direction *string `pulumi:"direction"`
	// Connection URI information
	Href *string `pulumi:"href"`
	// Connection property derived from access point locations
	IsRemote *bool `pulumi:"isRemote"`
	// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications []ConnectionNotification `pulumi:"notifications"`
	// Connection type-specific operational data
	Operation *ConnectionOperation `pulumi:"operation"`
	// Order details
	Order *ConnectionOrder `pulumi:"order"`
	// Project information
	Project *ConnectionProject `pulumi:"project"`
	// Connection Redundancy Configuration
	Redundancy *ConnectionRedundancy `pulumi:"redundancy"`
	// Connection overall state
	State *string `pulumi:"state"`
	// Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
	Type *string `pulumi:"type"`
	// Equinix-assigned connection identifier
	Uuid *string `pulumi:"uuid"`
	// Destination or Provider side connection configuration object of the multi-segment connection
	ZSide *ConnectionZSide `pulumi:"zSide"`
}

type ConnectionState struct {
	// Requester or Customer side connection configuration object of the multi-segment connection
	ASide ConnectionASidePtrInput
	// Customer account information that is associated with this connection
	Account ConnectionAccountPtrInput
	// Connection additional information
	AdditionalInfo pulumi.MapArrayInput
	// Connection bandwidth in Mbps
	Bandwidth pulumi.IntPtrInput
	// Captures connection lifecycle change information
	ChangeLog ConnectionChangeLogPtrInput
	// Customer-provided connection description
	Description pulumi.StringPtrInput
	// Connection directionality from the requester point of view
	Direction pulumi.StringPtrInput
	// Connection URI information
	Href pulumi.StringPtrInput
	// Connection property derived from access point locations
	IsRemote pulumi.BoolPtrInput
	// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on connection configuration or status changes
	Notifications ConnectionNotificationArrayInput
	// Connection type-specific operational data
	Operation ConnectionOperationPtrInput
	// Order details
	Order ConnectionOrderPtrInput
	// Project information
	Project ConnectionProjectPtrInput
	// Connection Redundancy Configuration
	Redundancy ConnectionRedundancyPtrInput
	// Connection overall state
	State pulumi.StringPtrInput
	// Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
	Type pulumi.StringPtrInput
	// Equinix-assigned connection identifier
	Uuid pulumi.StringPtrInput
	// Destination or Provider side connection configuration object of the multi-segment connection
	ZSide ConnectionZSidePtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Requester or Customer side connection configuration object of the multi-segment connection
	ASide ConnectionASide `pulumi:"aSide"`
	// Connection additional information
	AdditionalInfo []map[string]interface{} `pulumi:"additionalInfo"`
	// Connection bandwidth in Mbps
	Bandwidth int `pulumi:"bandwidth"`
	// Customer-provided connection description
	Description *string `pulumi:"description"`
	// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name *string `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications []ConnectionNotification `pulumi:"notifications"`
	// Order details
	Order *ConnectionOrder `pulumi:"order"`
	// Project information
	Project *ConnectionProject `pulumi:"project"`
	// Connection Redundancy Configuration
	Redundancy *ConnectionRedundancy `pulumi:"redundancy"`
	// Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
	Type string `pulumi:"type"`
	// Destination or Provider side connection configuration object of the multi-segment connection
	ZSide ConnectionZSide `pulumi:"zSide"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Requester or Customer side connection configuration object of the multi-segment connection
	ASide ConnectionASideInput
	// Connection additional information
	AdditionalInfo pulumi.MapArrayInput
	// Connection bandwidth in Mbps
	Bandwidth pulumi.IntInput
	// Customer-provided connection description
	Description pulumi.StringPtrInput
	// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
	Name pulumi.StringPtrInput
	// Preferences for notifications on connection configuration or status changes
	Notifications ConnectionNotificationArrayInput
	// Order details
	Order ConnectionOrderPtrInput
	// Project information
	Project ConnectionProjectPtrInput
	// Connection Redundancy Configuration
	Redundancy ConnectionRedundancyPtrInput
	// Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
	Type pulumi.StringInput
	// Destination or Provider side connection configuration object of the multi-segment connection
	ZSide ConnectionZSideInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

// Requester or Customer side connection configuration object of the multi-segment connection
func (o ConnectionOutput) ASide() ConnectionASideOutput {
	return o.ApplyT(func(v *Connection) ConnectionASideOutput { return v.ASide }).(ConnectionASideOutput)
}

// Customer account information that is associated with this connection
func (o ConnectionOutput) Account() ConnectionAccountOutput {
	return o.ApplyT(func(v *Connection) ConnectionAccountOutput { return v.Account }).(ConnectionAccountOutput)
}

// Connection additional information
func (o ConnectionOutput) AdditionalInfo() pulumi.MapArrayOutput {
	return o.ApplyT(func(v *Connection) pulumi.MapArrayOutput { return v.AdditionalInfo }).(pulumi.MapArrayOutput)
}

// Connection bandwidth in Mbps
func (o ConnectionOutput) Bandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v *Connection) pulumi.IntOutput { return v.Bandwidth }).(pulumi.IntOutput)
}

// Captures connection lifecycle change information
func (o ConnectionOutput) ChangeLog() ConnectionChangeLogOutput {
	return o.ApplyT(func(v *Connection) ConnectionChangeLogOutput { return v.ChangeLog }).(ConnectionChangeLogOutput)
}

// Customer-provided connection description
func (o ConnectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Connection directionality from the requester point of view
func (o ConnectionOutput) Direction() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Direction }).(pulumi.StringOutput)
}

// Connection URI information
func (o ConnectionOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// Connection property derived from access point locations
func (o ConnectionOutput) IsRemote() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.IsRemote }).(pulumi.BoolOutput)
}

// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
func (o ConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on connection configuration or status changes
func (o ConnectionOutput) Notifications() ConnectionNotificationArrayOutput {
	return o.ApplyT(func(v *Connection) ConnectionNotificationArrayOutput { return v.Notifications }).(ConnectionNotificationArrayOutput)
}

// Connection type-specific operational data
func (o ConnectionOutput) Operation() ConnectionOperationOutput {
	return o.ApplyT(func(v *Connection) ConnectionOperationOutput { return v.Operation }).(ConnectionOperationOutput)
}

// Order details
func (o ConnectionOutput) Order() ConnectionOrderOutput {
	return o.ApplyT(func(v *Connection) ConnectionOrderOutput { return v.Order }).(ConnectionOrderOutput)
}

// Project information
func (o ConnectionOutput) Project() ConnectionProjectOutput {
	return o.ApplyT(func(v *Connection) ConnectionProjectOutput { return v.Project }).(ConnectionProjectOutput)
}

// Connection Redundancy Configuration
func (o ConnectionOutput) Redundancy() ConnectionRedundancyPtrOutput {
	return o.ApplyT(func(v *Connection) ConnectionRedundancyPtrOutput { return v.Redundancy }).(ConnectionRedundancyPtrOutput)
}

// Connection overall state
func (o ConnectionOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
func (o ConnectionOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix-assigned connection identifier
func (o ConnectionOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

// Destination or Provider side connection configuration object of the multi-segment connection
func (o ConnectionOutput) ZSide() ConnectionZSideOutput {
	return o.ApplyT(func(v *Connection) ConnectionZSideOutput { return v.ZSide }).(ConnectionZSideOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
