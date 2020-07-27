package com.eratoiklio.neighborscar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String firstName;
    private String surname;
    @OneToMany(mappedBy = "owner")
    private List<Ride> ownerRide;
    @ManyToMany
    @JoinTable(name = "BOOKED_RIDE",
            joinColumns = @JoinColumn(name = "id_passenger"),
            inverseJoinColumns = @JoinColumn(name = "id_ride")
    )
    private List<Ride> joinedRides;
}
