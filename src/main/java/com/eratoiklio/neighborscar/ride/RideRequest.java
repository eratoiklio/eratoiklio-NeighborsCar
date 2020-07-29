package com.eratoiklio.neighborscar.ride;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@NoArgsConstructor
@Getter
public class RideRequest {
    private String rideFrom;
    private String rideTo;
    private LocalDateTime date;
}
