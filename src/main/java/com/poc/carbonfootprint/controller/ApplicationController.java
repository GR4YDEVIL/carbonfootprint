package com.poc.carbonfootprint.controller;

import com.poc.carbonfootprint.domain.TravelResponse;
import com.poc.carbonfootprint.domain.TreeResponse;
import com.poc.carbonfootprint.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/tree")
    TreeResponse getTreeEquivalent(@RequestParam("unit") String unit, @RequestParam("weight") String weight) {
        return applicationService.getTreeEquivalent(unit, weight);
    }

    @GetMapping("/fuel")
    TravelResponse getFuelToCO2e(@RequestParam("type") String type, @RequestParam("litres") String litres) {
        return applicationService.getFuelToCO2e(type, litres);
    }

    @GetMapping("/car")
    TravelResponse getCarbonFootprintFromCarTravel(@RequestParam("vehicle") String vehicle, @RequestParam("distance") String distance) {
        return applicationService.getCarbonFootprintFromCarTravel(vehicle, distance);
    }

    @GetMapping("/flight")
    TravelResponse getCarbonFootprintFromFlight(@RequestParam("type") String type, @RequestParam("distance") String distance) {
        return applicationService.getCarbonFootprintFromFlight(type, distance);
    }

    @GetMapping("/bike")
    TravelResponse getCarbonFootprintFromMotorBike(@RequestParam("type") String type, @RequestParam("distance") String distance) {
        return applicationService.getCarbonFootprintFromMotorBike(type, distance);
    }

    @GetMapping("/public")
    TravelResponse getCarbonFootprintFromPublicTransit(@RequestParam("type") String type, @RequestParam("distance") String distance) {
        return applicationService.getCarbonFootprintFromPublicTransit(type, distance);
    }
}