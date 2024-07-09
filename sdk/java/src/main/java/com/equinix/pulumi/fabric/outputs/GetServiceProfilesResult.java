// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceProfilesDatum;
import com.equinix.pulumi.fabric.outputs.GetServiceProfilesFilter;
import com.equinix.pulumi.fabric.outputs.GetServiceProfilesPagination;
import com.equinix.pulumi.fabric.outputs.GetServiceProfilesSort;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfilesResult {
    /**
     * @return Optional boolean flag to indicate if the filters will be AND&#39;d together. Defaults to false
     * 
     */
    private @Nullable Boolean andFilters;
    /**
     * @return List of Service Profiles
     * 
     */
    private List<GetServiceProfilesDatum> data;
    /**
     * @return Filters for the Data Source Search Request (If and_filters is not set to true you cannot provide more than one filter block)
     * 
     */
    private GetServiceProfilesFilter filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    private @Nullable GetServiceProfilesPagination pagination;
    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    private @Nullable List<GetServiceProfilesSort> sort;
    /**
     * @return flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     * 
     */
    private @Nullable String viewPoint;

    private GetServiceProfilesResult() {}
    /**
     * @return Optional boolean flag to indicate if the filters will be AND&#39;d together. Defaults to false
     * 
     */
    public Optional<Boolean> andFilters() {
        return Optional.ofNullable(this.andFilters);
    }
    /**
     * @return List of Service Profiles
     * 
     */
    public List<GetServiceProfilesDatum> data() {
        return this.data;
    }
    /**
     * @return Filters for the Data Source Search Request (If and_filters is not set to true you cannot provide more than one filter block)
     * 
     */
    public GetServiceProfilesFilter filter() {
        return this.filter;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Pagination details for the Data Source Search Request
     * 
     */
    public Optional<GetServiceProfilesPagination> pagination() {
        return Optional.ofNullable(this.pagination);
    }
    /**
     * @return Filters for the Data Source Search Request
     * 
     */
    public List<GetServiceProfilesSort> sort() {
        return this.sort == null ? List.of() : this.sort;
    }
    /**
     * @return flips view between buyer and seller representation. Available values : aSide, zSide. Default value : aSide
     * 
     */
    public Optional<String> viewPoint() {
        return Optional.ofNullable(this.viewPoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean andFilters;
        private List<GetServiceProfilesDatum> data;
        private GetServiceProfilesFilter filter;
        private String id;
        private @Nullable GetServiceProfilesPagination pagination;
        private @Nullable List<GetServiceProfilesSort> sort;
        private @Nullable String viewPoint;
        public Builder() {}
        public Builder(GetServiceProfilesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andFilters = defaults.andFilters;
    	      this.data = defaults.data;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.pagination = defaults.pagination;
    	      this.sort = defaults.sort;
    	      this.viewPoint = defaults.viewPoint;
        }

        @CustomType.Setter
        public Builder andFilters(@Nullable Boolean andFilters) {

            this.andFilters = andFilters;
            return this;
        }
        @CustomType.Setter
        public Builder data(List<GetServiceProfilesDatum> data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesResult", "data");
            }
            this.data = data;
            return this;
        }
        public Builder data(GetServiceProfilesDatum... data) {
            return data(List.of(data));
        }
        @CustomType.Setter
        public Builder filter(GetServiceProfilesFilter filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pagination(@Nullable GetServiceProfilesPagination pagination) {

            this.pagination = pagination;
            return this;
        }
        @CustomType.Setter
        public Builder sort(@Nullable List<GetServiceProfilesSort> sort) {

            this.sort = sort;
            return this;
        }
        public Builder sort(GetServiceProfilesSort... sort) {
            return sort(List.of(sort));
        }
        @CustomType.Setter
        public Builder viewPoint(@Nullable String viewPoint) {

            this.viewPoint = viewPoint;
            return this;
        }
        public GetServiceProfilesResult build() {
            final var _resultValue = new GetServiceProfilesResult();
            _resultValue.andFilters = andFilters;
            _resultValue.data = data;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.pagination = pagination;
            _resultValue.sort = sort;
            _resultValue.viewPoint = viewPoint;
            return _resultValue;
        }
    }
}
