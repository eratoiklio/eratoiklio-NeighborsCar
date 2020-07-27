package com.eratoiklio.neighborscar.controller;

import com.eratoiklio.neighborscar.model.User;
import com.eratoiklio.neighborscar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {

      private final UserService service;

        @GetMapping(value = "users")
        public List<User> getAllUsers() {
            List<User> users = service.getAllUsers();
            return users;
        }
}
