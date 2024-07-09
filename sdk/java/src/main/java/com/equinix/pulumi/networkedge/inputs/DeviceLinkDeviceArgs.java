// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceLinkDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceLinkDeviceArgs Empty = new DeviceLinkDeviceArgs();

    /**
     * Device ASN number. Not required for self configured devices.
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    /**
     * @return Device ASN number. Not required for self configured devices.
     * 
     */
    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * Device identifier.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Device identifier.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Device network interface identifier to use for device link connection.
     * 
     */
    @Import(name="interfaceId")
    private @Nullable Output<Integer> interfaceId;

    /**
     * @return Device network interface identifier to use for device link connection.
     * 
     */
    public Optional<Output<Integer>> interfaceId() {
        return Optional.ofNullable(this.interfaceId);
    }

    /**
     * IP address from device link subnet that was assigned to the device
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return IP address from device link subnet that was assigned to the device
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private DeviceLinkDeviceArgs() {}

    private DeviceLinkDeviceArgs(DeviceLinkDeviceArgs $) {
        this.asn = $.asn;
        this.id = $.id;
        this.interfaceId = $.interfaceId;
        this.ipAddress = $.ipAddress;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceLinkDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceLinkDeviceArgs $;

        public Builder() {
            $ = new DeviceLinkDeviceArgs();
        }

        public Builder(DeviceLinkDeviceArgs defaults) {
            $ = new DeviceLinkDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asn Device ASN number. Not required for self configured devices.
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn Device ASN number. Not required for self configured devices.
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param id Device identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Device identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param interfaceId Device network interface identifier to use for device link connection.
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(@Nullable Output<Integer> interfaceId) {
            $.interfaceId = interfaceId;
            return this;
        }

        /**
         * @param interfaceId Device network interface identifier to use for device link connection.
         * 
         * @return builder
         * 
         */
        public Builder interfaceId(Integer interfaceId) {
            return interfaceId(Output.of(interfaceId));
        }

        /**
         * @param ipAddress IP address from device link subnet that was assigned to the device
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress IP address from device link subnet that was assigned to the device
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param status device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status device link provisioning status on a given device. One of `PROVISIONING`, `PROVISIONED`, `DEPROVISIONING`, `DEPROVISIONED`, `FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public DeviceLinkDeviceArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("DeviceLinkDeviceArgs", "id");
            }
            return $;
        }
    }

}
