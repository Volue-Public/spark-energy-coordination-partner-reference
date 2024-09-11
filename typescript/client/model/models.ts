import localVarRequest from 'request';

export * from './apiPagination';
export * from './coordinate';
export * from './currency';
export * from './energyCurvePoint';
export * from './energyUnit';
export * from './energyUsageReportPayload';
export * from './eventNotification';
export * from './getEligibleUsersResponse';
export * from './getEventResponse';
export * from './getEventResponsePayload';
export * from './getEventsResponse';
export * from './getLocationBoundResourceResponse';
export * from './getLocationResponse';
export * from './getMpidEligibilityResponse';
export * from './getReportResponse';
export * from './getResourceResponse';
export * from './getUserCompensationForCurrentMonthResponse';
export * from './getUserEligibilityResponse';
export * from './getUserEnrollmentResponse';
export * from './getUserResourcesResponse';
export * from './getUserResponse';
export * from './getUsersResponse';
export * from './getWebhookNotificationLogByIdResponse';
export * from './getWebhookNotificationLogsResponse';
export * from './getWebhookResponse';
export * from './getWebhooksResponse';
export * from './httpValidationProblemDetails';
export * from './locationCompensation';
export * from './locationType';
export * from './notificationType';
export * from './patchLocationRequest';
export * from './patchWebhookRequest';
export * from './period';
export * from './postLocationBoundResourceRequest';
export * from './postLocationRequest';
export * from './postLocationWithUserRequest';
export * from './postLocationsBatchRequest';
export * from './postLocationsBatchResponse';
export * from './postReportRequest';
export * from './postReportRequestPayloadsInner';
export * from './postUserRequest';
export * from './postUsersBatchRequest';
export * from './postUsersBatchResponse';
export * from './postVehicleResourceRequest';
export * from './postWebhookRequest';
export * from './priceArea';
export * from './priceCurve';
export * from './priceCurvePayload';
export * from './priceCurvePoint';
export * from './priceCurveTarget';
export * from './problem';
export * from './problemType';
export * from './putLocationRequest';
export * from './putWebhookRequest';
export * from './resourceType';
export * from './simulateEventResponse';
export * from './simulatePriceCurveEventRequest';
export * from './sparkEventPayload';
export * from './sparkEventPayloadType';
export * from './sparkReportPayload';
export * from './sparkReportPayloadType';
export * from './userEligibilityPayload';
export * from './webhookNotificationLog';
export * from './webhookStatus';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { ApiPagination } from './apiPagination';
import { Coordinate } from './coordinate';
import { Currency } from './currency';
import { EnergyCurvePoint } from './energyCurvePoint';
import { EnergyUnit } from './energyUnit';
import { EnergyUsageReportPayload } from './energyUsageReportPayload';
import { EventNotification } from './eventNotification';
import { GetEligibleUsersResponse } from './getEligibleUsersResponse';
import { GetEventResponse } from './getEventResponse';
import { GetEventResponsePayload } from './getEventResponsePayload';
import { GetEventsResponse } from './getEventsResponse';
import { GetLocationBoundResourceResponse } from './getLocationBoundResourceResponse';
import { GetLocationResponse } from './getLocationResponse';
import { GetMpidEligibilityResponse } from './getMpidEligibilityResponse';
import { GetReportResponse } from './getReportResponse';
import { GetResourceResponse } from './getResourceResponse';
import { GetUserCompensationForCurrentMonthResponse } from './getUserCompensationForCurrentMonthResponse';
import { GetUserEligibilityResponse } from './getUserEligibilityResponse';
import { GetUserEnrollmentResponse } from './getUserEnrollmentResponse';
import { GetUserResourcesResponse } from './getUserResourcesResponse';
import { GetUserResponse } from './getUserResponse';
import { GetUsersResponse } from './getUsersResponse';
import { GetWebhookNotificationLogByIdResponse } from './getWebhookNotificationLogByIdResponse';
import { GetWebhookNotificationLogsResponse } from './getWebhookNotificationLogsResponse';
import { GetWebhookResponse } from './getWebhookResponse';
import { GetWebhooksResponse } from './getWebhooksResponse';
import { HttpValidationProblemDetails } from './httpValidationProblemDetails';
import { LocationCompensation } from './locationCompensation';
import { LocationType } from './locationType';
import { NotificationType } from './notificationType';
import { PatchLocationRequest } from './patchLocationRequest';
import { PatchWebhookRequest } from './patchWebhookRequest';
import { Period } from './period';
import { PostLocationBoundResourceRequest } from './postLocationBoundResourceRequest';
import { PostLocationRequest } from './postLocationRequest';
import { PostLocationWithUserRequest } from './postLocationWithUserRequest';
import { PostLocationsBatchRequest } from './postLocationsBatchRequest';
import { PostLocationsBatchResponse } from './postLocationsBatchResponse';
import { PostReportRequest } from './postReportRequest';
import { PostReportRequestPayloadsInner } from './postReportRequestPayloadsInner';
import { PostUserRequest } from './postUserRequest';
import { PostUsersBatchRequest } from './postUsersBatchRequest';
import { PostUsersBatchResponse } from './postUsersBatchResponse';
import { PostVehicleResourceRequest } from './postVehicleResourceRequest';
import { PostWebhookRequest } from './postWebhookRequest';
import { PriceArea } from './priceArea';
import { PriceCurve } from './priceCurve';
import { PriceCurvePayload } from './priceCurvePayload';
import { PriceCurvePoint } from './priceCurvePoint';
import { PriceCurveTarget } from './priceCurveTarget';
import { Problem } from './problem';
import { ProblemType } from './problemType';
import { PutLocationRequest } from './putLocationRequest';
import { PutWebhookRequest } from './putWebhookRequest';
import { ResourceType } from './resourceType';
import { SimulateEventResponse } from './simulateEventResponse';
import { SimulatePriceCurveEventRequest } from './simulatePriceCurveEventRequest';
import { SparkEventPayload } from './sparkEventPayload';
import { SparkEventPayloadType } from './sparkEventPayloadType';
import { SparkReportPayload } from './sparkReportPayload';
import { SparkReportPayloadType } from './sparkReportPayloadType';
import { UserEligibilityPayload } from './userEligibilityPayload';
import { WebhookNotificationLog } from './webhookNotificationLog';
import { WebhookStatus } from './webhookStatus';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "Currency": Currency,
        "EnergyUnit": EnergyUnit,
        "LocationType": LocationType,
        "NotificationType": NotificationType,
        "PriceArea": PriceArea,
        "ProblemType": ProblemType,
        "ResourceType": ResourceType,
        "SparkEventPayloadType": SparkEventPayloadType,
        "SparkReportPayloadType": SparkReportPayloadType,
        "WebhookStatus": WebhookStatus,
}

