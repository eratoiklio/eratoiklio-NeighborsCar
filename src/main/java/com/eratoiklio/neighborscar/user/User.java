package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.ride.Ride;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @OneToMany(mappedBy = "owner")
    private List<Ride> ownerRide;
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "BOOKED_RIDE",
            joinColumns = @JoinColumn(name = "id_passenger"),
            inverseJoinColumns = @JoinColumn(name = "id_ride")
    )
    private List<Ride> joinedRides;
}
