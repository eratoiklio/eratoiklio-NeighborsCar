package com.eratoiklio.neighborscar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRide;
    private String rideFrom;
    private String rideTo;
    private Date rideDate;
    private int seats;
    @OneToOne
    @JoinColumn(name = "id_owner")
    private User owner;
}
