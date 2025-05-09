/*
 * Energy Coordination API - Partner Endpoints
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using EnergyCoordinationClient.Client;
using EnergyCoordinationClient.Model;

namespace EnergyCoordinationClient.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEventsApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get All Events
        /// </summary>
        /// <remarks>
        /// Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetEventsResponse</returns>
        GetEventsResponse GetAllEvents(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0
        );

        /// <summary>
        /// Get All Events
        /// </summary>
        /// <remarks>
        /// Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetEventsResponse</returns>
        ApiResponse<GetEventsResponse> GetAllEventsWithHttpInfo(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0
        );

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetEventResponse</returns>
        GetEventResponse GetEventById(string eventId, int operationIndex = 0);

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetEventResponse</returns>
        ApiResponse<GetEventResponse> GetEventByIdWithHttpInfo(
            string eventId,
            int operationIndex = 0
        );
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEventsApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get All Events
        /// </summary>
        /// <remarks>
        /// Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetEventsResponse</returns>
        System.Threading.Tasks.Task<GetEventsResponse> GetAllEventsAsync(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Get All Events
        /// </summary>
        /// <remarks>
        /// Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetEventsResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetEventsResponse>> GetAllEventsWithHttpInfoAsync(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetEventResponse</returns>
        System.Threading.Tasks.Task<GetEventResponse> GetEventByIdAsync(
            string eventId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetEventResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<GetEventResponse>> GetEventByIdWithHttpInfoAsync(
            string eventId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEventsApi : IEventsApiSync, IEventsApiAsync { }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class EventsApi : IEventsApi
    {
        private EnergyCoordinationClient.Client.ExceptionFactory _exceptionFactory = (
            name,
            response
        ) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EventsApi()
            : this((string)null) { }

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EventsApi(string basePath)
        {
            this.Configuration = EnergyCoordinationClient.Client.Configuration.MergeConfigurations(
                EnergyCoordinationClient.Client.GlobalConfiguration.Instance,
                new EnergyCoordinationClient.Client.Configuration { BasePath = basePath }
            );
            this.Client = new EnergyCoordinationClient.Client.ApiClient(
                this.Configuration.BasePath
            );
            this.AsynchronousClient = new EnergyCoordinationClient.Client.ApiClient(
                this.Configuration.BasePath
            );
            this.ExceptionFactory = EnergyCoordinationClient
                .Client
                .Configuration
                .DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public EventsApi(EnergyCoordinationClient.Client.Configuration configuration)
        {
            if (configuration == null)
                throw new ArgumentNullException("configuration");

            this.Configuration = EnergyCoordinationClient.Client.Configuration.MergeConfigurations(
                EnergyCoordinationClient.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new EnergyCoordinationClient.Client.ApiClient(
                this.Configuration.BasePath
            );
            this.AsynchronousClient = new EnergyCoordinationClient.Client.ApiClient(
                this.Configuration.BasePath
            );
            ExceptionFactory = EnergyCoordinationClient
                .Client
                .Configuration
                .DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EventsApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public EventsApi(
            EnergyCoordinationClient.Client.ISynchronousClient client,
            EnergyCoordinationClient.Client.IAsynchronousClient asyncClient,
            EnergyCoordinationClient.Client.IReadableConfiguration configuration
        )
        {
            if (client == null)
                throw new ArgumentNullException("client");
            if (asyncClient == null)
                throw new ArgumentNullException("asyncClient");
            if (configuration == null)
                throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = EnergyCoordinationClient
                .Client
                .Configuration
                .DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public EnergyCoordinationClient.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public EnergyCoordinationClient.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public EnergyCoordinationClient.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public EnergyCoordinationClient.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException(
                        "Multicast delegate for ExceptionFactory is unsupported."
                    );
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetEventsResponse</returns>
        public GetEventsResponse GetAllEvents(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0
        )
        {
            EnergyCoordinationClient.Client.ApiResponse<GetEventsResponse> localVarResponse =
                GetAllEventsWithHttpInfo(page, pageSize);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetEventsResponse</returns>
        public EnergyCoordinationClient.Client.ApiResponse<GetEventsResponse> GetAllEventsWithHttpInfo(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0
        )
        {
            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { };

            // to determine the Accept header
            string[] _accepts = new string[] { "application/json", "application/problem+json" };

            var localVarContentType =
                EnergyCoordinationClient.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            var localVarMultipartFormData = localVarContentType == "multipart/form-data";
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = EnergyCoordinationClient.Client.ClientUtils.SelectHeaderAccept(
                _accepts
            );
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (page != null)
            {
                localVarRequestOptions.QueryParameters.Add(
                    EnergyCoordinationClient.Client.ClientUtils.ParameterToMultiMap(
                        "",
                        "page",
                        page
                    )
                );
            }
            if (pageSize != null)
            {
                localVarRequestOptions.QueryParameters.Add(
                    EnergyCoordinationClient.Client.ClientUtils.ParameterToMultiMap(
                        "",
                        "pageSize",
                        pageSize
                    )
                );
            }

            localVarRequestOptions.Operation = "EventsApi.GetAllEvents";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (Bearer) required
            // bearer authentication required
            if (
                !string.IsNullOrEmpty(this.Configuration.AccessToken)
                && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization")
            )
            {
                localVarRequestOptions.HeaderParameters.Add(
                    "Authorization",
                    "Bearer " + this.Configuration.AccessToken
                );
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<GetEventsResponse>(
                "/events",
                localVarRequestOptions,
                this.Configuration
            );
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllEvents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetEventsResponse</returns>
        public async System.Threading.Tasks.Task<GetEventsResponse> GetAllEventsAsync(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            EnergyCoordinationClient.Client.ApiResponse<GetEventsResponse> localVarResponse =
                await GetAllEventsWithHttpInfoAsync(
                        page,
                        pageSize,
                        operationIndex,
                        cancellationToken
                    )
                    .ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="page"> (optional)</param>
        /// <param name="pageSize"> (optional)</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetEventsResponse)</returns>
        public async System.Threading.Tasks.Task<EnergyCoordinationClient.Client.ApiResponse<GetEventsResponse>> GetAllEventsWithHttpInfoAsync(
            int? page = default(int?),
            int? pageSize = default(int?),
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { };

            // to determine the Accept header
            string[] _accepts = new string[] { "application/json", "application/problem+json" };

            var localVarContentType =
                EnergyCoordinationClient.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = EnergyCoordinationClient.Client.ClientUtils.SelectHeaderAccept(
                _accepts
            );
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (page != null)
            {
                localVarRequestOptions.QueryParameters.Add(
                    EnergyCoordinationClient.Client.ClientUtils.ParameterToMultiMap(
                        "",
                        "page",
                        page
                    )
                );
            }
            if (pageSize != null)
            {
                localVarRequestOptions.QueryParameters.Add(
                    EnergyCoordinationClient.Client.ClientUtils.ParameterToMultiMap(
                        "",
                        "pageSize",
                        pageSize
                    )
                );
            }

            localVarRequestOptions.Operation = "EventsApi.GetAllEvents";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (Bearer) required
            // bearer authentication required
            if (
                !string.IsNullOrEmpty(this.Configuration.AccessToken)
                && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization")
            )
            {
                localVarRequestOptions.HeaderParameters.Add(
                    "Authorization",
                    "Bearer " + this.Configuration.AccessToken
                );
            }

            // make the HTTP request
            var localVarResponse = await this
                .AsynchronousClient.GetAsync<GetEventsResponse>(
                    "/events",
                    localVarRequestOptions,
                    this.Configuration,
                    cancellationToken
                )
                .ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetAllEvents", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetEventResponse</returns>
        public GetEventResponse GetEventById(string eventId, int operationIndex = 0)
        {
            EnergyCoordinationClient.Client.ApiResponse<GetEventResponse> localVarResponse =
                GetEventByIdWithHttpInfo(eventId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetEventResponse</returns>
        public EnergyCoordinationClient.Client.ApiResponse<GetEventResponse> GetEventByIdWithHttpInfo(
            string eventId,
            int operationIndex = 0
        )
        {
            // verify the required parameter 'eventId' is set
            if (eventId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'eventId' when calling EventsApi->GetEventById"
                );
            }

            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { };

            // to determine the Accept header
            string[] _accepts = new string[] { "application/json", "application/problem+json" };

            var localVarContentType =
                EnergyCoordinationClient.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            var localVarMultipartFormData = localVarContentType == "multipart/form-data";
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = EnergyCoordinationClient.Client.ClientUtils.SelectHeaderAccept(
                _accepts
            );
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add(
                "eventId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(eventId)
            ); // path parameter

            localVarRequestOptions.Operation = "EventsApi.GetEventById";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (Bearer) required
            // bearer authentication required
            if (
                !string.IsNullOrEmpty(this.Configuration.AccessToken)
                && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization")
            )
            {
                localVarRequestOptions.HeaderParameters.Add(
                    "Authorization",
                    "Bearer " + this.Configuration.AccessToken
                );
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<GetEventResponse>(
                "/events/{eventId}",
                localVarRequestOptions,
                this.Configuration
            );
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetEventById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetEventResponse</returns>
        public async System.Threading.Tasks.Task<GetEventResponse> GetEventByIdAsync(
            string eventId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            EnergyCoordinationClient.Client.ApiResponse<GetEventResponse> localVarResponse =
                await GetEventByIdWithHttpInfoAsync(eventId, operationIndex, cancellationToken)
                    .ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Event By Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="eventId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetEventResponse)</returns>
        public async System.Threading.Tasks.Task<EnergyCoordinationClient.Client.ApiResponse<GetEventResponse>> GetEventByIdWithHttpInfoAsync(
            string eventId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            // verify the required parameter 'eventId' is set
            if (eventId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'eventId' when calling EventsApi->GetEventById"
                );
            }

            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { };

            // to determine the Accept header
            string[] _accepts = new string[] { "application/json", "application/problem+json" };

            var localVarContentType =
                EnergyCoordinationClient.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = EnergyCoordinationClient.Client.ClientUtils.SelectHeaderAccept(
                _accepts
            );
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add(
                "eventId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(eventId)
            ); // path parameter

            localVarRequestOptions.Operation = "EventsApi.GetEventById";
            localVarRequestOptions.OperationIndex = operationIndex;

            // authentication (Bearer) required
            // bearer authentication required
            if (
                !string.IsNullOrEmpty(this.Configuration.AccessToken)
                && !localVarRequestOptions.HeaderParameters.ContainsKey("Authorization")
            )
            {
                localVarRequestOptions.HeaderParameters.Add(
                    "Authorization",
                    "Bearer " + this.Configuration.AccessToken
                );
            }

            // make the HTTP request
            var localVarResponse = await this
                .AsynchronousClient.GetAsync<GetEventResponse>(
                    "/events/{eventId}",
                    localVarRequestOptions,
                    this.Configuration,
                    cancellationToken
                )
                .ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetEventById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }
    }
}
