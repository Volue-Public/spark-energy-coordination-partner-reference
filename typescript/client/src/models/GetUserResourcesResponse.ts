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

import { mapValues } from '../runtime';
import type { GetResourceResponse } from './GetResourceResponse';
import {
    GetResourceResponseFromJSON,
    GetResourceResponseFromJSONTyped,
    GetResourceResponseToJSON,
    GetResourceResponseToJSONTyped,
} from './GetResourceResponse';

/**
 * 
 * @export
 * @interface GetUserResourcesResponse
 */
export interface GetUserResourcesResponse {
    /**
     * 
     * @type {Array<GetResourceResponse>}
     * @memberof GetUserResourcesResponse
     */
    resources: Array<GetResourceResponse>;
}

/**
 * Check if a given object implements the GetUserResourcesResponse interface.
 */
export function instanceOfGetUserResourcesResponse(value: object): value is GetUserResourcesResponse {
    if (!('resources' in value) || value['resources'] === undefined) return false;
    return true;
}

export function GetUserResourcesResponseFromJSON(json: any): GetUserResourcesResponse {
    return GetUserResourcesResponseFromJSONTyped(json, false);
}

export function GetUserResourcesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetUserResourcesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'resources': ((json['resources'] as Array<any>).map(GetResourceResponseFromJSON)),
    };
}

export function GetUserResourcesResponseToJSON(json: any): GetUserResourcesResponse {
    return GetUserResourcesResponseToJSONTyped(json, false);
}

export function GetUserResourcesResponseToJSONTyped(value?: GetUserResourcesResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'resources': ((value['resources'] as Array<any>).map(GetResourceResponseToJSON)),
    };
}

