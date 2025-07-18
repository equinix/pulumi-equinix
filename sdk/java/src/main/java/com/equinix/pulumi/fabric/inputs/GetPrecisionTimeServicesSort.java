// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrecisionTimeServicesSort extends com.pulumi.resources.InvokeArgs {

    public static final GetPrecisionTimeServicesSort Empty = new GetPrecisionTimeServicesSort();

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
     * The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
     * 
     */
    @Import(name="property")
    private @Nullable String property;

    /**
     * @return The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }

    private GetPrecisionTimeServicesSort() {}

    private GetPrecisionTimeServicesSort(GetPrecisionTimeServicesSort $) {
        this.direction = $.direction;
        this.property = $.property;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrecisionTimeServicesSort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrecisionTimeServicesSort $;

        public Builder() {
            $ = new GetPrecisionTimeServicesSort();
        }

        public Builder(GetPrecisionTimeServicesSort defaults) {
            $ = new GetPrecisionTimeServicesSort(Objects.requireNonNull(defaults));
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
         * @param property The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
         * 
         * @return builder
         * 
         */
        public Builder property(@Nullable String property) {
            $.property = property;
            return this;
        }

        public GetPrecisionTimeServicesSort build() {
            return $;
        }
    }

}
