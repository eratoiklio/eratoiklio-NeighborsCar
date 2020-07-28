package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.ride.RideDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {

      private final UserService service;

    @GetMapping(value = "owner/{id}")
    public OwnerDTO getOwner(@PathVariable long id) {
        OwnerDTO ownerDTO = OwnerDTO.mapToOwnerDTO(service.getOwner(id));
        return ownerDTO;
    }
    @GetMapping(value = "passenger/{id}")
    public PassengerDTO getPassenger(@PathVariable long id) {
        PassengerDTO passengerDTO = PassengerDTO.mapToPassengerDTO(service.getUser(id));
        return passengerDTO;
    }

}
