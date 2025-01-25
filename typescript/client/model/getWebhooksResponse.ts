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
import { GetWebhookResponse } from './getWebhookResponse';

export class GetWebhooksResponse {
    'webhooks': Array<GetWebhookResponse>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "webhooks",
            "baseName": "webhooks",
            "type": "Array<GetWebhookResponse>"
        }    ];

    static getAttributeTypeMap() {
        return GetWebhooksResponse.attributeTypeMap;
    }
}

