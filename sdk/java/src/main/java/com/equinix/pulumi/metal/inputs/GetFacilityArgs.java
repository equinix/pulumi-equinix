// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.equinix.pulumi.metal.inputs.GetFacilityCapacityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFacilityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFacilityArgs Empty = new GetFacilityArgs();

    /**
     * One or more device plans for which the facility must have capacity.
     * 
     */
    @Import(name="capacities")
    private @Nullable Output<List<GetFacilityCapacityArgs>> capacities;

    /**
     * @return One or more device plans for which the facility must have capacity.
     * 
     */
    public Optional<Output<List<GetFacilityCapacityArgs>>> capacities() {
        return Optional.ofNullable(this.capacities);
    }

    /**
     * The facility code to search for facilities.
     * 
     */
    @Import(name="code", required=true)
    private Output<String> code;

    /**
     * @return The facility code to search for facilities.
     * 
     */
    public Output<String> code() {
        return this.code;
    }

    /**
     * Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
     * 
     */
    @Import(name="featuresRequireds")
    private @Nullable Output<List<String>> featuresRequireds;

    /**
     * @return Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
     * 
     */
    public Optional<Output<List<String>>> featuresRequireds() {
        return Optional.ofNullable(this.featuresRequireds);
    }

    private GetFacilityArgs() {}

    private GetFacilityArgs(GetFacilityArgs $) {
        this.capacities = $.capacities;
        this.code = $.code;
        this.featuresRequireds = $.featuresRequireds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFacilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFacilityArgs $;

        public Builder() {
            $ = new GetFacilityArgs();
        }

        public Builder(GetFacilityArgs defaults) {
            $ = new GetFacilityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacities One or more device plans for which the facility must have capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacities(@Nullable Output<List<GetFacilityCapacityArgs>> capacities) {
            $.capacities = capacities;
            return this;
        }

        /**
         * @param capacities One or more device plans for which the facility must have capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacities(List<GetFacilityCapacityArgs> capacities) {
            return capacities(Output.of(capacities));
        }

        /**
         * @param capacities One or more device plans for which the facility must have capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacities(GetFacilityCapacityArgs... capacities) {
            return capacities(List.of(capacities));
        }

        /**
         * @param code The facility code to search for facilities.
         * 
         * @return builder
         * 
         */
        public Builder code(Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The facility code to search for facilities.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param featuresRequireds Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
         * 
         * @return builder
         * 
         */
        public Builder featuresRequireds(@Nullable Output<List<String>> featuresRequireds) {
            $.featuresRequireds = featuresRequireds;
            return this;
        }

        /**
         * @param featuresRequireds Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
         * 
         * @return builder
         * 
         */
        public Builder featuresRequireds(List<String> featuresRequireds) {
            return featuresRequireds(Output.of(featuresRequireds));
        }

        /**
         * @param featuresRequireds Set of feature strings that the facility must have. Some possible values are `baremetal`, `ibx`, `storage`, `global_ipv4`, `backend_transfer`, `layer_2`.
         * 
         * @return builder
         * 
         */
        public Builder featuresRequireds(String... featuresRequireds) {
            return featuresRequireds(List.of(featuresRequireds));
        }

        public GetFacilityArgs build() {
            if ($.code == null) {
                throw new MissingRequiredPropertyException("GetFacilityArgs", "code");
            }
            return $;
        }
    }

}
