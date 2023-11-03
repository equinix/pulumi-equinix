// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceProfilesDatumMarketingInfoProcessStep {
    private String description;
    private String subTitle;
    private String title;

    private GetServiceProfilesDatumMarketingInfoProcessStep() {}
    public String description() {
        return this.description;
    }
    public String subTitle() {
        return this.subTitle;
    }
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesDatumMarketingInfoProcessStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String subTitle;
        private String title;
        public Builder() {}
        public Builder(GetServiceProfilesDatumMarketingInfoProcessStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.subTitle = defaults.subTitle;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder subTitle(String subTitle) {
            this.subTitle = Objects.requireNonNull(subTitle);
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
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
