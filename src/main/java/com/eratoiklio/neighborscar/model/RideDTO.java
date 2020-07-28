package com.eratoiklio.neighborscar.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class RideDTO {
    private Long rideId;
    private String rideFrom;
    private String rideTo;

    public static List<RideDTO> getRidesDTOFromRides(List<Ride> ownerRide) {
        return ownerRide.stream()
                .map(ride -> RideDTO.builder()
                        .rideFrom(ride.getRideFrom())
                        .rideTo(ride.getRideTo())
                        .rideId(ride.getIdRide())
                        .build())
                .collect(Collectors.toList());
    }
}
