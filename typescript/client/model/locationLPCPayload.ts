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
import { LocationLPCTarget } from './locationLPCTarget';
import { SparkEventPayload } from './sparkEventPayload';
import { SparkEventPayloadType } from './sparkEventPayloadType';

export class LocationLPCPayload extends SparkEventPayload {
    'targets'?: Array<LocationLPCTarget>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "targets",
            "baseName": "targets",
            "type": "Array<LocationLPCTarget>"
        }    ];

    static getAttributeTypeMap() {
        return super.getAttributeTypeMap().concat(LocationLPCPayload.attributeTypeMap);
    }
}

export namespace LocationLPCPayload {
}
