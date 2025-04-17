// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionRouteAggregationsData {
    /**
     * @return Status of the Route Aggregation Policy attachment lifecycle
     * 
     */
    private String attachmentStatus;
    /**
     * @return UUID of the Connection to attach this Route Aggregation to
     * 
     */
    private String connectionId;
    /**
     * @return URI to the attached Route Aggregation Policy on the Connection
     * 
     */
    private String href;
    /**
     * @return UUID of the Route Aggregation to attach this Connection to
     * 
     */
    private String routeAggregationId;
    /**
     * @return Route Aggregation Type. One of [&#34;BGP*IPv4*PREFIX_AGGREGATION&#34;]
     * 
     */
    private String type;
    /**
     * @return Equinix Assigned ID for Route Aggregation Policy
     * 
     */
    private String uuid;

    private GetConnectionRouteAggregationsData() {}
    /**
     * @return Status of the Route Aggregation Policy attachment lifecycle
     * 
     */
    public String attachmentStatus() {
        return this.attachmentStatus;
    }
    /**
     * @return UUID of the Connection to attach this Route Aggregation to
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }
    /**
     * @return URI to the attached Route Aggregation Policy on the Connection
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return UUID of the Route Aggregation to attach this Connection to
     * 
     */
    public String routeAggregationId() {
        return this.routeAggregationId;
    }
    /**
     * @return Route Aggregation Type. One of [&#34;BGP*IPv4*PREFIX_AGGREGATION&#34;]
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix Assigned ID for Route Aggregation Policy
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionRouteAggregationsData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attachmentStatus;
        private String connectionId;
        private String href;
        private String routeAggregationId;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionRouteAggregationsData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentStatus = defaults.attachmentStatus;
    	      this.connectionId = defaults.connectionId;
    	      this.href = defaults.href;
    	      this.routeAggregationId = defaults.routeAggregationId;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder attachmentStatus(String attachmentStatus) {
            if (attachmentStatus == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteAggregationsData", "attachmentStatus");
            }
            this.attachmentStatus = attachmentStatus;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(String connectionId) {
            if (connectionId == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteAggregationsData", "connectionId");
            }
            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteAggregationsData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder routeAggregationId(String routeAggregationId) {
            if (routeAggregationId == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteAggregationsData", "routeAggregationId");
            }
            this.routeAggregationId = routeAggregationId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteAggregationsData", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetConnectionRouteAggregationsData", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetConnectionRouteAggregationsData build() {
            final var _resultValue = new GetConnectionRouteAggregationsData();
            _resultValue.attachmentStatus = attachmentStatus;
            _resultValue.connectionId = connectionId;
            _resultValue.href = href;
            _resultValue.routeAggregationId = routeAggregationId;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
