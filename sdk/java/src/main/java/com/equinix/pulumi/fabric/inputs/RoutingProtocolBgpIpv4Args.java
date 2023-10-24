// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
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

    private RoutingProtocolBgpIpv4Args() {}

    private RoutingProtocolBgpIpv4Args(RoutingProtocolBgpIpv4Args $) {
        this.customerPeerIp = $.customerPeerIp;
        this.enabled = $.enabled;
        this.equinixPeerIp = $.equinixPeerIp;
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

        public RoutingProtocolBgpIpv4Args build() {
            $.customerPeerIp = Objects.requireNonNull($.customerPeerIp, "expected parameter 'customerPeerIp' to be non-null");
            return $;
        }
    }

}
