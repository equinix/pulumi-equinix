// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceIpAddress {
    /**
     * @return CIDR suffix for IP block assigned to this device
     * 
     */
    private @Nullable Integer cidr;
    /**
     * @return IDs of reservations to pick the blocks from
     * 
     */
    private @Nullable List<String> reservationIds;
    /**
     * @return one of public*ipv4,private*ipv4,public_ipv6
     * 
     */
    private String type;

    private DeviceIpAddress() {}
    /**
     * @return CIDR suffix for IP block assigned to this device
     * 
     */
    public Optional<Integer> cidr() {
        return Optional.ofNullable(this.cidr);
    }
    /**
     * @return IDs of reservations to pick the blocks from
     * 
     */
    public List<String> reservationIds() {
        return this.reservationIds == null ? List.of() : this.reservationIds;
    }
    /**
     * @return one of public*ipv4,private*ipv4,public_ipv6
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceIpAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cidr;
        private @Nullable List<String> reservationIds;
        private String type;
        public Builder() {}
        public Builder(DeviceIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.reservationIds = defaults.reservationIds;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder cidr(@Nullable Integer cidr) {

            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder reservationIds(@Nullable List<String> reservationIds) {

            this.reservationIds = reservationIds;
            return this;
        }
        public Builder reservationIds(String... reservationIds) {
            return reservationIds(List.of(reservationIds));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("DeviceIpAddress", "type");
            }
            this.type = type;
            return this;
        }
        public DeviceIpAddress build() {
            final var _resultValue = new DeviceIpAddress();
            _resultValue.cidr = cidr;
            _resultValue.reservationIds = reservationIds;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}