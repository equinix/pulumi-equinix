// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksFilter Empty = new GetNetworksFilter();

    /**
     * Optional custom id parameter to assign this filter to an inner AND or OR group. Group id must be prefixed with AND_ or OR_. Ensure intended grouped elements have the same given id. Ungrouped filters will be placed in the filter list group by themselves.
     * 
     */
    @Import(name="group")
    private @Nullable String group;

    /**
     * @return Optional custom id parameter to assign this filter to an inner AND or OR group. Group id must be prefixed with AND_ or OR_. Ensure intended grouped elements have the same given id. Ungrouped filters will be placed in the filter list group by themselves.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, ILIKE, NOT ILIKE, IN, NOT IN]
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    /**
     * @return Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, ILIKE, NOT ILIKE, IN, NOT IN]
     * 
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Possible field names to use on filters. One of [/name /uuid /scope /type /operation/equinixStatus /location/region /project/projectId /account/globalCustId /account/orgId /deletedDate /_*]
     * 
     */
    @Import(name="property", required=true)
    private String property;

    /**
     * @return Possible field names to use on filters. One of [/name /uuid /scope /type /operation/equinixStatus /location/region /project/projectId /account/globalCustId /account/orgId /deletedDate /_*]
     * 
     */
    public String property() {
        return this.property;
    }

    /**
     * The values that you want to apply the property+operator combination to in order to filter your data search
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The values that you want to apply the property+operator combination to in order to filter your data search
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetNetworksFilter() {}

    private GetNetworksFilter(GetNetworksFilter $) {
        this.group = $.group;
        this.operator = $.operator;
        this.property = $.property;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksFilter $;

        public Builder() {
            $ = new GetNetworksFilter();
        }

        public Builder(GetNetworksFilter defaults) {
            $ = new GetNetworksFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param group Optional custom id parameter to assign this filter to an inner AND or OR group. Group id must be prefixed with AND_ or OR_. Ensure intended grouped elements have the same given id. Ungrouped filters will be placed in the filter list group by themselves.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable String group) {
            $.group = group;
            return this;
        }

        /**
         * @param operator Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, ILIKE, NOT ILIKE, IN, NOT IN]
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param property Possible field names to use on filters. One of [/name /uuid /scope /type /operation/equinixStatus /location/region /project/projectId /account/globalCustId /account/orgId /deletedDate /_*]
         * 
         * @return builder
         * 
         */
        public Builder property(String property) {
            $.property = property;
            return this;
        }

        /**
         * @param values The values that you want to apply the property+operator combination to in order to filter your data search
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The values that you want to apply the property+operator combination to in order to filter your data search
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetNetworksFilter build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("GetNetworksFilter", "operator");
            }
            if ($.property == null) {
                throw new MissingRequiredPropertyException("GetNetworksFilter", "property");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetNetworksFilter", "values");
            }
            return $;
        }
    }

}