let typeMap: {[index: string]: any} = {
    "ApiPagination": ApiPagination,
    "Coordinate": Coordinate,
    "EnergyCurvePoint": EnergyCurvePoint,
    "EnergyUsageReportPayload": EnergyUsageReportPayload,
    "EventNotification": EventNotification,
    "GetEligibleUsersResponse": GetEligibleUsersResponse,
    "GetEventResponse": GetEventResponse,
    "GetEventResponsePayload": GetEventResponsePayload,
    "GetEventsResponse": GetEventsResponse,
    "GetLocationBoundResourceResponse": GetLocationBoundResourceResponse,
    "GetLocationResponse": GetLocationResponse,
    "GetMpidEligibilityResponse": GetMpidEligibilityResponse,
    "GetReportResponse": GetReportResponse,
    "GetResourceResponse": GetResourceResponse,
    "GetUserCompensationForCurrentMonthResponse": GetUserCompensationForCurrentMonthResponse,
    "GetUserEligibilityResponse": GetUserEligibilityResponse,
    "GetUserEnrollmentResponse": GetUserEnrollmentResponse,
    "GetUserResourcesResponse": GetUserResourcesResponse,
    "GetUserResponse": GetUserResponse,
    "GetUsersResponse": GetUsersResponse,
    "GetWebhookNotificationLogByIdResponse": GetWebhookNotificationLogByIdResponse,
    "GetWebhookNotificationLogsResponse": GetWebhookNotificationLogsResponse,
    "GetWebhookResponse": GetWebhookResponse,
    "GetWebhooksResponse": GetWebhooksResponse,
    "HttpValidationProblemDetails": HttpValidationProblemDetails,
    "LocationCompensation": LocationCompensation,
    "PatchLocationRequest": PatchLocationRequest,
    "PatchWebhookRequest": PatchWebhookRequest,
    "Period": Period,
    "PostLocationBoundResourceRequest": PostLocationBoundResourceRequest,
    "PostLocationRequest": PostLocationRequest,
    "PostLocationWithUserRequest": PostLocationWithUserRequest,
    "PostLocationsBatchRequest": PostLocationsBatchRequest,
    "PostLocationsBatchResponse": PostLocationsBatchResponse,
    "PostReportRequest": PostReportRequest,
    "PostReportRequestPayloadsInner": PostReportRequestPayloadsInner,
    "PostUserRequest": PostUserRequest,
    "PostUsersBatchRequest": PostUsersBatchRequest,
    "PostUsersBatchResponse": PostUsersBatchResponse,
    "PostVehicleResourceRequest": PostVehicleResourceRequest,
    "PostWebhookRequest": PostWebhookRequest,
    "PriceCurve": PriceCurve,
    "PriceCurvePayload": PriceCurvePayload,
    "PriceCurvePoint": PriceCurvePoint,
    "PriceCurveTarget": PriceCurveTarget,
    "Problem": Problem,
    "PutLocationRequest": PutLocationRequest,
    "PutWebhookRequest": PutWebhookRequest,
    "SimulateEventResponse": SimulateEventResponse,
    "SimulatePriceCurveEventRequest": SimulatePriceCurveEventRequest,
    "SparkEventPayload": SparkEventPayload,
    "SparkReportPayload": SparkReportPayload,
    "UserEligibilityPayload": UserEligibilityPayload,
    "WebhookNotificationLog": WebhookNotificationLog,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
