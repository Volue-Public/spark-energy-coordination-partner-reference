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
    /// PriceCurveTarget
    /// </summary>
    [DataContract(Name = "PriceCurveTarget")]
    public partial class PriceCurveTarget : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PriceCurveTarget" /> class.
        /// </summary>
        /// <param name="resourceId">resourceId.</param>
        /// <param name="locationId">locationId.</param>
        public PriceCurveTarget(
            string resourceId = default(string),
            string locationId = default(string)
        )
        {
            this.ResourceId = resourceId;
            this.LocationId = locationId;
        }

        /// <summary>
        /// Gets or Sets ResourceId
        /// </summary>
        [DataMember(Name = "resourceId", EmitDefaultValue = false)]
        public string ResourceId { get; set; }

        /// <summary>
        /// Gets or Sets LocationId
        /// </summary>
        [DataMember(Name = "locationId", EmitDefaultValue = false)]
        public string LocationId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PriceCurveTarget {\n");
            sb.Append("  ResourceId: ").Append(ResourceId).Append("\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
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
