// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs Empty = new ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs();

    /**
     * User-provided service description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided service description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    @Import(name="required")
    private @Nullable Output<Boolean> required;

    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    private ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs() {}

    private ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs $) {
        this.description = $.description;
        this.label = $.label;
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs $;

        public Builder() {
            $ = new ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs();
        }

        public Builder(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs defaults) {
            $ = new ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User-provided service description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided service description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs build() {
            return $;
        }
    }

}
