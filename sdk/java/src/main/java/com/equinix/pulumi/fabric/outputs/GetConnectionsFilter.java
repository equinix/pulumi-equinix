// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsFilter {
    /**
     * @return Optional custom id parameter to assign this filter to an inner AND or OR group. Group id must be prefixed with AND_ or OR_. Ensure intended grouped elements have the same given id. Ungrouped filters will be placed in the filter list group by themselves.
     * 
     */
    private @Nullable String group;
    /**
     * @return Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
     * 
     */
    private String operator;
    /**
     * @return Possible field names to use on filters. One of [/isRemote /name /uuid /type /geoScope /account/orgId /aSide/accessPoint/account/accountName /aSide/accessPoint/account/accountNumber /aSide/accessPoint/router/uuid /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /aSide/accessPoint/linkProtocol/vlanTagMin /aSide/accessPoint/linkProtocol/vlanTagMax /aSide/accessPoint/location/metroCode /aSide/accessPoint/location/metroName /aSide/accessPoint/name /aSide/accessPoint/port/uuid /aSide/accessPoint/port/name /aSide/accessPoint/type /aSide/accessPoint/virtualDevice/name /aSide/accessPoint/virtualDevice/uuid /aSide/serviceToken/uuid /change/status /operation/equinixStatus /operation/providerStatus /project/projectId /redundancy/group /redundancy/priority /zSide/accessPoint/account/accountName /zSide/accessPoint/authenticationKey /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/linkProtocol/vlanTagMin /zSide/accessPoint/linkProtocol/vlanTagMax /zSide/accessPoint/location/metroCode /zSide/accessPoint/location/metroName /zSide/accessPoint/name /zSide/accessPoint/port/uuid /zSide/accessPoint/network/uuid /zSide/accessPoint/port/name /zSide/accessPoint/profile/uuid /zSide/accessPoint/type /zSide/accessPoint/virtualDevice/name /zSide/accessPoint/virtualDevice/uuid /zSide/serviceToken/uuid /zSide/internetAccess/uuid *]
     * 
     */
    private String property;
    /**
     * @return The values that you want to apply the property+operator combination to in order to filter your data search
     * 
     */
    private List<String> values;

    private GetConnectionsFilter() {}
    /**
     * @return Optional custom id parameter to assign this filter to an inner AND or OR group. Group id must be prefixed with AND_ or OR_. Ensure intended grouped elements have the same given id. Ungrouped filters will be placed in the filter list group by themselves.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Possible field names to use on filters. One of [/isRemote /name /uuid /type /geoScope /account/orgId /aSide/accessPoint/account/accountName /aSide/accessPoint/account/accountNumber /aSide/accessPoint/router/uuid /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /aSide/accessPoint/linkProtocol/vlanTagMin /aSide/accessPoint/linkProtocol/vlanTagMax /aSide/accessPoint/location/metroCode /aSide/accessPoint/location/metroName /aSide/accessPoint/name /aSide/accessPoint/port/uuid /aSide/accessPoint/port/name /aSide/accessPoint/type /aSide/accessPoint/virtualDevice/name /aSide/accessPoint/virtualDevice/uuid /aSide/serviceToken/uuid /change/status /operation/equinixStatus /operation/providerStatus /project/projectId /redundancy/group /redundancy/priority /zSide/accessPoint/account/accountName /zSide/accessPoint/authenticationKey /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/linkProtocol/vlanTagMin /zSide/accessPoint/linkProtocol/vlanTagMax /zSide/accessPoint/location/metroCode /zSide/accessPoint/location/metroName /zSide/accessPoint/name /zSide/accessPoint/port/uuid /zSide/accessPoint/network/uuid /zSide/accessPoint/port/name /zSide/accessPoint/profile/uuid /zSide/accessPoint/type /zSide/accessPoint/virtualDevice/name /zSide/accessPoint/virtualDevice/uuid /zSide/serviceToken/uuid /zSide/internetAccess/uuid *]
     * 
     */
    public String property() {
        return this.property;
    }
    /**
     * @return The values that you want to apply the property+operator combination to in order to filter your data search
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private String operator;
        private String property;
        private List<String> values;
        public Builder() {}
        public Builder(GetConnectionsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.operator = defaults.operator;
    	      this.property = defaults.property;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetConnectionsFilter", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder property(String property) {
            if (property == null) {
              throw new MissingRequiredPropertyException("GetConnectionsFilter", "property");
            }
            this.property = property;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("GetConnectionsFilter", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetConnectionsFilter build() {
            final var _resultValue = new GetConnectionsFilter();
            _resultValue.group = group;
            _resultValue.operator = operator;
            _resultValue.property = property;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
