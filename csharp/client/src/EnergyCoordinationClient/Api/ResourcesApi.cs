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
    public interface IResourcesApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Delete Resource
        /// </summary>
        /// <remarks>
        /// Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns></returns>
        void DeleteResourceById(string resourceId, int operationIndex = 0);

        /// <summary>
        /// Delete Resource
        /// </summary>
        /// <remarks>
        /// Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteResourceByIdWithHttpInfo(
            string resourceId,
            int operationIndex = 0
        );

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetResourceResponse</returns>
        GetResourceResponse GetResourceById(string resourceId, int operationIndex = 0);

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetResourceResponse</returns>
        ApiResponse<GetResourceResponse> GetResourceByIdWithHttpInfo(
            string resourceId,
            int operationIndex = 0
        );
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IResourcesApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Delete Resource
        /// </summary>
        /// <remarks>
        /// Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteResourceByIdAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Delete Resource
        /// </summary>
        /// <remarks>
        /// Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteResourceByIdWithHttpInfoAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetResourceResponse</returns>
        System.Threading.Tasks.Task<GetResourceResponse> GetResourceByIdAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <remarks>
        ///
        /// </remarks>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetResourceResponse)</returns>
        System.Threading.Tasks.Task<
            ApiResponse<GetResourceResponse>
        > GetResourceByIdWithHttpInfoAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        );
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IResourcesApi : IResourcesApiSync, IResourcesApiAsync { }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ResourcesApi : IResourcesApi
    {
        private EnergyCoordinationClient.Client.ExceptionFactory _exceptionFactory = (
            name,
            response
        ) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ResourcesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ResourcesApi()
            : this((string)null) { }

        /// <summary>
        /// Initializes a new instance of the <see cref="ResourcesApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ResourcesApi(string basePath)
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
        /// Initializes a new instance of the <see cref="ResourcesApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ResourcesApi(EnergyCoordinationClient.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="ResourcesApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ResourcesApi(
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
        /// Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns></returns>
        public void DeleteResourceById(string resourceId, int operationIndex = 0)
        {
            DeleteResourceByIdWithHttpInfo(resourceId);
        }

        /// <summary>
        /// Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public EnergyCoordinationClient.Client.ApiResponse<Object> DeleteResourceByIdWithHttpInfo(
            string resourceId,
            int operationIndex = 0
        )
        {
            // verify the required parameter 'resourceId' is set
            if (resourceId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'resourceId' when calling ResourcesApi->DeleteResourceById"
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
                "resourceId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(resourceId)
            ); // path parameter

            localVarRequestOptions.Operation = "ResourcesApi.DeleteResourceById";
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
            var localVarResponse = this.Client.Delete<Object>(
                "/resources/{resourceId}",
                localVarRequestOptions,
                this.Configuration
            );
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory(
                    "DeleteResourceById",
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
        /// Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteResourceByIdAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            await DeleteResourceByIdWithHttpInfoAsync(resourceId, operationIndex, cancellationToken)
                .ConfigureAwait(false);
        }

        /// <summary>
        /// Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<EnergyCoordinationClient.Client.ApiResponse<Object>> DeleteResourceByIdWithHttpInfoAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            // verify the required parameter 'resourceId' is set
            if (resourceId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'resourceId' when calling ResourcesApi->DeleteResourceById"
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
                "resourceId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(resourceId)
            ); // path parameter

            localVarRequestOptions.Operation = "ResourcesApi.DeleteResourceById";
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
                .AsynchronousClient.DeleteAsync<Object>(
                    "/resources/{resourceId}",
                    localVarRequestOptions,
                    this.Configuration,
                    cancellationToken
                )
                .ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory(
                    "DeleteResourceById",
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
        /// Get Resource by Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>GetResourceResponse</returns>
        public GetResourceResponse GetResourceById(string resourceId, int operationIndex = 0)
        {
            EnergyCoordinationClient.Client.ApiResponse<GetResourceResponse> localVarResponse =
                GetResourceByIdWithHttpInfo(resourceId);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of GetResourceResponse</returns>
        public EnergyCoordinationClient.Client.ApiResponse<GetResourceResponse> GetResourceByIdWithHttpInfo(
            string resourceId,
            int operationIndex = 0
        )
        {
            // verify the required parameter 'resourceId' is set
            if (resourceId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'resourceId' when calling ResourcesApi->GetResourceById"
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
                "resourceId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(resourceId)
            ); // path parameter

            localVarRequestOptions.Operation = "ResourcesApi.GetResourceById";
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
            var localVarResponse = this.Client.Get<GetResourceResponse>(
                "/resources/{resourceId}",
                localVarRequestOptions,
                this.Configuration
            );
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetResourceById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of GetResourceResponse</returns>
        public async System.Threading.Tasks.Task<GetResourceResponse> GetResourceByIdAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            EnergyCoordinationClient.Client.ApiResponse<GetResourceResponse> localVarResponse =
                await GetResourceByIdWithHttpInfoAsync(
                        resourceId,
                        operationIndex,
                        cancellationToken
                    )
                    .ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get Resource by Id
        /// </summary>
        /// <exception cref="EnergyCoordinationClient.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="resourceId"></param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (GetResourceResponse)</returns>
        public async System.Threading.Tasks.Task<EnergyCoordinationClient.Client.ApiResponse<GetResourceResponse>> GetResourceByIdWithHttpInfoAsync(
            string resourceId,
            int operationIndex = 0,
            System.Threading.CancellationToken cancellationToken =
                default(global::System.Threading.CancellationToken)
        )
        {
            // verify the required parameter 'resourceId' is set
            if (resourceId == null)
            {
                throw new EnergyCoordinationClient.Client.ApiException(
                    400,
                    "Missing required parameter 'resourceId' when calling ResourcesApi->GetResourceById"
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
                "resourceId",
                EnergyCoordinationClient.Client.ClientUtils.ParameterToString(resourceId)
            ); // path parameter

            localVarRequestOptions.Operation = "ResourcesApi.GetResourceById";
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
                .AsynchronousClient.GetAsync<GetResourceResponse>(
                    "/resources/{resourceId}",
                    localVarRequestOptions,
                    this.Configuration,
                    cancellationToken
                )
                .ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetResourceById", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }
    }
}