// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPortArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPortArgs Empty = new GetPortArgs();

    /**
     * Equinix-assigned port identifier
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return Equinix-assigned port identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private GetPortArgs() {}

    private GetPortArgs(GetPortArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPortArgs $;

        public Builder() {
            $ = new GetPortArgs();
        }

        public Builder(GetPortArgs defaults) {
            $ = new GetPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uuid Equinix-assigned port identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned port identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPortArgs build() {
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("GetPortArgs", "uuid");
            }
            return $;
        }
    }

}
