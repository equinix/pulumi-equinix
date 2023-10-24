// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudRouterProject {
    /**
     * @return Unique Resource URL
     * 
     */
    private String href;
    /**
     * @return Project Id
     * 
     */
    private String projectId;

    private GetCloudRouterProject() {}
    /**
     * @return Unique Resource URL
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return Project Id
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudRouterProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String projectId;
        public Builder() {}
        public Builder(GetCloudRouterProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder href(String href) {
            this.href = Objects.requireNonNull(href);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public GetCloudRouterProject build() {
            final var o = new GetCloudRouterProject();
            o.href = href;
            o.projectId = projectId;
            return o;
        }
    }
}
