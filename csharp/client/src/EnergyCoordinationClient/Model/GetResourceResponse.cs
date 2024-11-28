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
    /// GetResourceResponse
    /// </summary>
    [DataContract(Name = "GetResourceResponse")]
    public partial class GetResourceResponse : IValidatableObject
    {
        /// <summary>
        /// Gets or Sets ResourceType
        /// </summary>
        [DataMember(Name = "resourceType", EmitDefaultValue = false)]
        public ResourceType? ResourceType { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="GetResourceResponse" /> class.
        /// </summary>
        /// <param name="resourceId">resourceId.</param>
        /// <param name="resourceType">resourceType.</param>
        /// <param name="userId">userId.</param>
        /// <param name="locationId">locationId.</param>
        /// <param name="meterPointId">meterPointId.</param>
        public GetResourceResponse(
            string resourceId = default(string),
            ResourceType? resourceType = default(ResourceType?),
            string userId = default(string),
            string locationId = default(string),
            string meterPointId = default(string)
        )
        {
            this.ResourceId = resourceId;
            this.ResourceType = resourceType;
            this.UserId = userId;
            this.LocationId = locationId;
            this.MeterPointId = meterPointId;
        }

        /// <summary>
        /// Gets or Sets ResourceId
        /// </summary>
        [DataMember(Name = "resourceId", EmitDefaultValue = false)]
        public string ResourceId { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name = "userId", EmitDefaultValue = false)]
        public string UserId { get; set; }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetResourceResponse {\n");
            sb.Append("  ResourceId: ").Append(ResourceId).Append("\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  LocationId: ").Append(LocationId).Append("\n");
            sb.Append("  MeterPointId: ").Append(MeterPointId).Append("\n");
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