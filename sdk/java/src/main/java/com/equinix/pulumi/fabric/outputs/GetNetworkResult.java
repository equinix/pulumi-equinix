// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetNetworkChange;
import com.equinix.pulumi.fabric.outputs.GetNetworkChangeLog;
import com.equinix.pulumi.fabric.outputs.GetNetworkLocation;
import com.equinix.pulumi.fabric.outputs.GetNetworkNotification;
import com.equinix.pulumi.fabric.outputs.GetNetworkOperation;
import com.equinix.pulumi.fabric.outputs.GetNetworkProject;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkResult {
    /**
     * @return Information on asset change operation
     * 
     */
    private GetNetworkChange change;
    /**
     * @return A permanent record of asset creation, modification, or deletion
     * 
     */
    private GetNetworkChangeLog changeLog;
    /**
     * @return Number of connections associated with this network
     * 
     */
    private Integer connectionsCount;
    /**
     * @return Fabric Network URI information
     * 
     */
    private String href;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Fabric Network location
     * 
     */
    private List<GetNetworkLocation> locations;
    /**
     * @return Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    private String name;
    /**
     * @return Preferences for notifications on Fabric Network configuration or status changes
     * 
     */
    private List<GetNetworkNotification> notifications;
    /**
     * @return Network operation information that is associated with this Fabric Network
     * 
     */
    private GetNetworkOperation operation;
    /**
     * @return Fabric Network project
     * 
     */
    private GetNetworkProject project;
    /**
     * @return Fabric Network scope
     * 
     */
    private String scope;
    /**
     * @return Fabric Network overall state
     * 
     */
    private String state;
    /**
     * @return Supported Network types - EVPLAN, EPLAN, IPWAN
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned network identifier
     * 
     */
    private String uuid;

    private GetNetworkResult() {}
    /**
     * @return Information on asset change operation
     * 
     */
    public GetNetworkChange change() {
        return this.change;
    }
    /**
     * @return A permanent record of asset creation, modification, or deletion
     * 
     */
    public GetNetworkChangeLog changeLog() {
        return this.changeLog;
    }
    /**
     * @return Number of connections associated with this network
     * 
     */
    public Integer connectionsCount() {
        return this.connectionsCount;
    }
    /**
     * @return Fabric Network URI information
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Fabric Network location
     * 
     */
    public List<GetNetworkLocation> locations() {
        return this.locations;
    }
    /**
     * @return Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Preferences for notifications on Fabric Network configuration or status changes
     * 
     */
    public List<GetNetworkNotification> notifications() {
        return this.notifications;
    }
    /**
     * @return Network operation information that is associated with this Fabric Network
     * 
     */
    public GetNetworkOperation operation() {
        return this.operation;
    }
    /**
     * @return Fabric Network project
     * 
     */
    public GetNetworkProject project() {
        return this.project;
    }
    /**
     * @return Fabric Network scope
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return Fabric Network overall state
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Supported Network types - EVPLAN, EPLAN, IPWAN
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned network identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetNetworkChange change;
        private GetNetworkChangeLog changeLog;
        private Integer connectionsCount;
        private String href;
        private String id;
        private List<GetNetworkLocation> locations;
        private String name;
        private List<GetNetworkNotification> notifications;
        private GetNetworkOperation operation;
        private GetNetworkProject project;
        private String scope;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.change = defaults.change;
    	      this.changeLog = defaults.changeLog;
    	      this.connectionsCount = defaults.connectionsCount;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.operation = defaults.operation;
    	      this.project = defaults.project;
    	      this.scope = defaults.scope;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder change(GetNetworkChange change) {
            this.change = Objects.requireNonNull(change);
            return this;
        }
        @CustomType.Setter
        public Builder changeLog(GetNetworkChangeLog changeLog) {
            this.changeLog = Objects.requireNonNull(changeLog);
            return this;
        }
        @CustomType.Setter
        public Builder connectionsCount(Integer connectionsCount) {
            this.connectionsCount = Objects.requireNonNull(connectionsCount);
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<GetNetworkLocation> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }
        public Builder locations(GetNetworkLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notifications(List<GetNetworkNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetNetworkNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder operation(GetNetworkOperation operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        @CustomType.Setter
        public Builder project(GetNetworkProject project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetNetworkResult build() {
            final var _resultValue = new GetNetworkResult();
            _resultValue.change = change;
            _resultValue.changeLog = changeLog;
            _resultValue.connectionsCount = connectionsCount;
            _resultValue.href = href;
            _resultValue.id = id;
            _resultValue.locations = locations;
            _resultValue.name = name;
            _resultValue.notifications = notifications;
            _resultValue.operation = operation;
            _resultValue.project = project;
            _resultValue.scope = scope;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
