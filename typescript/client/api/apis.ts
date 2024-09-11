export * from './eventsApi';
import { EventsApi } from './eventsApi';
export * from './reportsApi';
import { ReportsApi } from './reportsApi';
export * from './resourcesApi';
import { ResourcesApi } from './resourcesApi';
export * from './simulationEventsApi';
import { SimulationEventsApi } from './simulationEventsApi';
export * from './simulationPartnerDataApi';
import { SimulationPartnerDataApi } from './simulationPartnerDataApi';
export * from './userApi';
import { UserApi } from './userApi';
export * from './userLocationsApi';
import { UserLocationsApi } from './userLocationsApi';
export * from './userResourcesApi';
import { UserResourcesApi } from './userResourcesApi';
export * from './userResourcesLocationBoundApi';
import { UserResourcesLocationBoundApi } from './userResourcesLocationBoundApi';
export * from './userSparkProgramApi';
import { UserSparkProgramApi } from './userSparkProgramApi';
export * from './webhooksApi';
import { WebhooksApi } from './webhooksApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [EventsApi, ReportsApi, ResourcesApi, SimulationEventsApi, SimulationPartnerDataApi, UserApi, UserLocationsApi, UserResourcesApi, UserResourcesLocationBoundApi, UserSparkProgramApi, WebhooksApi];
