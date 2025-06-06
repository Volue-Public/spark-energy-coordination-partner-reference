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
  GetEventResponse,
  GetEventsResponse,
  HttpValidationProblemDetails,
} from '../models/index';
import {
    GetEventResponseFromJSON,
    GetEventResponseToJSON,
    GetEventsResponseFromJSON,
    GetEventsResponseToJSON,
    HttpValidationProblemDetailsFromJSON,
    HttpValidationProblemDetailsToJSON,
} from '../models/index';

export interface GetAllEventsRequest {
    page?: number;
    pageSize?: number;
}

export interface GetEventByIdRequest {
    eventId: string;
}

/**
 * 
 */
export class EventsApi extends runtime.BaseAPI {

    /**
     * Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
     * Get All Events
     */
    async getAllEventsRaw(requestParameters: GetAllEventsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetEventsResponse>> {
        const queryParameters: any = {};

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
            path: `/events`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetEventsResponseFromJSON(jsonValue));
    }

    /**
     * Get all events, ordered by the most recent events first. Maximum pageSize is 1000.
     * Get All Events
     */
    async getAllEvents(requestParameters: GetAllEventsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetEventsResponse> {
        const response = await this.getAllEventsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get Event By Id
     */
    async getEventByIdRaw(requestParameters: GetEventByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetEventResponse>> {
        if (requestParameters['eventId'] == null) {
            throw new runtime.RequiredError(
                'eventId',
                'Required parameter "eventId" was null or undefined when calling getEventById().'
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
            path: `/events/{eventId}`.replace(`{${"eventId"}}`, encodeURIComponent(String(requestParameters['eventId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetEventResponseFromJSON(jsonValue));
    }

    /**
     * Get Event By Id
     */
    async getEventById(requestParameters: GetEventByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetEventResponse> {
        const response = await this.getEventByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
