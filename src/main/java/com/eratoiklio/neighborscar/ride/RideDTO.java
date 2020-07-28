package com.eratoiklio.neighborscar.ride;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
public class RideDTO {
    private Long idRide;
    private String rideFrom;
    private String rideTo;
    private Date rideDate;
    private int seats;
    public static List<RideDTO> getRidesDTOFromRides(List<Ride> ownerRide) {
        return ownerRide.stream()
                .map(ride -> RideDTO.builder()
                        .idRide(ride.getIdRide())
                        .rideFrom(ride.getRideFrom())
                        .rideTo(ride.getRideTo())
                        .rideDate(ride.getRideDate())
                        .seats(ride.getSeats())
                        .build())
                .collect(Collectors.toList());
    }
}
