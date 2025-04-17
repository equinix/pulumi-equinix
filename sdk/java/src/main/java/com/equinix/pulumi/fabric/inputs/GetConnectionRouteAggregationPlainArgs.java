// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionRouteAggregationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionRouteAggregationPlainArgs Empty = new GetConnectionRouteAggregationPlainArgs();

    /**
     * The uuid of the connection this data source should retrieve
     * 
     */
    @Import(name="connectionId", required=true)
    private String connectionId;

    /**
     * @return The uuid of the connection this data source should retrieve
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }

    /**
     * The uuid of the route aggregation this data source should retrieve
     * 
     */
    @Import(name="routeAggregationId", required=true)
    private String routeAggregationId;

    /**
     * @return The uuid of the route aggregation this data source should retrieve
     * 
     */
    public String routeAggregationId() {
        return this.routeAggregationId;
    }

    private GetConnectionRouteAggregationPlainArgs() {}

    private GetConnectionRouteAggregationPlainArgs(GetConnectionRouteAggregationPlainArgs $) {
        this.connectionId = $.connectionId;
        this.routeAggregationId = $.routeAggregationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionRouteAggregationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionRouteAggregationPlainArgs $;

        public Builder() {
            $ = new GetConnectionRouteAggregationPlainArgs();
        }

        public Builder(GetConnectionRouteAggregationPlainArgs defaults) {
            $ = new GetConnectionRouteAggregationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId The uuid of the connection this data source should retrieve
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param routeAggregationId The uuid of the route aggregation this data source should retrieve
         * 
         * @return builder
         * 
         */
        public Builder routeAggregationId(String routeAggregationId) {
            $.routeAggregationId = routeAggregationId;
            return this;
        }

        public GetConnectionRouteAggregationPlainArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("GetConnectionRouteAggregationPlainArgs", "connectionId");
            }
            if ($.routeAggregationId == null) {
                throw new MissingRequiredPropertyException("GetConnectionRouteAggregationPlainArgs", "routeAggregationId");
            }
            return $;
        }
    }

}
