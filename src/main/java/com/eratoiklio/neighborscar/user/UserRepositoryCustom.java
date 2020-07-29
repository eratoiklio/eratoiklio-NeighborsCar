package com.eratoiklio.neighborscar.user;

import java.util.List;

public interface UserRepositoryCustom{
    List<User> getUserByName(UserRequest userRequest);
}
