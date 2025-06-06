/* tslint:disable */
/* eslint-disable */
/**
 * Energy Coordination API - Partner Endpoints
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  GetWebhookNotificationLogByIdResponse,
  GetWebhookNotificationLogsResponse,
  GetWebhookResponse,
  GetWebhooksResponse,
  HttpValidationProblemDetails,
  PatchWebhookRequest,
  PostWebhookRequest,
  PutWebhookRequest,
} from '../models/index';
import {
    GetWebhookNotificationLogByIdResponseFromJSON,
    GetWebhookNotificationLogByIdResponseToJSON,
    GetWebhookNotificationLogsResponseFromJSON,
    GetWebhookNotificationLogsResponseToJSON,
    GetWebhookResponseFromJSON,
    GetWebhookResponseToJSON,
    GetWebhooksResponseFromJSON,
    GetWebhooksResponseToJSON,
    HttpValidationProblemDetailsFromJSON,
    HttpValidationProblemDetailsToJSON,
    PatchWebhookRequestFromJSON,
    PatchWebhookRequestToJSON,
    PostWebhookRequestFromJSON,
    PostWebhookRequestToJSON,
    PutWebhookRequestFromJSON,
    PutWebhookRequestToJSON,
} from '../models/index';

export interface DeleteWebhookByIdRequest {
    webhookId: string;
}

export interface GetWebhookByIdRequest {
    webhookId: string;
}

export interface GetWebhookNotificationLogByIdRequest {
    notificationId: string;
}

export interface GetWebhookNotificationLogsRequest {
    webhookId?: string;
    page?: number;
    pageSize?: number;
}

export interface PatchWebhookByIdRequest {
    webhookId: string;
    patchWebhookRequest: PatchWebhookRequest;
}

export interface PostWebhookOperationRequest {
    postWebhookRequest: PostWebhookRequest;
}

export interface UpdateWebhookByIdRequest {
    webhookId: string;
    putWebhookRequest: PutWebhookRequest;
}

export interface UpdateWebhookEnabledByIdRequest {
    webhookId: string;
    enabled: boolean;
}

/**
 * 
 */
export class WebhooksApi extends runtime.BaseAPI {

