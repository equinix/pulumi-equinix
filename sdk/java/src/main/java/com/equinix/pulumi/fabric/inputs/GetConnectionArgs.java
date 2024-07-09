// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    /**
     * Equinix-assigned connection identifier
     * 
     */
    @Import(name="uuid", required=true)
    private Output<String> uuid;

    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    private GetConnectionArgs() {}

    private GetConnectionArgs(GetConnectionArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionArgs $;

        public Builder() {
            $ = new GetConnectionArgs();
        }

        public Builder(GetConnectionArgs defaults) {
            $ = new GetConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uuid Equinix-assigned connection identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Equinix-assigned connection identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetConnectionArgs build() {
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("GetConnectionArgs", "uuid");
            }
            return $;
        }
    }

}
