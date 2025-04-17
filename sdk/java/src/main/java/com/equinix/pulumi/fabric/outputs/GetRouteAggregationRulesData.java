// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetRouteAggregationRulesDataChange;
import com.equinix.pulumi.fabric.outputs.GetRouteAggregationRulesDataChangeLog;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteAggregationRulesData {
    /**
     * @return Current state of latest route aggregation rule change
     * 
     */
    private GetRouteAggregationRulesDataChange change;
    /**
     * @return Details of the last change on the stream resource
     * 
     */
    private GetRouteAggregationRulesDataChangeLog changeLog;
    /**
     * @return Customer-provided route aggregation rule description
     * 
     */
    private @Nullable String description;
    /**
     * @return Equinix auto generated URI to the route aggregation rule resource
     * 
     */
    private String href;
    /**
     * @return Customer provided name of the route aggregation rule
     * 
     */
    private String name;
    /**
     * @return Customer-provided route aggregation rule prefix
     * 
     */
    private String prefix;
    /**
     * @return UUID of the Route Aggregation to apply this Rule to
     * 
     */
    private String routeAggregationId;
    /**
     * @return Value representing provisioning status for the route aggregation rule resource
     * 
     */
    private String state;
    /**
     * @return Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned unique id for the route aggregation rule resource
     * 
     */
    private String uuid;

    private GetRouteAggregationRulesData() {}
    /**
     * @return Current state of latest route aggregation rule change
     * 
     */
    public GetRouteAggregationRulesDataChange change() {
        return this.change;
    }
    /**
     * @return Details of the last change on the stream resource
     * 
     */
    public GetRouteAggregationRulesDataChangeLog changeLog() {
        return this.changeLog;
    }
    /**
     * @return Customer-provided route aggregation rule description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Equinix auto generated URI to the route aggregation rule resource
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Customer provided name of the route aggregation rule
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Customer-provided route aggregation rule prefix
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return UUID of the Route Aggregation to apply this Rule to
     * 
     */
    public String routeAggregationId() {
        return this.routeAggregationId;
    }
    /**
     * @return Value representing provisioning status for the route aggregation rule resource
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned unique id for the route aggregation rule resource
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteAggregationRulesData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetRouteAggregationRulesDataChange change;
        private GetRouteAggregationRulesDataChangeLog changeLog;
        private @Nullable String description;
        private String href;
        private String name;
        private String prefix;
        private String routeAggregationId;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetRouteAggregationRulesData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.change = defaults.change;
    	      this.changeLog = defaults.changeLog;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.routeAggregationId = defaults.routeAggregationId;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder change(GetRouteAggregationRulesDataChange change) {
            if (change == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "change");
            }
            this.change = change;
            return this;
        }
        @CustomType.Setter
        public Builder changeLog(GetRouteAggregationRulesDataChangeLog changeLog) {
            if (changeLog == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "changeLog");
            }
            this.changeLog = changeLog;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder routeAggregationId(String routeAggregationId) {
            if (routeAggregationId == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "routeAggregationId");
            }
            this.routeAggregationId = routeAggregationId;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetRouteAggregationRulesData", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetRouteAggregationRulesData build() {
            final var _resultValue = new GetRouteAggregationRulesData();
            _resultValue.change = change;
            _resultValue.changeLog = changeLog;
            _resultValue.description = description;
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.prefix = prefix;
            _resultValue.routeAggregationId = routeAggregationId;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
