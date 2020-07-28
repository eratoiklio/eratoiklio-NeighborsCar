package com.eratoiklio.neighborscar.ride;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Getter
public class RideRequest {
    private String rideFrom;
    private String rideTo;
    private Date date;
}
