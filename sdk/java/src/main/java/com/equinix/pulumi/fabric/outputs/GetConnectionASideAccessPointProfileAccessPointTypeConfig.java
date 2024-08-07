// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointProfileAccessPointTypeConfig {
    /**
     * @return Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    private String uuid;

    private GetConnectionASideAccessPointProfileAccessPointTypeConfig() {}
    /**
     * @return Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, EC*VC
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointProfileAccessPointTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointProfileAccessPointTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointProfileAccessPointTypeConfig", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionASideAccessPointProfileAccessPointTypeConfig", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionASideAccessPointProfileAccessPointTypeConfig build() {
            final var _resultValue = new GetConnectionASideAccessPointProfileAccessPointTypeConfig();
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
