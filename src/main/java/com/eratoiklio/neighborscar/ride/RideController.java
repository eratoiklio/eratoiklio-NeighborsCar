package com.eratoiklio.neighborscar.ride;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RideController {
    private final RideService service;

    @GetMapping(value = "rides")
    public List<Ride> getAllRides() {
        List<Ride> rides = service.getAllRides();
        return rides;
    }

    @PostMapping(value = "ride")
    public List<RideDTO> getRidesByCriteria(@RequestBody RideRequest rideRequest) {
        List<Ride> rides = service.getRidesByCriteria(rideRequest);
        return RideDTO.getRidesDTOFromRides(rides);
    }
}
