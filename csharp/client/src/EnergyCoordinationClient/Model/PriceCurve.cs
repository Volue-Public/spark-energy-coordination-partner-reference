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
    /// PriceCurve
    /// </summary>
    [DataContract(Name = "PriceCurve")]
    public partial class PriceCurve : IValidatableObject
    {
        /// <summary>
        /// Gets or Sets EnergyUnit
        /// </summary>
        [DataMember(Name = "energyUnit", EmitDefaultValue = false)]
        public EnergyUnit? EnergyUnit { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public Currency? Currency { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="PriceCurve" /> class.
        /// </summary>
        /// <param name="points">points.</param>
        /// <param name="energyUnit">energyUnit.</param>
        /// <param name="currency">currency.</param>
        /// <param name="resolution">resolution.</param>
        public PriceCurve(
            List<PriceCurvePoint> points = default(List<PriceCurvePoint>),
            EnergyUnit? energyUnit = default(EnergyUnit?),
            Currency? currency = default(Currency?),
            string resolution = default(string)
        )
        {
            this.Points = points;
            this.EnergyUnit = energyUnit;
            this.Currency = currency;
            this.Resolution = resolution;
        }

        /// <summary>
        /// Gets or Sets Points
        /// </summary>
        [DataMember(Name = "points", EmitDefaultValue = false)]
        public List<PriceCurvePoint> Points { get; set; }

        /// <summary>
        /// Gets or Sets Resolution
        /// </summary>
        /*
        <example>02:00:00</example>
        */
        [DataMember(Name = "resolution", EmitDefaultValue = false)]
        public string Resolution { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PriceCurve {\n");
            sb.Append("  Points: ").Append(Points).Append("\n");
            sb.Append("  EnergyUnit: ").Append(EnergyUnit).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Resolution: ").Append(Resolution).Append("\n");
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
