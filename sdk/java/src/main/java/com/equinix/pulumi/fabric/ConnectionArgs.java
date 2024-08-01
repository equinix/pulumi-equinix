// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric;

import com.equinix.pulumi.fabric.enums.ConnectionType;
import com.equinix.pulumi.fabric.inputs.ConnectionASideArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionNotificationArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionOrderArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionProjectArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionRedundancyArgs;
import com.equinix.pulumi.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    @Import(name="aSide", required=true)
    private Output<ConnectionASideArgs> aSide;

    /**
     * @return Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    public Output<ConnectionASideArgs> aSide() {
        return this.aSide;
    }

    /**
     * Connection additional information
     * 
     */
    @Import(name="additionalInfo")
    private @Nullable Output<List<Map<String,Object>>> additionalInfo;

    /**
     * @return Connection additional information
     * 
     */
    public Optional<Output<List<Map<String,Object>>>> additionalInfo() {
        return Optional.ofNullable(this.additionalInfo);
    }

    /**
     * Connection bandwidth in Mbps
     * 
     */
    @Import(name="bandwidth", required=true)
    private Output<Integer> bandwidth;

    /**
     * @return Connection bandwidth in Mbps
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }

    /**
     * Customer-provided connection description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Customer-provided connection description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferences for notifications on connection configuration or status changes
     * 
     */
    @Import(name="notifications", required=true)
    private Output<List<ConnectionNotificationArgs>> notifications;

    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public Output<List<ConnectionNotificationArgs>> notifications() {
        return this.notifications;
    }

    /**
     * Order details
     * 
     */
    @Import(name="order")
    private @Nullable Output<ConnectionOrderArgs> order;

    /**
     * @return Order details
     * 
     */
    public Optional<Output<ConnectionOrderArgs>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Project information
     * 
     */
    @Import(name="project")
    private @Nullable Output<ConnectionProjectArgs> project;

    /**
     * @return Project information
     * 
     */
    public Optional<Output<ConnectionProjectArgs>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Connection Redundancy Configuration
     * 
     */
    @Import(name="redundancy")
    private @Nullable Output<ConnectionRedundancyArgs> redundancy;

    /**
     * @return Connection Redundancy Configuration
     * 
     */
    public Optional<Output<ConnectionRedundancyArgs>> redundancy() {
        return Optional.ofNullable(this.redundancy);
    }

    /**
     * Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ConnectionType>> type;

    /**
     * @return Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
     * 
     */
    public Output<Either<String,ConnectionType>> type() {
        return this.type;
    }

    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    @Import(name="zSide", required=true)
    private Output<ConnectionZSideArgs> zSide;

    /**
     * @return Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    public Output<ConnectionZSideArgs> zSide() {
        return this.zSide;
    }

    private ConnectionArgs() {}

    private ConnectionArgs(ConnectionArgs $) {
        this.aSide = $.aSide;
        this.additionalInfo = $.additionalInfo;
        this.bandwidth = $.bandwidth;
        this.description = $.description;
        this.name = $.name;
        this.notifications = $.notifications;
        this.order = $.order;
        this.project = $.project;
        this.redundancy = $.redundancy;
        this.type = $.type;
        this.zSide = $.zSide;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionArgs $;

        public Builder() {
            $ = new ConnectionArgs();
        }

        public Builder(ConnectionArgs defaults) {
            $ = new ConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aSide Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSide(Output<ConnectionASideArgs> aSide) {
            $.aSide = aSide;
            return this;
        }

        /**
         * @param aSide Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSide(ConnectionASideArgs aSide) {
            return aSide(Output.of(aSide));
        }

        /**
         * @param additionalInfo Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(@Nullable Output<List<Map<String,Object>>> additionalInfo) {
            $.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * @param additionalInfo Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(List<Map<String,Object>> additionalInfo) {
            return additionalInfo(Output.of(additionalInfo));
        }

        /**
         * @param additionalInfo Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfo(Map<String,Object>... additionalInfo) {
            return additionalInfo(List.of(additionalInfo));
        }

        /**
         * @param bandwidth Connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth Connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param description Customer-provided connection description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Customer-provided connection description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(Output<List<ConnectionNotificationArgs>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<ConnectionNotificationArgs> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications Preferences for notifications on connection configuration or status changes
         * 
         * @return builder
         * 
         */
        public Builder notifications(ConnectionNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param order Order details
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<ConnectionOrderArgs> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order details
         * 
         * @return builder
         * 
         */
        public Builder order(ConnectionOrderArgs order) {
            return order(Output.of(order));
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<ConnectionProjectArgs> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project information
         * 
         * @return builder
         * 
         */
        public Builder project(ConnectionProjectArgs project) {
            return project(Output.of(project));
        }

        /**
         * @param redundancy Connection Redundancy Configuration
         * 
         * @return builder
         * 
         */
        public Builder redundancy(@Nullable Output<ConnectionRedundancyArgs> redundancy) {
            $.redundancy = redundancy;
            return this;
        }

        /**
         * @param redundancy Connection Redundancy Configuration
         * 
         * @return builder
         * 
         */
        public Builder redundancy(ConnectionRedundancyArgs redundancy) {
            return redundancy(Output.of(redundancy));
        }

        /**
         * @param type Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ConnectionType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ConnectionType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Defines the connection type like EVPL*VC, EPL*VC, IPWAN*VC, IP*VC, ACCESS*EPL*VC, EVPLAN*VC, EPLAN*VC, EIA*VC, IA*VC, EC_VC
         * 
         * @return builder
         * 
         */
        public Builder type(ConnectionType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param zSide Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSide(Output<ConnectionZSideArgs> zSide) {
            $.zSide = zSide;
            return this;
        }

        /**
         * @param zSide Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSide(ConnectionZSideArgs zSide) {
            return zSide(Output.of(zSide));
        }

        public ConnectionArgs build() {
            if ($.aSide == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "aSide");
            }
            if ($.bandwidth == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "bandwidth");
            }
            if ($.notifications == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "notifications");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "type");
            }
            if ($.zSide == null) {
                throw new MissingRequiredPropertyException("ConnectionArgs", "zSide");
            }
            return $;
        }
    }

}
