package com.eratoiklio.neighborscar.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserDTO {
    private String firstName;
    private String lastName;
    private List<RideDTO> ownerRides;

    public static UserDTO getUserDTOFromUser(User user) {
        return UserDTO.builder()
                .firstName(user.getFirstName())
                .lastName(user.getSurname())
                .ownerRides(RideDTO.getRidesDTOFromRides(user.getOwnerRide()))
                .build();
    }
}
