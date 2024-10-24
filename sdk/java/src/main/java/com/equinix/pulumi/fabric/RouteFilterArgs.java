// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.fabric.inputs.RouteFilterProjectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteFilterArgs Empty = new RouteFilterArgs();

    /**
     * Optional description to add to the Route Filter you will be creating
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional description to add to the Route Filter you will be creating
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the Route Filter
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Route Filter
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    @Import(name="project", required=true)
    private Output<RouteFilterProjectArgs> project;

    /**
     * @return The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     * 
     */
    public Output<RouteFilterProjectArgs> project() {
        return this.project;
    }

    /**
     * Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private RouteFilterArgs() {}

    private RouteFilterArgs(RouteFilterArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteFilterArgs $;

        public Builder() {
            $ = new RouteFilterArgs();
        }

        public Builder(RouteFilterArgs defaults) {
            $ = new RouteFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional description to add to the Route Filter you will be creating
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional description to add to the Route Filter you will be creating
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Route Filter
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
         * 
         * @return builder
         * 
         */
        public Builder project(Output<RouteFilterProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The Project object that contains project_id and href that is related to the Fabric Project containing connections the Route Filter can be attached to
         * 
         * @return builder
         * 
         */
        public Builder project(RouteFilterProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param type Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Route Filter Type. One of [ &#34;BGP*IPv4*PREFIX*FILTER&#34;, &#34;BGP*IPv6*PREFIX*FILTER&#34; ]
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RouteFilterArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("RouteFilterArgs", "project");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("RouteFilterArgs", "type");
            }
            return $;
        }
    }

}
