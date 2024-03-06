// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionZSideAccessPointProfileAccessPointTypeConfig {
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

    private GetConnectionZSideAccessPointProfileAccessPointTypeConfig() {}
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

    public static Builder builder(GetConnectionZSideAccessPointProfileAccessPointTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionZSideAccessPointProfileAccessPointTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetConnectionZSideAccessPointProfileAccessPointTypeConfig build() {
            final var _resultValue = new GetConnectionZSideAccessPointProfileAccessPointTypeConfig();
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
