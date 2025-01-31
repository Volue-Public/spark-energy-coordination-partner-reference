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
import { EnergyCurvePoint } from './energyCurvePoint';
import { SparkReportPayload } from './sparkReportPayload';
import { SparkReportPayloadType } from './sparkReportPayloadType';

export class LocationEnergyUsageReportPayload extends SparkReportPayload {
    'locationId': string;
    'meterPointId': string;
    'points'?: Array<EnergyCurvePoint>;
    'resolution': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "locationId",
            "baseName": "locationId",
            "type": "string"
        },
        {
            "name": "meterPointId",
            "baseName": "meterPointId",
            "type": "string"
        },
        {
            "name": "points",
            "baseName": "points",
            "type": "Array<EnergyCurvePoint>"
        },
        {
            "name": "resolution",
            "baseName": "resolution",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return super.getAttributeTypeMap().concat(LocationEnergyUsageReportPayload.attributeTypeMap);
    }
}

export namespace LocationEnergyUsageReportPayload {
}
