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
import type { PostUserRequest } from './PostUserRequest';
import {
    PostUserRequestFromJSON,
    PostUserRequestFromJSONTyped,
    PostUserRequestToJSON,
    PostUserRequestToJSONTyped,
} from './PostUserRequest';

/**
 * 
 * @export
 * @interface PostUsersBatchRequest
 */
export interface PostUsersBatchRequest {
    /**
     * 
     * @type {Array<PostUserRequest>}
     * @memberof PostUsersBatchRequest
     */
    users: Array<PostUserRequest>;
}

/**
 * Check if a given object implements the PostUsersBatchRequest interface.
 */
export function instanceOfPostUsersBatchRequest(value: object): value is PostUsersBatchRequest {
    if (!('users' in value) || value['users'] === undefined) return false;
    return true;
}

export function PostUsersBatchRequestFromJSON(json: any): PostUsersBatchRequest {
    return PostUsersBatchRequestFromJSONTyped(json, false);
}

export function PostUsersBatchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): PostUsersBatchRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'users': ((json['users'] as Array<any>).map(PostUserRequestFromJSON)),
    };
}

export function PostUsersBatchRequestToJSON(json: any): PostUsersBatchRequest {
    return PostUsersBatchRequestToJSONTyped(json, false);
}

export function PostUsersBatchRequestToJSONTyped(value?: PostUsersBatchRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'users': ((value['users'] as Array<any>).map(PostUserRequestToJSON)),
    };
}

