// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataZSideAccessPointProfile {
    /**
     * @return Access point config information
     * 
     */
    private List<GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs;
    /**
     * @return User-provided service description
     * 
     */
    private String description;
    /**
     * @return Service Profile URI response attribute
     * 
     */
    private String href;
    /**
     * @return Customer-assigned service profile name
     * 
     */
    private String name;
    /**
     * @return Service profile type - L2_PROFILE, L3_PROFILE, ECIA_PROFILE, ECMC_PROFILE, IA_PROFILE
     * 
     */
    private String type;
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    private String uuid;

    private GetConnectionsDataZSideAccessPointProfile() {}
    /**
     * @return Access point config information
     * 
     */
    public List<GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs() {
        return this.accessPointTypeConfigs;
    }
    /**
     * @return User-provided service description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Service Profile URI response attribute
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Customer-assigned service profile name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Service profile type - L2_PROFILE, L3_PROFILE, ECIA_PROFILE, ECMC_PROFILE, IA_PROFILE
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataZSideAccessPointProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs;
        private String description;
        private String href;
        private String name;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionsDataZSideAccessPointProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTypeConfigs = defaults.accessPointTypeConfigs;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accessPointTypeConfigs(List<GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs) {
            if (accessPointTypeConfigs == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfile", "accessPointTypeConfigs");
            }
            this.accessPointTypeConfigs = accessPointTypeConfigs;
            return this;
        }
        public Builder accessPointTypeConfigs(GetConnectionsDataZSideAccessPointProfileAccessPointTypeConfig... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfile", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfile", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfile", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfile", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataZSideAccessPointProfile", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionsDataZSideAccessPointProfile build() {
            final var _resultValue = new GetConnectionsDataZSideAccessPointProfile();
            _resultValue.accessPointTypeConfigs = accessPointTypeConfigs;
            _resultValue.description = description;
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
