// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudRoutersDataOrder {
    /**
     * @return Billing tier for connection bandwidth
     * 
     */
    private String billingTier;
    /**
     * @return Order Identification
     * 
     */
    private String orderId;
    /**
     * @return Order Reference Number
     * 
     */
    private String orderNumber;
    /**
     * @return Purchase order number
     * 
     */
    private String purchaseOrderNumber;
    /**
     * @return Term length in months; valid values are 1, 12, 24, 36 where 1 is the default value (for on-demand case)
     * 
     */
    private @Nullable Integer termLength;

    private GetCloudRoutersDataOrder() {}
    /**
     * @return Billing tier for connection bandwidth
     * 
     */
    public String billingTier() {
        return this.billingTier;
    }
    /**
     * @return Order Identification
     * 
     */
    public String orderId() {
        return this.orderId;
    }
    /**
     * @return Order Reference Number
     * 
     */
    public String orderNumber() {
        return this.orderNumber;
    }
    /**
     * @return Purchase order number
     * 
     */
    public String purchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }
    /**
     * @return Term length in months; valid values are 1, 12, 24, 36 where 1 is the default value (for on-demand case)
     * 
     */
    public Optional<Integer> termLength() {
        return Optional.ofNullable(this.termLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudRoutersDataOrder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String billingTier;
        private String orderId;
        private String orderNumber;
        private String purchaseOrderNumber;
        private @Nullable Integer termLength;
        public Builder() {}
        public Builder(GetCloudRoutersDataOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingTier = defaults.billingTier;
    	      this.orderId = defaults.orderId;
    	      this.orderNumber = defaults.orderNumber;
    	      this.purchaseOrderNumber = defaults.purchaseOrderNumber;
    	      this.termLength = defaults.termLength;
        }

        @CustomType.Setter
        public Builder billingTier(String billingTier) {
            if (billingTier == null) {
              throw new MissingRequiredPropertyException("GetCloudRoutersDataOrder", "billingTier");
            }
            this.billingTier = billingTier;
            return this;
        }
        @CustomType.Setter
        public Builder orderId(String orderId) {
            if (orderId == null) {
              throw new MissingRequiredPropertyException("GetCloudRoutersDataOrder", "orderId");
            }
            this.orderId = orderId;
            return this;
        }
        @CustomType.Setter
        public Builder orderNumber(String orderNumber) {
            if (orderNumber == null) {
              throw new MissingRequiredPropertyException("GetCloudRoutersDataOrder", "orderNumber");
            }
            this.orderNumber = orderNumber;
            return this;
        }
        @CustomType.Setter
        public Builder purchaseOrderNumber(String purchaseOrderNumber) {
            if (purchaseOrderNumber == null) {
              throw new MissingRequiredPropertyException("GetCloudRoutersDataOrder", "purchaseOrderNumber");
            }
            this.purchaseOrderNumber = purchaseOrderNumber;
            return this;
        }
        @CustomType.Setter
        public Builder termLength(@Nullable Integer termLength) {

            this.termLength = termLength;
            return this;
        }
        public GetCloudRoutersDataOrder build() {
            final var _resultValue = new GetCloudRoutersDataOrder();
            _resultValue.billingTier = billingTier;
            _resultValue.orderId = orderId;
            _resultValue.orderNumber = orderNumber;
            _resultValue.purchaseOrderNumber = purchaseOrderNumber;
            _resultValue.termLength = termLength;
            return _resultValue;
        }
    }
}
