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

// Resource `networkedge.NetworkFile` allows creation and management of Equinix Network Edge files.
//
// ## Example Usage
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			metro := "SV"
//			if param := cfg.Get("metro"); param != "" {
//				metro = param
//			}
//			networkFile, err := networkedge.NewNetworkFile(ctx, "networkFile", &networkedge.NetworkFileArgs{
//				FileName:       pulumi.String("Aviatrix-ZTP-file"),
//				Content:        readFileOrPanic("./../assets/aviatrix-cloud-init.txt"),
//				MetroCode:      pulumi.String(metro),
//				DeviceTypeCode: pulumi.String("AVIATRIX_EDGE"),
//				ProcessType:    pulumi.String("CLOUD_INIT"),
//				SelfManaged:    pulumi.Bool(true),
//				Byol:           pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("networkFileId", networkFile.ID())
//			ctx.Export("networkFileStatus", networkFile.Status)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using an existing ID:
//
// ```sh
// $ pulumi import equinix:networkedge/networkFile:NetworkFile example {existing_id}
// ```
//
// The `content`, `self_managed` and `byol` fields can not be imported.
type NetworkFile struct {
	pulumi.CustomResourceState

	// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
	Byol pulumi.BoolOutput `pulumi:"byol"`
	// Uploaded file content, expected to be a UTF-8 encoded string.
	Content pulumi.StringOutput `pulumi:"content"`
	// Device type code
	DeviceTypeCode pulumi.StringOutput `pulumi:"deviceTypeCode"`
	// File name.
	FileName pulumi.StringOutput `pulumi:"fileName"`
	// File upload location metro code. It should match the device location metro code.
	MetroCode pulumi.StringOutput `pulumi:"metroCode"`
	// File process type (LICENSE or CLOUD_INIT).
	ProcessType pulumi.StringOutput `pulumi:"processType"`
	// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
	SelfManaged pulumi.BoolOutput `pulumi:"selfManaged"`
	// File upload status.
	Status pulumi.StringOutput `pulumi:"status"`
	// Unique identifier of file resource.
	Uuid pulumi.StringOutput `pulumi:"uuid"`
}

