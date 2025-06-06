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
import type { PriceCurvePoint } from './PriceCurvePoint';
import {
    PriceCurvePointFromJSON,
    PriceCurvePointFromJSONTyped,
    PriceCurvePointToJSON,
    PriceCurvePointToJSONTyped,
} from './PriceCurvePoint';
import type { Currency } from './Currency';
import {
    CurrencyFromJSON,
    CurrencyFromJSONTyped,
    CurrencyToJSON,
    CurrencyToJSONTyped,
} from './Currency';
import type { EnergyUnit } from './EnergyUnit';
import {
    EnergyUnitFromJSON,
    EnergyUnitFromJSONTyped,
    EnergyUnitToJSON,
    EnergyUnitToJSONTyped,
} from './EnergyUnit';

/**
 * 
 * @export
 * @interface PriceCurve
 */
export interface PriceCurve {
    /**
     * 
     * @type {Array<PriceCurvePoint>}
     * @memberof PriceCurve
     */
    points?: Array<PriceCurvePoint>;
    /**
     * 
     * @type {EnergyUnit}
     * @memberof PriceCurve
     */
    energyUnit?: EnergyUnit;
    /**
     * 
     * @type {Currency}
     * @memberof PriceCurve
     */
    currency?: Currency;
    /**
     * 
     * @type {string}
     * @memberof PriceCurve
     */
    resolution?: string;
}



/**
 * Check if a given object implements the PriceCurve interface.
 */
export function instanceOfPriceCurve(value: object): value is PriceCurve {
    return true;
}

export function PriceCurveFromJSON(json: any): PriceCurve {
    return PriceCurveFromJSONTyped(json, false);
}

export function PriceCurveFromJSONTyped(json: any, ignoreDiscriminator: boolean): PriceCurve {
    if (json == null) {
        return json;
    }
    return {
        
        'points': json['points'] == null ? undefined : ((json['points'] as Array<any>).map(PriceCurvePointFromJSON)),
        'energyUnit': json['energyUnit'] == null ? undefined : EnergyUnitFromJSON(json['energyUnit']),
        'currency': json['currency'] == null ? undefined : CurrencyFromJSON(json['currency']),
        'resolution': json['resolution'] == null ? undefined : json['resolution'],
    };
}

export function PriceCurveToJSON(json: any): PriceCurve {
    return PriceCurveToJSONTyped(json, false);
}

export function PriceCurveToJSONTyped(value?: PriceCurve | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'points': value['points'] == null ? undefined : ((value['points'] as Array<any>).map(PriceCurvePointToJSON)),
        'energyUnit': EnergyUnitToJSON(value['energyUnit']),
        'currency': CurrencyToJSON(value['currency']),
        'resolution': value['resolution'],
    };
}

