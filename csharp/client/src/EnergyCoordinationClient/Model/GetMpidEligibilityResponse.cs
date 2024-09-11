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
    /// GetMpidEligibilityResponse
    /// </summary>
    [DataContract(Name = "GetMpidEligibilityResponse")]
    public partial class GetMpidEligibilityResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetMpidEligibilityResponse" /> class.
        /// </summary>
        /// <param name="meterPointId">meterPointId.</param>
        /// <param name="isEligible">isEligible.</param>
        public GetMpidEligibilityResponse(
            string meterPointId = default(string),
            bool isEligible = default(bool)
        )
        {
            this.MeterPointId = meterPointId;
            this.IsEligible = isEligible;
        }

        /// <summary>
        /// Gets or Sets MeterPointId
        /// </summary>
        [DataMember(Name = "meterPointId", EmitDefaultValue = false)]
        public string MeterPointId { get; set; }

        /// <summary>
        /// Gets or Sets IsEligible
        /// </summary>
        [DataMember(Name = "isEligible", EmitDefaultValue = true)]
        public bool IsEligible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetMpidEligibilityResponse {\n");
            sb.Append("  MeterPointId: ").Append(MeterPointId).Append("\n");
            sb.Append("  IsEligible: ").Append(IsEligible).Append("\n");
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
