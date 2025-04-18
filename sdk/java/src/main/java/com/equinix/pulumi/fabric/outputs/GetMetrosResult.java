// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetMetrosData;
import com.equinix.pulumi.fabric.outputs.GetMetrosPagination;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMetrosResult {
    /**
     * @return Returned list of metro objects
     * 
     */
    private List<GetMetrosData> datas;
    /**
     * @return The unique identifier of the resource
     * 
     */
    private String id;
    /**
     * @return Pagination details for the returned metro list
     * 
     */
    private GetMetrosPagination pagination;
    /**
     * @return User On Boarded Metros based on Fabric resource availability
     * 
     */
    private @Nullable String presence;

    private GetMetrosResult() {}
    /**
     * @return Returned list of metro objects
     * 
     */
    public List<GetMetrosData> datas() {
        return this.datas;
    }
    /**
     * @return The unique identifier of the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Pagination details for the returned metro list
     * 
     */
    public GetMetrosPagination pagination() {
        return this.pagination;
    }
    /**
     * @return User On Boarded Metros based on Fabric resource availability
     * 
     */
    public Optional<String> presence() {
        return Optional.ofNullable(this.presence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetrosResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetMetrosData> datas;
        private String id;
        private GetMetrosPagination pagination;
        private @Nullable String presence;
        public Builder() {}
        public Builder(GetMetrosResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datas = defaults.datas;
    	      this.id = defaults.id;
    	      this.pagination = defaults.pagination;
    	      this.presence = defaults.presence;
        }

        @CustomType.Setter
        public Builder datas(List<GetMetrosData> datas) {
            if (datas == null) {
              throw new MissingRequiredPropertyException("GetMetrosResult", "datas");
            }
            this.datas = datas;
            return this;
        }
        public Builder datas(GetMetrosData... datas) {
            return datas(List.of(datas));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMetrosResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pagination(GetMetrosPagination pagination) {
            if (pagination == null) {
              throw new MissingRequiredPropertyException("GetMetrosResult", "pagination");
            }
            this.pagination = pagination;
            return this;
        }
        @CustomType.Setter
        public Builder presence(@Nullable String presence) {

            this.presence = presence;
            return this;
        }
        public GetMetrosResult build() {
            final var _resultValue = new GetMetrosResult();
            _resultValue.datas = datas;
            _resultValue.id = id;
            _resultValue.pagination = pagination;
            _resultValue.presence = presence;
            return _resultValue;
        }
    }
}
