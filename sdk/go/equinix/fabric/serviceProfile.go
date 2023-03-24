// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"errors"
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
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			profile, err := fabric.NewServiceProfile(ctx, "profile", &fabric.ServiceProfileArgs{
//				Name:        pulumi.String("Example Cloud Provider"),
//				Description: pulumi.String("50 to 500 Mbps Hosted Connection to Example Cloud"),
//				Type:        pulumi.String("L2_PROFILE"),
//				AccessPointTypeConfigs: fabric.ServiceProfileAccessPointTypeConfigArray{
//					&fabric.ServiceProfileAccessPointTypeConfigArgs{
//						Type: pulumi.String("COLO"),
//						SupportedBandwidths: pulumi.IntArray{
//							pulumi.Int(50),
//							pulumi.Int(100),
//							pulumi.Int(200),
//							pulumi.Int(500),
//						},
//						AllowRemoteConnections:     pulumi.Bool(true),
//						AllowCustomBandwidth:       pulumi.Bool(false),
//						AllowBandwidthAutoApproval: pulumi.Bool(false),
//						LinkProtocolConfig: &fabric.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs{
//							EncapsulationStrategy: pulumi.String("CTAGED"),
//							ReuseVlanSTag:         pulumi.Bool(false),
//							Encapsulation:         pulumi.String("DOT1Q"),
//						},
//						EnableAutoGenerateServiceKey: pulumi.Bool("false,"),
//						ConnectionRedundancyRequired: pulumi.Bool("false,"),
//						ApiConfig: &fabric.ServiceProfileAccessPointTypeConfigApiConfigArgs{
//							ApiAvailable:     pulumi.Bool(true),
//							IntegrationId:    pulumi.String("Example-Connect-01"),
//							BandwidthFromApi: pulumi.Bool(false),
//						},
//						ConnectionLabel: pulumi.String("Virtual Circuit Name"),
//						AuthenticationKey: &fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs{
//							Required: pulumi.Bool(true),
//							Label:    pulumi.String("Example ACCOUNT ID"),
//						},
//					},
//				},
//				Account: &fabric.ServiceProfileAccountArgs{
//					OrganizationName:       pulumi.String("Example Cloud"),
//					GlobalOrganizationName: pulumi.String("Example Global"),
//				},
//				Metros:     nil,
//				Visibility: pulumi.String("PUBLIC"),
//				MarketingInfo: &fabric.ServiceProfileMarketingInfoArgs{
//					Promotion: pulumi.Bool(true),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("profileId", profile.ID())
//			return nil
//		})
//	}
//
// ```
type ServiceProfile struct {
	pulumi.CustomResourceState

	// Access point config information
	AccessPointTypeConfigs ServiceProfileAccessPointTypeConfigArrayOutput `pulumi:"accessPointTypeConfigs"`
	// Account
	Account ServiceProfileAccountPtrOutput `pulumi:"account"`
	// Array of contact emails
	AllowedEmails pulumi.StringArrayOutput `pulumi:"allowedEmails"`
	// Captures connection lifecycle change information
	ChangeLog ServiceProfileChangeLogOutput `pulumi:"changeLog"`
	// Custom Fields
	CustomFields ServiceProfileCustomFieldArrayOutput `pulumi:"customFields"`
	// User-provided service description
	Description pulumi.StringOutput `pulumi:"description"`
	// Service Profile URI response attribute
	Href pulumi.StringOutput `pulumi:"href"`
	// Marketing Info
	MarketingInfo ServiceProfileMarketingInfoPtrOutput `pulumi:"marketingInfo"`
	// Access point config information
	Metros ServiceProfileMetroArrayOutput `pulumi:"metros"`
	// Customer-assigned service profile name
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications ServiceProfileNotificationArrayOutput `pulumi:"notifications"`
	// Ports
	Ports ServiceProfilePortArrayOutput `pulumi:"ports"`
	// Project information
	Project ServiceProfileProjectPtrOutput `pulumi:"project"`
	// Self Profile
	SelfProfile pulumi.BoolPtrOutput `pulumi:"selfProfile"`
	// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
	State pulumi.StringPtrOutput `pulumi:"state"`
	// Tags attached to the connection
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix assigned service profile identifier
	Uuid pulumi.StringOutput `pulumi:"uuid"`
	// Virtual Devices
	VirtualDevices ServiceProfileVirtualDeviceArrayOutput `pulumi:"virtualDevices"`
	// Service profile visibility - PUBLIC, PRIVATE
	Visibility pulumi.StringPtrOutput `pulumi:"visibility"`
}

// NewServiceProfile registers a new resource with the given unique name, arguments, and options.
func NewServiceProfile(ctx *pulumi.Context,
	name string, args *ServiceProfileArgs, opts ...pulumi.ResourceOption) (*ServiceProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ServiceProfile
	err := ctx.RegisterResource("equinix:fabric/serviceProfile:ServiceProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceProfile gets an existing ServiceProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceProfileState, opts ...pulumi.ResourceOption) (*ServiceProfile, error) {
	var resource ServiceProfile
	err := ctx.ReadResource("equinix:fabric/serviceProfile:ServiceProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceProfile resources.
type serviceProfileState struct {
	// Access point config information
	AccessPointTypeConfigs []ServiceProfileAccessPointTypeConfig `pulumi:"accessPointTypeConfigs"`
	// Account
	Account *ServiceProfileAccount `pulumi:"account"`
	// Array of contact emails
	AllowedEmails []string `pulumi:"allowedEmails"`
	// Captures connection lifecycle change information
	ChangeLog *ServiceProfileChangeLog `pulumi:"changeLog"`
	// Custom Fields
	CustomFields []ServiceProfileCustomField `pulumi:"customFields"`
	// User-provided service description
	Description *string `pulumi:"description"`
	// Service Profile URI response attribute
	Href *string `pulumi:"href"`
	// Marketing Info
	MarketingInfo *ServiceProfileMarketingInfo `pulumi:"marketingInfo"`
	// Access point config information
	Metros []ServiceProfileMetro `pulumi:"metros"`
	// Customer-assigned service profile name
	Name *string `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications []ServiceProfileNotification `pulumi:"notifications"`
	// Ports
	Ports []ServiceProfilePort `pulumi:"ports"`
	// Project information
	Project *ServiceProfileProject `pulumi:"project"`
	// Self Profile
	SelfProfile *bool `pulumi:"selfProfile"`
	// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
	State *string `pulumi:"state"`
	// Tags attached to the connection
	Tags []string `pulumi:"tags"`
	// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
	Type *string `pulumi:"type"`
	// Equinix assigned service profile identifier
	Uuid *string `pulumi:"uuid"`
	// Virtual Devices
	VirtualDevices []ServiceProfileVirtualDevice `pulumi:"virtualDevices"`
	// Service profile visibility - PUBLIC, PRIVATE
	Visibility *string `pulumi:"visibility"`
}

type ServiceProfileState struct {
	// Access point config information
	AccessPointTypeConfigs ServiceProfileAccessPointTypeConfigArrayInput
	// Account
	Account ServiceProfileAccountPtrInput
	// Array of contact emails
	AllowedEmails pulumi.StringArrayInput
	// Captures connection lifecycle change information
	ChangeLog ServiceProfileChangeLogPtrInput
	// Custom Fields
	CustomFields ServiceProfileCustomFieldArrayInput
	// User-provided service description
	Description pulumi.StringPtrInput
	// Service Profile URI response attribute
	Href pulumi.StringPtrInput
	// Marketing Info
	MarketingInfo ServiceProfileMarketingInfoPtrInput
	// Access point config information
	Metros ServiceProfileMetroArrayInput
	// Customer-assigned service profile name
	Name pulumi.StringPtrInput
	// Preferences for notifications on connection configuration or status changes
	Notifications ServiceProfileNotificationArrayInput
	// Ports
	Ports ServiceProfilePortArrayInput
	// Project information
	Project ServiceProfileProjectPtrInput
	// Self Profile
	SelfProfile pulumi.BoolPtrInput
	// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
	State pulumi.StringPtrInput
	// Tags attached to the connection
	Tags pulumi.StringArrayInput
	// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
	Type pulumi.StringPtrInput
	// Equinix assigned service profile identifier
	Uuid pulumi.StringPtrInput
	// Virtual Devices
	VirtualDevices ServiceProfileVirtualDeviceArrayInput
	// Service profile visibility - PUBLIC, PRIVATE
	Visibility pulumi.StringPtrInput
}

func (ServiceProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceProfileState)(nil)).Elem()
}

type serviceProfileArgs struct {
	// Access point config information
	AccessPointTypeConfigs []ServiceProfileAccessPointTypeConfig `pulumi:"accessPointTypeConfigs"`
	// Account
	Account *ServiceProfileAccount `pulumi:"account"`
	// Array of contact emails
	AllowedEmails []string `pulumi:"allowedEmails"`
	// Custom Fields
	CustomFields []ServiceProfileCustomField `pulumi:"customFields"`
	// User-provided service description
	Description string `pulumi:"description"`
	// Marketing Info
	MarketingInfo *ServiceProfileMarketingInfo `pulumi:"marketingInfo"`
	// Access point config information
	Metros []ServiceProfileMetro `pulumi:"metros"`
	// Customer-assigned service profile name
	Name *string `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications []ServiceProfileNotification `pulumi:"notifications"`
	// Ports
	Ports []ServiceProfilePort `pulumi:"ports"`
	// Project information
	Project *ServiceProfileProject `pulumi:"project"`
	// Self Profile
	SelfProfile *bool `pulumi:"selfProfile"`
	// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
	State *string `pulumi:"state"`
	// Tags attached to the connection
	Tags []string `pulumi:"tags"`
	// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
	Type string `pulumi:"type"`
	// Virtual Devices
	VirtualDevices []ServiceProfileVirtualDevice `pulumi:"virtualDevices"`
	// Service profile visibility - PUBLIC, PRIVATE
	Visibility *string `pulumi:"visibility"`
}

// The set of arguments for constructing a ServiceProfile resource.
type ServiceProfileArgs struct {
	// Access point config information
	AccessPointTypeConfigs ServiceProfileAccessPointTypeConfigArrayInput
	// Account
	Account ServiceProfileAccountPtrInput
	// Array of contact emails
	AllowedEmails pulumi.StringArrayInput
	// Custom Fields
	CustomFields ServiceProfileCustomFieldArrayInput
	// User-provided service description
	Description pulumi.StringInput
	// Marketing Info
	MarketingInfo ServiceProfileMarketingInfoPtrInput
	// Access point config information
	Metros ServiceProfileMetroArrayInput
	// Customer-assigned service profile name
	Name pulumi.StringPtrInput
	// Preferences for notifications on connection configuration or status changes
	Notifications ServiceProfileNotificationArrayInput
	// Ports
	Ports ServiceProfilePortArrayInput
	// Project information
	Project ServiceProfileProjectPtrInput
	// Self Profile
	SelfProfile pulumi.BoolPtrInput
	// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
	State pulumi.StringPtrInput
	// Tags attached to the connection
	Tags pulumi.StringArrayInput
	// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
	Type pulumi.StringInput
	// Virtual Devices
	VirtualDevices ServiceProfileVirtualDeviceArrayInput
	// Service profile visibility - PUBLIC, PRIVATE
	Visibility pulumi.StringPtrInput
}

func (ServiceProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceProfileArgs)(nil)).Elem()
}

type ServiceProfileInput interface {
	pulumi.Input

	ToServiceProfileOutput() ServiceProfileOutput
	ToServiceProfileOutputWithContext(ctx context.Context) ServiceProfileOutput
}

func (*ServiceProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceProfile)(nil)).Elem()
}

func (i *ServiceProfile) ToServiceProfileOutput() ServiceProfileOutput {
	return i.ToServiceProfileOutputWithContext(context.Background())
}

func (i *ServiceProfile) ToServiceProfileOutputWithContext(ctx context.Context) ServiceProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceProfileOutput)
}

