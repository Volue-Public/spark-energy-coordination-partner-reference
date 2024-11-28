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
    /// EnergyUsageReportPayload
    /// </summary>
    [DataContract(Name = "EnergyUsageReportPayload")]
    [JsonConverter(typeof(JsonSubtypes), "PayloadType")]
    public partial class EnergyUsageReportPayload : SparkReportPayload, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnergyUsageReportPayload" /> class.
        /// </summary>
        /// <param name="resourceId">resourceId.</param>
        /// <param name="locationId">locationId.</param>
        /// <param name="meterPointId">meterPointId.</param>
        /// <param name="points">points.</param>
        /// <param name="resolution">resolution.</param>
        /// <param name="curvePoints">curvePoints.</param>
        /// <param name="payloadType">payloadType (default to SparkReportPayloadType.EnergyUsage).</param>
        public EnergyUsageReportPayload(
            string resourceId = default(string),
            string locationId = default(string),
            string meterPointId = default(string),
            List<EnergyCurvePoint> points = default(List<EnergyCurvePoint>),
            string resolution = default(string),
            List<EnergyCurvePoint> curvePoints = default(List<EnergyCurvePoint>),
            SparkReportPayloadType? payloadType = SparkReportPayloadType.EnergyUsage
        )
            : base(payloadType)
        {
            this.ResourceId = resourceId;
            this.LocationId = locationId;
            this.MeterPointId = meterPointId;
            this.Points = points;
            this.Resolution = resolution;
            this.CurvePoints = curvePoints;
        }

        /// <summary>
        /// Gets or Sets ResourceId
        /// </summary>
        [DataMember(Name = "resourceId", EmitDefaultValue = false)]
        public string ResourceId { get; set; }

        /// <summary>
        /// Gets or Sets LocationId
        /// </summary>
        [DataMember(Name = "locationId", EmitDefaultValue = true)]
        public string LocationId { get; set; }

        /// <summary>
        /// Gets or Sets MeterPointId
        /// </summary>
        [DataMember(Name = "meterPointId", EmitDefaultValue = true)]
        public string MeterPointId { get; set; }

        /// <summary>
        /// Gets or Sets Points
        /// </summary>
        [DataMember(Name = "points", EmitDefaultValue = false)]
        public List<EnergyCurvePoint> Points { get; set; }

        /// <summary>
        /// Gets or Sets Resolution
        /// </summary>
        /// <example>02:00:00</example>
        [DataMember(Name = "resolution", EmitDefaultValue = false)]
        public string Resolution { get; set; }

        /// <summary>
        /// Gets or Sets CurvePoints
        /// </summary>
        [DataMember(Name = "curvePoints", EmitDefaultValue = true)]
        [Obsolete]
        public List<EnergyCurvePoint> CurvePoints { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EnergyUsageReportPayload {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  ResourceId: ").Append(ResourceId).Append("\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  MeterPointId: ").Append(MeterPointId).Append("\n");
            sb.Append("  Points: ").Append(Points).Append("\n");
            sb.Append("  Resolution: ").Append(Resolution).Append("\n");
            sb.Append("  CurvePoints: ").Append(CurvePoints).Append("\n");
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