// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal.outputs;

import com.equinix.pulumi.equinix.metal.outputs.GetOrganizationAddress;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

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
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Logo URL.
     * 
     */
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
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Logo URL.
     * 
     */
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
        private String description;
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
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder logo(String logo) {
            this.logo = Objects.requireNonNull(logo);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder projectIds(List<String> projectIds) {
            this.projectIds = Objects.requireNonNull(projectIds);
            return this;
        }
        public Builder projectIds(String... projectIds) {
            return projectIds(List.of(projectIds));
        }
        @CustomType.Setter
        public Builder twitter(String twitter) {
            this.twitter = Objects.requireNonNull(twitter);
            return this;
        }
        @CustomType.Setter
        public Builder website(String website) {
            this.website = Objects.requireNonNull(website);
            return this;
        }
        public GetOrganizationResult build() {
            final var o = new GetOrganizationResult();
            o.address = address;
            o.description = description;
            o.id = id;
            o.logo = logo;
            o.name = name;
            o.organizationId = organizationId;
            o.projectIds = projectIds;
            o.twitter = twitter;
            o.website = website;
            return o;
        }
    }
}
