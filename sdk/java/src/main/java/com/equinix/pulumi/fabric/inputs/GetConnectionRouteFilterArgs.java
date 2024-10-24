// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionRouteFilterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionRouteFilterArgs Empty = new GetConnectionRouteFilterArgs();

    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    @Import(name="routeFilterId", required=true)
    private Output<String> routeFilterId;

    /**
     * @return Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
     * 
     */
    public Output<String> routeFilterId() {
        return this.routeFilterId;
    }

    private GetConnectionRouteFilterArgs() {}

    private GetConnectionRouteFilterArgs(GetConnectionRouteFilterArgs $) {
        this.connectionId = $.connectionId;
        this.routeFilterId = $.routeFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionRouteFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionRouteFilterArgs $;

        public Builder() {
            $ = new GetConnectionRouteFilterArgs();
        }

        public Builder(GetConnectionRouteFilterArgs defaults) {
            $ = new GetConnectionRouteFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param routeFilterId Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
         * 
         * @return builder
         * 
         */
        public Builder routeFilterId(Output<String> routeFilterId) {
            $.routeFilterId = routeFilterId;
            return this;
        }

        /**
         * @param routeFilterId Equinix Assigned UUID of the Route Filter Policy to attach to the Equinix Connection
         * 
         * @return builder
         * 
         */
        public Builder routeFilterId(String routeFilterId) {
            return routeFilterId(Output.of(routeFilterId));
        }

        public GetConnectionRouteFilterArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("GetConnectionRouteFilterArgs", "connectionId");
            }
            if ($.routeFilterId == null) {
                throw new MissingRequiredPropertyException("GetConnectionRouteFilterArgs", "routeFilterId");
            }
            return $;
        }
    }

}
