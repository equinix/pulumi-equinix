// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTokenArgs Empty = new GetServiceTokenArgs();

    /**
     * Equinix-assigned service token identifier
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return Equinix-assigned service token identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private GetServiceTokenArgs() {}

    private GetServiceTokenArgs(GetServiceTokenArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTokenArgs $;

        public Builder() {
            $ = new GetServiceTokenArgs();
        }

        public Builder(GetServiceTokenArgs defaults) {
            $ = new GetServiceTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uuid Equinix-assigned service token identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned service token identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetServiceTokenArgs build() {
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("GetServiceTokenArgs", "uuid");
            }
            return $;
        }
    }

}