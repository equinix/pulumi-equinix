// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionASideAdditionalInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionASideAdditionalInfoArgs Empty = new ConnectionASideAdditionalInfoArgs();

    /**
     * Additional information key
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Additional information key
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Additional information value
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Additional information value
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ConnectionASideAdditionalInfoArgs() {}

    private ConnectionASideAdditionalInfoArgs(ConnectionASideAdditionalInfoArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionASideAdditionalInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionASideAdditionalInfoArgs $;

        public Builder() {
            $ = new ConnectionASideAdditionalInfoArgs();
        }

        public Builder(ConnectionASideAdditionalInfoArgs defaults) {
            $ = new ConnectionASideAdditionalInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Additional information key
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Additional information key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Additional information value
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Additional information value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConnectionASideAdditionalInfoArgs build() {
            return $;
        }
    }

}