// ServiceProfileArrayInput is an input type that accepts ServiceProfileArray and ServiceProfileArrayOutput values.
// You can construct a concrete instance of `ServiceProfileArrayInput` via:
//
//	ServiceProfileArray{ ServiceProfileArgs{...} }
type ServiceProfileArrayInput interface {
	pulumi.Input

	ToServiceProfileArrayOutput() ServiceProfileArrayOutput
	ToServiceProfileArrayOutputWithContext(context.Context) ServiceProfileArrayOutput
}

type ServiceProfileArray []ServiceProfileInput

func (ServiceProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceProfile)(nil)).Elem()
}

func (i ServiceProfileArray) ToServiceProfileArrayOutput() ServiceProfileArrayOutput {
	return i.ToServiceProfileArrayOutputWithContext(context.Background())
}

func (i ServiceProfileArray) ToServiceProfileArrayOutputWithContext(ctx context.Context) ServiceProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceProfileArrayOutput)
}

// ServiceProfileMapInput is an input type that accepts ServiceProfileMap and ServiceProfileMapOutput values.
// You can construct a concrete instance of `ServiceProfileMapInput` via:
//
//	ServiceProfileMap{ "key": ServiceProfileArgs{...} }
type ServiceProfileMapInput interface {
	pulumi.Input

	ToServiceProfileMapOutput() ServiceProfileMapOutput
	ToServiceProfileMapOutputWithContext(context.Context) ServiceProfileMapOutput
}

