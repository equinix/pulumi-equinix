// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRoutingProtocolBgpIpv4 {
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
    private String equinixPeerIp;
    /**
     * @return Inbound Multi Exit Discriminator attribute
     * 
     */
    private Integer inboundMed;
    /**
     * @return AS path prepend count. One of: 0, 1, 3, 5
     * 
     */
    private String outboundAsPrependCount;
    /**
     * @return Outbound Multi Exit Discriminator attribute
     * 
     */
    private Integer outboundMed;

    private GetRoutingProtocolBgpIpv4() {}
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
    public String equinixPeerIp() {
        return this.equinixPeerIp;
    }
    /**
     * @return Inbound Multi Exit Discriminator attribute
     * 
     */
    public Integer inboundMed() {
        return this.inboundMed;
    }
    /**
     * @return AS path prepend count. One of: 0, 1, 3, 5
     * 
     */
    public String outboundAsPrependCount() {
        return this.outboundAsPrependCount;
    }
    /**
     * @return Outbound Multi Exit Discriminator attribute
     * 
     */
    public Integer outboundMed() {
        return this.outboundMed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingProtocolBgpIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customerPeerIp;
        private @Nullable Boolean enabled;
        private String equinixPeerIp;
        private Integer inboundMed;
        private String outboundAsPrependCount;
        private Integer outboundMed;
        public Builder() {}
        public Builder(GetRoutingProtocolBgpIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerPeerIp = defaults.customerPeerIp;
    	      this.enabled = defaults.enabled;
    	      this.equinixPeerIp = defaults.equinixPeerIp;
    	      this.inboundMed = defaults.inboundMed;
    	      this.outboundAsPrependCount = defaults.outboundAsPrependCount;
    	      this.outboundMed = defaults.outboundMed;
        }

        @CustomType.Setter
        public Builder customerPeerIp(String customerPeerIp) {
            if (customerPeerIp == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolBgpIpv4", "customerPeerIp");
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
        public Builder equinixPeerIp(String equinixPeerIp) {
            if (equinixPeerIp == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolBgpIpv4", "equinixPeerIp");
            }
            this.equinixPeerIp = equinixPeerIp;
            return this;
        }
        @CustomType.Setter
        public Builder inboundMed(Integer inboundMed) {
            if (inboundMed == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolBgpIpv4", "inboundMed");
            }
            this.inboundMed = inboundMed;
            return this;
        }
        @CustomType.Setter
        public Builder outboundAsPrependCount(String outboundAsPrependCount) {
            if (outboundAsPrependCount == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolBgpIpv4", "outboundAsPrependCount");
            }
            this.outboundAsPrependCount = outboundAsPrependCount;
            return this;
        }
        @CustomType.Setter
        public Builder outboundMed(Integer outboundMed) {
            if (outboundMed == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolBgpIpv4", "outboundMed");
            }
            this.outboundMed = outboundMed;
            return this;
        }
        public GetRoutingProtocolBgpIpv4 build() {
            final var _resultValue = new GetRoutingProtocolBgpIpv4();
            _resultValue.customerPeerIp = customerPeerIp;
            _resultValue.enabled = enabled;
            _resultValue.equinixPeerIp = equinixPeerIp;
            _resultValue.inboundMed = inboundMed;
            _resultValue.outboundAsPrependCount = outboundAsPrependCount;
            _resultValue.outboundMed = outboundMed;
            return _resultValue;
        }
    }
}
