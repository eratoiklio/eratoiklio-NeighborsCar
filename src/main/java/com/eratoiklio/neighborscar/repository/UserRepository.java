package com.eratoiklio.neighborscar.repository;

import com.eratoiklio.neighborscar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
