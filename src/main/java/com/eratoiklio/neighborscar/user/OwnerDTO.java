package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.ride.Ride;
import com.eratoiklio.neighborscar.ride.RideDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class OwnerDTO {
    private Long ownerId;
    private String firstName;
    private String surname;
    private List<RideDTO> ownerRides;

}
