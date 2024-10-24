// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteFiltersSort {
    /**
     * @return The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    private @Nullable String direction;
    /**
     * @return The property name to use in sorting. Can be one of the following: [/type, /uuid, /name, /project/projectId, /state, /notMatchedRuleAction, /connectionsCount, /changeLog/createdDateTime, /changeLog/updatedDateTime], Defaults to /changeLog/updatedDateTime
     * 
     */
    private @Nullable String property;

    private GetRouteFiltersSort() {}
    /**
     * @return The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return The property name to use in sorting. Can be one of the following: [/type, /uuid, /name, /project/projectId, /state, /notMatchedRuleAction, /connectionsCount, /changeLog/createdDateTime, /changeLog/updatedDateTime], Defaults to /changeLog/updatedDateTime
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFiltersSort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private @Nullable String property;
        public Builder() {}
        public Builder(GetRouteFiltersSort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.property = defaults.property;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder property(@Nullable String property) {

            this.property = property;
            return this;
        }
        public GetRouteFiltersSort build() {
            final var _resultValue = new GetRouteFiltersSort();
            _resultValue.direction = direction;
            _resultValue.property = property;
            return _resultValue;
        }
    }
}
