// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkArgs Empty = new GetNetworkArgs();

    @Import(name="uuid", required=true)
    private Output<String> uuid;

    public Output<String> uuid() {
        return this.uuid;
    }

    private GetNetworkArgs() {}

    private GetNetworkArgs(GetNetworkArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkArgs $;

        public Builder() {
            $ = new GetNetworkArgs();
        }

        public Builder(GetNetworkArgs defaults) {
            $ = new GetNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetNetworkArgs build() {
            $.uuid = Objects.requireNonNull($.uuid, "expected parameter 'uuid' to be non-null");
            return $;
        }
    }

}