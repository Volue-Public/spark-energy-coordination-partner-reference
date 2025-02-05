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
    ///
    /// </summary>
    [DataContract]
    public partial class PriceCurvePoint : IEquatable<PriceCurvePoint>
    {
        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", EmitDefaultValue = true)]
        public double Price { get; set; }

        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name = "timestamp", EmitDefaultValue = true)]
        public DateTimeOffset Timestamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PriceCurvePoint {\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PriceCurvePoint)obj);
        }

        /// <summary>
        /// Returns true if PriceCurvePoint instances are equal
        /// </summary>
        /// <param name="other">Instance of PriceCurvePoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PriceCurvePoint other)
        {
            if (other is null)
                return false;
            if (ReferenceEquals(this, other))
                return true;

            return (Price == other.Price || Price.Equals(other.Price))
                && (Timestamp == other.Timestamp || Timestamp.Equals(other.Timestamp));
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

                hashCode = hashCode * 59 + Price.GetHashCode();

                hashCode = hashCode * 59 + Timestamp.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
#pragma warning disable 1591

        public static bool operator ==(PriceCurvePoint left, PriceCurvePoint right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PriceCurvePoint left, PriceCurvePoint right)
        {
            return !Equals(left, right);
        }

#pragma warning restore 1591
        #endregion Operators
    }
}
