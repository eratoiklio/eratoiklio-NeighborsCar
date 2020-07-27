package com.eratoiklio.neighborscar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @ManyToOne
    @JoinColumn(name = "id_owner")
    private User owner;
    @ManyToMany(mappedBy = "joinedRides")
    private List<User> joinedUser;
}
