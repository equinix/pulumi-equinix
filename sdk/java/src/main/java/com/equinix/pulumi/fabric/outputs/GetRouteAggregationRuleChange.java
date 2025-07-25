// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteAggregationRuleChange {
    /**
     * @return Equinix auto generated URI to the route aggregation change
     * 
     */
    private String href;
    /**
     * @return Equinix defined Route Aggregation Change Type
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned unique id for a change
     * 
     */
    private String uuid;

    private GetRouteAggregationRuleChange() {}
    /**
     * @return Equinix auto generated URI to the route aggregation change
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Equinix defined Route Aggregation Change Type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned unique id for a change
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteAggregationRuleChange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetRouteAggregationRuleChange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRuleChange", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRuleChange", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRuleChange", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetRouteAggregationRuleChange build() {
            final var _resultValue = new GetRouteAggregationRuleChange();
            _resultValue.href = href;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
