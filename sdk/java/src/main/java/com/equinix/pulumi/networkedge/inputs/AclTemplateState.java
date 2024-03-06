// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.equinix.pulumi.networkedge.inputs.AclTemplateDeviceDetailArgs;
import com.equinix.pulumi.networkedge.inputs.AclTemplateInboundRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final AclTemplateState Empty = new AclTemplateState();

    /**
     * Inbound rule description, up to 200 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Inbound rule description, up to 200 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Status of ACL template provisioning process, where template was applied.
     * One of `PROVISIONING`, `PROVISIONED`.
     * 
     */
    @Import(name="deviceAclStatus")
    private @Nullable Output<String> deviceAclStatus;

    /**
     * @return Status of ACL template provisioning process, where template was applied.
     * One of `PROVISIONING`, `PROVISIONED`.
     * 
     */
    public Optional<Output<String>> deviceAclStatus() {
        return Optional.ofNullable(this.deviceAclStatus);
    }

    /**
     * List of the devices where the ACL template is applied.
     * 
     */
    @Import(name="deviceDetails")
    private @Nullable Output<List<AclTemplateDeviceDetailArgs>> deviceDetails;

    /**
     * @return List of the devices where the ACL template is applied.
     * 
     */
    public Optional<Output<List<AclTemplateDeviceDetailArgs>>> deviceDetails() {
        return Optional.ofNullable(this.deviceDetails);
    }

    /**
     * (Deprecated) Identifier of a network device where template was applied.
     * 
     * @deprecated
     * Refer to device details get device information
     * 
     */
    @Deprecated /* Refer to device details get device information */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return (Deprecated) Identifier of a network device where template was applied.
     * 
     * @deprecated
     * Refer to device details get device information
     * 
     */
    @Deprecated /* Refer to device details get device information */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     * 
     * The `inbound_rule` block has below fields:
     * 
     */
    @Import(name="inboundRules")
    private @Nullable Output<List<AclTemplateInboundRuleArgs>> inboundRules;

    /**
     * @return One or more rules to specify allowed inbound traffic.
     * Rules are ordered, matching traffic rule stops processing subsequent ones.
     * 
     * The `inbound_rule` block has below fields:
     * 
     */
    public Optional<Output<List<AclTemplateInboundRuleArgs>>> inboundRules() {
        return Optional.ofNullable(this.inboundRules);
    }

    /**
     * ACL template location metro code.
     * 
     * @deprecated
     * Metro Code is no longer required
     * 
     */
    @Deprecated /* Metro Code is no longer required */
    @Import(name="metroCode")
    private @Nullable Output<String> metroCode;

    /**
     * @return ACL template location metro code.
     * 
     * @deprecated
     * Metro Code is no longer required
     * 
     */
    @Deprecated /* Metro Code is no longer required */
    public Optional<Output<String>> metroCode() {
        return Optional.ofNullable(this.metroCode);
    }

    /**
     * ACL template name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return ACL template name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique Identifier for the project resource where the acl template is scoped to.If you
     * leave it out, the ACL template will be created under the default project id of your organization.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique Identifier for the project resource where the acl template is scoped to.If you
     * leave it out, the ACL template will be created under the default project id of your organization.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Device uuid.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Device uuid.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private AclTemplateState() {}

    private AclTemplateState(AclTemplateState $) {
        this.description = $.description;
        this.deviceAclStatus = $.deviceAclStatus;
        this.deviceDetails = $.deviceDetails;
        this.deviceId = $.deviceId;
        this.inboundRules = $.inboundRules;
        this.metroCode = $.metroCode;
        this.name = $.name;
        this.projectId = $.projectId;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclTemplateState $;

        public Builder() {
            $ = new AclTemplateState();
        }

        public Builder(AclTemplateState defaults) {
            $ = new AclTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Inbound rule description, up to 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Inbound rule description, up to 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param deviceAclStatus Status of ACL template provisioning process, where template was applied.
         * One of `PROVISIONING`, `PROVISIONED`.
         * 
         * @return builder
         * 
         */
        public Builder deviceAclStatus(@Nullable Output<String> deviceAclStatus) {
            $.deviceAclStatus = deviceAclStatus;
            return this;
        }

        /**
         * @param deviceAclStatus Status of ACL template provisioning process, where template was applied.
         * One of `PROVISIONING`, `PROVISIONED`.
         * 
         * @return builder
         * 
         */
        public Builder deviceAclStatus(String deviceAclStatus) {
            return deviceAclStatus(Output.of(deviceAclStatus));
        }

        /**
         * @param deviceDetails List of the devices where the ACL template is applied.
         * 
         * @return builder
         * 
         */
        public Builder deviceDetails(@Nullable Output<List<AclTemplateDeviceDetailArgs>> deviceDetails) {
            $.deviceDetails = deviceDetails;
            return this;
        }

        /**
         * @param deviceDetails List of the devices where the ACL template is applied.
         * 
         * @return builder
         * 
         */
        public Builder deviceDetails(List<AclTemplateDeviceDetailArgs> deviceDetails) {
            return deviceDetails(Output.of(deviceDetails));
        }

        /**
         * @param deviceDetails List of the devices where the ACL template is applied.
         * 
         * @return builder
         * 
         */
        public Builder deviceDetails(AclTemplateDeviceDetailArgs... deviceDetails) {
            return deviceDetails(List.of(deviceDetails));
        }

        /**
         * @param deviceId (Deprecated) Identifier of a network device where template was applied.
         * 
         * @return builder
         * 
         * @deprecated
         * Refer to device details get device information
         * 
         */
        @Deprecated /* Refer to device details get device information */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId (Deprecated) Identifier of a network device where template was applied.
         * 
         * @return builder
         * 
         * @deprecated
         * Refer to device details get device information
         * 
         */
        @Deprecated /* Refer to device details get device information */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param inboundRules One or more rules to specify allowed inbound traffic.
         * Rules are ordered, matching traffic rule stops processing subsequent ones.
         * 
         * The `inbound_rule` block has below fields:
         * 
         * @return builder
         * 
         */
        public Builder inboundRules(@Nullable Output<List<AclTemplateInboundRuleArgs>> inboundRules) {
            $.inboundRules = inboundRules;
            return this;
        }

        /**
         * @param inboundRules One or more rules to specify allowed inbound traffic.
         * Rules are ordered, matching traffic rule stops processing subsequent ones.
         * 
         * The `inbound_rule` block has below fields:
         * 
         * @return builder
         * 
         */
        public Builder inboundRules(List<AclTemplateInboundRuleArgs> inboundRules) {
            return inboundRules(Output.of(inboundRules));
        }

        /**
         * @param inboundRules One or more rules to specify allowed inbound traffic.
         * Rules are ordered, matching traffic rule stops processing subsequent ones.
         * 
         * The `inbound_rule` block has below fields:
         * 
         * @return builder
         * 
         */
        public Builder inboundRules(AclTemplateInboundRuleArgs... inboundRules) {
            return inboundRules(List.of(inboundRules));
        }

        /**
         * @param metroCode ACL template location metro code.
         * 
         * @return builder
         * 
         * @deprecated
         * Metro Code is no longer required
         * 
         */
        @Deprecated /* Metro Code is no longer required */
        public Builder metroCode(@Nullable Output<String> metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        /**
         * @param metroCode ACL template location metro code.
         * 
         * @return builder
         * 
         * @deprecated
         * Metro Code is no longer required
         * 
         */
        @Deprecated /* Metro Code is no longer required */
        public Builder metroCode(String metroCode) {
            return metroCode(Output.of(metroCode));
        }

        /**
         * @param name ACL template name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name ACL template name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId Unique Identifier for the project resource where the acl template is scoped to.If you
         * leave it out, the ACL template will be created under the default project id of your organization.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique Identifier for the project resource where the acl template is scoped to.If you
         * leave it out, the ACL template will be created under the default project id of your organization.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param uuid Device uuid.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Device uuid.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public AclTemplateState build() {
            return $;
        }
    }

}
