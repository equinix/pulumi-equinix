// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal
{
    public static class GetHardwareReservation
    {
        /// <summary>
        /// Use this data source to retrieve a [hardware reservation resource from Equinix Metal](https://metal.equinix.com/developers/docs/deploy/reserved/).
        /// 
        /// You can look up hardware reservation by its ID or by ID of device which occupies it.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetHardwareReservation.Invoke(new()
        ///     {
        ///         Id = "4347e805-eb46-4699-9eb9-5c116e6a0172",
        ///     });
        /// 
        ///     var exampleByDeviceId = Equinix.Metal.GetHardwareReservation.Invoke(new()
        ///     {
        ///         DeviceId = "ff85aa58-c106-4624-8f1c-7c64554047ea",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetHardwareReservationResult> InvokeAsync(GetHardwareReservationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHardwareReservationResult>("equinix:metal/getHardwareReservation:getHardwareReservation", args ?? new GetHardwareReservationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a [hardware reservation resource from Equinix Metal](https://metal.equinix.com/developers/docs/deploy/reserved/).
        /// 
        /// You can look up hardware reservation by its ID or by ID of device which occupies it.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetHardwareReservation.Invoke(new()
        ///     {
        ///         Id = "4347e805-eb46-4699-9eb9-5c116e6a0172",
        ///     });
        /// 
        ///     var exampleByDeviceId = Equinix.Metal.GetHardwareReservation.Invoke(new()
        ///     {
        ///         DeviceId = "ff85aa58-c106-4624-8f1c-7c64554047ea",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetHardwareReservationResult> Invoke(GetHardwareReservationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHardwareReservationResult>("equinix:metal/getHardwareReservation:getHardwareReservation", args ?? new GetHardwareReservationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a [hardware reservation resource from Equinix Metal](https://metal.equinix.com/developers/docs/deploy/reserved/).
        /// 
        /// You can look up hardware reservation by its ID or by ID of device which occupies it.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Equinix.Metal.GetHardwareReservation.Invoke(new()
        ///     {
        ///         Id = "4347e805-eb46-4699-9eb9-5c116e6a0172",
        ///     });
        /// 
        ///     var exampleByDeviceId = Equinix.Metal.GetHardwareReservation.Invoke(new()
        ///     {
        ///         DeviceId = "ff85aa58-c106-4624-8f1c-7c64554047ea",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetHardwareReservationResult> Invoke(GetHardwareReservationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetHardwareReservationResult>("equinix:metal/getHardwareReservation:getHardwareReservation", args ?? new GetHardwareReservationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHardwareReservationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of device occupying the reservation.
        /// </summary>
        [Input("deviceId")]
        public string? DeviceId { get; set; }

        /// <summary>
        /// ID of the hardware reservation.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetHardwareReservationArgs()
        {
        }
        public static new GetHardwareReservationArgs Empty => new GetHardwareReservationArgs();
    }

    public sealed class GetHardwareReservationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of device occupying the reservation.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// ID of the hardware reservation.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetHardwareReservationInvokeArgs()
        {
        }
        public static new GetHardwareReservationInvokeArgs Empty => new GetHardwareReservationInvokeArgs();
    }


    [OutputType]
    public sealed class GetHardwareReservationResult
    {
        /// <summary>
        /// UUID of device occupying the reservation.
        /// </summary>
        public readonly string DeviceId;
        /// <summary>
        /// (**Deprecated**) Facility for the reservation. Use metro instead; read the facility to metro migration guide
        /// </summary>
        public readonly string Facility;
        /// <summary>
        /// ID of the hardware reservation to look up.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Plan type for the reservation.
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// UUID of project this reservation is scoped to.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Flag indicating whether the reserved server is provisionable or not. Spare devices can't be provisioned unless they are activated first.
        /// </summary>
        public readonly bool Provisionable;
        /// <summary>
        /// Reservation short ID.
        /// </summary>
        public readonly string ShortId;
        /// <summary>
        /// Flag indicating whether the Hardware Reservation is a spare. Spare Hardware Reservations are used when a Hardware Reservations requires service from Metal Equinix.
        /// </summary>
        public readonly bool Spare;
        /// <summary>
        /// Switch short ID, can be used to determine if two devices are connected to the same switch.
        /// </summary>
        public readonly string SwitchUuid;

        [OutputConstructor]
        private GetHardwareReservationResult(
            string deviceId,

            string facility,

            string id,

            string plan,

            string projectId,

            bool provisionable,

            string shortId,

            bool spare,

            string switchUuid)
        {
            DeviceId = deviceId;
            Facility = facility;
            Id = id;
            Plan = plan;
            ProjectId = projectId;
            Provisionable = provisionable;
            ShortId = shortId;
            Spare = spare;
            SwitchUuid = switchUuid;
        }
    }
}
