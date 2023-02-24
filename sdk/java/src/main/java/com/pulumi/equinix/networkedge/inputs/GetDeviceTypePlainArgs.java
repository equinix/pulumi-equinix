// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeviceTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceTypePlainArgs Empty = new GetDeviceTypePlainArgs();

    /**
     * Device type category. One of: `Router`, `Firewall`, `SDWAN`.
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return Device type category. One of: `Router`, `Firewall`, `SDWAN`.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * List of metro codes where device type has to be available
     * 
     */
    @Import(name="metroCodes")
    private @Nullable List<String> metroCodes;

    /**
     * @return List of metro codes where device type has to be available
     * 
     */
    public Optional<List<String>> metroCodes() {
        return Optional.ofNullable(this.metroCodes);
    }

    /**
     * Device type name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Device type name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
     * 
     */
    @Import(name="vendor")
    private @Nullable String vendor;

    /**
     * @return Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
     * 
     */
    public Optional<String> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    private GetDeviceTypePlainArgs() {}

    private GetDeviceTypePlainArgs(GetDeviceTypePlainArgs $) {
        this.category = $.category;
        this.metroCodes = $.metroCodes;
        this.name = $.name;
        this.vendor = $.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceTypePlainArgs $;

        public Builder() {
            $ = new GetDeviceTypePlainArgs();
        }

        public Builder(GetDeviceTypePlainArgs defaults) {
            $ = new GetDeviceTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Device type category. One of: `Router`, `Firewall`, `SDWAN`.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        /**
         * @param metroCodes List of metro codes where device type has to be available
         * 
         * @return builder
         * 
         */
        public Builder metroCodes(@Nullable List<String> metroCodes) {
            $.metroCodes = metroCodes;
            return this;
        }

        /**
         * @param metroCodes List of metro codes where device type has to be available
         * 
         * @return builder
         * 
         */
        public Builder metroCodes(String... metroCodes) {
            return metroCodes(List.of(metroCodes));
        }

        /**
         * @param name Device type name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param vendor Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
         * 
         * @return builder
         * 
         */
        public Builder vendor(@Nullable String vendor) {
            $.vendor = vendor;
            return this;
        }

        public GetDeviceTypePlainArgs build() {
            return $;
        }
    }

}
