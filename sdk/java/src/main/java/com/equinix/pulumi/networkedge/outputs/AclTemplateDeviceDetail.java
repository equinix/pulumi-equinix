// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclTemplateDeviceDetail {
    /**
     * @return Device ACL provisioning status where template was applied. One of `PROVISIONING`, `PROVISIONED`.
     * 
     */
    private @Nullable String aclStatus;
    /**
     * @return ACL template name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Device uuid.
     * 
     */
    private @Nullable String uuid;

    private AclTemplateDeviceDetail() {}
    /**
     * @return Device ACL provisioning status where template was applied. One of `PROVISIONING`, `PROVISIONED`.
     * 
     */
    public Optional<String> aclStatus() {
        return Optional.ofNullable(this.aclStatus);
    }
    /**
     * @return ACL template name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Device uuid.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclTemplateDeviceDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aclStatus;
        private @Nullable String name;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(AclTemplateDeviceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclStatus = defaults.aclStatus;
    	      this.name = defaults.name;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder aclStatus(@Nullable String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public AclTemplateDeviceDetail build() {
            final var _resultValue = new AclTemplateDeviceDetail();
            _resultValue.aclStatus = aclStatus;
            _resultValue.name = name;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
