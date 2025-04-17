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

// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Precision Time Service
//
// Additional Documentation:
// * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/API-Reference/API-Precision-Time.htm
type PrecisionTimeService struct {
	pulumi.CustomResourceState

	// Equinix User Account associated with Precision Time Service
	Account PrecisionTimeServiceAccountOutput `pulumi:"account"`
	// Details of the last change on the route aggregation resource
	ChangeLog PrecisionTimeServiceChangeLogOutput `pulumi:"changeLog"`
	// An array of objects with unique identifiers of connections.
	Connections PrecisionTimeServiceConnectionArrayOutput `pulumi:"connections"`
	// Equinix generated Portal link for the created Precision Time Service
	Href pulumi.StringOutput `pulumi:"href"`
	// An object that has Network IP Configurations for Timing Master Servers.
	Ipv4 PrecisionTimeServiceIpv4Output `pulumi:"ipv4"`
	// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
	Name pulumi.StringOutput `pulumi:"name"`
	// NTP Advanced configuration
	NtpAdvancedConfigurations PrecisionTimeServiceNtpAdvancedConfigurationArrayOutput `pulumi:"ntpAdvancedConfigurations"`
	// Precision Time Order
	Order PrecisionTimeServiceOrderOutput `pulumi:"order"`
	// Precision Time Service Package Details
	Package PrecisionTimeServicePackageOutput `pulumi:"package"`
	// Precision Time Service Price
	PrecisionTimePrice PrecisionTimeServicePrecisionTimePriceOutput `pulumi:"precisionTimePrice"`
	// Equinix Project attribute object
	Project PrecisionTimeServiceProjectOutput `pulumi:"project"`
	// PTP Advanced Configuration
	PtpAdvancedConfiguration PrecisionTimeServicePtpAdvancedConfigurationPtrOutput `pulumi:"ptpAdvancedConfiguration"`
	// Indicator of the state of this Precision Time Service
	State    pulumi.StringOutput                   `pulumi:"state"`
	Timeouts PrecisionTimeServiceTimeoutsPtrOutput `pulumi:"timeouts"`
	// Choose type of Precision Time Service
	Type pulumi.StringOutput `pulumi:"type"`
	// Equinix generated id for the Precision Time Service
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewPrecisionTimeService registers a new resource with the given unique name, arguments, and options.
func NewPrecisionTimeService(ctx *pulumi.Context,
	name string, args *PrecisionTimeServiceArgs, opts ...pulumi.ResourceOption) (*PrecisionTimeService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Connections == nil {
		return nil, errors.New("invalid value for required argument 'Connections'")
	}
	if args.Ipv4 == nil {
		return nil, errors.New("invalid value for required argument 'Ipv4'")
	}
	if args.Package == nil {
		return nil, errors.New("invalid value for required argument 'Package'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrecisionTimeService
	err := ctx.RegisterResource("equinix:fabric/precisionTimeService:PrecisionTimeService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrecisionTimeService gets an existing PrecisionTimeService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrecisionTimeService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrecisionTimeServiceState, opts ...pulumi.ResourceOption) (*PrecisionTimeService, error) {
	var resource PrecisionTimeService
	err := ctx.ReadResource("equinix:fabric/precisionTimeService:PrecisionTimeService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrecisionTimeService resources.
type precisionTimeServiceState struct {
	// Equinix User Account associated with Precision Time Service
	Account *PrecisionTimeServiceAccount `pulumi:"account"`
	// Details of the last change on the route aggregation resource
	ChangeLog *PrecisionTimeServiceChangeLog `pulumi:"changeLog"`
	// An array of objects with unique identifiers of connections.
	Connections []PrecisionTimeServiceConnection `pulumi:"connections"`
	// Equinix generated Portal link for the created Precision Time Service
	Href *string `pulumi:"href"`
	// An object that has Network IP Configurations for Timing Master Servers.
	Ipv4 *PrecisionTimeServiceIpv4 `pulumi:"ipv4"`
	// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
	Name *string `pulumi:"name"`
	// NTP Advanced configuration
	NtpAdvancedConfigurations []PrecisionTimeServiceNtpAdvancedConfiguration `pulumi:"ntpAdvancedConfigurations"`
	// Precision Time Order
	Order *PrecisionTimeServiceOrder `pulumi:"order"`
	// Precision Time Service Package Details
	Package *PrecisionTimeServicePackage `pulumi:"package"`
	// Precision Time Service Price
	PrecisionTimePrice *PrecisionTimeServicePrecisionTimePrice `pulumi:"precisionTimePrice"`
	// Equinix Project attribute object
	Project *PrecisionTimeServiceProject `pulumi:"project"`
	// PTP Advanced Configuration
	PtpAdvancedConfiguration *PrecisionTimeServicePtpAdvancedConfiguration `pulumi:"ptpAdvancedConfiguration"`
	// Indicator of the state of this Precision Time Service
	State    *string                       `pulumi:"state"`
	Timeouts *PrecisionTimeServiceTimeouts `pulumi:"timeouts"`
	// Choose type of Precision Time Service
	Type *string `pulumi:"type"`
	// Equinix generated id for the Precision Time Service
	Uuid *string `pulumi:"uuid"`
}

type PrecisionTimeServiceState struct {
	// Equinix User Account associated with Precision Time Service
	Account PrecisionTimeServiceAccountPtrInput
	// Details of the last change on the route aggregation resource
	ChangeLog PrecisionTimeServiceChangeLogPtrInput
	// An array of objects with unique identifiers of connections.
	Connections PrecisionTimeServiceConnectionArrayInput
	// Equinix generated Portal link for the created Precision Time Service
	Href pulumi.StringPtrInput
	// An object that has Network IP Configurations for Timing Master Servers.
	Ipv4 PrecisionTimeServiceIpv4PtrInput
	// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
	Name pulumi.StringPtrInput
	// NTP Advanced configuration
	NtpAdvancedConfigurations PrecisionTimeServiceNtpAdvancedConfigurationArrayInput
	// Precision Time Order
	Order PrecisionTimeServiceOrderPtrInput
	// Precision Time Service Package Details
	Package PrecisionTimeServicePackagePtrInput
	// Precision Time Service Price
	PrecisionTimePrice PrecisionTimeServicePrecisionTimePricePtrInput
	// Equinix Project attribute object
	Project PrecisionTimeServiceProjectPtrInput
	// PTP Advanced Configuration
	PtpAdvancedConfiguration PrecisionTimeServicePtpAdvancedConfigurationPtrInput
	// Indicator of the state of this Precision Time Service
	State    pulumi.StringPtrInput
	Timeouts PrecisionTimeServiceTimeoutsPtrInput
	// Choose type of Precision Time Service
	Type pulumi.StringPtrInput
	// Equinix generated id for the Precision Time Service
	Uuid pulumi.StringPtrInput
}

func (PrecisionTimeServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*precisionTimeServiceState)(nil)).Elem()
}

type precisionTimeServiceArgs struct {
	// An array of objects with unique identifiers of connections.
	Connections []PrecisionTimeServiceConnection `pulumi:"connections"`
	// An object that has Network IP Configurations for Timing Master Servers.
	Ipv4 PrecisionTimeServiceIpv4 `pulumi:"ipv4"`
	// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
	Name *string `pulumi:"name"`
	// NTP Advanced configuration
	NtpAdvancedConfigurations []PrecisionTimeServiceNtpAdvancedConfiguration `pulumi:"ntpAdvancedConfigurations"`
	// Precision Time Service Package Details
	Package PrecisionTimeServicePackage `pulumi:"package"`
	// PTP Advanced Configuration
	PtpAdvancedConfiguration *PrecisionTimeServicePtpAdvancedConfiguration `pulumi:"ptpAdvancedConfiguration"`
	Timeouts                 *PrecisionTimeServiceTimeouts                 `pulumi:"timeouts"`
	// Choose type of Precision Time Service
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a PrecisionTimeService resource.
type PrecisionTimeServiceArgs struct {
	// An array of objects with unique identifiers of connections.
	Connections PrecisionTimeServiceConnectionArrayInput
	// An object that has Network IP Configurations for Timing Master Servers.
	Ipv4 PrecisionTimeServiceIpv4Input
	// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
	Name pulumi.StringPtrInput
	// NTP Advanced configuration
	NtpAdvancedConfigurations PrecisionTimeServiceNtpAdvancedConfigurationArrayInput
	// Precision Time Service Package Details
	Package PrecisionTimeServicePackageInput
	// PTP Advanced Configuration
	PtpAdvancedConfiguration PrecisionTimeServicePtpAdvancedConfigurationPtrInput
	Timeouts                 PrecisionTimeServiceTimeoutsPtrInput
	// Choose type of Precision Time Service
	Type pulumi.StringInput
}

func (PrecisionTimeServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*precisionTimeServiceArgs)(nil)).Elem()
}

type PrecisionTimeServiceInput interface {
	pulumi.Input

	ToPrecisionTimeServiceOutput() PrecisionTimeServiceOutput
	ToPrecisionTimeServiceOutputWithContext(ctx context.Context) PrecisionTimeServiceOutput
}

func (*PrecisionTimeService) ElementType() reflect.Type {
	return reflect.TypeOf((**PrecisionTimeService)(nil)).Elem()
}

func (i *PrecisionTimeService) ToPrecisionTimeServiceOutput() PrecisionTimeServiceOutput {
	return i.ToPrecisionTimeServiceOutputWithContext(context.Background())
}

func (i *PrecisionTimeService) ToPrecisionTimeServiceOutputWithContext(ctx context.Context) PrecisionTimeServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrecisionTimeServiceOutput)
}

// PrecisionTimeServiceArrayInput is an input type that accepts PrecisionTimeServiceArray and PrecisionTimeServiceArrayOutput values.
// You can construct a concrete instance of `PrecisionTimeServiceArrayInput` via:
//
//	PrecisionTimeServiceArray{ PrecisionTimeServiceArgs{...} }
type PrecisionTimeServiceArrayInput interface {
	pulumi.Input

	ToPrecisionTimeServiceArrayOutput() PrecisionTimeServiceArrayOutput
	ToPrecisionTimeServiceArrayOutputWithContext(context.Context) PrecisionTimeServiceArrayOutput
}

type PrecisionTimeServiceArray []PrecisionTimeServiceInput

func (PrecisionTimeServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrecisionTimeService)(nil)).Elem()
}

