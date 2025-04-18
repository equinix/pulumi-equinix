// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs Empty = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs();

    /**
     * IBX Code
     * 
     */
    @Import(name="ibx")
    private @Nullable Output<String> ibx;

    /**
     * @return IBX Code
     * 
     */
    public Optional<Output<String>> ibx() {
        return Optional.ofNullable(this.ibx);
    }

    /**
     * Access point metro code
     * 
     */
    @Import(name="metroCode")
    private @Nullable Output<String> metroCode;

    /**
     * @return Access point metro code
     * 
     */
    public Optional<Output<String>> metroCode() {
        return Optional.ofNullable(this.metroCode);
    }

    /**
     * Access point metro name
     * 
     */
    @Import(name="metroName")
    private @Nullable Output<String> metroName;

    /**
     * @return Access point metro name
     * 
     */
    public Optional<Output<String>> metroName() {
        return Optional.ofNullable(this.metroName);
    }

    /**
     * Access point region
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Access point region
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs() {}

    private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs $) {
        this.ibx = $.ibx;
        this.metroCode = $.metroCode;
        this.metroName = $.metroName;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs $;

        public Builder() {
            $ = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs();
        }

        public Builder(ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs defaults) {
            $ = new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ibx IBX Code
         * 
         * @return builder
         * 
         */
        public Builder ibx(@Nullable Output<String> ibx) {
            $.ibx = ibx;
            return this;
        }

        /**
         * @param ibx IBX Code
         * 
         * @return builder
         * 
         */
        public Builder ibx(String ibx) {
            return ibx(Output.of(ibx));
        }

        /**
         * @param metroCode Access point metro code
         * 
         * @return builder
         * 
         */
        public Builder metroCode(@Nullable Output<String> metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        /**
         * @param metroCode Access point metro code
         * 
         * @return builder
         * 
         */
        public Builder metroCode(String metroCode) {
            return metroCode(Output.of(metroCode));
        }

        /**
         * @param metroName Access point metro name
         * 
         * @return builder
         * 
         */
        public Builder metroName(@Nullable Output<String> metroName) {
            $.metroName = metroName;
            return this;
        }

        /**
         * @param metroName Access point metro name
         * 
         * @return builder
         * 
         */
        public Builder metroName(String metroName) {
            return metroName(Output.of(metroName));
        }

        /**
         * @param region Access point region
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Access point region
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs build() {
            return $;
        }
    }

}
