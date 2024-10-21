// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoutingProtocolBgpIpv4Args extends com.pulumi.resources.ResourceArgs {

    public static final RoutingProtocolBgpIpv4Args Empty = new RoutingProtocolBgpIpv4Args();

    /**
     * Customer side peering ip
     * 
     */
    @Import(name="customerPeerIp", required=true)
    private Output<String> customerPeerIp;

    /**
     * @return Customer side peering ip
     * 
     */
    public Output<String> customerPeerIp() {
        return this.customerPeerIp;
    }

    /**
     * Admin status for the BGP session
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Admin status for the BGP session
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Equinix side peering ip
     * 
     */
    @Import(name="equinixPeerIp")
    private @Nullable Output<String> equinixPeerIp;

    /**
     * @return Equinix side peering ip
     * 
     */
    public Optional<Output<String>> equinixPeerIp() {
        return Optional.ofNullable(this.equinixPeerIp);
    }

    /**
     * Inbound Multi Exit Discriminator attribute
     * 
     */
    @Import(name="inboundMed")
    private @Nullable Output<Integer> inboundMed;

    /**
     * @return Inbound Multi Exit Discriminator attribute
     * 
     */
    public Optional<Output<Integer>> inboundMed() {
        return Optional.ofNullable(this.inboundMed);
    }

    /**
     * AS path prepend count. One of: 0, 1, 3, 5
     * 
     */
    @Import(name="outboundAsPrependCount")
    private @Nullable Output<String> outboundAsPrependCount;

    /**
     * @return AS path prepend count. One of: 0, 1, 3, 5
     * 
     */
    public Optional<Output<String>> outboundAsPrependCount() {
        return Optional.ofNullable(this.outboundAsPrependCount);
    }

    /**
     * Outbound Multi Exit Discriminator attribute
     * 
     */
    @Import(name="outboundMed")
    private @Nullable Output<Integer> outboundMed;

    /**
     * @return Outbound Multi Exit Discriminator attribute
     * 
     */
    public Optional<Output<Integer>> outboundMed() {
        return Optional.ofNullable(this.outboundMed);
    }

    private RoutingProtocolBgpIpv4Args() {}

    private RoutingProtocolBgpIpv4Args(RoutingProtocolBgpIpv4Args $) {
        this.customerPeerIp = $.customerPeerIp;
        this.enabled = $.enabled;
        this.equinixPeerIp = $.equinixPeerIp;
        this.inboundMed = $.inboundMed;
        this.outboundAsPrependCount = $.outboundAsPrependCount;
        this.outboundMed = $.outboundMed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingProtocolBgpIpv4Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingProtocolBgpIpv4Args $;

        public Builder() {
            $ = new RoutingProtocolBgpIpv4Args();
        }

        public Builder(RoutingProtocolBgpIpv4Args defaults) {
            $ = new RoutingProtocolBgpIpv4Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerPeerIp Customer side peering ip
         * 
         * @return builder
         * 
         */
        public Builder customerPeerIp(Output<String> customerPeerIp) {
            $.customerPeerIp = customerPeerIp;
            return this;
        }

        /**
         * @param customerPeerIp Customer side peering ip
         * 
         * @return builder
         * 
         */
        public Builder customerPeerIp(String customerPeerIp) {
            return customerPeerIp(Output.of(customerPeerIp));
        }

        /**
         * @param enabled Admin status for the BGP session
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Admin status for the BGP session
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param equinixPeerIp Equinix side peering ip
         * 
         * @return builder
         * 
         */
        public Builder equinixPeerIp(@Nullable Output<String> equinixPeerIp) {
            $.equinixPeerIp = equinixPeerIp;
            return this;
        }

        /**
         * @param equinixPeerIp Equinix side peering ip
         * 
         * @return builder
         * 
         */
        public Builder equinixPeerIp(String equinixPeerIp) {
            return equinixPeerIp(Output.of(equinixPeerIp));
        }

        /**
         * @param inboundMed Inbound Multi Exit Discriminator attribute
         * 
         * @return builder
         * 
         */
        public Builder inboundMed(@Nullable Output<Integer> inboundMed) {
            $.inboundMed = inboundMed;
            return this;
        }

        /**
         * @param inboundMed Inbound Multi Exit Discriminator attribute
         * 
         * @return builder
         * 
         */
        public Builder inboundMed(Integer inboundMed) {
            return inboundMed(Output.of(inboundMed));
        }

        /**
         * @param outboundAsPrependCount AS path prepend count. One of: 0, 1, 3, 5
         * 
         * @return builder
         * 
         */
        public Builder outboundAsPrependCount(@Nullable Output<String> outboundAsPrependCount) {
            $.outboundAsPrependCount = outboundAsPrependCount;
            return this;
        }

        /**
         * @param outboundAsPrependCount AS path prepend count. One of: 0, 1, 3, 5
         * 
         * @return builder
         * 
         */
        public Builder outboundAsPrependCount(String outboundAsPrependCount) {
            return outboundAsPrependCount(Output.of(outboundAsPrependCount));
        }

        /**
         * @param outboundMed Outbound Multi Exit Discriminator attribute
         * 
         * @return builder
         * 
         */
        public Builder outboundMed(@Nullable Output<Integer> outboundMed) {
            $.outboundMed = outboundMed;
            return this;
        }

        /**
         * @param outboundMed Outbound Multi Exit Discriminator attribute
         * 
         * @return builder
         * 
         */
        public Builder outboundMed(Integer outboundMed) {
            return outboundMed(Output.of(outboundMed));
        }

        public RoutingProtocolBgpIpv4Args build() {
            if ($.customerPeerIp == null) {
                throw new MissingRequiredPropertyException("RoutingProtocolBgpIpv4Args", "customerPeerIp");
            }
            return $;
        }
    }

}
