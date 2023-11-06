// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionASide;
import com.equinix.pulumi.fabric.outputs.GetConnectionAccount;
import com.equinix.pulumi.fabric.outputs.GetConnectionAdditionalInfo;
import com.equinix.pulumi.fabric.outputs.GetConnectionChangeLog;
import com.equinix.pulumi.fabric.outputs.GetConnectionNotification;
import com.equinix.pulumi.fabric.outputs.GetConnectionOperation;
import com.equinix.pulumi.fabric.outputs.GetConnectionOrder;
import com.equinix.pulumi.fabric.outputs.GetConnectionProject;
import com.equinix.pulumi.fabric.outputs.GetConnectionRedundancy;
import com.equinix.pulumi.fabric.outputs.GetConnectionZSide;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionResult {
    /**
     * @return Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    private GetConnectionASide aSide;
    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    private GetConnectionAccount account;
    /**
     * @return Connection additional information
     * 
     */
    private List<GetConnectionAdditionalInfo> additionalInfo;
    /**
     * @return Connection bandwidth in Mbps
     * 
     */
    private Integer bandwidth;
    /**
     * @return Captures connection lifecycle change information
     * 
     */
    private GetConnectionChangeLog changeLog;
    /**
     * @return Customer-provided connection description
     * 
     */
    private String description;
    /**
     * @return Connection directionality from the requester point of view
     * 
     */
    private String direction;
    /**
     * @return Connection URI information
     * 
     */
    private String href;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Connection property derived from access point locations
     * 
     */
    private Boolean isRemote;
    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    private String name;
    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    private List<GetConnectionNotification> notifications;
    /**
     * @return Connection specific operational data
     * 
     */
    private GetConnectionOperation operation;
    /**
     * @return Order related to this connection information
     * 
     */
    private GetConnectionOrder order;
    /**
     * @return Project information
     * 
     */
    private @Nullable GetConnectionProject project;
    /**
     * @return Redundancy Information
     * 
     */
    private GetConnectionRedundancy redundancy;
    /**
     * @return Connection overall state
     * 
     */
    private String state;
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, IP*VC, ACCESS*EPL_VC
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    private @Nullable String uuid;
    /**
     * @return Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    private GetConnectionZSide zSide;

    private GetConnectionResult() {}
    /**
     * @return Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    public GetConnectionASide aSide() {
        return this.aSide;
    }
    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public GetConnectionAccount account() {
        return this.account;
    }
    /**
     * @return Connection additional information
     * 
     */
    public List<GetConnectionAdditionalInfo> additionalInfo() {
        return this.additionalInfo;
    }
    /**
     * @return Connection bandwidth in Mbps
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public GetConnectionChangeLog changeLog() {
        return this.changeLog;
    }
    /**
     * @return Customer-provided connection description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Connection directionality from the requester point of view
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Connection URI information
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
     * @return Connection property derived from access point locations
     * 
     */
    public Boolean isRemote() {
        return this.isRemote;
    }
    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public List<GetConnectionNotification> notifications() {
        return this.notifications;
    }
    /**
     * @return Connection specific operational data
     * 
     */
    public GetConnectionOperation operation() {
        return this.operation;
    }
    /**
     * @return Order related to this connection information
     * 
     */
    public GetConnectionOrder order() {
        return this.order;
    }
    /**
     * @return Project information
     * 
     */
    public Optional<GetConnectionProject> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return Redundancy Information
     * 
     */
    public GetConnectionRedundancy redundancy() {
        return this.redundancy;
    }
    /**
     * @return Connection overall state
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, IP*VC, ACCESS*EPL_VC
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned connection identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    /**
     * @return Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    public GetConnectionZSide zSide() {
        return this.zSide;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetConnectionASide aSide;
        private GetConnectionAccount account;
        private List<GetConnectionAdditionalInfo> additionalInfo;
        private Integer bandwidth;
        private GetConnectionChangeLog changeLog;
        private String description;
        private String direction;
        private String href;
        private String id;
        private Boolean isRemote;
        private String name;
        private List<GetConnectionNotification> notifications;
        private GetConnectionOperation operation;
        private GetConnectionOrder order;
        private @Nullable GetConnectionProject project;
        private GetConnectionRedundancy redundancy;
        private String state;
        private String type;
        private @Nullable String uuid;
        private GetConnectionZSide zSide;
        public Builder() {}
        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aSide = defaults.aSide;
    	      this.account = defaults.account;
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.bandwidth = defaults.bandwidth;
    	      this.changeLog = defaults.changeLog;
    	      this.description = defaults.description;
    	      this.direction = defaults.direction;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.isRemote = defaults.isRemote;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.operation = defaults.operation;
    	      this.order = defaults.order;
    	      this.project = defaults.project;
    	      this.redundancy = defaults.redundancy;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.zSide = defaults.zSide;
        }

        @CustomType.Setter
        public Builder aSide(GetConnectionASide aSide) {
            this.aSide = Objects.requireNonNull(aSide);
            return this;
        }
        @CustomType.Setter
        public Builder account(GetConnectionAccount account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }
        @CustomType.Setter
        public Builder additionalInfo(List<GetConnectionAdditionalInfo> additionalInfo) {
            this.additionalInfo = Objects.requireNonNull(additionalInfo);
            return this;
        }
        public Builder additionalInfo(GetConnectionAdditionalInfo... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder changeLog(GetConnectionChangeLog changeLog) {
            this.changeLog = Objects.requireNonNull(changeLog);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
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
        public Builder isRemote(Boolean isRemote) {
            this.isRemote = Objects.requireNonNull(isRemote);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notifications(List<GetConnectionNotification> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(GetConnectionNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder operation(GetConnectionOperation operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        @CustomType.Setter
        public Builder order(GetConnectionOrder order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable GetConnectionProject project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder redundancy(GetConnectionRedundancy redundancy) {
            this.redundancy = Objects.requireNonNull(redundancy);
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
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder zSide(GetConnectionZSide zSide) {
            this.zSide = Objects.requireNonNull(zSide);
            return this;
        }
        public GetConnectionResult build() {
            final var _resultValue = new GetConnectionResult();
            _resultValue.aSide = aSide;
            _resultValue.account = account;
            _resultValue.additionalInfo = additionalInfo;
            _resultValue.bandwidth = bandwidth;
            _resultValue.changeLog = changeLog;
            _resultValue.description = description;
            _resultValue.direction = direction;
            _resultValue.href = href;
            _resultValue.id = id;
            _resultValue.isRemote = isRemote;
            _resultValue.name = name;
            _resultValue.notifications = notifications;
            _resultValue.operation = operation;
            _resultValue.order = order;
            _resultValue.project = project;
            _resultValue.redundancy = redundancy;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            _resultValue.zSide = zSide;
            return _resultValue;
        }
    }
}
