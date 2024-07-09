// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolBfd;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolBgpIpv4;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolBgpIpv6;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolChange;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolChangeLog;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolDirectIpv4;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolDirectIpv6;
import com.equinix.pulumi.fabric.outputs.GetRoutingProtocolOperation;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRoutingProtocolResult {
    /**
     * @return Bidirectional Forwarding Detection
     * 
     */
    private GetRoutingProtocolBfd bfd;
    /**
     * @return BGP authorization key
     * 
     */
    private String bgpAuthKey;
    /**
     * @return Routing Protocol BGP IPv4
     * 
     */
    private GetRoutingProtocolBgpIpv4 bgpIpv4;
    /**
     * @return Routing Protocol BGP IPv6
     * 
     */
    private GetRoutingProtocolBgpIpv6 bgpIpv6;
    /**
     * @return Captures Routing Protocol lifecycle change information
     * 
     */
    private List<GetRoutingProtocolChangeLog> changeLogs;
    /**
     * @return Routing Protocol configuration Changes
     * 
     */
    private List<GetRoutingProtocolChange> changes;
    /**
     * @return Connection URI associated with Routing Protocol
     * 
     */
    private String connectionUuid;
    /**
     * @return Customer-provided ASN
     * 
     */
    private Integer customerAsn;
    /**
     * @return Customer-provided Fabric Routing Protocol description
     * 
     */
    private String description;
    /**
     * @return Routing Protocol Direct IPv4
     * 
     */
    private GetRoutingProtocolDirectIpv4 directIpv4;
    /**
     * @return Routing Protocol Direct IPv6
     * 
     */
    private GetRoutingProtocolDirectIpv6 directIpv6;
    /**
     * @return Equinix ASN
     * 
     */
    private Integer equinixAsn;
    /**
     * @return Routing Protocol URI information
     * 
     */
    private String href;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    private String name;
    /**
     * @return Routing Protocol type-specific operational data
     * 
     */
    private List<GetRoutingProtocolOperation> operations;
    /**
     * @return Routing Protocol overall state
     * 
     */
    private String state;
    /**
     * @return Defines the routing protocol type like BGP or DIRECT
     * 
     */
    private String type;
    /**
     * @return Equinix-assigned routing protocol identifier
     * 
     */
    private String uuid;

    private GetRoutingProtocolResult() {}
    /**
     * @return Bidirectional Forwarding Detection
     * 
     */
    public GetRoutingProtocolBfd bfd() {
        return this.bfd;
    }
    /**
     * @return BGP authorization key
     * 
     */
    public String bgpAuthKey() {
        return this.bgpAuthKey;
    }
    /**
     * @return Routing Protocol BGP IPv4
     * 
     */
    public GetRoutingProtocolBgpIpv4 bgpIpv4() {
        return this.bgpIpv4;
    }
    /**
     * @return Routing Protocol BGP IPv6
     * 
     */
    public GetRoutingProtocolBgpIpv6 bgpIpv6() {
        return this.bgpIpv6;
    }
    /**
     * @return Captures Routing Protocol lifecycle change information
     * 
     */
    public List<GetRoutingProtocolChangeLog> changeLogs() {
        return this.changeLogs;
    }
    /**
     * @return Routing Protocol configuration Changes
     * 
     */
    public List<GetRoutingProtocolChange> changes() {
        return this.changes;
    }
    /**
     * @return Connection URI associated with Routing Protocol
     * 
     */
    public String connectionUuid() {
        return this.connectionUuid;
    }
    /**
     * @return Customer-provided ASN
     * 
     */
    public Integer customerAsn() {
        return this.customerAsn;
    }
    /**
     * @return Customer-provided Fabric Routing Protocol description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Routing Protocol Direct IPv4
     * 
     */
    public GetRoutingProtocolDirectIpv4 directIpv4() {
        return this.directIpv4;
    }
    /**
     * @return Routing Protocol Direct IPv6
     * 
     */
    public GetRoutingProtocolDirectIpv6 directIpv6() {
        return this.directIpv6;
    }
    /**
     * @return Equinix ASN
     * 
     */
    public Integer equinixAsn() {
        return this.equinixAsn;
    }
    /**
     * @return Routing Protocol URI information
     * 
     */
    public String href() {
        return this.href;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Routing Protocol type-specific operational data
     * 
     */
    public List<GetRoutingProtocolOperation> operations() {
        return this.operations;
    }
    /**
     * @return Routing Protocol overall state
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Defines the routing protocol type like BGP or DIRECT
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Equinix-assigned routing protocol identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingProtocolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetRoutingProtocolBfd bfd;
        private String bgpAuthKey;
        private GetRoutingProtocolBgpIpv4 bgpIpv4;
        private GetRoutingProtocolBgpIpv6 bgpIpv6;
        private List<GetRoutingProtocolChangeLog> changeLogs;
        private List<GetRoutingProtocolChange> changes;
        private String connectionUuid;
        private Integer customerAsn;
        private String description;
        private GetRoutingProtocolDirectIpv4 directIpv4;
        private GetRoutingProtocolDirectIpv6 directIpv6;
        private Integer equinixAsn;
        private String href;
        private String id;
        private String name;
        private List<GetRoutingProtocolOperation> operations;
        private String state;
        private String type;
        private String uuid;
        public Builder() {}
        public Builder(GetRoutingProtocolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bfd = defaults.bfd;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.bgpIpv4 = defaults.bgpIpv4;
    	      this.bgpIpv6 = defaults.bgpIpv6;
    	      this.changeLogs = defaults.changeLogs;
    	      this.changes = defaults.changes;
    	      this.connectionUuid = defaults.connectionUuid;
    	      this.customerAsn = defaults.customerAsn;
    	      this.description = defaults.description;
    	      this.directIpv4 = defaults.directIpv4;
    	      this.directIpv6 = defaults.directIpv6;
    	      this.equinixAsn = defaults.equinixAsn;
    	      this.href = defaults.href;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.operations = defaults.operations;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder bfd(GetRoutingProtocolBfd bfd) {
            if (bfd == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "bfd");
            }
            this.bfd = bfd;
            return this;
        }
        @CustomType.Setter
        public Builder bgpAuthKey(String bgpAuthKey) {
            if (bgpAuthKey == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "bgpAuthKey");
            }
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }
        @CustomType.Setter
        public Builder bgpIpv4(GetRoutingProtocolBgpIpv4 bgpIpv4) {
            if (bgpIpv4 == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "bgpIpv4");
            }
            this.bgpIpv4 = bgpIpv4;
            return this;
        }
        @CustomType.Setter
        public Builder bgpIpv6(GetRoutingProtocolBgpIpv6 bgpIpv6) {
            if (bgpIpv6 == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "bgpIpv6");
            }
            this.bgpIpv6 = bgpIpv6;
            return this;
        }
        @CustomType.Setter
        public Builder changeLogs(List<GetRoutingProtocolChangeLog> changeLogs) {
            if (changeLogs == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "changeLogs");
            }
            this.changeLogs = changeLogs;
            return this;
        }
        public Builder changeLogs(GetRoutingProtocolChangeLog... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }
        @CustomType.Setter
        public Builder changes(List<GetRoutingProtocolChange> changes) {
            if (changes == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "changes");
            }
            this.changes = changes;
            return this;
        }
        public Builder changes(GetRoutingProtocolChange... changes) {
            return changes(List.of(changes));
        }
        @CustomType.Setter
        public Builder connectionUuid(String connectionUuid) {
            if (connectionUuid == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "connectionUuid");
            }
            this.connectionUuid = connectionUuid;
            return this;
        }
        @CustomType.Setter
        public Builder customerAsn(Integer customerAsn) {
            if (customerAsn == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "customerAsn");
            }
            this.customerAsn = customerAsn;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder directIpv4(GetRoutingProtocolDirectIpv4 directIpv4) {
            if (directIpv4 == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "directIpv4");
            }
            this.directIpv4 = directIpv4;
            return this;
        }
        @CustomType.Setter
        public Builder directIpv6(GetRoutingProtocolDirectIpv6 directIpv6) {
            if (directIpv6 == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "directIpv6");
            }
            this.directIpv6 = directIpv6;
            return this;
        }
        @CustomType.Setter
        public Builder equinixAsn(Integer equinixAsn) {
            if (equinixAsn == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "equinixAsn");
            }
            this.equinixAsn = equinixAsn;
            return this;
        }
        @CustomType.Setter
        public Builder href(String href) {
            if (href == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "href");
            }
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operations(List<GetRoutingProtocolOperation> operations) {
            if (operations == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "operations");
            }
            this.operations = operations;
            return this;
        }
        public Builder operations(GetRoutingProtocolOperation... operations) {
            return operations(List.of(operations));
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetRoutingProtocolResult", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetRoutingProtocolResult build() {
            final var _resultValue = new GetRoutingProtocolResult();
            _resultValue.bfd = bfd;
            _resultValue.bgpAuthKey = bgpAuthKey;
            _resultValue.bgpIpv4 = bgpIpv4;
            _resultValue.bgpIpv6 = bgpIpv6;
            _resultValue.changeLogs = changeLogs;
            _resultValue.changes = changes;
            _resultValue.connectionUuid = connectionUuid;
            _resultValue.customerAsn = customerAsn;
            _resultValue.description = description;
            _resultValue.directIpv4 = directIpv4;
            _resultValue.directIpv6 = directIpv6;
            _resultValue.equinixAsn = equinixAsn;
            _resultValue.href = href;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.operations = operations;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
