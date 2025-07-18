// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataASideAccessPointNetwork {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private String href;
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    private String uuid;

    private GetConnectionsDataASideAccessPointNetwork() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataASideAccessPointNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionsDataASideAccessPointNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataASideAccessPointNetwork", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataASideAccessPointNetwork", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionsDataASideAccessPointNetwork build() {
            final var _resultValue = new GetConnectionsDataASideAccessPointNetwork();
            _resultValue.href = href;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
