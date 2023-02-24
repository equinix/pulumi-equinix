// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceNetworkArgs Empty = new DeviceNetworkArgs();

    /**
     * IPv4 or IPv6 address string.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return IPv4 or IPv6 address string.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * CIDR suffix for IP address block to be assigned, i.e. amount of addresses.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<Integer> cidr;

    /**
     * @return CIDR suffix for IP address block to be assigned, i.e. amount of addresses.
     * 
     */
    public Optional<Output<Integer>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * IP version. One of `4`, `6`.
     * 
     */
    @Import(name="family")
    private @Nullable Output<Integer> family;

    /**
     * @return IP version. One of `4`, `6`.
     * 
     */
    public Optional<Output<Integer>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * Address of router.
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return Address of router.
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Whether the address is routable from the Internet.
     * 
     */
    @Import(name="public")
    private @Nullable Output<Boolean> public_;

    /**
     * @return Whether the address is routable from the Internet.
     * 
     */
    public Optional<Output<Boolean>> public_() {
        return Optional.ofNullable(this.public_);
    }

    private DeviceNetworkArgs() {}

    private DeviceNetworkArgs(DeviceNetworkArgs $) {
        this.address = $.address;
        this.cidr = $.cidr;
        this.family = $.family;
        this.gateway = $.gateway;
        this.public_ = $.public_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceNetworkArgs $;

        public Builder() {
            $ = new DeviceNetworkArgs();
        }

        public Builder(DeviceNetworkArgs defaults) {
            $ = new DeviceNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address IPv4 or IPv6 address string.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address IPv4 or IPv6 address string.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param cidr CIDR suffix for IP address block to be assigned, i.e. amount of addresses.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<Integer> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr CIDR suffix for IP address block to be assigned, i.e. amount of addresses.
         * 
         * @return builder
         * 
         */
        public Builder cidr(Integer cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param family IP version. One of `4`, `6`.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<Integer> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family IP version. One of `4`, `6`.
         * 
         * @return builder
         * 
         */
        public Builder family(Integer family) {
            return family(Output.of(family));
        }

        /**
         * @param gateway Address of router.
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway Address of router.
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param public_ Whether the address is routable from the Internet.
         * 
         * @return builder
         * 
         */
        public Builder public_(@Nullable Output<Boolean> public_) {
            $.public_ = public_;
            return this;
        }

        /**
         * @param public_ Whether the address is routable from the Internet.
         * 
         * @return builder
         * 
         */
        public Builder public_(Boolean public_) {
            return public_(Output.of(public_));
        }

        public DeviceNetworkArgs build() {
            return $;
        }
    }

}
