// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceSshKey {
    /**
     * @return Reference by name to previously provisioned public SSH key
     * 
     */
    private @Nullable String keyName;
    /**
     * @return username associated with given key.
     * 
     */
    private String username;

    private DeviceSshKey() {}
    /**
     * @return Reference by name to previously provisioned public SSH key
     * 
     */
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
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
        private @Nullable String keyName;
        private String username;
        public Builder() {}
        public Builder(DeviceSshKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder keyName(@Nullable String keyName) {

            this.keyName = keyName;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("DeviceSshKey", "username");
            }
            this.username = username;
            return this;
        }
        public DeviceSshKey build() {
            final var _resultValue = new DeviceSshKey();
            _resultValue.keyName = keyName;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
