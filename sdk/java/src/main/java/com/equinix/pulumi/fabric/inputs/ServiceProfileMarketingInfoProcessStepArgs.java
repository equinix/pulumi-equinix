// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileMarketingInfoProcessStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileMarketingInfoProcessStepArgs Empty = new ServiceProfileMarketingInfoProcessStepArgs();

    /**
     * Description of authorization key
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of authorization key
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Sub Title
     * 
     */
    @Import(name="subTitle")
    private @Nullable Output<String> subTitle;

    /**
     * @return Sub Title
     * 
     */
    public Optional<Output<String>> subTitle() {
        return Optional.ofNullable(this.subTitle);
    }

    /**
     * Title
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Title
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private ServiceProfileMarketingInfoProcessStepArgs() {}

    private ServiceProfileMarketingInfoProcessStepArgs(ServiceProfileMarketingInfoProcessStepArgs $) {
        this.description = $.description;
        this.subTitle = $.subTitle;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileMarketingInfoProcessStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileMarketingInfoProcessStepArgs $;

        public Builder() {
            $ = new ServiceProfileMarketingInfoProcessStepArgs();
        }

        public Builder(ServiceProfileMarketingInfoProcessStepArgs defaults) {
            $ = new ServiceProfileMarketingInfoProcessStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of authorization key
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of authorization key
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param subTitle Sub Title
         * 
         * @return builder
         * 
         */
        public Builder subTitle(@Nullable Output<String> subTitle) {
            $.subTitle = subTitle;
            return this;
        }

        /**
         * @param subTitle Sub Title
         * 
         * @return builder
         * 
         */
        public Builder subTitle(String subTitle) {
            return subTitle(Output.of(subTitle));
        }

        /**
         * @param title Title
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public ServiceProfileMarketingInfoProcessStepArgs build() {
            return $;
        }
    }

}
