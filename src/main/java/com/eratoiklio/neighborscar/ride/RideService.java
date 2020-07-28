package com.eratoiklio.neighborscar.ride;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RideService {
    private final RideRepository repository;

    public List<Ride> getAllRides(){
        List<Ride> rides = repository.findAll();
        return rides;
    }

    public List<Ride> getRidesByCriteria(RideRequest rideRequest) {
        return repository.getRidesByCriteria(rideRequest);
    }
}
