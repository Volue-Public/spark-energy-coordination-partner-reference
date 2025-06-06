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
import type { LPCDataPoint } from './LPCDataPoint';
import {
    LPCDataPointFromJSON,
    LPCDataPointFromJSONTyped,
    LPCDataPointToJSON,
    LPCDataPointToJSONTyped,
} from './LPCDataPoint';
import type { LocationTarget } from './LocationTarget';
import {
    LocationTargetFromJSON,
    LocationTargetFromJSONTyped,
    LocationTargetToJSON,
    LocationTargetToJSONTyped,
} from './LocationTarget';

/**
 * 
 * @export
 * @interface LPCLocationTarget
 */
export interface LPCLocationTarget {
    /**
     * 
     * @type {LocationTarget}
     * @memberof LPCLocationTarget
     */
    location?: LocationTarget;
    /**
     * 
     * @type {Array<LPCDataPoint>}
     * @memberof LPCLocationTarget
     */
    points?: Array<LPCDataPoint> | null;
}

/**
 * Check if a given object implements the LPCLocationTarget interface.
 */
export function instanceOfLPCLocationTarget(value: object): value is LPCLocationTarget {
    return true;
}

export function LPCLocationTargetFromJSON(json: any): LPCLocationTarget {
    return LPCLocationTargetFromJSONTyped(json, false);
}

export function LPCLocationTargetFromJSONTyped(json: any, ignoreDiscriminator: boolean): LPCLocationTarget {
    if (json == null) {
        return json;
    }
    return {
        
        'location': json['location'] == null ? undefined : LocationTargetFromJSON(json['location']),
        'points': json['points'] == null ? undefined : ((json['points'] as Array<any>).map(LPCDataPointFromJSON)),
    };
}

export function LPCLocationTargetToJSON(json: any): LPCLocationTarget {
    return LPCLocationTargetToJSONTyped(json, false);
}

export function LPCLocationTargetToJSONTyped(value?: LPCLocationTarget | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'location': LocationTargetToJSON(value['location']),
        'points': value['points'] == null ? undefined : ((value['points'] as Array<any>).map(LPCDataPointToJSON)),
    };
}

