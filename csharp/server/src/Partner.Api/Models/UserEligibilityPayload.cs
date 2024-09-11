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
    public partial class UserEligibilityPayload
        : SparkEventPayload,
            IEquatable<UserEligibilityPayload>
    {
        /// <summary>
        /// Gets or Sets LastUpdated
        /// </summary>
        [DataMember(Name = "lastUpdated", EmitDefaultValue = true)]
        public DateTimeOffset LastUpdated { get; set; }

        /// <summary>
        /// Gets or Sets AddedUsers
        /// </summary>
        [DataMember(Name = "addedUsers", EmitDefaultValue = false)]
        public List<string> AddedUsers { get; set; }

        /// <summary>
        /// Gets or Sets RemovedUsers
        /// </summary>
        [DataMember(Name = "removedUsers", EmitDefaultValue = false)]
        public List<string> RemovedUsers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UserEligibilityPayload {\n");
            sb.Append("  LastUpdated: ").Append(LastUpdated).Append("\n");
            sb.Append("  AddedUsers: ").Append(AddedUsers).Append("\n");
            sb.Append("  RemovedUsers: ").Append(RemovedUsers).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public new string ToJson()
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
            return obj.GetType() == GetType() && Equals((UserEligibilityPayload)obj);
        }

        /// <summary>
        /// Returns true if UserEligibilityPayload instances are equal
        /// </summary>
        /// <param name="other">Instance of UserEligibilityPayload to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserEligibilityPayload other)
        {
            if (other is null)
                return false;
            if (ReferenceEquals(this, other))
                return true;

            return (LastUpdated == other.LastUpdated || LastUpdated.Equals(other.LastUpdated))
                && (
                    AddedUsers == other.AddedUsers
                    || AddedUsers != null
                        && other.AddedUsers != null
                        && AddedUsers.SequenceEqual(other.AddedUsers)
                )
                && (
                    RemovedUsers == other.RemovedUsers
                    || RemovedUsers != null
                        && other.RemovedUsers != null
                        && RemovedUsers.SequenceEqual(other.RemovedUsers)
                );
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

                hashCode = hashCode * 59 + LastUpdated.GetHashCode();
                if (AddedUsers != null)
                    hashCode = hashCode * 59 + AddedUsers.GetHashCode();
                if (RemovedUsers != null)
                    hashCode = hashCode * 59 + RemovedUsers.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
#pragma warning disable 1591

        public static bool operator ==(UserEligibilityPayload left, UserEligibilityPayload right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(UserEligibilityPayload left, UserEligibilityPayload right)
        {
            return !Equals(left, right);
        }

#pragma warning restore 1591
        #endregion Operators
    }
}
