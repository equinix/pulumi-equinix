// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudRouterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudRouterArgs Empty = new GetCloudRouterArgs();

    /**
     * Equinix-assigned Fabric Cloud Router identifier
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return Equinix-assigned Fabric Cloud Router identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private GetCloudRouterArgs() {}

    private GetCloudRouterArgs(GetCloudRouterArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudRouterArgs $;

        public Builder() {
            $ = new GetCloudRouterArgs();
        }

        public Builder(GetCloudRouterArgs defaults) {
            $ = new GetCloudRouterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uuid Equinix-assigned Fabric Cloud Router identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned Fabric Cloud Router identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetCloudRouterArgs build() {
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("GetCloudRouterArgs", "uuid");
            }
            return $;
        }
    }

}
