// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"context"
	"reflect"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria
//
// Additional documentation:
// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-Sprofiles-implement.htm
// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#service-profiles
//
// ## Example Usage
//
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
//			serviceProfileDataName, err := fabric.LookupServiceProfile(ctx, &fabric.LookupServiceProfileArgs{
//				Uuid: "<uuid_of_service_profile>",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("id", serviceProfileDataName.Id)
//			ctx.Export("name", serviceProfileDataName.Name)
//			ctx.Export("type", serviceProfileDataName.Type)
//			ctx.Export("visibility", serviceProfileDataName.Visibility)
//			ctx.Export("orgName", serviceProfileDataName.Account.OrganizationName)
//			ctx.Export("accessPointTypeConfigsType", serviceProfileDataName.AccessPointTypeConfigs[0].Type)
//			ctx.Export("allowRemoteConnections", serviceProfileDataName.AccessPointTypeConfigs[0].AllowRemoteConnections)
//			ctx.Export("supportedBandwidth0", serviceProfileDataName.AccessPointTypeConfigs[0].SupportedBandwidths[0])
//			ctx.Export("supportedBandwidth1", serviceProfileDataName.AccessPointTypeConfigs[0].SupportedBandwidths[1])
//			ctx.Export("redundandyRequired", serviceProfileDataName.AccessPointTypeConfigs[0].ConnectionRedundancyRequired)
//			ctx.Export("allowOverSubscription", serviceProfileDataName.AccessPointTypeConfigs[0].ApiConfig.AllowOverSubscription)
//			return nil
//		})
//	}
//
// ```
func LookupServiceProfile(ctx *pulumi.Context, args *LookupServiceProfileArgs, opts ...pulumi.InvokeOption) (*LookupServiceProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceProfileResult
	err := ctx.Invoke("equinix:fabric/getServiceProfile:getServiceProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceProfile.
type LookupServiceProfileArgs struct {
	// Equinix assigned service profile identifier
	Uuid string `pulumi:"uuid"`
}

// A collection of values returned by getServiceProfile.
type LookupServiceProfileResult struct {
	// Access point config information
	AccessPointTypeConfigs []GetServiceProfileAccessPointTypeConfig `pulumi:"accessPointTypeConfigs"`
	// Service Profile Owner Account Information
	Account GetServiceProfileAccount `pulumi:"account"`
	// Array of contact emails
	AllowedEmails []string `pulumi:"allowedEmails"`
	// Captures connection lifecycle change information
	ChangeLog GetServiceProfileChangeLog `pulumi:"changeLog"`
	// Custom Fields
	CustomFields []GetServiceProfileCustomField `pulumi:"customFields"`
	// User-provided service description
	Description string `pulumi:"description"`
	// Service Profile URI response attribute
	Href string `pulumi:"href"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Marketing Info
	MarketingInfo GetServiceProfileMarketingInfo `pulumi:"marketingInfo"`
	// Access point config information
	Metros []GetServiceProfileMetro `pulumi:"metros"`
	// Customer-assigned service profile name
	Name string `pulumi:"name"`
	// Preferences for notifications on connection configuration or status changes
	Notifications []GetServiceProfileNotification `pulumi:"notifications"`
	// Ports
	Ports []GetServiceProfilePort `pulumi:"ports"`
	// Project information
	Project GetServiceProfileProject `pulumi:"project"`
	// Self Profile indicating if the profile is created for customer's self use
	SelfProfile bool `pulumi:"selfProfile"`
	// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
	State string `pulumi:"state"`
	// Tags attached to the connection
	Tags []string `pulumi:"tags"`
	// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
	Type string `pulumi:"type"`
	// Equinix assigned service profile identifier
	Uuid      string `pulumi:"uuid"`
	ViewPoint string `pulumi:"viewPoint"`
	// Virtual Devices
	VirtualDevices []GetServiceProfileVirtualDevice `pulumi:"virtualDevices"`
	// Service profile visibility - PUBLIC, PRIVATE
	Visibility string `pulumi:"visibility"`
}

func LookupServiceProfileOutput(ctx *pulumi.Context, args LookupServiceProfileOutputArgs, opts ...pulumi.InvokeOption) LookupServiceProfileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceProfileResultOutput, error) {
			args := v.(LookupServiceProfileArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupServiceProfileResult
			secret, err := ctx.InvokePackageRaw("equinix:fabric/getServiceProfile:getServiceProfile", args, &rv, "", opts...)
			if err != nil {
				return LookupServiceProfileResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupServiceProfileResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupServiceProfileResultOutput), nil
			}
			return output, nil
		}).(LookupServiceProfileResultOutput)
}

// A collection of arguments for invoking getServiceProfile.
type LookupServiceProfileOutputArgs struct {
	// Equinix assigned service profile identifier
	Uuid pulumi.StringInput `pulumi:"uuid"`
}

func (LookupServiceProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceProfileArgs)(nil)).Elem()
}

// A collection of values returned by getServiceProfile.
type LookupServiceProfileResultOutput struct{ *pulumi.OutputState }

func (LookupServiceProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceProfileResult)(nil)).Elem()
}

func (o LookupServiceProfileResultOutput) ToLookupServiceProfileResultOutput() LookupServiceProfileResultOutput {
	return o
}

func (o LookupServiceProfileResultOutput) ToLookupServiceProfileResultOutputWithContext(ctx context.Context) LookupServiceProfileResultOutput {
	return o
}

// Access point config information
func (o LookupServiceProfileResultOutput) AccessPointTypeConfigs() GetServiceProfileAccessPointTypeConfigArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []GetServiceProfileAccessPointTypeConfig {
		return v.AccessPointTypeConfigs
	}).(GetServiceProfileAccessPointTypeConfigArrayOutput)
}

// Service Profile Owner Account Information
func (o LookupServiceProfileResultOutput) Account() GetServiceProfileAccountOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) GetServiceProfileAccount { return v.Account }).(GetServiceProfileAccountOutput)
}

// Array of contact emails
func (o LookupServiceProfileResultOutput) AllowedEmails() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []string { return v.AllowedEmails }).(pulumi.StringArrayOutput)
}

// Captures connection lifecycle change information
func (o LookupServiceProfileResultOutput) ChangeLog() GetServiceProfileChangeLogOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) GetServiceProfileChangeLog { return v.ChangeLog }).(GetServiceProfileChangeLogOutput)
}

// Custom Fields
func (o LookupServiceProfileResultOutput) CustomFields() GetServiceProfileCustomFieldArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []GetServiceProfileCustomField { return v.CustomFields }).(GetServiceProfileCustomFieldArrayOutput)
}

// User-provided service description
func (o LookupServiceProfileResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Description }).(pulumi.StringOutput)
}

// Service Profile URI response attribute
func (o LookupServiceProfileResultOutput) Href() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Href }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// Marketing Info
func (o LookupServiceProfileResultOutput) MarketingInfo() GetServiceProfileMarketingInfoOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) GetServiceProfileMarketingInfo { return v.MarketingInfo }).(GetServiceProfileMarketingInfoOutput)
}

// Access point config information
func (o LookupServiceProfileResultOutput) Metros() GetServiceProfileMetroArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []GetServiceProfileMetro { return v.Metros }).(GetServiceProfileMetroArrayOutput)
}

// Customer-assigned service profile name
func (o LookupServiceProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

// Preferences for notifications on connection configuration or status changes
func (o LookupServiceProfileResultOutput) Notifications() GetServiceProfileNotificationArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []GetServiceProfileNotification { return v.Notifications }).(GetServiceProfileNotificationArrayOutput)
}

// Ports
func (o LookupServiceProfileResultOutput) Ports() GetServiceProfilePortArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []GetServiceProfilePort { return v.Ports }).(GetServiceProfilePortArrayOutput)
}

// Project information
func (o LookupServiceProfileResultOutput) Project() GetServiceProfileProjectOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) GetServiceProfileProject { return v.Project }).(GetServiceProfileProjectOutput)
}

// Self Profile indicating if the profile is created for customer's self use
func (o LookupServiceProfileResultOutput) SelfProfile() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) bool { return v.SelfProfile }).(pulumi.BoolOutput)
}

// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
func (o LookupServiceProfileResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.State }).(pulumi.StringOutput)
}

// Tags attached to the connection
func (o LookupServiceProfileResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
func (o LookupServiceProfileResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Type }).(pulumi.StringOutput)
}

// Equinix assigned service profile identifier
func (o LookupServiceProfileResultOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Uuid }).(pulumi.StringOutput)
}

func (o LookupServiceProfileResultOutput) ViewPoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.ViewPoint }).(pulumi.StringOutput)
}

// Virtual Devices
func (o LookupServiceProfileResultOutput) VirtualDevices() GetServiceProfileVirtualDeviceArrayOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) []GetServiceProfileVirtualDevice { return v.VirtualDevices }).(GetServiceProfileVirtualDeviceArrayOutput)
}

// Service profile visibility - PUBLIC, PRIVATE
func (o LookupServiceProfileResultOutput) Visibility() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceProfileResult) string { return v.Visibility }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceProfileResultOutput{})
}
