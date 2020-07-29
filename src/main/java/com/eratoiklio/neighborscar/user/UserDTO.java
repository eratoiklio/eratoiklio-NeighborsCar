package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.ride.RideDTO;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class UserDTO {
    private Long idUser;
    private String firstName;
    private String surname;
     static List<UserDTO> getUsersDTOFromUsers(List<User> users){
        return users.stream()
         .map(user -> UserDTO.builder()
                .idUser(user.getIdUser())
                .firstName(user.getFirstName())
                .surname(user.getSurname())
                .build())
                .collect(Collectors.toList());
    }
}
