// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum FileType {
        License("LICENSE"),
        CloudInit("CLOUD_INIT");

        private final String value;

        FileType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "FileType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
