// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceBgpNeighborsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceBgpNeighborsPlainArgs Empty = new GetDeviceBgpNeighborsPlainArgs();

    /**
     * UUID of BGP-enabled device whose neighbors to list.
     * 
     */
    @Import(name="deviceId", required=true)
    private String deviceId;

    /**
     * @return UUID of BGP-enabled device whose neighbors to list.
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }

    private GetDeviceBgpNeighborsPlainArgs() {}

    private GetDeviceBgpNeighborsPlainArgs(GetDeviceBgpNeighborsPlainArgs $) {
        this.deviceId = $.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceBgpNeighborsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceBgpNeighborsPlainArgs $;

        public Builder() {
            $ = new GetDeviceBgpNeighborsPlainArgs();
        }

        public Builder(GetDeviceBgpNeighborsPlainArgs defaults) {
            $ = new GetDeviceBgpNeighborsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId UUID of BGP-enabled device whose neighbors to list.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public GetDeviceBgpNeighborsPlainArgs build() {
            if ($.deviceId == null) {
                throw new MissingRequiredPropertyException("GetDeviceBgpNeighborsPlainArgs", "deviceId");
            }
            return $;
        }
    }

}
