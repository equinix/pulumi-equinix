// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRouteFilterRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouteFilterRulePlainArgs Empty = new GetRouteFilterRulePlainArgs();

    /**
     * UUID of the Route Filter Policy the rule is attached to
     * 
     */
    @Import(name="routeFilterId", required=true)
    private String routeFilterId;

    /**
     * @return UUID of the Route Filter Policy the rule is attached to
     * 
     */
    public String routeFilterId() {
        return this.routeFilterId;
    }

    /**
     * Equinix Assigned ID for Route Filter Rule to retrieve data for
     * 
     */
    @Import(name="uuid", required=true)
    private String uuid;

    /**
     * @return Equinix Assigned ID for Route Filter Rule to retrieve data for
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    private GetRouteFilterRulePlainArgs() {}

    private GetRouteFilterRulePlainArgs(GetRouteFilterRulePlainArgs $) {
        this.routeFilterId = $.routeFilterId;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouteFilterRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouteFilterRulePlainArgs $;

        public Builder() {
            $ = new GetRouteFilterRulePlainArgs();
        }

        public Builder(GetRouteFilterRulePlainArgs defaults) {
            $ = new GetRouteFilterRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeFilterId UUID of the Route Filter Policy the rule is attached to
         * 
         * @return builder
         * 
         */
        public Builder routeFilterId(String routeFilterId) {
            $.routeFilterId = routeFilterId;
            return this;
        }

        /**
         * @param uuid Equinix Assigned ID for Route Filter Rule to retrieve data for
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetRouteFilterRulePlainArgs build() {
            if ($.routeFilterId == null) {
                throw new MissingRequiredPropertyException("GetRouteFilterRulePlainArgs", "routeFilterId");
            }
            if ($.uuid == null) {
                throw new MissingRequiredPropertyException("GetRouteFilterRulePlainArgs", "uuid");
            }
            return $;
        }
    }

}
