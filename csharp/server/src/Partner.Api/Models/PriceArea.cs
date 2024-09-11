/*
 * Partner webhook API
 *
 * A minimal OpenAPI spec with one POST endpoint to receive notifications from Spark energy-coordination.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Text.Json;
using Partner.Api.Converters;

namespace Partner.Api.Models
{
    /// <summary>
    /// Gets or Sets PriceArea
    /// </summary>

    public enum PriceArea
    {
        /// <summary>
        /// Enum Unknown for Unknown
        /// </summary>
        [EnumMember(Value = "Unknown")]
        Unknown = 1,

        /// <summary>
        /// Enum NO1 for NO1
        /// </summary>
        [EnumMember(Value = "NO1")]
        NO1 = 2,

        /// <summary>
        /// Enum NO2 for NO2
        /// </summary>
        [EnumMember(Value = "NO2")]
        NO2 = 3,

        /// <summary>
        /// Enum NO3 for NO3
        /// </summary>
        [EnumMember(Value = "NO3")]
        NO3 = 4,

        /// <summary>
        /// Enum NO4 for NO4
        /// </summary>
        [EnumMember(Value = "NO4")]
        NO4 = 5,

        /// <summary>
        /// Enum NO5 for NO5
        /// </summary>
        [EnumMember(Value = "NO5")]
        NO5 = 6,

        /// <summary>
        /// Enum FI for FI
        /// </summary>
        [EnumMember(Value = "FI")]
        FI = 7,

        /// <summary>
        /// Enum DK1 for DK1
        /// </summary>
        [EnumMember(Value = "DK1")]
        DK1 = 8,

        /// <summary>
        /// Enum DK2 for DK2
        /// </summary>
        [EnumMember(Value = "DK2")]
        DK2 = 9,

        /// <summary>
        /// Enum SE1 for SE1
        /// </summary>
        [EnumMember(Value = "SE1")]
        SE1 = 10,

        /// <summary>
        /// Enum SE2 for SE2
        /// </summary>
        [EnumMember(Value = "SE2")]
        SE2 = 11,

        /// <summary>
        /// Enum SE3 for SE3
        /// </summary>
        [EnumMember(Value = "SE3")]
        SE3 = 12,

        /// <summary>
        /// Enum SE4 for SE4
        /// </summary>
        [EnumMember(Value = "SE4")]
        SE4 = 13,
    }
}
