// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeviceSshKey {
    private String keyName;
    /**
     * @return username associated with given key.
     * 
     */
    private String username;

    private DeviceSshKey() {}
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return username associated with given key.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceSshKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyName;
        private String username;
        public Builder() {}
        public Builder(DeviceSshKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public DeviceSshKey build() {
            final var o = new DeviceSshKey();
            o.keyName = keyName;
            o.username = username;
            return o;
        }
    }
}
