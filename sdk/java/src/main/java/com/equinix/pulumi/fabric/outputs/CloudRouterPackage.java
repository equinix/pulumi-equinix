// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudRouterPackage {
    /**
     * @return Fabric Cloud Router package code
     * 
     */
    private String code;

    private CloudRouterPackage() {}
    /**
     * @return Fabric Cloud Router package code
     * 
     */
    public String code() {
        return this.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRouterPackage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        public Builder() {}
        public Builder(CloudRouterPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        @CustomType.Setter
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public CloudRouterPackage build() {
            final var _resultValue = new CloudRouterPackage();
            _resultValue.code = code;
            return _resultValue;
        }
    }
}
