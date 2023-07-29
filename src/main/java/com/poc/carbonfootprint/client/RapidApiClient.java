package com.poc.carbonfootprint.client;

import com.poc.carbonfootprint.domain.TravelResponse;
import com.poc.carbonfootprint.domain.TreeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "rapidApiClient", url = "https://carbonfootprint1.p.rapidapi.com", configuration = FeignClientInterceptor.class)
public interface RapidApiClient {

    @GetMapping("/TreeEquivalent")
    TreeResponse getTreeEquivalent(@RequestParam("unit") String unit, @RequestParam("weight") String weight);

    @GetMapping("/FuelToCO2e")
    TravelResponse getFuelToCO2e(@RequestParam("type") String type, @RequestParam("litres") String litres);

    @GetMapping("/CarbonFootprintFromCarTravel")
    TravelResponse getCarbonFootprintFromCarTravel(@RequestParam("vehicle") String vehicle, @RequestParam("distance") String distance);

    @GetMapping("/CarbonFootprintFromFlight")
    TravelResponse getCarbonFootprintFromFlight(@RequestParam("type") String type, @RequestParam("distance") String distance);

    @GetMapping("/CarbonFootprintFromMotorBike")
    TravelResponse getCarbonFootprintFromMotorBike(@RequestParam("type") String type, @RequestParam("distance") String distance);

    @GetMapping("/CarbonFootprintFromPublicTransit")
    TravelResponse getCarbonFootprintFromPublicTransit(@RequestParam("type") String type, @RequestParam("distance") String distance);
}