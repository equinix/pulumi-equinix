// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkedge

import (
	"context"
	"reflect"

	"errors"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource `networkedge.SshUser` allows creation and management of Equinix Network
// Edge SSH users.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			device1Id := cfg.Require("device1Id")
//			device2Id := cfg.Require("device2Id")
//			sshUser, err := networkedge.NewSshUser(ctx, "sshUser", &networkedge.SshUserArgs{
//				Username: pulumi.String("johnKent"),
//				DeviceIds: pulumi.StringArray{
//					pulumi.String(device1Id),
//					pulumi.String(device2Id),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("sshUserId", sshUser.ID())
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing ID:<break><break> ```sh<break> $ pulumi import equinix:networkedge/sshUser:SshUser example {existing_id} <break>```<break><break>
type SshUser struct {
	pulumi.CustomResourceState

	// list of device identifiers to which user will have access.
	DeviceIds pulumi.StringArrayOutput `pulumi:"deviceIds"`
	// SSH user password.
	Password pulumi.StringOutput `pulumi:"password"`
	// SSH user login name.
	Username pulumi.StringOutput `pulumi:"username"`
	// SSH user unique identifier.
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewSshUser registers a new resource with the given unique name, arguments, and options.
func NewSshUser(ctx *pulumi.Context,
	name string, args *SshUserArgs, opts ...pulumi.ResourceOption) (*SshUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceIds == nil {
		return nil, errors.New("invalid value for required argument 'DeviceIds'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SshUser
	err := ctx.RegisterResource("equinix:networkedge/sshUser:SshUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshUser gets an existing SshUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshUserState, opts ...pulumi.ResourceOption) (*SshUser, error) {
	var resource SshUser
	err := ctx.ReadResource("equinix:networkedge/sshUser:SshUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshUser resources.
type sshUserState struct {
	// list of device identifiers to which user will have access.
	DeviceIds []string `pulumi:"deviceIds"`
	// SSH user password.
	Password *string `pulumi:"password"`
	// SSH user login name.
	Username *string `pulumi:"username"`
	// SSH user unique identifier.
	Uuid *string `pulumi:"uuid"`
}

type SshUserState struct {
	// list of device identifiers to which user will have access.
	DeviceIds pulumi.StringArrayInput
	// SSH user password.
	Password pulumi.StringPtrInput
	// SSH user login name.
	Username pulumi.StringPtrInput
	// SSH user unique identifier.
	Uuid pulumi.StringPtrInput
}

func (SshUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshUserState)(nil)).Elem()
}

type sshUserArgs struct {
	// list of device identifiers to which user will have access.
	DeviceIds []string `pulumi:"deviceIds"`
	// SSH user password.
	Password string `pulumi:"password"`
	// SSH user login name.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a SshUser resource.
type SshUserArgs struct {
	// list of device identifiers to which user will have access.
	DeviceIds pulumi.StringArrayInput
	// SSH user password.
	Password pulumi.StringInput
	// SSH user login name.
	Username pulumi.StringInput
}

func (SshUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshUserArgs)(nil)).Elem()
}

type SshUserInput interface {
	pulumi.Input

	ToSshUserOutput() SshUserOutput
	ToSshUserOutputWithContext(ctx context.Context) SshUserOutput
}

func (*SshUser) ElementType() reflect.Type {
	return reflect.TypeOf((**SshUser)(nil)).Elem()
}

func (i *SshUser) ToSshUserOutput() SshUserOutput {
	return i.ToSshUserOutputWithContext(context.Background())
}

func (i *SshUser) ToSshUserOutputWithContext(ctx context.Context) SshUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshUserOutput)
}

// SshUserArrayInput is an input type that accepts SshUserArray and SshUserArrayOutput values.
// You can construct a concrete instance of `SshUserArrayInput` via:
//
//	SshUserArray{ SshUserArgs{...} }
type SshUserArrayInput interface {
	pulumi.Input

	ToSshUserArrayOutput() SshUserArrayOutput
	ToSshUserArrayOutputWithContext(context.Context) SshUserArrayOutput
}

type SshUserArray []SshUserInput

func (SshUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshUser)(nil)).Elem()
}

func (i SshUserArray) ToSshUserArrayOutput() SshUserArrayOutput {
	return i.ToSshUserArrayOutputWithContext(context.Background())
}

func (i SshUserArray) ToSshUserArrayOutputWithContext(ctx context.Context) SshUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshUserArrayOutput)
}

// SshUserMapInput is an input type that accepts SshUserMap and SshUserMapOutput values.
// You can construct a concrete instance of `SshUserMapInput` via:
//
//	SshUserMap{ "key": SshUserArgs{...} }
type SshUserMapInput interface {
	pulumi.Input

	ToSshUserMapOutput() SshUserMapOutput
	ToSshUserMapOutputWithContext(context.Context) SshUserMapOutput
}

type SshUserMap map[string]SshUserInput

func (SshUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshUser)(nil)).Elem()
}

func (i SshUserMap) ToSshUserMapOutput() SshUserMapOutput {
	return i.ToSshUserMapOutputWithContext(context.Background())
}

func (i SshUserMap) ToSshUserMapOutputWithContext(ctx context.Context) SshUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshUserMapOutput)
}

type SshUserOutput struct{ *pulumi.OutputState }

func (SshUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SshUser)(nil)).Elem()
}

func (o SshUserOutput) ToSshUserOutput() SshUserOutput {
	return o
}

func (o SshUserOutput) ToSshUserOutputWithContext(ctx context.Context) SshUserOutput {
	return o
}

// list of device identifiers to which user will have access.
func (o SshUserOutput) DeviceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SshUser) pulumi.StringArrayOutput { return v.DeviceIds }).(pulumi.StringArrayOutput)
}

// SSH user password.
func (o SshUserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *SshUser) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// SSH user login name.
func (o SshUserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *SshUser) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// SSH user unique identifier.
func (o SshUserOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *SshUser) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type SshUserArrayOutput struct{ *pulumi.OutputState }

func (SshUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshUser)(nil)).Elem()
}

func (o SshUserArrayOutput) ToSshUserArrayOutput() SshUserArrayOutput {
	return o
}

func (o SshUserArrayOutput) ToSshUserArrayOutputWithContext(ctx context.Context) SshUserArrayOutput {
	return o
}

func (o SshUserArrayOutput) Index(i pulumi.IntInput) SshUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SshUser {
		return vs[0].([]*SshUser)[vs[1].(int)]
	}).(SshUserOutput)
}

type SshUserMapOutput struct{ *pulumi.OutputState }

func (SshUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshUser)(nil)).Elem()
}

func (o SshUserMapOutput) ToSshUserMapOutput() SshUserMapOutput {
	return o
}

func (o SshUserMapOutput) ToSshUserMapOutputWithContext(ctx context.Context) SshUserMapOutput {
	return o
}

func (o SshUserMapOutput) MapIndex(k pulumi.StringInput) SshUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SshUser {
		return vs[0].(map[string]*SshUser)[vs[1].(string)]
	}).(SshUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshUserInput)(nil)).Elem(), &SshUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshUserArrayInput)(nil)).Elem(), SshUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshUserMapInput)(nil)).Elem(), SshUserMap{})
	pulumi.RegisterOutputType(SshUserOutput{})
	pulumi.RegisterOutputType(SshUserArrayOutput{})
	pulumi.RegisterOutputType(SshUserMapOutput{})
}
