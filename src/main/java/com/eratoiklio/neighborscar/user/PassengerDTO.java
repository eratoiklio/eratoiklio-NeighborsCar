package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.ride.Ride;
import com.eratoiklio.neighborscar.ride.RideDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Builder
public class PassengerDTO {
    private Long idUser;
    private String firstName;
    private String surname;
    private List<RideDTO> joinedRides;

    static PassengerDTO mapToPassengerDTO(User user) {
        return PassengerDTO.builder()
                .idUser(user.getIdUser())
                .firstName(user.getFirstName())
                .surname(user.getSurname())
                .joinedRides(RideDTO.getRidesDTOFromRides(user.getJoinedRides()))
                .build();

    }
}
