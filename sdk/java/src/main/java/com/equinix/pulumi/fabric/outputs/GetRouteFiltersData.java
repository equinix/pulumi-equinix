// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetRouteFiltersDataChange;
import com.equinix.pulumi.fabric.outputs.GetRouteFiltersDataChangeLog;
import com.equinix.pulumi.fabric.outputs.GetRouteFiltersDataProject;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteFiltersData {
    private List<GetRouteFiltersDataChangeLog> changeLogs;
    /**
     * @return An object with the details of the previous change applied on the Route Filter
     * 
     */
    private List<GetRouteFiltersDataChange> changes;
    /**
     * @return The number of Fabric Connections that this Route Filter is attached to
     * 
     */
    private Integer connectionsCount;
    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    private String description;
    /**
     * @return Route filter URI
     * 
     */
    private String href;
    /**
     * @return Name of the Route Filter
     * 
     */
    private String name;
    /**
     * @return The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
     * 
     */
    private String notMatchedRuleAction;
    /**
     * @return The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    private List<GetRouteFiltersDataProject> projects;
    /**
     * @return The number of Route Filter Rules attached to this Route Filter
     * 
     */
    private Integer rulesCount;
    /**
     * @return State of the Route Filter in its lifecycle
     * 
     */
    private String state;
    /**
     * @return Route Filter Type. One of [ &#34;BGP_IPv4_PREFIX_FILTER&#34;, &#34;BGP_IPv6_PREFIX_FILTER&#34; ]
     * 
     */
    private String type;
    /**
     * @return Equinix Assigned ID for Route Filter
     * 
     */
    private String uuid;

    private GetRouteFiltersData() {}
    public List<GetRouteFiltersDataChangeLog> changeLogs() {
        return this.changeLogs;
    }
    /**
     * @return An object with the details of the previous change applied on the Route Filter
     * 
     */
    public List<GetRouteFiltersDataChange> changes() {
        return this.changes;
    }
    /**
     * @return The number of Fabric Connections that this Route Filter is attached to
     * 
     */
    public Integer connectionsCount() {
        return this.connectionsCount;
    }
    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Route filter URI
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
     * @return The action that will be taken on ip ranges that don&#39;t match the rules present within the Route Filter
     * 
     */
    public String notMatchedRuleAction() {
        return this.notMatchedRuleAction;
    }
    /**
     * @return The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    public List<GetRouteFiltersDataProject> projects() {
        return this.projects;
    }
    /**
     * @return The number of Route Filter Rules attached to this Route Filter
     * 
     */
    public Integer rulesCount() {
        return this.rulesCount;
    }
    /**
     * @return State of the Route Filter in its lifecycle
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Route Filter Type. One of [ &#34;BGP_IPv4_PREFIX_FILTER&#34;, &#34;BGP_IPv6_PREFIX_FILTER&#34; ]
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix Assigned ID for Route Filter
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFiltersData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRouteFiltersDataChangeLog> changeLogs;
        private List<GetRouteFiltersDataChange> changes;
        private Integer connectionsCount;
        private String description;
        private String href;
        private String name;
        private String notMatchedRuleAction;
        private List<GetRouteFiltersDataProject> projects;
        private Integer rulesCount;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetRouteFiltersData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeLogs = defaults.changeLogs;
    	      this.changes = defaults.changes;
    	      this.connectionsCount = defaults.connectionsCount;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.notMatchedRuleAction = defaults.notMatchedRuleAction;
    	      this.projects = defaults.projects;
    	      this.rulesCount = defaults.rulesCount;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder changeLogs(List<GetRouteFiltersDataChangeLog> changeLogs) {
            if (changeLogs == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "changeLogs");
            }
            this.changeLogs = changeLogs;
            return this;
        }
        public Builder changeLogs(GetRouteFiltersDataChangeLog... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }
        @CustomType.Setter
        public Builder changes(List<GetRouteFiltersDataChange> changes) {
            if (changes == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "changes");
            }
            this.changes = changes;
            return this;
        }
        public Builder changes(GetRouteFiltersDataChange... changes) {
            return changes(List.of(changes));
        }
        @CustomType.Setter
        public Builder connectionsCount(Integer connectionsCount) {
            if (connectionsCount == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "connectionsCount");
            }
            this.connectionsCount = connectionsCount;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notMatchedRuleAction(String notMatchedRuleAction) {
            if (notMatchedRuleAction == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "notMatchedRuleAction");
            }
            this.notMatchedRuleAction = notMatchedRuleAction;
            return this;
        }
        @CustomType.Setter
        public Builder projects(List<GetRouteFiltersDataProject> projects) {
            if (projects == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "projects");
            }
            this.projects = projects;
            return this;
        }
        public Builder projects(GetRouteFiltersDataProject... projects) {
            return projects(List.of(projects));
        }
        @CustomType.Setter
        public Builder rulesCount(Integer rulesCount) {
            if (rulesCount == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "rulesCount");
            }
            this.rulesCount = rulesCount;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetRouteFiltersData", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetRouteFiltersData build() {
            final var _resultValue = new GetRouteFiltersData();
            _resultValue.changeLogs = changeLogs;
            _resultValue.changes = changes;
            _resultValue.connectionsCount = connectionsCount;
            _resultValue.description = description;
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.notMatchedRuleAction = notMatchedRuleAction;
            _resultValue.projects = projects;
            _resultValue.rulesCount = rulesCount;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}