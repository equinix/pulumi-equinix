// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrecisionTimeServicesDataPackage {
    /**
     * @return Time Precision Package Code for the desired billing package
     * 
     */
    private String code;
    /**
     * @return Time Precision Package HREF link to corresponding resource in Equinix Portal
     * 
     */
    private String href;

    private GetPrecisionTimeServicesDataPackage() {}
    /**
     * @return Time Precision Package Code for the desired billing package
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Time Precision Package HREF link to corresponding resource in Equinix Portal
     * 
     */
    public String href() {
        return this.href;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrecisionTimeServicesDataPackage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private String href;
        public Builder() {}
        public Builder(GetPrecisionTimeServicesDataPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.href = defaults.href;
        }

        @CustomType.Setter
        public Builder code(String code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetPrecisionTimeServicesDataPackage", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetPrecisionTimeServicesDataPackage", "href");
            }
            this.href = href;
            return this;
        }
        public GetPrecisionTimeServicesDataPackage build() {
            final var _resultValue = new GetPrecisionTimeServicesDataPackage();
            _resultValue.code = code;
            _resultValue.href = href;
            return _resultValue;
        }
    }
}