func (i PrecisionTimeServiceArray) ToPrecisionTimeServiceArrayOutput() PrecisionTimeServiceArrayOutput {
	return i.ToPrecisionTimeServiceArrayOutputWithContext(context.Background())
}

func (i PrecisionTimeServiceArray) ToPrecisionTimeServiceArrayOutputWithContext(ctx context.Context) PrecisionTimeServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrecisionTimeServiceArrayOutput)
}

// PrecisionTimeServiceMapInput is an input type that accepts PrecisionTimeServiceMap and PrecisionTimeServiceMapOutput values.
// You can construct a concrete instance of `PrecisionTimeServiceMapInput` via:
//
//	PrecisionTimeServiceMap{ "key": PrecisionTimeServiceArgs{...} }
type PrecisionTimeServiceMapInput interface {
	pulumi.Input

	ToPrecisionTimeServiceMapOutput() PrecisionTimeServiceMapOutput
	ToPrecisionTimeServiceMapOutputWithContext(context.Context) PrecisionTimeServiceMapOutput
}

type PrecisionTimeServiceMap map[string]PrecisionTimeServiceInput

func (PrecisionTimeServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrecisionTimeService)(nil)).Elem()
}

func (i PrecisionTimeServiceMap) ToPrecisionTimeServiceMapOutput() PrecisionTimeServiceMapOutput {
	return i.ToPrecisionTimeServiceMapOutputWithContext(context.Background())
}

