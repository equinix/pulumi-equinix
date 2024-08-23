// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetPortDeviceRedundancy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPortDevice {
    /**
     * @return Port name
     * 
     */
    private String name;
    /**
     * @return Port device redundancy
     * 
     */
    private List<GetPortDeviceRedundancy> redundancies;

    private GetPortDevice() {}
    /**
     * @return Port name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Port device redundancy
     * 
     */
    public List<GetPortDeviceRedundancy> redundancies() {
        return this.redundancies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetPortDeviceRedundancy> redundancies;
        public Builder() {}
        public Builder(GetPortDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.redundancies = defaults.redundancies;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPortDevice", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder redundancies(List<GetPortDeviceRedundancy> redundancies) {
            if (redundancies == null) {
              throw new MissingRequiredPropertyException("GetPortDevice", "redundancies");
            }
            this.redundancies = redundancies;
            return this;
        }
        public Builder redundancies(GetPortDeviceRedundancy... redundancies) {
            return redundancies(List.of(redundancies));
        }
        public GetPortDevice build() {
            final var _resultValue = new GetPortDevice();
            _resultValue.name = name;
            _resultValue.redundancies = redundancies;
            return _resultValue;
        }
    }
}