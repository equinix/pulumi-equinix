// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.equinix.pulumi.metal.inputs.SpotMarketRequestInstanceParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotMarketRequestState extends com.pulumi.resources.ResourceArgs {

    public static final SpotMarketRequestState Empty = new SpotMarketRequestState();

    /**
     * Maximum number devices to be created.
     * 
     */
    @Import(name="devicesMax")
    private @Nullable Output<Integer> devicesMax;

    /**
     * @return Maximum number devices to be created.
     * 
     */
    public Optional<Output<Integer>> devicesMax() {
        return Optional.ofNullable(this.devicesMax);
    }

    /**
     * Miniumum number devices to be created.
     * 
     */
    @Import(name="devicesMin")
    private @Nullable Output<Integer> devicesMin;

    /**
     * @return Miniumum number devices to be created.
     * 
     */
    public Optional<Output<Integer>> devicesMin() {
        return Optional.ofNullable(this.devicesMin);
    }

    /**
     * Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    @Import(name="facilities")
    private @Nullable Output<List<String>> facilities;

    /**
     * @return Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public Optional<Output<List<String>>> facilities() {
        return Optional.ofNullable(this.facilities);
    }

    /**
     * Key/Value pairs of parameters for devices provisioned from
     * this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
     * `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
     * `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
     * description in equinix.metal.Device docs.
     * 
     */
    @Import(name="instanceParameters")
    private @Nullable Output<SpotMarketRequestInstanceParametersArgs> instanceParameters;

    /**
     * @return Key/Value pairs of parameters for devices provisioned from
     * this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
     * `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
     * `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
     * description in equinix.metal.Device docs.
     * 
     */
    public Optional<Output<SpotMarketRequestInstanceParametersArgs>> instanceParameters() {
        return Optional.ofNullable(this.instanceParameters);
    }

    /**
     * Maximum price user is willing to pay per hour per device.
     * 
     */
    @Import(name="maxBidPrice")
    private @Nullable Output<Double> maxBidPrice;

    /**
     * @return Maximum price user is willing to pay per hour per device.
     * 
     */
    public Optional<Output<Double>> maxBidPrice() {
        return Optional.ofNullable(this.maxBidPrice);
    }

    /**
     * Metro where devices should be created.
     * 
     */
    @Import(name="metro")
    private @Nullable Output<String> metro;

    /**
     * @return Metro where devices should be created.
     * 
     */
    public Optional<Output<String>> metro() {
        return Optional.ofNullable(this.metro);
    }

    /**
     * Project ID.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project ID.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * On resource creation wait until all desired devices are active.
     * On resource destruction wait until devices are removed.
     * 
     */
    @Import(name="waitForDevices")
    private @Nullable Output<Boolean> waitForDevices;

    /**
     * @return On resource creation wait until all desired devices are active.
     * On resource destruction wait until devices are removed.
     * 
     */
    public Optional<Output<Boolean>> waitForDevices() {
        return Optional.ofNullable(this.waitForDevices);
    }

    private SpotMarketRequestState() {}

    private SpotMarketRequestState(SpotMarketRequestState $) {
        this.devicesMax = $.devicesMax;
        this.devicesMin = $.devicesMin;
        this.facilities = $.facilities;
        this.instanceParameters = $.instanceParameters;
        this.maxBidPrice = $.maxBidPrice;
        this.metro = $.metro;
        this.projectId = $.projectId;
        this.waitForDevices = $.waitForDevices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotMarketRequestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotMarketRequestState $;

        public Builder() {
            $ = new SpotMarketRequestState();
        }

        public Builder(SpotMarketRequestState defaults) {
            $ = new SpotMarketRequestState(Objects.requireNonNull(defaults));
        }

        /**
         * @param devicesMax Maximum number devices to be created.
         * 
         * @return builder
         * 
         */
        public Builder devicesMax(@Nullable Output<Integer> devicesMax) {
            $.devicesMax = devicesMax;
            return this;
        }

        /**
         * @param devicesMax Maximum number devices to be created.
         * 
         * @return builder
         * 
         */
        public Builder devicesMax(Integer devicesMax) {
            return devicesMax(Output.of(devicesMax));
        }

        /**
         * @param devicesMin Miniumum number devices to be created.
         * 
         * @return builder
         * 
         */
        public Builder devicesMin(@Nullable Output<Integer> devicesMin) {
            $.devicesMin = devicesMin;
            return this;
        }

        /**
         * @param devicesMin Miniumum number devices to be created.
         * 
         * @return builder
         * 
         */
        public Builder devicesMin(Integer devicesMin) {
            return devicesMin(Output.of(devicesMin));
        }

        /**
         * @param facilities Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
         * 
         */
        @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
        public Builder facilities(@Nullable Output<List<String>> facilities) {
            $.facilities = facilities;
            return this;
        }

        /**
         * @param facilities Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
         * 
         */
        @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
        public Builder facilities(List<String> facilities) {
            return facilities(Output.of(facilities));
        }

        /**
         * @param facilities Facility IDs where devices should be created. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
         * 
         */
        @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
        public Builder facilities(String... facilities) {
            return facilities(List.of(facilities));
        }

        /**
         * @param instanceParameters Key/Value pairs of parameters for devices provisioned from
         * this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
         * `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
         * `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
         * description in equinix.metal.Device docs.
         * 
         * @return builder
         * 
         */
        public Builder instanceParameters(@Nullable Output<SpotMarketRequestInstanceParametersArgs> instanceParameters) {
            $.instanceParameters = instanceParameters;
            return this;
        }

        /**
         * @param instanceParameters Key/Value pairs of parameters for devices provisioned from
         * this request. Valid keys are: `billing_cycle`, `plan`, `operating_system`, `hostname`,
         * `termination_time`, `always_pxe`, `description`, `features`, `locked`, `project_ssh_keys`,
         * `user_ssh_keys`, `userdata`, `customdata`, `ipxe_script_url`, `tags`. You can find each parameter
         * description in equinix.metal.Device docs.
         * 
         * @return builder
         * 
         */
        public Builder instanceParameters(SpotMarketRequestInstanceParametersArgs instanceParameters) {
            return instanceParameters(Output.of(instanceParameters));
        }

        /**
         * @param maxBidPrice Maximum price user is willing to pay per hour per device.
         * 
         * @return builder
         * 
         */
        public Builder maxBidPrice(@Nullable Output<Double> maxBidPrice) {
            $.maxBidPrice = maxBidPrice;
            return this;
        }

        /**
         * @param maxBidPrice Maximum price user is willing to pay per hour per device.
         * 
         * @return builder
         * 
         */
        public Builder maxBidPrice(Double maxBidPrice) {
            return maxBidPrice(Output.of(maxBidPrice));
        }

        /**
         * @param metro Metro where devices should be created.
         * 
         * @return builder
         * 
         */
        public Builder metro(@Nullable Output<String> metro) {
            $.metro = metro;
            return this;
        }

        /**
         * @param metro Metro where devices should be created.
         * 
         * @return builder
         * 
         */
        public Builder metro(String metro) {
            return metro(Output.of(metro));
        }

        /**
         * @param projectId Project ID.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param waitForDevices On resource creation wait until all desired devices are active.
         * On resource destruction wait until devices are removed.
         * 
         * @return builder
         * 
         */
        public Builder waitForDevices(@Nullable Output<Boolean> waitForDevices) {
            $.waitForDevices = waitForDevices;
            return this;
        }

        /**
         * @param waitForDevices On resource creation wait until all desired devices are active.
         * On resource destruction wait until devices are removed.
         * 
         * @return builder
         * 
         */
        public Builder waitForDevices(Boolean waitForDevices) {
            return waitForDevices(Output.of(waitForDevices));
        }

        public SpotMarketRequestState build() {
            return $;
        }
    }

}
