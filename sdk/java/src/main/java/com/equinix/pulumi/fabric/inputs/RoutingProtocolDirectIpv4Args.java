// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RoutingProtocolDirectIpv4Args extends com.pulumi.resources.ResourceArgs {

    public static final RoutingProtocolDirectIpv4Args Empty = new RoutingProtocolDirectIpv4Args();

    /**
     * Equinix side Interface IP address
     * 
     */
    @Import(name="equinixIfaceIp", required=true)
    private Output<String> equinixIfaceIp;

    /**
     * @return Equinix side Interface IP address
     * 
     */
    public Output<String> equinixIfaceIp() {
        return this.equinixIfaceIp;
    }

    private RoutingProtocolDirectIpv4Args() {}

    private RoutingProtocolDirectIpv4Args(RoutingProtocolDirectIpv4Args $) {
        this.equinixIfaceIp = $.equinixIfaceIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingProtocolDirectIpv4Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingProtocolDirectIpv4Args $;

        public Builder() {
            $ = new RoutingProtocolDirectIpv4Args();
        }

        public Builder(RoutingProtocolDirectIpv4Args defaults) {
            $ = new RoutingProtocolDirectIpv4Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param equinixIfaceIp Equinix side Interface IP address
         * 
         * @return builder
         * 
         */
        public Builder equinixIfaceIp(Output<String> equinixIfaceIp) {
            $.equinixIfaceIp = equinixIfaceIp;
            return this;
        }

        /**
         * @param equinixIfaceIp Equinix side Interface IP address
         * 
         * @return builder
         * 
         */
        public Builder equinixIfaceIp(String equinixIfaceIp) {
            return equinixIfaceIp(Output.of(equinixIfaceIp));
        }

        public RoutingProtocolDirectIpv4Args build() {
            if ($.equinixIfaceIp == null) {
                throw new MissingRequiredPropertyException("RoutingProtocolDirectIpv4Args", "equinixIfaceIp");
            }
            return $;
        }
    }

}
