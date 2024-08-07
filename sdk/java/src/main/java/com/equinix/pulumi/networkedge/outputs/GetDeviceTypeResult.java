// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeviceTypeResult {
    private String category;
    /**
     * @return Device type short code, unique identifier of a network device type
     * 
     */
    private String code;
    /**
     * @return Device type textual description
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> metroCodes;
    private String name;
    private String vendor;

    private GetDeviceTypeResult() {}
    public String category() {
        return this.category;
    }
    /**
     * @return Device type short code, unique identifier of a network device type
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Device type textual description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> metroCodes() {
        return this.metroCodes;
    }
    public String name() {
        return this.name;
    }
    public String vendor() {
        return this.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceTypeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String code;
        private String description;
        private String id;
        private List<String> metroCodes;
        private String name;
        private String vendor;
        public Builder() {}
        public Builder(GetDeviceTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.metroCodes = defaults.metroCodes;
    	      this.name = defaults.name;
    	      this.vendor = defaults.vendor;
        }

        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder code(String code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder metroCodes(List<String> metroCodes) {
            if (metroCodes == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "metroCodes");
            }
            this.metroCodes = metroCodes;
            return this;
        }
        public Builder metroCodes(String... metroCodes) {
            return metroCodes(List.of(metroCodes));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder vendor(String vendor) {
            if (vendor == null) {
              throw new MissingRequiredPropertyException("GetDeviceTypeResult", "vendor");
            }
            this.vendor = vendor;
            return this;
        }
        public GetDeviceTypeResult build() {
            final var _resultValue = new GetDeviceTypeResult();
            _resultValue.category = category;
            _resultValue.code = code;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.metroCodes = metroCodes;
            _resultValue.name = name;
            _resultValue.vendor = vendor;
            return _resultValue;
        }
    }
}
