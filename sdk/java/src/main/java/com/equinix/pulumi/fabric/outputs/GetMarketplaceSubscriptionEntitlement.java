// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetMarketplaceSubscriptionEntitlementAsset;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMarketplaceSubscriptionEntitlement {
    /**
     * @return Asset information
     * 
     */
    private List<GetMarketplaceSubscriptionEntitlementAsset> assets;
    /**
     * @return Available Quantity
     * 
     */
    private Integer quantityAvailable;
    /**
     * @return Consumed Quantity
     * 
     */
    private Integer quantityConsumed;
    /**
     * @return Entitled Quantity
     * 
     */
    private Integer quantityEntitled;
    /**
     * @return Subscription Entitlement Id
     * 
     */
    private String uuid;

    private GetMarketplaceSubscriptionEntitlement() {}
    /**
     * @return Asset information
     * 
     */
    public List<GetMarketplaceSubscriptionEntitlementAsset> assets() {
        return this.assets;
    }
    /**
     * @return Available Quantity
     * 
     */
    public Integer quantityAvailable() {
        return this.quantityAvailable;
    }
    /**
     * @return Consumed Quantity
     * 
     */
    public Integer quantityConsumed() {
        return this.quantityConsumed;
    }
    /**
     * @return Entitled Quantity
     * 
     */
    public Integer quantityEntitled() {
        return this.quantityEntitled;
    }
    /**
     * @return Subscription Entitlement Id
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMarketplaceSubscriptionEntitlement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetMarketplaceSubscriptionEntitlementAsset> assets;
        private Integer quantityAvailable;
        private Integer quantityConsumed;
        private Integer quantityEntitled;
        private String uuid;
        public Builder() {}
        public Builder(GetMarketplaceSubscriptionEntitlement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assets = defaults.assets;
    	      this.quantityAvailable = defaults.quantityAvailable;
    	      this.quantityConsumed = defaults.quantityConsumed;
    	      this.quantityEntitled = defaults.quantityEntitled;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder assets(List<GetMarketplaceSubscriptionEntitlementAsset> assets) {
            if (assets == null) {
              throw new MissingRequiredPropertyException("GetMarketplaceSubscriptionEntitlement", "assets");
            }
            this.assets = assets;
            return this;
        }
        public Builder assets(GetMarketplaceSubscriptionEntitlementAsset... assets) {
            return assets(List.of(assets));
        }
        @CustomType.Setter
        public Builder quantityAvailable(Integer quantityAvailable) {
            if (quantityAvailable == null) {
              throw new MissingRequiredPropertyException("GetMarketplaceSubscriptionEntitlement", "quantityAvailable");
            }
            this.quantityAvailable = quantityAvailable;
            return this;
        }
        @CustomType.Setter
        public Builder quantityConsumed(Integer quantityConsumed) {
            if (quantityConsumed == null) {
              throw new MissingRequiredPropertyException("GetMarketplaceSubscriptionEntitlement", "quantityConsumed");
            }
            this.quantityConsumed = quantityConsumed;
            return this;
        }
        @CustomType.Setter
        public Builder quantityEntitled(Integer quantityEntitled) {
            if (quantityEntitled == null) {
              throw new MissingRequiredPropertyException("GetMarketplaceSubscriptionEntitlement", "quantityEntitled");
            }
            this.quantityEntitled = quantityEntitled;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetMarketplaceSubscriptionEntitlement", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetMarketplaceSubscriptionEntitlement build() {
            final var _resultValue = new GetMarketplaceSubscriptionEntitlement();
            _resultValue.assets = assets;
            _resultValue.quantityAvailable = quantityAvailable;
            _resultValue.quantityConsumed = quantityConsumed;
            _resultValue.quantityEntitled = quantityEntitled;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}