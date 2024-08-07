// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetPortsDatumDeviceRedundancy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPortsDatumDevice {
    /**
     * @return Port name
     * 
     */
    private String name;
    /**
     * @return Port device redundancy
     * 
     */
    private List<GetPortsDatumDeviceRedundancy> redundancies;

    private GetPortsDatumDevice() {}
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
    public List<GetPortsDatumDeviceRedundancy> redundancies() {
        return this.redundancies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDatumDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetPortsDatumDeviceRedundancy> redundancies;
        public Builder() {}
        public Builder(GetPortsDatumDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.redundancies = defaults.redundancies;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPortsDatumDevice", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder redundancies(List<GetPortsDatumDeviceRedundancy> redundancies) {
            if (redundancies == null) {
              throw new MissingRequiredPropertyException("GetPortsDatumDevice", "redundancies");
            }
            this.redundancies = redundancies;
            return this;
        }
        public Builder redundancies(GetPortsDatumDeviceRedundancy... redundancies) {
            return redundancies(List.of(redundancies));
        }
        public GetPortsDatumDevice build() {
            final var _resultValue = new GetPortsDatumDevice();
            _resultValue.name = name;
            _resultValue.redundancies = redundancies;
            return _resultValue;
        }
    }
}