type ServiceProfileMap map[string]ServiceProfileInput

func (ServiceProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceProfile)(nil)).Elem()
}

func (i ServiceProfileMap) ToServiceProfileMapOutput() ServiceProfileMapOutput {
	return i.ToServiceProfileMapOutputWithContext(context.Background())
}

func (i ServiceProfileMap) ToServiceProfileMapOutputWithContext(ctx context.Context) ServiceProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceProfileMapOutput)
}

type ServiceProfileOutput struct{ *pulumi.OutputState }

func (ServiceProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceProfile)(nil)).Elem()
}

func (o ServiceProfileOutput) ToServiceProfileOutput() ServiceProfileOutput {
	return o
}

func (o ServiceProfileOutput) ToServiceProfileOutputWithContext(ctx context.Context) ServiceProfileOutput {
	return o
}

// Access point config information
func (o ServiceProfileOutput) AccessPointTypeConfigs() ServiceProfileAccessPointTypeConfigArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileAccessPointTypeConfigArrayOutput {
		return v.AccessPointTypeConfigs
	}).(ServiceProfileAccessPointTypeConfigArrayOutput)
}

// Account
func (o ServiceProfileOutput) Account() ServiceProfileAccountPtrOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileAccountPtrOutput { return v.Account }).(ServiceProfileAccountPtrOutput)
}

