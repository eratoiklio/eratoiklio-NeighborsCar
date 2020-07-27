package com.eratoiklio.neighborscar.repository;

import com.eratoiklio.neighborscar.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
