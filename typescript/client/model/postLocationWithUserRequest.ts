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
import { Coordinate } from './coordinate';
import { LocationType } from './locationType';

export class PostLocationWithUserRequest {
    'locationId': string;
    'locationType'?: LocationType;
    'coordinates'?: Coordinate;
    /**
    * @deprecated
    */
    'meterPointId'?: string | null;
    'meterPointIds'?: Array<string> | null;
    'userId': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "locationId",
            "baseName": "locationId",
            "type": "string"
        },
        {
            "name": "locationType",
            "baseName": "locationType",
            "type": "LocationType"
        },
        {
            "name": "coordinates",
            "baseName": "coordinates",
            "type": "Coordinate"
        },
        {
            "name": "meterPointId",
            "baseName": "meterPointId",
            "type": "string"
        },
        {
            "name": "meterPointIds",
            "baseName": "meterPointIds",
            "type": "Array<string>"
        },
        {
            "name": "userId",
            "baseName": "userId",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PostLocationWithUserRequest.attributeTypeMap;
    }
}

export namespace PostLocationWithUserRequest {
}
