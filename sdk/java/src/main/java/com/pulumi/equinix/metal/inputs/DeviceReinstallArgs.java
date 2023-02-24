// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceReinstallArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceReinstallArgs Empty = new DeviceReinstallArgs();

    /**
     * Whether the OS disk should be filled with `00h` bytes before reinstall.
     * Defaults to `false`.
     * 
     */
    @Import(name="deprovisionFast")
    private @Nullable Output<Boolean> deprovisionFast;

    /**
     * @return Whether the OS disk should be filled with `00h` bytes before reinstall.
     * Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> deprovisionFast() {
        return Optional.ofNullable(this.deprovisionFast);
    }

    /**
     * Whether the provider should favour reinstall over destroy and create. Defaults to
     * `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the provider should favour reinstall over destroy and create. Defaults to
     * `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Whether the non-OS disks should be kept or wiped during reinstall.
     * Defaults to `false`.
     * 
     */
    @Import(name="preserveData")
    private @Nullable Output<Boolean> preserveData;

    /**
     * @return Whether the non-OS disks should be kept or wiped during reinstall.
     * Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> preserveData() {
        return Optional.ofNullable(this.preserveData);
    }

    private DeviceReinstallArgs() {}

    private DeviceReinstallArgs(DeviceReinstallArgs $) {
        this.deprovisionFast = $.deprovisionFast;
        this.enabled = $.enabled;
        this.preserveData = $.preserveData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceReinstallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceReinstallArgs $;

        public Builder() {
            $ = new DeviceReinstallArgs();
        }

        public Builder(DeviceReinstallArgs defaults) {
            $ = new DeviceReinstallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deprovisionFast Whether the OS disk should be filled with `00h` bytes before reinstall.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deprovisionFast(@Nullable Output<Boolean> deprovisionFast) {
            $.deprovisionFast = deprovisionFast;
            return this;
        }

        /**
         * @param deprovisionFast Whether the OS disk should be filled with `00h` bytes before reinstall.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder deprovisionFast(Boolean deprovisionFast) {
            return deprovisionFast(Output.of(deprovisionFast));
        }

        /**
         * @param enabled Whether the provider should favour reinstall over destroy and create. Defaults to
         * `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the provider should favour reinstall over destroy and create. Defaults to
         * `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param preserveData Whether the non-OS disks should be kept or wiped during reinstall.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder preserveData(@Nullable Output<Boolean> preserveData) {
            $.preserveData = preserveData;
            return this;
        }

        /**
         * @param preserveData Whether the non-OS disks should be kept or wiped during reinstall.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder preserveData(Boolean preserveData) {
            return preserveData(Output.of(preserveData));
        }

        public DeviceReinstallArgs build() {
            return $;
        }
    }

}
