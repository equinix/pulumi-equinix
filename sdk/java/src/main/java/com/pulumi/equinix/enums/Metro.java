// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum Metro {
        Amsterdam("AM"),
        Ashburn("DC"),
        Atlanta("AT"),
        Barcelona("BA"),
        Bogota("BG"),
        Bordeaux("BX"),
        Boston("BO"),
        Brussels("BL"),
        Calgary("CL"),
        Canberra("CA"),
        Chicago("CH"),
        Dallas("DA"),
        Denver("DE"),
        Dubai("DX"),
        Dublin("DB"),
        Frankfurt("FR"),
        Geneva("GV"),
        Hamburg("HH"),
        Helsinki("HE"),
        HongKong("HK"),
        Istanbul("IL"),
        Kamloops("KA"),
        Lisbon("LS"),
        London("LD"),
        LosAngeles("LA"),
        Madrid("MD"),
        Manchester("MA"),
        Melbourne("ME"),
        MexicoCity("MX"),
        Miami("MI"),
        Milan("ML"),
        Montreal("MT"),
        Mumbai("MB"),
        Munich("MU"),
        NewYork("NY"),
        Osaka("OS"),
        Paris("PA"),
        Perth("PE"),
        Philadelphia("PH"),
        RioDeJaneiro("RJ"),
        SaoPaulo("SP"),
        Seattle("SE"),
        Seoul("SL"),
        SiliconValley("SV"),
        Singapore("SG"),
        Sofia("SO"),
        Stockholm("SK"),
        Sydney("SY"),
        Tokyo("TY"),
        Toronto("TR"),
        Vancouver("VA"),
        Warsaw("WA"),
        Winnipeg("WI"),
        Zurich("ZH");

        private final String value;

        Metro(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Metro[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
