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

import { RequestFile } from './models';
import { ApiPagination } from './apiPagination';
import { GetUserResponse } from './getUserResponse';

export class GetEligibleUsersResponse {
    'pagination'?: ApiPagination;
    'users'?: Array<GetUserResponse>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "pagination",
            "baseName": "pagination",
            "type": "ApiPagination"
        },
        {
            "name": "users",
            "baseName": "users",
            "type": "Array<GetUserResponse>"
        }    ];

    static getAttributeTypeMap() {
        return GetEligibleUsersResponse.attributeTypeMap;
    }
}

