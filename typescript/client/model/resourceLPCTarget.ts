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
import { LPCDataPoint } from './lPCDataPoint';

export class ResourceLPCTarget {
    'meterPointId': string;
    'locationId': string;
    'resourceId': string;
    'resolution': string;
    'points': Array<LPCDataPoint>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "meterPointId",
            "baseName": "meterPointId",
            "type": "string"
        },
        {
            "name": "locationId",
            "baseName": "locationId",
            "type": "string"
        },
        {
            "name": "resourceId",
            "baseName": "resourceId",
            "type": "string"
        },
        {
            "name": "resolution",
            "baseName": "resolution",
            "type": "string"
        },
        {
            "name": "points",
            "baseName": "points",
            "type": "Array<LPCDataPoint>"
        }    ];

    static getAttributeTypeMap() {
        return ResourceLPCTarget.attributeTypeMap;
    }
}

