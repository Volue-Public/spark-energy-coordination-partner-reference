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
    /// PriceCurvePayload
    /// </summary>
    [DataContract(Name = "PriceCurvePayload")]
    [JsonConverter(typeof(JsonSubtypes), "PayloadType")]
    public partial class PriceCurvePayload : SparkEventPayload, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets PriceArea
        /// </summary>
        [DataMember(Name = "priceArea", EmitDefaultValue = false)]
        public PriceArea? PriceArea { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="PriceCurvePayload" /> class.
        /// </summary>
        /// <param name="targets">targets.</param>
        /// <param name="priceCurveDelta">priceCurveDelta.</param>
        /// <param name="priceArea">priceArea.</param>
        /// <param name="payloadType">payloadType (default to SparkEventPayloadType.PriceCurve).</param>
        public PriceCurvePayload(
            List<PriceCurveTarget> targets = default(List<PriceCurveTarget>),
            PriceCurve priceCurveDelta = default(PriceCurve),
            PriceArea? priceArea = default(PriceArea?),
            SparkEventPayloadType? payloadType = SparkEventPayloadType.PriceCurve
        )
            : base(payloadType)
        {
            this.Targets = targets;
            this.PriceCurveDelta = priceCurveDelta;
            this.PriceArea = priceArea;
        }

        /// <summary>
        /// Gets or Sets Targets
        /// </summary>
        [DataMember(Name = "targets", EmitDefaultValue = false)]
        public List<PriceCurveTarget> Targets { get; set; }

        /// <summary>
        /// Gets or Sets PriceCurveDelta
        /// </summary>
        [DataMember(Name = "priceCurveDelta", EmitDefaultValue = false)]
        public PriceCurve PriceCurveDelta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PriceCurvePayload {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Targets: ").Append(Targets).Append("\n");
            sb.Append("  PriceCurveDelta: ").Append(PriceCurveDelta).Append("\n");
            sb.Append("  PriceArea: ").Append(PriceArea).Append("\n");
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
