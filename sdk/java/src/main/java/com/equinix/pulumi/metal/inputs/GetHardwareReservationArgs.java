// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHardwareReservationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHardwareReservationArgs Empty = new GetHardwareReservationArgs();

    /**
     * UUID of device occupying the reservation.
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return UUID of device occupying the reservation.
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * ID of the hardware reservation.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the hardware reservation.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetHardwareReservationArgs() {}

    private GetHardwareReservationArgs(GetHardwareReservationArgs $) {
        this.deviceId = $.deviceId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHardwareReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHardwareReservationArgs $;

        public Builder() {
            $ = new GetHardwareReservationArgs();
        }

        public Builder(GetHardwareReservationArgs defaults) {
            $ = new GetHardwareReservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId UUID of device occupying the reservation.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId UUID of device occupying the reservation.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param id ID of the hardware reservation.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the hardware reservation.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetHardwareReservationArgs build() {
            return $;
        }
    }

}
