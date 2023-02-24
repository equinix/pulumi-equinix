// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.equinix.fabric.outputs.GetServiceProfileAccessPointTypeConfigApiConfig;
import com.pulumi.equinix.fabric.outputs.GetServiceProfileAccessPointTypeConfigAuthenticationKey;
import com.pulumi.equinix.fabric.outputs.GetServiceProfileAccessPointTypeConfigLinkProtocolConfig;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceProfileAccessPointTypeConfig {
    private Boolean allowBandwidthAutoApproval;
    private Boolean allowBandwidthUpgrade;
    private Boolean allowCustomBandwidth;
    private Boolean allowRemoteConnections;
    private List<GetServiceProfileAccessPointTypeConfigApiConfig> apiConfigs;
    private List<GetServiceProfileAccessPointTypeConfigAuthenticationKey> authenticationKeys;
    private Double bandwidthAlertThreshold;
    private String connectionLabel;
    private Boolean connectionRedundancyRequired;
    private Boolean enableAutoGenerateServiceKey;
    private List<GetServiceProfileAccessPointTypeConfigLinkProtocolConfig> linkProtocolConfigs;
    private List<Integer> supportedBandwidths;
    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     * 
     */
    private String type;
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    private String uuid;

    private GetServiceProfileAccessPointTypeConfig() {}
    public Boolean allowBandwidthAutoApproval() {
        return this.allowBandwidthAutoApproval;
    }
    public Boolean allowBandwidthUpgrade() {
        return this.allowBandwidthUpgrade;
    }
    public Boolean allowCustomBandwidth() {
        return this.allowCustomBandwidth;
    }
    public Boolean allowRemoteConnections() {
        return this.allowRemoteConnections;
    }
    public List<GetServiceProfileAccessPointTypeConfigApiConfig> apiConfigs() {
        return this.apiConfigs;
    }
    public List<GetServiceProfileAccessPointTypeConfigAuthenticationKey> authenticationKeys() {
        return this.authenticationKeys;
    }
    public Double bandwidthAlertThreshold() {
        return this.bandwidthAlertThreshold;
    }
    public String connectionLabel() {
        return this.connectionLabel;
    }
    public Boolean connectionRedundancyRequired() {
        return this.connectionRedundancyRequired;
    }
    public Boolean enableAutoGenerateServiceKey() {
        return this.enableAutoGenerateServiceKey;
    }
    public List<GetServiceProfileAccessPointTypeConfigLinkProtocolConfig> linkProtocolConfigs() {
        return this.linkProtocolConfigs;
    }
    public List<Integer> supportedBandwidths() {
        return this.supportedBandwidths;
    }
    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
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

    public static Builder builder(GetServiceProfileAccessPointTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowBandwidthAutoApproval;
        private Boolean allowBandwidthUpgrade;
        private Boolean allowCustomBandwidth;
        private Boolean allowRemoteConnections;
        private List<GetServiceProfileAccessPointTypeConfigApiConfig> apiConfigs;
        private List<GetServiceProfileAccessPointTypeConfigAuthenticationKey> authenticationKeys;
        private Double bandwidthAlertThreshold;
        private String connectionLabel;
        private Boolean connectionRedundancyRequired;
        private Boolean enableAutoGenerateServiceKey;
        private List<GetServiceProfileAccessPointTypeConfigLinkProtocolConfig> linkProtocolConfigs;
        private List<Integer> supportedBandwidths;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceProfileAccessPointTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowBandwidthAutoApproval = defaults.allowBandwidthAutoApproval;
    	      this.allowBandwidthUpgrade = defaults.allowBandwidthUpgrade;
    	      this.allowCustomBandwidth = defaults.allowCustomBandwidth;
    	      this.allowRemoteConnections = defaults.allowRemoteConnections;
    	      this.apiConfigs = defaults.apiConfigs;
    	      this.authenticationKeys = defaults.authenticationKeys;
    	      this.bandwidthAlertThreshold = defaults.bandwidthAlertThreshold;
    	      this.connectionLabel = defaults.connectionLabel;
    	      this.connectionRedundancyRequired = defaults.connectionRedundancyRequired;
    	      this.enableAutoGenerateServiceKey = defaults.enableAutoGenerateServiceKey;
    	      this.linkProtocolConfigs = defaults.linkProtocolConfigs;
    	      this.supportedBandwidths = defaults.supportedBandwidths;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allowBandwidthAutoApproval(Boolean allowBandwidthAutoApproval) {
            this.allowBandwidthAutoApproval = Objects.requireNonNull(allowBandwidthAutoApproval);
            return this;
        }
        @CustomType.Setter
        public Builder allowBandwidthUpgrade(Boolean allowBandwidthUpgrade) {
            this.allowBandwidthUpgrade = Objects.requireNonNull(allowBandwidthUpgrade);
            return this;
        }
        @CustomType.Setter
        public Builder allowCustomBandwidth(Boolean allowCustomBandwidth) {
            this.allowCustomBandwidth = Objects.requireNonNull(allowCustomBandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder allowRemoteConnections(Boolean allowRemoteConnections) {
            this.allowRemoteConnections = Objects.requireNonNull(allowRemoteConnections);
            return this;
        }
        @CustomType.Setter
        public Builder apiConfigs(List<GetServiceProfileAccessPointTypeConfigApiConfig> apiConfigs) {
            this.apiConfigs = Objects.requireNonNull(apiConfigs);
            return this;
        }
        public Builder apiConfigs(GetServiceProfileAccessPointTypeConfigApiConfig... apiConfigs) {
            return apiConfigs(List.of(apiConfigs));
        }
        @CustomType.Setter
        public Builder authenticationKeys(List<GetServiceProfileAccessPointTypeConfigAuthenticationKey> authenticationKeys) {
            this.authenticationKeys = Objects.requireNonNull(authenticationKeys);
            return this;
        }
        public Builder authenticationKeys(GetServiceProfileAccessPointTypeConfigAuthenticationKey... authenticationKeys) {
            return authenticationKeys(List.of(authenticationKeys));
        }
        @CustomType.Setter
        public Builder bandwidthAlertThreshold(Double bandwidthAlertThreshold) {
            this.bandwidthAlertThreshold = Objects.requireNonNull(bandwidthAlertThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder connectionLabel(String connectionLabel) {
            this.connectionLabel = Objects.requireNonNull(connectionLabel);
            return this;
        }
        @CustomType.Setter
        public Builder connectionRedundancyRequired(Boolean connectionRedundancyRequired) {
            this.connectionRedundancyRequired = Objects.requireNonNull(connectionRedundancyRequired);
            return this;
        }
        @CustomType.Setter
        public Builder enableAutoGenerateServiceKey(Boolean enableAutoGenerateServiceKey) {
            this.enableAutoGenerateServiceKey = Objects.requireNonNull(enableAutoGenerateServiceKey);
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocolConfigs(List<GetServiceProfileAccessPointTypeConfigLinkProtocolConfig> linkProtocolConfigs) {
            this.linkProtocolConfigs = Objects.requireNonNull(linkProtocolConfigs);
            return this;
        }
        public Builder linkProtocolConfigs(GetServiceProfileAccessPointTypeConfigLinkProtocolConfig... linkProtocolConfigs) {
            return linkProtocolConfigs(List.of(linkProtocolConfigs));
        }
        @CustomType.Setter
        public Builder supportedBandwidths(List<Integer> supportedBandwidths) {
            this.supportedBandwidths = Objects.requireNonNull(supportedBandwidths);
            return this;
        }
        public Builder supportedBandwidths(Integer... supportedBandwidths) {
            return supportedBandwidths(List.of(supportedBandwidths));
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
        public GetServiceProfileAccessPointTypeConfig build() {
            final var o = new GetServiceProfileAccessPointTypeConfig();
            o.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
            o.allowBandwidthUpgrade = allowBandwidthUpgrade;
            o.allowCustomBandwidth = allowCustomBandwidth;
            o.allowRemoteConnections = allowRemoteConnections;
            o.apiConfigs = apiConfigs;
            o.authenticationKeys = authenticationKeys;
            o.bandwidthAlertThreshold = bandwidthAlertThreshold;
            o.connectionLabel = connectionLabel;
            o.connectionRedundancyRequired = connectionRedundancyRequired;
            o.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
            o.linkProtocolConfigs = linkProtocolConfigs;
            o.supportedBandwidths = supportedBandwidths;
            o.type = type;
            o.uuid = uuid;
            return o;
        }
    }
}
