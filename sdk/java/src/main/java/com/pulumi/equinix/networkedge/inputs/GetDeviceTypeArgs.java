// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeviceTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceTypeArgs Empty = new GetDeviceTypeArgs();

    /**
     * Device type category. One of: `Router`, `Firewall`, `SDWAN`.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return Device type category. One of: `Router`, `Firewall`, `SDWAN`.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * List of metro codes where device type has to be available
     * 
     */
    @Import(name="metroCodes")
    private @Nullable Output<List<String>> metroCodes;

    /**
     * @return List of metro codes where device type has to be available
     * 
     */
    public Optional<Output<List<String>>> metroCodes() {
        return Optional.ofNullable(this.metroCodes);
    }

    /**
     * Device type name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Device type name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
     * 
     */
    @Import(name="vendor")
    private @Nullable Output<String> vendor;

    /**
     * @return Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
     * 
     */
    public Optional<Output<String>> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    private GetDeviceTypeArgs() {}

    private GetDeviceTypeArgs(GetDeviceTypeArgs $) {
        this.category = $.category;
        this.metroCodes = $.metroCodes;
        this.name = $.name;
        this.vendor = $.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceTypeArgs $;

        public Builder() {
            $ = new GetDeviceTypeArgs();
        }

        public Builder(GetDeviceTypeArgs defaults) {
            $ = new GetDeviceTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Device type category. One of: `Router`, `Firewall`, `SDWAN`.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Device type category. One of: `Router`, `Firewall`, `SDWAN`.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param metroCodes List of metro codes where device type has to be available
         * 
         * @return builder
         * 
         */
        public Builder metroCodes(@Nullable Output<List<String>> metroCodes) {
            $.metroCodes = metroCodes;
            return this;
        }

        /**
         * @param metroCodes List of metro codes where device type has to be available
         * 
         * @return builder
         * 
         */
        public Builder metroCodes(List<String> metroCodes) {
            return metroCodes(Output.of(metroCodes));
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
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Device type name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param vendor Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
         * 
         * @return builder
         * 
         */
        public Builder vendor(@Nullable Output<String> vendor) {
            $.vendor = vendor;
            return this;
        }

        /**
         * @param vendor Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
         * 
         * @return builder
         * 
         */
        public Builder vendor(String vendor) {
            return vendor(Output.of(vendor));
        }

        public GetDeviceTypeArgs build() {
            return $;
        }
    }

}
