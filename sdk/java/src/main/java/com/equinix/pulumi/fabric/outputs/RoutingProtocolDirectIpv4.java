// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RoutingProtocolDirectIpv4 {
    /**
     * @return Equinix side Interface IP address
     * 
     */
    private String equinixIfaceIp;

    private RoutingProtocolDirectIpv4() {}
    /**
     * @return Equinix side Interface IP address
     * 
     */
    public String equinixIfaceIp() {
        return this.equinixIfaceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingProtocolDirectIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String equinixIfaceIp;
        public Builder() {}
        public Builder(RoutingProtocolDirectIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equinixIfaceIp = defaults.equinixIfaceIp;
        }

        @CustomType.Setter
        public Builder equinixIfaceIp(String equinixIfaceIp) {
            this.equinixIfaceIp = Objects.requireNonNull(equinixIfaceIp);
            return this;
        }
        public RoutingProtocolDirectIpv4 build() {
            final var o = new RoutingProtocolDirectIpv4();
            o.equinixIfaceIp = equinixIfaceIp;
            return o;
        }
    }
}
