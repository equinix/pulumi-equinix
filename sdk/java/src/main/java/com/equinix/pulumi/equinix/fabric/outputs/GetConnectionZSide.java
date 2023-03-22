// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.outputs;

import com.equinix.pulumi.equinix.fabric.outputs.GetConnectionZSideAccessPoint;
import com.equinix.pulumi.equinix.fabric.outputs.GetConnectionZSideServiceToken;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetConnectionZSide {
    private GetConnectionZSideAccessPoint accessPoint;
    private GetConnectionZSideServiceToken serviceToken;

    private GetConnectionZSide() {}
    public GetConnectionZSideAccessPoint accessPoint() {
        return this.accessPoint;
    }
    public GetConnectionZSideServiceToken serviceToken() {
        return this.serviceToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionZSide defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetConnectionZSideAccessPoint accessPoint;
        private GetConnectionZSideServiceToken serviceToken;
        public Builder() {}
        public Builder(GetConnectionZSide defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPoint = defaults.accessPoint;
    	      this.serviceToken = defaults.serviceToken;
        }

        @CustomType.Setter
        public Builder accessPoint(GetConnectionZSideAccessPoint accessPoint) {
            this.accessPoint = Objects.requireNonNull(accessPoint);
            return this;
        }
        @CustomType.Setter
        public Builder serviceToken(GetConnectionZSideServiceToken serviceToken) {
            this.serviceToken = Objects.requireNonNull(serviceToken);
            return this;
        }
        public GetConnectionZSide build() {
            final var o = new GetConnectionZSide();
            o.accessPoint = accessPoint;
            o.serviceToken = serviceToken;
            return o;
        }
    }
}
