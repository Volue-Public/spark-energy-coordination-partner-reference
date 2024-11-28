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
import { PostReportRequestPayloadsInner } from './postReportRequestPayloadsInner';

export class PostReportRequest {
    'eventId'?: string;
    'payloads'?: Array<PostReportRequestPayloadsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "eventId",
            "baseName": "eventId",
            "type": "string"
        },
        {
            "name": "payloads",
            "baseName": "payloads",
            "type": "Array<PostReportRequestPayloadsInner>"
        }    ];

    static getAttributeTypeMap() {
        return PostReportRequest.attributeTypeMap;
    }
}
