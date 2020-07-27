package com.eratoiklio.neighborscar.service;

import com.eratoiklio.neighborscar.model.User;
import com.eratoiklio.neighborscar.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository repository;

    public  List<User>  getAllUsers(){
        List<User>users = repository.findAll();
        return users;
    }

}
