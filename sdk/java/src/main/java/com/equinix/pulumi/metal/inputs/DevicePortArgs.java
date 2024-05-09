// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DevicePortArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePortArgs Empty = new DevicePortArgs();

    /**
     * Whether this port is part of a bond in bonded network setup.
     * 
     */
    @Import(name="bonded")
    private @Nullable Output<Boolean> bonded;

    /**
     * @return Whether this port is part of a bond in bonded network setup.
     * 
     */
    public Optional<Output<Boolean>> bonded() {
        return Optional.ofNullable(this.bonded);
    }

    /**
     * ID of the port.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the port.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * MAC address assigned to the port.
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return MAC address assigned to the port.
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * Name of the port (e.g. `eth0`, or `bond0`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the port (e.g. `eth0`, or `bond0`).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of the port (e.g. `NetworkPort` or `NetworkBondPort`).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the port (e.g. `NetworkPort` or `NetworkBondPort`).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DevicePortArgs() {}

    private DevicePortArgs(DevicePortArgs $) {
        this.bonded = $.bonded;
        this.id = $.id;
        this.mac = $.mac;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePortArgs $;

        public Builder() {
            $ = new DevicePortArgs();
        }

        public Builder(DevicePortArgs defaults) {
            $ = new DevicePortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bonded Whether this port is part of a bond in bonded network setup.
         * 
         * @return builder
         * 
         */
        public Builder bonded(@Nullable Output<Boolean> bonded) {
            $.bonded = bonded;
            return this;
        }

        /**
         * @param bonded Whether this port is part of a bond in bonded network setup.
         * 
         * @return builder
         * 
         */
        public Builder bonded(Boolean bonded) {
            return bonded(Output.of(bonded));
        }

        /**
         * @param id ID of the port.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the port.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param mac MAC address assigned to the port.
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac MAC address assigned to the port.
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param name Name of the port (e.g. `eth0`, or `bond0`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the port (e.g. `eth0`, or `bond0`).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of the port (e.g. `NetworkPort` or `NetworkBondPort`).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the port (e.g. `NetworkPort` or `NetworkBondPort`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DevicePortArgs build() {
            return $;
        }
    }

}
