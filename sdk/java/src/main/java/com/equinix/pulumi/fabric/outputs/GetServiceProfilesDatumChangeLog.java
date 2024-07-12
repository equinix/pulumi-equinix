// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceProfilesDatumChangeLog {
    /**
     * @return Created by User Key
     * 
     */
    private String createdBy;
    /**
     * @return Created by User Email Address
     * 
     */
    private String createdByEmail;
    /**
     * @return Created by User Full Name
     * 
     */
    private String createdByFullName;
    /**
     * @return Created by Date and Time
     * 
     */
    private String createdDateTime;
    /**
     * @return Deleted by User Key
     * 
     */
    private String deletedBy;
    /**
     * @return Deleted by User Email Address
     * 
     */
    private String deletedByEmail;
    /**
     * @return Deleted by User Full Name
     * 
     */
    private String deletedByFullName;
    /**
     * @return Deleted by Date and Time
     * 
     */
    private String deletedDateTime;
    /**
     * @return Updated by User Key
     * 
     */
    private String updatedBy;
    /**
     * @return Updated by User Email Address
     * 
     */
    private String updatedByEmail;
    /**
     * @return Updated by User Full Name
     * 
     */
    private String updatedByFullName;
    /**
     * @return Updated by Date and Time
     * 
     */
    private String updatedDateTime;

    private GetServiceProfilesDatumChangeLog() {}
    /**
     * @return Created by User Key
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Created by User Email Address
     * 
     */
    public String createdByEmail() {
        return this.createdByEmail;
    }
    /**
     * @return Created by User Full Name
     * 
     */
    public String createdByFullName() {
        return this.createdByFullName;
    }
    /**
     * @return Created by Date and Time
     * 
     */
    public String createdDateTime() {
        return this.createdDateTime;
    }
    /**
     * @return Deleted by User Key
     * 
     */
    public String deletedBy() {
        return this.deletedBy;
    }
    /**
     * @return Deleted by User Email Address
     * 
     */
    public String deletedByEmail() {
        return this.deletedByEmail;
    }
    /**
     * @return Deleted by User Full Name
     * 
     */
    public String deletedByFullName() {
        return this.deletedByFullName;
    }
    /**
     * @return Deleted by Date and Time
     * 
     */
    public String deletedDateTime() {
        return this.deletedDateTime;
    }
    /**
     * @return Updated by User Key
     * 
     */
    public String updatedBy() {
        return this.updatedBy;
    }
    /**
     * @return Updated by User Email Address
     * 
     */
    public String updatedByEmail() {
        return this.updatedByEmail;
    }
    /**
     * @return Updated by User Full Name
     * 
     */
    public String updatedByFullName() {
        return this.updatedByFullName;
    }
    /**
     * @return Updated by Date and Time
     * 
     */
    public String updatedDateTime() {
        return this.updatedDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesDatumChangeLog defaults) {
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
        public Builder(GetServiceProfilesDatumChangeLog defaults) {
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
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder createdByEmail(String createdByEmail) {
            if (createdByEmail == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "createdByEmail");
            }
            this.createdByEmail = createdByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder createdByFullName(String createdByFullName) {
            if (createdByFullName == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "createdByFullName");
            }
            this.createdByFullName = createdByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder createdDateTime(String createdDateTime) {
            if (createdDateTime == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "createdDateTime");
            }
            this.createdDateTime = createdDateTime;
            return this;
        }
        @CustomType.Setter
        public Builder deletedBy(String deletedBy) {
            if (deletedBy == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "deletedBy");
            }
            this.deletedBy = deletedBy;
            return this;
        }
        @CustomType.Setter
        public Builder deletedByEmail(String deletedByEmail) {
            if (deletedByEmail == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "deletedByEmail");
            }
            this.deletedByEmail = deletedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder deletedByFullName(String deletedByFullName) {
            if (deletedByFullName == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "deletedByFullName");
            }
            this.deletedByFullName = deletedByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder deletedDateTime(String deletedDateTime) {
            if (deletedDateTime == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "deletedDateTime");
            }
            this.deletedDateTime = deletedDateTime;
            return this;
        }
        @CustomType.Setter
        public Builder updatedBy(String updatedBy) {
            if (updatedBy == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "updatedBy");
            }
            this.updatedBy = updatedBy;
            return this;
        }
        @CustomType.Setter
        public Builder updatedByEmail(String updatedByEmail) {
            if (updatedByEmail == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "updatedByEmail");
            }
            this.updatedByEmail = updatedByEmail;
            return this;
        }
        @CustomType.Setter
        public Builder updatedByFullName(String updatedByFullName) {
            if (updatedByFullName == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "updatedByFullName");
            }
            this.updatedByFullName = updatedByFullName;
            return this;
        }
        @CustomType.Setter
        public Builder updatedDateTime(String updatedDateTime) {
            if (updatedDateTime == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumChangeLog", "updatedDateTime");
            }
            this.updatedDateTime = updatedDateTime;
            return this;
        }
        public GetServiceProfilesDatumChangeLog build() {
            final var _resultValue = new GetServiceProfilesDatumChangeLog();
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
