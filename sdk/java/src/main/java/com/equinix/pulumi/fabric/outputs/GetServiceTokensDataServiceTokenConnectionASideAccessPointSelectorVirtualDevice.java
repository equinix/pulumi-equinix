// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice {
    /**
     * @return Virtual Device Cluster Information
     * 
     */
    private String cluster;
    /**
     * @return Unique Resource Identifier
     * 
     */
    private String href;
    /**
     * @return Customer-assigned Virtual Device Name
     * 
     */
    private String name;
    /**
     * @return Virtual Device type
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned Virtual Device identifier
     * 
     */
    private String uuid;

    private GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice() {}
    /**
     * @return Virtual Device Cluster Information
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return Unique Resource Identifier
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Customer-assigned Virtual Device Name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Virtual Device type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned Virtual Device identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cluster;
        private String href;
        private String name;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cluster(String cluster) {
            if (cluster == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice", "cluster");
            }
            this.cluster = cluster;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice build() {
            final var _resultValue = new GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDevice();
            _resultValue.cluster = cluster;
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
