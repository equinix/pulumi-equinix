// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetRouteFilterRulesDataChange;
import com.equinix.pulumi.fabric.outputs.GetRouteFilterRulesDataChangeLog;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteFilterRulesData {
    /**
     * @return Action that will be taken on IP Addresses matching the rule
     * 
     */
    private String action;
    private List<GetRouteFilterRulesDataChangeLog> changeLogs;
    /**
     * @return An object with the details of the previous change applied on the Route Filter
     * 
     */
    private List<GetRouteFilterRulesDataChange> changes;
    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    private String description;
    /**
     * @return Route filter rules URI
     * 
     */
    private String href;
    /**
     * @return Name of the Route Filter
     * 
     */
    private String name;
    /**
     * @return IP Address Prefix to Filter on
     * 
     */
    private String prefix;
    /**
     * @return Prefix matching operator. One of [ orlonger, exact ] Default: &#34;orlonger&#34;
     * 
     */
    private String prefixMatch;
    /**
     * @return State of the Route Filter Rule in its lifecycle
     * 
     */
    private String state;
    /**
     * @return Route Filter Type. One of [ BGP_IPv4_PREFIX_FILTER_RULE, BGP_IPv6_PREFIX_FILTER_RULE ]
     * 
     */
    private String type;
    /**
     * @return Equinix Assigned ID for Route Filter Rule to retrieve data for
     * 
     */
    private String uuid;

    private GetRouteFilterRulesData() {}
    /**
     * @return Action that will be taken on IP Addresses matching the rule
     * 
     */
    public String action() {
        return this.action;
    }
    public List<GetRouteFilterRulesDataChangeLog> changeLogs() {
        return this.changeLogs;
    }
    /**
     * @return An object with the details of the previous change applied on the Route Filter
     * 
     */
    public List<GetRouteFilterRulesDataChange> changes() {
        return this.changes;
    }
    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Route filter rules URI
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Name of the Route Filter
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return IP Address Prefix to Filter on
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return Prefix matching operator. One of [ orlonger, exact ] Default: &#34;orlonger&#34;
     * 
     */
    public String prefixMatch() {
        return this.prefixMatch;
    }
    /**
     * @return State of the Route Filter Rule in its lifecycle
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Route Filter Type. One of [ BGP_IPv4_PREFIX_FILTER_RULE, BGP_IPv6_PREFIX_FILTER_RULE ]
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix Assigned ID for Route Filter Rule to retrieve data for
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFilterRulesData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<GetRouteFilterRulesDataChangeLog> changeLogs;
        private List<GetRouteFilterRulesDataChange> changes;
        private String description;
        private String href;
        private String name;
        private String prefix;
        private String prefixMatch;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetRouteFilterRulesData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.changeLogs = defaults.changeLogs;
    	      this.changes = defaults.changes;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder changeLogs(List<GetRouteFilterRulesDataChangeLog> changeLogs) {
            if (changeLogs == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "changeLogs");
            }
            this.changeLogs = changeLogs;
            return this;
        }
        public Builder changeLogs(GetRouteFilterRulesDataChangeLog... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }
        @CustomType.Setter
        public Builder changes(List<GetRouteFilterRulesDataChange> changes) {
            if (changes == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "changes");
            }
            this.changes = changes;
            return this;
        }
        public Builder changes(GetRouteFilterRulesDataChange... changes) {
            return changes(List.of(changes));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder prefixMatch(String prefixMatch) {
            if (prefixMatch == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "prefixMatch");
            }
            this.prefixMatch = prefixMatch;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetRouteFilterRulesData", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetRouteFilterRulesData build() {
            final var _resultValue = new GetRouteFilterRulesData();
            _resultValue.action = action;
            _resultValue.changeLogs = changeLogs;
            _resultValue.changes = changes;
            _resultValue.description = description;
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.prefix = prefix;
            _resultValue.prefixMatch = prefixMatch;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}