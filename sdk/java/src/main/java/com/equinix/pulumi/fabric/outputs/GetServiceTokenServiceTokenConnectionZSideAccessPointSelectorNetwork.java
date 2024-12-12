// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkLocation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private String href;
    /**
     * @return Location
     * 
     */
    private List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkLocation> locations;
    /**
     * @return Network Name
     * 
     */
    private String name;
    /**
     * @return Scope of Network
     * 
     */
    private String scope;
    /**
     * @return Type of Network
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    private String uuid;

    private GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Location
     * 
     */
    public List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkLocation> locations() {
        return this.locations;
    }
    /**
     * @return Network Name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Scope of Network
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return Type of Network
     * 
     */
    public String type() {
        return this.type;
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

    public static Builder builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkLocation> locations;
        private String name;
        private String scope;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkLocation> locations) {
            if (locations == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork", "locations");
            }
            this.locations = locations;
            return this;
        }
        public Builder locations(GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetworkLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork", "scope");
            }
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork build() {
            final var _resultValue = new GetServiceTokenServiceTokenConnectionZSideAccessPointSelectorNetwork();
            _resultValue.href = href;
            _resultValue.locations = locations;
            _resultValue.name = name;
            _resultValue.scope = scope;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
