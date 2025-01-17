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
import { LPCLocation } from './lPCLocation';
import { SparkReportPayload } from './sparkReportPayload';
import { SparkReportPayloadType } from './sparkReportPayloadType';

export class LocationLPCAcknowledgmentReportPayload extends SparkReportPayload {
    'acknowledgedTargets'?: Array<LPCLocation>;
    'declinedTargets'?: Array<LPCLocation>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "acknowledgedTargets",
            "baseName": "acknowledgedTargets",
            "type": "Array<LPCLocation>"
        },
        {
            "name": "declinedTargets",
            "baseName": "declinedTargets",
            "type": "Array<LPCLocation>"
        }    ];

    static getAttributeTypeMap() {
        return super.getAttributeTypeMap().concat(LocationLPCAcknowledgmentReportPayload.attributeTypeMap);
    }
}

export namespace LocationLPCAcknowledgmentReportPayload {
}
