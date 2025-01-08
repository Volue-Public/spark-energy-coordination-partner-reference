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
import { ResourceLPCResponse } from './resourceLPCResponse';
import { SparkReportPayload } from './sparkReportPayload';
import { SparkReportPayloadType } from './sparkReportPayloadType';

export class ResourceLPCAcknowledgmentReportPayload extends SparkReportPayload {
    'acknowledgedTargets'?: Array<ResourceLPCResponse>;
    'declinedTargets'?: Array<ResourceLPCResponse>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "acknowledgedTargets",
            "baseName": "acknowledgedTargets",
            "type": "Array<ResourceLPCResponse>"
        },
        {
            "name": "declinedTargets",
            "baseName": "declinedTargets",
            "type": "Array<ResourceLPCResponse>"
        }    ];

    static getAttributeTypeMap() {
        return super.getAttributeTypeMap().concat(ResourceLPCAcknowledgmentReportPayload.attributeTypeMap);
    }
}

export namespace ResourceLPCAcknowledgmentReportPayload {
}
