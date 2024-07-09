// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ProjectApiKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectApiKeyArgs Empty = new ProjectApiKeyArgs();

    /**
     * Description string for the Project API Key resource.
     * * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Description string for the Project API Key resource.
     * * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * UUID of the project where the API key is scoped to.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return UUID of the project where the API key is scoped to.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Flag indicating whether the API key shoud be read-only
     * 
     */
    @Import(name="readOnly", required=true)
    private Output<Boolean> readOnly;

    /**
     * @return Flag indicating whether the API key shoud be read-only
     * 
     */
    public Output<Boolean> readOnly() {
        return this.readOnly;
    }

    private ProjectApiKeyArgs() {}

    private ProjectApiKeyArgs(ProjectApiKeyArgs $) {
        this.description = $.description;
        this.projectId = $.projectId;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectApiKeyArgs $;

        public Builder() {
            $ = new ProjectApiKeyArgs();
        }

        public Builder(ProjectApiKeyArgs defaults) {
            $ = new ProjectApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description string for the Project API Key resource.
         * * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description string for the Project API Key resource.
         * * `read-only` - (Optional) Flag indicating whether the API key shoud be read-only.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param projectId UUID of the project where the API key is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId UUID of the project where the API key is scoped to.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param readOnly Flag indicating whether the API key shoud be read-only
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Flag indicating whether the API key shoud be read-only
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public ProjectApiKeyArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("ProjectApiKeyArgs", "description");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ProjectApiKeyArgs", "projectId");
            }
            if ($.readOnly == null) {
                throw new MissingRequiredPropertyException("ProjectApiKeyArgs", "readOnly");
            }
            return $;
        }
    }

}
