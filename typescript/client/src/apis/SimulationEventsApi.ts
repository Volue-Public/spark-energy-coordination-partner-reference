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


import * as runtime from '../runtime';
import type {
  SimulateEventResponse,
  SimulateLocationLPCEventRequest,
  SimulatePriceCurveEventRequest,
  SimulateResourceLPCEventRequest,
} from '../models/index';
import {
    SimulateEventResponseFromJSON,
    SimulateEventResponseToJSON,
    SimulateLocationLPCEventRequestFromJSON,
    SimulateLocationLPCEventRequestToJSON,
    SimulatePriceCurveEventRequestFromJSON,
    SimulatePriceCurveEventRequestToJSON,
    SimulateResourceLPCEventRequestFromJSON,
    SimulateResourceLPCEventRequestToJSON,
} from '../models/index';

export interface PostLPCLocationSimulationRequest {
    simulateLocationLPCEventRequest: SimulateLocationLPCEventRequest;
}

export interface PostLPCResourceSimulationRequest {
    simulateResourceLPCEventRequest: SimulateResourceLPCEventRequest;
}

export interface PostPriceCurveSimulationRequest {
    simulatePriceCurveEventRequest: SimulatePriceCurveEventRequest;
}

/**
 * 
 */
export class SimulationEventsApi extends runtime.BaseAPI {

    /**
     * Creates a `LocationLPC` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the `locations` parameter is not specified, random locations will be targeted if any exist.  - If the `points` parameter is not specified, a random points array with maximum power will be generated.
     * Simulate LPC Location Event
     */
    async postLPCLocationSimulationRaw(requestParameters: PostLPCLocationSimulationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SimulateEventResponse>> {
        if (requestParameters['simulateLocationLPCEventRequest'] == null) {
            throw new runtime.RequiredError(
                'simulateLocationLPCEventRequest',
                'Required parameter "simulateLocationLPCEventRequest" was null or undefined when calling postLPCLocationSimulation().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/simulation/events/lpc/locations`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SimulateLocationLPCEventRequestToJSON(requestParameters['simulateLocationLPCEventRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SimulateEventResponseFromJSON(jsonValue));
    }

    /**
     * Creates a `LocationLPC` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the `locations` parameter is not specified, random locations will be targeted if any exist.  - If the `points` parameter is not specified, a random points array with maximum power will be generated.
     * Simulate LPC Location Event
     */
    async postLPCLocationSimulation(requestParameters: PostLPCLocationSimulationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SimulateEventResponse> {
        const response = await this.postLPCLocationSimulationRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Creates a `ResourceLPC` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the `resources` parameter is not specified, random resources at locations will be targeted if any exist.  - If the `points` parameter is not specified, a random points array with maximum power will be generated.
     * Simulate LPC Resource Event
     */
    async postLPCResourceSimulationRaw(requestParameters: PostLPCResourceSimulationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SimulateEventResponse>> {
        if (requestParameters['simulateResourceLPCEventRequest'] == null) {
            throw new runtime.RequiredError(
                'simulateResourceLPCEventRequest',
                'Required parameter "simulateResourceLPCEventRequest" was null or undefined when calling postLPCResourceSimulation().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/simulation/events/lpc/resources`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SimulateResourceLPCEventRequestToJSON(requestParameters['simulateResourceLPCEventRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SimulateEventResponseFromJSON(jsonValue));
    }

    /**
     * Creates a `ResourceLPC` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the `resources` parameter is not specified, random resources at locations will be targeted if any exist.  - If the `points` parameter is not specified, a random points array with maximum power will be generated.
     * Simulate LPC Resource Event
     */
    async postLPCResourceSimulation(requestParameters: PostLPCResourceSimulationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SimulateEventResponse> {
        const response = await this.postLPCResourceSimulationRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Creates a `PriceCurve` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the `targets` parameter is not specified, simulated resources and locations will be targeted instead if any exist.  - If the `priceArea` parameter is not specified, a random price area will be selected.  - If the `priceCurveDelta` parameter is not specified, a random price curve delta will be created.
     * Simulate Price Curve Event
     */
    async postPriceCurveSimulationRaw(requestParameters: PostPriceCurveSimulationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SimulateEventResponse>> {
        if (requestParameters['simulatePriceCurveEventRequest'] == null) {
            throw new runtime.RequiredError(
                'simulatePriceCurveEventRequest',
                'Required parameter "simulatePriceCurveEventRequest" was null or undefined when calling postPriceCurveSimulation().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/simulation/events/pricecurve`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SimulatePriceCurveEventRequestToJSON(requestParameters['simulatePriceCurveEventRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SimulateEventResponseFromJSON(jsonValue));
    }

    /**
     * Creates a `PriceCurve` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the `targets` parameter is not specified, simulated resources and locations will be targeted instead if any exist.  - If the `priceArea` parameter is not specified, a random price area will be selected.  - If the `priceCurveDelta` parameter is not specified, a random price curve delta will be created.
     * Simulate Price Curve Event
     */
    async postPriceCurveSimulation(requestParameters: PostPriceCurveSimulationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SimulateEventResponse> {
        const response = await this.postPriceCurveSimulationRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Creates a `UserEligibility` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  This event does not affect the eligibility of any users. It is only used to simulate the event.  For actual events, you can call the /users/eligible endpoint to check which users are eligible.
     * Simulate User Eligibility Event
     */
    async postUserEligibilitySimulationRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<SimulateEventResponse>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("Bearer", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }
        const response = await this.request({
            path: `/simulation/events/usereligibility`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => SimulateEventResponseFromJSON(jsonValue));
    }

    /**
     * Creates a `UserEligibility` event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  This event does not affect the eligibility of any users. It is only used to simulate the event.  For actual events, you can call the /users/eligible endpoint to check which users are eligible.
     * Simulate User Eligibility Event
     */
    async postUserEligibilitySimulation(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<SimulateEventResponse> {
        const response = await this.postUserEligibilitySimulationRaw(initOverrides);
        return await response.value();
    }

}
