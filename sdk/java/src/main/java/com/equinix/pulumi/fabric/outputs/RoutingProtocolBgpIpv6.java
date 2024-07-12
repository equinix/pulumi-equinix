// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingProtocolBgpIpv6 {
    /**
     * @return Customer side peering ip
     * 
     */
    private String customerPeerIp;
    /**
     * @return Admin status for the BGP session
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Equinix side peering ip
     * 
     */
    private @Nullable String equinixPeerIp;

    private RoutingProtocolBgpIpv6() {}
    /**
     * @return Customer side peering ip
     * 
     */
    public String customerPeerIp() {
        return this.customerPeerIp;
    }
    /**
     * @return Admin status for the BGP session
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Equinix side peering ip
     * 
     */
    public Optional<String> equinixPeerIp() {
        return Optional.ofNullable(this.equinixPeerIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingProtocolBgpIpv6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customerPeerIp;
        private @Nullable Boolean enabled;
        private @Nullable String equinixPeerIp;
        public Builder() {}
        public Builder(RoutingProtocolBgpIpv6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerPeerIp = defaults.customerPeerIp;
    	      this.enabled = defaults.enabled;
    	      this.equinixPeerIp = defaults.equinixPeerIp;
        }

        @CustomType.Setter
        public Builder customerPeerIp(String customerPeerIp) {
            if (customerPeerIp == null) {
              throw new MissingRequiredPropertyException("RoutingProtocolBgpIpv6", "customerPeerIp");
            }
            this.customerPeerIp = customerPeerIp;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder equinixPeerIp(@Nullable String equinixPeerIp) {

            this.equinixPeerIp = equinixPeerIp;
            return this;
        }
        public RoutingProtocolBgpIpv6 build() {
            final var _resultValue = new RoutingProtocolBgpIpv6();
            _resultValue.customerPeerIp = customerPeerIp;
            _resultValue.enabled = enabled;
            _resultValue.equinixPeerIp = equinixPeerIp;
            return _resultValue;
        }
    }
}
