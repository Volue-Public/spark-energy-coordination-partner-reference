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
import { WebhookStatus } from './webhookStatus';

export class GetWebhookResponse {
    'webhookId': string;
    'webhookUrl': string;
    'name'?: string | null;
    'notificationTypes'?: Array<NotificationType>;
    'enabled'?: boolean;
    'status'?: WebhookStatus;
    'modifiedDate'?: Date;
    'createdDate'?: Date;
    'lastAnalyzedTimestamp'?: Date;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "webhookId",
            "baseName": "webhookId",
            "type": "string"
        },
        {
            "name": "webhookUrl",
            "baseName": "webhookUrl",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "notificationTypes",
            "baseName": "notificationTypes",
            "type": "Array<NotificationType>"
        },
        {
            "name": "enabled",
            "baseName": "enabled",
            "type": "boolean"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "WebhookStatus"
        },
        {
            "name": "modifiedDate",
            "baseName": "modifiedDate",
            "type": "Date"
        },
        {
            "name": "createdDate",
            "baseName": "createdDate",
            "type": "Date"
        },
        {
            "name": "lastAnalyzedTimestamp",
            "baseName": "lastAnalyzedTimestamp",
            "type": "Date"
        }    ];

    static getAttributeTypeMap() {
        return GetWebhookResponse.attributeTypeMap;
    }
}

export namespace GetWebhookResponse {
}
