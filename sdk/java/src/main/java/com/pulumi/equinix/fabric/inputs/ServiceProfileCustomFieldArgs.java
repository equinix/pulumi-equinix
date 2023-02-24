// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileCustomFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileCustomFieldArgs Empty = new ServiceProfileCustomFieldArgs();

    /**
     * Required field
     * 
     */
    @Import(name="captureInEmail")
    private @Nullable Output<Boolean> captureInEmail;

    /**
     * @return Required field
     * 
     */
    public Optional<Output<Boolean>> captureInEmail() {
        return Optional.ofNullable(this.captureInEmail);
    }

    /**
     * Data type
     * 
     */
    @Import(name="dataType", required=true)
    private Output<String> dataType;

    /**
     * @return Data type
     * 
     */
    public Output<String> dataType() {
        return this.dataType;
    }

    /**
     * Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Label
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return Label
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * Options
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<String>> options;

    /**
     * @return Options
     * 
     */
    public Optional<Output<List<String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Required field
     * 
     */
    @Import(name="required", required=true)
    private Output<Boolean> required;

    /**
     * @return Required field
     * 
     */
    public Output<Boolean> required() {
        return this.required;
    }

    private ServiceProfileCustomFieldArgs() {}

    private ServiceProfileCustomFieldArgs(ServiceProfileCustomFieldArgs $) {
        this.captureInEmail = $.captureInEmail;
        this.dataType = $.dataType;
        this.description = $.description;
        this.label = $.label;
        this.options = $.options;
        this.required = $.required;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileCustomFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileCustomFieldArgs $;

        public Builder() {
            $ = new ServiceProfileCustomFieldArgs();
        }

        public Builder(ServiceProfileCustomFieldArgs defaults) {
            $ = new ServiceProfileCustomFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param captureInEmail Required field
         * 
         * @return builder
         * 
         */
        public Builder captureInEmail(@Nullable Output<Boolean> captureInEmail) {
            $.captureInEmail = captureInEmail;
            return this;
        }

        /**
         * @param captureInEmail Required field
         * 
         * @return builder
         * 
         */
        public Builder captureInEmail(Boolean captureInEmail) {
            return captureInEmail(Output.of(captureInEmail));
        }

        /**
         * @param dataType Data type
         * 
         * @return builder
         * 
         */
        public Builder dataType(Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType Data type
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param label Label
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Label
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param options Options
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<List<String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Options
         * 
         * @return builder
         * 
         */
        public Builder options(List<String> options) {
            return options(Output.of(options));
        }

        /**
         * @param options Options
         * 
         * @return builder
         * 
         */
        public Builder options(String... options) {
            return options(List.of(options));
        }

        /**
         * @param required Required field
         * 
         * @return builder
         * 
         */
        public Builder required(Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Required field
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        public ServiceProfileCustomFieldArgs build() {
            $.dataType = Objects.requireNonNull($.dataType, "expected parameter 'dataType' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.required = Objects.requireNonNull($.required, "expected parameter 'required' to be non-null");
            return $;
        }
    }

}