// NewNetworkFile registers a new resource with the given unique name, arguments, and options.
func NewNetworkFile(ctx *pulumi.Context,
	name string, args *NetworkFileArgs, opts ...pulumi.ResourceOption) (*NetworkFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Byol == nil {
		return nil, errors.New("invalid value for required argument 'Byol'")
	}
	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.DeviceTypeCode == nil {
		return nil, errors.New("invalid value for required argument 'DeviceTypeCode'")
	}
	if args.FileName == nil {
		return nil, errors.New("invalid value for required argument 'FileName'")
	}
	if args.MetroCode == nil {
		return nil, errors.New("invalid value for required argument 'MetroCode'")
	}
	if args.ProcessType == nil {
		return nil, errors.New("invalid value for required argument 'ProcessType'")
	}
	if args.SelfManaged == nil {
		return nil, errors.New("invalid value for required argument 'SelfManaged'")
	}
	if args.Content != nil {
		args.Content = pulumi.ToSecret(args.Content).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"content",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetworkFile
	err := ctx.RegisterResource("equinix:networkedge/networkFile:NetworkFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkFile gets an existing NetworkFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkFileState, opts ...pulumi.ResourceOption) (*NetworkFile, error) {
	var resource NetworkFile
	err := ctx.ReadResource("equinix:networkedge/networkFile:NetworkFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkFile resources.
type networkFileState struct {
	// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
	Byol *bool `pulumi:"byol"`
	// Uploaded file content, expected to be a UTF-8 encoded string.
	Content *string `pulumi:"content"`
	// Device type code
	DeviceTypeCode *string `pulumi:"deviceTypeCode"`
	// File name.
	FileName *string `pulumi:"fileName"`
	// File upload location metro code. It should match the device location metro code.
	MetroCode *string `pulumi:"metroCode"`
	// File process type (LICENSE or CLOUD_INIT).
	ProcessType *string `pulumi:"processType"`
	// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
	SelfManaged *bool `pulumi:"selfManaged"`
	// File upload status.
	Status *string `pulumi:"status"`
	// Unique identifier of file resource.
	Uuid *string `pulumi:"uuid"`
}

type NetworkFileState struct {
	// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
	Byol pulumi.BoolPtrInput
	// Uploaded file content, expected to be a UTF-8 encoded string.
	Content pulumi.StringPtrInput
	// Device type code
	DeviceTypeCode pulumi.StringPtrInput
	// File name.
	FileName pulumi.StringPtrInput
	// File upload location metro code. It should match the device location metro code.
	MetroCode pulumi.StringPtrInput
	// File process type (LICENSE or CLOUD_INIT).
	ProcessType pulumi.StringPtrInput
	// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
	SelfManaged pulumi.BoolPtrInput
	// File upload status.
	Status pulumi.StringPtrInput
	// Unique identifier of file resource.
	Uuid pulumi.StringPtrInput
}

func (NetworkFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkFileState)(nil)).Elem()
}

type networkFileArgs struct {
	// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
	Byol bool `pulumi:"byol"`
	// Uploaded file content, expected to be a UTF-8 encoded string.
	Content string `pulumi:"content"`
	// Device type code
	DeviceTypeCode string `pulumi:"deviceTypeCode"`
	// File name.
	FileName string `pulumi:"fileName"`
	// File upload location metro code. It should match the device location metro code.
	MetroCode string `pulumi:"metroCode"`
	// File process type (LICENSE or CLOUD_INIT).
	ProcessType string `pulumi:"processType"`
	// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
	SelfManaged bool `pulumi:"selfManaged"`
}

// The set of arguments for constructing a NetworkFile resource.
type NetworkFileArgs struct {
	// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
	Byol pulumi.BoolInput
	// Uploaded file content, expected to be a UTF-8 encoded string.
	Content pulumi.StringInput
	// Device type code
	DeviceTypeCode pulumi.StringInput
	// File name.
	FileName pulumi.StringInput
	// File upload location metro code. It should match the device location metro code.
	MetroCode pulumi.StringInput
	// File process type (LICENSE or CLOUD_INIT).
	ProcessType pulumi.StringInput
	// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
	SelfManaged pulumi.BoolInput
}

func (NetworkFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkFileArgs)(nil)).Elem()
}

type NetworkFileInput interface {
	pulumi.Input

	ToNetworkFileOutput() NetworkFileOutput
	ToNetworkFileOutputWithContext(ctx context.Context) NetworkFileOutput
}

func (*NetworkFile) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkFile)(nil)).Elem()
}

func (i *NetworkFile) ToNetworkFileOutput() NetworkFileOutput {
	return i.ToNetworkFileOutputWithContext(context.Background())
}

func (i *NetworkFile) ToNetworkFileOutputWithContext(ctx context.Context) NetworkFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkFileOutput)
}

// NetworkFileArrayInput is an input type that accepts NetworkFileArray and NetworkFileArrayOutput values.
// You can construct a concrete instance of `NetworkFileArrayInput` via:
//
//	NetworkFileArray{ NetworkFileArgs{...} }
type NetworkFileArrayInput interface {
	pulumi.Input

	ToNetworkFileArrayOutput() NetworkFileArrayOutput
	ToNetworkFileArrayOutputWithContext(context.Context) NetworkFileArrayOutput
}

type NetworkFileArray []NetworkFileInput

func (NetworkFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkFile)(nil)).Elem()
}

func (i NetworkFileArray) ToNetworkFileArrayOutput() NetworkFileArrayOutput {
	return i.ToNetworkFileArrayOutputWithContext(context.Background())
}

func (i NetworkFileArray) ToNetworkFileArrayOutputWithContext(ctx context.Context) NetworkFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkFileArrayOutput)
}

