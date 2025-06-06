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
import type { GetLocationResponse } from './GetLocationResponse';
import {
    GetLocationResponseFromJSON,
    GetLocationResponseFromJSONTyped,
    GetLocationResponseToJSON,
    GetLocationResponseToJSONTyped,
} from './GetLocationResponse';

/**
 * 
 * @export
 * @interface PostLocationsBatchResponse
 */
export interface PostLocationsBatchResponse {
    /**
     * 
     * @type {Array<GetLocationResponse>}
     * @memberof PostLocationsBatchResponse
     */
    locations: Array<GetLocationResponse>;
}

/**
 * Check if a given object implements the PostLocationsBatchResponse interface.
 */
export function instanceOfPostLocationsBatchResponse(value: object): value is PostLocationsBatchResponse {
    if (!('locations' in value) || value['locations'] === undefined) return false;
    return true;
}

export function PostLocationsBatchResponseFromJSON(json: any): PostLocationsBatchResponse {
    return PostLocationsBatchResponseFromJSONTyped(json, false);
}

export function PostLocationsBatchResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): PostLocationsBatchResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'locations': ((json['locations'] as Array<any>).map(GetLocationResponseFromJSON)),
    };
}

export function PostLocationsBatchResponseToJSON(json: any): PostLocationsBatchResponse {
    return PostLocationsBatchResponseToJSONTyped(json, false);
}

export function PostLocationsBatchResponseToJSONTyped(value?: PostLocationsBatchResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'locations': ((value['locations'] as Array<any>).map(GetLocationResponseToJSON)),
    };
}

