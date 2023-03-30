// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix
{
    /// <summary>
    /// The provider type for the equinix package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [EquinixResourceType("pulumi:providers:equinix")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// The Equinix Metal API auth key for API operations
        /// </summary>
        [Output("authToken")]
        public Output<string?> AuthToken { get; private set; } = null!;

        /// <summary>
        /// API Consumer Key available under My Apps section in developer portal
        /// </summary>
        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        /// <summary>
        /// API Consumer secret available under My Apps section in developer portal
        /// </summary>
        [Output("clientSecret")]
        public Output<string?> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// The Equinix API base URL to point out desired environment. Defaults to https://api.equinix.com
        /// </summary>
        [Output("endpoint")]
        public Output<string?> Endpoint { get; private set; } = null!;

        /// <summary>
        /// API token from the developer sandbox
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("equinix", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/equinix/pulumi-equinix/releases/download/0.0.1-alpha.1680197579+b252741a.dirty",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Equinix Metal API auth key for API operations
        /// </summary>
        [Input("authToken")]
        public Input<string>? AuthToken { get; set; }

        /// <summary>
        /// API Consumer Key available under My Apps section in developer portal
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// API Consumer secret available under My Apps section in developer portal
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// The Equinix API base URL to point out desired environment. Defaults to https://api.equinix.com
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        [Input("maxRetries", json: true)]
        public Input<int>? MaxRetries { get; set; }

        [Input("maxRetryWaitSeconds", json: true)]
        public Input<int>? MaxRetryWaitSeconds { get; set; }

        /// <summary>
        /// The duration of time, in seconds, that the Equinix Platform API Client should wait before canceling an API request.
        /// Defaults to 30
        /// </summary>
        [Input("requestTimeout", json: true)]
        public Input<int>? RequestTimeout { get; set; }

        /// <summary>
        /// The maximum number of records in a single response for REST queries that produce paginated responses
        /// </summary>
        [Input("responseMaxPageSize", json: true)]
        public Input<int>? ResponseMaxPageSize { get; set; }

        /// <summary>
        /// API token from the developer sandbox
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
