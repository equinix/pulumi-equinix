// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProfileChangeLog {
    private @Nullable String createdBy;
    private @Nullable String createdByEmail;
    private @Nullable String createdByFullName;
    private @Nullable String createdDateTime;
    private @Nullable String deletedBy;
    private @Nullable String deletedByEmail;
    private @Nullable String deletedByFullName;
    private @Nullable String deletedDateTime;
    private @Nullable String updatedBy;
    private @Nullable String updatedByEmail;
    private @Nullable String updatedByFullName;
    private @Nullable String updatedDateTime;

    private ServiceProfileChangeLog() {}
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    public Optional<String> createdByEmail() {
        return Optional.ofNullable(this.createdByEmail);
    }
    public Optional<String> createdByFullName() {
        return Optional.ofNullable(this.createdByFullName);
    }
    public Optional<String> createdDateTime() {
        return Optional.ofNullable(this.createdDateTime);
    }
    public Optional<String> deletedBy() {
        return Optional.ofNullable(this.deletedBy);
    }
    public Optional<String> deletedByEmail() {
        return Optional.ofNullable(this.deletedByEmail);
    }
    public Optional<String> deletedByFullName() {
        return Optional.ofNullable(this.deletedByFullName);
    }
    public Optional<String> deletedDateTime() {
        return Optional.ofNullable(this.deletedDateTime);
    }
    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    public Optional<String> updatedByEmail() {
        return Optional.ofNullable(this.updatedByEmail);
    }
    public Optional<String> updatedByFullName() {
        return Optional.ofNullable(this.updatedByFullName);
    }
    public Optional<String> updatedDateTime() {
        return Optional.ofNullable(this.updatedDateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileChangeLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createdBy;
        private @Nullable String createdByEmail;
        private @Nullable String createdByFullName;
        private @Nullable String createdDateTime;
        private @Nullable String deletedBy;
        private @Nullable String deletedByEmail;
        private @Nullable String deletedByFullName;
        private @Nullable String deletedDateTime;
        private @Nullable String updatedBy;
        private @Nullable String updatedByEmail;
        private @Nullable String updatedByFullName;
        private @Nullable String updatedDateTime;
        public Builder() {}
        public Builder(ServiceProfileChangeLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBy = defaults.createdBy;
    	      this.createdByEmail = defaults.createdByEmail;
    	      this.createdByFullName = defaults.createdByFullName;
    	      this.createdDateTime = defaults.createdDateTime;
    	      this.deletedBy = defaults.deletedBy;
    	      this.deletedByEmail = defaults.deletedByEmail;
    	      this.deletedByFullName = defaults.deletedByFullName;
    	      this.deletedDateTime = defaults.deletedDateTime;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedByEmail = defaults.updatedByEmail;
    	      this.updatedByFullName = defaults.updatedByFullName;
    	      this.updatedDateTime = defaults.updatedDateTime;
        }

        @CustomType.Setter
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder createdByEmail(@Nullable String createdByEmail) {
            this.createdByEmail = createdByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder createdByFullName(@Nullable String createdByFullName) {
            this.createdByFullName = createdByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder createdDateTime(@Nullable String createdDateTime) {
            this.createdDateTime = createdDateTime;
            return this;
        }
        @CustomType.Setter
        public Builder deletedBy(@Nullable String deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }
        @CustomType.Setter
        public Builder deletedByEmail(@Nullable String deletedByEmail) {
            this.deletedByEmail = deletedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder deletedByFullName(@Nullable String deletedByFullName) {
            this.deletedByFullName = deletedByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder deletedDateTime(@Nullable String deletedDateTime) {
            this.deletedDateTime = deletedDateTime;
            return this;
        }
        @CustomType.Setter
        public Builder updatedBy(@Nullable String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder updatedByEmail(@Nullable String updatedByEmail) {
            this.updatedByEmail = updatedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder updatedByFullName(@Nullable String updatedByFullName) {
            this.updatedByFullName = updatedByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder updatedDateTime(@Nullable String updatedDateTime) {
            this.updatedDateTime = updatedDateTime;
            return this;
        }
        public ServiceProfileChangeLog build() {
            final var o = new ServiceProfileChangeLog();
            o.createdBy = createdBy;
            o.createdByEmail = createdByEmail;
            o.createdByFullName = createdByFullName;
            o.createdDateTime = createdDateTime;
            o.deletedBy = deletedBy;
            o.deletedByEmail = deletedByEmail;
            o.deletedByFullName = deletedByFullName;
            o.deletedDateTime = deletedDateTime;
            o.updatedBy = updatedBy;
            o.updatedByEmail = updatedByEmail;
            o.updatedByFullName = updatedByFullName;
            o.updatedDateTime = updatedDateTime;
            return o;
        }
    }
}
