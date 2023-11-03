// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortChangeLog {
    private String createdBy;
    private String createdByEmail;
    private String createdByFullName;
    private String createdDateTime;
    private String deletedBy;
    private String deletedByEmail;
    private String deletedByFullName;
    private String deletedDateTime;
    private String updatedBy;
    private String updatedByEmail;
    private String updatedByFullName;
    private String updatedDateTime;

    private GetPortChangeLog() {}
    public String createdBy() {
        return this.createdBy;
    }
    public String createdByEmail() {
        return this.createdByEmail;
    }
    public String createdByFullName() {
        return this.createdByFullName;
    }
    public String createdDateTime() {
        return this.createdDateTime;
    }
    public String deletedBy() {
        return this.deletedBy;
    }
    public String deletedByEmail() {
        return this.deletedByEmail;
    }
    public String deletedByFullName() {
        return this.deletedByFullName;
    }
    public String deletedDateTime() {
        return this.deletedDateTime;
    }
    public String updatedBy() {
        return this.updatedBy;
    }
    public String updatedByEmail() {
        return this.updatedByEmail;
    }
    public String updatedByFullName() {
        return this.updatedByFullName;
    }
    public String updatedDateTime() {
        return this.updatedDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortChangeLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdBy;
        private String createdByEmail;
        private String createdByFullName;
        private String createdDateTime;
        private String deletedBy;
        private String deletedByEmail;
        private String deletedByFullName;
        private String deletedDateTime;
        private String updatedBy;
        private String updatedByEmail;
        private String updatedByFullName;
        private String updatedDateTime;
        public Builder() {}
        public Builder(GetPortChangeLog defaults) {
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
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        @CustomType.Setter
        public Builder createdByEmail(String createdByEmail) {
            this.createdByEmail = Objects.requireNonNull(createdByEmail);
            return this;
        }
        @CustomType.Setter
        public Builder createdByFullName(String createdByFullName) {
            this.createdByFullName = Objects.requireNonNull(createdByFullName);
            return this;
        }
        @CustomType.Setter
        public Builder createdDateTime(String createdDateTime) {
            this.createdDateTime = Objects.requireNonNull(createdDateTime);
            return this;
        }
        @CustomType.Setter
        public Builder deletedBy(String deletedBy) {
            this.deletedBy = Objects.requireNonNull(deletedBy);
            return this;
        }
        @CustomType.Setter
        public Builder deletedByEmail(String deletedByEmail) {
            this.deletedByEmail = Objects.requireNonNull(deletedByEmail);
            return this;
        }
        @CustomType.Setter
        public Builder deletedByFullName(String deletedByFullName) {
            this.deletedByFullName = Objects.requireNonNull(deletedByFullName);
            return this;
        }
        @CustomType.Setter
        public Builder deletedDateTime(String deletedDateTime) {
            this.deletedDateTime = Objects.requireNonNull(deletedDateTime);
            return this;
        }
        @CustomType.Setter
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }
        @CustomType.Setter
        public Builder updatedByEmail(String updatedByEmail) {
            this.updatedByEmail = Objects.requireNonNull(updatedByEmail);
            return this;
        }
        @CustomType.Setter
        public Builder updatedByFullName(String updatedByFullName) {
            this.updatedByFullName = Objects.requireNonNull(updatedByFullName);
            return this;
        }
        @CustomType.Setter
        public Builder updatedDateTime(String updatedDateTime) {
            this.updatedDateTime = Objects.requireNonNull(updatedDateTime);
            return this;
        }
        public GetPortChangeLog build() {
            final var _resultValue = new GetPortChangeLog();
            _resultValue.createdBy = createdBy;
            _resultValue.createdByEmail = createdByEmail;
            _resultValue.createdByFullName = createdByFullName;
            _resultValue.createdDateTime = createdDateTime;
            _resultValue.deletedBy = deletedBy;
            _resultValue.deletedByEmail = deletedByEmail;
            _resultValue.deletedByFullName = deletedByFullName;
            _resultValue.deletedDateTime = deletedDateTime;
            _resultValue.updatedBy = updatedBy;
            _resultValue.updatedByEmail = updatedByEmail;
            _resultValue.updatedByFullName = updatedByFullName;
            _resultValue.updatedDateTime = updatedDateTime;
            return _resultValue;
        }
    }
}
