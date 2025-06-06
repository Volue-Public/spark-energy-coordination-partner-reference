/*
 * Energy Coordination API - Partner Endpoints
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.IO;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using OpenAPIDateConverter = EnergyCoordinationClient.Client.OpenAPIDateConverter;

namespace EnergyCoordinationClient.Model
{
    /// <summary>
    /// Defines NotificationType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum NotificationType
    {
        /// <summary>
        /// Enum Unknown for value: Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown,

        /// <summary>
        /// Enum PriceCurveCreated for value: PriceCurveCreated
        /// </summary>
        [EnumMember(Value = "PriceCurveCreated")]
        PriceCurveCreated,

        /// <summary>
        /// Enum UserEligibilityUpdated for value: UserEligibilityUpdated
        /// </summary>
        [EnumMember(Value = "UserEligibilityUpdated")]
        UserEligibilityUpdated,

        /// <summary>
        /// Enum LocationLPCRequested for value: LocationLPCRequested
        /// </summary>
        [EnumMember(Value = "LocationLPCRequested")]
        LocationLPCRequested,

        /// <summary>
        /// Enum ResourceLPCRequested for value: ResourceLPCRequested
        /// </summary>
        [EnumMember(Value = "ResourceLPCRequested")]
        ResourceLPCRequested,

        /// <summary>
        /// Enum LPCReservationCreated for value: LPCReservationCreated
        /// </summary>
        [EnumMember(Value = "LPCReservationCreated")]
        LPCReservationCreated,
    }
}
