// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceProfilesDataPortLocation {
    private String ibx;
    private String metroCode;
    private String metroName;
    private String region;

    private GetServiceProfilesDataPortLocation() {}
    public String ibx() {
        return this.ibx;
    }
    public String metroCode() {
        return this.metroCode;
    }
    public String metroName() {
        return this.metroName;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesDataPortLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ibx;
        private String metroCode;
        private String metroName;
        private String region;
        public Builder() {}
        public Builder(GetServiceProfilesDataPortLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ibx = defaults.ibx;
    	      this.metroCode = defaults.metroCode;
    	      this.metroName = defaults.metroName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder ibx(String ibx) {
            this.ibx = Objects.requireNonNull(ibx);
            return this;
        }
        @CustomType.Setter
        public Builder metroCode(String metroCode) {
            this.metroCode = Objects.requireNonNull(metroCode);
            return this;
        }
        @CustomType.Setter
        public Builder metroName(String metroName) {
            this.metroName = Objects.requireNonNull(metroName);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetServiceProfilesDataPortLocation build() {
            final var o = new GetServiceProfilesDataPortLocation();
            o.ibx = ibx;
            o.metroCode = metroCode;
            o.metroName = metroName;
            o.region = region;
            return o;
        }
    }
}