    /**
     * Returns 204 No Content if the webhook was deleted successfully. Returns 404 Not Found if the webhook to delete does not exist.
     * Delete a webhook
     */
    async deleteWebhookByIdRaw(requestParameters: DeleteWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['webhookId'] == null) {
            throw new runtime.RequiredError(
                'webhookId',
                'Required parameter "webhookId" was null or undefined when calling deleteWebhookById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/{webhookId}`.replace(`{${"webhookId"}}`, encodeURIComponent(String(requestParameters['webhookId']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Returns 204 No Content if the webhook was deleted successfully. Returns 404 Not Found if the webhook to delete does not exist.
     * Delete a webhook
     */
    async deleteWebhookById(requestParameters: DeleteWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.deleteWebhookByIdRaw(requestParameters, initOverrides);
    }

    /**
     * Get a Webhook by Id
     */
    async getWebhookByIdRaw(requestParameters: GetWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetWebhookResponse>> {
        if (requestParameters['webhookId'] == null) {
            throw new runtime.RequiredError(
                'webhookId',
                'Required parameter "webhookId" was null or undefined when calling getWebhookById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/{webhookId}`.replace(`{${"webhookId"}}`, encodeURIComponent(String(requestParameters['webhookId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetWebhookResponseFromJSON(jsonValue));
    }

    /**
     * Get a Webhook by Id
     */
    async getWebhookById(requestParameters: GetWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetWebhookResponse> {
        const response = await this.getWebhookByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get a webhook notification log by notification id
     */
    async getWebhookNotificationLogByIdRaw(requestParameters: GetWebhookNotificationLogByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetWebhookNotificationLogByIdResponse>> {
        if (requestParameters['notificationId'] == null) {
            throw new runtime.RequiredError(
                'notificationId',
                'Required parameter "notificationId" was null or undefined when calling getWebhookNotificationLogById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/logs/{notificationId}`.replace(`{${"notificationId"}}`, encodeURIComponent(String(requestParameters['notificationId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetWebhookNotificationLogByIdResponseFromJSON(jsonValue));
    }

    /**
     * Get a webhook notification log by notification id
     */
    async getWebhookNotificationLogById(requestParameters: GetWebhookNotificationLogByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetWebhookNotificationLogByIdResponse> {
        const response = await this.getWebhookNotificationLogByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get all webhook notification logs
     */
    async getWebhookNotificationLogsRaw(requestParameters: GetWebhookNotificationLogsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetWebhookNotificationLogsResponse>> {
        const queryParameters: any = {};

        if (requestParameters['webhookId'] != null) {
            queryParameters['webhookId'] = requestParameters['webhookId'];
        }

        if (requestParameters['page'] != null) {
            queryParameters['page'] = requestParameters['page'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['pageSize'] = requestParameters['pageSize'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/logs`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetWebhookNotificationLogsResponseFromJSON(jsonValue));
    }

    /**
     * Get all webhook notification logs
     */
    async getWebhookNotificationLogs(requestParameters: GetWebhookNotificationLogsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetWebhookNotificationLogsResponse> {
        const response = await this.getWebhookNotificationLogsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get All Webhooks
     */
    async getWebhooksRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetWebhooksResponse>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetWebhooksResponseFromJSON(jsonValue));
    }

    /**
     * Get All Webhooks
     */
    async getWebhooks(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetWebhooksResponse> {
        const response = await this.getWebhooksRaw(initOverrides);
        return await response.value();
    }

    /**
     * Update individual fields of a Webhook
     */
    async patchWebhookByIdRaw(requestParameters: PatchWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetWebhookResponse>> {
        if (requestParameters['webhookId'] == null) {
            throw new runtime.RequiredError(
                'webhookId',
                'Required parameter "webhookId" was null or undefined when calling patchWebhookById().'
            );
        }

        if (requestParameters['patchWebhookRequest'] == null) {
            throw new runtime.RequiredError(
                'patchWebhookRequest',
                'Required parameter "patchWebhookRequest" was null or undefined when calling patchWebhookById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/{webhookId}`.replace(`{${"webhookId"}}`, encodeURIComponent(String(requestParameters['webhookId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: PatchWebhookRequestToJSON(requestParameters['patchWebhookRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetWebhookResponseFromJSON(jsonValue));
    }

    /**
     * Update individual fields of a Webhook
     */
    async patchWebhookById(requestParameters: PatchWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetWebhookResponse> {
        const response = await this.patchWebhookByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Create a Webhook
     */
    async postWebhookRaw(requestParameters: PostWebhookOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['postWebhookRequest'] == null) {
            throw new runtime.RequiredError(
                'postWebhookRequest',
                'Required parameter "postWebhookRequest" was null or undefined when calling postWebhook().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: PostWebhookRequestToJSON(requestParameters['postWebhookRequest']),
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Create a Webhook
     */
    async postWebhook(requestParameters: PostWebhookOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.postWebhookRaw(requestParameters, initOverrides);
    }

    /**
     * Update a Webhook
     */
    async updateWebhookByIdRaw(requestParameters: UpdateWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetWebhookResponse>> {
        if (requestParameters['webhookId'] == null) {
            throw new runtime.RequiredError(
                'webhookId',
                'Required parameter "webhookId" was null or undefined when calling updateWebhookById().'
            );
        }

        if (requestParameters['putWebhookRequest'] == null) {
            throw new runtime.RequiredError(
                'putWebhookRequest',
                'Required parameter "putWebhookRequest" was null or undefined when calling updateWebhookById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/{webhookId}`.replace(`{${"webhookId"}}`, encodeURIComponent(String(requestParameters['webhookId']))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: PutWebhookRequestToJSON(requestParameters['putWebhookRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetWebhookResponseFromJSON(jsonValue));
    }

    /**
     * Update a Webhook
     */
    async updateWebhookById(requestParameters: UpdateWebhookByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetWebhookResponse> {
        const response = await this.updateWebhookByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Enable or Disable a Webhook
     */
    async updateWebhookEnabledByIdRaw(requestParameters: UpdateWebhookEnabledByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['webhookId'] == null) {
            throw new runtime.RequiredError(
                'webhookId',
                'Required parameter "webhookId" was null or undefined when calling updateWebhookEnabledById().'
            );
        }

        if (requestParameters['enabled'] == null) {
            throw new runtime.RequiredError(
                'enabled',
                'Required parameter "enabled" was null or undefined when calling updateWebhookEnabledById().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['enabled'] != null) {
            queryParameters['enabled'] = requestParameters['enabled'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/webhooks/{webhookId}/enabled`.replace(`{${"webhookId"}}`, encodeURIComponent(String(requestParameters['webhookId']))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Enable or Disable a Webhook
     */
    async updateWebhookEnabledById(requestParameters: UpdateWebhookEnabledByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.updateWebhookEnabledByIdRaw(requestParameters, initOverrides);
    }

}