// Array of contact emails
func (o ServiceProfileOutput) AllowedEmails() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringArrayOutput { return v.AllowedEmails }).(pulumi.StringArrayOutput)
}

// Captures connection lifecycle change information
func (o ServiceProfileOutput) ChangeLog() ServiceProfileChangeLogOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileChangeLogOutput { return v.ChangeLog }).(ServiceProfileChangeLogOutput)
}

// Custom Fields
func (o ServiceProfileOutput) CustomFields() ServiceProfileCustomFieldArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileCustomFieldArrayOutput { return v.CustomFields }).(ServiceProfileCustomFieldArrayOutput)
}

// User-provided service description
func (o ServiceProfileOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Service Profile URI response attribute
func (o ServiceProfileOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// Marketing Info
func (o ServiceProfileOutput) MarketingInfo() ServiceProfileMarketingInfoPtrOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileMarketingInfoPtrOutput { return v.MarketingInfo }).(ServiceProfileMarketingInfoPtrOutput)
}

// Access point config information
func (o ServiceProfileOutput) Metros() ServiceProfileMetroArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileMetroArrayOutput { return v.Metros }).(ServiceProfileMetroArrayOutput)
}

// Customer-assigned service profile name
func (o ServiceProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on connection configuration or status changes
func (o ServiceProfileOutput) Notifications() ServiceProfileNotificationArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileNotificationArrayOutput { return v.Notifications }).(ServiceProfileNotificationArrayOutput)
}

