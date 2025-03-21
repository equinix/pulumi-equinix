// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectionArgs Empty = new InterconnectionArgs();

    /**
     * The preferred email used for communication and notifications about the Equinix Fabric interconnection
     * 
     */
    @Import(name="contactEmail")
    private @Nullable Output<String> contactEmail;

    /**
     * @return The preferred email used for communication and notifications about the Equinix Fabric interconnection
     * 
     */
    public Optional<Output<String>> contactEmail() {
        return Optional.ofNullable(this.contactEmail);
    }

    /**
     * Description of the connection resource
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the connection resource
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Facility where the connection will be created
     * 
     * @deprecated
     * Use metro instead of facility. For more information, read the migration guide.
     * 
     */
    @Deprecated /* Use metro instead of facility. For more information, read the migration guide. */
    @Import(name="facility")
    private @Nullable Output<String> facility;

    /**
     * @return Facility where the connection will be created
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
     * Metro where the connection will be created
     * 
     */
    @Import(name="metro")
    private @Nullable Output<String> metro;

    /**
     * @return Metro where the connection will be created
     * 
     */
    public Optional<Output<String>> metro() {
        return Optional.ofNullable(this.metro);
    }

    /**
     * Mode for connections in IBX facilities with the dedicated type - standard or tunnel
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Mode for connections in IBX facilities with the dedicated type - standard or tunnel
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
     * ID of the organization responsible for the connection. Applicable with type &#34;dedicated&#34;
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return ID of the organization responsible for the connection. Applicable with type &#34;dedicated&#34;
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * ID of the project where the connection is scoped to. Required with type &#34;shared&#34;
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return ID of the project where the connection is scoped to. Required with type &#34;shared&#34;
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Connection redundancy - redundant or primary
     * 
     */
    @Import(name="redundancy", required=true)
    private Output<String> redundancy;

    /**
     * @return Connection redundancy - redundant or primary
     * 
     */
    public Output<String> redundancy() {
        return this.redundancy;
    }

    /**
     * Only used with shared connection. Type of service token to use for the connection, a*side or z*side
     * 
     */
    @Import(name="serviceTokenType")
    private @Nullable Output<String> serviceTokenType;

    /**
     * @return Only used with shared connection. Type of service token to use for the connection, a*side or z*side
     * 
     */
    public Optional<Output<String>> serviceTokenType() {
        return Optional.ofNullable(this.serviceTokenType);
    }

    /**
     * Connection speed -  Values must be in the format &#39;\n\nMbps&#39; or &#39;\n\nGpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    @Import(name="speed")
    private @Nullable Output<String> speed;

    /**
     * @return Connection speed -  Values must be in the format &#39;\n\nMbps&#39; or &#39;\n\nGpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     * 
     */
    public Optional<Output<String>> speed() {
        return Optional.ofNullable(this.speed);
    }

    /**
     * Tags attached to the connection
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags attached to the connection
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Connection type - dedicated, shared or shared*port*vlan
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Connection type - dedicated, shared or shared*port*vlan
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
     * 
     */
    @Import(name="vlans")
    private @Nullable Output<List<Integer>> vlans;

    /**
     * @return Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
     * 
     */
    public Optional<Output<List<Integer>>> vlans() {
        return Optional.ofNullable(this.vlans);
    }

    /**
     * Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
     * 
     */
    @Import(name="vrfs")
    private @Nullable Output<List<String>> vrfs;

    /**
     * @return Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
     * 
     */
    public Optional<Output<List<String>>> vrfs() {
        return Optional.ofNullable(this.vrfs);
    }

    private InterconnectionArgs() {}

    private InterconnectionArgs(InterconnectionArgs $) {
        this.contactEmail = $.contactEmail;
        this.description = $.description;
        this.facility = $.facility;
        this.metro = $.metro;
        this.mode = $.mode;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.projectId = $.projectId;
        this.redundancy = $.redundancy;
        this.serviceTokenType = $.serviceTokenType;
        this.speed = $.speed;
        this.tags = $.tags;
        this.type = $.type;
        this.vlans = $.vlans;
        this.vrfs = $.vrfs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectionArgs $;

        public Builder() {
            $ = new InterconnectionArgs();
        }

        public Builder(InterconnectionArgs defaults) {
            $ = new InterconnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactEmail The preferred email used for communication and notifications about the Equinix Fabric interconnection
         * 
         * @return builder
         * 
         */
        public Builder contactEmail(@Nullable Output<String> contactEmail) {
            $.contactEmail = contactEmail;
            return this;
        }

        /**
         * @param contactEmail The preferred email used for communication and notifications about the Equinix Fabric interconnection
         * 
         * @return builder
         * 
         */
        public Builder contactEmail(String contactEmail) {
            return contactEmail(Output.of(contactEmail));
        }

        /**
         * @param description Description of the connection resource
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the connection resource
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param facility Facility where the connection will be created
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
         * @param facility Facility where the connection will be created
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
         * @param metro Metro where the connection will be created
         * 
         * @return builder
         * 
         */
        public Builder metro(@Nullable Output<String> metro) {
            $.metro = metro;
            return this;
        }

        /**
         * @param metro Metro where the connection will be created
         * 
         * @return builder
         * 
         */
        public Builder metro(String metro) {
            return metro(Output.of(metro));
        }

        /**
         * @param mode Mode for connections in IBX facilities with the dedicated type - standard or tunnel
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Mode for connections in IBX facilities with the dedicated type - standard or tunnel
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
         * @param organizationId ID of the organization responsible for the connection. Applicable with type &#34;dedicated&#34;
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId ID of the organization responsible for the connection. Applicable with type &#34;dedicated&#34;
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param projectId ID of the project where the connection is scoped to. Required with type &#34;shared&#34;
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId ID of the project where the connection is scoped to. Required with type &#34;shared&#34;
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param redundancy Connection redundancy - redundant or primary
         * 
         * @return builder
         * 
         */
        public Builder redundancy(Output<String> redundancy) {
            $.redundancy = redundancy;
            return this;
        }

        /**
         * @param redundancy Connection redundancy - redundant or primary
         * 
         * @return builder
         * 
         */
        public Builder redundancy(String redundancy) {
            return redundancy(Output.of(redundancy));
        }

        /**
         * @param serviceTokenType Only used with shared connection. Type of service token to use for the connection, a*side or z*side
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenType(@Nullable Output<String> serviceTokenType) {
            $.serviceTokenType = serviceTokenType;
            return this;
        }

        /**
         * @param serviceTokenType Only used with shared connection. Type of service token to use for the connection, a*side or z*side
         * 
         * @return builder
         * 
         */
        public Builder serviceTokenType(String serviceTokenType) {
            return serviceTokenType(Output.of(serviceTokenType));
        }

        /**
         * @param speed Connection speed -  Values must be in the format &#39;\n\nMbps&#39; or &#39;\n\nGpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
         * 
         * @return builder
         * 
         */
        public Builder speed(@Nullable Output<String> speed) {
            $.speed = speed;
            return this;
        }

        /**
         * @param speed Connection speed -  Values must be in the format &#39;\n\nMbps&#39; or &#39;\n\nGpbs&#39;, for example &#39;100Mbps&#39; or &#39;50Gbps&#39;.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
         * 
         * @return builder
         * 
         */
        public Builder speed(String speed) {
            return speed(Output.of(speed));
        }

        /**
         * @param tags Tags attached to the connection
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags attached to the connection
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags attached to the connection
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type Connection type - dedicated, shared or shared*port*vlan
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Connection type - dedicated, shared or shared*port*vlan
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vlans Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
         * 
         * @return builder
         * 
         */
        public Builder vlans(@Nullable Output<List<Integer>> vlans) {
            $.vlans = vlans;
            return this;
        }

        /**
         * @param vlans Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
         * 
         * @return builder
         * 
         */
        public Builder vlans(List<Integer> vlans) {
            return vlans(Output.of(vlans));
        }

        /**
         * @param vlans Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
         * 
         * @return builder
         * 
         */
        public Builder vlans(Integer... vlans) {
            return vlans(List.of(vlans));
        }

        /**
         * @param vrfs Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
         * 
         * @return builder
         * 
         */
        public Builder vrfs(@Nullable Output<List<String>> vrfs) {
            $.vrfs = vrfs;
            return this;
        }

        /**
         * @param vrfs Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
         * 
         * @return builder
         * 
         */
        public Builder vrfs(List<String> vrfs) {
            return vrfs(Output.of(vrfs));
        }

        /**
         * @param vrfs Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
         * 
         * @return builder
         * 
         */
        public Builder vrfs(String... vrfs) {
            return vrfs(List.of(vrfs));
        }

        public InterconnectionArgs build() {
            if ($.redundancy == null) {
                throw new MissingRequiredPropertyException("InterconnectionArgs", "redundancy");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("InterconnectionArgs", "type");
            }
            return $;
        }
    }

}
