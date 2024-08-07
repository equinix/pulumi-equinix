// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetNetworksData;
import com.equinix.pulumi.fabric.outputs.GetNetworksFilter;
import com.equinix.pulumi.fabric.outputs.GetNetworksPagination;
import com.equinix.pulumi.fabric.outputs.GetNetworksSort;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworksResult {
    /**
     * @return List of Cloud Routers
     * 
     */
    private List<GetNetworksData> datas;
    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    private List<GetNetworksFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     * 
     */
    private String outerOperator;
    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    private @Nullable GetNetworksPagination pagination;
    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    private @Nullable List<GetNetworksSort> sorts;

    private GetNetworksResult() {}
    /**
     * @return List of Cloud Routers
     * 
     */
    public List<GetNetworksData> datas() {
        return this.datas;
    }
    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public List<GetNetworksFilter> filters() {
        return this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     * 
     */
    public String outerOperator() {
        return this.outerOperator;
    }
    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    public Optional<GetNetworksPagination> pagination() {
        return Optional.ofNullable(this.pagination);
    }
    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public List<GetNetworksSort> sorts() {
        return this.sorts == null ? List.of() : this.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetNetworksData> datas;
        private List<GetNetworksFilter> filters;
        private String id;
        private String outerOperator;
        private @Nullable GetNetworksPagination pagination;
        private @Nullable List<GetNetworksSort> sorts;
        public Builder() {}
        public Builder(GetNetworksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datas = defaults.datas;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.outerOperator = defaults.outerOperator;
    	      this.pagination = defaults.pagination;
    	      this.sorts = defaults.sorts;
        }

        @CustomType.Setter
        public Builder datas(List<GetNetworksData> datas) {
            if (datas == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "datas");
            }
            this.datas = datas;
            return this;
        }
        public Builder datas(GetNetworksData... datas) {
            return datas(List.of(datas));
        }
        @CustomType.Setter
        public Builder filters(List<GetNetworksFilter> filters) {
            if (filters == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "filters");
            }
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNetworksFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder outerOperator(String outerOperator) {
            if (outerOperator == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "outerOperator");
            }
            this.outerOperator = outerOperator;
            return this;
        }
        @CustomType.Setter
        public Builder pagination(@Nullable GetNetworksPagination pagination) {

            this.pagination = pagination;
            return this;
        }
        @CustomType.Setter
        public Builder sorts(@Nullable List<GetNetworksSort> sorts) {

            this.sorts = sorts;
            return this;
        }
        public Builder sorts(GetNetworksSort... sorts) {
            return sorts(List.of(sorts));
        }
        public GetNetworksResult build() {
            final var _resultValue = new GetNetworksResult();
            _resultValue.datas = datas;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.outerOperator = outerOperator;
            _resultValue.pagination = pagination;
            _resultValue.sorts = sorts;
            return _resultValue;
        }
    }
}
