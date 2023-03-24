// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.outputs;

import com.equinix.pulumi.equinix.fabric.outputs.ConnectionASideAccessPointProfileAccessPointTypeConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPointProfile {
    private @Nullable List<ConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs;
    private @Nullable String description;
    /**
     * @return Connection URI information
     * 
     */
    private @Nullable String href;
    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    private @Nullable String name;
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    private String type;
    private String uuid;

    private ConnectionASideAccessPointProfile() {}
    public List<ConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs() {
        return this.accessPointTypeConfigs == null ? List.of() : this.accessPointTypeConfigs;
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Connection URI information
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public String type() {
        return this.type;
    }
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASideAccessPointProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs;
        private @Nullable String description;
        private @Nullable String href;
        private @Nullable String name;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(ConnectionASideAccessPointProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTypeConfigs = defaults.accessPointTypeConfigs;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accessPointTypeConfigs(@Nullable List<ConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs) {
            this.accessPointTypeConfigs = accessPointTypeConfigs;
            return this;
        }
        public Builder accessPointTypeConfigs(ConnectionASideAccessPointProfileAccessPointTypeConfig... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder href(@Nullable String href) {
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
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
        public ConnectionASideAccessPointProfile build() {
            final var o = new ConnectionASideAccessPointProfile();
            o.accessPointTypeConfigs = accessPointTypeConfigs;
            o.description = description;
            o.href = href;
            o.name = name;
            o.type = type;
            o.uuid = uuid;
            return o;
        }
    }
}
