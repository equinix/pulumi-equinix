// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrecisionTimeServicesSortArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPrecisionTimeServicesSortArgs Empty = new GetPrecisionTimeServicesSortArgs();

    /**
     * The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
     * 
     */
    @Import(name="property")
    private @Nullable Output<String> property;

    /**
     * @return The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
     * 
     */
    public Optional<Output<String>> property() {
        return Optional.ofNullable(this.property);
    }

    private GetPrecisionTimeServicesSortArgs() {}

    private GetPrecisionTimeServicesSortArgs(GetPrecisionTimeServicesSortArgs $) {
        this.direction = $.direction;
        this.property = $.property;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrecisionTimeServicesSortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrecisionTimeServicesSortArgs $;

        public Builder() {
            $ = new GetPrecisionTimeServicesSortArgs();
        }

        public Builder(GetPrecisionTimeServicesSortArgs defaults) {
            $ = new GetPrecisionTimeServicesSortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param property The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
         * 
         * @return builder
         * 
         */
        public Builder property(@Nullable Output<String> property) {
            $.property = property;
            return this;
        }

        /**
         * @param property The property name to use in sorting. One of [/name /uuid /state /type /package/code /changeLog/createdDateTime /changeLog/updatedDateTime] Defaults to /name
         * 
         * @return builder
         * 
         */
        public Builder property(String property) {
            return property(Output.of(property));
        }

        public GetPrecisionTimeServicesSortArgs build() {
            return $;
        }
    }

}
