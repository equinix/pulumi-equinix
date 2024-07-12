// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccessPointTypeConfig;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileAccount;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileChangeLog;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileCustomField;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileMarketingInfo;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileMetro;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileNotification;
import com.equinix.pulumi.fabric.outputs.GetServiceProfilePort;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileProject;
import com.equinix.pulumi.fabric.outputs.GetServiceProfileVirtualDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceProfileResult {
    /**
     * @return Access point config information
     * 
     */
    private List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs;
    /**
     * @return Service Profile Owner Account Information
     * 
     */
    private GetServiceProfileAccount account;
    /**
     * @return Array of contact emails
     * 
     */
    private List<String> allowedEmails;
    /**
     * @return Captures connection lifecycle change information
     * 
     */
    private GetServiceProfileChangeLog changeLog;
    /**
     * @return Custom Fields
     * 
     */
    private List<GetServiceProfileCustomField> customFields;
    /**
     * @return User-provided service description
     * 
     */
    private String description;
    /**
     * @return Service Profile URI response attribute
     * 
     */
    private String href;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Marketing Info
     * 
     */
    private GetServiceProfileMarketingInfo marketingInfo;
    /**
     * @return Access point config information
     * 
     */
    private List<GetServiceProfileMetro> metros;
    /**
     * @return Customer-assigned service profile name
     * 
     */
    private String name;
    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    private List<GetServiceProfileNotification> notifications;
    /**
     * @return Ports
     * 
     */
    private List<GetServiceProfilePort> ports;
    /**
     * @return Project information
     * 
     */
    private GetServiceProfileProject project;
    /**
     * @return Self Profile indicating if the profile is created for customer&#39;s self use
     * 
     */
    private Boolean selfProfile;
    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    private String state;
    /**
     * @return Tags attached to the connection
     * 
     */
    private List<String> tags;
    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     * 
     */
    private String type;
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    private String uuid;
    private String viewPoint;
    /**
     * @return Virtual Devices
     * 
     */
    private List<GetServiceProfileVirtualDevice> virtualDevices;
    /**
     * @return Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    private String visibility;

    private GetServiceProfileResult() {}
    /**
     * @return Access point config information
     * 
     */
    public List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs() {
        return this.accessPointTypeConfigs;
    }
    /**
     * @return Service Profile Owner Account Information
     * 
     */
    public GetServiceProfileAccount account() {
        return this.account;
    }
    /**
     * @return Array of contact emails
     * 
     */
    public List<String> allowedEmails() {
        return this.allowedEmails;
    }
    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public GetServiceProfileChangeLog changeLog() {
        return this.changeLog;
    }
    /**
     * @return Custom Fields
     * 
     */
    public List<GetServiceProfileCustomField> customFields() {
        return this.customFields;
    }
    /**
     * @return User-provided service description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Service Profile URI response attribute
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
     * @return Marketing Info
     * 
     */
    public GetServiceProfileMarketingInfo marketingInfo() {
        return this.marketingInfo;
    }
    /**
     * @return Access point config information
     * 
     */
    public List<GetServiceProfileMetro> metros() {
        return this.metros;
    }
    /**
     * @return Customer-assigned service profile name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public List<GetServiceProfileNotification> notifications() {
        return this.notifications;
    }
    /**
     * @return Ports
     * 
     */
    public List<GetServiceProfilePort> ports() {
        return this.ports;
    }
    /**
     * @return Project information
     * 
     */
    public GetServiceProfileProject project() {
        return this.project;
    }
    /**
     * @return Self Profile indicating if the profile is created for customer&#39;s self use
     * 
     */
    public Boolean selfProfile() {
        return this.selfProfile;
    }
    /**
     * @return Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Tags attached to the connection
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix assigned service profile identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }
    public String viewPoint() {
        return this.viewPoint;
    }
    /**
     * @return Virtual Devices
     * 
     */
    public List<GetServiceProfileVirtualDevice> virtualDevices() {
        return this.virtualDevices;
    }
    /**
     * @return Service profile visibility - PUBLIC, PRIVATE
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs;
        private GetServiceProfileAccount account;
        private List<String> allowedEmails;
        private GetServiceProfileChangeLog changeLog;
        private List<GetServiceProfileCustomField> customFields;
        private String description;
        private String href;
        private String id;
        private GetServiceProfileMarketingInfo marketingInfo;
        private List<GetServiceProfileMetro> metros;
        private String name;
        private List<GetServiceProfileNotification> notifications;
        private List<GetServiceProfilePort> ports;
        private GetServiceProfileProject project;
        private Boolean selfProfile;
        private String state;
        private List<String> tags;
        private String type;
        private String uuid;
        private String viewPoint;
        private List<GetServiceProfileVirtualDevice> virtualDevices;
        private String visibility;
        public Builder() {}
        public Builder(GetServiceProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTypeConfigs = defaults.accessPointTypeConfigs;
    	      this.account = defaults.account;
    	      this.allowedEmails = defaults.allowedEmails;
    	      this.changeLog = defaults.changeLog;
    	      this.customFields = defaults.customFields;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.marketingInfo = defaults.marketingInfo;
    	      this.metros = defaults.metros;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.ports = defaults.ports;
    	      this.project = defaults.project;
    	      this.selfProfile = defaults.selfProfile;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.viewPoint = defaults.viewPoint;
    	      this.virtualDevices = defaults.virtualDevices;
    	      this.visibility = defaults.visibility;
        }

        @CustomType.Setter
        public Builder accessPointTypeConfigs(List<GetServiceProfileAccessPointTypeConfig> accessPointTypeConfigs) {
            if (accessPointTypeConfigs == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "accessPointTypeConfigs");
            }
            this.accessPointTypeConfigs = accessPointTypeConfigs;
            return this;
        }
        public Builder accessPointTypeConfigs(GetServiceProfileAccessPointTypeConfig... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }
        @CustomType.Setter
        public Builder account(GetServiceProfileAccount account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder allowedEmails(List<String> allowedEmails) {
            if (allowedEmails == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "allowedEmails");
            }
            this.allowedEmails = allowedEmails;
            return this;
        }
        public Builder allowedEmails(String... allowedEmails) {
            return allowedEmails(List.of(allowedEmails));
        }
        @CustomType.Setter
        public Builder changeLog(GetServiceProfileChangeLog changeLog) {
            if (changeLog == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "changeLog");
            }
            this.changeLog = changeLog;
            return this;
        }
        @CustomType.Setter
        public Builder customFields(List<GetServiceProfileCustomField> customFields) {
            if (customFields == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "customFields");
            }
            this.customFields = customFields;
            return this;
        }
        public Builder customFields(GetServiceProfileCustomField... customFields) {
            return customFields(List.of(customFields));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder marketingInfo(GetServiceProfileMarketingInfo marketingInfo) {
            if (marketingInfo == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "marketingInfo");
            }
            this.marketingInfo = marketingInfo;
            return this;
        }
        @CustomType.Setter
        public Builder metros(List<GetServiceProfileMetro> metros) {
            if (metros == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "metros");
            }
            this.metros = metros;
            return this;
        }
        public Builder metros(GetServiceProfileMetro... metros) {
            return metros(List.of(metros));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notifications(List<GetServiceProfileNotification> notifications) {
            if (notifications == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "notifications");
            }
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(GetServiceProfileNotification... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder ports(List<GetServiceProfilePort> ports) {
            if (ports == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "ports");
            }
            this.ports = ports;
            return this;
        }
        public Builder ports(GetServiceProfilePort... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder project(GetServiceProfileProject project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder selfProfile(Boolean selfProfile) {
            if (selfProfile == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "selfProfile");
            }
            this.selfProfile = selfProfile;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder viewPoint(String viewPoint) {
            if (viewPoint == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "viewPoint");
            }
            this.viewPoint = viewPoint;
            return this;
        }
        @CustomType.Setter
        public Builder virtualDevices(List<GetServiceProfileVirtualDevice> virtualDevices) {
            if (virtualDevices == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "virtualDevices");
            }
            this.virtualDevices = virtualDevices;
            return this;
        }
        public Builder virtualDevices(GetServiceProfileVirtualDevice... virtualDevices) {
            return virtualDevices(List.of(virtualDevices));
        }
        @CustomType.Setter
        public Builder visibility(String visibility) {
            if (visibility == null) {
              throw new MissingRequiredPropertyException("GetServiceProfileResult", "visibility");
            }
            this.visibility = visibility;
            return this;
        }
        public GetServiceProfileResult build() {
            final var _resultValue = new GetServiceProfileResult();
            _resultValue.accessPointTypeConfigs = accessPointTypeConfigs;
            _resultValue.account = account;
            _resultValue.allowedEmails = allowedEmails;
            _resultValue.changeLog = changeLog;
            _resultValue.customFields = customFields;
            _resultValue.description = description;
            _resultValue.href = href;
            _resultValue.id = id;
            _resultValue.marketingInfo = marketingInfo;
            _resultValue.metros = metros;
            _resultValue.name = name;
            _resultValue.notifications = notifications;
            _resultValue.ports = ports;
            _resultValue.project = project;
            _resultValue.selfProfile = selfProfile;
            _resultValue.state = state;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            _resultValue.viewPoint = viewPoint;
            _resultValue.virtualDevices = virtualDevices;
            _resultValue.visibility = visibility;
            return _resultValue;
        }
    }
}
