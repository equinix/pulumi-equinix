// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointGateway {
    private String href;
    private String state;
    private String uuid;

    private GetConnectionASideAccessPointGateway() {}
    public String href() {
        return this.href;
    }
    public String state() {
        return this.state;
    }
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String state;
        private String uuid;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.state = defaults.state;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public GetConnectionASideAccessPointGateway build() {
            final var _resultValue = new GetConnectionASideAccessPointGateway();
            _resultValue.href = href;
            _resultValue.state = state;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
