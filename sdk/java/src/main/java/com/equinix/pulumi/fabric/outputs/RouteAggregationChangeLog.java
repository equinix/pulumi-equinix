// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteAggregationChangeLog {
    /**
     * @return User name of creator of the route aggregation resource
     * 
     */
    private @Nullable String createdBy;
    /**
     * @return Email of creator of the route aggregation resource
     * 
     */
    private @Nullable String createdByEmail;
    /**
     * @return Legal name of creator of the route aggregation resource
     * 
     */
    private @Nullable String createdByFullName;
    /**
     * @return Creation time of the route aggregation resource
     * 
     */
    private @Nullable String createdDateTime;
    /**
     * @return User name of deleter of the route aggregation resource
     * 
     */
    private @Nullable String deletedBy;
    /**
     * @return Email of deleter of the route aggregation resource
     * 
     */
    private @Nullable String deletedByEmail;
    /**
     * @return Legal name of deleter of the route aggregation resource
     * 
     */
    private @Nullable String deletedByFullName;
    /**
     * @return Deletion time of the route aggregation resource
     * 
     */
    private @Nullable String deletedDateTime;
    /**
     * @return User name of last updater of the route aggregation resource
     * 
     */
    private @Nullable String updatedBy;
    /**
     * @return Email of last updater of the route aggregation resource
     * 
     */
    private @Nullable String updatedByEmail;
    /**
     * @return Legal name of last updater of the route aggregation resource
     * 
     */
    private @Nullable String updatedByFullName;
    /**
     * @return Last update time of the route aggregation resource
     * 
     */
    private @Nullable String updatedDateTime;

    private RouteAggregationChangeLog() {}
    /**
     * @return User name of creator of the route aggregation resource
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return Email of creator of the route aggregation resource
     * 
     */
    public Optional<String> createdByEmail() {
        return Optional.ofNullable(this.createdByEmail);
    }
    /**
     * @return Legal name of creator of the route aggregation resource
     * 
     */
    public Optional<String> createdByFullName() {
        return Optional.ofNullable(this.createdByFullName);
    }
    /**
     * @return Creation time of the route aggregation resource
     * 
     */
    public Optional<String> createdDateTime() {
        return Optional.ofNullable(this.createdDateTime);
    }
    /**
     * @return User name of deleter of the route aggregation resource
     * 
     */
    public Optional<String> deletedBy() {
        return Optional.ofNullable(this.deletedBy);
    }
    /**
     * @return Email of deleter of the route aggregation resource
     * 
     */
    public Optional<String> deletedByEmail() {
        return Optional.ofNullable(this.deletedByEmail);
    }
    /**
     * @return Legal name of deleter of the route aggregation resource
     * 
     */
    public Optional<String> deletedByFullName() {
        return Optional.ofNullable(this.deletedByFullName);
    }
    /**
     * @return Deletion time of the route aggregation resource
     * 
     */
    public Optional<String> deletedDateTime() {
        return Optional.ofNullable(this.deletedDateTime);
    }
    /**
     * @return User name of last updater of the route aggregation resource
     * 
     */
    public Optional<String> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    /**
     * @return Email of last updater of the route aggregation resource
     * 
     */
    public Optional<String> updatedByEmail() {
        return Optional.ofNullable(this.updatedByEmail);
    }
    /**
     * @return Legal name of last updater of the route aggregation resource
     * 
     */
    public Optional<String> updatedByFullName() {
        return Optional.ofNullable(this.updatedByFullName);
    }
    /**
     * @return Last update time of the route aggregation resource
     * 
     */
    public Optional<String> updatedDateTime() {
        return Optional.ofNullable(this.updatedDateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteAggregationChangeLog defaults) {
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
        public Builder(RouteAggregationChangeLog defaults) {
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
        public RouteAggregationChangeLog build() {
            final var _resultValue = new RouteAggregationChangeLog();
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
