// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.equinix.pulumi.metal.inputs.InterconnectionPortArgs;
import com.equinix.pulumi.metal.inputs.InterconnectionServiceTokenArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectionState extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectionState Empty = new InterconnectionState();

    /**
     * Only used with Fabric Shared connection. Fabric uses this token to be able to give more detailed information about the
     * Metal end of the network, when viewing resources from within Fabric.
     * 
     */
    @Import(name="authorizationCode")
    private @Nullable Output<String> authorizationCode;

    /**
     * @return Only used with Fabric Shared connection. Fabric uses this token to be able to give more detailed information about the
     * Metal end of the network, when viewing resources from within Fabric.
     * 
     */
    public Optional<Output<String>> authorizationCode() {
        return Optional.ofNullable(this.authorizationCode);
    }

    /**
     * The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
     * 
     */
    @Import(name="contactEmail")
    private @Nullable Output<String> contactEmail;

    /**
     * @return The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
     * 
     */
    public Optional<Output<String>> contactEmail() {
        return Optional.ofNullable(this.contactEmail);
    }

    /**
     * Description for the connection resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for the connection resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility. For more information, read the migration guide.
     * 
     */
    @Deprecated /* Use metro instead of facility. For more information, read the migration guide. */
    @Import(name="facility")
    private @Nullable Output<String> facility;

    /**
     * @return Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
     * 
     * @deprecated
     * Use metro instead of facility. For more information, read the migration guide.
     * 
     */
    @Deprecated /* Use metro instead of facility. For more information, read the migration guide. */
    public Optional<Output<String>> facility() {
        return Optional.ofNullable(this.facility);
    }

    /**
     * Metro where the connection will be created.
     * 
     */
    @Import(name="metro")
    private @Nullable Output<String> metro;

    /**
     * @return Metro where the connection will be created.
     * 
     */
    public Optional<Output<String>> metro() {
        return Optional.ofNullable(this.metro);
    }

    /**
     * Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Name of the connection resource
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the connection resource
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of the organization where the connection is scoped to.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return ID of the organization where the connection is scoped to.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the equinix.metal.Interconnection datasource.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<InterconnectionPortArgs>> ports;

    /**
     * @return List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the equinix.metal.Interconnection datasource.
     * 
     */
    public Optional<Output<List<InterconnectionPortArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * ID of the project where the connection is scoped to, must be set for.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return ID of the project where the connection is scoped to, must be set for.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Connection redundancy - redundant or primary.
     * 
     */
    @Import(name="redundancy")
    private @Nullable Output<String> redundancy;

    /**
     * @return Connection redundancy - redundant or primary.
     * 
     */
    public Optional<Output<String>> redundancy() {
        return Optional.ofNullable(this.redundancy);
    }

    /**
     * Only used with shared connection. Type of service token to use for the connection, a_side or z_side
     * 
     */
    @Import(name="serviceTokenType")
    private @Nullable Output<String> serviceTokenType;

    /**
     * @return Only used with shared connection. Type of service token to use for the connection, a_side or z_side
     * 
     */
    public Optional<Output<String>> serviceTokenType() {
        return Optional.ofNullable(this.serviceTokenType);
    }

    /**
     * List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
     * 
     */
    @Import(name="serviceTokens")
    private @Nullable Output<List<InterconnectionServiceTokenArgs>> serviceTokens;

    /**
     * @return List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
     * 
     */
    public Optional<Output<List<InterconnectionServiceTokenArgs>>> serviceTokens() {
        return Optional.ofNullable(this.serviceTokens);
    }

    /**
     * Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    @Import(name="speed")
    private @Nullable Output<String> speed;

    /**
     * @return Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    public Optional<Output<String>> speed() {
        return Optional.ofNullable(this.speed);
    }

    /**
     * Status of the connection resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the connection resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * String list of tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return String list of tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
     * 
     * @deprecated
     * If your organization already has connection service tokens enabled, use `service_tokens` instead
     * 
     */
    @Deprecated /* If your organization already has connection service tokens enabled, use `service_tokens` instead */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
     * 
     * @deprecated
     * If your organization already has connection service tokens enabled, use `service_tokens` instead
     * 
     */
    @Deprecated /* If your organization already has connection service tokens enabled, use `service_tokens` instead */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * Connection type - dedicated or shared.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Connection type - dedicated or shared.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
     * 
     */
    @Import(name="vlans")
    private @Nullable Output<List<Integer>> vlans;

    /**
     * @return Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
     * 
     */
    public Optional<Output<List<Integer>>> vlans() {
        return Optional.ofNullable(this.vlans);
    }

    /**
     * Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
     * connection
     * 
     */
    @Import(name="vrfs")
    private @Nullable Output<List<String>> vrfs;

    /**
     * @return Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
     * connection
     * 
     */
    public Optional<Output<List<String>>> vrfs() {
        return Optional.ofNullable(this.vrfs);
    }

    private InterconnectionState() {}

    private InterconnectionState(InterconnectionState $) {
        this.authorizationCode = $.authorizationCode;
        this.contactEmail = $.contactEmail;
        this.description = $.description;
        this.facility = $.facility;
        this.metro = $.metro;
        this.mode = $.mode;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.ports = $.ports;
        this.projectId = $.projectId;
        this.redundancy = $.redundancy;
        this.serviceTokenType = $.serviceTokenType;
        this.serviceTokens = $.serviceTokens;
        this.speed = $.speed;
        this.status = $.status;
        this.tags = $.tags;
        this.token = $.token;
        this.type = $.type;
        this.vlans = $.vlans;
        this.vrfs = $.vrfs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectionState $;

        public Builder() {
            $ = new InterconnectionState();
        }

        public Builder(InterconnectionState defaults) {
            $ = new InterconnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationCode Only used with Fabric Shared connection. Fabric uses this token to be able to give more detailed information about the
         * Metal end of the network, when viewing resources from within Fabric.
         * 
         * @return builder
         * 
         */
        public Builder authorizationCode(@Nullable Output<String> authorizationCode) {
            $.authorizationCode = authorizationCode;
            return this;
        }

        /**
         * @param authorizationCode Only used with Fabric Shared connection. Fabric uses this token to be able to give more detailed information about the
         * Metal end of the network, when viewing resources from within Fabric.
         * 
         * @return builder
         * 
         */
        public Builder authorizationCode(String authorizationCode) {
            return authorizationCode(Output.of(authorizationCode));
        }

        /**
         * @param contactEmail The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
         * 
         * @return builder
         * 
         */
        public Builder contactEmail(@Nullable Output<String> contactEmail) {
            $.contactEmail = contactEmail;
            return this;
        }

        /**
         * @param contactEmail The preferred email used for communication and notifications about the Equinix Fabric interconnection. Required when using a Project API key. Optional and defaults to the primary user email address when using a User API key.
         * 
         * @return builder
         * 
         */
        public Builder contactEmail(String contactEmail) {
            return contactEmail(Output.of(contactEmail));
        }

        /**
         * @param description Description for the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param facility Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility. For more information, read the migration guide.
         * 
         */
        @Deprecated /* Use metro instead of facility. For more information, read the migration guide. */
        public Builder facility(@Nullable Output<String> facility) {
            $.facility = facility;
            return this;
        }

        /**
         * @param facility Facility where the connection will be created. Use metro instead; read the facility to metro migration guide
         * 
         * @return builder
         * 
         * @deprecated
         * Use metro instead of facility. For more information, read the migration guide.
         * 
         */
        @Deprecated /* Use metro instead of facility. For more information, read the migration guide. */
        public Builder facility(String facility) {
            return facility(Output.of(facility));
        }

        /**
         * @param metro Metro where the connection will be created.
         * 
         * @return builder
         * 
         */
        public Builder metro(@Nullable Output<String> metro) {
            $.metro = metro;
            return this;
        }

        /**
         * @param metro Metro where the connection will be created.
         * 
         * @return builder
         * 
         */
        public Builder metro(String metro) {
            return metro(Output.of(metro));
        }

        /**
         * @param mode Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Mode for connections in IBX facilities with the dedicated type - standard or tunnel. Default is standard.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name Name of the connection resource
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the connection resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId ID of the organization where the connection is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId ID of the organization where the connection is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param ports List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the equinix.metal.Interconnection datasource.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<InterconnectionPortArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the equinix.metal.Interconnection datasource.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<InterconnectionPortArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`). Schema of port is described in documentation of the equinix.metal.Interconnection datasource.
         * 
         * @return builder
         * 
         */
        public Builder ports(InterconnectionPortArgs... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param projectId ID of the project where the connection is scoped to, must be set for.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId ID of the project where the connection is scoped to, must be set for.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param redundancy Connection redundancy - redundant or primary.
         * 
         * @return builder
         * 
         */
        public Builder redundancy(@Nullable Output<String> redundancy) {
            $.redundancy = redundancy;
            return this;
        }

        /**
         * @param redundancy Connection redundancy - redundant or primary.
         * 
         * @return builder
         * 
         */
        public Builder redundancy(String redundancy) {
            return redundancy(Output.of(redundancy));
        }

        /**
         * @param serviceTokenType Only used with shared connection. Type of service token to use for the connection, a_side or z_side
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenType(@Nullable Output<String> serviceTokenType) {
            $.serviceTokenType = serviceTokenType;
            return this;
        }

        /**
         * @param serviceTokenType Only used with shared connection. Type of service token to use for the connection, a_side or z_side
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenType(String serviceTokenType) {
            return serviceTokenType(Output.of(serviceTokenType));
        }

        /**
         * @param serviceTokens List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
         * 
         * @return builder
         * 
         */
        public Builder serviceTokens(@Nullable Output<List<InterconnectionServiceTokenArgs>> serviceTokens) {
            $.serviceTokens = serviceTokens;
            return this;
        }

        /**
         * @param serviceTokens List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
         * 
         * @return builder
         * 
         */
        public Builder serviceTokens(List<InterconnectionServiceTokenArgs> serviceTokens) {
            return serviceTokens(Output.of(serviceTokens));
        }

        /**
         * @param serviceTokens List of connection service tokens with attributes required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). Scehma of service_token is described in documentation of the equinix.metal.Interconnection datasource.
         * 
         * @return builder
         * 
         */
        public Builder serviceTokens(InterconnectionServiceTokenArgs... serviceTokens) {
            return serviceTokens(List.of(serviceTokens));
        }

        /**
         * @param speed Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
         * 
         * @return builder
         * 
         */
        public Builder speed(@Nullable Output<String> speed) {
            $.speed = speed;
            return this;
        }

        /**
         * @param speed Connection speed - Values must be in the format &#39;&lt;number&gt;Mbps&#39; or &#39;&lt;number&gt;Gpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;. Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
         * 
         * @return builder
         * 
         */
        public Builder speed(String speed) {
            return speed(Output.of(speed));
        }

        /**
         * @param status Status of the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the connection resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags String list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags String list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags String list of tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param token (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * If your organization already has connection service tokens enabled, use `service_tokens` instead
         * 
         */
        @Deprecated /* If your organization already has connection service tokens enabled, use `service_tokens` instead */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token (Deprecated) Fabric Token required to configure the connection in Equinix Fabric with the equinix.fabric.Connection resource or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard). If your organization already has connection service tokens enabled, use `service_tokens` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * If your organization already has connection service tokens enabled, use `service_tokens` instead
         * 
         */
        @Deprecated /* If your organization already has connection service tokens enabled, use `service_tokens` instead */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param type Connection type - dedicated or shared.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Connection type - dedicated or shared.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vlans Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
         * 
         * @return builder
         * 
         */
        public Builder vlans(@Nullable Output<List<Integer>> vlans) {
            $.vlans = vlans;
            return this;
        }

        /**
         * @param vlans Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
         * 
         * @return builder
         * 
         */
        public Builder vlans(List<Integer> vlans) {
            return vlans(Output.of(vlans));
        }

        /**
         * @param vlans Only used with shared connection. Vlans to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection.
         * 
         * @return builder
         * 
         */
        public Builder vlans(Integer... vlans) {
            return vlans(List.of(vlans));
        }

        /**
         * @param vrfs Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
         * connection
         * 
         * @return builder
         * 
         */
        public Builder vrfs(@Nullable Output<List<String>> vrfs) {
            $.vrfs = vrfs;
            return this;
        }

        /**
         * @param vrfs Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
         * connection
         * 
         * @return builder
         * 
         */
        public Builder vrfs(List<String> vrfs) {
            return vrfs(Output.of(vrfs));
        }

        /**
         * @param vrfs Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant
         * connection
         * 
         * @return builder
         * 
         */
        public Builder vrfs(String... vrfs) {
            return vrfs(List.of(vrfs));
        }

        public InterconnectionState build() {
            return $;
        }
    }

}
