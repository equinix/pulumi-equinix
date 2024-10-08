// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.equinix.pulumi.metal.outputs.GetOrganizationAddress;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrganizationResult {
    /**
     * @return Postal address.
     * 
     */
    private GetOrganizationAddress address;
    /**
     * @return Description string.
     * 
     */
    private @Nullable String description;
    private String id;
    /**
     * @return (Deprecated) Logo URL.
     * 
     * @deprecated
     * Empty string is the only valid value. Support for this field has been removed from the API
     * 
     */
    @Deprecated /* Empty string is the only valid value. Support for this field has been removed from the API */
    private String logo;
    private String name;
    private String organizationId;
    /**
     * @return UUIDs of project resources which belong to this organization.
     * 
     */
    private List<String> projectIds;
    /**
     * @return Twitter handle.
     * 
     */
    private String twitter;
    /**
     * @return Website link.
     * 
     */
    private String website;

    private GetOrganizationResult() {}
    /**
     * @return Postal address.
     * 
     */
    public GetOrganizationAddress address() {
        return this.address;
    }
    /**
     * @return Description string.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public String id() {
        return this.id;
    }
    /**
     * @return (Deprecated) Logo URL.
     * 
     * @deprecated
     * Empty string is the only valid value. Support for this field has been removed from the API
     * 
     */
    @Deprecated /* Empty string is the only valid value. Support for this field has been removed from the API */
    public String logo() {
        return this.logo;
    }
    public String name() {
        return this.name;
    }
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return UUIDs of project resources which belong to this organization.
     * 
     */
    public List<String> projectIds() {
        return this.projectIds;
    }
    /**
     * @return Twitter handle.
     * 
     */
    public String twitter() {
        return this.twitter;
    }
    /**
     * @return Website link.
     * 
     */
    public String website() {
        return this.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetOrganizationAddress address;
        private @Nullable String description;
        private String id;
        private String logo;
        private String name;
        private String organizationId;
        private List<String> projectIds;
        private String twitter;
        private String website;
        public Builder() {}
        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.logo = defaults.logo;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.projectIds = defaults.projectIds;
    	      this.twitter = defaults.twitter;
    	      this.website = defaults.website;
        }

        @CustomType.Setter
        public Builder address(GetOrganizationAddress address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder logo(String logo) {
            if (logo == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "logo");
            }
            this.logo = logo;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            if (organizationId == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "organizationId");
            }
            this.organizationId = organizationId;
            return this;
        }
        @CustomType.Setter
        public Builder projectIds(List<String> projectIds) {
            if (projectIds == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "projectIds");
            }
            this.projectIds = projectIds;
            return this;
        }
        public Builder projectIds(String... projectIds) {
            return projectIds(List.of(projectIds));
        }
        @CustomType.Setter
        public Builder twitter(String twitter) {
            if (twitter == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "twitter");
            }
            this.twitter = twitter;
            return this;
        }
        @CustomType.Setter
        public Builder website(String website) {
            if (website == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "website");
            }
            this.website = website;
            return this;
        }
        public GetOrganizationResult build() {
            final var _resultValue = new GetOrganizationResult();
            _resultValue.address = address;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.logo = logo;
            _resultValue.name = name;
            _resultValue.organizationId = organizationId;
            _resultValue.projectIds = projectIds;
            _resultValue.twitter = twitter;
            _resultValue.website = website;
            return _resultValue;
        }
    }
}
