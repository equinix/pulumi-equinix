// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceProfilesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceProfilesFilter Empty = new GetServiceProfilesFilter();

    /**
     * Possible operator to use on filters = - equal
     * 
     */
    @Import(name="operator")
    private @Nullable String operator;

    /**
     * @return Possible operator to use on filters = - equal
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Search Criteria for Service Profile - /name, /uuid, /state, /metros/code, /visibility, /type
     * 
     */
    @Import(name="property")
    private @Nullable String property;

    /**
     * @return Search Criteria for Service Profile - /name, /uuid, /state, /metros/code, /visibility, /type
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }

    /**
     * Values
     * 
     */
    @Import(name="values")
    private @Nullable List<String> values;

    /**
     * @return Values
     * 
     */
    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetServiceProfilesFilter() {}

    private GetServiceProfilesFilter(GetServiceProfilesFilter $) {
        this.operator = $.operator;
        this.property = $.property;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceProfilesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceProfilesFilter $;

        public Builder() {
            $ = new GetServiceProfilesFilter();
        }

        public Builder(GetServiceProfilesFilter defaults) {
            $ = new GetServiceProfilesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator Possible operator to use on filters = - equal
         * 
         * @return builder
         * 
         */
        public Builder operator(@Nullable String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param property Search Criteria for Service Profile - /name, /uuid, /state, /metros/code, /visibility, /type
         * 
         * @return builder
         * 
         */
        public Builder property(@Nullable String property) {
            $.property = property;
            return this;
        }

        /**
         * @param values Values
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Values
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetServiceProfilesFilter build() {
            return $;
        }
    }

}
