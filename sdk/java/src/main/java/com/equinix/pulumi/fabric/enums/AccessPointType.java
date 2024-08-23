// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum AccessPointType {
        /**
         * Colocation
         * 
         */
        Colo("COLO"),
        /**
         * Virtual Device
         * 
         */
        VD("VD"),
        /**
         * Service Profile
         * 
         */
        SP("SP"),
        /**
         * Internet Gateway
         * 
         */
        IGW("IGW"),
        /**
         * Subnet
         * 
         */
        Subnet("SUBNET"),
        /**
         * Gateway
         * 
         */
        GW("GW"),
        /**
         * Network
         * 
         */
        Network("NETWORK");

        private final String value;

        AccessPointType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "AccessPointType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }