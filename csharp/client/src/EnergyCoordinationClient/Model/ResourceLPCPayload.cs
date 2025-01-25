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
    /// ResourceLPCPayload
    /// </summary>
    [DataContract(Name = "ResourceLPCPayload")]
    [JsonConverter(typeof(JsonSubtypes), "PayloadType")]
    public partial class ResourceLPCPayload : SparkEventPayload, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ResourceLPCPayload" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ResourceLPCPayload() { }

        /// <summary>
        /// Initializes a new instance of the <see cref="ResourceLPCPayload" /> class.
        /// </summary>
        /// <param name="targets">targets (required).</param>
        /// <param name="payloadType">payloadType (required) (default to SparkEventPayloadType.ResourceLPC).</param>
        public ResourceLPCPayload(
            List<ResourceLPCTarget> targets = default(List<ResourceLPCTarget>),
            SparkEventPayloadType payloadType = SparkEventPayloadType.ResourceLPC
        )
            : base(payloadType)
        {
            // to ensure "targets" is required (not null)
            if (targets == null)
            {
                throw new ArgumentNullException(
                    "targets is a required property for ResourceLPCPayload and cannot be null"
                );
            }
            this.Targets = targets;
        }

        /// <summary>
        /// Gets or Sets Targets
        /// </summary>
        [DataMember(Name = "targets", IsRequired = true, EmitDefaultValue = true)]
        public List<ResourceLPCTarget> Targets { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResourceLPCPayload {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Targets: ").Append(Targets).Append("\n");
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
