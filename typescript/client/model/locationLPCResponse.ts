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

export class LocationLPCResponse {
    'locationId'?: string;
    'meterPointId'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "locationId",
            "baseName": "locationId",
            "type": "string"
        },
        {
            "name": "meterPointId",
            "baseName": "meterPointId",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return LocationLPCResponse.attributeTypeMap;
    }
}

