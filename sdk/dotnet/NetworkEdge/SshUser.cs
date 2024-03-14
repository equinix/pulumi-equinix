// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    /// <summary>
    /// Resource `equinix.networkedge.SshUser` allows creation and management of Equinix Network
    /// Edge SSH users.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var device1Id = config.Require("device1Id");
    ///     var device2Id = config.Require("device2Id");
    ///     var sshUser = new Equinix.NetworkEdge.SshUser("sshUser", new()
    ///     {
    ///         Username = "johnKent",
    ///         DeviceIds = new[]
    ///         {
    ///             device1Id,
    ///             device2Id,
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["sshUserId"] = sshUser.Id,
    ///     };
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing ID:
    /// 
    /// ```sh
    /// $ pulumi import equinix:networkedge/sshUser:SshUser example {existing_id}
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:networkedge/sshUser:SshUser")]
    public partial class SshUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// list of device identifiers to which user will have access.
        /// </summary>
        [Output("deviceIds")]
        public Output<ImmutableArray<string>> DeviceIds { get; private set; } = null!;

        /// <summary>
        /// SSH user password.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// SSH user login name.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// SSH user unique identifier.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a SshUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshUser(string name, SshUserArgs args, CustomResourceOptions? options = null)
            : base("equinix:networkedge/sshUser:SshUser", name, args ?? new SshUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshUser(string name, Input<string> id, SshUserState? state = null, CustomResourceOptions? options = null)
            : base("equinix:networkedge/sshUser:SshUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix",
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SshUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshUser Get(string name, Input<string> id, SshUserState? state = null, CustomResourceOptions? options = null)
        {
            return new SshUser(name, id, state, options);
        }
    }

    public sealed class SshUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("deviceIds", required: true)]
        private InputList<string>? _deviceIds;

        /// <summary>
        /// list of device identifiers to which user will have access.
        /// </summary>
        public InputList<string> DeviceIds
        {
            get => _deviceIds ?? (_deviceIds = new InputList<string>());
            set => _deviceIds = value;
        }

        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// SSH user password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH user login name.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public SshUserArgs()
        {
        }
        public static new SshUserArgs Empty => new SshUserArgs();
    }

    public sealed class SshUserState : global::Pulumi.ResourceArgs
    {
        [Input("deviceIds")]
        private InputList<string>? _deviceIds;

        /// <summary>
        /// list of device identifiers to which user will have access.
        /// </summary>
        public InputList<string> DeviceIds
        {
            get => _deviceIds ?? (_deviceIds = new InputList<string>());
            set => _deviceIds = value;
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// SSH user password.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// SSH user login name.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// SSH user unique identifier.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public SshUserState()
        {
        }
        public static new SshUserState Empty => new SshUserState();
    }
}
