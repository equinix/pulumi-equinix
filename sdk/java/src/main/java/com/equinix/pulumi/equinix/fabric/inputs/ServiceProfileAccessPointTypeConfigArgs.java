// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.equinix.pulumi.equinix.fabric.enums.ProfileAccessPointType;
import com.equinix.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigApiConfigArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProfileAccessPointTypeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProfileAccessPointTypeConfigArgs Empty = new ServiceProfileAccessPointTypeConfigArgs();

    /**
     * Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
     * 
     */
    @Import(name="allowBandwidthAutoApproval")
    private @Nullable Output<Boolean> allowBandwidthAutoApproval;

    /**
     * @return Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
     * 
     */
    public Optional<Output<Boolean>> allowBandwidthAutoApproval() {
        return Optional.ofNullable(this.allowBandwidthAutoApproval);
    }

    /**
     * Availability of a bandwidth upgrade. The default is false
     * 
     */
    @Import(name="allowBandwidthUpgrade")
    private @Nullable Output<Boolean> allowBandwidthUpgrade;

    /**
     * @return Availability of a bandwidth upgrade. The default is false
     * 
     */
    public Optional<Output<Boolean>> allowBandwidthUpgrade() {
        return Optional.ofNullable(this.allowBandwidthUpgrade);
    }

    /**
     * Setting to enable or disable the ability of the buyer to customize the bandwidth
     * 
     */
    @Import(name="allowCustomBandwidth")
    private @Nullable Output<Boolean> allowCustomBandwidth;

    /**
     * @return Setting to enable or disable the ability of the buyer to customize the bandwidth
     * 
     */
    public Optional<Output<Boolean>> allowCustomBandwidth() {
        return Optional.ofNullable(this.allowCustomBandwidth);
    }

    /**
     * Setting to allow or prohibit remote connections to the service profile
     * 
     */
    @Import(name="allowRemoteConnections")
    private @Nullable Output<Boolean> allowRemoteConnections;

    /**
     * @return Setting to allow or prohibit remote connections to the service profile
     * 
     */
    public Optional<Output<Boolean>> allowRemoteConnections() {
        return Optional.ofNullable(this.allowRemoteConnections);
    }

    /**
     * Api configuration details
     * 
     */
    @Import(name="apiConfig")
    private @Nullable Output<ServiceProfileAccessPointTypeConfigApiConfigArgs> apiConfig;

    /**
     * @return Api configuration details
     * 
     */
    public Optional<Output<ServiceProfileAccessPointTypeConfigApiConfigArgs>> apiConfig() {
        return Optional.ofNullable(this.apiConfig);
    }

    /**
     * Authentication key details
     * 
     */
    @Import(name="authenticationKey")
    private @Nullable Output<ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs> authenticationKey;

    /**
     * @return Authentication key details
     * 
     */
    public Optional<Output<ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs>> authenticationKey() {
        return Optional.ofNullable(this.authenticationKey);
    }

    /**
     * Percentage of port bandwidth at which an allocation alert is generated
     * 
     */
    @Import(name="bandwidthAlertThreshold")
    private @Nullable Output<Double> bandwidthAlertThreshold;

    /**
     * @return Percentage of port bandwidth at which an allocation alert is generated
     * 
     */
    public Optional<Output<Double>> bandwidthAlertThreshold() {
        return Optional.ofNullable(this.bandwidthAlertThreshold);
    }

    /**
     * Custom name for Connection
     * 
     */
    @Import(name="connectionLabel")
    private @Nullable Output<String> connectionLabel;

    /**
     * @return Custom name for Connection
     * 
     */
    public Optional<Output<String>> connectionLabel() {
        return Optional.ofNullable(this.connectionLabel);
    }

    /**
     * Mandate redundant connections
     * 
     */
    @Import(name="connectionRedundancyRequired")
    private @Nullable Output<Boolean> connectionRedundancyRequired;

    /**
     * @return Mandate redundant connections
     * 
     */
    public Optional<Output<Boolean>> connectionRedundancyRequired() {
        return Optional.ofNullable(this.connectionRedundancyRequired);
    }

    /**
     * Enable auto generate service key
     * 
     */
    @Import(name="enableAutoGenerateServiceKey")
    private @Nullable Output<Boolean> enableAutoGenerateServiceKey;

    /**
     * @return Enable auto generate service key
     * 
     */
    public Optional<Output<Boolean>> enableAutoGenerateServiceKey() {
        return Optional.ofNullable(this.enableAutoGenerateServiceKey);
    }

    /**
     * Link protocol configuration details
     * 
     */
    @Import(name="linkProtocolConfig")
    private @Nullable Output<ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs> linkProtocolConfig;

    /**
     * @return Link protocol configuration details
     * 
     */
    public Optional<Output<ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs>> linkProtocolConfig() {
        return Optional.ofNullable(this.linkProtocolConfig);
    }

    /**
     * Supported bandwidths
     * 
     */
    @Import(name="supportedBandwidths")
    private @Nullable Output<List<Integer>> supportedBandwidths;

    /**
     * @return Supported bandwidths
     * 
     */
    public Optional<Output<List<Integer>>> supportedBandwidths() {
        return Optional.ofNullable(this.supportedBandwidths);
    }

    /**
     * Type of access point type config - VD, COLO
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ProfileAccessPointType>> type;

    /**
     * @return Type of access point type config - VD, COLO
     * 
     */
    public Output<Either<String,ProfileAccessPointType>> type() {
        return this.type;
    }

    /**
     * Colo/Port Uuid
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Colo/Port Uuid
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private ServiceProfileAccessPointTypeConfigArgs() {}

    private ServiceProfileAccessPointTypeConfigArgs(ServiceProfileAccessPointTypeConfigArgs $) {
        this.allowBandwidthAutoApproval = $.allowBandwidthAutoApproval;
        this.allowBandwidthUpgrade = $.allowBandwidthUpgrade;
        this.allowCustomBandwidth = $.allowCustomBandwidth;
        this.allowRemoteConnections = $.allowRemoteConnections;
        this.apiConfig = $.apiConfig;
        this.authenticationKey = $.authenticationKey;
        this.bandwidthAlertThreshold = $.bandwidthAlertThreshold;
        this.connectionLabel = $.connectionLabel;
        this.connectionRedundancyRequired = $.connectionRedundancyRequired;
        this.enableAutoGenerateServiceKey = $.enableAutoGenerateServiceKey;
        this.linkProtocolConfig = $.linkProtocolConfig;
        this.supportedBandwidths = $.supportedBandwidths;
        this.type = $.type;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProfileAccessPointTypeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProfileAccessPointTypeConfigArgs $;

        public Builder() {
            $ = new ServiceProfileAccessPointTypeConfigArgs();
        }

        public Builder(ServiceProfileAccessPointTypeConfigArgs defaults) {
            $ = new ServiceProfileAccessPointTypeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowBandwidthAutoApproval Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
         * 
         * @return builder
         * 
         */
        public Builder allowBandwidthAutoApproval(@Nullable Output<Boolean> allowBandwidthAutoApproval) {
            $.allowBandwidthAutoApproval = allowBandwidthAutoApproval;
            return this;
        }

        /**
         * @param allowBandwidthAutoApproval Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
         * 
         * @return builder
         * 
         */
        public Builder allowBandwidthAutoApproval(Boolean allowBandwidthAutoApproval) {
            return allowBandwidthAutoApproval(Output.of(allowBandwidthAutoApproval));
        }

        /**
         * @param allowBandwidthUpgrade Availability of a bandwidth upgrade. The default is false
         * 
         * @return builder
         * 
         */
        public Builder allowBandwidthUpgrade(@Nullable Output<Boolean> allowBandwidthUpgrade) {
            $.allowBandwidthUpgrade = allowBandwidthUpgrade;
            return this;
        }

        /**
         * @param allowBandwidthUpgrade Availability of a bandwidth upgrade. The default is false
         * 
         * @return builder
         * 
         */
        public Builder allowBandwidthUpgrade(Boolean allowBandwidthUpgrade) {
            return allowBandwidthUpgrade(Output.of(allowBandwidthUpgrade));
        }

        /**
         * @param allowCustomBandwidth Setting to enable or disable the ability of the buyer to customize the bandwidth
         * 
         * @return builder
         * 
         */
        public Builder allowCustomBandwidth(@Nullable Output<Boolean> allowCustomBandwidth) {
            $.allowCustomBandwidth = allowCustomBandwidth;
            return this;
        }

        /**
         * @param allowCustomBandwidth Setting to enable or disable the ability of the buyer to customize the bandwidth
         * 
         * @return builder
         * 
         */
        public Builder allowCustomBandwidth(Boolean allowCustomBandwidth) {
            return allowCustomBandwidth(Output.of(allowCustomBandwidth));
        }

        /**
         * @param allowRemoteConnections Setting to allow or prohibit remote connections to the service profile
         * 
         * @return builder
         * 
         */
        public Builder allowRemoteConnections(@Nullable Output<Boolean> allowRemoteConnections) {
            $.allowRemoteConnections = allowRemoteConnections;
            return this;
        }

        /**
         * @param allowRemoteConnections Setting to allow or prohibit remote connections to the service profile
         * 
         * @return builder
         * 
         */
        public Builder allowRemoteConnections(Boolean allowRemoteConnections) {
            return allowRemoteConnections(Output.of(allowRemoteConnections));
        }

        /**
         * @param apiConfig Api configuration details
         * 
         * @return builder
         * 
         */
        public Builder apiConfig(@Nullable Output<ServiceProfileAccessPointTypeConfigApiConfigArgs> apiConfig) {
            $.apiConfig = apiConfig;
            return this;
        }

        /**
         * @param apiConfig Api configuration details
         * 
         * @return builder
         * 
         */
        public Builder apiConfig(ServiceProfileAccessPointTypeConfigApiConfigArgs apiConfig) {
            return apiConfig(Output.of(apiConfig));
        }

        /**
         * @param authenticationKey Authentication key details
         * 
         * @return builder
         * 
         */
        public Builder authenticationKey(@Nullable Output<ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs> authenticationKey) {
            $.authenticationKey = authenticationKey;
            return this;
        }

        /**
         * @param authenticationKey Authentication key details
         * 
         * @return builder
         * 
         */
        public Builder authenticationKey(ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs authenticationKey) {
            return authenticationKey(Output.of(authenticationKey));
        }

        /**
         * @param bandwidthAlertThreshold Percentage of port bandwidth at which an allocation alert is generated
         * 
         * @return builder
         * 
         */
        public Builder bandwidthAlertThreshold(@Nullable Output<Double> bandwidthAlertThreshold) {
            $.bandwidthAlertThreshold = bandwidthAlertThreshold;
            return this;
        }

        /**
         * @param bandwidthAlertThreshold Percentage of port bandwidth at which an allocation alert is generated
         * 
         * @return builder
         * 
         */
        public Builder bandwidthAlertThreshold(Double bandwidthAlertThreshold) {
            return bandwidthAlertThreshold(Output.of(bandwidthAlertThreshold));
        }

        /**
         * @param connectionLabel Custom name for Connection
         * 
         * @return builder
         * 
         */
        public Builder connectionLabel(@Nullable Output<String> connectionLabel) {
            $.connectionLabel = connectionLabel;
            return this;
        }

        /**
         * @param connectionLabel Custom name for Connection
         * 
         * @return builder
         * 
         */
        public Builder connectionLabel(String connectionLabel) {
            return connectionLabel(Output.of(connectionLabel));
        }

        /**
         * @param connectionRedundancyRequired Mandate redundant connections
         * 
         * @return builder
         * 
         */
        public Builder connectionRedundancyRequired(@Nullable Output<Boolean> connectionRedundancyRequired) {
            $.connectionRedundancyRequired = connectionRedundancyRequired;
            return this;
        }

        /**
         * @param connectionRedundancyRequired Mandate redundant connections
         * 
         * @return builder
         * 
         */
        public Builder connectionRedundancyRequired(Boolean connectionRedundancyRequired) {
            return connectionRedundancyRequired(Output.of(connectionRedundancyRequired));
        }

        /**
         * @param enableAutoGenerateServiceKey Enable auto generate service key
         * 
         * @return builder
         * 
         */
        public Builder enableAutoGenerateServiceKey(@Nullable Output<Boolean> enableAutoGenerateServiceKey) {
            $.enableAutoGenerateServiceKey = enableAutoGenerateServiceKey;
            return this;
        }

        /**
         * @param enableAutoGenerateServiceKey Enable auto generate service key
         * 
         * @return builder
         * 
         */
        public Builder enableAutoGenerateServiceKey(Boolean enableAutoGenerateServiceKey) {
            return enableAutoGenerateServiceKey(Output.of(enableAutoGenerateServiceKey));
        }

        /**
         * @param linkProtocolConfig Link protocol configuration details
         * 
         * @return builder
         * 
         */
        public Builder linkProtocolConfig(@Nullable Output<ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs> linkProtocolConfig) {
            $.linkProtocolConfig = linkProtocolConfig;
            return this;
        }

        /**
         * @param linkProtocolConfig Link protocol configuration details
         * 
         * @return builder
         * 
         */
        public Builder linkProtocolConfig(ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs linkProtocolConfig) {
            return linkProtocolConfig(Output.of(linkProtocolConfig));
        }

        /**
         * @param supportedBandwidths Supported bandwidths
         * 
         * @return builder
         * 
         */
        public Builder supportedBandwidths(@Nullable Output<List<Integer>> supportedBandwidths) {
            $.supportedBandwidths = supportedBandwidths;
            return this;
        }

        /**
         * @param supportedBandwidths Supported bandwidths
         * 
         * @return builder
         * 
         */
        public Builder supportedBandwidths(List<Integer> supportedBandwidths) {
            return supportedBandwidths(Output.of(supportedBandwidths));
        }

        /**
         * @param supportedBandwidths Supported bandwidths
         * 
         * @return builder
         * 
         */
        public Builder supportedBandwidths(Integer... supportedBandwidths) {
            return supportedBandwidths(List.of(supportedBandwidths));
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ProfileAccessPointType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ProfileAccessPointType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Type of access point type config - VD, COLO
         * 
         * @return builder
         * 
         */
        public Builder type(ProfileAccessPointType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param uuid Colo/Port Uuid
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Colo/Port Uuid
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public ServiceProfileAccessPointTypeConfigArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
