// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSpotMarketPriceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSpotMarketPriceArgs Empty = new GetSpotMarketPriceArgs();

    /**
     * Name of the facility. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    @Import(name="facility")
    private @Nullable Output<String> facility;

    /**
     * @return Name of the facility. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public Optional<Output<String>> facility() {
        return Optional.ofNullable(this.facility);
    }

    /**
     * Name of the metro.
     * 
     */
    @Import(name="metro")
    private @Nullable Output<String> metro;

    /**
     * @return Name of the metro.
     * 
     */
    public Optional<Output<String>> metro() {
        return Optional.ofNullable(this.metro);
    }

    /**
     * Name of the plan.
     * 
     */
    @Import(name="plan", required=true)
    private Output<String> plan;

    /**
     * @return Name of the plan.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }

    private GetSpotMarketPriceArgs() {}

    private GetSpotMarketPriceArgs(GetSpotMarketPriceArgs $) {
        this.facility = $.facility;
        this.metro = $.metro;
        this.plan = $.plan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpotMarketPriceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpotMarketPriceArgs $;

        public Builder() {
            $ = new GetSpotMarketPriceArgs();
        }

        public Builder(GetSpotMarketPriceArgs defaults) {
            $ = new GetSpotMarketPriceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param facility Name of the facility. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
         * 
         */
        @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
        public Builder facility(@Nullable Output<String> facility) {
            $.facility = facility;
            return this;
        }

        /**
         * @param facility Name of the facility. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
         * 
         */
        @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
        public Builder facility(String facility) {
            return facility(Output.of(facility));
        }

        /**
         * @param metro Name of the metro.
         * 
         * @return builder
         * 
         */
        public Builder metro(@Nullable Output<String> metro) {
            $.metro = metro;
            return this;
        }

        /**
         * @param metro Name of the metro.
         * 
         * @return builder
         * 
         */
        public Builder metro(String metro) {
            return metro(Output.of(metro));
        }

        /**
         * @param plan Name of the plan.
         * 
         * @return builder
         * 
         */
        public Builder plan(Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Name of the plan.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        public GetSpotMarketPriceArgs build() {
            if ($.plan == null) {
                throw new MissingRequiredPropertyException("GetSpotMarketPriceArgs", "plan");
            }
            return $;
        }
    }

}