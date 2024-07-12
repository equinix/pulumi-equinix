// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointLocation {
    /**
     * @return IBX Code
     * 
     */
    private String ibx;
    /**
     * @return Access point metro code
     * 
     */
    private String metroCode;
    /**
     * @return Access point metro name
     * 
     */
    private String metroName;
    /**
     * @return Access point region
     * 
     */
    private String region;

    private GetConnectionASideAccessPointLocation() {}
    /**
     * @return IBX Code
     * 
     */
    public String ibx() {
        return this.ibx;
    }
    /**
     * @return Access point metro code
     * 
     */
    public String metroCode() {
        return this.metroCode;
    }
    /**
     * @return Access point metro name
     * 
     */
    public String metroName() {
        return this.metroName;
    }
    /**
     * @return Access point region
     * 
     */
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ibx;
        private String metroCode;
        private String metroName;
        private String region;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ibx = defaults.ibx;
    	      this.metroCode = defaults.metroCode;
    	      this.metroName = defaults.metroName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder ibx(String ibx) {
            if (ibx == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointLocation", "ibx");
            }
            this.ibx = ibx;
            return this;
        }
        @CustomType.Setter
        public Builder metroCode(String metroCode) {
            if (metroCode == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointLocation", "metroCode");
            }
            this.metroCode = metroCode;
            return this;
        }
        @CustomType.Setter
        public Builder metroName(String metroName) {
            if (metroName == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointLocation", "metroName");
            }
            this.metroName = metroName;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointLocation", "region");
            }
            this.region = region;
            return this;
        }
        public GetConnectionASideAccessPointLocation build() {
            final var _resultValue = new GetConnectionASideAccessPointLocation();
            _resultValue.ibx = ibx;
            _resultValue.metroCode = metroCode;
            _resultValue.metroName = metroName;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
