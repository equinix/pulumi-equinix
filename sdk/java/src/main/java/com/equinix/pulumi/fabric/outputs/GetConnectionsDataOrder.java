// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataOrder {
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

    private GetConnectionsDataOrder() {}
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataOrder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String billingTier;
        private String orderId;
        private String orderNumber;
        private String purchaseOrderNumber;
        public Builder() {}
        public Builder(GetConnectionsDataOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingTier = defaults.billingTier;
    	      this.orderId = defaults.orderId;
    	      this.orderNumber = defaults.orderNumber;
    	      this.purchaseOrderNumber = defaults.purchaseOrderNumber;
        }

        @CustomType.Setter
        public Builder billingTier(String billingTier) {
            if (billingTier == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataOrder", "billingTier");
            }
            this.billingTier = billingTier;
            return this;
        }
        @CustomType.Setter
        public Builder orderId(String orderId) {
            if (orderId == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataOrder", "orderId");
            }
            this.orderId = orderId;
            return this;
        }
        @CustomType.Setter
        public Builder orderNumber(String orderNumber) {
            if (orderNumber == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataOrder", "orderNumber");
            }
            this.orderNumber = orderNumber;
            return this;
        }
        @CustomType.Setter
        public Builder purchaseOrderNumber(String purchaseOrderNumber) {
            if (purchaseOrderNumber == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataOrder", "purchaseOrderNumber");
            }
            this.purchaseOrderNumber = purchaseOrderNumber;
            return this;
        }
        public GetConnectionsDataOrder build() {
            final var _resultValue = new GetConnectionsDataOrder();
            _resultValue.billingTier = billingTier;
            _resultValue.orderId = orderId;
            _resultValue.orderNumber = orderNumber;
            _resultValue.purchaseOrderNumber = purchaseOrderNumber;
            return _resultValue;
        }
    }
}
