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
using JsonSubTypes;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using OpenAPIDateConverter = EnergyCoordinationClient.Client.OpenAPIDateConverter;

namespace EnergyCoordinationClient.Model
{
    /// <summary>
    /// SparkReportPayload
    /// </summary>
    [DataContract(Name = "SparkReportPayload")]
    [JsonConverter(typeof(JsonSubtypes), "PayloadType")]
    [JsonSubtypes.KnownSubType(typeof(EnergyUsageReportPayload), "EnergyUsage")]
    [JsonSubtypes.KnownSubType(typeof(LocationEnergyUsageReportPayload), "LocationEnergyUsage")]
    [JsonSubtypes.KnownSubType(
        typeof(LocationLPCAcknowledgmentReportPayload),
        "LocationLPCAcknowledgement"
    )]
    [JsonSubtypes.KnownSubType(
        typeof(ResourceLPCAcknowledgmentReportPayload),
        "ResourceLPCAcknowledgement"
    )]
    public partial class SparkReportPayload : IValidatableObject
    {
        /// <summary>
        /// Gets or Sets PayloadType
        /// </summary>
        [DataMember(Name = "payloadType", EmitDefaultValue = false)]
        public SparkReportPayloadType? PayloadType { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="SparkReportPayload" /> class.
        /// </summary>
        /// <param name="payloadType">payloadType.</param>
        public SparkReportPayload(
            SparkReportPayloadType? payloadType = default(SparkReportPayloadType?)
        )
        {
            this.PayloadType = payloadType;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SparkReportPayload {\n");
            sb.Append("  PayloadType: ").Append(PayloadType).Append("\n");
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
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
