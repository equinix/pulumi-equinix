// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceProfilesDatumProject {
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

    private GetServiceProfilesDatumProject() {}
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

    public static Builder builder(GetServiceProfilesDatumProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String href;
        private String projectId;
        public Builder() {}
        public Builder(GetServiceProfilesDatumProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumProject", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetServiceProfilesDatumProject", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public GetServiceProfilesDatumProject build() {
            final var _resultValue = new GetServiceProfilesDatumProject();
            _resultValue.href = href;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
