// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicesFilter Empty = new GetDevicesFilter();

    /**
     * If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
     * 
     * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
     * 
     */
    @Import(name="all")
    private @Nullable Boolean all;

    /**
     * @return If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
     * 
     * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
     * 
     */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * The attribute used to filter. Filter attributes are case-sensitive
     * 
     */
    @Import(name="attribute", required=true)
    private String attribute;

    /**
     * @return The attribute used to filter. Filter attributes are case-sensitive
     * 
     */
    public String attribute() {
        return this.attribute;
    }

    /**
     * The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
     * 
     */
    @Import(name="matchBy")
    private @Nullable String matchBy;

    /**
     * @return The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
     * 
     */
    public Optional<String> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }

    /**
     * The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetDevicesFilter() {}

    private GetDevicesFilter(GetDevicesFilter $) {
        this.all = $.all;
        this.attribute = $.attribute;
        this.matchBy = $.matchBy;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicesFilter $;

        public Builder() {
            $ = new GetDevicesFilter();
        }

        public Builder(GetDevicesFilter defaults) {
            $ = new GetDevicesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param all If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
         * 
         * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Boolean all) {
            $.all = all;
            return this;
        }

        /**
         * @param attribute The attribute used to filter. Filter attributes are case-sensitive
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param matchBy The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
         * 
         * @return builder
         * 
         */
        public Builder matchBy(@Nullable String matchBy) {
            $.matchBy = matchBy;
            return this;
        }

        /**
         * @param values The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetDevicesFilter build() {
            if ($.attribute == null) {
                throw new MissingRequiredPropertyException("GetDevicesFilter", "attribute");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetDevicesFilter", "values");
            }
            return $;
        }
    }

}
