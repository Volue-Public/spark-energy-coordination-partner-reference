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
    public interface IUserResourcesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get a User&#39;s Resources
        /// </summary>
        /// <remarks>
        /// Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetUserResourcesResponse</returns>
        GetUserResourcesResponse GetResourcesForUser(string userId, int operationIndex = 0);

        /// <summary>
        /// Get a User&#39;s Resources
        /// </summary>
        /// <remarks>
        /// Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetUserResourcesResponse</returns>
        ApiResponse<GetUserResourcesResponse> GetResourcesForUserWithHttpInfo(
            string userId,
            int operationIndex = 0
        );

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns></returns>
        void PostVehicle(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0
        );

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> PostVehicleWithHttpInfo(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0
        );
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUserResourcesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Get a User&#39;s Resources
        /// </summary>
        /// <remarks>
        /// Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetUserResourcesResponse</returns>
        System.Threading.Tasks.Task<GetUserResourcesResponse> GetResourcesForUserAsync(
            string userId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Get a User&#39;s Resources
        /// </summary>
        /// <remarks>
        /// Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetUserResourcesResponse)</returns>
        System.Threading.Tasks.Task<
            ApiResponse<GetUserResourcesResponse>
        > GetResourcesForUserWithHttpInfoAsync(
            string userId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task PostVehicleAsync(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> PostVehicleWithHttpInfoAsync(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUserResourcesApi : IUserResourcesApiSync, IUserResourcesApiAsync { }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class UserResourcesApi : IUserResourcesApi
    {
        private EnergyCoordinationClient.Client.ExceptionFactory _exceptionFactory = (
            name,
            response
        ) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UserResourcesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserResourcesApi()
            : this((string)null) { }

        /// <summary>
        /// Initializes a new instance of the <see cref="UserResourcesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserResourcesApi(string basePath)
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
        /// Initializes a new instance of the <see cref="UserResourcesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UserResourcesApi(EnergyCoordinationClient.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="UserResourcesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public UserResourcesApi(
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
        /// Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetUserResourcesResponse</returns>
        public GetUserResourcesResponse GetResourcesForUser(string userId, int operationIndex = 0)
        {
            EnergyCoordinationClient.Client.ApiResponse<GetUserResourcesResponse> localVarResponse =
                GetResourcesForUserWithHttpInfo(userId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetUserResourcesResponse</returns>
        public EnergyCoordinationClient.Client.ApiResponse<GetUserResourcesResponse> GetResourcesForUserWithHttpInfo(
            string userId,
            int operationIndex = 0
        )
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'userId' when calling UserResourcesApi->GetResourcesForUser"
                );
            }

            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { };

            // to determine the Accept header
            string[] _accepts = new string[] { "application/json" };

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
                "userId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(userId)
            ); // path parameter

            localVarRequestOptions.Operation = "UserResourcesApi.GetResourcesForUser";
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
            var localVarResponse = this.Client.Get<GetUserResourcesResponse>(
                "/users/{userId}/resources",
                localVarRequestOptions,
                this.Configuration
            );
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory(
                    "GetResourcesForUser",
                    localVarResponse
                );
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetUserResourcesResponse</returns>
        public async System.Threading.Tasks.Task<GetUserResourcesResponse> GetResourcesForUserAsync(
            string userId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            EnergyCoordinationClient.Client.ApiResponse<GetUserResourcesResponse> localVarResponse =
                await GetResourcesForUserWithHttpInfoAsync(
                        userId,
                        operationIndex,
                        cancellationToken
                    )
                    .ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound resources and vehicles.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetUserResourcesResponse)</returns>
        public async System.Threading.Tasks.Task<EnergyCoordinationClient.Client.ApiResponse<GetUserResourcesResponse>> GetResourcesForUserWithHttpInfoAsync(
            string userId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'userId' when calling UserResourcesApi->GetResourcesForUser"
                );
            }

            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { };

            // to determine the Accept header
            string[] _accepts = new string[] { "application/json" };

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
                "userId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(userId)
            ); // path parameter

            localVarRequestOptions.Operation = "UserResourcesApi.GetResourcesForUser";
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
                .AsynchronousClient.GetAsync<GetUserResourcesResponse>(
                    "/users/{userId}/resources",
                    localVarRequestOptions,
                    this.Configuration,
                    cancellationToken
                )
                .ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory(
                    "GetResourcesForUser",
                    localVarResponse
                );
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns></returns>
        public void PostVehicle(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0
        )
        {
            PostVehicleWithHttpInfo(userId, postVehicleResourceRequest);
        }

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public EnergyCoordinationClient.Client.ApiResponse<Object> PostVehicleWithHttpInfo(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0
        )
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'userId' when calling UserResourcesApi->PostVehicle"
                );
            }

            // verify the required parameter 'postVehicleResourceRequest' is set
            if (postVehicleResourceRequest == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'postVehicleResourceRequest' when calling UserResourcesApi->PostVehicle"
                );
            }

            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { "application/json" };

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
                "userId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(userId)
            ); // path parameter
            localVarRequestOptions.Data = postVehicleResourceRequest;

            localVarRequestOptions.Operation = "UserResourcesApi.PostVehicle";
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
            var localVarResponse = this.Client.Post<Object>(
                "/users/{userId}/vehicles",
                localVarRequestOptions,
                this.Configuration
            );
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("PostVehicle", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task PostVehicleAsync(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            await PostVehicleWithHttpInfoAsync(
                    userId,
                    postVehicleResourceRequest,
                    operationIndex,
                    cancellationToken
                )
                .ConfigureAwait(false);
        }

        /// <summary>
        /// Create Vehicle Resource
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="userId"></param>
        /// <param name="postVehicleResourceRequest"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<EnergyCoordinationClient.Client.ApiResponse<Object>> PostVehicleWithHttpInfoAsync(
            string userId,
            PostVehicleResourceRequest postVehicleResourceRequest,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            // verify the required parameter 'userId' is set
            if (userId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'userId' when calling UserResourcesApi->PostVehicle"
                );
            }

            // verify the required parameter 'postVehicleResourceRequest' is set
            if (postVehicleResourceRequest == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'postVehicleResourceRequest' when calling UserResourcesApi->PostVehicle"
                );
            }

            EnergyCoordinationClient.Client.RequestOptions localVarRequestOptions =
                new EnergyCoordinationClient.Client.RequestOptions();

            string[] _contentTypes = new string[] { "application/json" };

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
                "userId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(userId)
            ); // path parameter
            localVarRequestOptions.Data = postVehicleResourceRequest;

            localVarRequestOptions.Operation = "UserResourcesApi.PostVehicle";
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
                .AsynchronousClient.PostAsync<Object>(
                    "/users/{userId}/vehicles",
                    localVarRequestOptions,
                    this.Configuration,
                    cancellationToken
                )
                .ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("PostVehicle", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }
    }
}
