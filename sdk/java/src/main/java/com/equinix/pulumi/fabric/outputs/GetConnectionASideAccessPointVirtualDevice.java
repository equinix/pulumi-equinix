// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointVirtualDevice {
    private String href;
    private String type;
    private String uuid;

    private GetConnectionASideAccessPointVirtualDevice() {}
    public String href() {
        return this.href;
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

    public static Builder builder(GetConnectionASideAccessPointVirtualDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointVirtualDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
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
        public GetConnectionASideAccessPointVirtualDevice build() {
            final var o = new GetConnectionASideAccessPointVirtualDevice();
            o.href = href;
            o.type = type;
            o.uuid = uuid;
            return o;
        }
    }
}
