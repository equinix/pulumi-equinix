// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamChangeLog {
    /**
     * @return User name of creator of the stream resource
     * 
     */
    private String createdBy;
    /**
     * @return Email of creator of the stream resource
     * 
     */
    private String createdByEmail;
    /**
     * @return Legal name of creator of the stream resource
     * 
     */
    private String createdByFullName;
    /**
     * @return Creation time of the stream resource
     * 
     */
    private String createdDateTime;
    /**
     * @return User name of deleter of the stream resource
     * 
     */
    private String deletedBy;
    /**
     * @return Email of deleter of the stream resource
     * 
     */
    private String deletedByEmail;
    /**
     * @return Legal name of deleter of the stream resource
     * 
     */
    private String deletedByFullName;
    /**
     * @return Deletion time of the stream resource
     * 
     */
    private String deletedDateTime;
    /**
     * @return User name of last updater of the stream resource
     * 
     */
    private String updatedBy;
    /**
     * @return Email of last updater of the stream resource
     * 
     */
    private String updatedByEmail;
    /**
     * @return Legal name of last updater of the stream resource
     * 
     */
    private String updatedByFullName;
    /**
     * @return Last update time of the stream resource
     * 
     */
    private String updatedDateTime;

    private GetStreamChangeLog() {}
    /**
     * @return User name of creator of the stream resource
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Email of creator of the stream resource
     * 
     */
    public String createdByEmail() {
        return this.createdByEmail;
    }
    /**
     * @return Legal name of creator of the stream resource
     * 
     */
    public String createdByFullName() {
        return this.createdByFullName;
    }
    /**
     * @return Creation time of the stream resource
     * 
     */
    public String createdDateTime() {
        return this.createdDateTime;
    }
    /**
     * @return User name of deleter of the stream resource
     * 
     */
    public String deletedBy() {
        return this.deletedBy;
    }
    /**
     * @return Email of deleter of the stream resource
     * 
     */
    public String deletedByEmail() {
        return this.deletedByEmail;
    }
    /**
     * @return Legal name of deleter of the stream resource
     * 
     */
    public String deletedByFullName() {
        return this.deletedByFullName;
    }
    /**
     * @return Deletion time of the stream resource
     * 
     */
    public String deletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * @return User name of last updater of the stream resource
     * 
     */
    public String updatedBy() {
        return this.updatedBy;
    }
    /**
     * @return Email of last updater of the stream resource
     * 
     */
    public String updatedByEmail() {
        return this.updatedByEmail;
    }
    /**
     * @return Legal name of last updater of the stream resource
     * 
     */
    public String updatedByFullName() {
        return this.updatedByFullName;
    }
    /**
     * @return Last update time of the stream resource
     * 
     */
    public String updatedDateTime() {
        return this.updatedDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamChangeLog defaults) {
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
        public Builder(GetStreamChangeLog defaults) {
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
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder createdByEmail(String createdByEmail) {
            if (createdByEmail == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "createdByEmail");
            }
            this.createdByEmail = createdByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder createdByFullName(String createdByFullName) {
            if (createdByFullName == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "createdByFullName");
            }
            this.createdByFullName = createdByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder createdDateTime(String createdDateTime) {
            if (createdDateTime == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "createdDateTime");
            }
            this.createdDateTime = createdDateTime;
            return this;
        }
        @CustomType.Setter
        public Builder deletedBy(String deletedBy) {
            if (deletedBy == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "deletedBy");
            }
            this.deletedBy = deletedBy;
            return this;
        }
        @CustomType.Setter
        public Builder deletedByEmail(String deletedByEmail) {
            if (deletedByEmail == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "deletedByEmail");
            }
            this.deletedByEmail = deletedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder deletedByFullName(String deletedByFullName) {
            if (deletedByFullName == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "deletedByFullName");
            }
            this.deletedByFullName = deletedByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder deletedDateTime(String deletedDateTime) {
            if (deletedDateTime == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "deletedDateTime");
            }
            this.deletedDateTime = deletedDateTime;
            return this;
        }
        @CustomType.Setter
        public Builder updatedBy(String updatedBy) {
            if (updatedBy == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "updatedBy");
            }
            this.updatedBy = updatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder updatedByEmail(String updatedByEmail) {
            if (updatedByEmail == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "updatedByEmail");
            }
            this.updatedByEmail = updatedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder updatedByFullName(String updatedByFullName) {
            if (updatedByFullName == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "updatedByFullName");
            }
            this.updatedByFullName = updatedByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder updatedDateTime(String updatedDateTime) {
            if (updatedDateTime == null) {
              throw new MissingRequiredPropertyException("GetStreamChangeLog", "updatedDateTime");
            }
            this.updatedDateTime = updatedDateTime;
            return this;
        }
        public GetStreamChangeLog build() {
            final var _resultValue = new GetStreamChangeLog();
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
