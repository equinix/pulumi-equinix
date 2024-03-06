// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfileAccessPointTypeConfigApiConfig {
    /**
     * @return Setting showing that oversubscription support is available (true) or not (false). The default is false
     * 
     */
    private @Nullable Boolean allowOverSubscription;
    /**
     * @return Indicates if it&#39;s possible to establish connections based on the given service profile using the Equinix Fabric API.
     * 
     */
    private @Nullable Boolean apiAvailable;
    /**
     * @return Indicates if the connection bandwidth can be obtained directly from the cloud service provider.
     * 
     */
    private @Nullable Boolean bandwidthFromApi;
    /**
     * @return Setting indicating that the port is managed by Equinix (true) or not (false)
     * 
     */
    private @Nullable Boolean equinixManagedPort;
    /**
     * @return Setting indicating that the VLAN is managed by Equinix (true) or not (false)
     * 
     */
    private @Nullable Boolean equinixManagedVlan;
    /**
     * @return A unique identifier issued during onboarding and used to integrate the customer&#39;s service profile with the Equinix Fabric API.
     * 
     */
    private @Nullable String integrationId;
    /**
     * @return Port bandwidth multiplier that determines the total bandwidth that can be allocated to users creating connections to your services. For example, a 10 Gbps port combined with an overSubscriptionLimit parameter value of 10 allows your subscribers to create connections with a total bandwidth of 100 Gbps.
     * 
     */
    private @Nullable Integer overSubscriptionLimit;

    private GetServiceProfileAccessPointTypeConfigApiConfig() {}
    /**
     * @return Setting showing that oversubscription support is available (true) or not (false). The default is false
     * 
     */
    public Optional<Boolean> allowOverSubscription() {
        return Optional.ofNullable(this.allowOverSubscription);
    }
    /**
     * @return Indicates if it&#39;s possible to establish connections based on the given service profile using the Equinix Fabric API.
     * 
     */
    public Optional<Boolean> apiAvailable() {
        return Optional.ofNullable(this.apiAvailable);
    }
    /**
     * @return Indicates if the connection bandwidth can be obtained directly from the cloud service provider.
     * 
     */
    public Optional<Boolean> bandwidthFromApi() {
        return Optional.ofNullable(this.bandwidthFromApi);
    }
    /**
     * @return Setting indicating that the port is managed by Equinix (true) or not (false)
     * 
     */
    public Optional<Boolean> equinixManagedPort() {
        return Optional.ofNullable(this.equinixManagedPort);
    }
    /**
     * @return Setting indicating that the VLAN is managed by Equinix (true) or not (false)
     * 
     */
    public Optional<Boolean> equinixManagedVlan() {
        return Optional.ofNullable(this.equinixManagedVlan);
    }
    /**
     * @return A unique identifier issued during onboarding and used to integrate the customer&#39;s service profile with the Equinix Fabric API.
     * 
     */
    public Optional<String> integrationId() {
        return Optional.ofNullable(this.integrationId);
    }
    /**
     * @return Port bandwidth multiplier that determines the total bandwidth that can be allocated to users creating connections to your services. For example, a 10 Gbps port combined with an overSubscriptionLimit parameter value of 10 allows your subscribers to create connections with a total bandwidth of 100 Gbps.
     * 
     */
    public Optional<Integer> overSubscriptionLimit() {
        return Optional.ofNullable(this.overSubscriptionLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfileAccessPointTypeConfigApiConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowOverSubscription;
        private @Nullable Boolean apiAvailable;
        private @Nullable Boolean bandwidthFromApi;
        private @Nullable Boolean equinixManagedPort;
        private @Nullable Boolean equinixManagedVlan;
        private @Nullable String integrationId;
        private @Nullable Integer overSubscriptionLimit;
        public Builder() {}
        public Builder(GetServiceProfileAccessPointTypeConfigApiConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOverSubscription = defaults.allowOverSubscription;
    	      this.apiAvailable = defaults.apiAvailable;
    	      this.bandwidthFromApi = defaults.bandwidthFromApi;
    	      this.equinixManagedPort = defaults.equinixManagedPort;
    	      this.equinixManagedVlan = defaults.equinixManagedVlan;
    	      this.integrationId = defaults.integrationId;
    	      this.overSubscriptionLimit = defaults.overSubscriptionLimit;
        }

        @CustomType.Setter
        public Builder allowOverSubscription(@Nullable Boolean allowOverSubscription) {
            this.allowOverSubscription = allowOverSubscription;
            return this;
        }
        @CustomType.Setter
        public Builder apiAvailable(@Nullable Boolean apiAvailable) {
            this.apiAvailable = apiAvailable;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthFromApi(@Nullable Boolean bandwidthFromApi) {
            this.bandwidthFromApi = bandwidthFromApi;
            return this;
        }
        @CustomType.Setter
        public Builder equinixManagedPort(@Nullable Boolean equinixManagedPort) {
            this.equinixManagedPort = equinixManagedPort;
            return this;
        }
        @CustomType.Setter
        public Builder equinixManagedVlan(@Nullable Boolean equinixManagedVlan) {
            this.equinixManagedVlan = equinixManagedVlan;
            return this;
        }
        @CustomType.Setter
        public Builder integrationId(@Nullable String integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        @CustomType.Setter
        public Builder overSubscriptionLimit(@Nullable Integer overSubscriptionLimit) {
            this.overSubscriptionLimit = overSubscriptionLimit;
            return this;
        }
        public GetServiceProfileAccessPointTypeConfigApiConfig build() {
            final var _resultValue = new GetServiceProfileAccessPointTypeConfigApiConfig();
            _resultValue.allowOverSubscription = allowOverSubscription;
            _resultValue.apiAvailable = apiAvailable;
            _resultValue.bandwidthFromApi = bandwidthFromApi;
            _resultValue.equinixManagedPort = equinixManagedPort;
            _resultValue.equinixManagedVlan = equinixManagedVlan;
            _resultValue.integrationId = integrationId;
            _resultValue.overSubscriptionLimit = overSubscriptionLimit;
            return _resultValue;
        }
    }
}
