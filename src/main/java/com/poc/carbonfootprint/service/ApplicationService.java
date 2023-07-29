package com.poc.carbonfootprint.service;

import com.poc.carbonfootprint.client.RapidApiClient;
import com.poc.carbonfootprint.domain.TravelResponse;
import com.poc.carbonfootprint.domain.TreeResponse;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    private final RapidApiClient rapidApiClient;

    public ApplicationService(RapidApiClient rapidApiClient) {
        this.rapidApiClient = rapidApiClient;
    }

    public TreeResponse getTreeEquivalent(String unit, String weight) {
        //return rapidApiClient.getTreeEquivalent(unit, weight);
        return rapidApiClient.getTreeEquivalent("kg", "200");
    }

    public TravelResponse getFuelToCO2e(String type, String litres) {
        //return rapidApiClient.getFuelToCO2e(type, litres);
        return rapidApiClient.getFuelToCO2e("Petrol", "10");
    }

    public TravelResponse getCarbonFootprintFromCarTravel(String vehicle, String distance) {
        //return rapidApiClient.getCarbonFootprintFromCarTravel(vehicle, distance);
        return rapidApiClient.getCarbonFootprintFromCarTravel("SmallDieselCar", "100");
    }

    public TravelResponse getCarbonFootprintFromFlight(String type, String distance) {
        //return rapidApiClient.getCarbonFootprintFromFlight(type, distance);
        return rapidApiClient.getCarbonFootprintFromFlight("DomesticFlight", "2000");
    }

    public TravelResponse getCarbonFootprintFromMotorBike(String type, String distance) {
        //return rapidApiClient.getCarbonFootprintFromMotorBike(type, distance);
        return rapidApiClient.getCarbonFootprintFromMotorBike("SmallMotorBike", "400");
    }

    public TravelResponse getCarbonFootprintFromPublicTransit(String type, String distance) {
        //return rapidApiClient.getCarbonFootprintFromPublicTransit(type, distance);
        return rapidApiClient.getCarbonFootprintFromPublicTransit("Taxi", "1000");
    }
}
