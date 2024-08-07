// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetPortsDatum;
import com.equinix.pulumi.fabric.outputs.GetPortsFilter;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPortsResult {
    /**
     * @return List of Ports
     * 
     */
    private List<GetPortsDatum> data;
    /**
     * @return name
     * 
     */
    private GetPortsFilter filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetPortsResult() {}
    /**
     * @return List of Ports
     * 
     */
    public List<GetPortsDatum> data() {
        return this.data;
    }
    /**
     * @return name
     * 
     */
    public GetPortsFilter filter() {
        return this.filter;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPortsDatum> data;
        private GetPortsFilter filter;
        private String id;
        public Builder() {}
        public Builder(GetPortsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder data(List<GetPortsDatum> data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetPortsResult", "data");
            }
            this.data = data;
            return this;
        }
        public Builder data(GetPortsDatum... data) {
            return data(List.of(data));
        }
        @CustomType.Setter
        public Builder filter(GetPortsFilter filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetPortsResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPortsResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetPortsResult build() {
            final var _resultValue = new GetPortsResult();
            _resultValue.data = data;
            _resultValue.filter = filter;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
