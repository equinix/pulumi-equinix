// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfilesDatumMarketingInfoProcessStep {
    /**
     * @return Description
     * 
     */
    private @Nullable String description;
    /**
     * @return Sub Title
     * 
     */
    private @Nullable String subTitle;
    /**
     * @return Title
     * 
     */
    private @Nullable String title;

    private GetServiceProfilesDatumMarketingInfoProcessStep() {}
    /**
     * @return Description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Sub Title
     * 
     */
    public Optional<String> subTitle() {
        return Optional.ofNullable(this.subTitle);
    }
    /**
     * @return Title
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesDatumMarketingInfoProcessStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String subTitle;
        private @Nullable String title;
        public Builder() {}
        public Builder(GetServiceProfilesDatumMarketingInfoProcessStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.subTitle = defaults.subTitle;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder subTitle(@Nullable String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public GetServiceProfilesDatumMarketingInfoProcessStep build() {
            final var _resultValue = new GetServiceProfilesDatumMarketingInfoProcessStep();
            _resultValue.description = description;
            _resultValue.subTitle = subTitle;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
