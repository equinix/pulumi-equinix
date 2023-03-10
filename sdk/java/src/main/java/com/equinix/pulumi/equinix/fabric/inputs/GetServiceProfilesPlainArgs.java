// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.equinix.pulumi.equinix.fabric.inputs.GetServiceProfilesFilter;
import com.equinix.pulumi.equinix.fabric.inputs.GetServiceProfilesSort;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceProfilesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceProfilesPlainArgs Empty = new GetServiceProfilesPlainArgs();

    /**
     * Service Profile Search Filter
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetServiceProfilesFilter> filters;

    /**
     * @return Service Profile Search Filter
     * 
     */
    public Optional<List<GetServiceProfilesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Service Profile Sort criteria for Search Request response payload
     * 
     */
    @Import(name="sorts")
    private @Nullable List<GetServiceProfilesSort> sorts;

    /**
     * @return Service Profile Sort criteria for Search Request response payload
     * 
     */
    public Optional<List<GetServiceProfilesSort>> sorts() {
        return Optional.ofNullable(this.sorts);
    }

    private GetServiceProfilesPlainArgs() {}

    private GetServiceProfilesPlainArgs(GetServiceProfilesPlainArgs $) {
        this.filters = $.filters;
        this.sorts = $.sorts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceProfilesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceProfilesPlainArgs $;

        public Builder() {
            $ = new GetServiceProfilesPlainArgs();
        }

        public Builder(GetServiceProfilesPlainArgs defaults) {
            $ = new GetServiceProfilesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Service Profile Search Filter
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetServiceProfilesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Service Profile Search Filter
         * 
         * @return builder
         * 
         */
        public Builder filters(GetServiceProfilesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sorts Service Profile Sort criteria for Search Request response payload
         * 
         * @return builder
         * 
         */
        public Builder sorts(@Nullable List<GetServiceProfilesSort> sorts) {
            $.sorts = sorts;
            return this;
        }

        /**
         * @param sorts Service Profile Sort criteria for Search Request response payload
         * 
         * @return builder
         * 
         */
        public Builder sorts(GetServiceProfilesSort... sorts) {
            return sorts(List.of(sorts));
        }

        public GetServiceProfilesPlainArgs build() {
            return $;
        }
    }

}
