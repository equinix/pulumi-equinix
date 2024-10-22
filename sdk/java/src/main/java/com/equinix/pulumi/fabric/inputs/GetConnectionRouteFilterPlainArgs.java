// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionRouteFilterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionRouteFilterPlainArgs Empty = new GetConnectionRouteFilterPlainArgs();

    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    @Import(name="connectionId", required=true)
    private String connectionId;

    /**
     * @return Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }

    /**
     * Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    @Import(name="routeFilterId", required=true)
    private String routeFilterId;

    /**
     * @return Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    public String routeFilterId() {
        return this.routeFilterId;
    }

    private GetConnectionRouteFilterPlainArgs() {}

    private GetConnectionRouteFilterPlainArgs(GetConnectionRouteFilterPlainArgs $) {
        this.connectionId = $.connectionId;
        this.routeFilterId = $.routeFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionRouteFilterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionRouteFilterPlainArgs $;

        public Builder() {
            $ = new GetConnectionRouteFilterPlainArgs();
        }

        public Builder(GetConnectionRouteFilterPlainArgs defaults) {
            $ = new GetConnectionRouteFilterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param routeFilterId Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
         * 
         * @return builder
         * 
         */
        public Builder routeFilterId(String routeFilterId) {
            $.routeFilterId = routeFilterId;
            return this;
        }

        public GetConnectionRouteFilterPlainArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("GetConnectionRouteFilterPlainArgs", "connectionId");
            }
            if ($.routeFilterId == null) {
                throw new MissingRequiredPropertyException("GetConnectionRouteFilterPlainArgs", "routeFilterId");
            }
            return $;
        }
    }

}
