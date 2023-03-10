// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.fabric.inputs;

import com.equinix.pulumi.equinix.fabric.enums.ConnectionType;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionASideArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionAccountArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionAdditionalInfoArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionChangeLogArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionNotificationArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionOperationArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionOrderArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionProjectArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionRedundancyArgs;
import com.equinix.pulumi.equinix.fabric.inputs.ConnectionZSideArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    @Import(name="aSides")
    private @Nullable Output<List<ConnectionASideArgs>> aSides;

    /**
     * @return Requester or Customer side connection configuration object of the multi-segment connection
     * 
     */
    public Optional<Output<List<ConnectionASideArgs>>> aSides() {
        return Optional.ofNullable(this.aSides);
    }

    /**
     * Customer account information that is associated with this connection
     * 
     */
    @Import(name="accounts")
    private @Nullable Output<List<ConnectionAccountArgs>> accounts;

    /**
     * @return Customer account information that is associated with this connection
     * 
     */
    public Optional<Output<List<ConnectionAccountArgs>>> accounts() {
        return Optional.ofNullable(this.accounts);
    }

    /**
     * Connection additional information
     * 
     */
    @Import(name="additionalInfos")
    private @Nullable Output<List<ConnectionAdditionalInfoArgs>> additionalInfos;

    /**
     * @return Connection additional information
     * 
     */
    public Optional<Output<List<ConnectionAdditionalInfoArgs>>> additionalInfos() {
        return Optional.ofNullable(this.additionalInfos);
    }

    /**
     * Connection bandwidth in Mbps
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return Connection bandwidth in Mbps
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * Captures connection lifecycle change information
     * 
     */
    @Import(name="changeLogs")
    private @Nullable Output<List<ConnectionChangeLogArgs>> changeLogs;

    /**
     * @return Captures connection lifecycle change information
     * 
     */
    public Optional<Output<List<ConnectionChangeLogArgs>>> changeLogs() {
        return Optional.ofNullable(this.changeLogs);
    }

    /**
     * Connection directionality from the requester point of view
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    /**
     * @return Connection directionality from the requester point of view
     * 
     */
    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Connection URI information
     * 
     */
    @Import(name="href")
    private @Nullable Output<String> href;

    /**
     * @return Connection URI information
     * 
     */
    public Optional<Output<String>> href() {
        return Optional.ofNullable(this.href);
    }

    /**
     * Connection property derived from access point locations
     * 
     */
    @Import(name="isRemote")
    private @Nullable Output<Boolean> isRemote;

    /**
     * @return Connection property derived from access point locations
     * 
     */
    public Optional<Output<Boolean>> isRemote() {
        return Optional.ofNullable(this.isRemote);
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
    @Import(name="notifications")
    private @Nullable Output<List<ConnectionNotificationArgs>> notifications;

    /**
     * @return Preferences for notifications on connection configuration or status changes
     * 
     */
    public Optional<Output<List<ConnectionNotificationArgs>>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    /**
     * Connection type-specific operational data
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<ConnectionOperationArgs>> operations;

    /**
     * @return Connection type-specific operational data
     * 
     */
    public Optional<Output<List<ConnectionOperationArgs>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * Order related to this connection information
     * 
     */
    @Import(name="orders")
    private @Nullable Output<List<ConnectionOrderArgs>> orders;

    /**
     * @return Order related to this connection information
     * 
     */
    public Optional<Output<List<ConnectionOrderArgs>>> orders() {
        return Optional.ofNullable(this.orders);
    }

    /**
     * Project information
     * 
     */
    @Import(name="projects")
    private @Nullable Output<List<ConnectionProjectArgs>> projects;

    /**
     * @return Project information
     * 
     */
    public Optional<Output<List<ConnectionProjectArgs>>> projects() {
        return Optional.ofNullable(this.projects);
    }

    /**
     * Redundancy Information
     * 
     */
    @Import(name="redundancies")
    private @Nullable Output<List<ConnectionRedundancyArgs>> redundancies;

    /**
     * @return Redundancy Information
     * 
     */
    public Optional<Output<List<ConnectionRedundancyArgs>>> redundancies() {
        return Optional.ofNullable(this.redundancies);
    }

    /**
     * Connection overall state
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Connection overall state
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ConnectionType>> type;

    /**
     * @return Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     * 
     */
    public Optional<Output<Either<String,ConnectionType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    @Import(name="zSides")
    private @Nullable Output<List<ConnectionZSideArgs>> zSides;

    /**
     * @return Destination or Provider side connection configuration object of the multi-segment connection
     * 
     */
    public Optional<Output<List<ConnectionZSideArgs>>> zSides() {
        return Optional.ofNullable(this.zSides);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.aSides = $.aSides;
        this.accounts = $.accounts;
        this.additionalInfos = $.additionalInfos;
        this.bandwidth = $.bandwidth;
        this.changeLogs = $.changeLogs;
        this.direction = $.direction;
        this.href = $.href;
        this.isRemote = $.isRemote;
        this.name = $.name;
        this.notifications = $.notifications;
        this.operations = $.operations;
        this.orders = $.orders;
        this.projects = $.projects;
        this.redundancies = $.redundancies;
        this.state = $.state;
        this.type = $.type;
        this.zSides = $.zSides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aSides Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSides(@Nullable Output<List<ConnectionASideArgs>> aSides) {
            $.aSides = aSides;
            return this;
        }

        /**
         * @param aSides Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSides(List<ConnectionASideArgs> aSides) {
            return aSides(Output.of(aSides));
        }

        /**
         * @param aSides Requester or Customer side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder aSides(ConnectionASideArgs... aSides) {
            return aSides(List.of(aSides));
        }

        /**
         * @param accounts Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder accounts(@Nullable Output<List<ConnectionAccountArgs>> accounts) {
            $.accounts = accounts;
            return this;
        }

        /**
         * @param accounts Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder accounts(List<ConnectionAccountArgs> accounts) {
            return accounts(Output.of(accounts));
        }

        /**
         * @param accounts Customer account information that is associated with this connection
         * 
         * @return builder
         * 
         */
        public Builder accounts(ConnectionAccountArgs... accounts) {
            return accounts(List.of(accounts));
        }

        /**
         * @param additionalInfos Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfos(@Nullable Output<List<ConnectionAdditionalInfoArgs>> additionalInfos) {
            $.additionalInfos = additionalInfos;
            return this;
        }

        /**
         * @param additionalInfos Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfos(List<ConnectionAdditionalInfoArgs> additionalInfos) {
            return additionalInfos(Output.of(additionalInfos));
        }

        /**
         * @param additionalInfos Connection additional information
         * 
         * @return builder
         * 
         */
        public Builder additionalInfos(ConnectionAdditionalInfoArgs... additionalInfos) {
            return additionalInfos(List.of(additionalInfos));
        }

        /**
         * @param bandwidth Connection bandwidth in Mbps
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
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
         * @param changeLogs Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(@Nullable Output<List<ConnectionChangeLogArgs>> changeLogs) {
            $.changeLogs = changeLogs;
            return this;
        }

        /**
         * @param changeLogs Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(List<ConnectionChangeLogArgs> changeLogs) {
            return changeLogs(Output.of(changeLogs));
        }

        /**
         * @param changeLogs Captures connection lifecycle change information
         * 
         * @return builder
         * 
         */
        public Builder changeLogs(ConnectionChangeLogArgs... changeLogs) {
            return changeLogs(List.of(changeLogs));
        }

        /**
         * @param direction Connection directionality from the requester point of view
         * 
         * @return builder
         * 
         */
        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction Connection directionality from the requester point of view
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(@Nullable Output<String> href) {
            $.href = href;
            return this;
        }

        /**
         * @param href Connection URI information
         * 
         * @return builder
         * 
         */
        public Builder href(String href) {
            return href(Output.of(href));
        }

        /**
         * @param isRemote Connection property derived from access point locations
         * 
         * @return builder
         * 
         */
        public Builder isRemote(@Nullable Output<Boolean> isRemote) {
            $.isRemote = isRemote;
            return this;
        }

        /**
         * @param isRemote Connection property derived from access point locations
         * 
         * @return builder
         * 
         */
        public Builder isRemote(Boolean isRemote) {
            return isRemote(Output.of(isRemote));
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
        public Builder notifications(@Nullable Output<List<ConnectionNotificationArgs>> notifications) {
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
         * @param operations Connection type-specific operational data
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<ConnectionOperationArgs>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations Connection type-specific operational data
         * 
         * @return builder
         * 
         */
        public Builder operations(List<ConnectionOperationArgs> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations Connection type-specific operational data
         * 
         * @return builder
         * 
         */
        public Builder operations(ConnectionOperationArgs... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param orders Order related to this connection information
         * 
         * @return builder
         * 
         */
        public Builder orders(@Nullable Output<List<ConnectionOrderArgs>> orders) {
            $.orders = orders;
            return this;
        }

        /**
         * @param orders Order related to this connection information
         * 
         * @return builder
         * 
         */
        public Builder orders(List<ConnectionOrderArgs> orders) {
            return orders(Output.of(orders));
        }

        /**
         * @param orders Order related to this connection information
         * 
         * @return builder
         * 
         */
        public Builder orders(ConnectionOrderArgs... orders) {
            return orders(List.of(orders));
        }

        /**
         * @param projects Project information
         * 
         * @return builder
         * 
         */
        public Builder projects(@Nullable Output<List<ConnectionProjectArgs>> projects) {
            $.projects = projects;
            return this;
        }

        /**
         * @param projects Project information
         * 
         * @return builder
         * 
         */
        public Builder projects(List<ConnectionProjectArgs> projects) {
            return projects(Output.of(projects));
        }

        /**
         * @param projects Project information
         * 
         * @return builder
         * 
         */
        public Builder projects(ConnectionProjectArgs... projects) {
            return projects(List.of(projects));
        }

        /**
         * @param redundancies Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancies(@Nullable Output<List<ConnectionRedundancyArgs>> redundancies) {
            $.redundancies = redundancies;
            return this;
        }

        /**
         * @param redundancies Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancies(List<ConnectionRedundancyArgs> redundancies) {
            return redundancies(Output.of(redundancies));
        }

        /**
         * @param redundancies Redundancy Information
         * 
         * @return builder
         * 
         */
        public Builder redundancies(ConnectionRedundancyArgs... redundancies) {
            return redundancies(List.of(redundancies));
        }

        /**
         * @param state Connection overall state
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Connection overall state
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ConnectionType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ConnectionType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
         * 
         * @return builder
         * 
         */
        public Builder type(ConnectionType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param zSides Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSides(@Nullable Output<List<ConnectionZSideArgs>> zSides) {
            $.zSides = zSides;
            return this;
        }

        /**
         * @param zSides Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSides(List<ConnectionZSideArgs> zSides) {
            return zSides(Output.of(zSides));
        }

        /**
         * @param zSides Destination or Provider side connection configuration object of the multi-segment connection
         * 
         * @return builder
         * 
         */
        public Builder zSides(ConnectionZSideArgs... zSides) {
            return zSides(List.of(zSides));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
