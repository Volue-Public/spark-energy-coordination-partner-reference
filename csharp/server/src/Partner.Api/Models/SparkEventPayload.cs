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
using JsonSubTypes;
using Partner.Api.Converters;
using Swashbuckle.AspNetCore.Annotations;

namespace Partner.Api.Models
{
    /// <summary>
    ///
    /// </summary>
    [DataContract]
    [SwaggerDiscriminator("PayloadType")]
    [JsonSubtypes.KnownSubType(typeof(LocationLPCPayload), "LocationLPC")]
    [SwaggerSubType(typeof(LocationLPCPayload), DiscriminatorValue = "LocationLPC")]
    [JsonSubtypes.KnownSubType(typeof(PriceCurvePayload), "PriceCurve")]
    [SwaggerSubType(typeof(PriceCurvePayload), DiscriminatorValue = "PriceCurve")]
    [JsonSubtypes.KnownSubType(typeof(ResourceLPCPayload), "ResourceLPC")]
    [SwaggerSubType(typeof(ResourceLPCPayload), DiscriminatorValue = "ResourceLPC")]
    [JsonSubtypes.KnownSubType(typeof(UserEligibilityPayload), "UserEligibility")]
    [SwaggerSubType(typeof(UserEligibilityPayload), DiscriminatorValue = "UserEligibility")]
    public partial class SparkEventPayload : IEquatable<SparkEventPayload>
    {
        /// <summary>
        /// Gets or Sets PayloadType
        /// </summary>
        [DataMember(Name = "payloadType", EmitDefaultValue = true)]
        public SparkEventPayloadType PayloadType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SparkEventPayload {\n");
            sb.Append("  PayloadType: ").Append(PayloadType).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            var options = new JsonSerializerOptions { WriteIndented = true };

            return JsonSerializer.Serialize(this, options);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null)
                return false;
            if (ReferenceEquals(this, obj))
                return true;
            return obj.GetType() == GetType() && Equals((SparkEventPayload)obj);
        }

        /// <summary>
        /// Returns true if SparkEventPayload instances are equal
        /// </summary>
        /// <param name="other">Instance of SparkEventPayload to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SparkEventPayload other)
        {
            if (other is null)
                return false;
            if (ReferenceEquals(this, other))
                return true;

            return (PayloadType == other.PayloadType || PayloadType.Equals(other.PayloadType));
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)

                hashCode = hashCode * 59 + PayloadType.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
#pragma warning disable 1591

        public static bool operator ==(SparkEventPayload left, SparkEventPayload right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SparkEventPayload left, SparkEventPayload right)
        {
            return !Equals(left, right);
        }

#pragma warning restore 1591
        #endregion Operators
    }
}
