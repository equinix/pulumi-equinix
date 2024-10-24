// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteFilterRuleChangeLog {
    /**
     * @return Created by User Key
     * 
     */
    private @Nullable String createdBy;
    /**
     * @return Created by User Email Address
     * 
     */
    private @Nullable String createdByEmail;
    /**
     * @return Created by User Full Name
     * 
     */
    private @Nullable String createdByFullName;
    /**
     * @return Created by Date and Time
     * 
     */
    private @Nullable String createdDateTime;
    /**
     * @return Deleted by User Key
     * 
     */
    private @Nullable String deletedBy;
    /**
     * @return Deleted by User Email Address
     * 
     */
    private @Nullable String deletedByEmail;
    /**
     * @return Deleted by User Full Name
     * 
     */
    private @Nullable String deletedByFullName;
    /**
     * @return Deleted by Date and Time
     * 
     */
    private @Nullable String deletedDateTime;
    /**
     * @return Updated by User Key
     * 
     */
    private @Nullable String updatedBy;
    /**
     * @return Updated by User Email Address
     * 
     */
    private @Nullable String updatedByEmail;
    /**
     * @return Updated by User Full Name
     * 
     */
    private @Nullable String updatedByFullName;
    /**
     * @return Updated by Date and Time
     * 
     */
    private @Nullable String updatedDateTime;

    private RouteFilterRuleChangeLog() {}
    /**
     * @return Created by User Key
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return Created by User Email Address
     * 
     */
    public Optional<String> createdByEmail() {
        return Optional.ofNullable(this.createdByEmail);
    }
    /**
     * @return Created by User Full Name
     * 
     */
    public Optional<String> createdByFullName() {
        return Optional.ofNullable(this.createdByFullName);
    }
    /**
     * @return Created by Date and Time
     * 
     */
    public Optional<String> createdDateTime() {
        return Optional.ofNullable(this.createdDateTime);
    }
    /**
     * @return Deleted by User Key
     * 
     */
    public Optional<String> deletedBy() {
        return Optional.ofNullable(this.deletedBy);
    }
    /**
     * @return Deleted by User Email Address
     * 
     */
    public Optional<String> deletedByEmail() {
        return Optional.ofNullable(this.deletedByEmail);
    }
    /**
     * @return Deleted by User Full Name
     * 
     */
    public Optional<String> deletedByFullName() {
        return Optional.ofNullable(this.deletedByFullName);
    }
    /**
     * @return Deleted by Date and Time
     * 
     */
    public Optional<String> deletedDateTime() {
        return Optional.ofNullable(this.deletedDateTime);
    }
    /**
     * @return Updated by User Key
     * 
     */
    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    /**
     * @return Updated by User Email Address
     * 
     */
    public Optional<String> updatedByEmail() {
        return Optional.ofNullable(this.updatedByEmail);
    }
    /**
     * @return Updated by User Full Name
     * 
     */
    public Optional<String> updatedByFullName() {
        return Optional.ofNullable(this.updatedByFullName);
    }
    /**
     * @return Updated by Date and Time
     * 
     */
    public Optional<String> updatedDateTime() {
        return Optional.ofNullable(this.updatedDateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteFilterRuleChangeLog defaults) {
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
        public Builder(RouteFilterRuleChangeLog defaults) {
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
        public RouteFilterRuleChangeLog build() {
            final var _resultValue = new RouteFilterRuleChangeLog();
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
