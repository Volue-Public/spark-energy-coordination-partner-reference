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
    /// GetUserCompensationForCurrentMonthResponse
    /// </summary>
    [DataContract(Name = "GetUserCompensationForCurrentMonthResponse")]
    public partial class GetUserCompensationForCurrentMonthResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetUserCompensationForCurrentMonthResponse" /> class.
        /// </summary>
        /// <param name="userId">userId.</param>
        /// <param name="period">period.</param>
        /// <param name="locationCompensations">locationCompensations.</param>
        public GetUserCompensationForCurrentMonthResponse(
            string userId = default(string),
            Period period = default(Period),
            List<LocationCompensation> locationCompensations = default(List<LocationCompensation>)
        )
        {
            this.UserId = userId;
            this.Period = period;
            this.LocationCompensations = locationCompensations;
        }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name = "userId", EmitDefaultValue = false)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets Period
        /// </summary>
        [DataMember(Name = "period", EmitDefaultValue = false)]
        public Period Period { get; set; }

        /// <summary>
        /// Gets or Sets LocationCompensations
        /// </summary>
        [DataMember(Name = "locationCompensations", EmitDefaultValue = false)]
        public List<LocationCompensation> LocationCompensations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetUserCompensationForCurrentMonthResponse {\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  Period: ").Append(Period).Append("\n");
            sb.Append("  LocationCompensations: ").Append(LocationCompensations).Append("\n");
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