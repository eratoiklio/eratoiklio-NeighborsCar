package com.eratoiklio.neighborscar.ride;

import java.util.List;

public interface RideRepositoryCustom {
    List<Ride> getRidesByCriteria(RideRequest rideRequest);
}
