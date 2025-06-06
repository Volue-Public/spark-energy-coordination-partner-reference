/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { NotificationType } from './NotificationType';
import {
    NotificationTypeFromJSON,
    NotificationTypeFromJSONTyped,
    NotificationTypeToJSON,
    NotificationTypeToJSONTyped,
} from './NotificationType';

/**
 * 
 * @export
 * @interface WebhookNotificationLog
 */
export interface WebhookNotificationLog {
    /**
     * 
     * @type {string}
     * @memberof WebhookNotificationLog
     */
    webhookId: string;
    /**
     * 
     * @type {string}
     * @memberof WebhookNotificationLog
     */
    tenantId: string;
    /**
     * 
     * @type {string}
     * @memberof WebhookNotificationLog
     */
    partnerEventId?: string;
    /**
     * 
     * @type {string}
     * @memberof WebhookNotificationLog
     */
    notificationId?: string;
    /**
     * 
     * @type {NotificationType}
     * @memberof WebhookNotificationLog
     */
    notificationType?: NotificationType;
    /**
     * 
     * @type {Date}
     * @memberof WebhookNotificationLog
     */
    notificationSent?: Date;
    /**
     * 
     * @type {string}
     * @memberof WebhookNotificationLog
     */
    sparkSignature?: string | null;
    /**
     * 
     * @type {string}
     * @memberof WebhookNotificationLog
     */
    webhookUrl: string;
    /**
     * 
     * @type {boolean}
     * @memberof WebhookNotificationLog
     */
    requestTimeout?: boolean;
    /**
     * 
     * @type {number}
     * @memberof WebhookNotificationLog
     */
    responseStatusCode?: number | null;
    /**
     * 
     * @type {number}
     * @memberof WebhookNotificationLog
     */
    requestDurationMs?: number | null;
}



/**
 * Check if a given object implements the WebhookNotificationLog interface.
 */
export function instanceOfWebhookNotificationLog(value: object): value is WebhookNotificationLog {
    if (!('webhookId' in value) || value['webhookId'] === undefined) return false;
    if (!('tenantId' in value) || value['tenantId'] === undefined) return false;
    if (!('webhookUrl' in value) || value['webhookUrl'] === undefined) return false;
    return true;
}

export function WebhookNotificationLogFromJSON(json: any): WebhookNotificationLog {
    return WebhookNotificationLogFromJSONTyped(json, false);
}

export function WebhookNotificationLogFromJSONTyped(json: any, ignoreDiscriminator: boolean): WebhookNotificationLog {
    if (json == null) {
        return json;
    }
    return {
        
        'webhookId': json['webhookId'],
        'tenantId': json['tenantId'],
        'partnerEventId': json['partnerEventId'] == null ? undefined : json['partnerEventId'],
        'notificationId': json['notificationId'] == null ? undefined : json['notificationId'],
        'notificationType': json['notificationType'] == null ? undefined : NotificationTypeFromJSON(json['notificationType']),
        'notificationSent': json['notificationSent'] == null ? undefined : (new Date(json['notificationSent'])),
        'sparkSignature': json['sparkSignature'] == null ? undefined : json['sparkSignature'],
        'webhookUrl': json['webhookUrl'],
        'requestTimeout': json['requestTimeout'] == null ? undefined : json['requestTimeout'],
        'responseStatusCode': json['responseStatusCode'] == null ? undefined : json['responseStatusCode'],
        'requestDurationMs': json['requestDurationMs'] == null ? undefined : json['requestDurationMs'],
    };
}

export function WebhookNotificationLogToJSON(json: any): WebhookNotificationLog {
    return WebhookNotificationLogToJSONTyped(json, false);
}

export function WebhookNotificationLogToJSONTyped(value?: WebhookNotificationLog | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'webhookId': value['webhookId'],
        'tenantId': value['tenantId'],
        'partnerEventId': value['partnerEventId'],
        'notificationId': value['notificationId'],
        'notificationType': NotificationTypeToJSON(value['notificationType']),
        'notificationSent': value['notificationSent'] == null ? undefined : ((value['notificationSent']).toISOString()),
        'sparkSignature': value['sparkSignature'],
        'webhookUrl': value['webhookUrl'],
        'requestTimeout': value['requestTimeout'],
        'responseStatusCode': value['responseStatusCode'],
        'requestDurationMs': value['requestDurationMs'],
    };
}

