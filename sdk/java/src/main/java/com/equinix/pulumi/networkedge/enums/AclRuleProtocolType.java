// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum AclRuleProtocolType {
        IP("IP"),
        TCP("TCP"),
        UDP("UDP");

        private final String value;

        AclRuleProtocolType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AclRuleProtocolType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
