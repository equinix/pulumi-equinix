// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceInterfaceArgs Empty = new DeviceInterfaceArgs();

    /**
     * interface management type (Equinix Managed or empty).
     * 
     */
    @Import(name="assignedType")
    private @Nullable Output<String> assignedType;

    /**
     * @return interface management type (Equinix Managed or empty).
     * 
     */
    public Optional<Output<String>> assignedType() {
        return Optional.ofNullable(this.assignedType);
    }

    /**
     * interface identifier.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return interface identifier.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * interface IP address.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return interface IP address.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * interface MAC address.
     * 
     */
    @Import(name="macAddress")
    private @Nullable Output<String> macAddress;

    /**
     * @return interface MAC address.
     * 
     */
    public Optional<Output<String>> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    /**
     * Device name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Device name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * interface operational status. One of `up`, `down`.
     * 
     */
    @Import(name="operationalStatus")
    private @Nullable Output<String> operationalStatus;

    /**
     * @return interface operational status. One of `up`, `down`.
     * 
     */
    public Optional<Output<String>> operationalStatus() {
        return Optional.ofNullable(this.operationalStatus);
    }

    /**
     * interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * interface type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return interface type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DeviceInterfaceArgs() {}

    private DeviceInterfaceArgs(DeviceInterfaceArgs $) {
        this.assignedType = $.assignedType;
        this.id = $.id;
        this.ipAddress = $.ipAddress;
        this.macAddress = $.macAddress;
        this.name = $.name;
        this.operationalStatus = $.operationalStatus;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceInterfaceArgs $;

        public Builder() {
            $ = new DeviceInterfaceArgs();
        }

        public Builder(DeviceInterfaceArgs defaults) {
            $ = new DeviceInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignedType interface management type (Equinix Managed or empty).
         * 
         * @return builder
         * 
         */
        public Builder assignedType(@Nullable Output<String> assignedType) {
            $.assignedType = assignedType;
            return this;
        }

        /**
         * @param assignedType interface management type (Equinix Managed or empty).
         * 
         * @return builder
         * 
         */
        public Builder assignedType(String assignedType) {
            return assignedType(Output.of(assignedType));
        }

        /**
         * @param id interface identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id interface identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param ipAddress interface IP address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress interface IP address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param macAddress interface MAC address.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable Output<String> macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param macAddress interface MAC address.
         * 
         * @return builder
         * 
         */
        public Builder macAddress(String macAddress) {
            return macAddress(Output.of(macAddress));
        }

        /**
         * @param name Device name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Device name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operationalStatus interface operational status. One of `up`, `down`.
         * 
         * @return builder
         * 
         */
        public Builder operationalStatus(@Nullable Output<String> operationalStatus) {
            $.operationalStatus = operationalStatus;
            return this;
        }

        /**
         * @param operationalStatus interface operational status. One of `up`, `down`.
         * 
         * @return builder
         * 
         */
        public Builder operationalStatus(String operationalStatus) {
            return operationalStatus(Output.of(operationalStatus));
        }

        /**
         * @param status interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type interface type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type interface type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeviceInterfaceArgs build() {
            return $;
        }
    }

}