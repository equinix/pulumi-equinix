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


public final class GetConnectionsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionsFilter Empty = new GetConnectionsFilter();

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
     * Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    /**
     * @return Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
     * 
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Possible field names to use on filters. One of [/isRemote /name /uuid /type /geoScope /account/orgId /aSide/accessPoint/account/accountName /aSide/accessPoint/account/accountNumber /aSide/accessPoint/router/uuid /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /aSide/accessPoint/linkProtocol/vlanTagMin /aSide/accessPoint/linkProtocol/vlanTagMax /aSide/accessPoint/location/metroCode /aSide/accessPoint/location/metroName /aSide/accessPoint/name /aSide/accessPoint/port/uuid /aSide/accessPoint/port/name /aSide/accessPoint/type /aSide/accessPoint/virtualDevice/name /aSide/accessPoint/virtualDevice/uuid /aSide/serviceToken/uuid /change/status /operation/equinixStatus /operation/providerStatus /project/projectId /redundancy/group /redundancy/priority /zSide/accessPoint/account/accountName /zSide/accessPoint/authenticationKey /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/linkProtocol/vlanTagMin /zSide/accessPoint/linkProtocol/vlanTagMax /zSide/accessPoint/location/metroCode /zSide/accessPoint/location/metroName /zSide/accessPoint/name /zSide/accessPoint/port/uuid /zSide/accessPoint/network/uuid /zSide/accessPoint/port/name /zSide/accessPoint/profile/uuid /zSide/accessPoint/type /zSide/accessPoint/virtualDevice/name /zSide/accessPoint/virtualDevice/uuid /zSide/serviceToken/uuid *]
     * 
     */
    @Import(name="property", required=true)
    private String property;

    /**
     * @return Possible field names to use on filters. One of [/isRemote /name /uuid /type /geoScope /account/orgId /aSide/accessPoint/account/accountName /aSide/accessPoint/account/accountNumber /aSide/accessPoint/router/uuid /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /aSide/accessPoint/linkProtocol/vlanTagMin /aSide/accessPoint/linkProtocol/vlanTagMax /aSide/accessPoint/location/metroCode /aSide/accessPoint/location/metroName /aSide/accessPoint/name /aSide/accessPoint/port/uuid /aSide/accessPoint/port/name /aSide/accessPoint/type /aSide/accessPoint/virtualDevice/name /aSide/accessPoint/virtualDevice/uuid /aSide/serviceToken/uuid /change/status /operation/equinixStatus /operation/providerStatus /project/projectId /redundancy/group /redundancy/priority /zSide/accessPoint/account/accountName /zSide/accessPoint/authenticationKey /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/linkProtocol/vlanTagMin /zSide/accessPoint/linkProtocol/vlanTagMax /zSide/accessPoint/location/metroCode /zSide/accessPoint/location/metroName /zSide/accessPoint/name /zSide/accessPoint/port/uuid /zSide/accessPoint/network/uuid /zSide/accessPoint/port/name /zSide/accessPoint/profile/uuid /zSide/accessPoint/type /zSide/accessPoint/virtualDevice/name /zSide/accessPoint/virtualDevice/uuid /zSide/serviceToken/uuid *]
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

    private GetConnectionsFilter() {}

    private GetConnectionsFilter(GetConnectionsFilter $) {
        this.group = $.group;
        this.operator = $.operator;
        this.property = $.property;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionsFilter $;

        public Builder() {
            $ = new GetConnectionsFilter();
        }

        public Builder(GetConnectionsFilter defaults) {
            $ = new GetConnectionsFilter(Objects.requireNonNull(defaults));
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
         * @param operator Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param property Possible field names to use on filters. One of [/isRemote /name /uuid /type /geoScope /account/orgId /aSide/accessPoint/account/accountName /aSide/accessPoint/account/accountNumber /aSide/accessPoint/router/uuid /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /aSide/accessPoint/linkProtocol/vlanTagMin /aSide/accessPoint/linkProtocol/vlanTagMax /aSide/accessPoint/location/metroCode /aSide/accessPoint/location/metroName /aSide/accessPoint/name /aSide/accessPoint/port/uuid /aSide/accessPoint/port/name /aSide/accessPoint/type /aSide/accessPoint/virtualDevice/name /aSide/accessPoint/virtualDevice/uuid /aSide/serviceToken/uuid /change/status /operation/equinixStatus /operation/providerStatus /project/projectId /redundancy/group /redundancy/priority /zSide/accessPoint/account/accountName /zSide/accessPoint/authenticationKey /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/linkProtocol/vlanTagMin /zSide/accessPoint/linkProtocol/vlanTagMax /zSide/accessPoint/location/metroCode /zSide/accessPoint/location/metroName /zSide/accessPoint/name /zSide/accessPoint/port/uuid /zSide/accessPoint/network/uuid /zSide/accessPoint/port/name /zSide/accessPoint/profile/uuid /zSide/accessPoint/type /zSide/accessPoint/virtualDevice/name /zSide/accessPoint/virtualDevice/uuid /zSide/serviceToken/uuid *]
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

        public GetConnectionsFilter build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("GetConnectionsFilter", "operator");
            }
            if ($.property == null) {
                throw new MissingRequiredPropertyException("GetConnectionsFilter", "property");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetConnectionsFilter", "values");
            }
            return $;
        }
    }

}
