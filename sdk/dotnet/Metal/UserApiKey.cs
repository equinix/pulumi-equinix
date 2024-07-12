// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    /// <summary>
    /// Use this resource to create Metal User API Key resources in Equinix Metal. Each API key contains a token which can be used for authentication in Equinix Metal HTTP API (in HTTP request header `X-Auth-Token`).
    /// 
    /// Read-only keys only allow to list and view existing resources, read-write keys can also be used to create resources.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Equinix.Metal.UserApiKey("test", new()
    ///     {
    ///         Description = "Read-only user key",
    ///         ReadOnly = true,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:metal/userApiKey:UserApiKey")]
    public partial class UserApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description string for the User API Key resource.
        /// * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Flag indicating whether the API key shoud be read-only
        /// </summary>
        [Output("readOnly")]
        public Output<bool> ReadOnly { get; private set; } = null!;

        /// <summary>
        /// API token which can be used in Equinix Metal API clients.
        /// </summary>
        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        /// <summary>
        /// UUID of the owner of the API key.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserApiKey(string name, UserApiKeyArgs args, CustomResourceOptions? options = null)
            : base("equinix:metal/userApiKey:UserApiKey", name, args ?? new UserApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserApiKey(string name, Input<string> id, UserApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("equinix:metal/userApiKey:UserApiKey", name, state, MakeResourceOptions(options, id))
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
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UserApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserApiKey Get(string name, Input<string> id, UserApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new UserApiKey(name, id, state, options);
        }
    }

    public sealed class UserApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description string for the User API Key resource.
        /// * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Flag indicating whether the API key shoud be read-only
        /// </summary>
        [Input("readOnly", required: true)]
        public Input<bool> ReadOnly { get; set; } = null!;

        public UserApiKeyArgs()
        {
        }
        public static new UserApiKeyArgs Empty => new UserApiKeyArgs();
    }

    public sealed class UserApiKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description string for the User API Key resource.
        /// * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Flag indicating whether the API key shoud be read-only
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// API token which can be used in Equinix Metal API clients.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// UUID of the owner of the API key.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserApiKeyState()
        {
        }
        public static new UserApiKeyState Empty => new UserApiKeyState();
    }
}
