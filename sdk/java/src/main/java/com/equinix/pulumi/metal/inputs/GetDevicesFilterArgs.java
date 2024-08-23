// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicesFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDevicesFilterArgs Empty = new GetDevicesFilterArgs();

    /**
     * If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
     * 
     * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Boolean> all;

    /**
     * @return If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
     * 
     * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
     * 
     */
    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * The attribute used to filter. Filter attributes are case-sensitive
     * 
     */
    @Import(name="attribute", required=true)
    private Output<String> attribute;

    /**
     * @return The attribute used to filter. Filter attributes are case-sensitive
     * 
     */
    public Output<String> attribute() {
        return this.attribute;
    }

    /**
     * The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
     * 
     */
    @Import(name="matchBy")
    private @Nullable Output<String> matchBy;

    /**
     * @return The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
     * 
     */
    public Optional<Output<String>> matchBy() {
        return Optional.ofNullable(this.matchBy);
    }

    /**
     * The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetDevicesFilterArgs() {}

    private GetDevicesFilterArgs(GetDevicesFilterArgs $) {
        this.all = $.all;
        this.attribute = $.attribute;
        this.matchBy = $.matchBy;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicesFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicesFilterArgs $;

        public Builder() {
            $ = new GetDevicesFilterArgs();
        }

        public Builder(GetDevicesFilterArgs defaults) {
            $ = new GetDevicesFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
         * 
         * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all If is set to true, the values are joined with an AND, and the requests returns only the results that match all specified values. Default is `false`.
         * 
         * All fields in the `devices` block defined below can be used as attribute for both `sort` and `filter` blocks.
         * 
         * @return builder
         * 
         */
        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        /**
         * @param attribute The attribute used to filter. Filter attributes are case-sensitive
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute The attribute used to filter. Filter attributes are case-sensitive
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param matchBy The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
         * 
         * @return builder
         * 
         */
        public Builder matchBy(@Nullable Output<String> matchBy) {
            $.matchBy = matchBy;
            return this;
        }

        /**
         * @param matchBy The type of comparison to apply. One of: `in` , `re`, `substring`, `less_than`, `less_than_or_equal`, `greater_than`, `greater_than_or_equal`. Default is `in`.
         * 
         * @return builder
         * 
         */
        public Builder matchBy(String matchBy) {
            return matchBy(Output.of(matchBy));
        }

        /**
         * @param values The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The filter values. Filter values are case-sensitive. If you specify multiple values for a filter, the values are joined with an OR by default, and the request returns all results that match any of the specified values
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
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

        public GetDevicesFilterArgs build() {
            if ($.attribute == null) {
                throw new MissingRequiredPropertyException("GetDevicesFilterArgs", "attribute");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetDevicesFilterArgs", "values");
            }
            return $;
        }
    }

}