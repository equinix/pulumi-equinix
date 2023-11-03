// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceProfileAccessPointTypeConfigApiConfig {
    private Boolean allowOverSubscription;
    private Boolean apiAvailable;
    private Boolean bandwidthFromApi;
    private Boolean equinixManagedPort;
    private Boolean equinixManagedVlan;
    private String integrationId;
    private Integer overSubscriptionLimit;

    private GetServiceProfileAccessPointTypeConfigApiConfig() {}
    public Boolean allowOverSubscription() {
        return this.allowOverSubscription;
    }
    public Boolean apiAvailable() {
        return this.apiAvailable;
    }
    public Boolean bandwidthFromApi() {
        return this.bandwidthFromApi;
    }
    public Boolean equinixManagedPort() {
        return this.equinixManagedPort;
    }
    public Boolean equinixManagedVlan() {
        return this.equinixManagedVlan;
    }
    public String integrationId() {
        return this.integrationId;
    }
    public Integer overSubscriptionLimit() {
        return this.overSubscriptionLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfileAccessPointTypeConfigApiConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowOverSubscription;
        private Boolean apiAvailable;
        private Boolean bandwidthFromApi;
        private Boolean equinixManagedPort;
        private Boolean equinixManagedVlan;
        private String integrationId;
        private Integer overSubscriptionLimit;
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
        public Builder allowOverSubscription(Boolean allowOverSubscription) {
            this.allowOverSubscription = Objects.requireNonNull(allowOverSubscription);
            return this;
        }
        @CustomType.Setter
        public Builder apiAvailable(Boolean apiAvailable) {
            this.apiAvailable = Objects.requireNonNull(apiAvailable);
            return this;
        }
        @CustomType.Setter
        public Builder bandwidthFromApi(Boolean bandwidthFromApi) {
            this.bandwidthFromApi = Objects.requireNonNull(bandwidthFromApi);
            return this;
        }
        @CustomType.Setter
        public Builder equinixManagedPort(Boolean equinixManagedPort) {
            this.equinixManagedPort = Objects.requireNonNull(equinixManagedPort);
            return this;
        }
        @CustomType.Setter
        public Builder equinixManagedVlan(Boolean equinixManagedVlan) {
            this.equinixManagedVlan = Objects.requireNonNull(equinixManagedVlan);
            return this;
        }
        @CustomType.Setter
        public Builder integrationId(String integrationId) {
            this.integrationId = Objects.requireNonNull(integrationId);
            return this;
        }
        @CustomType.Setter
        public Builder overSubscriptionLimit(Integer overSubscriptionLimit) {
            this.overSubscriptionLimit = Objects.requireNonNull(overSubscriptionLimit);
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