// NetworkFileMapInput is an input type that accepts NetworkFileMap and NetworkFileMapOutput values.
// You can construct a concrete instance of `NetworkFileMapInput` via:
//
//	NetworkFileMap{ "key": NetworkFileArgs{...} }
type NetworkFileMapInput interface {
	pulumi.Input

	ToNetworkFileMapOutput() NetworkFileMapOutput
	ToNetworkFileMapOutputWithContext(context.Context) NetworkFileMapOutput
}

type NetworkFileMap map[string]NetworkFileInput

func (NetworkFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkFile)(nil)).Elem()
}

func (i NetworkFileMap) ToNetworkFileMapOutput() NetworkFileMapOutput {
	return i.ToNetworkFileMapOutputWithContext(context.Background())
}

func (i NetworkFileMap) ToNetworkFileMapOutputWithContext(ctx context.Context) NetworkFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkFileMapOutput)
}

type NetworkFileOutput struct{ *pulumi.OutputState }

func (NetworkFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkFile)(nil)).Elem()
}

func (o NetworkFileOutput) ToNetworkFileOutput() NetworkFileOutput {
	return o
}

func (o NetworkFileOutput) ToNetworkFileOutputWithContext(ctx context.Context) NetworkFileOutput {
	return o
}

// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
func (o NetworkFileOutput) Byol() pulumi.BoolOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.BoolOutput { return v.Byol }).(pulumi.BoolOutput)
}

// Uploaded file content, expected to be a UTF-8 encoded string.
func (o NetworkFileOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.Content }).(pulumi.StringOutput)
}

// Device type code
func (o NetworkFileOutput) DeviceTypeCode() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.DeviceTypeCode }).(pulumi.StringOutput)
}

// File name.
func (o NetworkFileOutput) FileName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.FileName }).(pulumi.StringOutput)
}

// File upload location metro code. It should match the device location metro code.
func (o NetworkFileOutput) MetroCode() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.MetroCode }).(pulumi.StringOutput)
}

// File process type (LICENSE or CLOUD_INIT).
func (o NetworkFileOutput) ProcessType() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.ProcessType }).(pulumi.StringOutput)
}

// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
func (o NetworkFileOutput) SelfManaged() pulumi.BoolOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.BoolOutput { return v.SelfManaged }).(pulumi.BoolOutput)
}

// File upload status.
func (o NetworkFileOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Unique identifier of file resource.
func (o NetworkFileOutput) Uuid() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkFile) pulumi.StringOutput { return v.Uuid }).(pulumi.StringOutput)
}

type NetworkFileArrayOutput struct{ *pulumi.OutputState }

func (NetworkFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkFile)(nil)).Elem()
}

func (o NetworkFileArrayOutput) ToNetworkFileArrayOutput() NetworkFileArrayOutput {
	return o
}

func (o NetworkFileArrayOutput) ToNetworkFileArrayOutputWithContext(ctx context.Context) NetworkFileArrayOutput {
	return o
}

func (o NetworkFileArrayOutput) Index(i pulumi.IntInput) NetworkFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkFile {
		return vs[0].([]*NetworkFile)[vs[1].(int)]
	}).(NetworkFileOutput)
}

type NetworkFileMapOutput struct{ *pulumi.OutputState }

func (NetworkFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkFile)(nil)).Elem()
}

func (o NetworkFileMapOutput) ToNetworkFileMapOutput() NetworkFileMapOutput {
	return o
}

func (o NetworkFileMapOutput) ToNetworkFileMapOutputWithContext(ctx context.Context) NetworkFileMapOutput {
	return o
}

func (o NetworkFileMapOutput) MapIndex(k pulumi.StringInput) NetworkFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkFile {
		return vs[0].(map[string]*NetworkFile)[vs[1].(string)]
	}).(NetworkFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkFileInput)(nil)).Elem(), &NetworkFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkFileArrayInput)(nil)).Elem(), NetworkFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkFileMapInput)(nil)).Elem(), NetworkFileMap{})
	pulumi.RegisterOutputType(NetworkFileOutput{})
	pulumi.RegisterOutputType(NetworkFileArrayOutput{})
	pulumi.RegisterOutputType(NetworkFileMapOutput{})
}
