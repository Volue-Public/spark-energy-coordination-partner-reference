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
import { Currency } from './currency';
import { EnergyUnit } from './energyUnit';
import { PriceCurvePoint } from './priceCurvePoint';

export class PriceCurve {
    'points'?: Array<PriceCurvePoint>;
    'energyUnit'?: EnergyUnit;
    'currency'?: Currency;
    'resolution'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "points",
            "baseName": "points",
            "type": "Array<PriceCurvePoint>"
        },
        {
            "name": "energyUnit",
            "baseName": "energyUnit",
            "type": "EnergyUnit"
        },
        {
            "name": "currency",
            "baseName": "currency",
            "type": "Currency"
        },
        {
            "name": "resolution",
            "baseName": "resolution",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PriceCurve.attributeTypeMap;
    }
}

export namespace PriceCurve {
}