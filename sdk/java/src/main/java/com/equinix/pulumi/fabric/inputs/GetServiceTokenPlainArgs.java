// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTokenPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTokenPlainArgs Empty = new GetServiceTokenPlainArgs();

    /**
     * Equinix-assigned service token identifier
     * 
     */
    @Import(name="uuid", required=true)
    private String uuid;

    /**
     * @return Equinix-assigned service token identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    private GetServiceTokenPlainArgs() {}

    private GetServiceTokenPlainArgs(GetServiceTokenPlainArgs $) {
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTokenPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTokenPlainArgs $;

        public Builder() {
            $ = new GetServiceTokenPlainArgs();
        }

        public Builder(GetServiceTokenPlainArgs defaults) {
            $ = new GetServiceTokenPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uuid Equinix-assigned service token identifier
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetServiceTokenPlainArgs build() {
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("GetServiceTokenPlainArgs", "uuid");
            }
            return $;
        }
    }

}