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
    /// ResourceLPCAcknowledgmentReportPayload
    /// </summary>
    [DataContract(Name = "ResourceLPCAcknowledgmentReportPayload")]
    public partial class ResourceLPCAcknowledgmentReportPayload
        : SparkReportPayload,
            IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResourceLPCAcknowledgmentReportPayload" /> class.
        /// </summary>
        /// <param name="acknowledgedTargets">acknowledgedTargets.</param>
        /// <param name="declinedTargets">declinedTargets.</param>
        /// <param name="payloadType">payloadType (default to SparkReportPayloadType.ResourceLPCAcknowledgement).</param>
        public ResourceLPCAcknowledgmentReportPayload(
            List<LPCResource> acknowledgedTargets = default(List<LPCResource>),
            List<LPCResource> declinedTargets = default(List<LPCResource>),
            SparkReportPayloadType? payloadType = SparkReportPayloadType.ResourceLPCAcknowledgement
        )
            : base(payloadType)
        {
            this.AcknowledgedTargets = acknowledgedTargets;
            this.DeclinedTargets = declinedTargets;
        }

        /// <summary>
        /// Gets or Sets AcknowledgedTargets
        /// </summary>
        [DataMember(Name = "acknowledgedTargets", EmitDefaultValue = false)]
        public List<LPCResource> AcknowledgedTargets { get; set; }

        /// <summary>
        /// Gets or Sets DeclinedTargets
        /// </summary>
        [DataMember(Name = "declinedTargets", EmitDefaultValue = false)]
        public List<LPCResource> DeclinedTargets { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResourceLPCAcknowledgmentReportPayload {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  AcknowledgedTargets: ").Append(AcknowledgedTargets).Append("\n");
            sb.Append("  DeclinedTargets: ").Append(DeclinedTargets).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
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
            foreach (var x in base.BaseValidate(validationContext))
            {
                yield return x;
            }
            yield break;
        }
    }
}
