// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    /**
     * UUID of the metal gateway resource to retrieve.
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return UUID of the metal gateway resource to retrieve.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    private GetGatewayArgs() {}

    private GetGatewayArgs(GetGatewayArgs $) {
        this.gatewayId = $.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayArgs $;

        public Builder() {
            $ = new GetGatewayArgs();
        }

        public Builder(GetGatewayArgs defaults) {
            $ = new GetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayId UUID of the metal gateway resource to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId UUID of the metal gateway resource to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        public GetGatewayArgs build() {
            if ($.gatewayId == null) {
                throw new MissingRequiredPropertyException("GetGatewayArgs", "gatewayId");
            }
            return $;
        }
    }

}
