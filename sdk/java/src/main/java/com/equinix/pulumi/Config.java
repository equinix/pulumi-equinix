// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi;

import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("equinix");
/**
 * The Equinix Metal API auth key for API operations
 * 
 */
    public Optional<String> authToken() {
        return Codegen.stringProp("authToken").config(config).get();
    }
/**
 * API Consumer Key available under &#34;My Apps&#34; in developer portal. This argument can also be specified with the
 * `EQUINIX_API_CLIENTID` shell environment variable.
 * 
 */
    public Optional<String> clientId() {
        return Codegen.stringProp("clientId").config(config).get();
    }
/**
 * API Consumer secret available under &#34;My Apps&#34; in developer portal. This argument can also be specified with the
 * `EQUINIX_API_CLIENTSECRET` shell environment variable.
 * 
 */
    public Optional<String> clientSecret() {
        return Codegen.stringProp("clientSecret").config(config).get();
    }
/**
 * The Equinix API base URL to point out desired environment. This argument can also be specified with the
 * `EQUINIX_API_ENDPOINT` shell environment variable. (Defaults to `https://api.equinix.com`)
 * 
 */
    public Optional<String> endpoint() {
        return Codegen.stringProp("endpoint").config(config).get();
    }
/**
 * Maximum number of retries in case of network failure.
 * 
 */
    public Optional<Integer> maxRetries() {
        return Codegen.integerProp("maxRetries").config(config).get();
    }
/**
 * Maximum number of seconds to wait before retrying a request.
 * 
 */
    public Optional<Integer> maxRetryWaitSeconds() {
        return Codegen.integerProp("maxRetryWaitSeconds").config(config).get();
    }
/**
 * The duration of time, in seconds, that the Equinix Platform API Client should wait before canceling an API request.
 * Canceled requests may still result in provisioned resources. (Defaults to `30`)
 * 
 */
    public Optional<Integer> requestTimeout() {
        return Codegen.integerProp("requestTimeout").config(config).get();
    }
/**
 * The maximum number of records in a single response for REST queries that produce paginated responses. (Default is client
 * specific)
 * 
 */
    public Optional<Integer> responseMaxPageSize() {
        return Codegen.integerProp("responseMaxPageSize").config(config).get();
    }
/**
 * API tokens are generated from API Consumer clients using the [OAuth2
 * API](https://developer.equinix.com/dev-docs/fabric/getting-started/getting-access-token#request-access-and-refresh-tokens).
 * This argument can also be specified with the `EQUINIX_API_TOKEN` shell environment variable.
 * 
 */
    public Optional<String> token() {
        return Codegen.stringProp("token").config(config).get();
    }
}
