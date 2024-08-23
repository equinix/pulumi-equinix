// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionsSort extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionsSort Empty = new GetConnectionsSort();

    /**
     * The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    @Import(name="direction")
    private @Nullable String direction;

    /**
     * @return The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * The property name to use in sorting. One of [/name /direction /aSide/accessPoint/name /aSide/accessPoint/type /aSide/accessPoint/account/accountName /aSide/accessPoint/location/metroName /aSide/accessPoint/location/metroCode /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/name /zSide/accessPoint/type /zSide/accessPoint/account/accountName /zSide/accessPoint/location/metroName /zSide/accessPoint/location/metroCode /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/authenticationKey /bandwidth /geoScope /uuid /changeLog/createdDateTime /changeLog/updatedDateTime /operation/equinixStatus /operation/providerStatus /redundancy/priority]. Defaults to /changeLog/updatedDateTime
     * 
     */
    @Import(name="property")
    private @Nullable String property;

    /**
     * @return The property name to use in sorting. One of [/name /direction /aSide/accessPoint/name /aSide/accessPoint/type /aSide/accessPoint/account/accountName /aSide/accessPoint/location/metroName /aSide/accessPoint/location/metroCode /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/name /zSide/accessPoint/type /zSide/accessPoint/account/accountName /zSide/accessPoint/location/metroName /zSide/accessPoint/location/metroCode /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/authenticationKey /bandwidth /geoScope /uuid /changeLog/createdDateTime /changeLog/updatedDateTime /operation/equinixStatus /operation/providerStatus /redundancy/priority]. Defaults to /changeLog/updatedDateTime
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }

    private GetConnectionsSort() {}

    private GetConnectionsSort(GetConnectionsSort $) {
        this.direction = $.direction;
        this.property = $.property;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionsSort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionsSort $;

        public Builder() {
            $ = new GetConnectionsSort();
        }

        public Builder(GetConnectionsSort defaults) {
            $ = new GetConnectionsSort(Objects.requireNonNull(defaults));
        }

        /**
         * @param direction The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable String direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param property The property name to use in sorting. One of [/name /direction /aSide/accessPoint/name /aSide/accessPoint/type /aSide/accessPoint/account/accountName /aSide/accessPoint/location/metroName /aSide/accessPoint/location/metroCode /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/name /zSide/accessPoint/type /zSide/accessPoint/account/accountName /zSide/accessPoint/location/metroName /zSide/accessPoint/location/metroCode /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/authenticationKey /bandwidth /geoScope /uuid /changeLog/createdDateTime /changeLog/updatedDateTime /operation/equinixStatus /operation/providerStatus /redundancy/priority]. Defaults to /changeLog/updatedDateTime
         * 
         * @return builder
         * 
         */
        public Builder property(@Nullable String property) {
            $.property = property;
            return this;
        }

        public GetConnectionsSort build() {
            return $;
        }
    }

}