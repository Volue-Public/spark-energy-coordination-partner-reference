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
    /// LPCLocation
    /// </summary>
    [DataContract(Name = "LPCLocation")]
    public partial class LPCLocation : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LPCLocation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LPCLocation() { }

        /// <summary>
        /// Initializes a new instance of the <see cref="LPCLocation" /> class.
        /// </summary>
        /// <param name="locationId">locationId (required).</param>
        /// <param name="meterPointId">meterPointId (required).</param>
        public LPCLocation(
            string locationId = default(string),
            string meterPointId = default(string)
        )
        {
            // to ensure "locationId" is required (not null)
            if (locationId == null)
            {
                throw new ArgumentNullException(
                    "locationId is a required property for LPCLocation and cannot be null"
                );
            }
            this.LocationId = locationId;
            // to ensure "meterPointId" is required (not null)
            if (meterPointId == null)
            {
                throw new ArgumentNullException(
                    "meterPointId is a required property for LPCLocation and cannot be null"
                );
            }
            this.MeterPointId = meterPointId;
        }

        /// <summary>
        /// Gets or Sets LocationId
        /// </summary>
        [DataMember(Name = "locationId", IsRequired = true, EmitDefaultValue = true)]
        public string LocationId { get; set; }

        /// <summary>
        /// Gets or Sets MeterPointId
        /// </summary>
        [DataMember(Name = "meterPointId", IsRequired = true, EmitDefaultValue = true)]
        public string MeterPointId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LPCLocation {\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  MeterPointId: ").Append(MeterPointId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(
                this,
                Newtonsoft.Json.Formatting.Indented
            );
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(
            ValidationContext validationContext
        )
        {
            yield break;
        }
    }
}
