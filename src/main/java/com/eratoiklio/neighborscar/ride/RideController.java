package com.eratoiklio.neighborscar.ride;

import lombok.RequiredArgsConstructor;
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
}
