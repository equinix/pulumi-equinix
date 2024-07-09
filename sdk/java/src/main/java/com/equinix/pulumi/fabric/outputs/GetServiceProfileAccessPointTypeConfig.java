// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccessPointTypeConfigApiConfig;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccessPointTypeConfigAuthenticationKey;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccessPointTypeConfigLinkProtocolConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfileAccessPointTypeConfig {
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
    private @Nullable GetServiceProfileAccessPointTypeConfigApiConfig apiConfig;
    /**
     * @return Authentication key details
     * 
     */
    private @Nullable GetServiceProfileAccessPointTypeConfigAuthenticationKey authenticationKey;
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
    private @Nullable GetServiceProfileAccessPointTypeConfigLinkProtocolConfig linkProtocolConfig;
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
    private String uuid;

    private GetServiceProfileAccessPointTypeConfig() {}
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
    public Optional<GetServiceProfileAccessPointTypeConfigApiConfig> apiConfig() {
        return Optional.ofNullable(this.apiConfig);
    }
    /**
     * @return Authentication key details
     * 
     */
    public Optional<GetServiceProfileAccessPointTypeConfigAuthenticationKey> authenticationKey() {
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
    public Optional<GetServiceProfileAccessPointTypeConfigLinkProtocolConfig> linkProtocolConfig() {
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
        private @Nullable Boolean allowBandwidthAutoApproval;
        private @Nullable Boolean allowBandwidthUpgrade;
        private @Nullable Boolean allowCustomBandwidth;
        private @Nullable Boolean allowRemoteConnections;
        private @Nullable GetServiceProfileAccessPointTypeConfigApiConfig apiConfig;
        private @Nullable GetServiceProfileAccessPointTypeConfigAuthenticationKey authenticationKey;
        private @Nullable Double bandwidthAlertThreshold;
        private @Nullable String connectionLabel;
        private @Nullable Boolean connectionRedundancyRequired;
        private @Nullable Boolean enableAutoGenerateServiceKey;
        private @Nullable GetServiceProfileAccessPointTypeConfigLinkProtocolConfig linkProtocolConfig;
        private @Nullable List<Integer> supportedBandwidths;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetServiceProfileAccessPointTypeConfig defaults) {
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
        public Builder apiConfig(@Nullable GetServiceProfileAccessPointTypeConfigApiConfig apiConfig) {

            this.apiConfig = apiConfig;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationKey(@Nullable GetServiceProfileAccessPointTypeConfigAuthenticationKey authenticationKey) {

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
        public Builder linkProtocolConfig(@Nullable GetServiceProfileAccessPointTypeConfigLinkProtocolConfig linkProtocolConfig) {

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
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileAccessPointTypeConfig", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileAccessPointTypeConfig", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetServiceProfileAccessPointTypeConfig build() {
            final var _resultValue = new GetServiceProfileAccessPointTypeConfig();
            _resultValue.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
            _resultValue.allowBandwidthUpgrade = allowBandwidthUpgrade;
            _resultValue.allowCustomBandwidth = allowCustomBandwidth;
            _resultValue.allowRemoteConnections = allowRemoteConnections;
            _resultValue.apiConfig = apiConfig;
            _resultValue.authenticationKey = authenticationKey;
            _resultValue.bandwidthAlertThreshold = bandwidthAlertThreshold;
            _resultValue.connectionLabel = connectionLabel;
            _resultValue.connectionRedundancyRequired = connectionRedundancyRequired;
            _resultValue.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
            _resultValue.linkProtocolConfig = linkProtocolConfig;
            _resultValue.supportedBandwidths = supportedBandwidths;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
