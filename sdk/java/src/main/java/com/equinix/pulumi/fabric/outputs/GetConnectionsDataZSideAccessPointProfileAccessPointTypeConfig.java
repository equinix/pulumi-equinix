// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig {
    /**
     * @return Type of access point type config - VD, COLO
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned access point type config identifier
     * 
     */
    private String uuid;

    private GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig() {}
    /**
     * @return Type of access point type config - VD, COLO
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned access point type config identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig build() {
            final var _resultValue = new GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig();
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
