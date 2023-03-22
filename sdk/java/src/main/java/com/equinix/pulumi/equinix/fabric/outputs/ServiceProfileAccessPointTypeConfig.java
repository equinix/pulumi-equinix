// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.outputs;

import com.equinix.pulumi.equinix.fabric.outputs.ServiceProfileAccessPointTypeConfigApiConfig;
import com.equinix.pulumi.equinix.fabric.outputs.ServiceProfileAccessPointTypeConfigAuthenticationKey;
import com.equinix.pulumi.equinix.fabric.outputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProfileAccessPointTypeConfig {
    /**
     * @return Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
     * 
     */
    private @Nullable Boolean allowBandwidthAutoApproval;
    /**
     * @return Availability of a bandwidth upgrade. The default is false
     * 
     */
    private @Nullable Boolean allowBandwidthUpgrade;
    /**
     * @return Setting to enable or disable the ability of the buyer to customize the bandwidth
     * 
     */
    private @Nullable Boolean allowCustomBandwidth;
    /**
     * @return Setting to allow or prohibit remote connections to the service profile
     * 
     */
    private @Nullable Boolean allowRemoteConnections;
    /**
     * @return Api configuration details
     * 
     */
    private @Nullable ServiceProfileAccessPointTypeConfigApiConfig apiConfig;
    /**
     * @return Authentication key details
     * 
     */
    private @Nullable ServiceProfileAccessPointTypeConfigAuthenticationKey authenticationKey;
    /**
     * @return Percentage of port bandwidth at which an allocation alert is generated
     * 
     */
    private @Nullable Double bandwidthAlertThreshold;
    /**
     * @return Custom name for Connection
     * 
     */
    private @Nullable String connectionLabel;
    /**
     * @return Mandate redundant connections
     * 
     */
    private @Nullable Boolean connectionRedundancyRequired;
    /**
     * @return Enable auto generate service key
     * 
     */
    private @Nullable Boolean enableAutoGenerateServiceKey;
    /**
     * @return Link protocol configuration details
     * 
     */
    private @Nullable ServiceProfileAccessPointTypeConfigLinkProtocolConfig linkProtocolConfig;
    /**
     * @return Supported bandwidths
     * 
     */
    private @Nullable List<Integer> supportedBandwidths;
    /**
     * @return Type of access point type config - VD, COLO
     * 
     */
    private String type;
    /**
     * @return Colo/Port Uuid
     * 
     */
    private @Nullable String uuid;

    private ServiceProfileAccessPointTypeConfig() {}
    /**
     * @return Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
     * 
     */
    public Optional<Boolean> allowBandwidthAutoApproval() {
        return Optional.ofNullable(this.allowBandwidthAutoApproval);
    }
    /**
     * @return Availability of a bandwidth upgrade. The default is false
     * 
     */
    public Optional<Boolean> allowBandwidthUpgrade() {
        return Optional.ofNullable(this.allowBandwidthUpgrade);
    }
    /**
     * @return Setting to enable or disable the ability of the buyer to customize the bandwidth
     * 
     */
    public Optional<Boolean> allowCustomBandwidth() {
        return Optional.ofNullable(this.allowCustomBandwidth);
    }
    /**
     * @return Setting to allow or prohibit remote connections to the service profile
     * 
     */
    public Optional<Boolean> allowRemoteConnections() {
        return Optional.ofNullable(this.allowRemoteConnections);
    }
    /**
     * @return Api configuration details
     * 
     */
    public Optional<ServiceProfileAccessPointTypeConfigApiConfig> apiConfig() {
        return Optional.ofNullable(this.apiConfig);
    }
    /**
     * @return Authentication key details
     * 
     */
    public Optional<ServiceProfileAccessPointTypeConfigAuthenticationKey> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }
    /**
     * @return Percentage of port bandwidth at which an allocation alert is generated
     * 
     */
    public Optional<Double> bandwidthAlertThreshold() {
        return Optional.ofNullable(this.bandwidthAlertThreshold);
    }
    /**
     * @return Custom name for Connection
     * 
     */
    public Optional<String> connectionLabel() {
        return Optional.ofNullable(this.connectionLabel);
    }
    /**
     * @return Mandate redundant connections
     * 
     */
    public Optional<Boolean> connectionRedundancyRequired() {
        return Optional.ofNullable(this.connectionRedundancyRequired);
    }
    /**
     * @return Enable auto generate service key
     * 
     */
    public Optional<Boolean> enableAutoGenerateServiceKey() {
        return Optional.ofNullable(this.enableAutoGenerateServiceKey);
    }
    /**
     * @return Link protocol configuration details
     * 
     */
    public Optional<ServiceProfileAccessPointTypeConfigLinkProtocolConfig> linkProtocolConfig() {
        return Optional.ofNullable(this.linkProtocolConfig);
    }
    /**
     * @return Supported bandwidths
     * 
     */
    public List<Integer> supportedBandwidths() {
        return this.supportedBandwidths == null ? List.of() : this.supportedBandwidths;
    }
    /**
     * @return Type of access point type config - VD, COLO
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Colo/Port Uuid
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileAccessPointTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowBandwidthAutoApproval;
        private @Nullable Boolean allowBandwidthUpgrade;
        private @Nullable Boolean allowCustomBandwidth;
        private @Nullable Boolean allowRemoteConnections;
        private @Nullable ServiceProfileAccessPointTypeConfigApiConfig apiConfig;
        private @Nullable ServiceProfileAccessPointTypeConfigAuthenticationKey authenticationKey;
        private @Nullable Double bandwidthAlertThreshold;
        private @Nullable String connectionLabel;
        private @Nullable Boolean connectionRedundancyRequired;
        private @Nullable Boolean enableAutoGenerateServiceKey;
        private @Nullable ServiceProfileAccessPointTypeConfigLinkProtocolConfig linkProtocolConfig;
        private @Nullable List<Integer> supportedBandwidths;
        private String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ServiceProfileAccessPointTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowBandwidthAutoApproval = defaults.allowBandwidthAutoApproval;
    	      this.allowBandwidthUpgrade = defaults.allowBandwidthUpgrade;
    	      this.allowCustomBandwidth = defaults.allowCustomBandwidth;
    	      this.allowRemoteConnections = defaults.allowRemoteConnections;
    	      this.apiConfig = defaults.apiConfig;
    	      this.authenticationKey = defaults.authenticationKey;
    	      this.bandwidthAlertThreshold = defaults.bandwidthAlertThreshold;
    	      this.connectionLabel = defaults.connectionLabel;
    	      this.connectionRedundancyRequired = defaults.connectionRedundancyRequired;
    	      this.enableAutoGenerateServiceKey = defaults.enableAutoGenerateServiceKey;
    	      this.linkProtocolConfig = defaults.linkProtocolConfig;
    	      this.supportedBandwidths = defaults.supportedBandwidths;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allowBandwidthAutoApproval(@Nullable Boolean allowBandwidthAutoApproval) {
            this.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
            return this;
        }
        @CustomType.Setter
        public Builder allowBandwidthUpgrade(@Nullable Boolean allowBandwidthUpgrade) {
            this.allowBandwidthUpgrade = allowBandwidthUpgrade;
            return this;
        }
        @CustomType.Setter
        public Builder allowCustomBandwidth(@Nullable Boolean allowCustomBandwidth) {
            this.allowCustomBandwidth = allowCustomBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder allowRemoteConnections(@Nullable Boolean allowRemoteConnections) {
            this.allowRemoteConnections = allowRemoteConnections;
            return this;
        }
        @CustomType.Setter
        public Builder apiConfig(@Nullable ServiceProfileAccessPointTypeConfigApiConfig apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationKey(@Nullable ServiceProfileAccessPointTypeConfigAuthenticationKey authenticationKey) {
            this.authenticationKey = authenticationKey;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthAlertThreshold(@Nullable Double bandwidthAlertThreshold) {
            this.bandwidthAlertThreshold = bandwidthAlertThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder connectionLabel(@Nullable String connectionLabel) {
            this.connectionLabel = connectionLabel;
            return this;
        }
        @CustomType.Setter
        public Builder connectionRedundancyRequired(@Nullable Boolean connectionRedundancyRequired) {
            this.connectionRedundancyRequired = connectionRedundancyRequired;
            return this;
        }
        @CustomType.Setter
        public Builder enableAutoGenerateServiceKey(@Nullable Boolean enableAutoGenerateServiceKey) {
            this.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
            return this;
        }
        @CustomType.Setter
        public Builder linkProtocolConfig(@Nullable ServiceProfileAccessPointTypeConfigLinkProtocolConfig linkProtocolConfig) {
            this.linkProtocolConfig = linkProtocolConfig;
            return this;
        }
        @CustomType.Setter
        public Builder supportedBandwidths(@Nullable List<Integer> supportedBandwidths) {
            this.supportedBandwidths = supportedBandwidths;
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
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public ServiceProfileAccessPointTypeConfig build() {
            final var o = new ServiceProfileAccessPointTypeConfig();
            o.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
            o.allowBandwidthUpgrade = allowBandwidthUpgrade;
            o.allowCustomBandwidth = allowCustomBandwidth;
            o.allowRemoteConnections = allowRemoteConnections;
            o.apiConfig = apiConfig;
            o.authenticationKey = authenticationKey;
            o.bandwidthAlertThreshold = bandwidthAlertThreshold;
            o.connectionLabel = connectionLabel;
            o.connectionRedundancyRequired = connectionRedundancyRequired;
            o.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
            o.linkProtocolConfig = linkProtocolConfig;
            o.supportedBandwidths = supportedBandwidths;
            o.type = type;
            o.uuid = uuid;
            return o;
        }
    }
}
