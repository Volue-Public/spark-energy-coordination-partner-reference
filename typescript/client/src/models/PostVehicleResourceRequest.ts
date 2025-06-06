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
import type { ResourceType } from './ResourceType';
import {
    ResourceTypeFromJSON,
    ResourceTypeFromJSONTyped,
    ResourceTypeToJSON,
    ResourceTypeToJSONTyped,
} from './ResourceType';

/**
 * 
 * @export
 * @interface PostVehicleResourceRequest
 */
export interface PostVehicleResourceRequest {
    /**
     * 
     * @type {string}
     * @memberof PostVehicleResourceRequest
     */
    resourceId: string;
    /**
     * 
     * @type {ResourceType}
     * @memberof PostVehicleResourceRequest
     */
    resourceType: ResourceType;
}



/**
 * Check if a given object implements the PostVehicleResourceRequest interface.
 */
export function instanceOfPostVehicleResourceRequest(value: object): value is PostVehicleResourceRequest {
    if (!('resourceId' in value) || value['resourceId'] === undefined) return false;
    if (!('resourceType' in value) || value['resourceType'] === undefined) return false;
    return true;
}

export function PostVehicleResourceRequestFromJSON(json: any): PostVehicleResourceRequest {
    return PostVehicleResourceRequestFromJSONTyped(json, false);
}

export function PostVehicleResourceRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): PostVehicleResourceRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'resourceId': json['resourceId'],
        'resourceType': ResourceTypeFromJSON(json['resourceType']),
    };
}

export function PostVehicleResourceRequestToJSON(json: any): PostVehicleResourceRequest {
    return PostVehicleResourceRequestToJSONTyped(json, false);
}

export function PostVehicleResourceRequestToJSONTyped(value?: PostVehicleResourceRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'resourceId': value['resourceId'],
        'resourceType': ResourceTypeToJSON(value['resourceType']),
    };
}

