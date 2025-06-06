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


/**
 * 
 * @export
 */
export const Currency = {
    Nok: 'NOK',
    Eur: 'EUR',
    Sek: 'SEK',
    Dkk: 'DKK'
} as const;
export type Currency = typeof Currency[keyof typeof Currency];


export function instanceOfCurrency(value: any): boolean {
    for (const key in Currency) {
        if (Object.prototype.hasOwnProperty.call(Currency, key)) {
            if (Currency[key as keyof typeof Currency] === value) {
                return true;
            }
        }
    }
    return false;
}

export function CurrencyFromJSON(json: any): Currency {
    return CurrencyFromJSONTyped(json, false);
}

export function CurrencyFromJSONTyped(json: any, ignoreDiscriminator: boolean): Currency {
    return json as Currency;
}

export function CurrencyToJSON(value?: Currency | null): any {
    return value as any;
}

export function CurrencyToJSONTyped(value: any, ignoreDiscriminator: boolean): Currency {
    return value as Currency;
}

