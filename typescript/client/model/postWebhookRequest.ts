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
import { NotificationType } from './notificationType';

export class PostWebhookRequest {
    'name'?: string | null;
    'webhookSecret'?: string | null;
    'webhookUrl': string;
    'notificationTypes'?: Array<NotificationType>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "webhookSecret",
            "baseName": "webhookSecret",
            "type": "string"
        },
        {
            "name": "webhookUrl",
            "baseName": "webhookUrl",
            "type": "string"
        },
        {
            "name": "notificationTypes",
            "baseName": "notificationTypes",
            "type": "Array<NotificationType>"
        }    ];

    static getAttributeTypeMap() {
        return PostWebhookRequest.attributeTypeMap;
    }
}

