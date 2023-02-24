// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionOrder {
    private String billingTier;
    private String orderId;
    private String orderNumber;
    private String purchaseOrderNumber;

    private GetConnectionOrder() {}
    public String billingTier() {
        return this.billingTier;
    }
    public String orderId() {
        return this.orderId;
    }
    public String orderNumber() {
        return this.orderNumber;
    }
    public String purchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOrder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String billingTier;
        private String orderId;
        private String orderNumber;
        private String purchaseOrderNumber;
        public Builder() {}
        public Builder(GetConnectionOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingTier = defaults.billingTier;
    	      this.orderId = defaults.orderId;
    	      this.orderNumber = defaults.orderNumber;
    	      this.purchaseOrderNumber = defaults.purchaseOrderNumber;
        }

        @CustomType.Setter
        public Builder billingTier(String billingTier) {
            this.billingTier = Objects.requireNonNull(billingTier);
            return this;
        }
        @CustomType.Setter
        public Builder orderId(String orderId) {
            this.orderId = Objects.requireNonNull(orderId);
            return this;
        }
        @CustomType.Setter
        public Builder orderNumber(String orderNumber) {
            this.orderNumber = Objects.requireNonNull(orderNumber);
            return this;
        }
        @CustomType.Setter
        public Builder purchaseOrderNumber(String purchaseOrderNumber) {
            this.purchaseOrderNumber = Objects.requireNonNull(purchaseOrderNumber);
            return this;
        }
        public GetConnectionOrder build() {
            final var o = new GetConnectionOrder();
            o.billingTier = billingTier;
            o.orderId = orderId;
            o.orderNumber = orderNumber;
            o.purchaseOrderNumber = purchaseOrderNumber;
            return o;
        }
    }
}
