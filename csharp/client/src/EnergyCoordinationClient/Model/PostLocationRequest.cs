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
    /// PostLocationRequest
    /// </summary>
    [DataContract(Name = "PostLocationRequest")]
    public partial class PostLocationRequest : IValidatableObject
    {
        /// <summary>
        /// Gets or Sets LocationType
        /// </summary>
        [DataMember(Name = "locationType", EmitDefaultValue = false)]
        public LocationType? LocationType { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="PostLocationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostLocationRequest() { }

        /// <summary>
        /// Initializes a new instance of the <see cref="PostLocationRequest" /> class.
        /// </summary>
        /// <param name="locationId">locationId (required).</param>
        /// <param name="locationType">locationType.</param>
        /// <param name="coordinates">coordinates.</param>
        /// <param name="meterPointId">meterPointId.</param>
        /// <param name="meterPointIds">meterPointIds.</param>
        public PostLocationRequest(
            string locationId = default(string),
            LocationType? locationType = default(LocationType?),
            Coordinate coordinates = default(Coordinate),
            string meterPointId = default(string),
            List<string> meterPointIds = default(List<string>)
        )
        {
            // to ensure "locationId" is required (not null)
            if (locationId == null)
            {
                throw new ArgumentNullException(
                    "locationId is a required property for PostLocationRequest and cannot be null"
                );
            }
            this.LocationId = locationId;
            this.LocationType = locationType;
            this.Coordinates = coordinates;
            this.MeterPointId = meterPointId;
            this.MeterPointIds = meterPointIds;
        }

        /// <summary>
        /// Gets or Sets LocationId
        /// </summary>
        [DataMember(Name = "locationId", IsRequired = true, EmitDefaultValue = true)]
        public string LocationId { get; set; }

        /// <summary>
        /// Gets or Sets Coordinates
        /// </summary>
        [DataMember(Name = "coordinates", EmitDefaultValue = false)]
        public Coordinate Coordinates { get; set; }

        /// <summary>
        /// Gets or Sets MeterPointId
        /// </summary>
        [DataMember(Name = "meterPointId", EmitDefaultValue = true)]
        [Obsolete]
        public string MeterPointId { get; set; }

        /// <summary>
        /// Gets or Sets MeterPointIds
        /// </summary>
        [DataMember(Name = "meterPointIds", EmitDefaultValue = true)]
        public List<string> MeterPointIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostLocationRequest {\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  LocationType: ").Append(LocationType).Append("\n");
            sb.Append("  Coordinates: ").Append(Coordinates).Append("\n");
            sb.Append("  MeterPointId: ").Append(MeterPointId).Append("\n");
            sb.Append("  MeterPointIds: ").Append(MeterPointIds).Append("\n");
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
