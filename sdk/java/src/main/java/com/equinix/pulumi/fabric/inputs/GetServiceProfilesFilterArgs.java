// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceProfilesFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetServiceProfilesFilterArgs Empty = new GetServiceProfilesFilterArgs();

    /**
     * Operators to use on your filtered field with the values given. One of [=]
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return Operators to use on your filtered field with the values given. One of [=]
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * Property to apply operator and values to. One of [/name /uuid /state /metros/code /visibility /type /project/projectId]
     * 
     */
    @Import(name="property", required=true)
    private Output<String> property;

    /**
     * @return Property to apply operator and values to. One of [/name /uuid /state /metros/code /visibility /type /project/projectId]
     * 
     */
    public Output<String> property() {
        return this.property;
    }

    /**
     * The values that you want to apply the property+operator combination to in order to filter your data search
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The values that you want to apply the property+operator combination to in order to filter your data search
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetServiceProfilesFilterArgs() {}

    private GetServiceProfilesFilterArgs(GetServiceProfilesFilterArgs $) {
        this.operator = $.operator;
        this.property = $.property;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceProfilesFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceProfilesFilterArgs $;

        public Builder() {
            $ = new GetServiceProfilesFilterArgs();
        }

        public Builder(GetServiceProfilesFilterArgs defaults) {
            $ = new GetServiceProfilesFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator Operators to use on your filtered field with the values given. One of [=]
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator Operators to use on your filtered field with the values given. One of [=]
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param property Property to apply operator and values to. One of [/name /uuid /state /metros/code /visibility /type /project/projectId]
         * 
         * @return builder
         * 
         */
        public Builder property(Output<String> property) {
            $.property = property;
            return this;
        }

        /**
         * @param property Property to apply operator and values to. One of [/name /uuid /state /metros/code /visibility /type /project/projectId]
         * 
         * @return builder
         * 
         */
        public Builder property(String property) {
            return property(Output.of(property));
        }

        /**
         * @param values The values that you want to apply the property+operator combination to in order to filter your data search
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The values that you want to apply the property+operator combination to in order to filter your data search
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
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

        public GetServiceProfilesFilterArgs build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("GetServiceProfilesFilterArgs", "operator");
            }
            if ($.property == null) {
                throw new MissingRequiredPropertyException("GetServiceProfilesFilterArgs", "property");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetServiceProfilesFilterArgs", "values");
            }
            return $;
        }
    }

}
