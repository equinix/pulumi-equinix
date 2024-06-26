// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksSort extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksSort Empty = new GetNetworksSort();

    /**
     * The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    @Import(name="direction")
    private @Nullable String direction;

    /**
     * @return The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * The property name to use in sorting. One of [/name /uuid /scope /operation/equinixStatus /location/region /changeLog/createdDateTime /changeLog/updatedDateTime]. Defaults to /changeLog/updatedDateTime
     * 
     */
    @Import(name="property")
    private @Nullable String property;

    /**
     * @return The property name to use in sorting. One of [/name /uuid /scope /operation/equinixStatus /location/region /changeLog/createdDateTime /changeLog/updatedDateTime]. Defaults to /changeLog/updatedDateTime
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }

    private GetNetworksSort() {}

    private GetNetworksSort(GetNetworksSort $) {
        this.direction = $.direction;
        this.property = $.property;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksSort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksSort $;

        public Builder() {
            $ = new GetNetworksSort();
        }

        public Builder(GetNetworksSort defaults) {
            $ = new GetNetworksSort(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable String direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param property The property name to use in sorting. One of [/name /uuid /scope /operation/equinixStatus /location/region /changeLog/createdDateTime /changeLog/updatedDateTime]. Defaults to /changeLog/updatedDateTime
         * 
         * @return builder
         * 
         */
        public Builder property(@Nullable String property) {
            $.property = property;
            return this;
        }

        public GetNetworksSort build() {
            return $;
        }
    }

}
