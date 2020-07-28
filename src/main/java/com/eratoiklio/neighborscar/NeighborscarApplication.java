package com.eratoiklio.neighborscar;

import com.eratoiklio.neighborscar.model.RideDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NeighborscarApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeighborscarApplication.class, args);
        RideDTO rideDTO = RideDTO.builder()
                .rideTo("sdf")
                .rideFrom("df")
                .build();
    }

}
