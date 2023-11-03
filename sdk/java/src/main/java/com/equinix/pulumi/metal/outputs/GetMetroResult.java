// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.equinix.pulumi.metal.outputs.GetMetroCapacity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetMetroResult {
    private @Nullable List<GetMetroCapacity> capacities;
    private String code;
    /**
     * @return The country of the metro.
     * 
     */
    private String country;
    /**
     * @return The ID of the metro.
     * 
     */
    private String id;
    /**
     * @return The name of the metro.
     * 
     */
    private String name;

    private GetMetroResult() {}
    public List<GetMetroCapacity> capacities() {
        return this.capacities == null ? List.of() : this.capacities;
    }
    public String code() {
        return this.code;
    }
    /**
     * @return The country of the metro.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return The ID of the metro.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the metro.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetroResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetMetroCapacity> capacities;
        private String code;
        private String country;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetMetroResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacities = defaults.capacities;
    	      this.code = defaults.code;
    	      this.country = defaults.country;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder capacities(@Nullable List<GetMetroCapacity> capacities) {
            this.capacities = capacities;
            return this;
        }
        public Builder capacities(GetMetroCapacity... capacities) {
            return capacities(List.of(capacities));
        }
        @CustomType.Setter
        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetMetroResult build() {
            final var _resultValue = new GetMetroResult();
            _resultValue.capacities = capacities;
            _resultValue.code = code;
            _resultValue.country = country;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
