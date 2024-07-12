// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.equinix.pulumi.metal.outputs.GetPlansFilter;
import com.equinix.pulumi.metal.outputs.GetPlansPlan;
import com.equinix.pulumi.metal.outputs.GetPlansSort;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPlansResult {
    private @Nullable List<GetPlansFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetPlansPlan> plans;
    private @Nullable List<GetPlansSort> sorts;

    private GetPlansResult() {}
    public List<GetPlansFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetPlansPlan> plans() {
        return this.plans;
    }
    public List<GetPlansSort> sorts() {
        return this.sorts == null ? List.of() : this.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlansResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetPlansFilter> filters;
        private String id;
        private List<GetPlansPlan> plans;
        private @Nullable List<GetPlansSort> sorts;
        public Builder() {}
        public Builder(GetPlansResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.plans = defaults.plans;
    	      this.sorts = defaults.sorts;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetPlansFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetPlansFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPlansResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder plans(List<GetPlansPlan> plans) {
            if (plans == null) {
              throw new MissingRequiredPropertyException("GetPlansResult", "plans");
            }
            this.plans = plans;
            return this;
        }
        public Builder plans(GetPlansPlan... plans) {
            return plans(List.of(plans));
        }
        @CustomType.Setter
        public Builder sorts(@Nullable List<GetPlansSort> sorts) {

            this.sorts = sorts;
            return this;
        }
        public Builder sorts(GetPlansSort... sorts) {
            return sorts(List.of(sorts));
        }
        public GetPlansResult build() {
            final var _resultValue = new GetPlansResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.plans = plans;
            _resultValue.sorts = sorts;
            return _resultValue;
        }
    }
}
