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
public final class ServiceProfileAccessPointTypeConfigApiConfig {
    /**
     * @return Setting showing that oversubscription support is available (true) or not (false). The default is false
     * 
     */
    private @Nullable Boolean allowOverSubscription;
    /**
     * @return Setting indicating whether the API is available (true) or not (false)
     * 
     */
    private @Nullable Boolean apiAvailable;
    /**
     * @return Bandwidth from api
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
     * @return Integration id
     * 
     */
    private @Nullable String integrationId;
    /**
     * @return A cap on over subscription
     * 
     */
    private @Nullable Integer overSubscriptionLimit;

    private ServiceProfileAccessPointTypeConfigApiConfig() {}
    /**
     * @return Setting showing that oversubscription support is available (true) or not (false). The default is false
     * 
     */
    public Optional<Boolean> allowOverSubscription() {
        return Optional.ofNullable(this.allowOverSubscription);
    }
    /**
     * @return Setting indicating whether the API is available (true) or not (false)
     * 
     */
    public Optional<Boolean> apiAvailable() {
        return Optional.ofNullable(this.apiAvailable);
    }
    /**
     * @return Bandwidth from api
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
     * @return Integration id
     * 
     */
    public Optional<String> integrationId() {
        return Optional.ofNullable(this.integrationId);
    }
    /**
     * @return A cap on over subscription
     * 
     */
    public Optional<Integer> overSubscriptionLimit() {
        return Optional.ofNullable(this.overSubscriptionLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileAccessPointTypeConfigApiConfig defaults) {
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
        public Builder(ServiceProfileAccessPointTypeConfigApiConfig defaults) {
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
        public ServiceProfileAccessPointTypeConfigApiConfig build() {
            final var o = new ServiceProfileAccessPointTypeConfigApiConfig();
            o.allowOverSubscription = allowOverSubscription;
            o.apiAvailable = apiAvailable;
            o.bandwidthFromApi = bandwidthFromApi;
            o.equinixManagedPort = equinixManagedPort;
            o.equinixManagedVlan = equinixManagedVlan;
            o.integrationId = integrationId;
            o.overSubscriptionLimit = overSubscriptionLimit;
            return o;
        }
    }
}
