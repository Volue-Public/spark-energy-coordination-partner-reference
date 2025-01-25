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

export class ApiPagination {
    'totalRecords': number;
    'pageSize': number;
    'currentPage': number;
    'totalPages'?: number;
    'nextPage'?: number | null;
    'previousPage'?: number | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "totalRecords",
            "baseName": "totalRecords",
            "type": "number"
        },
        {
            "name": "pageSize",
            "baseName": "pageSize",
            "type": "number"
        },
        {
            "name": "currentPage",
            "baseName": "currentPage",
            "type": "number"
        },
        {
            "name": "totalPages",
            "baseName": "totalPages",
            "type": "number"
        },
        {
            "name": "nextPage",
            "baseName": "nextPage",
            "type": "number"
        },
        {
            "name": "previousPage",
            "baseName": "previousPage",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ApiPagination.attributeTypeMap;
    }
}