func (i PrecisionTimeServiceMap) ToPrecisionTimeServiceMapOutputWithContext(ctx context.Context) PrecisionTimeServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrecisionTimeServiceMapOutput)
}

type PrecisionTimeServiceOutput struct{ *pulumi.OutputState }

func (PrecisionTimeServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrecisionTimeService)(nil)).Elem()
}

func (o PrecisionTimeServiceOutput) ToPrecisionTimeServiceOutput() PrecisionTimeServiceOutput {
	return o
}

func (o PrecisionTimeServiceOutput) ToPrecisionTimeServiceOutputWithContext(ctx context.Context) PrecisionTimeServiceOutput {
	return o
}

// Equinix User Account associated with Precision Time Service
func (o PrecisionTimeServiceOutput) Account() PrecisionTimeServiceAccountOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceAccountOutput { return v.Account }).(PrecisionTimeServiceAccountOutput)
}

// Details of the last change on the route aggregation resource
func (o PrecisionTimeServiceOutput) ChangeLog() PrecisionTimeServiceChangeLogOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceChangeLogOutput { return v.ChangeLog }).(PrecisionTimeServiceChangeLogOutput)
}

// An array of objects with unique identifiers of connections.
func (o PrecisionTimeServiceOutput) Connections() PrecisionTimeServiceConnectionArrayOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceConnectionArrayOutput { return v.Connections }).(PrecisionTimeServiceConnectionArrayOutput)
}

// Equinix generated Portal link for the created Precision Time Service
func (o PrecisionTimeServiceOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v *PrecisionTimeService) pulumi.StringOutput { return v.Href }).(pulumi.StringOutput)
}

// An object that has Network IP Configurations for Timing Master Servers.
func (o PrecisionTimeServiceOutput) Ipv4() PrecisionTimeServiceIpv4Output {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceIpv4Output { return v.Ipv4 }).(PrecisionTimeServiceIpv4Output)
}

// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
func (o PrecisionTimeServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PrecisionTimeService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// NTP Advanced configuration
func (o PrecisionTimeServiceOutput) NtpAdvancedConfigurations() PrecisionTimeServiceNtpAdvancedConfigurationArrayOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceNtpAdvancedConfigurationArrayOutput {
		return v.NtpAdvancedConfigurations
	}).(PrecisionTimeServiceNtpAdvancedConfigurationArrayOutput)
}

// Precision Time Order
func (o PrecisionTimeServiceOutput) Order() PrecisionTimeServiceOrderOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceOrderOutput { return v.Order }).(PrecisionTimeServiceOrderOutput)
}

// Precision Time Service Package Details
func (o PrecisionTimeServiceOutput) Package() PrecisionTimeServicePackageOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServicePackageOutput { return v.Package }).(PrecisionTimeServicePackageOutput)
}

// Precision Time Service Price
func (o PrecisionTimeServiceOutput) PrecisionTimePrice() PrecisionTimeServicePrecisionTimePriceOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServicePrecisionTimePriceOutput {
		return v.PrecisionTimePrice
	}).(PrecisionTimeServicePrecisionTimePriceOutput)
}

// Equinix Project attribute object
func (o PrecisionTimeServiceOutput) Project() PrecisionTimeServiceProjectOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceProjectOutput { return v.Project }).(PrecisionTimeServiceProjectOutput)
}

// PTP Advanced Configuration
func (o PrecisionTimeServiceOutput) PtpAdvancedConfiguration() PrecisionTimeServicePtpAdvancedConfigurationPtrOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServicePtpAdvancedConfigurationPtrOutput {
		return v.PtpAdvancedConfiguration
	}).(PrecisionTimeServicePtpAdvancedConfigurationPtrOutput)
}

// Indicator of the state of this Precision Time Service
func (o PrecisionTimeServiceOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *PrecisionTimeService) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

func (o PrecisionTimeServiceOutput) Timeouts() PrecisionTimeServiceTimeoutsPtrOutput {
	return o.ApplyT(func(v *PrecisionTimeService) PrecisionTimeServiceTimeoutsPtrOutput { return v.Timeouts }).(PrecisionTimeServiceTimeoutsPtrOutput)
}

// Choose type of Precision Time Service
func (o PrecisionTimeServiceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *PrecisionTimeService) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Equinix generated id for the Precision Time Service
func (o PrecisionTimeServiceOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *PrecisionTimeService) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type PrecisionTimeServiceArrayOutput struct{ *pulumi.OutputState }

func (PrecisionTimeServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrecisionTimeService)(nil)).Elem()
}

func (o PrecisionTimeServiceArrayOutput) ToPrecisionTimeServiceArrayOutput() PrecisionTimeServiceArrayOutput {
	return o
}

func (o PrecisionTimeServiceArrayOutput) ToPrecisionTimeServiceArrayOutputWithContext(ctx context.Context) PrecisionTimeServiceArrayOutput {
	return o
}

func (o PrecisionTimeServiceArrayOutput) Index(i pulumi.IntInput) PrecisionTimeServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrecisionTimeService {
		return vs[0].([]*PrecisionTimeService)[vs[1].(int)]
	}).(PrecisionTimeServiceOutput)
}

type PrecisionTimeServiceMapOutput struct{ *pulumi.OutputState }

func (PrecisionTimeServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrecisionTimeService)(nil)).Elem()
}

func (o PrecisionTimeServiceMapOutput) ToPrecisionTimeServiceMapOutput() PrecisionTimeServiceMapOutput {
	return o
}

func (o PrecisionTimeServiceMapOutput) ToPrecisionTimeServiceMapOutputWithContext(ctx context.Context) PrecisionTimeServiceMapOutput {
	return o
}

func (o PrecisionTimeServiceMapOutput) MapIndex(k pulumi.StringInput) PrecisionTimeServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrecisionTimeService {
		return vs[0].(map[string]*PrecisionTimeService)[vs[1].(string)]
	}).(PrecisionTimeServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrecisionTimeServiceInput)(nil)).Elem(), &PrecisionTimeService{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrecisionTimeServiceArrayInput)(nil)).Elem(), PrecisionTimeServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrecisionTimeServiceMapInput)(nil)).Elem(), PrecisionTimeServiceMap{})
	pulumi.RegisterOutputType(PrecisionTimeServiceOutput{})
	pulumi.RegisterOutputType(PrecisionTimeServiceArrayOutput{})
	pulumi.RegisterOutputType(PrecisionTimeServiceMapOutput{})
}
