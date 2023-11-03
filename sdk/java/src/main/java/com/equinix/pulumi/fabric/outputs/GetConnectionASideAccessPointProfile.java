// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionASideAccessPointProfileAccessPointTypeConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointProfile {
    private List<GetConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs;
    private String description;
    private String href;
    private String name;
    private String type;
    private String uuid;

    private GetConnectionASideAccessPointProfile() {}
    public List<GetConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs() {
        return this.accessPointTypeConfigs;
    }
    public String description() {
        return this.description;
    }
    public String href() {
        return this.href;
    }
    public String name() {
        return this.name;
    }
    public String type() {
        return this.type;
    }
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs;
        private String description;
        private String href;
        private String name;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTypeConfigs = defaults.accessPointTypeConfigs;
    	      this.description = defaults.description;
    	      this.href = defaults.href;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder accessPointTypeConfigs(List<GetConnectionASideAccessPointProfileAccessPointTypeConfig> accessPointTypeConfigs) {
            this.accessPointTypeConfigs = Objects.requireNonNull(accessPointTypeConfigs);
            return this;
        }
        public Builder accessPointTypeConfigs(GetConnectionASideAccessPointProfileAccessPointTypeConfig... accessPointTypeConfigs) {
            return accessPointTypeConfigs(List.of(accessPointTypeConfigs));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public GetConnectionASideAccessPointProfile build() {
            final var _resultValue = new GetConnectionASideAccessPointProfile();
            _resultValue.accessPointTypeConfigs = accessPointTypeConfigs;
            _resultValue.description = description;
            _resultValue.href = href;
            _resultValue.name = name;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
