// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetNetworksDataChange;
import com.equinix.pulumi.fabric.outputs.GetNetworksDataChangeLog;
import com.equinix.pulumi.fabric.outputs.GetNetworksDataLocation;
import com.equinix.pulumi.fabric.outputs.GetNetworksDataNotification;
import com.equinix.pulumi.fabric.outputs.GetNetworksDataOperation;
import com.equinix.pulumi.fabric.outputs.GetNetworksDataProject;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworksData {
    /**
     * @return A permanent record of asset creation, modification, or deletion
     * 
     */
    private List<GetNetworksDataChangeLog> changeLogs;
    /**
     * @return Information on asset change operation
     * 
     */
    private List<GetNetworksDataChange> changes;
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
     * @return Fabric Network location
     * 
     */
    private List<GetNetworksDataLocation> locations;
    /**
     * @return Fabric Network name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    private String name;
    /**
     * @return Preferences for notifications on Fabric Network configuration or status changes
     * 
     */
    private List<GetNetworksDataNotification> notifications;
    /**
     * @return Network operation information that is associated with this Fabric Network
     * 
     */
    private List<GetNetworksDataOperation> operations;
    /**
     * @return Fabric Network project
     * 
     */
    private List<GetNetworksDataProject> projects;
    /**
     * @return Fabric Network scope. Valid values: [REGIONAL GLOBAL LOCAL]. Note: When scope is REGIONAL, the location.region field is required.
     * 
     */
    private String scope;
    /**
     * @return Fabric Network overall state
     * 
     */
    private String state;
    /**
     * @return Supported Network types - EVPLAN, EPLAN, IPWAN, EVPTREE, EPTREE
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned network identifier
     * 
     */
    private String uuid;

    private GetNetworksData() {}
    /**
     * @return A permanent record of asset creation, modification, or deletion
     * 
     */
    public List<GetNetworksDataChangeLog> changeLogs() {
        return this.changeLogs;
    }
    /**
     * @return Information on asset change operation
     * 
     */
    public List<GetNetworksDataChange> changes() {
        return this.changes;
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
     * @return Fabric Network location
     * 
     */
    public List<GetNetworksDataLocation> locations() {
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
    public List<GetNetworksDataNotification> notifications() {
        return this.notifications;
    }
    /**
     * @return Network operation information that is associated with this Fabric Network
     * 
     */
    public List<GetNetworksDataOperation> operations() {
        return this.operations;
    }
    /**
     * @return Fabric Network project
     * 
     */
    public List<GetNetworksDataProject> projects() {
        return this.projects;
    }
    /**
     * @return Fabric Network scope. Valid values: [REGIONAL GLOBAL LOCAL]. Note: When scope is REGIONAL, the location.region field is required.
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
     * @return Supported Network types - EVPLAN, EPLAN, IPWAN, EVPTREE, EPTREE
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

    public static Builder builder(GetNetworksData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetNetworksDataChangeLog> changeLogs;
        private List<GetNetworksDataChange> changes;
        private Integer connectionsCount;
        private String href;
        private List<GetNetworksDataLocation> locations;
        private String name;
        private List<GetNetworksDataNotification> notifications;
        private List<GetNetworksDataOperation> operations;
        private List<GetNetworksDataProject> projects;
        private String scope;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetNetworksData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeLogs = defaults.changeLogs;
    	      this.changes = defaults.changes;
    	      this.connectionsCount = defaults.connectionsCount;
    	      this.href = defaults.href;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.operations = defaults.operations;
    	      this.projects = defaults.projects;
    	      this.scope = defaults.scope;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder changeLogs(List<GetNetworksDataChangeLog> changeLogs) {
            if (changeLogs == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "changeLogs");
            }
            this.changeLogs = changeLogs;
            return this;
        }
        public Builder changeLogs(GetNetworksDataChangeLog... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }
        @CustomType.Setter
        public Builder changes(List<GetNetworksDataChange> changes) {
            if (changes == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "changes");
            }
            this.changes = changes;
            return this;
        }
        public Builder changes(GetNetworksDataChange... changes) {
            return changes(List.of(changes));
        }
        @CustomType.Setter
        public Builder connectionsCount(Integer connectionsCount) {
            if (connectionsCount == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "connectionsCount");
            }
            this.connectionsCount = connectionsCount;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder locations(List<GetNetworksDataLocation> locations) {
            if (locations == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "locations");
            }
            this.locations = locations;
            return this;
        }
        public Builder locations(GetNetworksDataLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notifications(List<GetNetworksDataNotification> notifications) {
            if (notifications == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "notifications");
            }
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(GetNetworksDataNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder operations(List<GetNetworksDataOperation> operations) {
            if (operations == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "operations");
            }
            this.operations = operations;
            return this;
        }
        public Builder operations(GetNetworksDataOperation... operations) {
            return operations(List.of(operations));
        }
        @CustomType.Setter
        public Builder projects(List<GetNetworksDataProject> projects) {
            if (projects == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "projects");
            }
            this.projects = projects;
            return this;
        }
        public Builder projects(GetNetworksDataProject... projects) {
            return projects(List.of(projects));
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "scope");
            }
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetNetworksData", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetNetworksData build() {
            final var _resultValue = new GetNetworksData();
            _resultValue.changeLogs = changeLogs;
            _resultValue.changes = changes;
            _resultValue.connectionsCount = connectionsCount;
            _resultValue.href = href;
            _resultValue.locations = locations;
            _resultValue.name = name;
            _resultValue.notifications = notifications;
            _resultValue.operations = operations;
            _resultValue.projects = projects;
            _resultValue.scope = scope;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
