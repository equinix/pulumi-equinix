// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicePlatformPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicePlatformPlainArgs Empty = new GetDevicePlatformPlainArgs();

    /**
     * Number of CPU cores used to limit platform search results.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Integer coreCount;

    /**
     * @return Number of CPU cores used to limit platform search results.
     * 
     */
    public Optional<Integer> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Device type code
     * 
     */
    @Import(name="deviceType", required=true)
    private String deviceType;

    /**
     * @return Device type code
     * 
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Device platform flavor that determines number of CPU cores and memory.
     * Supported values are: `small`, `medium`, `large`, `xlarge`.
     * 
     */
    @Import(name="flavor")
    private @Nullable String flavor;

    /**
     * @return Device platform flavor that determines number of CPU cores and memory.
     * Supported values are: `small`, `medium`, `large`, `xlarge`.
     * 
     */
    public Optional<String> flavor() {
        return Optional.ofNullable(this.flavor);
    }

    /**
     * List of device licensing options to limit platform search result.
     * Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
     * 
     */
    @Import(name="licenseOptions")
    private @Nullable List<String> licenseOptions;

    /**
     * @return List of device licensing options to limit platform search result.
     * Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
     * 
     */
    public Optional<List<String>> licenseOptions() {
        return Optional.ofNullable(this.licenseOptions);
    }

    /**
     * List of device management types to limit platform search results.
     * Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
     * 
     */
    @Import(name="managementTypes")
    private @Nullable List<String> managementTypes;

    /**
     * @return List of device management types to limit platform search results.
     * Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
     * 
     */
    public Optional<List<String>> managementTypes() {
        return Optional.ofNullable(this.managementTypes);
    }

    /**
     * List of software package codes to limit platform search results.
     * 
     */
    @Import(name="packages")
    private @Nullable List<String> packages;

    /**
     * @return List of software package codes to limit platform search results.
     * 
     */
    public Optional<List<String>> packages() {
        return Optional.ofNullable(this.packages);
    }

    private GetDevicePlatformPlainArgs() {}

    private GetDevicePlatformPlainArgs(GetDevicePlatformPlainArgs $) {
        this.coreCount = $.coreCount;
        this.deviceType = $.deviceType;
        this.flavor = $.flavor;
        this.licenseOptions = $.licenseOptions;
        this.managementTypes = $.managementTypes;
        this.packages = $.packages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicePlatformPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicePlatformPlainArgs $;

        public Builder() {
            $ = new GetDevicePlatformPlainArgs();
        }

        public Builder(GetDevicePlatformPlainArgs defaults) {
            $ = new GetDevicePlatformPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param coreCount Number of CPU cores used to limit platform search results.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(@Nullable Integer coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        /**
         * @param deviceType Device type code
         * 
         * @return builder
         * 
         */
        public Builder deviceType(String deviceType) {
            $.deviceType = deviceType;
            return this;
        }

        /**
         * @param flavor Device platform flavor that determines number of CPU cores and memory.
         * Supported values are: `small`, `medium`, `large`, `xlarge`.
         * 
         * @return builder
         * 
         */
        public Builder flavor(@Nullable String flavor) {
            $.flavor = flavor;
            return this;
        }

        /**
         * @param licenseOptions List of device licensing options to limit platform search result.
         * Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
         * 
         * @return builder
         * 
         */
        public Builder licenseOptions(@Nullable List<String> licenseOptions) {
            $.licenseOptions = licenseOptions;
            return this;
        }

        /**
         * @param licenseOptions List of device licensing options to limit platform search result.
         * Supported values are: `BYOL` (for Bring Your Own License), `Sub` (for license subscription).
         * 
         * @return builder
         * 
         */
        public Builder licenseOptions(String... licenseOptions) {
            return licenseOptions(List.of(licenseOptions));
        }

        /**
         * @param managementTypes List of device management types to limit platform search results.
         * Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
         * 
         * @return builder
         * 
         */
        public Builder managementTypes(@Nullable List<String> managementTypes) {
            $.managementTypes = managementTypes;
            return this;
        }

        /**
         * @param managementTypes List of device management types to limit platform search results.
         * Supported values are: `EQUINIX-CONFIGURED`, `SELF-CONFIGURED`.
         * 
         * @return builder
         * 
         */
        public Builder managementTypes(String... managementTypes) {
            return managementTypes(List.of(managementTypes));
        }

        /**
         * @param packages List of software package codes to limit platform search results.
         * 
         * @return builder
         * 
         */
        public Builder packages(@Nullable List<String> packages) {
            $.packages = packages;
            return this;
        }

        /**
         * @param packages List of software package codes to limit platform search results.
         * 
         * @return builder
         * 
         */
        public Builder packages(String... packages) {
            return packages(List.of(packages));
        }

        public GetDevicePlatformPlainArgs build() {
            $.deviceType = Objects.requireNonNull($.deviceType, "expected parameter 'deviceType' to be non-null");
            return $;
        }
    }

}
