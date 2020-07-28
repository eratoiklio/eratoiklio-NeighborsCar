package com.eratoiklio.neighborscar.user;

import com.eratoiklio.neighborscar.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
