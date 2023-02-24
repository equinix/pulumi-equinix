// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionPlainArgs Empty = new GetConnectionPlainArgs();

    /**
     * ID of the connection resource.
     * 
     */
    @Import(name="connectionId", required=true)
    private String connectionId;

    /**
     * @return ID of the connection resource.
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }

    private GetConnectionPlainArgs() {}

    private GetConnectionPlainArgs(GetConnectionPlainArgs $) {
        this.connectionId = $.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionPlainArgs $;

        public Builder() {
            $ = new GetConnectionPlainArgs();
        }

        public Builder(GetConnectionPlainArgs defaults) {
            $ = new GetConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId ID of the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        public GetConnectionPlainArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            return $;
        }
    }

}