// Ports
func (o ServiceProfileOutput) Ports() ServiceProfilePortArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfilePortArrayOutput { return v.Ports }).(ServiceProfilePortArrayOutput)
}

// Project information
func (o ServiceProfileOutput) Project() ServiceProfileProjectPtrOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileProjectPtrOutput { return v.Project }).(ServiceProfileProjectPtrOutput)
}

// Self Profile
func (o ServiceProfileOutput) SelfProfile() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.BoolPtrOutput { return v.SelfProfile }).(pulumi.BoolPtrOutput)
}

// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
func (o ServiceProfileOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

// Tags attached to the connection
func (o ServiceProfileOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
func (o ServiceProfileOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix assigned service profile identifier
func (o ServiceProfileOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

// Virtual Devices
func (o ServiceProfileOutput) VirtualDevices() ServiceProfileVirtualDeviceArrayOutput {
	return o.ApplyT(func(v *ServiceProfile) ServiceProfileVirtualDeviceArrayOutput { return v.VirtualDevices }).(ServiceProfileVirtualDeviceArrayOutput)
}

// Service profile visibility - PUBLIC, PRIVATE
func (o ServiceProfileOutput) Visibility() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceProfile) pulumi.StringPtrOutput { return v.Visibility }).(pulumi.StringPtrOutput)
}

type ServiceProfileArrayOutput struct{ *pulumi.OutputState }

func (ServiceProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceProfile)(nil)).Elem()
}

func (o ServiceProfileArrayOutput) ToServiceProfileArrayOutput() ServiceProfileArrayOutput {
	return o
}

func (o ServiceProfileArrayOutput) ToServiceProfileArrayOutputWithContext(ctx context.Context) ServiceProfileArrayOutput {
	return o
}

func (o ServiceProfileArrayOutput) Index(i pulumi.IntInput) ServiceProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceProfile {
		return vs[0].([]*ServiceProfile)[vs[1].(int)]
	}).(ServiceProfileOutput)
}

type ServiceProfileMapOutput struct{ *pulumi.OutputState }

func (ServiceProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceProfile)(nil)).Elem()
}

func (o ServiceProfileMapOutput) ToServiceProfileMapOutput() ServiceProfileMapOutput {
	return o
}

func (o ServiceProfileMapOutput) ToServiceProfileMapOutputWithContext(ctx context.Context) ServiceProfileMapOutput {
	return o
}

func (o ServiceProfileMapOutput) MapIndex(k pulumi.StringInput) ServiceProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceProfile {
		return vs[0].(map[string]*ServiceProfile)[vs[1].(string)]
	}).(ServiceProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceProfileInput)(nil)).Elem(), &ServiceProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceProfileArrayInput)(nil)).Elem(), ServiceProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceProfileMapInput)(nil)).Elem(), ServiceProfileMap{})
	pulumi.RegisterOutputType(ServiceProfileOutput{})
	pulumi.RegisterOutputType(ServiceProfileArrayOutput{})
	pulumi.RegisterOutputType(ServiceProfileMapOutput{})
}
